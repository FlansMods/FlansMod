package com.flansmod.common.driveables;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityWheel extends Entity 
{
	/** The vehicle this wheel is part of */
	public EntityVehicle vehicle;
	/** The ID of this wheel within the vehicle */
	public int ID;
	
	/** Set this to true when the client has found the parent vehicle and connected them */
	@SideOnly(Side.CLIENT)
	public boolean foundVehicle;
	/** The ID of the vehicle this wheel is part of, for client-server syncing */
	private int vehicleID;
	
	public EntityWheel(World world) 
	{
		super(world);
		setSize(1F, 1F);
	}

	public EntityWheel(World world, EntityVehicle veh, int i) 
	{
		this(world);
		vehicle = veh;
		vehicleID = veh.getEntityId();
		ID = i;
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
		
		//If on the client and the vehicle parent has yet to be found, search for it
		if(worldObj.isRemote && !foundVehicle)
		{
			vehicle = (EntityVehicle)worldObj.getEntityByID(vehicleID);
			if(vehicle == null)
				return;
			foundVehicle = true;
			vehicle.wheels[ID] = this;
		}	
	}
}
