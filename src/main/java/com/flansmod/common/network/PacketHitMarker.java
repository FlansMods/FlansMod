package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;

public class PacketHitMarker extends PacketBase
{
	
	public PacketHitMarker()
	{
		//no data
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		//no data
	}
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		//no data
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity)
	{
		FlansMod.log.warn("Received PacketHitMarker packet on server. Disregarding.");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		FlansModClient.addHitMarker();
	}
}
