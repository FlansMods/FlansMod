package com.flansmod.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockFlansWorkbench extends Block
{
	public static final PropertyInteger TYPE = PropertyInteger.create("type", 0, 2);
	
	public BlockFlansWorkbench(int j, int k)
	{
		super(Material.IRON);
		setHardness(3F);
		setResistance(6F);
		setRegistryName("flansWorkbench");
		setCreativeTab(FlansMod.tabFlanDriveables);
		setDefaultState(blockState.getBaseState().withProperty(TYPE, 0));
	}
	
	@Override
	public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		if(tab == FlansMod.tabFlanDriveables)
			items.add(new ItemStack(this, 1, 0));
		else if(tab == FlansMod.tabFlanGuns)
			items.add(new ItemStack(this, 1, 1));
		else if(tab == FlansMod.tabFlanParts)
			items.add(new ItemStack(this, 1, 2));
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entityplayer, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		switch(world.getBlockState(pos).getValue(TYPE))
		{
			case 0: if(world.isRemote)
				entityplayer.openGui(FlansMod.INSTANCE, 0, world, pos.getX(), pos.getY(), pos.getZ());
				break;
			case 1: if(!world.isRemote)
				entityplayer.openGui(FlansMod.INSTANCE, 2, world, pos.getX(), pos.getY(), pos.getZ());
				break;
		}
		return true;
	}
	
	
	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, TYPE);
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(TYPE, meta);
	}
	
	@Override
	public int getMetaFromState(IBlockState state)
	{
		return state.getValue(TYPE);
	}
	
	@Override
	public int damageDropped(IBlockState state)
	{
		return state.getValue(TYPE);
	}
	
}
