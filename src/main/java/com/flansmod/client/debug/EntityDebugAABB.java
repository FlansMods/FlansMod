package com.flansmod.client.debug;

import com.flansmod.common.vector.Vector3f;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityDebugAABB extends Entity 
{
	public Vector3f vector;
	public int life;
	public float red = 1F, green = 1F, blue = 1F;
	
	public EntityDebugAABB(World w, Vector3f u, Vector3f v, int i, float r, float g, float b) 
	{
		super(w);
		setPosition(u.x, u.y, u.z);
		vector = v;
		life = i;
		red = r;
		green = g;
		blue = b;
	}

	public EntityDebugAABB(World w, Vector3f u, Vector3f v, int i) 
	{
		super(w);
		setPosition(u.x, u.y, u.z);
		vector = v;
		life = i;
	}

	@Override
	public void onUpdate()
	{
		life--;
		if(life <= 0)
			setDead();
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
