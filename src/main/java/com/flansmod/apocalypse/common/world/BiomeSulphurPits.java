package com.flansmod.apocalypse.common.world;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class BiomeSulphurPits extends BiomeApocalypse
{
	public BiomeSulphurPits(Biome.BiomeProperties properties)
	{
		super(properties);
		spawnableMonsterList.clear();
		spawnableCreatureList.clear();
		topBlock = Blocks.SAND.getDefaultState();
		fillerBlock = Blocks.SAND.getDefaultState();
		
		BiomeDecoratorApocalypse apoc = (BiomeDecoratorApocalypse)decorator;
		apoc.generateSulphurLakes = true;
	}
}
