package com.flansmod.common.network;

import com.flansmod.common.FlansMod;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;

/** 
 * Sent from client to server when player wants to go into debug mode
 * Sent from server to client to confirm that player may go into debug mode (i.e. player is an op)
 * @author James
 *
 */

public class PacketRequestDebug extends PacketBase 
{
	private boolean debug;
	
	public PacketRequestDebug()
	{
	}
	public PacketRequestDebug(boolean debug)
	{
		this.debug = debug;
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeByte(this.debug? 1: 0);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		this.debug = data.readByte()!=0;
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		if(MinecraftServer.getServer().getConfigurationManager().func_152596_g(playerEntity.getGameProfile()))
			FlansMod.packetHandler.sendTo(new PacketRequestDebug(true), playerEntity);
	}

	@Override
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		FlansMod.DEBUG = this.debug;
	}

}
