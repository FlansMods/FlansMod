package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;

public class PacketSeatUpdates extends PacketBase 
{
	public int entityId, seatId;
	public float yaw, pitch;
	
	public PacketSeatUpdates() {}

	public PacketSeatUpdates(EntitySeat seat)
	{
		entityId = seat.driveable.getEntityId();
		seatId = seat.seatInfo.id;
		yaw = seat.looking.getYaw();
		pitch = seat.looking.getPitch();
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeInt(entityId);
    	data.writeInt(seatId);
    	data.writeFloat(yaw);
    	data.writeFloat(pitch);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		entityId = data.readInt();
		seatId = data.readInt();
		yaw = data.readFloat();
		pitch = data.readFloat();
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
		{
			driveable.seats[seatId].prevLooking = driveable.seats[seatId].looking.clone();
    		driveable.seats[seatId].looking.setAngles(yaw, pitch, 0F);
    		//If on the server, update all surrounding players with these new angles
			FlansMod.getPacketHandler().sendToAllAround(this, driveable.posX, driveable.posY, driveable.posZ, FlansMod.soundRange, driveable.dimension);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		EntityDriveable driveable = null;
		for(Object obj : clientPlayer.worldObj.loadedEntityList)
		{
			if(obj instanceof EntityDriveable && ((Entity)obj).getEntityId() == entityId)
			{
				driveable = (EntityDriveable)obj;
				break;
			}
		}
		if(driveable != null)
		{
    		//If this is the player who sent the packet in the first place, don't read it
    		if(driveable.seats[seatId] == null || driveable.seats[seatId].riddenByEntity == clientPlayer)
    			return;
    		driveable.seats[seatId].prevLooking = driveable.seats[seatId].looking.clone();
    		driveable.seats[seatId].looking.setAngles(yaw, pitch, 0F);
		}
	}
}
