package com.flansmod.common.driveables;

import com.flansmod.common.vector.Vector3f;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityWheel extends Entity implements IEntityAdditionalSpawnData
{
	/** The vehicle this wheel is part of */
	public EntityDriveable vehicle;
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
		stepHeight = 1.0F;
	}

	public EntityWheel(World world, EntityDriveable entity,  int i) 
	{
		this(world);
		vehicle = entity;
		vehicleID = entity.getEntityId();
		ID = i;
		
		initPosition();
	}
	
	public void initPosition()
	{
		Vector3f wheelVector = vehicle.axes.findLocalVectorGlobally(vehicle.getDriveableType().wheelPositions[ID].position);
		setPosition(vehicle.posX + wheelVector.x, vehicle.posY + wheelVector.y, vehicle.posZ + wheelVector.z);
		stepHeight = vehicle.getDriveableType().wheelStepHeight;
		
		prevPosX = posX;
		prevPosY = posY;
		prevPosZ = posZ;
	}
	
	@Override
    protected void fall(float k)
    {
		if(vehicle == null || k <= 0) 
        	return;
        int i = MathHelper.ceiling_float_int(k - 3F);
        if(i > 0)
        	vehicle.attackPart(vehicle.getDriveableType().wheelPositions[ID].part, DamageSource.fall, i);
    }

	@Override
	protected void entityInit() 
	{
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound tags) 
	{
		setDead();
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound tags) 
	{
	}
	
	@Override
	public void onUpdate()
	{
		//super.onUpdate();
		
		//prevPosX = posX;
		//prevPosY = posY;
		//prevPosZ = posZ;
		
		//If on the client and the vehicle parent has yet to be found, search for it
		if(worldObj.isRemote && !foundVehicle)
		{
			vehicle = (EntityDriveable)worldObj.getEntityByID(vehicleID);
			if(vehicle == null)
				return;
			foundVehicle = true;
			vehicle.wheels[ID] = this;
		}	
		
		if(vehicle == null)
			return;
		
		if(!addedToChunk)
			worldObj.spawnEntityInWorld(this);
		/*
		//Update angles
		rotationYaw = vehicle.rotationYaw;
		//Front wheels
		if(ID == 2 || ID == 3)
		{
			rotationYaw += vehicle.wheelsYaw;
		}
		
		//Apply gravity
		motionY -= 0.98F / 400F;
		
		//Apply velocity
		if(vehicle.getVehicleType().fourWheelDrive || ID == 0 || ID == 1)
		{
			float velocityScale = 0.01F;
			motionX += vehicle.throttle * Math.cos(rotationYaw * 3.14159265F / 180F) * velocityScale;
			motionZ += vehicle.throttle * Math.sin(rotationYaw * 3.14159265F / 180F) * velocityScale;
		}
		
		//Apply steering
		if(ID == 2 || ID == 3)
		{
			float velocityScale = 0.02F;
			motionX -= getSpeedXZ() * Math.sin(rotationYaw * 3.14159265F / 180F) * velocityScale * vehicle.wheelsYaw;
			motionZ += getSpeedXZ() * Math.cos(rotationYaw * 3.14159265F / 180F) * velocityScale * vehicle.wheelsYaw;
		}
		
		motionX *= 0.95F;
		motionY *= 0.95F;
		motionZ *= 0.95F;
		
		moveEntity(motionX, motionY, motionZ);
		
		//Pull wheels towards car
		Vector3f targetWheelPos = vehicle.axes.findLocalVectorGlobally(vehicle.getVehicleType().wheelPositions[ID]);
		Vector3f currentWheelPos = new Vector3f(posX - vehicle.posX, posY - vehicle.posY, posZ - vehicle.posZ);
		
		Vector3f dPos = ((Vector3f)Vector3f.sub(targetWheelPos, currentWheelPos, null).scale(vehicle.getVehicleType().wheelSpringStrength * 5F));
			
		if(dPos.length() > 0.001F)
		{
			moveEntity(dPos.x, dPos.y, dPos.z);
			dPos.scale(0.2F);
			vehicle.moveEntity(-dPos.x, -dPos.y, -dPos.z);
		}
		*/

	}
	
	
	
	public double getSpeedXZ()
	{
		return Math.sqrt(motionX * motionX + motionZ * motionZ);
	}
	
	@Override
    public void setPositionAndRotation2(double d, double d1, double d2, float f, float f1, int i)
    {
    }
	
	@Override
	public void writeSpawnData(ByteBuf data) 
	{
		data.writeInt(vehicleID);
		data.writeInt(ID);
	}

	@Override
	public void readSpawnData(ByteBuf data) 
	{
		vehicleID = data.readInt();
		ID = data.readInt();
		vehicle = (EntityDriveable)worldObj.getEntityByID(vehicleID);
		
		if(vehicle != null)
			setPosition(posX, posY, posZ);
	}
}
