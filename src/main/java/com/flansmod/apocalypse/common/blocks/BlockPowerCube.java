package com.flansmod.apocalypse.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.flansmod.apocalypse.common.FlansModApocalypse;
import com.flansmod.apocalypse.common.entity.EntitySkullBoss;
import com.flansmod.apocalypse.common.entity.EntityTeleporter;
import com.flansmod.apocalypse.common.world.buildings.WorldGenBossPillar;

public class BlockPowerCube extends Block implements ITileEntityProvider
{
	public BlockPowerCube(Material material)
	{
		super(material);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return new TileEntityPowerCube();
	}

	public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)
	{
		return false;
	}
	
	@Override
	public boolean canPlaceBlockAt(World world, BlockPos pos)
	{
		return world.getBlockState(pos.add(0, -1, 0)).isSideSolid(world, pos.add(0, -1, 0), EnumFacing.UP);
	}
	
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}

	protected static final AxisAlignedBB AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return AABB;
	}

	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
	{
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				if((world.provider.getDimension() == FlansModApocalypse.dimensionID || world.provider.getDimension() == 0) && isPortal(world, pos.add(-3 * i, 0, -3 * j)))
				{
					world.spawnEntity(new EntityTeleporter(world, pos.add(-3 * i, 0, -3 * j)));
				}
			}
		}
		
		final int checkY = MathHelper.floor(WorldGenBossPillar.kPillarMaxHeight + 1);
		final int checkXZ = MathHelper.floor(WorldGenBossPillar.kPillarInnerEdge + 1);
		
		if(world.provider.getDimension() == FlansModApocalypse.dimensionID &&
		   world.getBlockState(pos.down()).getBlock() == Blocks.BEDROCK)
		{
			if(Math.abs(pos.getX()) == checkXZ &&
			   Math.abs(pos.getZ()) == checkXZ)
			{
				boolean allPresent = true;
						
				for(int i = 0; i < 2; i++)
					for(int k = 0; k < 2; k++)
						if(world.getBlockState(new BlockPos(checkXZ * (i == 0 ? 1 : -1), pos.getY(), checkXZ * (k == 0 ? 1 : -1))).getBlock() != this)
							allPresent = false;
				
				if(allPresent)
				{
					FlansModApocalypse.INSTANCE.TriggerBossFight(world, placer);
					
					for(int i = 0; i < 2; i++)
						for(int k = 0; k < 2; k++)
							world.destroyBlock(new BlockPos(checkXZ * (i == 0 ? 1 : -1), pos.getY(), checkXZ * (k == 0 ? 1 : -1)), false);
				}
			}
		}
	}
	
	private boolean isPortal(World world, BlockPos pos)
	{
		if(world.getBlockState(pos).getBlock() != FlansModApocalypse.blockPowerCube || world.getBlockState(pos.add(3, 0, 0)).getBlock() != FlansModApocalypse.blockPowerCube
				|| world.getBlockState(pos.add(0, 0, 3)).getBlock() != FlansModApocalypse.blockPowerCube || world.getBlockState(pos.add(3, 0, 3)).getBlock() != FlansModApocalypse.blockPowerCube)
			return false;
		for(int i = 0; i < 2; i++)
			for(int j = 0; j < 2; j++)
				if(world.getBlockState(pos.add(i * 3, -1, j * 3)).getBlock() != Blocks.OBSIDIAN || world.getBlockState(pos.add(1 + i, -1, 1 + j)).getBlock() != Blocks.OBSIDIAN)
					return false;
		return true;
	}
}
