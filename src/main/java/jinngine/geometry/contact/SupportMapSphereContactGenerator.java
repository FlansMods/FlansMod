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
import java.util.List;

import jinngine.collision.GJK;
import jinngine.collision.RayCast;
import jinngine.geometry.Geometry;
import jinngine.geometry.Sphere;
import jinngine.geometry.SupportMap3;
import jinngine.math.Matrix3;
import jinngine.math.Vector3;
import jinngine.physics.Body;

/**
 * Contact generator for Sphere-SupportMap combinations. Insted of using a sphere support map,
 * we use just the sphere centre point as supprt map for the sphere. This makes GJK behave much 
 * more regular, because the continuous shape is avoided. 
 */
public final class SupportMapSphereContactGenerator implements ContactGenerator {
	// data
	@SuppressWarnings("unused")
	private final Body b1, b2;
	private final Geometry g1;
	private final SupportMap3 convex;
	private final SupportMap3 pointmap;
	private final Sphere sphere;
	private final Vector3 spherecentreworld = new Vector3();
	private final Vector3 convexcentreworld = new Vector3();
	private final ContactPoint cp = new ContactPoint();
	private boolean incontact = false;
	private boolean invertnormal = false;
	
	// settings
	private static double epsilon = 1e-7;
    private static double envelope = 0.125*0.5;
	private static double shell = envelope*0.75;

	// algorithms
	private final GJK closest = new GJK();
	private final RayCast raycast = new RayCast();
	
	public SupportMapSphereContactGenerator(Body b1, Geometry g1, SupportMap3 convex, Body b2, Sphere sphere) {
		this.convex = convex;
		this.sphere = sphere;
		this.b1 = b1;
		this.b2 = b2;
		this.g1 = g1;

		// SupportMap for the sphere centre
		this.pointmap = new SupportMap3() {
			public final Vector3 supportPoint(Vector3 direction) { return spherecentreworld.copy(); }
			public final void supportFeature(Vector3 d, double epsilon, List<Vector3> face) {}
		};
		
		cp.restitution = 0.7;
		cp.friction = 0.5;
	}

	/**
	 * Alternative constructor for geoemtries in reversed order
	 * @param b2
	 * @param sphere
	 * @param b1
	 * @param convex
	 */
	public SupportMapSphereContactGenerator( Body b2, Sphere sphere, Body b1, Geometry g1, SupportMap3 convex) {
		this.convex = convex;
		this.sphere = sphere;
		this.b1 = b1;
		this.g1 = g1;
		this.b2 = b2;

		// SupportMap for the sphere centre
		this.pointmap = new SupportMap3() {
			public final Vector3 supportPoint(Vector3 direction) { return spherecentreworld.copy(); }
			public final void supportFeature(Vector3 d, double epsilon, List<Vector3> face) {}
		};
		
		// default material settings
		cp.restitution = 0.7;
		cp.friction = 0.5;		
		invertnormal = true;
	}
	
	@Override
	public final Iterator<ContactPoint> getContacts() {
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
			public void remove() {}			
		};
	}

	@Override
	public final void run() {
		//boolean penetrating = false;
		// assign the centre of mass position of the sphere in world space
		sphere.getLocalTranslation(spherecentreworld);
		Matrix3.multiply(b2.state.rotation, spherecentreworld, spherecentreworld);
		Vector3.add(spherecentreworld, b2.state.position);

		// run GJK
		closest.run(convex, pointmap, cp.paw, cp.pbw, sphere.getRadius()+envelope, epsilon, 31); //notice the envelope size
				
		// penetration
		if ( closest.getState().simplexSize > 3  || cp.paw.minus(cp.pbw).norm() < 1e-7 ) {
			//penetrating = false;
			System.out.println("SupportMap-sphere: penetration");
			// we perform a raycast, that is equivalent to
			// finding the growth distance between Sa and Sb. 
			// by that we obtain a contact normal at the 
			// intersection point. 
			g1.getLocalTranslation(convexcentreworld);	
			
			// apply body rotation to local displacements (centre of mass of objects)
			Matrix3.multiply(g1.getBody().state.rotation, convexcentreworld, convexcentreworld);
			Vector3 direction = g1.getBody().getPosition().add(convexcentreworld).minus(spherecentreworld);

			// compute the largest possible starting lambda, based on 
			// the support of A-B along the ray direction
			Vector3 sp = convex.supportPoint(direction.negate()).minus(pointmap.supportPoint(direction));
			double lambda = direction.dot(sp)/direction.dot(direction)-envelope/direction.norm();
			raycast.run(convex, pointmap, new Vector3(), direction, cp.paw, cp.pbw, lambda, sphere.getRadius()+envelope, epsilon);

			// cp.paw is the point on the convex shape
			// pb-pa is the normal direction
			// pa is a point on the convex shape
			// we project pa onto the direction to approximate real point on convex
			// p = (pa dot (pb-pa))(pb-pa) 
			cp.normal.assign(cp.paw.minus(cp.pbw).normalize());
			
			//project paw onto the normal
			cp.paw.assign( spherecentreworld.add( cp.normal.multiply(-cp.paw.dot(cp.normal))) );				
			cp.pbw.assign( spherecentreworld.add( cp.normal.multiply(sphere.getRadius())) );
			
		} else {
			cp.normal.assign( cp.paw.minus(cp.pbw).normalize() );
			cp.pbw.assign( spherecentreworld.add( cp.normal.multiply(sphere.getRadius())) );			
		}

		// find contact distance and interaction point
		cp.distance = cp.paw.minus(cp.pbw).dot(cp.normal);
		cp.point.assign( cp.paw.add(cp.pbw).multiply(0.5));

		//invert the normal if geometries came in reverse order
		if (invertnormal)
			Vector3.multiply( cp.normal, -1);
		
		// contact within envelope
		if ( cp.distance >= 0  && cp.distance < envelope ) {
			cp.depth = shell-cp.distance;
			//cp.depth = depth-(envelope/2.0) > 0 ? depth-(envelope/2.0):0;
			incontact = true;		
			return;
		// penetration
		} else if ( cp.distance < 0){
			cp.depth = shell-cp.distance;
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
	public final void remove() {
		// TODO Auto-generated method stub
		
	}

}
