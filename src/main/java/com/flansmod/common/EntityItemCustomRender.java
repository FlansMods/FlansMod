package com.flansmod.common;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityItemCustomRender extends EntityItem 
{
	public EntityItemCustomRender(EntityItem entity) 
	{
		super(entity.world, entity.posX, entity.posY, entity.posZ, entity.getItem());
		this.motionX = entity.motionX;
		this.motionY = entity.motionY;
		this.motionZ = entity.motionZ;
		this.setDefaultPickupDelay();
	}

	public EntityItemCustomRender(World world, double posX, double posY, double posZ, ItemStack stack) 
	{
		super(world, posX, posY, posZ, stack);
	}

	public EntityItemCustomRender(World world) 
	{
		super(world);
	}

	public EntityItemCustomRender(World w, double x, double y, double z) 
	{
		super(w, x, y, z);
	}
}
