package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntityVehicle;

public class PacketDriveableControl extends PacketBase
{
	public int entityId;
	public double posX, posY, posZ;
	public double prevPosX, prevPosY, prevPosZ;
	public float yaw, pitch, roll;
	public double motX, motY, motZ;
	public float avelx, avely, avelz;
	public float throttle;
	public float fuelInTank;
	public float steeringYaw;
	public float recoilPos;
	public float lastRecoilPos;
	public float propAngle;
	public float prevPropAngle;
	public float rotorAngle;
	public float prevRotorAngle;
	public boolean flare;
	public boolean canFire;
	public boolean reload;
	public int stage;
	public int stageDelay;
	public String key;


	
	public PacketDriveableControl() {}
	
	public PacketDriveableControl(EntityDriveable driveable)
	{
		entityId = driveable.getEntityId();
		posX = driveable.posX;
		posY = driveable.posY;
		posZ = driveable.posZ;
		prevPosX = driveable.prevPosX;
		prevPosY = driveable.prevPosY;
		prevPosZ = driveable.prevPosZ;
		yaw = driveable.axes.getYaw();
		pitch = driveable.axes.getPitch();
		roll = driveable.axes.getRoll();
		motX = driveable.motionX;
		motY = driveable.motionY;
		motZ = driveable.motionZ;
		avelx = driveable.angularVelocity.x;
		avely = driveable.angularVelocity.y;
		avelz = driveable.angularVelocity.z;
		throttle = driveable.throttle;
		fuelInTank = driveable.driveableData.fuelInTank;
		recoilPos = driveable.recoilPos;
		lastRecoilPos = driveable.lastRecoilPos;
		flare = driveable.ticksFlareUsing > 0;
		if(driveable instanceof EntityVehicle)
		{
			EntityVehicle veh = (EntityVehicle)driveable;
			steeringYaw = veh.wheelsYaw;
		}
		else if(driveable instanceof EntityPlane)
		{
			EntityPlane plane = (EntityPlane)driveable;
			steeringYaw = plane.flapsYaw;
		}
		propAngle = driveable.propAngle;
		prevPropAngle = driveable.prevPropAngle;
		rotorAngle = driveable.rotorAngle;
		prevRotorAngle = driveable.prevRotorAngle;
		stage = driveable.stage;
		stageDelay = driveable.reloadAnimTime;
		canFire = driveable.canFireIT1;
		reload = driveable.reloadingDrakon;
		key = driveable.key;
	}
		
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
    	data.writeInt(entityId);
    	data.writeDouble(posX);
    	data.writeDouble(posY);
    	data.writeDouble(posZ);
    	data.writeDouble(prevPosX);
    	data.writeDouble(prevPosY);
    	data.writeDouble(prevPosZ);
    	data.writeFloat(yaw);
    	data.writeFloat(pitch);
    	data.writeFloat(roll);
    	data.writeDouble(motX);
    	data.writeDouble(motY);
    	data.writeDouble(motZ);
    	data.writeFloat(avelx);
    	data.writeFloat(avely);
    	data.writeFloat(avelz);
    	data.writeFloat(throttle);
    	data.writeFloat(fuelInTank);
    	data.writeFloat(steeringYaw);
    	data.writeFloat(recoilPos);
    	data.writeFloat(lastRecoilPos);
    	data.writeFloat(propAngle);
    	data.writeFloat(prevPropAngle); 
    	data.writeFloat(rotorAngle);
    	data.writeFloat(prevRotorAngle); 
    	data.writeBoolean(flare);
    	data.writeInt(stage);
    	data.writeInt(stageDelay);
    	data.writeBoolean(canFire);
    	data.writeBoolean(reload);
    	writeUTF(data, key);

	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		entityId = data.readInt();
		posX = data.readDouble();
		posY = data.readDouble();
		posZ = data.readDouble();
		prevPosX = data.readDouble();
		prevPosY = data.readDouble();
		prevPosZ = data.readDouble();
		yaw = data.readFloat();
		pitch = data.readFloat();
		roll = data.readFloat();
		motX = data.readDouble();
		motY = data.readDouble();
		motZ = data.readDouble();
		avelx = data.readFloat();
		avely = data.readFloat();
		avelz = data.readFloat();
		throttle = data.readFloat();
		fuelInTank = data.readFloat();
		steeringYaw = data.readFloat();
		recoilPos = data.readFloat();
		lastRecoilPos = data.readFloat();
		propAngle = data.readFloat();
		prevPropAngle = data.readFloat();
		rotorAngle = data.readFloat();
		prevRotorAngle = data.readFloat();
		flare = data.readBoolean();
		stage = data.readInt();
		stageDelay = data.readInt();
		canFire = data.readBoolean();
		reload = data.readBoolean();
		key = readUTF(data);
	}


	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		EntityDriveable driveable = null;
		for(Object obj : playerEntity.worldObj.loadedEntityList)
		{
			if(obj instanceof EntityDriveable && ((Entity)obj).getEntityId() == entityId)
			{
				driveable = (EntityDriveable)obj;
				break;
			}
		}
		if(driveable != null)
			updateDriveable(driveable, false);
	}
	
	protected void updateDriveable(EntityDriveable driveable, boolean clientSide)
	{
		driveable.setPositionRotationAndMotion(posX, posY, posZ, yaw, pitch, roll, motX, motY, motZ, avelx, avely, avelz, throttle, steeringYaw);
		driveable.prevPosX = prevPosX;
		driveable.prevPosY = prevPosY;
		driveable.prevPosZ = prevPosZ;
		driveable.driveableData.fuelInTank = fuelInTank;
		driveable.recoilPos = recoilPos;
		driveable.lastRecoilPos = lastRecoilPos;
		//plane.setPropPosition(propAngle, prevPropAngle);
		driveable.propAngle = propAngle;
		driveable.prevPropAngle = propAngle;
		//plane.setRotorPosition(rotorAngle, prevRotorAngle);
		driveable.rotorAngle = rotorAngle;
		driveable.prevRotorAngle = prevRotorAngle;
		driveable.varFlare= flare;
		driveable.key = key;
		if(driveable.getDriveableType().IT1)
		{
			driveable.setIT1(canFire, reload, stage, stageDelay);
		}

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		if(clientPlayer == null || clientPlayer.worldObj == null)
			return;
		EntityDriveable driveable = null;
		for(Object obj : clientPlayer.worldObj.loadedEntityList)
		{
			if(obj instanceof EntityDriveable && ((Entity)obj).getEntityId() == entityId)
			{
				driveable = (EntityDriveable)obj;
				driveable.driveableData.fuelInTank = fuelInTank;
				if(driveable.seats[0] != null && driveable.seats[0].riddenByEntity == clientPlayer)
					return;
				break;
			}
		}
		if(driveable != null){
			updateDriveable(driveable, true);
		}
	}
}
