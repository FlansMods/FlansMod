package com.flansmod.common.teams;

import java.util.ArrayList;

import io.netty.buffer.ByteBuf;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.network.ByteBufUtils;

import com.flansmod.client.gui.teams.EnumLoadoutSlot;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.Paintjob;
import com.flansmod.common.teams.LoadoutPool.LoadoutEntryInfoType;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;

public class PlayerLoadout
{
	public ItemStack[] slots;
	
	public PlayerLoadout()
	{
		slots = new ItemStack[EnumLoadoutSlot.values().length];
		for(int i = 0; i < EnumLoadoutSlot.values().length; i++)
		{
			slots[i] = ItemStack.EMPTY.copy();
		}
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
			slots[i] = new ItemStack(tags.getCompoundTag("slot_" + i));
			if(slots[i] == null)
				slots[i] = ItemStack.EMPTY.copy();
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
	
	public boolean Verify(int currentLevel, ArrayList<RewardBoxInstance> rewardBoxData)
	{
		LoadoutPool pool = TeamsManagerRanked.GetInstance().currentPool;
		if(pool == null)
			return false;
		
		for(int i = 0; i < EnumLoadoutSlot.values().length; i++)
		{
			ItemStack stack = slots[i];
			if(stack == null || !(stack.getItem() instanceof IFlanItem))
				continue;
			InfoType type = ((IFlanItem)stack.getItem()).getInfoType();
			switch(EnumLoadoutSlot.values()[i])
			{
				case primary:
				case secondary:
				{
					if(!VerifyType(type, pool.unlocks[i], currentLevel))
					{
						return false;
					}
					if(type instanceof GunType)
					{
						GunType gun = (GunType)type;
						if(!VerifyType(gun.getBarrel(stack), pool.unlocks[i], currentLevel)) return false;
						if(!VerifyType(gun.getScope(stack), pool.unlocks[i], currentLevel)) return false;
						if(!VerifyType(gun.getStock(stack), pool.unlocks[i], currentLevel)) return false;
						if(!VerifyType(gun.getGrip(stack), pool.unlocks[i], currentLevel)) return false;
						if(!VerifyType(gun.getGeneric(stack, 0), pool.unlocks[i], currentLevel)) return false;
						
						Paintjob paint = gun.getPaintjob(stack.getItemDamage());
						if(!VerifyPaint(paint, rewardBoxData)) return false;
					}
					break;
				}
				case armour:
				case melee:
				case special:
				{
					if(!VerifyType(type, pool.unlocks[i], currentLevel))
					{
						return false;
					}
					break;
				}
				
				default:
				{
					FlansMod.Assert(false, "Missing case in loadout verification");
					return false;
				}
			}
		}
		
		return true;
	}
	
	private boolean VerifyType(InfoType target, ArrayList<LoadoutEntryInfoType> list, int currentLevel)
	{
		if(target == null) return true;
		
		for(LoadoutEntryInfoType entry : list)
		{
			if(entry.type == target)
			{
				return entry.unlockLevel <= currentLevel;
			}
		}
		FlansMod.Assert(false, "Player put invalid item in slot " + target.shortName);
		return false;
	}
	
	private boolean VerifyPaint(Paintjob paint, ArrayList<RewardBoxInstance> rewardBoxData)
	{
		if(paint.ID == 0) return true;
		
		for(RewardBoxInstance box : rewardBoxData)
		{
			if(box.unlockHash == paint.hashCode())
			{
				return true;
			}
		}
		return false;
	}
}
