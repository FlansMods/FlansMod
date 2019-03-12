package com.flansmod.apocalypse.common.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.flansmod.apocalypse.common.FlansModApocalypse;

public class WorldGenSulphurPool extends WorldGenerator
{
	private Block block;
	
	public WorldGenSulphurPool(Block block)
	{
		this.block = block;
	}
	
	public boolean generate(World world, Random rand, BlockPos pos)
	{
		for(pos = pos.add(-8, 0, -8); pos.getY() > 5 && world.isAirBlock(pos); pos = pos.down())
		{
		}
		
		if(pos.getY() <= 4)
		{
			return false;
		}
		else
		{
			pos = pos.down(4);
			boolean[] aboolean = new boolean[2048];
			int i = rand.nextInt(4) + 4;
			int j;
			
			for(j = 0; j < i; ++j)
			{
				double d0 = rand.nextDouble() * 6.0D + 3.0D;
				double d1 = rand.nextDouble() * 4.0D + 2.0D;
				double d2 = rand.nextDouble() * 6.0D + 3.0D;
				double d3 = rand.nextDouble() * (16.0D - d0 - 2.0D) + 1.0D + d0 / 2.0D;
				double d4 = rand.nextDouble() * (8.0D - d1 - 4.0D) + 2.0D + d1 / 2.0D;
				double d5 = rand.nextDouble() * (16.0D - d2 - 2.0D) + 1.0D + d2 / 2.0D;
				
				for(int l = 1; l < 15; ++l)
				{
					for(int i1 = 1; i1 < 15; ++i1)
					{
						for(int j1 = 1; j1 < 7; ++j1)
						{
							double d6 = ((double)l - d3) / (d0 / 2.0D);
							double d7 = ((double)j1 - d4) / (d1 / 2.0D);
							double d8 = ((double)i1 - d5) / (d2 / 2.0D);
							double d9 = d6 * d6 + d7 * d7 + d8 * d8;
							
							if(d9 < 1.0D)
							{
								aboolean[(l * 16 + i1) * 8 + j1] = true;
							}
						}
					}
				}
			}
			
			int k;
			int k1;
			boolean flag;
			
			for(j = 0; j < 16; ++j)
			{
				for(k1 = 0; k1 < 16; ++k1)
				{
					for(k = 0; k < 8; ++k)
					{
						flag = !aboolean[(j * 16 + k1) * 8 + k] && (j < 15 && aboolean[((j + 1) * 16 + k1) * 8 + k] || j > 0 && aboolean[((j - 1) * 16 + k1) * 8 + k] || k1 < 15 && aboolean[(j * 16 + k1 + 1) * 8 + k] || k1 > 0 && aboolean[(j * 16 + (k1 - 1)) * 8 + k] || k < 7 && aboolean[(j * 16 + k1) * 8 + k + 1] || k > 0 && aboolean[(j * 16 + k1) * 8 + (k - 1)]);
						
						if(flag)
						{
							Material material = world.getBlockState(pos.add(j, k, k1)).getMaterial();
							
							if(k >= 4 && material.isLiquid())
							{
								return false;
							}
							
							if(k < 4 && !material.isSolid() && world.getBlockState(pos.add(j, k, k1)).getBlock() != this.block)
							{
								return false;
							}
						}
					}
				}
			}
			
			for(j = 0; j < 16; ++j)
			{
				for(k1 = 0; k1 < 16; ++k1)
				{
					for(k = 0; k < 8; ++k)
					{
						if(aboolean[(j * 16 + k1) * 8 + k])
						{
							world.setBlockState(pos.add(j, k, k1), k >= 4 ? Blocks.AIR.getDefaultState() : this.block.getDefaultState(), 2);
						}
					}
				}
			}
			
			//if (this.block.getMaterial() == Material.lava)
			{
				for(j = 0; j < 16; ++j)
				{
					for(k1 = 0; k1 < 16; ++k1)
					{
						for(k = 0; k < 8; ++k)
						{
							flag = !aboolean[(j * 16 + k1) * 8 + k] && (j < 15 && aboolean[((j + 1) * 16 + k1) * 8 + k] || j > 0 && aboolean[((j - 1) * 16 + k1) * 8 + k] || k1 < 15 && aboolean[(j * 16 + k1 + 1) * 8 + k] || k1 > 0 && aboolean[(j * 16 + (k1 - 1)) * 8 + k] || k < 7 && aboolean[(j * 16 + k1) * 8 + k + 1] || k > 0 && aboolean[(j * 16 + k1) * 8 + (k - 1)]);
							
							if(flag && (k < 4 || rand.nextInt(2) != 0) && world.getBlockState(pos.add(j, k, k1)).getMaterial().isSolid())
							{
								world.setBlockState(pos.add(j, k, k1), FlansModApocalypse.blockSulphur.getDefaultState(), 2);
							}
						}
					}
				}
			}
			return true;
		}
	}
}
