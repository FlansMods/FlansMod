package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.api.IControllable;
import com.flansmod.common.FlansMod;

public class PacketDriveableKey extends PacketBase
{
	public int key;
	
	public PacketDriveableKey()
	{
	}
	
	public PacketDriveableKey(int k)
	{
		key = k;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		data.writeInt(key);
	}
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		key = data.readInt();
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity)
	{
		if(playerEntity.getRidingEntity() != null && playerEntity.getRidingEntity() instanceof IControllable)
		{
			((IControllable)playerEntity.getRidingEntity()).pressKey(key, playerEntity);
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		FlansMod.log.warn("Driveable keypress packet received on client. Skipping.");
	}
	
}
