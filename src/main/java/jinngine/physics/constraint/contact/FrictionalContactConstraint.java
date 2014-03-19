/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.physics.constraint.contact;

import java.util.*;

import jinngine.geometry.contact.*;
import jinngine.math.Matrix3;
import jinngine.math.Vector3;
import jinngine.physics.Body;
import jinngine.physics.solver.Solver.NCPConstraint;
import jinngine.util.GramSchmidt;
import jinngine.util.Pair;


/**
 * A constraint the models a contact point between two bodies. A ContactConstraint acts 
 * like any other constraint/joint, for instance {@link BallInSocketJoint}. ContactConstraint uses one ore more
 * {@link ContactGenerator} instances to supply contact points and contact normals of the involved geometries. 
 * When two bodies are subject to a contact constraint, a ContactGenerator for each interacting geometry pair is required. 
 * Determining and instantiating these ContactGenerators should be handled by the simulator itself, however, one can create new 
 * and possibly optimised ContactGenerators for certain geometry pairs. A trivial example would be a ContactGenerator
 * for the Sphere-Sphere case, which is already implemented in Jinngine.
 *
 * @author mo
 *
 */
public final class FrictionalContactConstraint implements ContactConstraint {	
	private final Body b1, b2;                  //bodies in constraint
	private final List<ContactGenerator> generators = new ArrayList<ContactGenerator>();
	private final List<NCPConstraint>       ncpconstraints = new ArrayList<NCPConstraint>();
	private double frictionBoundMagnitude = Double.POSITIVE_INFINITY;
	
	private boolean enableCoupling = true;
	
	/**
	 * Create a new ContactConstraint, using one initial ContactGenerator
	 * @param b1
	 * @param b2
	 * @param generator
	 */
	public FrictionalContactConstraint(Body b1, Body b2, ContactGenerator generator) {
		super();
		this.b1 = b1;
		this.b2 = b2;
		this.generators.add(generator);
	}

	// some experimental methods
	private Vector3 xvel = new Vector3();
	public void setTangentialVelocityX( Vector3 x) {
		this.xvel.assign(x);
	}

	private Vector3 yvel = new Vector3();
	public void setTangentialVelocityY( Vector3 y) {
		this.yvel.assign(y);
	}
	
	private double multiplier = 1;
	public final void setTangentialVelocityMultiplier( double multiplier) {	
		this.multiplier = multiplier;
	}
	
	/**
	 * Add a new ContactGenerator for generating contact points and normal vectors
	 * @param g a new ContactGenerator
	 */
	public void addGenerator(ContactGenerator g) {
		this.generators.add(g);
	}
	
	/**
	 * Remove a contact generator
	 * @param g Previously added contact generator to be removed from this contact constraint
	 */
	public void removeGenerator(ContactGenerator g) {
		this.generators.remove(g);
	}
	
	/**
	 * Return the number of contact point generators
	 * @return
	 */
	public double getNumberOfGenerators() {
		return generators.size();
	}
	
	@Override
	public final void applyConstraints(ListIterator<NCPConstraint> constraintIterator, double dt) {
		//clear list of ncp constraints
		ncpconstraints.clear();
		
		//use ContactGenerators to create new contactpoints
		for ( ContactGenerator cg: generators) {
			//run contact generator
			cg.run();
			
			//generate contacts
			Iterator<ContactGenerator.ContactPoint> i = cg.getContacts();
			while (i.hasNext()) {
				ContactGenerator.ContactPoint cp = i.next();
				
				createFrictionalContactConstraint(cp, b1, b2, cp.point, cp.normal, cp.depth, dt, constraintIterator);				
			}
		}
		
	}

