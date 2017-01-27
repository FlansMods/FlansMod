package com.flansmod.common.network;

import com.flansmod.client.gui.teams.GuiVoting;
import com.flansmod.client.teams.ClientTeamsData;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.teams.RoundFinishedData;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.teams.TeamsRound;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

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
		FlansMod.log("Received vote info packet on server. Rejecting.");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		ClientTeamsData.UpdateNumVotes(roundFinishedData);
	}
}
