package com.flansmod.common.teams;

import net.minecraft.nbt.NBTTagCompound;
import io.netty.buffer.ByteBuf;

public class PlayerRankData 
{
	// XP gained this round, to be applied at the end of the round
	public int pendingXP = 0;
	
	// Current effective XP and level
	public int currentXP = 0;
	public int currentLevel = 0;
	
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
	}

	public void readFromBuf(ByteBuf data) 
	{
		currentLevel = data.readInt();
		currentXP = data.readInt();
		
		for(int i = 0; i < 5; i++)
		{
			loadouts[i].readFromBuf(data);
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
	}

	public void AddXP(int amount) 
	{
		pendingXP += amount;
	}
}
