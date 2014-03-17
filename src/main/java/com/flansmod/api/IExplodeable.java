package com.flansmod.api;

/**
 * Implement this interface if an entity is able to explode. Other modders will be able to check if
 * an entity instanceof this, and if so, call the explode() method.
 * @author AidanBrady
 *
 */
public interface IExplodeable 
{
	/**
	 * Explode the entity completely.
	 */
	public void explode();
}