	/**
	 * Method that computes the relative velocity in the point p (in world coordinates), measured along the normal n. 
	 * @param b1 
	 * @param b2
	 * @param p
	 * @param n
	 * @return The relative velocity in the point p
	 */
	public final static double relativeVelocity(final Body b1, final Body b2, final Vector3 p, final Vector3 n ) 
	{
		// Vector rA = cp.Minus( A.r_cm );  
		//    Vector rB = cp.Minus( B.r_cm );

		// Relative contact velocity u, is
		// u = pdotA - pdotB
		//
		// where 
		// pdotX = omegaX x rX + v_cmX

		//  Vector pdotA = A.omega_cm.CrossProduct( rA ).Add(  A.v_cm );
		//  Vector pdotB = B.omega_cm.CrossProduct( rB ).Add(  B.v_cm );
		//  Vector u = pdotA.Minus( pdotB ); 

		//  double velocity = n.DotProduct(u);

		//   if ( u.DotProduct(n) > 0 ) {
		//Objects are not in collision in cp along n, RCV is negative
		//velocity = -velocity;
		//}

		//System.out.println("relative contact velocity (A-B) in cp " + velocity );
		Vector3 rb1 = new Vector3();
		Vector3 rb2 = new Vector3();
		Vector3 pdotb1 = new Vector3();
		Vector3 pdotb2 = new Vector3();
		Vector3 u = new Vector3();

		Vector3.sub( p, b1.state.position, rb1 );
		Vector3.sub( p, b2.state.position, rb2 );
		Vector3.crossProduct( b1.state.omega, rb1, pdotb1 );
		Vector3.add( pdotb1, b1.state.velocity );
		Vector3.crossProduct( b2.state.omega, rb2, pdotb2 );
		Vector3.add( pdotb2, b2.state.velocity );
		Vector3.sub( pdotb1, pdotb2, u );

		return Vector3.dot( n, u );
	}


