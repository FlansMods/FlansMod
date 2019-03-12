package com.flansmod.apocalypse.common.world.buildings;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.MapGenStructure;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureStart;
import net.minecraft.world.gen.structure.StructureVillagePieces;

import com.flansmod.apocalypse.common.world.BiomeApocalypse;

public class MapGenAbandonedVillage extends MapGenStructure
{
	public static List<Biome> villageSpawnBiomes = Arrays.asList(BiomeApocalypse.canyon, BiomeApocalypse.desert);
	
	private int terrainType;
	/**
	 * Distance between villages?
	 */
	private int distance;
	private int something;
	
	public MapGenAbandonedVillage()
	{
		distance = 20;
		something = 8;
	}
	
	@Override
	public String getStructureName()
	{
		return "AbandonedVillage";
	}

	@Override
	protected boolean canSpawnStructureAtCoords(int x, int z)
	{
		int xAdjusted = x;
		int zAdjusted = z;
		
		if(xAdjusted < 0)
			xAdjusted -= distance - 1;
		if(zAdjusted < 0)
			zAdjusted -= distance - 1;
		
		int xScaled = xAdjusted / distance;
		int zScaled = zAdjusted / distance;
		Random rand = world.setRandomSeed(xScaled, zScaled, 10387312);
		//De-scale. Get co-ordinates of the corner of this village-spawning-area
		xScaled *= distance;
		zScaled *= distance;
		//Pick random spot in this area
		xScaled += rand.nextInt(distance - something);
		zScaled += rand.nextInt(distance - something);
		
		if(xAdjusted == xScaled && zAdjusted == zScaled && world.getBiomeProvider().areBiomesViable(xAdjusted * 16 + 8, zAdjusted * 16 + 8, 0, villageSpawnBiomes))
		{
			return true;
		}
		
		
		return false;
	}

	@Override
	protected StructureStart getStructureStart(int x, int z)
	{
		return new Start(world, rand, x, z, terrainType);
	}

	public static class Start extends StructureStart
	{
		private boolean hasMoreThanTwoComponents;
		
		public Start()
		{
		}
		
		public Start(World world, Random rand, int x, int z, int size)
		{
			List<StructureVillagePieces.PieceWeight> list = StructureVillagePieces.getStructureVillageWeightedPieceList(rand, size);
			StructureVillagePieces.Start structurevillagepieces$start = new StructureVillagePieces.Start(world.getBiomeProvider(), 0, rand, (x << 4) + 2, (z << 4) + 2, list, size);
			this.components.add(structurevillagepieces$start);
			structurevillagepieces$start.buildComponent(structurevillagepieces$start, this.components, rand);
			List<StructureComponent> list1 = structurevillagepieces$start.pendingRoads;
			List<StructureComponent> list2 = structurevillagepieces$start.pendingHouses;

			while(!list1.isEmpty() || !list2.isEmpty())
			{
				if(list1.isEmpty())
				{
					int i = rand.nextInt(list2.size());
					StructureComponent structurecomponent = list2.remove(i);
					structurecomponent.buildComponent(structurevillagepieces$start, this.components, rand);
				}
				else
				{
					int j = rand.nextInt(list1.size());
					StructureComponent structurecomponent2 = list1.remove(j);
					structurecomponent2.buildComponent(structurevillagepieces$start, this.components, rand);
				}
			}

			this.updateBoundingBox();
			int k = 0;

			for(StructureComponent structurecomponent1 : this.components)
			{
				if(!(structurecomponent1 instanceof StructureVillagePieces.Road))
				{
					++k;
				}
			}

			this.hasMoreThanTwoComponents = k > 2;
		}
		
		@Override
		public void generateStructure(World world, Random rand, StructureBoundingBox boundingBox)
		{
			Iterator iterator = this.components.iterator();

			while(iterator.hasNext())
			{
				StructureComponent structurecomponent = (StructureComponent)iterator.next();

				if(structurecomponent.getBoundingBox().intersectsWith(boundingBox) && !structurecomponent.addComponentParts(world, rand, boundingBox))
				{
					iterator.remove();
				}
	            /*
	            if(!(structurecomponent instanceof Well || structurecomponent instanceof Field1 || structurecomponent instanceof Field2))
	            {
		            StructureBoundingBox box = structurecomponent.getBoundingBox();
		            
		            int holeX = box.minX + rand.nextInt(box.getXSize() + 1);
		            int holeY = box.minY + rand.nextInt(box.getYSize() + 1);
		            int holeZ = box.minZ + rand.nextInt(box.getZSize() + 1);
		            float holeRadius = rand.nextFloat() * 3F;
		            holeRadius *= holeRadius;
		            
	            	for(int i = box.minX; i <= box.maxX; i++)
	            	{
	            		for(int k = box.minZ; k <= box.maxZ; k++)
	            		{
	            			for(int j = box.maxY; j >= box.minY; j--)
	            			{
	            				int dX = i - holeX;
	            				int dY = j - holeY;
	            				int dZ = k - holeZ;
	            				BlockPos pos = new BlockPos(i, j, k);
	            				if(world.getBlockState(pos) != Blocks.oak_door)
	            					if(dX * dX + dY * dY + dZ * dZ + rand.nextFloat() < holeRadius)
	            						world.setBlockState(pos, Blocks.AIR.getDefaultState(), 2);
	            			}
	            		}
	            	}
	            	
		        }
	             */
			}
		}
		
		@Override
		public boolean isSizeableStructure()
		{
			return this.hasMoreThanTwoComponents;
		}
		
		@Override
		public void writeToNBT(NBTTagCompound tags)
		{
			super.writeToNBT(tags);
			tags.setBoolean("Valid", this.hasMoreThanTwoComponents);
		}
		
		@Override
		public void readFromNBT(NBTTagCompound tags)
		{
			super.readFromNBT(tags);
			this.hasMoreThanTwoComponents = tags.getBoolean("Valid");
		}
	}

	@Override
	public BlockPos getNearestStructurePos(World worldIn, BlockPos pos, boolean findUnexplored)
	{
		this.world = worldIn;
		return findNearestStructurePosBySpacing(worldIn, this, pos, this.distance, 8, 10387312, false, 100, findUnexplored);
	}
}
