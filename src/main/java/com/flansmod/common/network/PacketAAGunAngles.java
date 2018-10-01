package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import com.flansmod.common.guns.EntityAAGun;

public class PacketAAGunAngles extends PacketBase
{
	public int entityID;
	public float gunYaw;
	public float gunPitch;
	
	public PacketAAGunAngles()
	{
	}
	
	public PacketAAGunAngles(EntityAAGun entity)
	{
		entityID = entity.getEntityId();
		gunYaw = entity.gunYaw;
		gunPitch = entity.gunPitch;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		data.writeInt(entityID);
		data.writeFloat(gunYaw);
		data.writeFloat(gunPitch);
	}
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		entityID = data.readInt();
		gunYaw = data.readFloat();
		gunPitch = data.readFloat();
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity)
	{
		
	}
	
	@Override
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		Entity entity = clientPlayer.world.getEntityByID(entityID);
		if(entity instanceof EntityAAGun)
		{
			EntityAAGun aa = (EntityAAGun)entity;
			aa.prevGunYaw = aa.gunYaw;
			aa.prevGunPitch = aa.gunPitch;
			aa.gunYaw = gunYaw;
			aa.gunPitch = gunPitch;
		}
	}
	
}
