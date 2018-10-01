package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import com.flansmod.common.guns.ContainerGunModTable;
import com.flansmod.common.paintjob.ContainerPaintjobTable;

public class PacketGunPaint extends PacketBase
{
	private int paintjobID;
	
	public PacketGunPaint()
	{
		
	}
	
	public PacketGunPaint(int i)
	{
		paintjobID = i;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		data.writeInt(paintjobID);
	}
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		paintjobID = data.readInt();
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity)
	{
		if(playerEntity.openContainer instanceof ContainerGunModTable)
		{
			ContainerGunModTable gunModTable = ((ContainerGunModTable)playerEntity.openContainer);
			gunModTable.clickPaintjob(paintjobID);
		}
		else if(playerEntity.openContainer instanceof ContainerPaintjobTable)
		{
			ContainerPaintjobTable paintjobTable = ((ContainerPaintjobTable)playerEntity.openContainer);
			paintjobTable.clickPaintjob(paintjobID);
		}
	}
	
	@Override
	public void handleClientSide(EntityPlayer clientPlayer)
	{
	
	}
}
