package com.flansmod.common.paintjob;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;

import com.flansmod.common.FlansMod;

public class BlockPaintjobTable extends BlockContainer
{
	public BlockPaintjobTable()
	{
		super(Material.ROCK);
		setHardness(2F);
		setResistance(4F);
		setTranslationKey("paintjobTable");
		setRegistryName("paintjobTable");
		setCreativeTab(FlansMod.tabFlanGuns);
	}
	
	@Override
	public boolean canPlaceBlockAt(World world, BlockPos pos)
	{
		return world.getBlockState(pos.add(0, -1, 0)).isSideSolid(world, pos.add(0, -1, 0), EnumFacing.UP);
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int i)
	{
		return new TileEntityPaintjobTable();
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float par7, float par8, float par9)
	{
		if(world.isRemote)
		{
			FlansMod.playerHandler.getPlayerData(player, Side.CLIENT).shootTimeLeft = FlansMod.playerHandler.getPlayerData(player, Side.CLIENT).shootTimeRight = 10;
			return true;
		}
		
		TileEntityPaintjobTable table = (TileEntityPaintjobTable)world.getTileEntity(pos);
		
		if(!world.isRemote)
		{
			player.openGui(FlansMod.INSTANCE, 13, world, pos.getX(), pos.getY(), pos.getZ());
		}
		return true;
	}
	
	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state)
	{
		TileEntity tileentity = worldIn.getTileEntity(pos);
		
		if(tileentity instanceof IInventory)
		{
			InventoryHelper.dropInventoryItems(worldIn, pos, (IInventory)tileentity);
			worldIn.updateComparatorOutputLevel(pos, this);
		}
		
		super.breakBlock(worldIn, pos, state);
	}
}
