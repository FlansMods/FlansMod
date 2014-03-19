/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.physics;

import java.util.Iterator;

import jinngine.collision.BroadphaseCollisionDetection;
import jinngine.physics.Body;
import jinngine.physics.constraint.Constraint;
import jinngine.physics.constraint.contact.ContactConstraintManager;
import jinngine.physics.force.Force;

/**
 *  Interface for creating a new physics scene. One should implement this interface, and pass it onto some 
 *  class that is able to generate the scene. This could be a Collada loader.   
 */
public interface Scene {

	/**
	 * Get an iterator for all bodies in the Scene
	 * @return An iterator over bodies
	 */
	public Iterator<Body> getBodies(); 
	
	/**
	 * Get all constraints in the scene. This includes ContactConstraint instances
	 * @return An iterator over constraints
	 */ 
	public Iterator<Constraint> getConstraints();
	
	/** 
	 * Get all constraints acting upon to a specific body
	 * @param A body
	 * @return An iterator over constraints that act upon the given body
	 */
	public Iterator<Constraint> getConstraints(Body body);
	
	/**
	 * Add a body to the scene
	 * @param b
	 */
	public void addBody( Body b );
	
	/**
	 * Add a force to the scene
	 * @param f
	 */
	public void addForce( Force f );
	
	/**
	 * Add a constraint to the scene
	 * @param c
	 */
	public void addConstraint( Constraint c );
	
	/**
	 * Remove a body from the scene
	 * @param b
	 */
	public void removeBody( Body b );
	
	/** 
	 * Remove a force from the scene
	 * @param f
	 */
	public void removeForce( Force f );
	
	/**
	 * Remove a constraint from the scene
	 * @param c
	 */
	public void removeConstraint( Constraint c );
	
	/**
	 * Perform a time step on this model
	 * @param  
	 */
	public void tick();
	
	/**
	 * Set the time-step size for this scene
	 */
	public void setTimestep( double dt);
	
	/**
	 * Get the time-step size
	 */
	public double getTimestep();
	
	/** 
	 * Make a body become fixed, during animation
	 */
	public void fixBody( Body b, boolean fixed );
	
	/**
	 * Add a live constraint. A live constraint is a {@link Constraint} that is controlled by the user
	 * or some other control mechanism, partly or completely independent of the velocities and forces in the 
	 * {@link Scene}. This could for instance be the {@link HingeJoint} where a {@link JointAxisController} 
	 * instance is used by some automated or user controlled mechanism. This makes the constraint unpredictable
	 * for the deactivation system, and once the two {@link Body} objects that the constraint is acting upon 
	 * is deactivated, there is no way for the constraint to start working and reactivate the bodies. By adding 
	 * the constraint to the live constraints list, the constraint will be monitored and reactivated appropriately. 
	 * Remember to remove unused constraints with {@link removeLiveConstraint} so they do not unnecessarily take up resources.
	 * @param c
	 */
	public void addLiveConstraint( Constraint c);
	
	/**
	 * Remove a {@link Constraint} from the live constraints monitoring list. See {@link addLiveConstraint} for details on 
	 * live constraints.
	 * @param c {@link Constraint} to be removed
	 */
	public void removeLiveConstraint( Constraint c);
	
	/**
	 * Add an event trigger to this scene
	 */
	public void addTrigger( Trigger t);
	
	/**
	 * Remove an event trigger from this scene
	 */
	public void removeTrigger( Trigger t);
	
	/**
	 * Get the {@link ContactConstraintManager} that is governing contact constraints in this scene.
	 */
	public ContactConstraintManager getContactConstraintManager();
	
	/**
	 * Get the broadphase collision detection system
	 */
	public BroadphaseCollisionDetection getBroadphase();
}
