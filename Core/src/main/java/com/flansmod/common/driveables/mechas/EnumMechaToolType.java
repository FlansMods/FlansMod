package com.flansmod.common.driveables.mechas;

import net.minecraft.block.material.Material;

public enum EnumMechaToolType
{
	pickaxe, axe, shovel, shears, sword;
	
	public static EnumMechaToolType getToolType(String s)
	{
		for(EnumMechaToolType type : values())
		{
			if(type.toString().equals(s))
				return type;
		}
		return sword;
	}
	
	public boolean effectiveAgainst(Material material)
	{
		switch(this)
		{
			case pickaxe: return material == Material.IRON || material == Material.ANVIL || material == Material.ROCK || material == Material.ICE;
			case axe: return material == Material.WOOD || material == Material.PLANTS || material == Material.VINE;
			case shovel: return material == Material.GRASS || material == Material.GROUND || material == Material.SPONGE || material == Material.SAND || material == Material.SNOW || material == Material.CRAFTED_SNOW || material == Material.CLAY;
			case shears: return material == Material.LEAVES || material == Material.VINE || material == Material.CLOTH || material == Material.CARPET;
			case sword: return material == Material.WEB;
		}
		return false;
	}
}
