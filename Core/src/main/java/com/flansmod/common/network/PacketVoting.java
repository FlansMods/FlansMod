package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.client.teams.ClientTeamsData;
import com.flansmod.common.FlansMod;
import com.flansmod.common.teams.RoundFinishedData;

public class PacketVoting extends PacketBase
{
	public RoundFinishedData roundFinishedData = new RoundFinishedData();
	
	public PacketVoting()
	{
		
	}
	
	public PacketVoting(RoundFinishedData data)
	{
		roundFinishedData = data;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		roundFinishedData.WriteNumVotesUpdate(data);
	}
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		roundFinishedData.ReadNumVotesUpdate(data);
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity)
	{
		FlansMod.log.warn("Received vote info packet on server. Rejecting.");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		ClientTeamsData.UpdateNumVotes(roundFinishedData);
	}
}
