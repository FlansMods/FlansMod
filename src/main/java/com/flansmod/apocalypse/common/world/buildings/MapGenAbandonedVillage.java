package com.flansmod.apocalypse.common.world.buildings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.flansmod.apocalypse.common.world.BiomeGenApocalypse;
import com.flansmod.apocalypse.common.world.buildings.StructureAbandonedVillagePieces.Field1;
import com.flansmod.apocalypse.common.world.buildings.StructureAbandonedVillagePieces.Field2;
import com.flansmod.apocalypse.common.world.buildings.StructureAbandonedVillagePieces.Well;

import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.structure.MapGenStructure;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureStart;

public class MapGenAbandonedVillage extends MapGenStructure
{
	public static List<BiomeGenBase> villageSpawnBiomes = Arrays.asList(new BiomeGenBase[] {BiomeGenApocalypse.canyon, BiomeGenApocalypse.desert});
	
	private int terrainType;
	/** Distance between villages? */
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
		Random rand = worldObj.setRandomSeed(xScaled, zScaled, 10387312);
		//De-scale. Get co-ordinates of the corner of this village-spawning-area
		xScaled *= distance;
		zScaled *= distance;
		//Pick random spot in this area
		xScaled += rand.nextInt(distance - something);
		zScaled += rand.nextInt(distance - something);
		
		if(xAdjusted == xScaled && zAdjusted == zScaled && worldObj.getWorldChunkManager().areBiomesViable(xAdjusted * 16 + 8, zAdjusted * 16 + 8, 0, villageSpawnBiomes))
		{
			return true;
		}
		
		
		return false;
	}

	@Override
	protected StructureStart getStructureStart(int x, int z) 
	{
		return new Start(worldObj, rand, x, z, terrainType);
	}

	public static class Start extends StructureStart
	{
		private boolean hasMoreThanTwoComponents;
		
		public Start()
		{
		}
		
		public Start(World world, Random rand, int x, int z, int i)
		{
			super(x, z);
			List list = StructureAbandonedVillagePieces.getStructureVillageWeightedPieceList(rand, i);
			StructureAbandonedVillagePieces.Start start = new StructureAbandonedVillagePieces.Start(world.getWorldChunkManager(), 0, rand, (x << 4) + 2, (z << 4) + 2, list, i);
            components.add(start);
            start.buildComponent(start, this.components, rand);
            List list1 = start.field_74930_j;
            List list2 = start.field_74932_i;
            int l;

            while (!list1.isEmpty() || !list2.isEmpty())
            {
                StructureComponent structurecomponent;

                if (list1.isEmpty())
                {
                    l = rand.nextInt(list2.size());
                    structurecomponent = (StructureComponent)list2.remove(l);
                    structurecomponent.buildComponent(start, this.components, rand);
                }
                else
                {
                    l = rand.nextInt(list1.size());
                    structurecomponent = (StructureComponent)list1.remove(l);
                    structurecomponent.buildComponent(start, this.components, rand);
                }
            }

            updateBoundingBox();
            l = 0;
            Iterator iterator = components.iterator();

            while (iterator.hasNext())
            {
                StructureComponent structurecomponent1 = (StructureComponent)iterator.next();

                if (!(structurecomponent1 instanceof StructureAbandonedVillagePieces.Road))
                {
                    ++l;
                }
            }

            this.hasMoreThanTwoComponents = l > 2;
		}
		
		@Override
	    public void generateStructure(World world, Random rand, StructureBoundingBox boundingBox)
	    {
	        Iterator iterator = this.components.iterator();

	        while (iterator.hasNext())
	        {
	            StructureComponent structurecomponent = (StructureComponent)iterator.next();

	            if (structurecomponent.getBoundingBox().intersectsWith(boundingBox) && !structurecomponent.addComponentParts(world, rand, boundingBox))
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
	            						world.setBlockState(pos, Blocks.air.getDefaultState(), 2);
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
}
