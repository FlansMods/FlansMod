package com.flansmod.common.guns.raytracing;

import net.minecraft.entity.Entity;

public class EntityHit extends BulletHit 
{
	public Entity entity;
	
	public EntityHit(Entity e, float f) 
	{
		super(f);
		entity = e;
	}

}
