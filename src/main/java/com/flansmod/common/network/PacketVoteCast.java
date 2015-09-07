package com.flansmod.common.network;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.teams.TeamsManager;

import cpw.mods.fml.relauncher.Side;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketVoteCast extends PacketBase 
{
	public int vote;
	
	public PacketVoteCast()
	{}
	
	public PacketVoteCast(int vote)
	{
		this.vote = vote;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeByte(vote);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		vote = data.readByte();
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		if(vote < 0 || vote > TeamsManager.getInstance().voteOptions.length)
		{
			FlansMod.log("Invalid vote " + vote + " from " + playerEntity.getCommandSenderName());
			return;
		}
		PlayerData data = PlayerHandler.getPlayerData(playerEntity, Side.SERVER);
		data.vote = vote;
	}

	@Override
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		FlansMod.log("Received vote cast packet on client. Skipping.");
	}

}
