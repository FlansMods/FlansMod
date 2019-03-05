package com.flansmod.common.guns;

import net.minecraft.item.Item;

public abstract class ItemShootable extends Item
{
	public ShootableType type;
	
	public ItemShootable(ShootableType t)
	{
		type = t;
		maxStackSize = type.maxStackSize;
		setRegistryName(type.shortName);
		setMaxDamage(type.roundsPerItem);
	}
}
