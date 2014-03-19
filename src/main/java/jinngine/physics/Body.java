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
import jinngine.geometry.*;
import jinngine.math.*;

/**
 * A body is a rigid body entity, that is animated according to the laws of Newton. A body 
 * can have one or more geometry instances attached, and these define its final mass and 
 * inertia properties.
 */
public final class Body {
	// global public name
	public final String identifier;

	// auxiliary members
	public final Vector3               deltavelocity = new Vector3(0,0,0);
	public final Vector3               deltaomega    = new Vector3(0,0,0);
	
	public final Vector3               externaldeltavelocity = new Vector3();
	public final Vector3               externaldeltaomega = new Vector3();
	
	// deactivation
	public boolean                     deactivated = false;
	public final Vector3               deactivatedexternalforce = new Vector3();
	public final Vector3               deactivatedexternaltorque= new Vector3();

	// more auxiliary members
	public final Vector3               auxDeltav     = new Vector3();
	public final Vector3               auxDeltaOmega = new Vector3();
	public final Vector3               auxDeltav2 = new Vector3();
	public final Vector3               auxDeltaOmega2 = new Vector3();

	// physical state of body
	public final State state = new State();

	// list of attached geometries
	private final List<Geometry> geometries = new ArrayList<Geometry>();
	
	// fixed setting
	private boolean fixed = false;
	
			
	/**
	 * Create a now body with no geometry
	 * @param identifier Unique identifier for this body
	 */
	public Body(String identifier) {
		this.identifier = new String(identifier);
		Matrix4.identity(state.transform);
		Matrix3.identity(state.rotation);
		updateTransformations();	
		this.state.mass=0;
		Matrix3.set(new Matrix3(), state.inertia);
	}
	
	/**
	 * Create a new Body with a single geometry instance. finalize() is called 
	 * at the end of this constructor.
	 * @param identifier Unique identifier for this body
	 * @param g A geometry that will define this body's mass and inertia properties 
	 */
	public Body( String identifier, Geometry g  ) {
		this.identifier = new String(identifier);
		Matrix4.identity(state.transform);
		Matrix3.identity(state.rotation);
		updateTransformations();
		
		//some default properties
		this.state.mass=1;
		Matrix3.set(new Matrix3(), state.inertia);
		Matrix3.set(new Matrix3(), state.inverseinertia);
				
		addGeometry(g);
		
		//complete
		finalize();
	}
	
	/**
	 * Create a body using the given geometries. After adding all geometries in the iterator i has 
	 * been added, finalize() is automatically called.
	 * @param identifier Unique identifier for this body
	 * @param i
	 */
	public Body( String identifier, Iterator<Geometry> i) {
		this.identifier = new String(identifier);
		Matrix4.identity(state.transform);
		Matrix3.identity(state.rotation);
		updateTransformations();
				
		//some default properties
		this.state.mass=1;
		Matrix3.set(new Matrix3(), state.inertia);
		Matrix3.set(new Matrix3(), state.inverseinertia);
				
		while (i.hasNext()) {
			addGeometry(i.next());
		}
		
		//complete
		finalize();
	}
		
	/**
	 * Add a geometry to this body
	 */
	public void addGeometry( Geometry g ) {
		geometries.add(g);
	}

	/**
	 * Calculate total mass and inertia matrix. Aligns all attached geometries to the centre off mass. 
	 * This method must be called when all geometries are attached to this body. If any geometry changes 
	 * its local position, orientation, mass, or inertia properties, this method must be called again to 
	 * reflect those changes in the Body state. Some of the constructors call finalize() automatically. 
	 */
	public final void finalize() {
		final Vector3 cm = state.centreofmass;
		
		//reset body properties
		this.state.mass=0;
		Matrix3.set(new Matrix3(), state.inertia);
		Matrix3.set(new Matrix3(), state.inverseinertia);

		//if any geometry
		if ( geometries.size() > 0 ) {

			//find centre of mass
			cm.assignZero();
			double totalMass = 0;

			for (Geometry g: geometries) {
				g.setBody(this);
				
				totalMass += g.getMass();
				
				//get the transformation
				Matrix3 R = new Matrix3();
				Vector3 b = new Vector3();
				g.getLocalTransform(R, b);
				
				// cm = cm + b*M
				cm.assign( cm.add( b.multiply(g.getMass())));
			}
			
			//check total mass
			if (Math.abs(totalMass) < 1e-14 )
				totalMass = 1;
			
			// cm = cm / total mass
			cm.assign( cm.multiply(1/totalMass));
			this.state.mass = totalMass;

			//translate all geometries so centre of mass will become the origin
			for (Geometry g: geometries) {
				//get the transformation
				Matrix3 R = new Matrix3();
				Vector3 b = new Vector3();
				g.getLocalTransform(R, b);
				
				//align to centre of mass
				b.assign( b.minus(cm));

				//rotate the inertia matrix into this frame and add it to the inertia tensor of this body
				Matrix3 Im = InertiaMatrix.rotate(g.getInertialMatrix(), R).translate(g.getMass(), b);
				Matrix3.add(this.state.inertia, Im, this.state.inertia);

				//set the final transform
				g.setLocalTransform(R, b);
			}

			//fill out the inverse tensor
			Matrix3.inverse(this.state.inertia, this.state.inverseinertia);

		} else {
			//fall-back on something, in case no geometries were given
			this.state.mass = 1;
			this.state.inertia.assign(InertiaMatrix.identity());
			//this.state.Iinverse.identity();
		}
	}

	
    /**
     * Get geoemtry instances attached to this Body.
     * @return iterator containing geometry instances attached to this body
     */
	public Iterator<Geometry> getGeometries() {
		return geometries.iterator();
	}
	
