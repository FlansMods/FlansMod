package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;

public class PacketSeatUpdates extends PacketBase
{
	public int entityId, seatId;
	public float yaw, pitch;
	
	public PacketSeatUpdates()
	{
	}
	
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
		for(Object obj : playerEntity.world.loadedEntityList)
		{
			if(obj instanceof EntityDriveable && ((Entity)obj).getEntityId() == entityId)
			{
				driveable = (EntityDriveable)obj;
				break;
			}
		}
		if(driveable != null)
		{
			driveable.getSeat(seatId).prevLooking = driveable.getSeat(seatId).looking.clone();
			driveable.getSeat(seatId).looking.setAngles(yaw, pitch, 0F);
			//If on the server, update all surrounding players with these new angles
			FlansMod.getPacketHandler().sendToAllAround(this, driveable.posX, driveable.posY, driveable.posZ, FlansMod.soundRange, driveable.dimension);
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		EntityDriveable driveable = null;
		for(int i = 0; i < clientPlayer.world.loadedEntityList.size(); i++)
		{
			Entity obj = clientPlayer.world.loadedEntityList.get(i);
			if(obj instanceof EntityDriveable && obj.getEntityId() == entityId)
			{
				driveable = (EntityDriveable)obj;
				break;
			}
		}
		if(driveable != null)
		{
			//If this is the player who sent the packet in the first place, don't read it
			if(driveable.getSeat(seatId) == null || driveable.getSeat(seatId).getControllingPassenger() == clientPlayer)
				return;
			driveable.getSeat(seatId).prevLooking = driveable.getSeat(seatId).looking.clone();
			driveable.getSeat(seatId).looking.setAngles(yaw, pitch, 0F);
		}
	}
}
