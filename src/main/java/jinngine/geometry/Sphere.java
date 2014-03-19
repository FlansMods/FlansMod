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
import jinngine.math.InertiaMatrix;
import jinngine.math.Matrix3;
import jinngine.math.Matrix4;
import jinngine.math.Transforms;
import jinngine.math.Vector3;
import jinngine.physics.Body;

/**
 * Sphere geometry implementation.
 */
public class Sphere implements SupportMap3, Geometry, Material {

	public Object getAuxiliary() {
		return auxiliary;
	}

	public void setAuxiliary(Object auxiliary) {
		this.auxiliary = auxiliary;
	}

	private Body body;
	private double radius;
	private final Vector3 displacement = new Vector3();
	private final Matrix4 transform4 = new Matrix4();
	private final Matrix4 localtransform4 = new Matrix4();
	private double envelope = 1;
	private Object auxiliary;
	private double restitution = 0.7;
	private double friction = 0.5;
	private double mass;


	public Sphere(double radius) {
		super();
		this.radius = radius;		
		this.mass = (4.0/3.0)*Math.PI*radius*radius*radius;
		this.envelope = 1;

		//set the initial local transform
		setLocalTransform( Matrix3.identity(), new Vector3());
	}
	
	public final double getRadius() { return this.radius; }

	@Override
	public Vector3 supportPoint(Vector3 direction) {
		//sphere is invariant under rotation
		return direction.normalize().multiply(radius).add(body.state.position).add(Matrix3.multiply(body.state.rotation, displacement, new Vector3()) );
	}

	@Override
	public Body getBody() {
		return body;
	}

	@Override
	public double getEnvelope() {
		return envelope;
	}
	
	@Override
	public Vector3 getMaxBounds() {
		//return new Vector3(radius+envelope,radius+envelope,radius+envelope).add(Matrix3.multiply(body.state.rotation, displacement, new Vector3())).add(body.state.rCm);
		return body.state.position.add( Matrix3.multiply(body.state.rotation, displacement, new Vector3())).add( new Vector3(radius+envelope,radius+envelope,radius+envelope));
		
	}

	@Override
	public Vector3 getMinBounds() {
		//return  new Vector3(-radius-envelope,-radius-envelope,-radius-envelope).add(Matrix3.multiply(body.state.rotation, displacement, new Vector3())).add(body.state.rCm);	
		return body.state.position.add( Matrix3.multiply(body.state.rotation, displacement, new Vector3())).add( new Vector3(-radius-envelope,-radius-envelope,-radius-envelope));

	}
	
	@Override
	public InertiaMatrix getInertialMatrix() {
		double r = radius;
		InertiaMatrix I = new InertiaMatrix();

		//Inertia tensor for the sphere. 
		Matrix3.set( I,
				(2/5f)*mass*r*r, 0.0f, 0.0f,
				0.0f, (2/5f)*mass*r*r, 0.0f,
				0.0f, 0.0f, (2/5f)*mass*r*r );

		return I;
	}

	@Override
	public void setBody(Body b) {
		this.body = b;
		
	}

	@Override
	public void setLocalTransform(Matrix3 B, Vector3 b2) {
		//A sphere only supports translations as local transform
		displacement.assign(b2);
		Matrix4.set(Transforms.transformAndTranslate4(Matrix3.identity().multiply(radius), displacement), localtransform4);
	}
	
	@Override
	public void getLocalTranslation(Vector3 t) {
		t.assign(displacement);
	}
	

	@Override
	public Matrix4 getTransform() {
		return Matrix4.multiply(body.state.transform, localtransform4, transform4);	
	}

	@Override
	public void setEnvelope(double envelope) {
		//this.envelope = envelope;
	}

	@Override
	public void supportFeature(Vector3 d, double epsilon, List<Vector3> ret) {
		//sphere is invariant under rotation
		ret.add(d.normalize().multiply(radius).add(body.state.position).add(Matrix3.multiply(body.state.rotation, displacement, new Vector3()) ));
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
	public void getLocalTransform(Matrix3 R, Vector3 b) {
		R.assign(Matrix3.identity());
		b.assign(this.displacement);	
	}

	@Override
	public double getMass() {
		return mass;
	}
	
	public void setMass(double mass) {
		this.mass = mass;
	}

	@Override
	public void setLocalScale(Vector3 s) {
		throw new UnsupportedOperationException();
	}


}
