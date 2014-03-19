/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.geometry;

import java.util.List;
import jinngine.math.*;
import jinngine.physics.Body;

/**
 * A box geometry implementation
 */
public class Box implements SupportMap3, Geometry, Material {

	// transforms and body reference
	private Body body;
	private final Matrix3 localtransform = new Matrix3();
	private final Matrix3 localrotation = new Matrix3();
	private final Vector3 localdisplacement = new Vector3();
	private final Vector3 bounds = new Vector3();
	private double envelope = 0.125;
	
	// box properties
	private double xs,ys,zs;
	private double mass;
	
	// auxiliary user reference
	private Object auxiliary;
	
	// material settings (defaults)
	private double restitution = 0.7;
	private double friction = 0.5;
	
	/**
	 * Create a box with the given side lengths
	 * @param x Box x-axis extend
	 * @param y Box y-axis extend
	 * @param z Box z-axis extend
	 */
	public Box(double x, double y, double z) {
		this.xs = x; this.ys = y; this.zs = z;
		mass = xs*ys*zs;
		
		//set the local transform
		setLocalTransform( Matrix3.identity(), new Vector3() );
	}

	/**
	 * Create a new box with the given side lengths and a local translation
	 * @param x Box x-axis extend
	 * @param y Box y-axis extend
	 * @param z Box z-axis extend
	 * @param posx Box local x-axis translation
	 * @param posy Box local y-axis translation
	 * @param posz Box local z-axis translation
	 */
	public Box(double x, double y, double z, double posx, double posy, double posz) {
		this.xs = x; this.ys = y; this.zs = z;
		mass = xs*ys*zs;
		
		//set the local transform
		setLocalTransform( Matrix3.identity(), new Vector3(posx,posy,posz) );
	}

	/** 
	 * Set new side lengths for this box. Keep in mind that altering geometry changes mass and 
	 * inertia properties of bodies. This method automatically re-finalises the attached body, 
	 * should this box be attached to one. This operation is relatively expensive.
	 */
	public final void setBoxSideLengths( double xl, double yl, double zl) {
		this.xs = xl; this.ys = yl; this.zs = zl;
		mass = xl*yl*zl;
		
		// re-finalise body if any present
		if ( body != null)
			body.finalize();
	}
	
	// user auxiliary methods
	public Object getAuxiliary() { return auxiliary; }
	public void setAuxiliary(Object auxiliary) { this.auxiliary = auxiliary; }

	@Override
	public Vector3 supportPoint(Vector3 direction) {
		// calculate a support point in world space
		Vector3 v = body.state.rotation.multiply(localrotation).transpose().multiply(direction);
		double sv1 = v.x<0?-0.5:0.5;
		double sv2 = v.y<0?-0.5:0.5;
		double sv3 = v.z<0?-0.5:0.5;
		return body.state.rotation.multiply(localtransform.multiply(new Vector3(sv1, sv2, sv3)).add(localdisplacement)).add(body.state.position);
	}

	@Override
	public Body getBody() { return body; }
	
	@Override
	public void setBody(Body b) { this.body = b; }

	@Override
	public InertiaMatrix getInertialMatrix() {
		InertiaMatrix I = new InertiaMatrix();
		// standard inertia matrix for a box with variable side lengths
		Matrix3.set( I,
				(1.0f/12.0f)*mass*(ys*ys+zs*zs), 0.0f, 0.0f,
				0.0f, (1.0f/12.0f)*mass*(xs*xs+zs*zs), 0.0f,
				0.0f, 0.0f, (1.0f/12.0f)*mass*(ys*ys+xs*xs) );

		return I;
	}
	
	@Override
	public double getEnvelope() {
		return envelope;
	}

	@Override
	public void setEnvelope(double envelope) {
		this.envelope = envelope;
	}

