package com.flansmod.common.teams;

import io.netty.buffer.ByteBuf;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.network.ByteBufUtils;

import com.flansmod.client.gui.teams.EnumLoadoutSlot;
import com.flansmod.common.types.InfoType;

public class PlayerLoadout 
{
	public ItemStack[] slots;
	
	public PlayerLoadout()
	{
		slots = new ItemStack[EnumLoadoutSlot.values().length];
	}
	
	public PlayerLoadout copy()
	{
		PlayerLoadout copy = new PlayerLoadout();
		for(int i = 0; i < EnumLoadoutSlot.values().length; i++)
		{
			copy.slots[i] = slots[i] == null ? null : slots[i].copy();
		}
		return copy;
	}

	public void writeToBuf(ByteBuf data) 
	{
		for(int i = 0; i < EnumLoadoutSlot.values().length; i++)
		{
			ByteBufUtils.writeItemStack(data, slots[i]);
		}
	}

	public void readFromBuf(ByteBuf data) 
	{
		for(int i = 0; i < EnumLoadoutSlot.values().length; i++)
		{
			slots[i] = ByteBufUtils.readItemStack(data);
		}
	}

	public void readFromNBT(NBTTagCompound tags) 
	{
		for(int i = 0; i < EnumLoadoutSlot.values().length; i++)
		{
			slots[i] = ItemStack.loadItemStackFromNBT(tags.getCompoundTag("slot_" + i));
		}
	}

	public void writeToNBT(NBTTagCompound tags) 
	{
		for(int i = 0; i < EnumLoadoutSlot.values().length; i++)
		{
			if(slots[i] != null)
			{
				NBTTagCompound stackTags = new NBTTagCompound();
				slots[i].writeToNBT(stackTags);
				tags.setTag("slot_" + i, stackTags);
			}
		}	
	}
}
