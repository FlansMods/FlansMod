/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.physics;

/**
 * A utility used by {@link Scene} to classify inactive and active bodies. Note that both
 * functions may return false for the same body. This indicates that the current activation 
 * state for the body should not be changed, regardless of its current state. In general, the 
 * end-user should only care about this interface if one wants to implement a custom deactivation 
 * policy. Usually, the DefaultDeactivationPolicy will be adequate for most purposes.
 */
public interface DeactivationPolicy {
	
	/**
	 * Returns true if the Body b should be put into an deactivated state
	 */
	public boolean shouldBeDeactivated( Body b );
	
	/**
	 * Returns true if Body b should be activated
	 */
	public boolean shouldBeActivated( Body b );
	
	/**
	 * Deactivate the body b. This method is called by the Scene, to deactivate a body, rather than
	 * having the Scene accessing the Body state directly. This allows for policies to store more data in 
	 * relation to deactivation, to apply more advanced heuristics. 
	 */
	public void deactivate( Body b);

	/**
	 * Activate the body b. See {@link deactivation}. 
	 */
	public void activate( Body b);
}
