/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.geometry.contact;
import java.util.Iterator;

import jinngine.geometry.Material;
import jinngine.geometry.Sphere;
import jinngine.math.*;

/**
 * Simple, fast, sphere-sphere contact generator.
 * @author mo
 *
 */
public class SphereContactGenerator implements ContactGenerator {
	private final ContactPoint cp = new ContactPoint();
	private final Sphere s1;
	private final Sphere s2;
//	private final Body b1;
//	private final Body b2;
	private boolean incontact = false;
    private final double envelope = 0.125;
	private final double shell = envelope*0.75;
	private final double restitution;
	private final double friction;

	public SphereContactGenerator(Sphere a, Sphere b) {
		this.s1 = a; 
		this.s2 = b;
//		this.b1 = a.getBody(); 
//		this.b2 = b.getBody();
		//System.out.println("created");
		
		//select the smallest restitution and friction coefficients 
		if ( a instanceof Material && b instanceof Material) {
			double ea = ((Material)a).getRestitution();
			double fa = ((Material)a).getFrictionCoefficient();
			double eb = ((Material)b).getRestitution();
			double fb = ((Material)b).getFrictionCoefficient();

			//pick smallest values
			restitution = ea > eb ? eb : ea;
			friction    = fa > fb ? fb : fa;

		} else if ( a instanceof Material ) {
			restitution = ((Material)a).getRestitution();
			friction    = ((Material)a).getFrictionCoefficient();
		} else if ( b instanceof Material ) {
			restitution = ((Material)b).getRestitution();
			friction    = ((Material)b).getFrictionCoefficient();
		} else { //default values
			restitution = 0.7;
			friction = 0.5;
		}
		
		//copy material properties to the contactpoint
		cp.restitution = restitution;
		cp.friction = friction;
	}
	
	@Override
	public Iterator<ContactPoint> getContacts() {
		//System.out.println("lksdf");
		return new Iterator<ContactPoint>() {
			boolean done = false;
			@Override
			public boolean hasNext() {
				return (!done)&&incontact;
			}
			@Override
			public ContactPoint next() {
				done = true;
				return cp;
			}
			@Override
			public void remove() {
				// TODO Auto-generated method stub
			}			
		};
	}

	@Override
	public void run() {
		// sphere centres in world space
		Vector3 caw = s1.getTransform().multiply(Vector3.zero);
		Vector3 cbw = s2.getTransform().multiply(Vector3.zero);

		// contact normal
		Vector3 normal = caw.minus(cbw).normalize();
		cp.normal.assign(normal);

		// find closest points in world space
		cp.paw.assign( normal.multiply(-s1.getRadius()).add(caw));
		cp.pbw.assign(normal.multiply(s2.getRadius()).add(cbw));
		
		// closest points in body frames
//		cp.pa.assign(b1.toModel(cp.paw));
//		cp.pb.assign(b2.toModel(cp.pbw));
				
		// world space interaction point
		cp.point.assign(cp.paw.add(cp.pbw).multiply(0.5));

		// distance between closest points
		double d = caw.minus(cbw).norm() - (s1.getRadius()+s2.getRadius());  
				

		// contact within envelope
		if ( d >= 0  && d < envelope ) {
			cp.depth = shell-d;
			//cp.depth = depth-(envelope/2.0) > 0 ? depth-(envelope/2.0):0;
			incontact = true;
			return;
		// penetration
		} else if ( d < 0){
			cp.depth = shell-d;
			//cp.depth = 0;
			incontact = true;
			return;
		// separation
		} else {
			cp.depth = 0;
			incontact = false;
			return;
		}
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
