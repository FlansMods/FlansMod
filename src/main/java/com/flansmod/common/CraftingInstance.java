package com.flansmod.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class CraftingInstance 
{
	//Input fields
	public IInventory inventory;
	public List<ItemStack> requiredStacks;
	public List<ItemStack> outputStacks;	
	
	//Output fields
	public boolean craftingSuccessful;
	
	/** The second IInventory is an empty one to copy into */
	public CraftingInstance(IInventory i, List<ItemStack> in, List<ItemStack> out)
	{
		inventory = i;
		requiredStacks = in;
		outputStacks = out;
	}
	
	public CraftingInstance(IInventory i, ArrayList<ItemStack> in, ItemStack out) 
	{
		this(i, in, Arrays.asList(new ItemStack[] { out } ));
	}

	public boolean canCraft()
	{
		craftingSuccessful = true;
		for (ItemStack check : requiredStacks)
		{
			int numMatchingStuff = 0;
			for (int j = 0; j < inventory.getSizeInventory(); j++)
			{
				ItemStack stack = inventory.getStackInSlot(j);
				if (stack != null && stack.getItem() == check.getItem() && stack.getItemDamage() == check.getItemDamage())
				{
					numMatchingStuff += stack.stackSize;
				}
			}
			if (numMatchingStuff < check.stackSize)
			{
				craftingSuccessful = false;
			}
		}
		return craftingSuccessful;
	}
	
	public void craft(EntityPlayer player)
	{
		if(!craftingSuccessful)
			return;
		
		for(ItemStack remove : requiredStacks)
		{
			int amountLeft = remove.stackSize;
			for (int j = 0; j < inventory.getSizeInventory(); j++)
			{
				ItemStack stack = inventory.getStackInSlot(j);
				if (amountLeft > 0 && stack != null && stack.getItem() == remove.getItem() && stack.getItemDamage() == remove.getItemDamage())
				{
					amountLeft -= inventory.decrStackSize(j, amountLeft).stackSize;
				}
			}
		}
		
		for(ItemStack stack : outputStacks)
			if(!player.inventory.addItemStackToInventory(stack))
				player.dropPlayerItemWithRandomChoice(stack, false);
	}
}
