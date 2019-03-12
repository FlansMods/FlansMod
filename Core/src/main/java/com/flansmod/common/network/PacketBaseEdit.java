package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.client.gui.teams.GuiBaseEditor;
import com.flansmod.common.FlansMod;
import com.flansmod.common.teams.ITeamBase;
import com.flansmod.common.teams.TeamsManager;

/**
 * Packet for the base settings GUI
 * Server to client gives information for the GUI
 * Client to server returns changes
 */
public class PacketBaseEdit extends PacketBase
{
	public int baseID;
	public String baseName;
	/**
	 * The maps available
	 */
	public String[] maps;
	/**
	 * The map this base is part of, using the index in the above array
	 */
	public int mapID;
	/**
	 * Team ID, 0 = No Team, 1 = Spectator, 2 = Team 1, 3 = Team 2
	 */
	public int teamID;
	/**
	 * If the server receives a packet with this flag, the base will be destroyed
	 */
	public boolean destroy;
	
	public PacketBaseEdit()
	{
	}
	
	/**
	 * Server to client packet
	 */
	public PacketBaseEdit(int baseID, String baseName, String[] maps, int mapID, int teamID)
	{
		this(baseID, baseName, maps, mapID, teamID, false);
	}
	
	/**
	 * Client to server packet
	 */
	public PacketBaseEdit(int baseID, String baseName, String[] maps, int mapID, int teamID, boolean destroy)
	{
		this.baseID = baseID;
		this.baseName = baseName;
		this.maps = maps;
		this.mapID = mapID;
		this.teamID = teamID;
		this.destroy = destroy;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		data.writeInt(baseID);
		writeUTF(data, baseName);
		data.writeInt(maps.length);
		for(String map : maps) writeUTF(data, map);
		
		data.writeInt(mapID);
		data.writeByte((byte)teamID);
		data.writeBoolean(destroy);
	}
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		baseID = data.readInt();
		baseName = readUTF(data);
		int mapsLength = data.readInt();
		maps = new String[mapsLength];
		for(int i = 0; i < mapsLength; i++)
			maps[i] = readUTF(data);
		mapID = data.readInt();
		teamID = data.readByte();
		destroy = data.readBoolean();
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity)
	{
		//Do another op check
		if(!FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().canSendCommands(playerEntity.getGameProfile()))
			return;
		
		//Find the base and change its attributes (or destroy it)
		ITeamBase base = TeamsManager.getInstance().getBase(baseID);
		if(destroy)
		{
			base.destroy();
			return;
		}
		base.setDefaultOwnerID(teamID);
		base.setOwnerID(teamID);
		if(mapID != -1)
			base.setMapFirstTime(TeamsManager.getInstance().getMapFromFullName(maps[mapID]));
		base.setBaseName(baseName);
		
		FlansMod.log.info(playerEntity.getName() + " modified attributes of base " + baseID);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		Minecraft.getMinecraft().displayGuiScreen(new GuiBaseEditor(this));
	}
}
