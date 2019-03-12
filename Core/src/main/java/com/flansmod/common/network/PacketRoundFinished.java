package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.client.teams.ClientTeamsData;
import com.flansmod.common.teams.RoundFinishedData;

public class PacketRoundFinished extends PacketBase
{
	public RoundFinishedData roundFinishedData = new RoundFinishedData();
	
	public PacketRoundFinished()
	{
	}
	
	public PacketRoundFinished(RoundFinishedData data)
	{
		roundFinishedData = data;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		roundFinishedData.WriteInitialData(data);
	}
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		roundFinishedData.ReadInitialData(data);
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity)
	{
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		ClientTeamsData.SetRoundFinishedData(roundFinishedData);
		ClientTeamsData.StartTimers();
	}
	
}
