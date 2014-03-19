/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.physics.force;

import jinngine.math.Vector3;
import jinngine.physics.Body;

/**
 * Models a spring mounted between two bodies, at points pa and pb. The initial distance between pa and pb will be the 
 * equilibrium length of the spring (where the acting force will be zero). The SpringForce models the two classical 
 * parameters for a spring force, the force and damping coefficients. The spring force equation is 
 * <p>
 * F = -k e x - v d 
 * <p>
 * where x is the unit vector pointing from pa to pb, e is the deviation from the equilibrium length,
 *  k is the force coefficient, v is the velocity of the spring ( v = u x ) and d is the damping coefficient.  
 *
 */
public class SpringForce implements Force {
	private final Body a;
	private final Body b;
	private final Vector3 pa, pb;
	private double equilibrium;
	private final double force;
	private final double damper;
	
	public SpringForce(Body a, Vector3 pa,  Body b, Vector3 pb) {		
		this.a = a;
		this.b = b;
		this.pa = pa.copy();
		this.pb = pb.copy();
		this.force = 10;
		this.damper = 1;

		//calculate the equilibrium length
		Vector3 paw = a.toWorld(pa);		
		Vector3 pbw = b.toWorld(pb);		
		Vector3 x = paw.minus(pbw);		
		this.equilibrium = x.norm();		
	}
	
	/**
	 * Create a spring force with the given parameters
	 * @param a 
	 * @param pa point on Body A in Body A space
	 * @param b
	 * @param pb point on Body B in Body B space
	 * @param force the force coefficient
	 * @param damper the damping coefficient
	 */
	public SpringForce(Body a, Vector3 pa, Body b, Vector3 pb, double force, double damper ) {
		this.a = a;
		this.b = b;
		this.pa = pa.copy();
		this.pb = pb.copy();
		this.force = force;
		this.damper = damper;

		//calculate the equilibrium length
		Vector3 paw = a.toWorld(pa);		
		Vector3 pbw = b.toWorld(pb);		
		Vector3 x = paw.minus(pbw);		
		this.equilibrium = x.norm();		
		
	}
	
	public SpringForce(Body a, Vector3 pa,  Body b, Vector3 pb, double equilibrilium ) {		
		this.a = a;
		this.b = b;
		this.pa = pa;
		this.pb = pb;
		this.equilibrium = equilibrilium;
		this.force = 10;
		this.damper = 1;
	}
	
	public void apply(double dt) {
		//point on a 
		Vector3 pra = a.toWorldNoTranslation(pa);
		
		//point on b
		Vector3 prb = b.toWorldNoTranslation(pb);
		
		Vector3 paw = pra.add(a.state.position);
		Vector3 pbw = prb.add(b.state.position);
		
		//Vector3 p2 = toWorldNoTranslation(new Vector3(0,-1,0));
		Vector3 x = pbw.minus(paw);

		Vector3 upa = a.state.velocity.add(a.state.omega.cross(pra));
		Vector3 upb = b.state.velocity.add(b.state.omega.cross(prb));
		
		
		Vector3 n;
		//normal of spring direction
		if ( x.abs().lessThan(Vector3.epsilon)) {
			n = x = Vector3.zero;
		} else {
			n = x.normalize();			
		}
		
		//clamp string length to avoid divergence
		if ( x.norm() > 1) {
			x.assign(x.normalize().multiply(1));
		}
		
		//relative velocities along spring
		double upax = (n.dot(upa));
		double upbx = (n.dot(upb));
		
		//Forces
		Vector3 Fspring = x.minus(n.multiply(equilibrium)).multiply(this.force); //spring force
		Vector3 Fdamper = n.multiply( (-upax+upbx) * this.damper  ); //damping force
		Vector3 Ftotal = Fspring.add( Fdamper );
				
		a.applyForce( pra, Ftotal.multiply(1), dt );
		b.applyForce( prb, Ftotal.multiply(-1), dt);
	}

}
