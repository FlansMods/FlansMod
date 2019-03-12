package com.flansmod.client.debug;

import net.minecraft.world.World;

import com.flansmod.common.vector.Vector3f;

/**
 * Entity for debugging purposes
 * On the client side a dot, in the given color, at the location of the entity is rendered
 */
public class EntityDebugDot extends EntityDebugColor
{
	public int life = 1000;
	
	/**
	 * @param w World for Entity Constructor
	 */
	public EntityDebugDot(World w)
	{
		super(w);
		setSize(0.25F, 0.25F);
	}
	
	/**
	 * Creates a white dot at the given location
	 *
	 * @param w   World for Entity Constructor
	 * @param pos Position of the dot
	 * @param l   Lifetime given in ticks
	 */
	public EntityDebugDot(World w, Vector3f pos, int l)
	{
		this(w, pos, l, 1F, 1F, 1F);
	}
	
	/**
	 * Creates a dot
	 * Color values range from 0 (Nonexistent) to 1 (Fully Visible)
	 *
	 * @param w   World for Entity Constructor
	 * @param pos Position of the dot
	 * @param l   Lifetime given in ticks
	 * @param r   Red color value
	 * @param g   Green color value
	 * @param b   Blue color value
	 */
	public EntityDebugDot(World w, Vector3f pos, int l, float r, float g, float b)
	{
		this(w);
		setPosition(pos.x, pos.y, pos.z);
		setColor(r, g, b);
		life = l;
	}
	
	@Override
	public void onUpdate()
	{
		life--;
		if(life <= 0)
			setDead();
	}
}
