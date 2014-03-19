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
public final class SimplifiedContactConstraint implements ContactConstraint {	
	private final Body b1, b2;                  //bodies in constraint
	private final List<ContactGenerator> generators = new ArrayList<ContactGenerator>();
	private final List<NCPConstraint>       ncpconstraints = new ArrayList<NCPConstraint>();
	
	/**
	 * Create a new ContactConstraint, using one initial ContactGenerator
	 * @param b1
	 * @param b2
	 * @param generator
	 */
	public SimplifiedContactConstraint(Body b1, Body b2, ContactGenerator generator ) {
		super();
		this.b1 = b1;
		this.b2 = b2;
		this.generators.add(generator);
		
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
		// clear list of ncp constraints
		ncpconstraints.clear();
		
		//use ContactGenerators to create new contactpoints
		for ( ContactGenerator cg: generators) {
			//run contact generator
			cg.run();
			//cg.run(dt);

			
			Vector3 axis = null;
			
			Iterator<ContactGenerator.ContactPoint> i = cg.getContacts();
			while (i.hasNext()) {
				ContactGenerator.ContactPoint cp = i.next();
				
				axis = cp.normal.copy();
				createFrictionalContactConstraint(cp, b1, b2, cp.point, cp.normal, cp.depth, dt, constraintIterator);				
			}
			
			
			
			if (axis != null) {
				Matrix3 basis = GramSchmidt.run(axis);
				
				Vector3 u = b1.state.velocity.minus(b2.state.velocity);
				
				NCPConstraint linear1 = new NCPConstraint();
				linear1.assign( 
						b1,	b2, 
						basis.column(1).multiply(1/b1.state.mass), Vector3.zero, basis.column(1).multiply(-1/b2.state.mass), Vector3.zero, 
						basis.column(1),                        Vector3.zero, basis.column(1).multiply(-1), Vector3.zero,
						-15,
						15,
						null,
						basis.column(1).dot(u), 0 );

				
				NCPConstraint linear2 = new NCPConstraint();
				linear2.assign( 
						b1,	b2, 
						basis.column(2).multiply(1/b1.state.mass), Vector3.zero, basis.column(2).multiply(-1/b2.state.mass), Vector3.zero, 
						basis.column(2),                        Vector3.zero, basis.column(2).multiply(-1), Vector3.zero,
						-15,
						15,
						null,
						basis.column(2).dot(u), 0 );

//				constraint linear2 = new constraint();
//				linear2.assign( 
//						b1,	b2, 
//						Bi.column(1), Bangi.column(1), Bj.column(1), Bangj.column(1), 
//						Ji.row(1), Jangi.row(1), Jj.row(1), Jangj.row(1),
//						Double.NEGATIVE_INFINITY,
//						Double.POSITIVE_INFINITY,
//						null,
//						u.y );
				
				//create experimental friction constraint
				NCPConstraint angular1 = new NCPConstraint();
				angular1.assign( 
						b1,	b2, 
						new Vector3(), b1.state.inverseinertia.multiply(axis), new Vector3(), b2.state.inverseinertia.multiply(axis.multiply(-1)), 
						new Vector3(), axis, new Vector3(), axis.multiply(-1), 
						-15,
						15,
						null,
						axis.dot(b1.state.omega)-axis.dot(b2.state.omega), 0 );

				constraintIterator.add(linear1);
				constraintIterator.add(linear2);
				constraintIterator.add(angular1);
				
				ncpconstraints.add(linear1);
				ncpconstraints.add(linear2);
				ncpconstraints.add(angular1);
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
		
		
		
		//truncate small collision
		//unf = unf < 0.1? 0: unf;
		
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

		//		B = new Vector(n.multiply(-1/m1))
		//		.concatenateHorizontal( new Vector(I1.multiply(r1.cross(n).multiply(-1))) )
		//		.concatenateHorizontal(new Vector(n.multiply(1/m2)))
		//		.concatenateHorizontal(new Vector(I2.multiply(r2.cross(n).multiply(1))));

		Vector3 B1 = n.multiply(1/m1);
		Vector3 B2 = I1.multiply(r1.cross(n));
		Vector3 B3 = n.multiply(-1/m2);
		Vector3 B4 = I2.multiply(r2.cross(n)).multiply(-1);

		if (b1.isFixed() ) { B1.assign( B2.assign(Vector3.zero)); }
		if (b2.isFixed() ) { B3.assign( B4.assign(Vector3.zero)); }

		//external forces acing at contact
		double Fext = B1.dot(b1.state.force) + B2.dot(b1.state.torque) + B3.dot(b2.state.force) + B4.dot(b2.state.torque);
		//double cv = cp.penetrating?0.5:0.50; //max. correction velocity
		//depth = depth > 0? 0:depth;
		double correction = 0;
		double lowerNormalLimit = 0;

		correction = depth*(1/dt)*0.8;
		//System.out.println("dt calculated=" + dt);
		
		double limit = 5.5;
		correction = correction< -limit? -limit:correction;
		correction = correction>  limit?  limit:correction;
		//correction = 0;
		
		//truncate correction if already covered by repulsive velocity
		if (correction > 0) {
			if (unf > correction ) {
				correction = 0;
			} else {
				correction = correction - unf;
			}
		}
		
		//un-comment to disable correction
		//correction = 0;
		
		NCPConstraint c = new NCPConstraint();
		c.assign(b1,b2,
				B1, B2, B3, B4,
				J1, J2, J3, J4,
				lowerNormalLimit, Double.POSITIVE_INFINITY,
				null,
			     -(unf-uni) - Fext*dt*0 -correction, 0 ) ;
		
		//set the correct friction setting for this contact
		c.mu = cp.friction;
				
//		if ( uni >=0 && uni < 1e-1)
//			c.lambda = cp.cachedNormalForce;

		//then the tantential friction constraints (totaly sticking in all cases, since lambda is unbounded)
		double ut1i = relativeVelocity(b1,b2,p,t2);
		double ut2i = relativeVelocity(b1,b2,p,t3);
		double ut1f = 0; 
		double ut2f = 0;
		
		//first tangent
		Vector3 t2B1 = t2.multiply(1/m1);
		Vector3 t2B2 = I1.multiply(r1.cross(t2) );
		Vector3 t2B3 = t2.multiply(-1/m2);				
		Vector3 t2B4 = I2.multiply(r2.cross(t2).multiply(-1));
		//double t2Fext = t2B1.dot(b1.state.FCm) + t2B2.dot(b1.state.tauCm) + t2B3.dot(b2.state.FCm) + t2B4.dot(b2.state.tauCm);
		NCPConstraint c2 = new NCPConstraint();
		c2.assign(b1,b2,
				t2B1, t2B2,	t2B3, t2B4,				
				t2, r1.cross(t2), t2.multiply(-1),	r2.cross(t2).multiply(-1),
				Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY,
				c,
				-(ut1f-ut1i) //+ t2Fext*dt*0
, 0
		);
		
		//book-keep constraints in each body
		//b1.constraints.add(c2);
		//b2.constraints.add(c2);


		//second tangent
		Vector3 t3B1 = t3.multiply(1/m1);
		Vector3 t3B2 = I1.multiply(r1.cross(t3));
		Vector3 t3B3 = t3.multiply(-1/m2);				
		Vector3 t3B4 = I2.multiply(r2.cross(t3).multiply(-1));
		NCPConstraint c3 = new NCPConstraint();
		c3.assign(b1,b2,
				t3B1, t3B2,	t3B3, t3B4,
				t3, r1.cross(t3), t3.multiply(-1), r2.cross(t3).multiply(-1),
				Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY,
				c,
				-(ut2f-ut2i), 0 
		);

		//book-keep constraints in each body
		//b1.constraints.add(c3);
		//b2.constraints.add(c3);
		outConstraints.add(c);
		//outConstraints.add(c2);
		//outConstraints.add(c3);
	}

	@Override
	public Pair<Body> getBodies() {
		return new Pair<Body>(b1,b2);
	}

	@Override
	public Iterator<NCPConstraint> getNcpConstraints() {
		return ncpconstraints.iterator();
	}

	@Override
	public Iterator<ContactGenerator> getGenerators() {
		return generators.iterator();
	}


}