	@Override
	public void setLocalTransform(Matrix3 rotation, Vector3 displacement) {
		this.localdisplacement.assign(displacement);
		this.localrotation.assign(rotation);

		//set the local transform (including scaling)
		localtransform.assign( localrotation.multiply(new Matrix3(new Vector3(xs,0,0), new Vector3(0,ys,0), new Vector3(0,0,zs))));
		
		//extremal point on box
		double max = Matrix3.multiply(localtransform, new Vector3(0.5,0.5,0.5), new Vector3()).norm();
		bounds.assign(new Vector3(max,max,max));
		//System.out.println("max="+max);
	}

	@Override
	public void getLocalTransform(Matrix3 R, Vector3 b) {
		R.assign(localrotation);
		b.assign(localdisplacement);
	}
	
	@Override
	public void getLocalTranslation(Vector3 t) {
		t.assign(localdisplacement);
		
	}

	@Override
	public Vector3 getMaxBounds() {
		// find the pricipal axis of the box in world space
		Matrix3 T = body.state.rotation.multiply(localrotation).transpose();
		Vector3 vx = new Vector3(), vy = new Vector3(), vz = new Vector3();
		T.getColumnVectors(vx, vy, vz); 
		
		// support points in body space (with scaling)
		Vector3 px = new Vector3( xs*(vx.x<0?-0.5:0.5), ys*(vx.y<0?-0.5:0.5), zs*(vx.z<0?-0.5:0.5) );
		Vector3 py = new Vector3( xs*(vy.x<0?-0.5:0.5), ys*(vy.y<0?-0.5:0.5), zs*(vy.z<0?-0.5:0.5) );
		Vector3 pz = new Vector3( xs*(vz.x<0?-0.5:0.5), ys*(vz.y<0?-0.5:0.5), zs*(vz.z<0?-0.5:0.5) );

		// local rotation
		Matrix3.multiply( localrotation, px, px);
		Matrix3.multiply( localrotation, py, py);
		Matrix3.multiply( localrotation, pz, pz);
		
		// add local displacement 
		Vector3.add( px, localdisplacement);
		Vector3.add( py, localdisplacement);
		Vector3.add( pz, localdisplacement);
				
		// grab the row vectors of the body rotation (to save some matrix vector muls')
		Matrix3 Tb = body.state.rotation;
		Vector3 rx = new Vector3(), ry = new Vector3(), rz = new Vector3();
		Tb.getRowVectors(rx, ry, rz);
		
		// return the final bounds, adding the envelope size
		return new Vector3(rx.dot(px)+envelope, ry.dot(py)+envelope, rz.dot(pz)+envelope).add(body.state.position);
	}

	@Override
	public Vector3 getMinBounds() {

		// get the column vectors of the transform
		Matrix3 T = body.state.rotation.multiply(localrotation).transpose();
		Vector3 vx = new Vector3(), vy = new Vector3(), vz = new Vector3();
		T.getColumnVectors(vx, vy, vz);
		
		// invert vectors, because we are looking for minimum bounds
		Vector3.multiply(vx, -1);
		Vector3.multiply(vy, -1);
		Vector3.multiply(vz, -1);
		
		// support points in body space (with scaling)
		Vector3 px = new Vector3( xs*(vx.x<0?-0.5:0.5), ys*(vx.y<0?-0.5:0.5), zs*(vx.z<0?-0.5:0.5) );
		Vector3 py = new Vector3( xs*(vy.x<0?-0.5:0.5), ys*(vy.y<0?-0.5:0.5), zs*(vy.z<0?-0.5:0.5) );
		Vector3 pz = new Vector3( xs*(vz.x<0?-0.5:0.5), ys*(vz.y<0?-0.5:0.5), zs*(vz.z<0?-0.5:0.5) );

		// local rotation
		Matrix3.multiply( localrotation, px, px);
		Matrix3.multiply( localrotation, py, py);
		Matrix3.multiply( localrotation, pz, pz);
		
		// add local displacement and scale
		Vector3.add( px, localdisplacement);
		Vector3.add( py, localdisplacement);
		Vector3.add( pz, localdisplacement);

    	// grab the row vectors of the body rotation (to save some matrix vector muls')
		Matrix3 Tb = body.state.rotation;
		Vector3 rx = new Vector3(), ry = new Vector3(), rz = new Vector3();
		Tb.getRowVectors(rx, ry, rz);

		// return final bounds, subtracting the envelope size
		return new Vector3(rx.dot(px)-envelope, ry.dot(py)-envelope, rz.dot(pz)-envelope).add(body.state.position);		
	}

