package com.flansmod.common.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentDamage;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.enchantment.Enchantment.Rarity;
import net.minecraft.inventory.EntityEquipmentSlot;

public class EnchantmentJuggernaut extends Enchantment
{
	protected EnchantmentJuggernaut() 
	{
		super(Rarity.VERY_RARE, EnumEnchantmentType.ARMOR, 
				new EntityEquipmentSlot[] 
						{ 
							EntityEquipmentSlot.HEAD, 
							EntityEquipmentSlot.CHEST, 
							EntityEquipmentSlot.LEGS, 
							EntityEquipmentSlot.FEET, 
						} );
	}
	
	@Override
    public int getMaxLevel()
    {
        return 1;
    }
	
	@Override
    public boolean isTreasureEnchantment()
    {
        return true;
    }
	
	@Override
    public int getMinEnchantability(int enchantmentLevel)
    {
        return enchantmentLevel * 25;
    }
	
	@Override
    public int getMaxEnchantability(int enchantmentLevel)
    {
        return this.getMinEnchantability(enchantmentLevel) + 50;
    }
}