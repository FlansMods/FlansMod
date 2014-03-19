/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.physics;
import java.util.*;

import jinngine.physics.constraint.*;
import jinngine.physics.constraint.contact.ContactConstraintManager;
import jinngine.physics.constraint.contact.DefaultContactConstraintManager;
import jinngine.physics.solver.*;
import jinngine.physics.solver.Solver.NCPConstraint;
import jinngine.collision.*;
import jinngine.geometry.*;
import jinngine.math.*;
import jinngine.physics.force.*;
import jinngine.util.*;

/**
 * A basic fixed time stepping rigid body simulator. It uses a contact graph to organise constraints, and generates
 * contact constraints upon intersecting/touching geometries. The engine is limited to having one constraint per. 
 * body pair. This means that if a joint constraint is present, there can be no contact constraints simultaneously. 
 * Such behaviour should be modelled using joint limits. 
 */
public final class DefaultScene implements Scene {
	// bodies in model
	public final List<Body> bodies = new ArrayList<Body>();
	
	// constraints, joints and forces
	public final List<NCPConstraint> ncpconstraints = new ArrayList<NCPConstraint>();
	private final List<Body> ncpbodies = new ArrayList<Body>();
	private final List<Force> forces = new ArrayList<Force>(); 
	private final List<Constraint> liveconstraints = new ArrayList<Constraint>();
	
	// triggers
	public final List<Trigger> triggers = new LinkedList<Trigger>();
	
	// create a contact graph classifier, used by the contact graph for determining
	// fixed bodies, i.e. bodies considered to have infinite mass. 
	private final ComponentGraph.NodeClassifier<Body> classifier = 
		new ComponentGraph.NodeClassifier<Body>() {
			public boolean isDelimitor(Body node) {
				return node.isFixed();
			}
	};
	
	// inner class for storing data in components in constraint graph
	public final class ConstraintGroup {
		public boolean deactivated = false;
		@Override
		public String toString() {
			return deactivated?"deactivated":"active";
		}
	}
	
	// make a component creator for the constraint graph. This only makes sure that we get some data
	// stored in the component elements of the constraint graph. In this data, we will store information
	// about the group of bodies that are interacting. Most importantly, it makes sure that when constraint
	// components are merged, all the bodies in both components are activated if one of the components was  
	// active to begin with. 
	private final ComponentGraph.ComponentHandler<Body,ConstraintGroup> componenthandler = 
		new ComponentGraph.ComponentHandler<Body,ConstraintGroup>() {
		public ConstraintGroup newComponent() {return new ConstraintGroup();}
		public void mergeComponent( ConstraintGroup remaining, ConstraintGroup leaving) {
			if ( remaining.deactivated && leaving.deactivated ) {
				// we let the deactivated setting live
			} else {
				// activate the new group
				remaining.deactivated = false;
				
				// all bodies from the remaining group
				Iterator<Body> bodies = constraintGraph.getNodesInComponent(remaining);
				while(bodies.hasNext()){
					policy.activate(bodies.next());
				}
				
				// all bodies from the leaving group
				bodies = constraintGraph.getNodesInComponent(leaving);
				while(bodies.hasNext()){
					policy.activate(bodies.next());
				}
			}
		}

		public void nodeAddedToComponent(ConstraintGroup component, Body node) {
			// if the Body is active and the group is deactivated, activate the component 
			if (!node.deactivated && component.deactivated) {
				// all bodies from the remaining group
				Iterator<Body> bodies = constraintGraph.getNodesInComponent(component);
				while(bodies.hasNext()){
					policy.activate(bodies.next());
				}
				
				// set the group activation setting
				component.deactivated = false;
			}
		}

		public void nodeRemovedFromComponent(ConstraintGroup component, Body node) {
			// TODO Auto-generated method stub
		}
	};

	
	// create the contact graph using the classifier above
	private final ComponentGraph<Body,Constraint,ConstraintGroup> constraintGraph = 
		new HashMapComponentGraph<Body,Constraint,ConstraintGroup>(classifier,componenthandler);

