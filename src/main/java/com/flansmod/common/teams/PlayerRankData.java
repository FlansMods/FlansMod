package com.flansmod.common.teams;

import java.util.ArrayList;

import io.netty.buffer.ByteBuf;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.PaintableType;

public class PlayerRankData
{
	// XP gained this round, to be applied at the end of the round
	public int pendingXP = 0;
	
	// Current effective XP and level
	public int currentXP = 0;
	public int currentLevel = 0;
	
	public int currentKillstreak = 0;
	public int bestKillstreak = 0;
	
	public ArrayList<RewardBoxInstance> rewardBoxData = new ArrayList<>();
	
	public PlayerLoadout[] loadouts = new PlayerLoadout[5];
	
	public PlayerRankData()
	{
		for(int i = 0; i < 5; i++)
		{
			loadouts[i] = new PlayerLoadout();
		}
	}
	
	public void writeToBuf(ByteBuf data)
	{
		data.writeInt(currentLevel);
		data.writeInt(currentXP);
		
		for(int i = 0; i < 5; i++)
		{
			loadouts[i].writeToBuf(data);
		}
		
		data.writeInt(rewardBoxData.size());
		for(RewardBoxInstance inst : rewardBoxData)
		{
			data.writeInt(inst.boxHash);
			
			if(!inst.Verify())
			{
				data.writeInt(0);
				FlansMod.Assert(false, "Invalid unlock data");
			}
			else
			{
				data.writeInt(inst.unlockHash);
			}
		}
	}
	
	public void readFromBuf(ByteBuf data)
	{
		currentLevel = data.readInt();
		currentXP = data.readInt();
		
		for(int i = 0; i < 5; i++)
		{
			loadouts[i].readFromBuf(data);
		}
		
		rewardBoxData.clear();
		int numRewardBoxes = data.readInt();
		for(int i = 0; i < numRewardBoxes; i++)
		{
			rewardBoxData.add(RewardBoxInstance.CreateClientRewardBoxInstance(data.readInt(), data.readInt()));
		}
	}
	
	public void readFromNBT(NBTTagCompound tags)
	{
		currentLevel = tags.getInteger("level");
		currentXP = tags.getInteger("XP");
		
		for(int i = 0; i < 5; i++)
		{
			loadouts[i].readFromNBT(tags.getCompoundTag("Slot_" + i));
		}
		
		NBTTagList rewardTags = tags.getTagList("rewardBoxes", 10); // 10 = CompoundTag
		if(rewardTags != null)
		{
			for(int i = 0; i < rewardTags.tagCount(); i++)
			{
				NBTTagCompound rewardInstanceTags = rewardTags.getCompoundTagAt(i);
				
				int type = rewardInstanceTags.getInteger("type");
				int boxHash = rewardInstanceTags.getInteger("boxHash");
				int unlockHash = rewardInstanceTags.getInteger("unlockHash");
				
				rewardBoxData.add(RewardBoxInstance.CreateRewardBoxInstanceFromNBT(boxHash, unlockHash, type));
			}
		}
	}
	
	public void writeToNBT(NBTTagCompound tags)
	{
		tags.setInteger("level", currentLevel);
		tags.setInteger("XP", currentXP);
		
		for(int i = 0; i < 5; i++)
		{
			NBTTagCompound slotTags = new NBTTagCompound();
			loadouts[i].writeToNBT(slotTags);
			tags.setTag("Slot_" + i, slotTags);
		}
		
		NBTTagList rewardTags = new NBTTagList();
		for(RewardBoxInstance instance : rewardBoxData)
		{
			NBTTagCompound rewardInstanceTags = new NBTTagCompound();
			rewardInstanceTags.setInteger("type", instance.origin.ordinal());
			rewardInstanceTags.setInteger("boxHash", instance.boxHash);
			rewardInstanceTags.setInteger("unlockHash", instance.unlockHash);
			rewardTags.appendTag(rewardInstanceTags);
		}
		
		tags.setTag("rewardBoxes", rewardTags);
	}
	
	public void AddXP(int amount)
	{
		pendingXP += amount;
	}
	
	public void AddToKillstreak()
	{
		currentKillstreak++;
		if(currentKillstreak > bestKillstreak)
		{
			bestKillstreak = currentKillstreak;
		}
	}
	
	public void ResetKillstreak()
	{
		currentKillstreak = 0;
	}
	
	public boolean OwnsUnlock(int unlockHash)
	{
		for(RewardBoxInstance instance : rewardBoxData)
		{
			if(instance.opened && instance.unlockHash == unlockHash)
			{
				return true;
			}
		}
		
		return false;
	}
	
	public int GetNumOfUnopenedBoxes(RewardBox box)
	{
		if(box == null)
		{
			return 0;
		}
		int num = 0;
		for(RewardBoxInstance instance : rewardBoxData)
		{
			if(!instance.opened && instance.boxHash == box.hashCode())
			{
				num++;
			}
		}
		return num;
	}
	
	public void AddRewardBoxInstance(RewardBoxInstance instance)
	{
		rewardBoxData.add(instance);
	}
	
	public int GetNumUnlocksForType(InfoType type)
	{
		int n = 0;
		if(type instanceof PaintableType)
		{
			for(RewardBoxInstance instance : rewardBoxData)
			{
				for(int i = 0; i < ((PaintableType)type).paintjobs.size(); i++)
				{
					if(instance.unlockHash == ((PaintableType)type).paintjobs.get(i).hashCode())
					{
						n++;
					}
				}
			}
		}
		return n;
	}
	
	public boolean VerifyLoadouts()
	{
		for(int i = 0; i < 5; i++)
		{
			LoadoutPool pool = TeamsManagerRanked.GetInstance().currentPool;
			if(pool != null && currentLevel >= pool.slotUnlockLevels[i])
			{
				if(!loadouts[i].Verify(currentLevel, rewardBoxData))
				{
					return false;
				}
			}
		}
		
		return true;
	}
}
