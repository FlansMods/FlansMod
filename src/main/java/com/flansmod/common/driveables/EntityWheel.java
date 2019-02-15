package com.flansmod.common.driveables;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;

import com.flansmod.common.FlansMod;
import com.flansmod.common.vector.Vector3f;

public class EntityWheel extends Entity implements IEntityAdditionalSpawnData
{
	/**
	 * The vehicle this wheel is part of
	 */
	public EntityDriveable vehicle;
	/**
	 * The ID of this wheel within the vehicle
	 */
	private int ID;
	
	/**
	 * The ID of the vehicle this wheel is part of, for client-server syncing
	 */
	private int vehicleID;
	
	public EntityWheel(World world)
	{
		super(world);
		setSize(1F, 1F);
		stepHeight = 1.0F;
	}
	
	public EntityWheel(World world, EntityDriveable entity, int i)
	{
		this(world);
		vehicle = entity;
		vehicleID = entity.getEntityId();
		ID = i;
		
		initPosition();
	}
	
	public void initPosition()
	{
		Vector3f wheelVector =
				vehicle.axes.findLocalVectorGlobally(vehicle.getDriveableType().wheelPositions[ID].position);
		setPosition(vehicle.posX + wheelVector.x, vehicle.posY + wheelVector.y, vehicle.posZ + wheelVector.z);
		stepHeight = vehicle.getDriveableType().wheelStepHeight;
		
		prevPosX = posX;
		prevPosY = posY;
		prevPosZ = posZ;
	}
	
	@Override
	public void fall(float k, float l)
	{
		if(vehicle == null || k <= 0)
			return;
		int i = MathHelper.ceil(k - 3F);
		if(i > 0)
			vehicle.attackPart(vehicle.getDriveableType().wheelPositions[ID].part, DamageSource.FALL, i);
	}
	
	@Override
	protected void entityInit()
	{
	}
	
	@Override
	protected void readEntityFromNBT(NBTTagCompound tags)
	{
		DriveableType type = DriveableType.getDriveable(tags.getString("DriveableType"));
		ID = tags.getInteger("Index");
		
		if(type == null)
		{
			FlansMod.log.warn("Killing wheel due to invalid type tag");
			reallySetDead();
			return;
		}
		
		if(getRidingEntity() instanceof EntityDriveable)
		{
			vehicle = (EntityDriveable)getRidingEntity();
			vehicle.registerWheel(this);
		}
	}
	
	@Override
	protected void writeEntityToNBT(NBTTagCompound tags)
	{
		if(vehicle != null)
		{
			tags.setString("DriveableType", vehicle.getDriveableType().shortName);
			tags.setInteger("Index", ID);
		}
	}
	
	@Override
	public void onUpdate()
	{
		if(vehicle == null)
		{
			if(getRidingEntity() instanceof EntityDriveable)
			{
				vehicle = (EntityDriveable)getRidingEntity();
				vehicle.registerWheel(this);
			}
			return;
		}
		
		if(!addedToChunk)
		{
			world.spawnEntity(this);
		}
	}
	
	@Override
	public void setDead()
	{
		// No chance. You do not have the power
	}
	
	@Override
	public boolean canBeCollidedWith()
	{
		return !isDead;
	}
	
	
	public void reallySetDead()
	{
		super.setDead();
	}
	
	public double getSpeedXZ()
	{
		return Math.sqrt(motionX * motionX + motionZ * motionZ);
	}
	
	@Override
	public void setPositionAndRotationDirect(double d, double d1, double d2, float f, float f1, int i, boolean b)
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
		if(world.getEntityByID(vehicleID) instanceof EntityDriveable)
			vehicle = (EntityDriveable)world.getEntityByID(vehicleID);
		
		setPosition(posX, posY, posZ);
	}
	
	public int getExpectedWheelID()
	{
		return ID;
	}
	
	@Override
	public void updateRidden()
	{
		if(!updateBlocked)
			onUpdate();
		
		if(isRiding())
		{
			getRidingEntity().updatePassenger(this);
		}
	}
}
