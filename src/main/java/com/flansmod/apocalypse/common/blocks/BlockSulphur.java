package com.flansmod.apocalypse.common.blocks;

import java.util.Random;

import com.flansmod.apocalypse.common.FlansModApocalypse;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockSulphur extends Block 
{
	public BlockSulphur() 
	{
		super(Material.sand);
	}
    
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return FlansModApocalypse.sulphur;
    }

	@Override
    public int quantityDropped(Random random)
    {
        return random.nextInt(1) + 1;
    }
}