	public final void applyImpulseToMomentums(Vector3 r, Vector3 J) {
		//                P
		// P = Mv => v = ---
		//                M

		//I-1  Lcm = I-1(r x F) = omega

		if (!isFixed()) {
			Vector3.add(this.state.P, J);
			Vector3.add(this.state.L, r.cross(J));

			//recalculate linear and angular velocities
			Matrix3.multiply(this.state.inverseinertia, state.L, this.state.omega);
			this.state.velocity.assign(state.P.multiply(1/this.state.mass));
		}
	}
	
	public void updateMomentums() {
		Matrix3.multiply(state.inertia, state.omega, state.L);
		state.P.assign(state.velocity.multiply(state.mass));
	}

	public final boolean isFixed() {
		return fixed;
	}

	public void setFixed( boolean value){
		fixed = value;
	}

	public final void setVelocity( Vector3 v ) {
		state.velocity.assign(v);
		//Recalculate linear momentum
		state.P.assign( this.state.velocity.multiply(this.state.mass));
	}
	
	public final void setVelocity( double x, double y, double z ) {
		state.velocity.assign(x,y,z);
		//Recalculate linear momentum
		state.P.assign( this.state.velocity.multiply(this.state.mass));
	}

	public final Vector3 getVelocity() {
		return new Vector3(state.velocity);
	}

	public final void setPosition( Vector3 r ) {
		state.position.assign(r);
		updateTransformations();
	}
	
	public final void setPosition( double x, double y, double z) {
		state.position.x = x;
		state.position.y = y;
		state.position.z = z;
		updateTransformations();
	}
	
	public final void setOrientation( Matrix3 orientation) {
		state.orientation.assign(orientation);
		updateTransformations();
	}
	
	/**
	 * Return a copy of the rotation matrix
	 * @return
	 */
	public final Matrix3 getOrientation() {
		return new Matrix3(state.rotation);
	}
	
	/**
	 * Get reference point of this body. This will be the centre of mass 
	 * of the body, unless manual modifications has been made
	 * @return reference position
	 */
	public final Vector3 getPosition() {
		return new Vector3(state.position);
	}

	/**
	 * Recalculate the transformation matrices rotation (3 by 3) and transform (4 by 4) from 
	 * the position and orientation state
	 */
	public final void updateTransformations() {
		//set identity transforms
		Matrix3.identity(state.rotation);
		Matrix4.identity(state.transform);

		//Matrix3.multiply(state.q.rotationMatrix3(), state.rotation, state.rotation);
		Matrix3.set(state.orientation.toRotationMatrix3(), state.rotation);

		//affine transform
		Matrix4.multiply(Transforms.rotateAndTranslate4( state.orientation, state.position), state.transform, state.transform);

		//inverse rotations (for normals)
		Matrix3.inverse(state.rotation, state.inverserotation);
	}
	
	/**
	 * Return the 4 by 4 transformation matrix of this body
	 * @return
	 */
	public final Matrix4 getTransform() {
		return state.transform;
	}

	public final void setAngularVelocity( Vector3 omega ) {
		state.omega.assign(omega);
		//recalculate the angular momentum
		Matrix3.multiply(state.inertia, state.omega, state.L);

	}
	
