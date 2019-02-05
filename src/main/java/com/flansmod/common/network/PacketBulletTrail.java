package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketBulletTrail extends PacketBase
{

	private Float x;
	
	public PacketBulletTrail()
	{
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleClientSide(EntityPlayer clientPlayer) {
		// TODO Auto-generated method stub
		
	}

}