	// broadphase collision detection
	private final BroadphaseCollisionDetection broadphase;
	
	// contact constraints
	private final ContactConstraintManager contactmanager;

	// ncp solver
	private final Solver solver;
	
	// PGS iteration for live constraints
	private final Solver pgs = new ProjectedGaussSeidel(1);
	
	// deactivation policy
	private final DeactivationPolicy policy;
	
	// time-step size
	private double timestep = 0.08; 

	/** 
	 * Create a new fixed time-stepping simulator 
	 * @param broadphase Broadphase collision detection method
	 * @param solver Solver to be used
	 * @param policy the deactivation policy to be used
	 */
	public DefaultScene( BroadphaseCollisionDetection broadphase,  Solver solver, DeactivationPolicy policy ) {	
		
		this.broadphase = broadphase;
		this.solver = solver;
		this.policy = policy;
		
		// start the new contact constraint manager
		this.contactmanager = new DefaultContactConstraintManager( broadphase, constraintGraph);
	}
	
	/**
	 * Create a new fixed time-stepping simulator with general purpose settings.
	 */
	public DefaultScene() {	
		
		// some default choises
		this.policy = new DefaultDeactivationPolicy();
//		this.broadphase = new SweepAndPrune();
//		this.broadphase = new ExhaustiveSearch();
		this.broadphase = new SAP2();
		
//		this.solver = new ProjectedGaussSeidel(55);
//		this.solver = new NonsmoothNonlinearConjugateGradient(55);
		this.solver = new NonsmoothNonlinearConjugateGradient(75);
		
		// start the new contact constraint manager
		this.contactmanager = new DefaultContactConstraintManager( broadphase, constraintGraph);
	}


