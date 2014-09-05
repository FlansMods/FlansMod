package com.flansmod.common.teams;

import java.util.ArrayList;

import com.flansmod.common.FlansMod;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.common.ForgeChunkManager.Ticket;
import net.minecraftforge.common.ForgeChunkManager.Type;

public class TeamsMap 
{
	public String shortName;
	public String name;
	public Ticket chunkLoadingTicket;
	public ArrayList<ITeamBase> bases = new ArrayList<ITeamBase>();
	public int minPlayers = 0, maxPlayers = 1000000;
		
	public TeamsMap(World world, String sn, String n)
	{
		shortName = sn;
		name = n;
		
		//Ask Forge for a chunk loading ticket
		chunkLoadingTicket = ForgeChunkManager.requestTicket(FlansMod.INSTANCE, world, Type.NORMAL);
		if(chunkLoadingTicket == null)
		{
			FlansMod.log("Failed to add chunk loading ticket as Flan's Mod has run out");
			return;
		}
		//We give the ticket some information so that when we receive the ticket later, we can pass it back to this map
		chunkLoadingTicket.getModData().setString("ShortName", shortName);
	}
	
	public ArrayList<ITeamBase> getBasesPerTeam(int teamID)
	{
		ArrayList<ITeamBase> basesForThisTeam = new ArrayList<ITeamBase>();
		for(ITeamBase base : bases)
		{
			if(base.getOwnerID() == teamID)
				basesForThisTeam.add(base);
		}
		return basesForThisTeam;
	}
	
	public void addBase(ITeamBase base)
	{
		bases.add(base);
		
	}
	
	public void addBaseFirstTime(ITeamBase base)
	{
		addBase(base);
		//Add the chunk this base is in to our chunk loading ticket
		ForgeChunkManager.forceChunk(chunkLoadingTicket, new ChunkCoordIntPair((int)base.getPosX() >> 4, (int)base.getPosZ() >> 4));
		FlansMod.log("Added chunk at " + ((int)base.getPosX() >> 4) + ",  " + ((int)base.getPosZ() >> 4) + " to chunk loading ticket for base " + name );
	}
	
	public void removeBase(ITeamBase base)
	{
		if(bases == null)
		{
			FlansMod.log("Base array for map " + name + " null");
			return;
		}
		bases.remove(base);
		//Remove the chunk from the chunk loading ticket
		ForgeChunkManager.unforceChunk(chunkLoadingTicket, new ChunkCoordIntPair((int)base.getPosX() >> 4, (int)base.getPosZ() >> 4));
		FlansMod.log("Removed chunk at " + ((int)base.getPosX() >> 4) + ",  " + ((int)base.getPosZ() >> 4) + " from chunk loading ticket for base " + name );
	}
	
	public void addObject(ITeamObject object)
	{
	}
	
	public void addObjectFirstTime(ITeamObject object)
	{
		//Add the chunk this object is in to our chunk loading ticket
		if(object.forceChunkLoading())
			ForgeChunkManager.forceChunk(chunkLoadingTicket, new ChunkCoordIntPair((int)object.getPosX() >> 4, (int)object.getPosZ() >> 4));
	}
	
	public TeamsMap(World world, NBTTagCompound tags)
	{
		shortName = tags.getString("ShortName");
		name = tags.getString("Name");
		minPlayers = tags.getInteger("MinPlayers");
		maxPlayers = tags.getInteger("MaxPlayers");
	}
	
	public void writeToNBT(NBTTagCompound tags)
	{
		tags.setString("ShortName", shortName);
		tags.setString("Name", name);
		tags.setInteger("MinPlayers", minPlayers);
		tags.setInteger("MaxPlayers", maxPlayers);
	}

	//Called by the chunk loading callback handler. Upon loading a world, the chunk loading positions
	//for this map are handed to this method and this method loads the required chunks
	public void forceChunkLoading(Ticket ticket) 
	{
		for (ChunkCoordIntPair coord : ticket.getChunkList()) 
		{
			FlansMod.log("Loading chunk at " + coord.chunkXPos + ", " + coord.chunkZPos + " for map : " + name);
			ForgeChunkManager.forceChunk(ticket, coord);
		}
	}
	
	public void deleteMap()
	{
		ForgeChunkManager.releaseTicket(chunkLoadingTicket);
	}
}