	public final void setAngularVelocity( double x, double y, double z ) {
		state.omega.assign(x,y,z);
		//recalculate the angular momentum
		Matrix3.multiply(state.inertia, state.omega, state.L);

	}


	public final Vector3 getAngularVelocity() {
		return new Vector3(state.omega);
	}

	public final double getMass() {
		return this.state.mass;
	}

	/**
	 * Clear acting forces
	 */
	public final void clearForces() {
		this.state.force.assign(new Vector3(0,0,0));
		this.state.torque.assign(new Vector3(0,0,0));	  
	}

	/**
	 * Apply force to delta velocities
	 *  
	 * @param point
	 * @param F
	 * @param dt
	 */
	public final void applyForce( Vector3 point, Vector3 F, double dt ) {
		// fixed bodies are unaffected by external forces
		if (!isFixed()) { 
			Vector3.add(this.state.torque, point.cross(F));
			Vector3.add(this.state.force, F );	  
			Vector3.multiply(this.state.force, 1.0/this.state.mass, this.state.acceleration );

			//apply directly to delta velocities
//			Vector3.add(this.deltavelocity, F.multiply(dt/this.state.mass));
//			Vector3.add(this.deltaomega, state.inverseinertia.multiply(point.cross(F)).multiply(dt));
			
			//apply directly to delta velocities
			Vector3.add(this.externaldeltavelocity, F.multiply(dt/this.state.mass));
			Vector3.add(this.externaldeltaomega, state.inverseinertia.multiply(point.cross(F)).multiply(dt));

		}
	}

	/**
	 * Calculate the total kinetic energy of this body. This is the some of both translational 
	 * and angular kinetec energy
	 * @return
	 */
	public final double totalKinetic() {
		double eKin;
		Vector3 res = new Vector3();

		//Calculate the rotational kinetic energy
		// T = (1/2) omega * I * omega,
		Matrix3.multiply(state.inverseinertia, state.L, state.omega);
		res  = Matrix3.transposeVectorAndMultiply( state.omega, state.inertia , res);
		eKin = res.dot( state.omega )*0.5f;

		//Translational energy E = m*(1/2)*v^2
		Vector3.multiply(this.state.P, 1.0/this.state.mass, this.state.velocity );
		eKin += state.velocity.dot(state.velocity)*state.mass*0.5f;

		return Math.abs(eKin);
	}

	/**
	 * Integrate velocities forward using an explicit Euler step of dt
	 * @param dt
	 */
	public final void advanceVelocities( double dt ) {
		//take one explicit euler-step, and integrate forward on the linear momentum
		Vector3.add(this.state.P, this.state.force.multiply(dt));
		Vector3.multiply(this.state.P, 1.0/this.state.mass, this.state.velocity );

		//Integrate the angular momentum forward taking an explicit euler step
		//and calculate the angular velocity from the angular momentum
		Vector3.add(state.L, state.torque.multiply(dt));    
		Matrix3.multiply(state.inverseinertia, state.L, state.omega);
	}

	/**
	 * Integrate forward on position using an explicit Euler step of dt
	 * @param dt
	 */
	public final void advancePositions( double dt) {
        // explicit euler step on position
		Vector3.add(state.position, state.velocity.multiply(dt)  );

		// explicit euler step on orientation
		state.orientationderivative.assign(0.0f, state.omega.multiply(0.5f));
		Quaternion.sMultiply( state.orientationderivative, state.orientation );
		Quaternion.add( state.orientation, (state.orientationderivative.multiply(dt) ));

		//apply to body
		state.orientation.normalize();  // keep q normalized   
		updateTransformations();
	}
	
	//Go from world to model
	public final Vector3 toModel( final Vector3 v) {
		// apply inverse rotation and translate backwards
		return state.rotation.transpose().multiply(v.minus(state.position));
	}

	//Go from world to model without translating
	public final Vector3 toModelNoTranslation( final Vector3 v) {
		// apply inverse rotation 
		return Matrix3.multiply(state.inverserotation, v, new Vector3() );
	}
	
	//Go to world coordinates from model coordinates
	public final Vector3 toWorld( final Vector3 v) {
		//apply complete transform
		return state.rotation.multiply(v).add(state.position);
	}

	//Go from model to rotated model
	public final Vector3 toWorldNoTranslation(final Vector3 v) {
		return Matrix3.multiply(this.state.rotation, v, new Vector3());
	}

	//translate (no local rotation) 
	public final Vector3 translate( final Vector3 v) {
		return v.add(state.position);
	}
	
	@Override
	public String toString() {
		return identifier+":"+super.toString();
	}
}  

