package com.flansmod.common.teams;

import java.util.ArrayList;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.flansmod.client.gui.teams.EnumLoadoutSlot;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.Paintjob;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

public class LoadoutPool extends InfoType 
{	
	public static ArrayList<LoadoutPool> pools = new ArrayList<LoadoutPool>();
	
	public static class LoadoutEntry
	{
		public int unlockLevel = 0;
		public boolean available = false;
	}
	
	// Used in GUI only
	public static class LoadoutEntryPaintjob extends LoadoutEntry
	{
		public Paintjob paintjob = null;
	}
	
	// Used in the type file
	public static class LoadoutEntryInfoType extends LoadoutEntry
	{
		public InfoType type = null;
	}
	
	public int maxLevel = 20;
	public int[] XPPerLevel;
	public int XPForKill = 10;
	public ArrayList<LoadoutEntryInfoType>[] unlocks;
	public PlayerLoadout[] defaultLoadouts = new PlayerLoadout[5];
	
	public int[] slotUnlockLevels = new int[] { 0, 0, 5, 10, 20 };
	
	public LoadoutPool(TypeFile file) 
	{
		super(file);
		pools.add(this);
		
		unlocks = new ArrayList[EnumLoadoutSlot.values().length];
		for(int i = 0; i < EnumLoadoutSlot.values().length; i++)
		{
			unlocks[i] = new ArrayList<LoadoutEntryInfoType>();
		}
		
		for(int i = 0; i < 5; i++)
		{
			defaultLoadouts[i] = new PlayerLoadout();
		}
	}

	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		
		XPForKill = Read(split, "XPForKill", XPForKill);
		
		if (KeyMatches(split, "MaxLevel"))
		{
			maxLevel = Integer.parseInt(split[1]);
			XPPerLevel = new int[maxLevel];
			for(int i = 0; i < maxLevel; i++)
			{
				XPPerLevel[i] = 1000 * i;
			}
		}
		else if(KeyMatches(split, "XPPerLevel"))
		{
			for(int i = 0; i < maxLevel; i++)
			{
				if(i + 1 < split.length)
				{
					XPPerLevel[i] = Integer.parseInt(split[i + 1]);
				}
			}
		}
		else if(KeyMatches(split, "AddPrimary"))
		{
			LoadoutEntryInfoType entry = new LoadoutEntryInfoType();
			
			entry.type = InfoType.getType(split[1]);
			entry.unlockLevel = Integer.parseInt(split[2]);
			
			if(entry.type != null)
			{ 
				unlocks[EnumLoadoutSlot.primary.ordinal()].add(entry);
			}
			else
			{
				FlansMod.log("Entry with no InfoType: " + split[1]);
			}
		}
		else if(KeyMatches(split, "AddSecondary"))
		{
			LoadoutEntryInfoType entry = new LoadoutEntryInfoType();
			
			entry.type = InfoType.getType(split[1]);
			entry.unlockLevel = Integer.parseInt(split[2]);
			
			if(entry.type != null)
			{ 
				unlocks[EnumLoadoutSlot.secondary.ordinal()].add(entry);
			}
			else
			{
				FlansMod.log("Entry with no InfoType: " + split[1]);
			}
		}
		else if(KeyMatches(split, "SlotUnlockLevels"))
		{
			for(int i = 0; i < 5; i++)
			{
				slotUnlockLevels[i] = Integer.parseInt(split[i + 1]);
			}
		}
		else if(KeyMatches(split, "DefaultLoadout"))
		{
			int index = Integer.parseInt(split[1]) - 1;
			
			for(int i = 0; i < EnumLoadoutSlot.values().length; i++)
			{
				if(2 + i < split.length)
				{
					defaultLoadouts[index].slots[i] = new ItemStack(InfoType.getType(split[2 + i]).getItem());
				}
			}
		}
	}
	
	public static LoadoutPool GetPool(String s)
	{
		for(LoadoutPool pool : pools)
		{
			if(pool.shortName.equals(s))
			{
				return pool;
			}
		}
		return null;
	}
	public static LoadoutPool GetPool(int iHash)
	{
		for(LoadoutPool pool : pools)
		{
			if(pool.shortName.hashCode() == iHash)
			{
				return pool;
			}
		}
		return null;
	}
}
