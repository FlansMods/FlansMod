package com.flansmod.common.teams;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeChunkManager.Ticket;

import com.flansmod.common.FlansMod;

public class TeamsMap
{
	public String shortName;
	public String name;
	public Ticket chunkLoadingTicket;
	public ArrayList<ITeamBase> bases = new ArrayList<>();
	public int minPlayers = 0, maxPlayers = 1000000;
	public ArrayList<PermanentBaseData> permanentBaseData = new ArrayList<>();
	
	public TeamsMap(World world, String sn, String n)
	{
		shortName = sn;
		name = n;
	}
	
	public ArrayList<ITeamBase> getBasesPerTeam(int teamID)
	{
		ArrayList<ITeamBase> basesForThisTeam = new ArrayList<>();
		for(ITeamBase base : bases)
		{
			if(base.getOwnerID() == teamID)
				basesForThisTeam.add(base);
		}
		return basesForThisTeam;
	}
	
	public void getValidSpawnPoints(int teamID, List<BlockPos> validSpawnPoints)
	{
		for(PermanentBaseData data : permanentBaseData)
		{
			if(data.teamID == teamID)
			{
				validSpawnPoints.addAll(data.spawnPoints);
			}
		}
	}
	
	public void addBase(ITeamBase base)
	{
		bases.add(base);
		PermanentBaseData data = getPermanentData(base);
		if(data == null)
		{
			data = new PermanentBaseData();
			
			permanentBaseData.add(data);
		}
		
		data.baseID = base.getBaseID();
		data.teamID = base.getDefaultOwnerID();
		data.spawnPoints.clear();
		for(ITeamObject object : base.getObjects())
		{
			if(object.isSpawnPoint())
				data.spawnPoints.add(new BlockPos(object.getPosX(), object.getPosY(), object.getPosZ()));
		}
	}
	
	private PermanentBaseData getPermanentData(ITeamBase base)
	{
		for(PermanentBaseData data : permanentBaseData)
		{
			if(data.baseID == base.getBaseID())
				return data;
		}
		return null;
	}
	
	public void addBaseFirstTime(ITeamBase base)
	{
		addBase(base);
	}
	
	public void removeBase(ITeamBase base)
	{
		if(bases == null)
		{
			FlansMod.log.warn("Base array for map " + name + " null");
			return;
		}
		bases.remove(base);
		for(int i = permanentBaseData.size() - 1; i >= 0; i--)
		{
			if(permanentBaseData.get(i).baseID == base.getBaseID())
			{
				permanentBaseData.remove(i);
				return;
			}
		}
	}
	
	public void addObject(ITeamBase base, ITeamObject object)
	{
		if(object.isSpawnPoint())
		{
			PermanentBaseData data = getPermanentData(base);
			if(data != null)
			{
				data.addObject(object);
			}
		}
	}
	
	public void addObjectFirstTime(ITeamBase base, ITeamObject object)
	{
	}
	
	public TeamsMap(World world, NBTTagCompound tags)
	{
		shortName = tags.getString("ShortName");
		name = tags.getString("Name");
		minPlayers = tags.getInteger("MinPlayers");
		maxPlayers = tags.getInteger("MaxPlayers");
		
		int iNumBases = tags.getInteger("NumBases");
		for(int i = 0; i < iNumBases; i++)
		{
			PermanentBaseData data = new PermanentBaseData();
			data.readBaseFromNBT(tags.getCompoundTag("Base_" + i));
			permanentBaseData.add(data);
		}
	}
	
	public void writeToNBT(NBTTagCompound tags)
	{
		tags.setString("ShortName", shortName);
		tags.setString("Name", name);
		tags.setInteger("MinPlayers", minPlayers);
		tags.setInteger("MaxPlayers", maxPlayers);
		tags.setInteger("NumBases", permanentBaseData.size());
		for(int i = 0; i < permanentBaseData.size(); i++)
		{
			NBTTagCompound baseTags = new NBTTagCompound();
			permanentBaseData.get(i).writeBaseToNBT(baseTags);
			tags.setTag("Base_" + i, baseTags);
		}
	}
}
