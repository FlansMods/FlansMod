package com.flansmod.apocalypse.common.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.MoverType;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import com.flansmod.apocalypse.common.FlansModApocalypse;

public class EntityNukeDrop extends Entity
{
	public static final int explosionLength = 500;
	public int timeSinceExplosion;
	
	public EntityNukeDrop(World world)
	{
		super(world);
		
		if(world.isRemote)
		{
			setRenderDistanceWeight(400D);
		}
		setSize(1F, 1F);
		noClip = false;
		ignoreFrustumCheck = true;
	}
	
	public EntityNukeDrop(World world, double x, double y, double z)
	{
		this(world);
		setPosition(x, y, z);
	}

	@Override
	protected void entityInit()
	{

	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound tags)
	{
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound tags)
	{

	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();
		
		if(!onGround)
		{
			motionY -= 0.01D;
			move(MoverType.SELF, motionX, motionY, motionZ);
		}
		else
		{
			timeSinceExplosion++;
			
			if(timeSinceExplosion > explosionLength)
				setDead();
		}
		
		if(!world.isRemote && FlansModApocalypse.proxy.getApocalypseCountdown() <= 0)
			setDead();
	}
}
