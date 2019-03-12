package com.flansmod.common.guns;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.flansmod.common.FlansMod;

/**
 * Adds access to the InventoryPlayer stack combination methods for arbitrary inventories
 */
public class InventoryHelper
{
	public static boolean addItemStackToInventory(IInventory inventory, ItemStack stack, boolean creative)
	{
		if(stack == null || stack.isEmpty())
			return false;
		else if(stack.getCount() == 0)
			return false;
		else
		{
			try
			{
				int i;
				
				if(stack.isItemDamaged())
				{
					i = getFirstEmptyStack(inventory);
					
					if(i >= 0)
					{
						ItemStack stackToAdd = stack.copy();
						stackToAdd.setAnimationsToGo(5);
						inventory.setInventorySlotContents(i, stackToAdd);
						stack.setCount(0);
						return true;
					}
					else if(creative)
					{
						stack.setCount(0);
						return true;
					}
					return false;
				}
				else
				{
					do
					{
						i = stack.getCount();
						stack.setCount(storePartialItemStack(inventory, stack));
					}
					while(stack.getCount() > 0 && stack.getCount() < i);
					
					if(stack.getCount() == i && creative)
					{
						stack.setCount(0);
						return true;
					}
					else
					{
						return stack.getCount() < i;
					}
				}
			}
			catch(Throwable throwable)
			{
				FlansMod.log.throwing(throwable);
				return false;
			}
		}
	}
	
	public static int storeItemStack(IInventory inventory, ItemStack stack)
	{
		for(int i = 0; i < inventory.getSizeInventory(); ++i)
		{
			ItemStack oldStack = inventory.getStackInSlot(i);
			if(oldStack != null && !oldStack.isEmpty() && oldStack.getItem() == stack.getItem() && oldStack.isStackable() &&
					oldStack.getCount() < oldStack.getMaxStackSize() && oldStack.getCount() < inventory.getInventoryStackLimit() &&
					(!oldStack.getHasSubtypes() || oldStack.getItemDamage() == stack.getItemDamage()) && ItemStack.areItemStackTagsEqual(oldStack, stack))
			{
				return i;
			}
		}
		
		return -1;
	}
	
	public static int storePartialItemStack(IInventory inventory, ItemStack stack)
	{
		Item item = stack.getItem();
		int j = stack.getCount();
		int k;
		
		//If the item doesn't stack, just find an empty slot for it
		if(stack.getMaxStackSize() == 1)
		{
			k = getFirstEmptyStack(inventory);
			//If it is impossible, return
			if(k < 0)
			{
				return j;
			}
			else
			{
				if(inventory.getStackInSlot(k) == null || inventory.getStackInSlot(k).isEmpty())
				{
					inventory.setInventorySlotContents(k, stack.copy());
				}
				return 0;
			}
		}
		else
		{
			k = storeItemStack(inventory, stack);
			if(k < 0)
			{
				k = getFirstEmptyStack(inventory);
			}
			
			if(k < 0)
			{
				return j;
			}
			else
			{
				ItemStack oldStack = inventory.getStackInSlot(k);
				
				if(oldStack == null || oldStack.isEmpty())
				{
					oldStack = new ItemStack(item, 0, stack.getItemDamage());
					if(stack.hasTagCompound())
						oldStack.setTagCompound(stack.getTagCompound().copy());
					inventory.setInventorySlotContents(k, oldStack);
				}
				
				int l = j;
				
				if(j > oldStack.getMaxStackSize() - oldStack.getCount())
				{
					l = oldStack.getMaxStackSize() - oldStack.getCount();
				}
				
				if(l > inventory.getInventoryStackLimit() - oldStack.getCount())
				{
					l = inventory.getInventoryStackLimit() - oldStack.getCount();
				}
				
				if(l == 0)
				{
					return j;
				}
				else
				{
					j -= l;
					oldStack.setCount(oldStack.getCount() + l);
					oldStack.setAnimationsToGo(5);
					return j;
				}
			}
		}
	}
	
	/**
	 * Method from InventoryPlayer
	 */
	public static int getFirstEmptyStack(IInventory inventory)
	{
		for(int i = 0; i < inventory.getSizeInventory(); ++i)
			if(inventory.getStackInSlot(i) == null || inventory.getStackInSlot(i).isEmpty())
				return i;
		
		return -1;
	}
	
}
