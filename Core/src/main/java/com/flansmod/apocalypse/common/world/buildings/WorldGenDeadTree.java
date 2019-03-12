package com.flansmod.apocalypse.common.world.buildings;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WorldGenDeadTree extends WorldGenFlan
{
	@Override
	public boolean generate(World world, Random rand, BlockPos pos)
	{
		for(; pos.getY() < 256; pos = pos.up())
		{
			if(world.isAirBlock(pos) && world.isSideSolid(pos.down(), EnumFacing.UP))
			{
				int treeHeight = rand.nextInt(3) + 3;
				for(int i = 0; i < treeHeight; i++)
				{
					world.setBlockState(pos.add(0, i, 0), Blocks.LOG.getDefaultState());
				}
				for(int j = 0; j < rand.nextInt(2) + 2; j++)
				{
					int dx = 0, dy = 0, dz = 0;
					int branchXDir = rand.nextInt(3) - 1;
					int branchZDir = rand.nextInt(3) - 1;
					int branchStartPoint = rand.nextInt(treeHeight / 2) + treeHeight / 2;
					for(int i = 0; i < treeHeight; i++)
					{
						if(rand.nextBoolean())
						{
							dx += branchXDir;
							dz += branchZDir;
						}
						dy++;
						world.setBlockState(pos.add(dx, dy + treeHeight - 1, dz), Blocks.LOG.getDefaultState());
					}
				}
				break;
			}
		}
		return false;
	}
}
