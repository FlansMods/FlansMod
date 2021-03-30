package com.flansmod.common.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;

public class EnchantmentSteady extends Enchantment
{
	protected EnchantmentSteady() 
	{
		super(Rarity.COMMON, EnchantmentModule.OFF_HAND, new EntityEquipmentSlot[] { EntityEquipmentSlot.OFFHAND });
	}
	
	@Override
    public int getMaxLevel()
    {
        return 3;
    }
}
