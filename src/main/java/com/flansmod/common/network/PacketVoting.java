package com.flansmod.common.network;

import com.flansmod.client.gui.GuiVoting;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.teams.TeamsRound;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketVoting extends PacketBase 
{
	/** Client side only */
	@SideOnly(Side.CLIENT)
	public ClientTeamsRound[] clientOptions;
	
	/** Server side options */
	public TeamsRound[] options;
	public int[] numVotes;
	public int timeLeft;
	
	public PacketVoting()
	{
		
	}
			
	public PacketVoting(TeamsManager tm)
	{
		options = tm.voteOptions;
		numVotes = new int[options.length];
		for(PlayerData data : PlayerHandler.serverSideData.values())
		{
			if(data.vote > 0)
				numVotes[data.vote - 1]++;
		}
		timeLeft = tm.interRoundTimeLeft;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeByte(options.length);
		for(int i = 0; i < options.length; i++)
		{
			writeUTF(data, options[i].gametype.shortName);
			writeUTF(data, options[i].map.name);
			writeUTF(data, options[i].teams[0].textColour + options[i].teams[0].name);
			writeUTF(data, options[i].teams[1].textColour + options[i].teams[1].name);
			data.writeByte(numVotes[i]);
		}
		data.writeInt(timeLeft);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		int numOptions = data.readByte();
		clientOptions = new ClientTeamsRound[numOptions];
		numVotes = new int[numOptions];
		for(int i = 0; i < numOptions; i++)
		{
			clientOptions[i] = new ClientTeamsRound(readUTF(data), readUTF(data), readUTF(data), readUTF(data));
			numVotes[i] = data.readByte();
		}
		timeLeft = data.readInt();
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
		if(!(Minecraft.getMinecraft().currentScreen instanceof GuiVoting))
			Minecraft.getMinecraft().displayGuiScreen(new GuiVoting(this));
		else GuiVoting.packet = this;
	}

	public class ClientTeamsRound
	{
		public String mapName;
		public String gametype;
		public String[] teamNames;
		
		public ClientTeamsRound(String s, String s1, String s2, String s3)
		{
			gametype = s;
			mapName = s1;
			teamNames = new String[2];
			teamNames[0] = s2;
			teamNames[1] = s3;
		}
	}
}
