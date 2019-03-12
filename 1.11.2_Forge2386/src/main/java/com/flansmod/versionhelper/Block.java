package com.flansmod.versionhelper;

import com.flansmod.common.FlansMod;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public abstract class Block extends net.minecraft.block.Block
{
	public Block(Material mat) { super(mat); }
    public Block(Material mat, MapColor col) { super(mat, col); }
    
	@Override
    public void getSubBlocks(Item item, CreativeTabs tab, NonNullList<ItemStack> list)
    {
        GetSubBlocks(item, tab, list);
    }

	public void GetSubBlocks(Item item, CreativeTabs tab, NonNullList<ItemStack> items)
	{
		super.getSubBlocks(item, tab, items);
	}
	
}
