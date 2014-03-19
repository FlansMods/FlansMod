package jinngine.geometry.util;

import java.util.List;
import jinngine.geometry.*;
import jinngine.collision.GJK;
import jinngine.math.InertiaMatrix;
import jinngine.math.Matrix3;
import jinngine.math.Vector3;

public class MassProperties {
	
	private final GJK gjk = new GJK();
	private final double masslimit;
	private final SupportMap3 Sa;
	private double totalmass = 0;
	private final Vector3 centreofmass = new Vector3();
	private final InertiaMatrix inertia = new InertiaMatrix();
	
	public MassProperties( SupportMap3 shape, double masslimit ) {
		this.Sa = shape;
		this.masslimit = masslimit;
		
		// start subdivision using initial bounding box
		divide( Sa.supportPoint(new Vector3(1,0,0)).x, Sa.supportPoint(new Vector3(-1,0,0)).x,
				Sa.supportPoint(new Vector3(0,1,0)).y, Sa.supportPoint(new Vector3(0,-1,0)).y,     
				Sa.supportPoint(new Vector3(0,0,1)).z, Sa.supportPoint(new Vector3(0,0,-1)).z, 0 );
//		System.out.println("calculated mass " + totalmass);
		
		// finalise calculation of centre of mass
		Vector3.multiply( centreofmass, (1/totalmass));
		
		// align inertia tensor to centre of mass
		InertiaMatrix.translate( inertia, totalmass, centreofmass.multiply(-1));		
	}
	
	private final void divide( 
			final double xmax, final double xmin, 
			final double ymax, final double ymin, 
			final double zmax, final double zmin, 
			int depth ) {
		
		// side lengths and local mass of partition
		double xl = Math.abs(xmax-xmin);
		double yl = Math.abs(ymax-ymin);
		double zl = Math.abs(zmax-zmin);	
		double localmass = xl*yl*zl;
		
//		System.out.println("localmass = " +localmass);
//		System.out.println(""+xmin+","+xmax+"\n"+
//				""+ymin+","+ymax+"\n"+
//				""+zmin+","+zmax+"\n");

		
		// create a support map for this box
		SupportMap3 Sb = new SupportMap3() {
			public Vector3 supportPoint(Vector3 v) {
				double sv1 = v.x<0?xmin:xmax;
				double sv2 = v.y<0?ymin:ymax;
				double sv3 = v.z<0?zmin:zmax;
				return new Vector3(sv1, sv2, sv3);
			}
			public void supportFeature(Vector3 d, double epsilon,List<Vector3> face) {}
		};
		
		// find out if separated using gjk
		Vector3 va = new Vector3(), vb = new Vector3(); boolean separated = false;
		gjk.run(Sa, Sb, va, vb, 0, 1e-7, 32);
		separated = !gjk.getState().intersection;
		
		// seperated? do nothing
		if (separated) {
			return;
		} else {			
			// use a primitive inclusion test. If all 8 corners of the box is 
			// intersecting the shape, then the box included in it, and no further 
			// subdivisions a required
			if ( localmass < masslimit|| testInclusion(xmax, xmin, ymax, ymin, zmax, zmin) ) {
//				System.out.println("small or included");
				totalmass = totalmass + localmass;

				// inertia matrix for this local box
				InertiaMatrix localinertia = new InertiaMatrix();
				Matrix3.set( localinertia,
						(1.0f/12.0f)*localmass*(yl*yl+zl*zl), 0.0f, 0.0f,
						0.0f, (1.0f/12.0f)*localmass*(xl*xl+zl*zl), 0.0f,
						0.0f, 0.0f, (1.0f/12.0f)*localmass*(yl*yl+xl*xl) );

				// translate inertia matrix
				Vector3 localcentre = new Vector3((xmax+xmin)*0.5, (ymax+ymin)*0.5, (zmax+zmin)*0.5);			
				InertiaMatrix.translate(localinertia, localmass, localcentre);

				// add to final inertia matrix
				Matrix3.add(inertia, localinertia, inertia);

				// update centre of mass vector
				Vector3.add(centreofmass, localcentre.multiply(localmass));

				// done with this branch
				return;
			}

			//subdivide this box into 8 partitions
			divide( (xmax+xmin)*0.5, xmin,           (ymax+ymin)*0.5,  ymin,            (zmax+zmin)*0.5, zmin,     depth+1);
			divide( xmax,           (xmax+xmin)*0.5, (ymax+ymin)*0.5,  ymin,            (zmax+zmin)*0.5, zmin,     depth+1);
			divide( (xmax+xmin)*0.5, xmin,            ymax,            (ymax+ymin)*0.5, (zmax+zmin)*0.5, zmin,     depth+1);
			divide( xmax,            (xmax+xmin)*0.5, ymax,            (ymax+ymin)*0.5, (zmax+zmin)*0.5, zmin,     depth+1);
			divide( (xmax+xmin)*0.5, xmin,            (ymax+ymin)*0.5, ymin,            zmax,            (zmax+zmin)*0.5, depth+1);
			divide( xmax,            (xmax+xmin)*0.5, (ymax+ymin)*0.5, ymin,            zmax,            (zmax+zmin)*0.5, depth+1);
			divide( (xmax+xmin)*0.5, xmin,            ymax,            (ymax+ymin)*0.5, zmax,            (zmax+zmin)*0.5, depth+1);
			divide( xmax,            (xmax+xmin)*0.5, ymax,            (ymax+ymin)*0.5, zmax,            (zmax+zmin)*0.5, depth+1);
		}
	}
	
