package com.flansmod.apocalypse.common.world;

import java.util.Random;

import com.flansmod.apocalypse.common.entity.EntitySurvivor;

import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkPrimer;

public class BiomeGenDesertCanyon extends BiomeGenApocalypse
{
    private final int field_150635_aE = 0, field_150636_aF = 1, field_150637_aG = 2;
    
	public BiomeGenDesertCanyon(int i, boolean register) 
	{
		super(i, register);
		minHeight = 0.1F;
		maxHeight = 0.6F;
		spawnableMonsterList.clear();
		//spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntitySurvivor.class, 1, 1, 1));
		spawnableCreatureList.clear();
		topBlock = Blocks.sand.getStateFromMeta(1);
		fillerBlock = Blocks.sand.getStateFromMeta(1);
		setBiomeName("ApocalypseDesert");
	}
	
	@Override
    public float getSpawningChance()
    {
        return 1F;
    }
	/*
	@Override
    public void genTerrainBlocks(World worldIn, Random random, ChunkPrimer primer, int x, int z, double noise)
    {
        topBlock = Blocks.sand.getDefaultState();
        fillerBlock = Blocks.stone.getDefaultState();
        
        if (noise > 1.0F)
        {
            this.topBlock = Blocks.sand.getDefaultState();
            this.fillerBlock = Blocks.sand.getDefaultState();
        }

        generateBiomeTerrain(worldIn, random, primer, x, z, noise);
    }
    */
}
