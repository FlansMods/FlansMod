package com.flansmod.common.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;

public class EnchantmentNimble extends Enchantment
{
	protected EnchantmentNimble() 
	{
		super(Rarity.UNCOMMON, EnchantmentModule.GLOVES, new EntityEquipmentSlot[] { EntityEquipmentSlot.OFFHAND } );
	}
	
	@Override
    public int getMaxLevel()
    {
        return 3;
    }
}
