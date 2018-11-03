package com.flansmod.common.teams;

import java.util.List;

import net.minecraft.item.ItemStack;

public interface IPlayerClass
{
	List<ItemStack> GetStartingItems();
	
	boolean GetHorse();
	
	ItemStack GetHat();
	
	ItemStack GetChest();
	
	ItemStack GetLegs();
	
	ItemStack GetShoes();
	
	String GetName();
	
	String GetShortName();
}
