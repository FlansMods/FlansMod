package com.flansmod.client.debug;

import com.flansmod.common.vector.Vector3f;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class EntityDebugDot extends Entity 
{
	public float red = 1F, green = 1F, blue = 1F;
	public int life = 0;
	
	public EntityDebugDot(World w) 
	{
		super(w);
	}
	
	public EntityDebugDot(World w, Vector3f pos, int l) 
	{
		super(w);
		setPosition(pos.x, pos.y, pos.z);
		life = l;
	}
	
	public EntityDebugDot(World w, Vector3f pos, int l, float r, float g, float b) 
	{
		super(w);
		setPosition(pos.x, pos.y, pos.z);
		life = l;
		red = r;
		green = g;
		blue = b;
	}
	
	@Override
	public void onUpdate()
	{
		life--;
		if(life <= 0)
			setDead();
	}
	
	@Override
	public AxisAlignedBB getBoundingBox()
	{
		return null;
	}
	
	@Override
	protected void entityInit() 
	{
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound p_70037_1_) 
	{

	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound p_70014_1_) 
	{

	}

}