	/**
	 * Brute force method that determines if a box is included in the shape. This is done by testing each of the eight
	 * corner points for inclusion in the shape, using gjk
	 */
	private final boolean testInclusion( double xmax, double xmin, double ymax, double ymin, double zmax, double zmin) {
		final Vector3 pa = new Vector3();
		final Vector3 pb = new Vector3();
		
		// create a point support map
		final Vector3 point = new Vector3();
		SupportMap3 Sb = new SupportMap3() {
			public Vector3 supportPoint(Vector3 v) { return point; }
			public void supportFeature(Vector3 d, double epsilon,List<Vector3> face) {}
		};
		
        // perform intersection test on each corner point
		point.assign(xmax,ymax,zmax);
		gjk.run(Sa,Sb,pa,pb,0.0,1e-7,32);
		if (!gjk.getState().intersection)
			return false;

		point.assign(xmin,ymax,zmax);
		gjk.run(Sa,Sb,pa,pb,0.0,1e-7,32);
		if (!gjk.getState().intersection)
			return false;

		point.assign(xmax,ymin,zmax);
		gjk.run(Sa,Sb,pa,pb,0.0,1e-7,32);
		if (!gjk.getState().intersection)
			return false;

		point.assign(xmin,ymin,zmax);
		gjk.run(Sa,Sb,pa,pb,0.0,1e-7,32);
		if (!gjk.getState().intersection)
			return false;

		point.assign(xmax,ymax,zmin);
		gjk.run(Sa,Sb,pa,pb,0.0,1e-7,32);
		if (!gjk.getState().intersection)
			return false;

		point.assign(xmin,ymax,zmin);
		gjk.run(Sa,Sb,pa,pb,0.0,1e-7,32);
		if (!gjk.getState().intersection)
			return false;

		point.assign(xmax,ymin,zmin);
		gjk.run(Sa,Sb,pa,pb,0.0,1e-7,32);
		if (!gjk.getState().intersection)
			return false;

		point.assign(xmin,ymin,zmin);
		gjk.run(Sa,Sb,pa,pb,0.0,1e-7,32);
		if (!gjk.getState().intersection)
			return false;

		// if here, all tests passed and the box is included in the Sa shape
		return true;
	}
	
	/**
	 * Get the calculated centre of mass position in body space
	 * @return
	 */
	public Vector3 getCentreOfMass() {
		return centreofmass.copy();
	}
	
	/**
	 * Get the calculated total mass
	 * @return
	 */
	public double getMass() {
		return totalmass;
	}
	
	/**
	 * Get the calculated inertia tensor. This tensor will be scaled in the total mass of the object. 
	 * @return
	 */
	public Matrix3 getInertiaMatrix() {
		return inertia.copy();
	}
	

}
