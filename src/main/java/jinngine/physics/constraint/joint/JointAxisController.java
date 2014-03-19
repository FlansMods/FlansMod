/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.physics.constraint.joint;

/**
 * This interface should be retrieved from invoking methods on joint constraints. The interface can then be 
 * used to control the involved joint axis, like in a hinge joint. In that case, the positions, velocities, and 
 * limits will refer to angular quantities. This may not be the case for a sliding joint constraint, where the 
 * constraints on motion is linear in nature, so the quantities refer to linear constraints. 
 * @author mo
 *
 */
public interface JointAxisController {
	/**
	 * Returns joint's position on this axis. In case of an angular axis, this is a value in
	 * the range (-PI, PI). In case of a linear axis, the value could be any real number. 
	 * @return
	 */
	public double getPosition();
	
	/**
	 * Return the joint velocity along this axis
	 * @return
	 */
	public double getVelocity();
		
	/**
	 * Set the position limits for the joint along this joint axis. 
	 * @param thetaMin
	 * @param thetaMax
	 */
	public void setLimits( double thetaMin, double thetaMax );
	
	/**
	 * Set the available friction force magnitude for preventing motion along this joint axis
	 * @param magnitude
	 */
	public void setFrictionMagnitude( double magnitude );
	
	/**
	 * Set the joint motor force. Using the available force, the motor will try to accelerate 
	 * the joint to the highest possible velocity. When this setting is non-zero, the friction force 
	 * of this joint axis is turned off.
	 * 
	 * @param force
	 */
	public void setMotorForce( double force );
}
