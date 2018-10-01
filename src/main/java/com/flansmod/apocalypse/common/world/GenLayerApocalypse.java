package com.flansmod.apocalypse.common.world;

import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerVoronoiZoom;
import net.minecraft.world.gen.layer.GenLayerZoom;

public abstract class GenLayerApocalypse extends GenLayer
{
	public GenLayerApocalypse(long l)
	{
		super(l);
	}
	
	public static GenLayer[] makeTheWorld(long l)
	{
		GenLayer biomes = new GenLayerBiomes(1L);
	    

	    
	    /*
	    biomes = new GenLayerTFKeyBiomes(1000L, biomes);
	    biomes = new GenLayerTFCompanionBiomes(1000L, biomes);
	    */
		biomes = new GenLayerZoom(1000L, biomes);
		//biomes = new GenLayerZoom(1001L, biomes);
	    /*   

	    biomes = new GenLayerTFBiomeStabilize(700L, biomes);

	    biomes = new GenLayerTFThornBorder(500L, biomes);
	     */
		biomes = new GenLayerZoom(1002L, biomes);
		biomes = new GenLayerZoom(1003L, biomes);
		biomes = new GenLayerZoom(1004L, biomes);
		biomes = new GenLayerZoom(1005L, biomes);
	    /*
	    GenLayer riverLayer = new GenLayerTFStream(1L, biomes);
	    riverLayer = new GenLayerSmooth(7000L, riverLayer);
	    biomes = new GenLayerTFRiverMix(100L, biomes, riverLayer);
	     */
		GenLayer genlayervoronoizoom = new GenLayerVoronoiZoom(10L, biomes);
		
		biomes.initWorldGenSeed(l);
		genlayervoronoizoom.initWorldGenSeed(l);
		
		return new GenLayer[]{biomes, genlayervoronoizoom};
	}
	
}
