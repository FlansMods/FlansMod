package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import com.flansmod.common.guns.ContainerGunModTable;

public class PacketGunPaint extends PacketBase 
{
	private String paintjobName; 
	
	public PacketGunPaint()
	{
		
	}
	
	public PacketGunPaint(String name)
	{
		paintjobName = name;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		writeUTF(data, paintjobName);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		paintjobName = readUTF(data);
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		ContainerGunModTable gunModTable = ((ContainerGunModTable)playerEntity.openContainer);
		gunModTable.clickPaintjob(paintjobName);
	}

	@Override
	public void handleClientSide(EntityPlayer clientPlayer) 
	{

	}
}
