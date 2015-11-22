package com.flansmod.apocalypse.common.world;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerBiomes extends GenLayer 
{
	  private static final int RARE_BIOME_CHANCE = 12;
	  protected BiomeGenBase[] commonBiomes = { BiomeGenApocalypse.deepCanyon, /*BiomeGenApocalypse.canyon,*/ BiomeGenApocalypse.desert, /*BiomeGenApocalypse.plateau,*/ BiomeGenApocalypse.highPlateau };
	
	  protected BiomeGenBase[] rareBiomes = { BiomeGenApocalypse.sulphurPits };
	
	  public GenLayerBiomes(long l, GenLayer genlayer)
	  {
	    super(l);
	    this.parent = genlayer;
	  }
	
	  public GenLayerBiomes(long l) 
	  {
	    super(l);
	  }
	
	  public int[] getInts(int x, int z, int width, int depth)
	  {
	    int[] dest = IntCache.getIntCache(width * depth);
	    for (int dz = 0; dz < depth; dz++)
	    {
	      for (int dx = 0; dx < width; dx++)
	      {
	    	  initChunkSeed(dx + x, dz + z);
	        if (nextInt(RARE_BIOME_CHANCE) == 0)
	        {
	          dest[(dx + dz * width)] = this.rareBiomes[nextInt(this.rareBiomes.length)].biomeID;
	        }
	        else
	        {
	          dest[(dx + dz * width)] = this.commonBiomes[nextInt(this.commonBiomes.length)].biomeID;
	        }
	
	      }
	
	    }
	
	    return dest;
	  }
}
