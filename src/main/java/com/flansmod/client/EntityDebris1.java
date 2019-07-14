package com.flansmod.client;

import com.flansmod.common.FlansMod;

import net.minecraft.client.particle.EntityFX;
import net.minecraft.world.World;

public class EntityDebris1 extends EntityFX
{
	public EntityDebris1(World w, double px, double py, double pz, double mx, double my, double mz)
	{
		super(w, px, py, pz, mx, my, mz);
		this.particleMaxAge *= 5;
		this.particleGravity = 1;
		this.motionX = mx;
		this.motionY = my;
		this.motionZ = mz;
	}

	public void onUpdate()
	{
		this.prevPosX = this.posX;
		this.prevPosY = this.posY;
		this.prevPosZ = this.posZ;

		if(this.particleAge++ >= this.particleMaxAge)
		{
			this.setDead();
		}

		this.motionY -= 0.04D * (double) this.particleGravity;
		this.moveEntity(this.motionX, this.motionY, this.motionZ);
		this.motionX *= 0.99;
		this.motionY *= 0.99;
		this.motionZ *= 0.99;
		
		if(this.posY < 0)
		{
			setDead();
		}
		
		int NUM = 5;
		for(int i=0; i<NUM; i++)
		{
			double dx = (this.posX-this.prevPosX) / NUM;
			double dy = (this.posY-this.prevPosY) / NUM;
			double dz = (this.posZ-this.prevPosZ) / NUM;
			if(particleAge < 10){
			FlansMod.proxy.spawnParticle("flame",
				this.prevPosX + dx*i,
				this.prevPosY + dy*i,
				this.prevPosZ + dz*i,
				0,0,0);
			}
			FlansMod.proxy.spawnParticle("largesmoke",
					this.prevPosX + dx*i,
					this.prevPosY + dy*i*2,
					this.prevPosZ + dz*i,
					0,0,0);
		}

		if(this.onGround)
		{
			setDead();
		}
	}
}
