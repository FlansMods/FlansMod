package com.flansmod.common.guns;

import com.flansmod.common.types.PaintableType;

import net.minecraft.item.ItemStack;

public class Paintjob 
{
	public PaintableType parent;
	public String iconName;
	public String textureName;
	public ItemStack[] dyesNeeded;
	public int ID;
	
	public Paintjob(PaintableType parent, int id, String iconName, String textureName, ItemStack[] dyesNeeded)
	{
		this.parent = parent;
		this.ID = id;
		this.iconName = iconName;
		this.textureName = textureName;
		this.dyesNeeded = dyesNeeded;
	}
}