	//Create a regular contact constraint including tangential friction
	public final void createFrictionalContactConstraint( 
			ContactGenerator.ContactPoint cp,
			Body b1, Body b2, Vector3 p, Vector3 n, double depth, double dt,
			ListIterator<NCPConstraint> outConstraints 
	) {

		//Use a gram-schmidt process to create a orthonormal basis for the contact point ( normal and tangential directions)
		Vector3 t1 = new Vector3(), t2 = new Vector3(), t3 = new Vector3();
		Matrix3 B  = GramSchmidt.run(n);
		B.getColumnVectors(t1, t2, t3);

		// interaction points and jacobian for normal constraint
		Vector3 r1 = p.minus(b1.state.position);
		Vector3 r2 = p.minus(b2.state.position);
		Vector3 J1 = n.multiply(1);
		Vector3 J2 = r1.cross(n).multiply(1);
		Vector3 J3 = n.multiply(-1);
		Vector3 J4 = r2.cross(n).multiply(-1);

		//First off, create the constraint in the normal direction
		double e = cp.restitution; //coeficient of restitution
		//double uni = relativeVelocity(b1,b2,p,n);
		double uni = J1.dot(b1.state.velocity) + J2.dot(b1.state.omega) + J3.dot(b2.state.velocity) + J4.dot(b2.state.omega);
		double unf = uni<0 ? -e*uni: 0;		
		
		//compute B vector
		Matrix3 I1 = b1.state.inverseinertia;
		double m1 = b1.state.mass;
		Matrix3 I2 = b2.state.inverseinertia;
		double m2 = b2.state.mass;
		Vector3 B1 = n.multiply(1/m1);
		Vector3 B2 = I1.multiply(r1.cross(n));
		Vector3 B3 = n.multiply(-1/m2);
		Vector3 B4 = I2.multiply(r2.cross(n)).multiply(-1);

		if (b1.isFixed() ) { B1.assign( B2.assign(Vector3.zero)); }
		if (b2.isFixed() ) { B3.assign( B4.assign(Vector3.zero)); }

		//external forces acing at contact (obsolete, external forces are modelled using the delta velocities)
		//double Fext = B1.dot(b1.state.force) + B2.dot(b1.state.torque) + B3.dot(b2.state.force) + B4.dot(b2.state.torque);
		double correction = depth*(1/dt); //the true correction velocity. This velocity corrects the contact in the next timestep.
		double escape = (cp.envelope-cp.distance)*(1/dt);
		double lowerNormalLimit = 0;
		double limit = 2;
		
		
		// if the unf velocity will make the contact leave the envelope in the next timestep, 
		// we ignore corrections
		if (unf > escape) {
			//System.out.println("escape");
			correction = 0;
		} else {
			//even with unf, we stay inside the envelope
			//truncate correction velocity if already covered by repulsive velocity
			if (correction > 0) {
				if (unf > correction ) {
					correction = 0;
				} else {
					correction = correction - unf; // not sure this is smart TODO
				}
			}
		}
	
		// limit the correction velocity
		correction = correction< -limit? -limit:correction;  
		correction = correction>  limit?  limit:correction;
		
		// take a factor of real correction velocity
		correction = correction * 0.9;

		// the normal constraint
		NCPConstraint c = new NCPConstraint();
		c.assign(b1,b2,
				B1, B2, B3, B4,
				J1, J2, J3, J4,
				lowerNormalLimit, Double.POSITIVE_INFINITY,
				null,
			     -(unf-uni)-correction, -correction) ;
		
		// set distance (unused in simulator)
		c.distance = cp.distance;
		
		
		//normal-friction coupling 
		final NCPConstraint coupling = enableCoupling?c:null;
		
		//set the correct friction setting for this contact
		c.mu = cp.friction;
				
		//then the tangential friction constraints 
		double ut1i = relativeVelocity(b1,b2,p,t2);
		double ut2i = relativeVelocity(b1,b2,p,t3);
		double ut1f = t2.dot(xvel.add(yvel))*multiplier; 
		double ut2f = t3.dot(xvel.add(yvel))*multiplier;
		
		//first tangent
		Vector3 t2B1 = b1.isFixed()? Vector3.zero: t2.multiply(1/m1);
		Vector3 t2B2 = b1.isFixed()? Vector3.zero: I1.multiply(r1.cross(t2) );
		Vector3 t2B3 = b2.isFixed()? Vector3.zero: t2.multiply(-1/m2);				
		Vector3 t2B4 = b2.isFixed()? Vector3.zero: I2.multiply(r2.cross(t2).multiply(-1));
		//double t2Fext = t2B1.dot(b1.state.FCm) + t2B2.dot(b1.state.tauCm) + t2B3.dot(b2.state.FCm) + t2B4.dot(b2.state.tauCm);
		NCPConstraint c2 = new NCPConstraint();
		c2.assign(b1,b2,
				t2B1, t2B2,	t2B3, t2B4,				
				t2, r1.cross(t2), t2.multiply(-1),	r2.cross(t2).multiply(-1),
				-frictionBoundMagnitude, frictionBoundMagnitude,
				coupling,
				-(ut1f-ut1i)  //+ t2Fext*dt*0
, 0
		);
		
		//second tangent
		Vector3 t3B1 = b1.isFixed()? Vector3.zero: t3.multiply(1/m1);
		Vector3 t3B2 = b1.isFixed()? Vector3.zero: I1.multiply(r1.cross(t3));
		Vector3 t3B3 = b2.isFixed()? Vector3.zero: t3.multiply(-1/m2);				
		Vector3 t3B4 = b2.isFixed()? Vector3.zero: I2.multiply(r2.cross(t3).multiply(-1));
		NCPConstraint c3 = new NCPConstraint();
		c3.assign(b1,b2,
				t3B1, t3B2,	t3B3, t3B4,
				t3, r1.cross(t3), t3.multiply(-1), r2.cross(t3).multiply(-1),
				-frictionBoundMagnitude, frictionBoundMagnitude,
				coupling,
				-(ut2f-ut2i), 0  
		);

		outConstraints.add(c);
		outConstraints.add(c2);
		outConstraints.add(c3);
		
		// add to list
		ncpconstraints.add(c);
		ncpconstraints.add(c2);
		ncpconstraints.add(c3);

	}

	@Override
	public final Pair<Body> getBodies() {
		return new Pair<Body>(b1,b2);
	}

	/**
	 * Specify whether a normal force magnitude coupling should be used on the friction force bounds.
	 * If not enabled, the bounds will be fixed.
	 * @param coupling
	 */
	public final void setCouplingEnabled( boolean coupling ) {
		this.enableCoupling = coupling;
	}
	
	/**
	 * Set the limits for fixed bound friction
	 * @param magnitude
	 */
	public final void setFixedFrictionBoundsMagnitude( double magnitude) {
		this.frictionBoundMagnitude  = magnitude;
	}

	@Override
	public final Iterator<NCPConstraint> getNcpConstraints() {
		return ncpconstraints.iterator();
	}

	@Override
	public final Iterator<ContactGenerator> getGenerators() {
		return generators.iterator();
	}
	
}
