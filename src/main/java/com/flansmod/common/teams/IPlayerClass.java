package com.flansmod.common.teams;

import java.util.List;

import net.minecraft.item.ItemStack;

public interface IPlayerClass
{
	public List<ItemStack> GetStartingItems();
	
	public boolean GetHorse();
	
	public ItemStack GetHat();
	
	public ItemStack GetChest();
	
	public ItemStack GetLegs();
	
	public ItemStack GetShoes();
	
	public String GetName();
	
	public String GetShortName();
}
