package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import com.flansmod.client.teams.ClientTeamsData;
import com.flansmod.common.FlansMod;

public class PacketAddSingleRewardBoxInstance extends PacketBase
{
	public int boxHash;
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		data.writeInt(boxHash);
	}
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		boxHash = data.readInt();
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity)
	{
		FlansMod.Assert(false, "Handled single reward box packet on server!");
	}
	
	@Override
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		ClientTeamsData.AddRewardBox(boxHash);
	}
	
}
