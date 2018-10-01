package com.flansmod.apocalypse.common.world.buildings;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public abstract class WorldGenFlan extends WorldGenerator
{
	protected void fillArea(World world, int x1, int y1, int z1, int x2, int y2, int z2, IBlockState state)
	{
		fillArea(world, x1, y1, z1, x2, y2, z2, state, state);
	}
	
	protected void fillArea(World world, int x1, int y1, int z1, int x2, int y2, int z2, IBlockState state, IBlockState innerState)
	{
		for(int i = x1; i < x2; i++)
		{
			for(int j = y1; j < y2; j++)
			{
				for(int k = z1; k < z2; k++)
				{
					if(i == x1 || i == x2 - 1 || j == y1 || j == y2 - 1 || k == z1 || k == z2 - 1)
						world.setBlockState(new BlockPos(i, j, k), state, 2);
					else world.setBlockState(new BlockPos(i, j, k), innerState, 2);
				}
			}
		}
	}
}
