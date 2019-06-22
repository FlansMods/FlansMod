package com.flansmod.common;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockManyNames extends ItemBlock
{
	
	public ItemBlockManyNames(Block b)
	{
		super(b);
		setHasSubtypes(true);
		setRegistryName(b.getRegistryName() + "_item");
	}
	
	@Override
	public String getTranslationKey(ItemStack stack)
	{
		return super.getTranslationKey() + "." + stack.getItemDamage();
	}
	
	@Override
	public int getMetadata(int par1)
	{
		return par1;
	}
	
	@Override
	public CreativeTabs[] getCreativeTabs()
	{
		return new CreativeTabs[]{FlansMod.tabFlanDriveables, FlansMod.tabFlanGuns, FlansMod.tabFlanTeams, FlansMod.tabFlanParts};
	}
}
