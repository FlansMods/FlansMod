package com.flansmod.client;

import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.vector.Vector3f;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityCamera extends EntityLivingBase 
{
	public EntityDriveable driveable;
	
	public EntityCamera(World world) 
	{
		super(world);
		setSize(0F, 0F);
	}
	
	public EntityCamera(World world, EntityDriveable d) 
	{
		this(world);
		driveable = d;
		setPosition(d.posX, d.posY, d.posZ);
	}
	
	@Override
	public void onUpdate()
	{
		//super.onUpdate();
		
		prevPosX = posX;
		prevPosY = posY;
		prevPosZ = posZ;
		
		Vector3f cameraPosition = new Vector3f();//-1F, 0.5F, 0F);
		//cameraPosition.scale(driveable.getDriveableType().cameraDistance);
		cameraPosition = driveable.axes.findLocalVectorGlobally(cameraPosition);
		
		//Lerp it
		double dX = driveable.posX + cameraPosition.x - posX;
		double dY = driveable.posY + cameraPosition.y - posY;
		double dZ = driveable.posZ + cameraPosition.z - posZ;
		
		float lerpAmount = 0.1F;
		
		setPosition(posX + dX * lerpAmount, posY + dY * lerpAmount, posZ + dZ * lerpAmount);
		
		rotationYaw = driveable.axes.getYaw() - 90F;
		rotationPitch = driveable.axes.getPitch();
		
		for(; rotationYaw - prevRotationYaw >= 180F; rotationYaw -= 360F) ;
		for(; rotationYaw - prevRotationYaw < -180F; rotationYaw += 360F) ;
	}

	@Override
	public ItemStack getHeldItem() 
	{
		return null;
	}

	@Override
	public ItemStack getEquipmentInSlot(int p_71124_1_) 
	{
		return null;
	}

	@Override
	public void setCurrentItemOrArmor(int p_70062_1_, ItemStack p_70062_2_) 
	{

	}

	@Override
	public ItemStack[] getLastActiveItems() 
	{
		return null;
	}

}
