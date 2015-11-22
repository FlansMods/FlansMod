package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.client.gui.GuiTeamSelect;
import com.flansmod.common.FlansMod;
import com.flansmod.common.teams.PlayerClass;
import com.flansmod.common.teams.Team;
import com.flansmod.common.teams.TeamsManager;

public class PacketTeamSelect extends PacketBase 
{
	public boolean selectionPacket = false;
	public String selection;
	public boolean classChoicesPacket = false;
	public Team[] teams;
	public PlayerClass[] playerClasses;
	/** If true, then this packet simply updates the available choices, rather than forcing the player to choose */
	public boolean info = false;
	
	public PacketTeamSelect() {}
	
	public PacketTeamSelect(Team[] t, boolean i)
	{
		selectionPacket = false;
		classChoicesPacket = false;
		teams = t;
		info = i;
	}

	public PacketTeamSelect(Team[] t)
	{
		this(t, false);
	}
	
	public PacketTeamSelect(PlayerClass[] c)
	{
		selectionPacket = false;
		classChoicesPacket = true;
		playerClasses = c;
	}
		
	public PacketTeamSelect(String shortName, boolean classPacket)
	{
		selectionPacket = true;
		classChoicesPacket = classPacket;
		selection = shortName;
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeBoolean(selectionPacket);
		data.writeBoolean(classChoicesPacket);
		data.writeBoolean(info);

		//If it is a selection packet, then we need only send the selection
		if(selectionPacket)
		{
			writeUTF(data, selection);
		}
		//Otherwise, we must send the full list of teams or classes on offer
		else
		{
			if(classChoicesPacket)
			{
		    	data.writeByte(playerClasses.length);
				for (PlayerClass playerClass : playerClasses) {
					writeUTF(data, playerClass.shortName);
				}
			}
			else
			{
		    	data.writeByte(teams.length);
				for (Team team : teams) {
					writeUTF(data, team == null ? "null" : team.shortName);
				}
			}
		}
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		selectionPacket = data.readBoolean();
		classChoicesPacket = data.readBoolean();
		info = data.readBoolean();
		
		if(selectionPacket)
		{
			selection = readUTF(data);
		}
		else
		{
			if(classChoicesPacket)
			{
				byte numClasses = data.readByte();
				playerClasses = new PlayerClass[numClasses];
				for(int i = 0; i < numClasses; i++)
				{
					playerClasses[i] = PlayerClass.getClass(readUTF(data));
				}
			}
			else
			{
				byte numTeams = data.readByte();
				teams = new Team[numTeams];
				for(int i = 0; i < numTeams; i++)
				{
					teams[i] = Team.getTeam(readUTF(data));
				}
			}
		}
	}

	/** Handle player responses to team / class selection packets */
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		if(!selectionPacket)
		{
			FlansMod.log("Class / Team listing packet received on server. Rejecting.");
			return;
		}
		if(classChoicesPacket)
		{
			TeamsManager.getInstance().playerSelectedClass(playerEntity, selection);
		}
		else
		{
			TeamsManager.getInstance().playerSelectedTeam(playerEntity, selection);
		}
	}

	/** Handle a request from the server to display a team / class selection window */
	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{		
		if(selectionPacket)
		{
			FlansMod.log("Class / Team selection packet received on client. Rejecting.");
			return;
		}
		if(classChoicesPacket)
		{
			Minecraft.getMinecraft().displayGuiScreen(new GuiTeamSelect(playerClasses));
		}
		else if(info)
		{
			GuiTeamSelect.teamChoices = teams;
		}
		else Minecraft.getMinecraft().displayGuiScreen(new GuiTeamSelect(teams));
	}
}
