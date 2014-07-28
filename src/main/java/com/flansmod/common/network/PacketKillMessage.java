package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import com.flansmod.client.TickHandlerClient;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;

public class PacketKillMessage extends PacketBase 
{
	public InfoType killedBy;
	public String killerName;
	public String killedName;
	
	public PacketKillMessage()
	{
		
	}
	
	public PacketKillMessage(InfoType weapon, String victim, String murderer)
	{
		killedBy = weapon;
		killerName = murderer;
		killedName = victim;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		writeUTF(data, killedBy.shortName);
		writeUTF(data, killerName);
		writeUTF(data, killedName);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		killedBy = InfoType.getType(readUTF(data));
		killerName = readUTF(data);
		killedName = readUTF(data);
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		FlansMod.log("Received kill message packet on the server. Skipping.");
	}

	@Override
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		TickHandlerClient.addKillMessage(killedBy, killerName, killedName);
	}

}
