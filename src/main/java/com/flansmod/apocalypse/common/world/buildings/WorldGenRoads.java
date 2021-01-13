package com.flansmod.apocalypse.common.world.buildings;

import java.util.Random;

import com.flansmod.apocalypse.common.FlansModApocalypse;
import com.flansmod.common.BlockItemHolder;
import com.flansmod.common.ModuloHelper;
import com.flansmod.common.TileEntityItemHolder;

import net.minecraft.block.BlockColored;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenRoads extends WorldGenerator
{
	// Ring road
	private static final double kRingRoadInner = 400d,
			kRingRoadMid = 410d,
			kRingRoadOuter = 420d,
			kRingRoadEdgeWidth = 1.5d;
	
	private static final double dashLength = 10.0d;
	private static final double archLength = 16.0d;
	private static final double kAxisRoadWidth = 10.0d;
	private static final double kRepeatDistance = 600d;
	
	@Override
	public boolean generate(World world, Random rand, BlockPos pos)
	{		
		for(int i = 8; i < 24; i++)
		{
			for(int k = 8; k < 24; k++)
			{
				BlockPos p = pos.add(i, 0, k);
				
				double dist = p.getDistance(0, 0, 0);
				double theta = Math.atan2(p.getZ(), p.getX());
				
				double r = ModuloHelper.modulo(dist, kRepeatDistance);
				int repeat = (int) Math.floor(dist / kRepeatDistance);
				double circumfrence = (kRingRoadMid + kRepeatDistance * repeat) * Math.PI * 2d;
				double archArcLength = Math.PI * 2d * archLength / circumfrence;
				double dashArcLength = Math.PI * 2d * dashLength / circumfrence;
				
				int doRoad = 0;
				boolean doEdge = false;
				boolean doDash = false;
								
				double archHeight = 128d;
				double tunnelHeight = 0d;
				
				if(kRingRoadInner <= r && r <= kRingRoadOuter)
				{
					doRoad++;
					doEdge = r <= kRingRoadInner + kRingRoadEdgeWidth || kRingRoadOuter - kRingRoadEdgeWidth <= r;
					doDash = kRingRoadMid - 0.5d <= r && r <= kRingRoadMid + 0.5d && ModuloHelper.modulo(theta, (dashArcLength * 2d)) < dashArcLength;
					archHeight = 20 + 38 * Math.abs(Math.sin(theta / archArcLength));
					double t = (r - kRingRoadInner) / (kRingRoadOuter - kRingRoadInner);
					tunnelHeight = 70 + 7 * Math.sin(t * Math.PI);
				}
				
				double x = Math.abs(p.getX());
				if(x < kAxisRoadWidth)
				{
					doRoad++;
					doEdge = x > kAxisRoadWidth - kRingRoadEdgeWidth;
					doDash = x < 0.5d && ModuloHelper.modulo(p.getZ(), 2 * dashLength) < dashLength;
					archHeight = Math.min(archHeight, 20 + 38 * Math.abs(Math.sin(p.getZ() * Math.PI / (archLength * 3.0d))));
					tunnelHeight = Math.max(tunnelHeight, 70 + 7 * Math.cos((x / kAxisRoadWidth) * Math.PI * 0.5d));
				}
				
				double z = Math.abs(p.getZ());
				if(z < kAxisRoadWidth)
				{
					doRoad++;
					doEdge = z > kAxisRoadWidth - kRingRoadEdgeWidth;
					doDash = z < 0.5d && ModuloHelper.modulo(p.getX(), 2 * dashLength) < dashLength;
					archHeight = Math.min(archHeight, 20 + 38 * Math.abs(Math.sin(p.getX() * Math.PI / (archLength * 3.0d))));
					tunnelHeight = Math.max(tunnelHeight, 70 + 7 * Math.cos((z / kAxisRoadWidth) * Math.PI * 0.5d));
				}
				
				if(doRoad > 1)
					doEdge = false;
				
				if(doEdge)
				{
					world.setBlockState(p.add(0,64,0), Blocks.DOUBLE_STONE_SLAB.getDefaultState());
				}
				else if(doRoad > 0)
				{
					world.setBlockState(p.add(0,64,0), Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, doDash ? EnumDyeColor.WHITE : EnumDyeColor.BLACK), 0);
					
				}
				
				if(doRoad > 0)
				{
					BlockPos downIterate = p.add(0,63,0);
					
					while(world.isAirBlock(downIterate) && downIterate.getY() > archHeight)
					{
						world.setBlockState(downIterate, Blocks.STONE.getDefaultState());
						downIterate = downIterate.down();
					}
					
					BlockPos upIterate = p.add(0, 65, 0);

					while(upIterate.getY() < tunnelHeight)
					{
						world.setBlockToAir(upIterate);
						upIterate = upIterate.up();
					}
				}
			}
		}
		return false;
	}
}
