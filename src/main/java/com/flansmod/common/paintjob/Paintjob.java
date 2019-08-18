package com.flansmod.common.paintjob;

import net.minecraft.item.ItemStack;

public class Paintjob 
{
	public int ID;
	public String displayName;
	public String iconName;
	public String textureName;
	public ItemStack[] dyesNeeded;
	
	public Paintjob(int id, String iconName, String textureName, ItemStack[] dyesNeeded)
	{
		this(id, "", iconName, textureName, dyesNeeded);
	}

	public Paintjob(int id, String displayName, String iconName, String textureName, ItemStack[] dyesNeeded)
	{
		this.ID = id;
		this.displayName = displayName;
		this.iconName = iconName;
		this.textureName = textureName;
		this.dyesNeeded = dyesNeeded;
	}
}
