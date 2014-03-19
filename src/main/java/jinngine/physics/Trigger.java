/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.physics;

public interface Trigger {
	
	/**
	 * Called by {@link Scene} when the triller is added to it. The trigger should 
	 * setup event handlers etc during this call.
	 */
	public void setup( Scene s);
	
	/**
	 * Update this trigger. Called by {@link Scene}, should not be called by the user directly. 
	 */
	public void update( Scene s);
	
	/**
	 * Called by {@link Scene} just before the trigger is removed from the scene. The trigger
	 * should remove all installed event handlers etc. 
	 */
	public void cleanup( Scene s );

}
