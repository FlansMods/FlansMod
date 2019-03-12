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
	
	/**
	 * The second IInventory is an empty one to copy into
	 */
	public CraftingInstance(IInventory i, List<ItemStack> in, List<ItemStack> out)
	{
		inventory = i;
		requiredStacks = in;
		outputStacks = out;
	}
	
	public CraftingInstance(IInventory i, ArrayList<ItemStack> in, ItemStack out)
	{
		this(i, in, Arrays.asList(out));
	}
	
	public boolean canCraft()
	{
		craftingSuccessful = true;
		for(ItemStack check : requiredStacks)
		{
			int numMatchingStuff = 0;
			for(int j = 0; j < inventory.getSizeInventory(); j++)
			{
				ItemStack stack = inventory.getStackInSlot(j);
				if(stack != null && !stack.isEmpty() && stack.getItem() == check.getItem() && stack.getItemDamage() == check.getItemDamage())
				{
					numMatchingStuff += stack.getCount();
				}
			}
			if(numMatchingStuff < check.getCount())
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
			int amountLeft = remove.getCount();
			for(int j = 0; j < inventory.getSizeInventory(); j++)
			{
				ItemStack stack = inventory.getStackInSlot(j);
				if(amountLeft > 0 && stack != null && !stack.isEmpty() && stack.getItem() == remove.getItem() && stack.getItemDamage() == remove.getItemDamage())
				{
					amountLeft -= inventory.decrStackSize(j, amountLeft).getCount();
				}
			}
		}
		
		for(ItemStack stack : outputStacks)
			if(!player.inventory.addItemStackToInventory(stack))
				player.dropItem(stack, false);
	}
}
