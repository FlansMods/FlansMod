package com.flansmod.common.guns;

import com.flansmod.common.driveables.EntityDriveable;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public abstract class EntityShootable extends Entity 
{
	public EntityDriveable driveable;
	public EntityShootable(World w) 
	{
		super(w);
	}
}
