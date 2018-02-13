package com.flansmod.apocalypse.common.world.buildings;

import java.util.Random;

import com.flansmod.apocalypse.common.FlansModApocalypse;
import com.flansmod.common.BlockItemHolder;
import com.flansmod.common.TileEntityItemHolder;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenSkeleton extends WorldGenerator 
{
	@Override
	public boolean generate(World world, Random rand, BlockPos pos) 
	{	
		for( ; pos.getY() < 256; pos = pos.up())
		{		
			if(world.isAirBlock(pos) && World.doesBlockHaveSolidTopSurface(world, pos.down()))
			{
				world.setBlockState(pos, FlansModApocalypse.skeleton.getDefaultState().withProperty(BlockItemHolder.FACING, EnumFacing.HORIZONTALS[rand.nextInt(4)]), 2);
				FlansModApocalypse.getLootGenerator().addRandomLoot((TileEntityItemHolder)world.getTileEntity(pos), rand, false);
				break;
			}
		}	
		return false;
	}
}
