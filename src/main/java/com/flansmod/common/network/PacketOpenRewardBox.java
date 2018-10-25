package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.client.teams.ClientTeamsData;
import com.flansmod.common.FlansMod;
import com.flansmod.common.teams.RewardBox;
import com.flansmod.common.teams.TeamsManagerRanked;

public class PacketOpenRewardBox extends PacketBase
{
	public int boxHash = 0;
	public int unlockHash = 0;
	
	public PacketOpenRewardBox()
	{
	}
	
	/**
	 * Server to client reward request packet
	 */
	public PacketOpenRewardBox(RewardBox box)
	{
		boxHash = box.hashCode();
	}
	
	public PacketOpenRewardBox(int box, int unlock)
	{
		boxHash = box;
		unlockHash = unlock;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		data.writeInt(boxHash);
		data.writeInt(unlockHash);
	}
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		boxHash = data.readInt();
		unlockHash = data.readInt();
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity)
	{
		RewardBox box = RewardBox.GetRewardBox(boxHash);
		if(box == null)
		{
			FlansMod.Assert(false, "Recieved invalid reward box open packet from player " + playerEntity.getDisplayNameString());
		}
		else
		{
			FlansMod.log.info("Recieved reward box open packet from player " + playerEntity.getDisplayNameString() + " for box " + box.shortName);
			TeamsManagerRanked.OpenRewardBox(playerEntity, box);
		}
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		ClientTeamsData.UnlockReward(boxHash, unlockHash);
	}
}
