package co.uk.flansmods.api;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public interface IControllable
{
	/**
	 * This is fired every tick.
	 * @param deltaX  change in X of the mouse.
	 * @param deltaY change in Y of the mouse.
	 */
	void onMouseMoved(int deltaX, int deltaY);

	/**
	 * 
	 * @param key the keycode of the key. see @link:KeyInputHandler
	 * @return boolean to indicate it this key was handled.
	 */
	boolean pressKey(int key, EntityPlayer player);
	
	/** 
	 * @return riddenByEntity
	 * 
	 */
	Entity getControllingEntity();
	
	boolean isDead();
	
	/** @return The player's view roll */
	float getPlayerRoll();
	
	/** @return The player's 3rd person view distance */
	float getCameraDistance();
}