	@Override
	public final void tick() {
//		System.out.println("tick();");
				
		// since an awful lot of things are going on in this method, a summarising explanation will be
		// given here. First, the broad phase collision detection is executed. Since the ContactConstraintManager
		// has installed event handlers into the BPC, allot of things will happen during the call to broadphase.run(), 
		// but in short, ContactConstraintManager will insert ContactConstraints into the constraintGraph, and update 
		// these constraints. See ContactConstraintManager for more details on this.
		
		// run the broad-phase collision detection (this automatically updates the contactGraph,
		// through the BroadfaseCollisionDetection.Handler type)
		broadphase.run();
				
		// clear acting forces and delta velocities
		for (Body bi:bodies) {
			bi.clearForces();
			bi.externaldeltavelocity.assignZero();
			bi.externaldeltaomega.assignZero();

		}
        // apply all forces	to external delta velocities
		for (Force fi: forces) {
//			System.out.println(""+f);
			fi.apply(timestep);
		}
				
		// Process live constraints. Live constraints are constraints which is not purely
		// a function of the velocities in the system, such as user controlled motors.
		// The behaviour of such constraints cannot be predicted by the deactivation system, 
		// and they have to be treated separately. Basically we perform a single PGS iteration
		// on the ncp constraints given by the live constraint. This will update the delta 
		// velocities of the involved bodies, and they can thus be activated.
		for ( Constraint live: liveconstraints) {
			ncpconstraints.clear(); ncpbodies.clear();
			Pair<Body> bodies = live.getBodies();
			ncpbodies.add(bodies.getFirst());
			ncpbodies.add(bodies.getSecond());			
			live.applyConstraints(ncpconstraints.listIterator(), timestep);
			pgs.solve(ncpconstraints, ncpbodies , 1e-7);
		} 

		// create a special iterator to be used with constraints. Each constraint will
		// insert its ncp-constraints into this list
		ncpconstraints.clear();
		ListIterator<NCPConstraint> constraintIterator = ncpconstraints.listIterator();

		
		// iterate through groups/components in the constraint graph
		Iterator<ConstraintGroup> components = 
			constraintGraph.getComponents();
		
		// for each component in constraint graph
		while (components.hasNext()) {
			// get the component 
			ConstraintGroup g = components.next();
			
			// if the component is marked as active
			if ( !g.deactivated) {
				// check if the whole component can be deactivated
				Iterator<Body> bodyiter =constraintGraph.getNodesInComponent(g);
				boolean activefound = false;
				while (bodyiter.hasNext()) {
					if ( !policy.shouldBeDeactivated(bodyiter.next()) ) {
						activefound = true;
						break;
					}
				}

				// if there are active bodies in the group, apply constraints
				if (activefound) {
					// mark the group as active in the component data
					ConstraintGroup data = g;
					data.deactivated = false;
					
					// apply all constraints in interaction component
					Iterator<Constraint> constraints = constraintGraph.getEdgesInComponent(g);
					while (constraints.hasNext()) {
						Constraint c = constraints.next();
						c.applyConstraints(constraintIterator, timestep);
					} // while
				} // if active found
				else {
					// if we don't find an active body, we mark the whole group as deactivated
					ConstraintGroup data = g;
					data.deactivated = true;

					// deactivate all bodies in component
					bodyiter =constraintGraph.getNodesInComponent(g);
					while (bodyiter.hasNext()) {
						policy.deactivate(bodyiter.next());
					}
				}
			} // if component active
			else {
				// component is deactivated
				// check if the whole component can be activated
				Iterator<Body> bodyiter =constraintGraph.getNodesInComponent(g);
				boolean activefound = false;
				while (bodyiter.hasNext()) {
					if ( policy.shouldBeActivated(bodyiter.next()) ) {
						activefound = true;
						break;
					}
				}
				
				if (activefound) {
					// mark component as active
					ConstraintGroup data = g;
					data.deactivated = false;

					// activate all bodies in component
					bodyiter =constraintGraph.getNodesInComponent(g);
					while (bodyiter.hasNext()) {
						policy.activate(bodyiter.next());
					}

					
					// apply all constraints in interaction component
					Iterator<Constraint> constraints = constraintGraph.getEdgesInComponent(g);
					while (constraints.hasNext()) {
						Constraint c = constraints.next();
						c.applyConstraints(constraintIterator, timestep);
					} // while					
				} // if activatable body found
				
			}
		} //while components
		
		// handle free bodies, not in any components
		Iterator<Body> freebodies = constraintGraph.getFreeNodes();
		while (freebodies.hasNext()) {
			Body body = freebodies.next();
			if (body.deactivated) {
				if (policy.shouldBeActivated(body)) {
					policy.activate(body);
				}
			} else {
				if (policy.shouldBeDeactivated(body)) {
					policy.deactivate(body);
				}
			}
		}

		
		// clear acting forces and delta velocities
		for (Body c:bodies) {
			// clear delta velocities for active bodies. This is reflects the
			// fact that all constraints on active bodies starts of with lambda = 0
			// when solved
			if (!c.deactivated) {
				c.deltavelocity.assignZero();
				c.deltaomega.assignZero();
			}
		}

		
		// run the solver (compute delta velocities) for all 
		// components in the constraint graph
		solver.solve( ncpconstraints, bodies, 1e-7 );
		
		
		// update triggers
		for (Trigger trigger: triggers) {
			trigger.update(this);
		}
		
		// go thru bodies to advance velocities and positions
		for (Body body: bodies) {
			if ( !body.deactivated ) {
				if ( !body.isFixed() ) {
					if (body.deltavelocity.isNaN() || body.deltaomega.isNaN() ) 
						System.exit(0);
					if (body.externaldeltavelocity.isNaN() || body.externaldeltaomega.isNaN() ) 
						System.exit(0);

					// apply delta velocities
					body.state.velocity.assign( body.state.velocity.add( body.deltavelocity).add(body.externaldeltavelocity) );
					body.state.omega.assign( body.state.omega.add( body.deltaomega).add(body.externaldeltaomega));

					// update angular and linear momentums
					Matrix3.multiply(body.state.inertia, body.state.omega, body.state.L);
					body.state.P.assign(body.state.velocity.multiply(body.state.mass));
				}

				// integrate forward on positions
				body.advancePositions(timestep);
			}
		}
		
		// debugging constraint graph
		//((HashMapComponentGraph<Body, Constraint, ConstraintGroup>)constraintGraph).print();
	} //time-step


