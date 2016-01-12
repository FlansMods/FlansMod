package com.flansmod.apocalypse.common.world;

import net.minecraft.init.Blocks;

public class BiomeGenSulphurPits extends BiomeGenApocalypse 
{
	public BiomeGenSulphurPits(int i, boolean register) 
	{
		super(i, register);
		minHeight = 0.1F;
		maxHeight = 0.6F;
		spawnableMonsterList.clear();
		spawnableCreatureList.clear();
		topBlock = Blocks.sand.getDefaultState();
		fillerBlock = Blocks.sand.getDefaultState();
		setBiomeName("SulphurPits");
		
		BiomeDecoratorApocalypse decorator = (BiomeDecoratorApocalypse)theBiomeDecorator;
		decorator.generateSulphurLakes = true;
	}
}
