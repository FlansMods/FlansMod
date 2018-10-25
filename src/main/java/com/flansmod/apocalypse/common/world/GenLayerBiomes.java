package com.flansmod.apocalypse.common.world;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerBiomes extends GenLayer
{
	private static final int RARE_BIOME_CHANCE = 12;
	protected Biome[] commonBiomes = {BiomeApocalypse.deepCanyon, /*BiomeGenApocalypse.canyon,*/ BiomeApocalypse.desert, /*BiomeGenApocalypse.plateau,*/ BiomeApocalypse.highPlateau};
	
	protected Biome[] rareBiomes = {BiomeApocalypse.sulphurPits};
	
	public GenLayerBiomes(long l, GenLayer genlayer)
	{
		super(l);
		this.parent = genlayer;
	}
	
	public GenLayerBiomes(long l)
	{
		super(l);
	}
	
	@Override
	public int[] getInts(int x, int z, int width, int depth)
	{
		int[] dest = IntCache.getIntCache(width * depth);
		for(int dz = 0; dz < depth; dz++)
		{
			for(int dx = 0; dx < width; dx++)
			{
				initChunkSeed(dx + x, dz + z);
				if(nextInt(RARE_BIOME_CHANCE) == 0)
				{
					dest[(dx + dz * width)] = Biome.getIdForBiome(rareBiomes[nextInt(this.rareBiomes.length)]);
				}
				else
				{
					dest[(dx + dz * width)] = Biome.getIdForBiome(commonBiomes[nextInt(this.commonBiomes.length)]);
				}
				
			}
			
		}
		
		return dest;
	}
}