	@Override
	public void addForce( Force f ) {
		forces.add(f);
	}

	@Override
	public void removeForce(Force f) {
		forces.remove(f);
	}

	@Override
	public void addBody( Body c) {
		bodies.add(c);
		c.updateTransformations();
		
		//install geometries into the broad-phase collision detection
		Iterator<Geometry> i = c.getGeometries();
		while (i.hasNext()) {
			Geometry g = i.next();
			broadphase.add(g);
		}
	}
	
	@Override
	public void addConstraint(Constraint joint) {
		constraintGraph.addEdge(joint.getBodies(), joint);
	}
	
	@Override
	public Iterator<Constraint> getConstraints() {
		List<Constraint> list = new ArrayList<Constraint>();
		Iterator<ConstraintGroup> ci = constraintGraph.getComponents();
		while(ci.hasNext()) {
			Iterator<Constraint> ei = constraintGraph.getEdgesInComponent(ci.next());
			while(ei.hasNext())
				list.add(ei.next());
		}
			
		return list.iterator();
	}
	
	public final void removeConstraint(Constraint c) {
		if (c!=null) {
			constraintGraph.removeEdge(c.getBodies());
		} else {
			System.out.println("Engine: attempt to remove null constraint");
		}
	}
	
	@Override
	public final void removeBody(Body body) {
		//remove associated geometries from collision detection
		Iterator<Geometry> i = body.getGeometries();
		while( i.hasNext()) {
			broadphase.remove(i.next());			
		}
		
		//finally remove from body list
		bodies.remove(body);
		
	}

	@Override
	public Iterator<Body> getBodies() {
		return bodies.iterator();
	}
	
	@Override
	public void setTimestep(double dt) {
		this.timestep = dt;
	}

	@Override
	public void fixBody(Body b, boolean fixed) {
		// this may seem a bit drastic, but it is necessary. If one
		// just changes the fixed setting directly on bodies during animation,
		// really bad thing will happen, because the contact graph will become
		// corrupted and will eventually crash jinngine
		
		//check if the body is in the animation
		if (!bodies.contains(b))
			return;
		
		// check if body is already the at the correct 
		// fixed setting, in which case do nothing
		if (b.isFixed() == fixed) 
			return;
		
		// remove the body from simulation 
		removeBody(b);

		//change the fixed setting
		b.setFixed(fixed);

		// reinsert body
		addBody(b);
		
	}
	
	@Override
	public void addLiveConstraint( Constraint c) {
		liveconstraints.add(c);
	}
	
	@Override
	public void removeLiveConstraint( Constraint c) {
		liveconstraints.remove(c);
	}

	
	@Override
	public void addTrigger(Trigger t) {
		t.setup(this);
		triggers.add(t);		
	}

	@Override
	public void removeTrigger(Trigger t) {
		triggers.remove(t);
		t.cleanup(this);
	}

	@Override
	public double getTimestep() {
		return this.timestep;
	}

	@Override
	public Iterator<Constraint> getConstraints(Body body) {
		return constraintGraph.getConnectedEdges(body);
	}

	@Override
	public ContactConstraintManager getContactConstraintManager() {
		return this.contactmanager;
	}
	
	@Override
	public BroadphaseCollisionDetection getBroadphase() {
		return this.broadphase;
	}

}