	@Override
	public Matrix4 getTransform() {
		return Matrix4.multiply(body.getTransform(), Transforms.transformAndTranslate4(localtransform, localdisplacement), new Matrix4());
	}	

	@Override
	public void supportFeature(Vector3 d, double epsilon, List<Vector3> featureList) {
		//final double epsilon = 0.03;  //123+132  213 231 312+321   
		//get d into the canonical box space
		Vector3 v = body.state.rotation.multiply(localrotation).transpose().multiply(d);
		//Vector3 v = body.state.rotation.transpose().multiply(d);
		//Vector3 v = d.copy();
		//List<Vector3> featureList = new ArrayList<Vector3>();

		int numberOfZeroAxis = 0;
		int[] zeroAxisIndices = new int[3];
		int numberOfNonZeroAxis = 0;
		int[] nonZeroAxisIndices = new int[3];
		
		if (Math.abs(v.x) < epsilon ) {
			zeroAxisIndices[numberOfZeroAxis++]=0;
		} else { nonZeroAxisIndices[ numberOfNonZeroAxis++] = 0; }
		if (Math.abs(v.y) < epsilon ) {
			zeroAxisIndices[numberOfZeroAxis++]=1;
		} else { nonZeroAxisIndices[ numberOfNonZeroAxis++] = 1; }
		if (Math.abs(v.z) < epsilon ) {
			zeroAxisIndices[numberOfZeroAxis++]=2;
		} else { nonZeroAxisIndices[ numberOfNonZeroAxis++] = 2; }
		
		
		if (numberOfZeroAxis == 0) {
			//eight possible points

			double sv1 = v.x<0?-0.5:0.5;
			double sv2 = v.y<0?-0.5:0.5;
			double sv3 = v.z<0?-0.5:0.5;
			//return Matrix4.multiply(transform4, new Vector3(sv1, sv2, sv3), new Vector3());
			featureList.add( body.state.rotation.multiply(localtransform.multiply(new Vector3(sv1, sv2, sv3)).add(localdisplacement)).add(body.state.position) );
		}

		else if (numberOfZeroAxis == 1) {
			//System.out.println("edge case");

			//four possible edges
			Vector3 p1 = new Vector3(v.x<0?-0.5:0.5, v.y<0?-0.5:0.5, v.z<0?-0.5:0.5 );
			Vector3 p2 = new Vector3(v.x<0?-0.5:0.5, v.y<0?-0.5:0.5, v.z<0?-0.5:0.5 );
			p1.set( zeroAxisIndices[0], 0.5);
			p2.set( zeroAxisIndices[0], -0.5);
			
			featureList.add( body.state.rotation.multiply(localtransform.multiply(p1).add(localdisplacement)).add(body.state.position) );
			featureList.add( body.state.rotation.multiply(localtransform.multiply(p2).add(localdisplacement)).add(body.state.position) );
		}

		else if (numberOfZeroAxis == 2) {
			//System.out.println("face case");
			//two possible faces
			//four possible edges
			Vector3 p1 = new Vector3(v.x<0?-0.5:0.5, v.y<0?-0.5:0.5, v.z<0?-0.5:0.5 );
			Vector3 p2 = new Vector3(v.x<0?-0.5:0.5, v.y<0?-0.5:0.5, v.z<0?-0.5:0.5 );
			Vector3 p3 = new Vector3(v.x<0?-0.5:0.5, v.y<0?-0.5:0.5, v.z<0?-0.5:0.5 );
			Vector3 p4 = new Vector3(v.x<0?-0.5:0.5, v.y<0?-0.5:0.5, v.z<0?-0.5:0.5 );
			
			// this makes sure that the returned set of points is always in counter
			// clock-wise order wrt. the non zero axis direction. 
			switch( nonZeroAxisIndices[0]) {
			case 0:
				if (v.x > 0) {
					p1.y =  0.5; p1.z =  0.5;
					p2.y = -0.5; p2.z =  0.5;
					p3.y = -0.5; p3.z = -0.5;
					p4.y =  0.5; p4.z = -0.5;
				} else {
					p1.y =  0.5; p1.z =  0.5;
					p2.y =  0.5; p2.z = -0.5;
					p3.y = -0.5; p3.z = -0.5;
					p4.y = -0.5; p4.z =  0.5;	
				}
				break;
			case 1:
				if (v.y > 0) {
					p1.z =  0.5; p1.x =  0.5;
					p2.z = -0.5; p2.x =  0.5;
					p3.z = -0.5; p3.x = -0.5;
					p4.z =  0.5; p4.x = -0.5;
				} else {
					p1.z =  0.5; p1.x =  0.5;
					p2.z =  0.5; p2.x = -0.5;
					p3.z = -0.5; p3.x = -0.5;
					p4.z = -0.5; p4.x =  0.5;	
				}
				break;
			case 2:
				if (v.z > 0) {
					p1.x =  0.5; p1.y =  0.5;
					p2.x = -0.5; p2.y =  0.5;
					p3.x = -0.5; p3.y = -0.5;
					p4.x =  0.5; p4.y = -0.5;
				} else {
					p1.x =  0.5; p1.y =  0.5;
					p2.x =  0.5; p2.y = -0.5;
					p3.x = -0.5; p3.y = -0.5;
					p4.x = -0.5; p4.y =  0.5;	
				}
				break;
			}
			
//			//make face turn counter-clock wise
//			if ( v.get(nonZeroAxisIndices[0]) < 0 ) { 
//				
//				
//				p1.set( zeroAxisIndices[0], 0.5);
//				p1.set( zeroAxisIndices[1], 0.5);
//
//				p2.set( zeroAxisIndices[0], -0.5);
//				p2.set( zeroAxisIndices[1],  0.5);
//
//				p3.set( zeroAxisIndices[0], -0.5);
//				p3.set( zeroAxisIndices[1], -0.5);     
//
//				p4.set( zeroAxisIndices[0],  0.5);      
//				p4.set( zeroAxisIndices[1], -0.5);
//			} else {
//				p1.set( zeroAxisIndices[0], 0.5);
//				p1.set( zeroAxisIndices[1], 0.5);
//
//				p2.set( zeroAxisIndices[0],  0.5);
//				p2.set( zeroAxisIndices[1],  -0.5);
//
//				p3.set( zeroAxisIndices[0], -0.5);
//				p3.set( zeroAxisIndices[1], -0.5);
//
//				p4.set( zeroAxisIndices[0],  -0.5);
//				p4.set( zeroAxisIndices[1],   0.5);				
//			}
			
			//return transformed vertices
			featureList.add( body.state.rotation.multiply(localtransform.multiply(p1).add(localdisplacement)).add(body.state.position) );
			featureList.add( body.state.rotation.multiply(localtransform.multiply(p2).add(localdisplacement)).add(body.state.position) );
			featureList.add( body.state.rotation.multiply(localtransform.multiply(p3).add(localdisplacement)).add(body.state.position) );
			featureList.add( body.state.rotation.multiply(localtransform.multiply(p4).add(localdisplacement)).add(body.state.position) );			
		}

		else if (numberOfZeroAxis == 3) {
			//should never happen, undefinded result
		}
	}

	//Material getters and setters
	@Override
	public double getFrictionCoefficient() {
		return friction;
	}

	@Override
	public double getRestitution() {
		return restitution;
	}

	@Override
	public void setFrictionCoefficient(double f) {
		this.friction = f;
	}

	@Override
	public void setRestitution(double e) {
		this.restitution = e;		
	}

	@Override
	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}
	
	/**
	 * Return the side lengths of this box
	 * @return
	 */
	public Vector3 getDimentions() {
		return new Vector3(xs,ys,zs);
	}

	@Override
	public void setLocalScale(Vector3 s) {
		throw new UnsupportedOperationException();
	}

}
