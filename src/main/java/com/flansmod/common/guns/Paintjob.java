package com.flansmod.common.guns;

import net.minecraft.item.ItemStack;

public class Paintjob 
{
	public String iconName;
	public String textureName;
	public ItemStack[] dyesNeeded;
	public int ID;
	
	public Paintjob(int id, String iconName, String textureName, ItemStack[] dyesNeeded)
	{
		this.ID = id;
		this.iconName = iconName;
		this.textureName = textureName;
		this.dyesNeeded = dyesNeeded;
	}
}
