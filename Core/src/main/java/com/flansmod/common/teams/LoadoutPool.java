package com.flansmod.common.teams;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;

import com.flansmod.client.gui.teams.EnumLoadoutSlot;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.Paintjob;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

public class LoadoutPool extends InfoType
{
	public static ArrayList<LoadoutPool> pools = new ArrayList<>();
	
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
		
		public ArrayList<ItemStack> extraItems = new ArrayList<>(2);
	}
	
	public int maxLevel = 20;
	public int[] XPPerLevel;
	public int XPForKill = 10, XPForDeath = 5, XPForKillstreakBonus = 10;
	public ArrayList<LoadoutEntryInfoType>[] unlocks;
	public PlayerLoadout[] defaultLoadouts = new PlayerLoadout[5];
	public RewardBox[] rewardBoxes = new RewardBox[3];
	public ArrayList<RewardBox>[] rewardsPerLevel;
	
	public int[] slotUnlockLevels = new int[]{0, 0, 5, 10, 20};
	
	public LoadoutPool(TypeFile file)
	{
		super(file);
		pools.add(this);
		
		unlocks = new ArrayList[EnumLoadoutSlot.values().length];
		for(int i = 0; i < EnumLoadoutSlot.values().length; i++)
		{
			unlocks[i] = new ArrayList<>();
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
		XPForDeath = Read(split, "XPForDeath", XPForDeath);
		XPForKillstreakBonus = Read(split, "XPForKillstreakBonus", XPForKillstreakBonus);
		
		if(KeyMatches(split, "MaxLevel"))
		{
			maxLevel = Integer.parseInt(split[1]);
			XPPerLevel = new int[maxLevel];
			rewardsPerLevel = new ArrayList[maxLevel];
			for(int i = 0; i < maxLevel; i++)
			{
				XPPerLevel[i] = 10 * i;
				rewardsPerLevel[i] = new ArrayList<>();
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
		else if(ParseLoadoutEntry("AddPrimary", EnumLoadoutSlot.primary, split))
		{
		}
		else if(ParseLoadoutEntry("AddSecondary", EnumLoadoutSlot.secondary, split))
		{
		}
		else if(ParseLoadoutEntry("AddSpecial", EnumLoadoutSlot.special, split))
		{
		}
		else if(ParseLoadoutEntry("AddMelee", EnumLoadoutSlot.melee, split))
		{
		}
		else if(ParseLoadoutEntry("AddArmour", EnumLoadoutSlot.armour, split))
		{
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
					InfoType type = InfoType.getType(split[2 + i]);
					if(type == null)
					{
						FlansMod.Assert(false, "Invalid info type in loadout: " + split[2 + i]);
					}
					else defaultLoadouts[index].slots[i] = new ItemStack(type.getItem());
				}
			}
		}
		else if(KeyMatches(split, "AddRewardBox"))
		{
			boolean slotAvailable = false;
			for(int i = 0; i < 3; i++)
			{
				if(rewardBoxes[i] == null)
				{
					rewardBoxes[i] = RewardBox.GetRewardBox(split[1]);
					slotAvailable = true;
					break;
				}
			}
			FlansMod.Assert(slotAvailable, "Trying to insert more than 3 reward box types. No support for this yet");
		}
		else if(KeyMatches(split, "AddReward"))
		{
			RewardBox box = RewardBox.GetRewardBox(split[1]);
			boolean found = false;
			for(int i = 0; i < 3; i++)
			{
				if(box == rewardBoxes[i])
					found = true;
			}
			if(!found)
			{
				FlansMod.Assert(false, "Trying to give player reward box invalid for this loadout pool");
			}
			else
			{
				rewardsPerLevel[Integer.parseInt(split[2]) - 1].add(box);
			}
		}
	}
	
	private boolean ParseLoadoutEntry(String keyword, EnumLoadoutSlot slot, String[] split)
	{
		if(KeyMatches(split, keyword))
		{
			LoadoutEntryInfoType entry = new LoadoutEntryInfoType();
			
			entry.type = InfoType.getType(split[1]);
			entry.unlockLevel = Integer.parseInt(split[2]);
			int numAdditionalItems = (split.length - 3) / 2;
			for(int i = 0; i < numAdditionalItems; i++)
			{
				ItemStack stack = getNonRecipeElement(split[2 * i + 3]);
				if(stack == null || stack.isEmpty())
				{
					FlansMod.Assert(false, "Recipe item stack null");
				}
				else
				{
					stack.setCount(Integer.parseInt(split[2 * i + 4]));
					entry.extraItems.add(stack);
				}
			}
			
			if(entry.type != null)
			{
				unlocks[slot.ordinal()].add(entry);
			}
			else
			{
				FlansMod.log.warn("Entry with no InfoType: " + split[1]);
			}
			return true;
		}
		
		return false;
	}
	
	public int GetXPForLevel(int level)
	{
		if(level > 0 && level <= maxLevel)
		{
			return XPPerLevel[level - 1];
		}
		
		return -1;
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
	
	public LoadoutEntryInfoType GetLoadoutEntryForInfoType(int loadoutSlot, InfoType infoType)
	{
		for(LoadoutEntry entry : unlocks[loadoutSlot])
		{
			if(entry instanceof LoadoutEntryInfoType)
			{
				if(((LoadoutEntryInfoType)entry).type == infoType)
				{
					return (LoadoutEntryInfoType)entry;
				}
			}
		}
		return null;
	}
}
