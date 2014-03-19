/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.physics;

import jinngine.math.InertiaMatrix;
import jinngine.math.Matrix3;
import jinngine.math.Matrix4;
import jinngine.math.Quaternion;
import jinngine.math.Vector3;

/**
 * Physical state structure for a rigid body. Encapsulates physical quantities such as linear and angular 
 * velocities, intertia tensor, and transformation matrices. 
 */
public final class State  {
	//generalized position
	/** Position relative to center of mass */
	final public Vector3             position       = new Vector3(0,0,0);
	/** Quaternion describing orientation */
	public final Quaternion          orientation         = Quaternion.rotation(0.0f, new Vector3(1,0,0));  

	//Angular inertia
	/** Moment of inertia */
	public final InertiaMatrix       inertia         = new InertiaMatrix();
	/** Moment of inertia inverse */
	public final Matrix3             inverseinertia  = new Matrix3();
	/** Total mass */
	public double                    mass         = 1;                                         

	/** Angular momentum */
	public final Vector3             L       = new Vector3(0,0,0);
	/** Linear momentum */
	public final Vector3             P         = new Vector3(0,0,0);                        

	//Time derivatives
	/** Center of mass velocity */
	public final Vector3             velocity       = new Vector3(0,0,0);
	/** Angular Velocity ( Radians per time unit around each axis) */
	public final Vector3             omega   = new Vector3(0.0f,0.0f,0.0f);
	/** Quaternion first order time derivative  */
	public final Quaternion          orientationderivative        = new Quaternion( 0.0f, new Vector3(0,0,0));   
	/** Linear acceleration */
	final public Vector3             acceleration       = new Vector3(0,0,0);                          // Linear acceleration
	/** Angular acceleration */
	public final Vector3             alpha     = new Vector3(0,0,0);                          // Angular acceleration 
	/** total torque, dL/dt, change in angular momentum */
	public final Vector3             torque     = new Vector3(0,0,0);                          // total torque, dL/dt change in angular momentum
	/** total force, change in linear momentum dP/dt */
	public final Vector3             force       = new Vector3(0,0,0);                          // total force, change in linear momentum dP/dt

	//transforms
	/** Transformation matrix, how to get from object space to world */
	public final Matrix4             transform       = new Matrix4();
	/** Rotation matrix, how to get from object orientation into world orientation */
	public final Matrix3             rotation        = Matrix3.identity();
	/** Inverse rotation matrix */	
	public final Matrix3             inverserotation = Matrix3.identity();
	/** The centre of mass displacement found by finalize() **/
	public final Vector3             centreofmass    = new Vector3();

	/**
	 * Assign this state the fields in the State t
	 * @param t State to be copied
	 */
	public void  assign( State t) {
		State s = this;
		s.position.assign(t.position);
		s.orientation.assign(t.orientation);
		s.omega.assign(t.omega);
		Matrix3.set(t.inertia, s.inertia);
		Matrix3.set(t.inverseinertia, s.inverseinertia);
		s.L.assign(t.L);
		s.P.assign(t.P);
		s.mass = t.mass;

		s.velocity.assign(t.velocity);
		s.acceleration.assign(t.acceleration);
		s.alpha.assign(t.alpha);
		s.torque.assign(t.torque);
		s.force.assign(t.force);
		
		Matrix4.set(t.transform, s.transform);
		Matrix3.set(t.rotation, s.rotation);
		Matrix3.set(t.inverserotation, s.inverserotation);
	}
}

