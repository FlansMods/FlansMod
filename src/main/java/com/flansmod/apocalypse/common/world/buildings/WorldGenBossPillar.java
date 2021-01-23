package com.flansmod.apocalypse.common.world.buildings;

import java.util.Random;

import com.flansmod.common.ModuloHelper;

import net.minecraft.block.BlockColored;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenBossPillar extends WorldGenerator
{
	public static final double kPillarInnerEdge = 12d;
	public static final double kPillarInnerRadius = kPillarInnerEdge * Math.sqrt(2);
	public static final double kPillarOuterEdge = 300d;
	public static final double kPillarMaxHeight = 240d;
	public static final double kBossSpawnHeight = 220d;
	
	//private static final double kA = kPillarMaxHeight * Math.exp(kPillarInnerEdge);
	private static final double kB = -Math.log(kPillarMaxHeight) / (kPillarOuterEdge - kPillarInnerRadius);
	private static final double kA = Math.exp(-kB * kPillarOuterEdge);
	
	@Override
	public boolean generate(World world, Random rand, BlockPos pos) 
	{
		for(int i = 8; i < 24; i++)
		{
			for(int k = 8; k < 24; k++)
			{
				BlockPos p = pos.add(i, 0, k);
				
				if(Math.abs(p.getX()) > kPillarInnerEdge && Math.abs(p.getZ()) > kPillarInnerEdge)
				{
					double dist = p.getDistance(0, 0, 0);
					double theta = Math.atan2(p.getZ(), p.getX());

					double pillarBaseHeight = kA * Math.exp(kB * dist);
					
					if(pillarBaseHeight > 1d)
					{
						BlockPos downIterate = p.add(0,pillarBaseHeight,0);
						//world.setBlockState(p.add(0,pillarBaseHeight,0), Blocks.BEDROCK.getDefaultState());

						while(world.isAirBlock(downIterate) && downIterate.getY() > 1d)
						{
							if((Math.abs(p.getX()) == kPillarInnerEdge + 1 || Math.abs(p.getZ()) == kPillarInnerEdge + 1) && rand.nextInt(500) == 0)
							{
								world.setBlockState(downIterate, Blocks.MAGMA.getDefaultState());
							}
							else
							{
								world.setBlockState(downIterate, Blocks.BEDROCK.getDefaultState());
							}
							downIterate = downIterate.down();
						}
					}
				}
			}
		}
		return false;
	}
	
}
