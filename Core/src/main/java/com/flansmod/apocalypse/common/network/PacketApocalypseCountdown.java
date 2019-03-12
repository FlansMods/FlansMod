package com.flansmod.apocalypse.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import com.flansmod.apocalypse.client.ClientProxyApocalypse;
import com.flansmod.common.network.PacketBase;

public class PacketApocalypseCountdown extends PacketBase
{
	private int timeRemaining;
	
	public PacketApocalypseCountdown()
	{
		
	}
	
	public PacketApocalypseCountdown(int timeRemaining)
	{
		this.timeRemaining = timeRemaining;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		data.writeInt(timeRemaining);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		timeRemaining = data.readInt();
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity)
	{
		//Should not be received on server
	}

	@Override
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		ClientProxyApocalypse.updateApocalypseCountdownTimer(timeRemaining);
	}
}
