package com.flansmod.common.network;

import com.flansmod.client.teams.ClientTeamsData;
import com.flansmod.common.FlansMod;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PacketRankUpdate extends PacketBase 
{
	public int pendingXP;
	public int resultantXP;
	public int resultantLevel;
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeInt(pendingXP);
		data.writeInt(resultantXP);
		data.writeInt(resultantLevel);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		pendingXP = data.readInt();
		resultantXP = data.readInt();
		resultantLevel = data.readInt();
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		FlansMod.Assert(false, "Received rank update on server");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		ClientTeamsData.HandleRankUpdate(pendingXP, resultantXP, resultantLevel);
	}

}
