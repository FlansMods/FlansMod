package com.flansmod.client.debug;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import com.flansmod.common.vector.Vector3f;

public class EntityDebugAABB extends Entity 
{
	public Vector3f vector;
	public int life;
	public float red = 1F, green = 1F, blue = 1F;
	public float rotationRoll;
	/** This is the offset after rotation */
	public Vector3f offset;
	
	public EntityDebugAABB(World w, Vector3f u, Vector3f v, int i, float r, float g, float b, float yaw, float pitch, float roll, Vector3f offset) 
	{
		super(w);
		setPosition(u.x, u.y, u.z);
		rotationYaw = yaw;
		rotationPitch = pitch;
		rotationRoll = roll;
		vector = v;
		life = i;
		red = r;
		green = g;
		blue = b;
		this.offset = offset;
	}
	
	public EntityDebugAABB(World w, Vector3f u, Vector3f v, int i, float r, float g, float b, float yaw, float pitch, float roll) 
	{
		this(w, u, v, i, r, g, b, yaw, pitch, roll, new Vector3f());
	}
	
	public EntityDebugAABB(World w, Vector3f u, Vector3f v, int i, float r, float g, float b) 
	{
		this(w, u, v, i, r, g, b, 0F, 0F, 0F);
	}

	public EntityDebugAABB(World w, Vector3f u, Vector3f v, int i) 
	{
		this(w, u, v, i, 1F, 1F, 1F);
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
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) 
	{
		
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) 
	{

	}

}
