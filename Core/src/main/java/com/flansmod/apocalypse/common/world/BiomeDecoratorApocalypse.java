package com.flansmod.apocalypse.common.world;

import java.util.Random;

import net.minecraft.block.BlockStone;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

import com.flansmod.apocalypse.common.FlansModApocalypse;

import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.LAKE_WATER;

public class BiomeDecoratorApocalypse extends BiomeDecorator
{
	public boolean generateSulphurLakes = false;
	
	public void decorate(World worldIn, Random random, Biome biome, BlockPos pos)
	{
		if(this.decorating)
		{
			throw new RuntimeException("Already decorating");
		}
		else
		{
			this.chunkProviderSettings = ChunkGeneratorSettings.Factory.jsonToFactory(worldIn.getWorldInfo().getGeneratorOptions()).build();
			this.chunkPos = pos;
			this.dirtGen = new WorldGenMinable(Blocks.DIRT.getDefaultState(), 8);
			this.clayGen = new WorldGenMinable(Blocks.CLAY.getDefaultState(), 30);
			this.gravelGen = new WorldGenMinable(Blocks.GRAVEL.getDefaultState(), 25);
			this.graniteGen = new WorldGenMinable(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.GRANITE), this.chunkProviderSettings.graniteSize);
			this.dioriteGen = new WorldGenMinable(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.DIORITE), this.chunkProviderSettings.dioriteSize);
			this.andesiteGen = new WorldGenMinable(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.ANDESITE), this.chunkProviderSettings.andesiteSize);
			this.coalGen = new WorldGenMinable(Blocks.COAL_ORE.getDefaultState(), 8);
			this.ironGen = new WorldGenMinable(Blocks.IRON_ORE.getDefaultState(), 25);
			this.goldGen = new WorldGenMinable(Blocks.GOLD_ORE.getDefaultState(), this.chunkProviderSettings.goldSize);
			this.redstoneGen = new WorldGenMinable(Blocks.REDSTONE_ORE.getDefaultState(), 16);
			this.diamondGen = new WorldGenMinable(Blocks.DIAMOND_ORE.getDefaultState(), 8);
			this.lapisGen = new WorldGenMinable(Blocks.LAPIS_ORE.getDefaultState(), this.chunkProviderSettings.lapisSize);
			this.genDecorations(biome, worldIn, random);
			this.decorating = false;
		}
	}
	
	@Override
	protected void genDecorations(Biome biome, World currentWorld, Random randomGenerator)
	{
		MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(currentWorld, randomGenerator, chunkPos));
		//Forge generation hook
		boolean doGen;
		int i, j, k;
		
		if(this.generateSulphurLakes)
		{
			BlockPos blockpos1;
			
			doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunkPos, LAKE_WATER);
			for(j = 0; doGen && j < 15; ++j)
			{
				blockpos1 = this.chunkPos.add(randomGenerator.nextInt(16) + 8, randomGenerator.nextInt(10) + 30, randomGenerator.nextInt(16) + 8);
				(new WorldGenSulphurPool(FlansModApocalypse.blockSulphuricAcid)).generate(currentWorld, randomGenerator, blockpos1);
			}
		}
		
		//Ore generation
		MinecraftForge.ORE_GEN_BUS.post(new OreGenEvent.Pre(currentWorld, randomGenerator, chunkPos));
		
		//Generic generation
		//First parameter is the amount of ore veins, second is the generator, third and fourth are min and max height
		genStandardOre1(currentWorld, randomGenerator, 5, this.dirtGen, 12, 34);
		genStandardOre1(currentWorld, randomGenerator, 5, this.gravelGen, 36, 64);
		genStandardOre1(currentWorld, randomGenerator, 2, this.dioriteGen, 60, 100);
		genStandardOre1(currentWorld, randomGenerator, 2, this.graniteGen, 60, 100);
		genStandardOre1(currentWorld, randomGenerator, 1, this.andesiteGen, 60, 100);
		
		genStandardOre1(currentWorld, randomGenerator, 20, this.ironGen, 5, 128);
		
		if(biome == BiomeApocalypse.highPlateau)
		{
			genStandardOre1(currentWorld, randomGenerator, 1, this.diamondGen, 95, 128);
			genStandardOre1(currentWorld, randomGenerator, 1, this.goldGen, 50, 90);
			genStandardOre2(currentWorld, randomGenerator, 2, this.lapisGen, 70, 32);
			genStandardOre1(currentWorld, randomGenerator, 10, this.redstoneGen, 30, 60);
		}
		else if(biome == BiomeApocalypse.sulphurPits)
		{
			genStandardOre1(currentWorld, randomGenerator, 15, this.coalGen, 0, 25);
		}
		
		MinecraftForge.ORE_GEN_BUS.post(new OreGenEvent.Post(currentWorld, randomGenerator, chunkPos));
        
        /*
        this.generateOres();
        int i;
        int j;
        int k;

        boolean doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunkPos, SAND);
        for (i = 0; doGen && i < this.sandPerChunk2; ++i)
        {
            j = this.randomGenerator.nextInt(16) + 8;
            k = this.randomGenerator.nextInt(16) + 8;
            this.sandGen.generate(this.currentWorld, this.randomGenerator, this.currentWorld.getTopSolidOrLiquidBlock(this.chunkPos.add(j, 0, k)));
        }

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunkPos, CLAY);
        for (i = 0; doGen && i < this.clayPerChunk; ++i)
        {
            j = this.randomGenerator.nextInt(16) + 8;
            k = this.randomGenerator.nextInt(16) + 8;
            this.clayGen.generate(this.currentWorld, this.randomGenerator, this.currentWorld.getTopSolidOrLiquidBlock(this.chunkPos.add(j, 0, k)));
        }

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunkPos, SAND_PASS2);
        for (i = 0; doGen && i < this.sandPerChunk; ++i)
        {
            j = this.randomGenerator.nextInt(16) + 8;
            k = this.randomGenerator.nextInt(16) + 8;
            this.gravelAsSandGen.generate(this.currentWorld, this.randomGenerator, this.currentWorld.getTopSolidOrLiquidBlock(this.chunkPos.add(j, 0, k)));
        }

        i = this.treesPerChunk;

        if (this.randomGenerator.nextInt(10) == 0)
        {
            ++i;
        }

        int l;
        BlockPos blockpos;

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunkPos, TREE);
        for (j = 0; doGen && j < i; ++j)
        {
            k = this.randomGenerator.nextInt(16) + 8;
            l = this.randomGenerator.nextInt(16) + 8;
            WorldGenAbstractTree worldgenabstracttree = p_150513_1_.genBigTreeChance(this.randomGenerator);
            worldgenabstracttree.func_175904_e();
            blockpos = this.currentWorld.getHorizon(this.chunkPos.add(k, 0, l));

            if (worldgenabstracttree.generate(this.currentWorld, this.randomGenerator, blockpos))
            {
                worldgenabstracttree.func_180711_a(this.currentWorld, this.randomGenerator, blockpos);
            }
        }

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunkPos, BIG_SHROOM);
        for (j = 0; doGen && j < this.bigMushroomsPerChunk; ++j)
        {
            k = this.randomGenerator.nextInt(16) + 8;
            l = this.randomGenerator.nextInt(16) + 8;
            this.bigMushroomGen.generate(this.currentWorld, this.randomGenerator, this.currentWorld.getHorizon(this.chunkPos.add(k, 0, l)));
        }

        int i1;

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunkPos, FLOWERS);
        for (j = 0; doGen && j < this.flowersPerChunk; ++j)
        {
            k = this.randomGenerator.nextInt(16) + 8;
            l = this.randomGenerator.nextInt(16) + 8;
            i1 = nextInt(this.currentWorld.getHorizon(this.chunkPos.add(k, 0, l)).getY() + 32);
            blockpos = this.chunkPos.add(k, i1, l);
            BlockFlower.EnumFlowerType enumflowertype = p_150513_1_.pickRandomFlower(this.randomGenerator, blockpos);
            BlockFlower blockflower = enumflowertype.getBlockType().getBlock();

            if (blockflower.getMaterial() != Material.air)
            {
                this.yellowFlowerGen.setGeneratedBlock(blockflower, enumflowertype);
                this.yellowFlowerGen.generate(this.currentWorld, this.randomGenerator, blockpos);
            }
        }

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunkPos, GRASS);
        for (j = 0; doGen && j < this.grassPerChunk; ++j)
        {
            k = this.randomGenerator.nextInt(16) + 8;
            l = this.randomGenerator.nextInt(16) + 8;
            i1 = nextInt(this.currentWorld.getHorizon(this.chunkPos.add(k, 0, l)).getY() * 2);
            p_150513_1_.getRandomWorldGenForGrass(this.randomGenerator).generate(this.currentWorld, this.randomGenerator, this.chunkPos.add(k, i1, l));
        }

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunkPos, DEAD_BUSH);
        for (j = 0; doGen && j < this.deadBushPerChunk; ++j)
        {
            k = this.randomGenerator.nextInt(16) + 8;
            l = this.randomGenerator.nextInt(16) + 8;
            i1 = nextInt(this.currentWorld.getHorizon(this.chunkPos.add(k, 0, l)).getY() * 2);
            (new WorldGenDeadBush()).generate(this.currentWorld, this.randomGenerator, this.chunkPos.add(k, i1, l));
        }

        j = 0;

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunkPos, LILYPAD);
        while (doGen && j < this.waterlilyPerChunk)
        {
            k = this.randomGenerator.nextInt(16) + 8;
            l = this.randomGenerator.nextInt(16) + 8;
            i1 = nextInt(this.currentWorld.getHorizon(this.chunkPos.add(k, 0, l)).getY() * 2);
            blockpos = this.chunkPos.add(k, i1, l);

            while (true)
            {
                if (blockpos.getY() > 0)
                {
                    BlockPos blockpos3 = blockpos.down();

                    if (this.currentWorld.isAirBlock(blockpos3))
                    {
                        blockpos = blockpos3;
                        continue;
                    }
                }

                this.waterlilyGen.generate(this.currentWorld, this.randomGenerator, blockpos);
                ++j;
                break;
            }
        }

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunkPos, SHROOM);
        for (j = 0; doGen && j < this.mushroomsPerChunk; ++j)
        {
            if (this.randomGenerator.nextInt(4) == 0)
            {
                k = this.randomGenerator.nextInt(16) + 8;
                l = this.randomGenerator.nextInt(16) + 8;
                BlockPos blockpos2 = this.currentWorld.getHorizon(this.chunkPos.add(k, 0, l));
                this.mushroomBrownGen.generate(this.currentWorld, this.randomGenerator, blockpos2);
            }

            if (this.randomGenerator.nextInt(8) == 0)
            {
                k = this.randomGenerator.nextInt(16) + 8;
                l = this.randomGenerator.nextInt(16) + 8;
                i1 = nextInt(this.currentWorld.getHorizon(this.chunkPos.add(k, 0, l)).getY() * 2);
                blockpos = this.chunkPos.add(k, i1, l);
                this.mushroomRedGen.generate(this.currentWorld, this.randomGenerator, blockpos);
            }
        }

        if (doGen && this.randomGenerator.nextInt(4) == 0)
        {
            j = this.randomGenerator.nextInt(16) + 8;
            k = this.randomGenerator.nextInt(16) + 8;
            l = nextInt(this.currentWorld.getHorizon(this.chunkPos.add(j, 0, k)).getY() * 2);
            this.mushroomBrownGen.generate(this.currentWorld, this.randomGenerator, this.chunkPos.add(j, l, k));
        }

        if (doGen && this.randomGenerator.nextInt(8) == 0)
        {
            j = this.randomGenerator.nextInt(16) + 8;
            k = this.randomGenerator.nextInt(16) + 8;
            l = nextInt(this.currentWorld.getHorizon(this.chunkPos.add(j, 0, k)).getY() * 2);
            this.mushroomRedGen.generate(this.currentWorld, this.randomGenerator, this.chunkPos.add(j, l, k));
        }

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunkPos, REED);
        for (j = 0; doGen && j < this.reedsPerChunk; ++j)
        {
            k = this.randomGenerator.nextInt(16) + 8;
            l = this.randomGenerator.nextInt(16) + 8;
            i1 = nextInt(this.currentWorld.getHorizon(this.chunkPos.add(k, 0, l)).getY() * 2);
            this.reedGen.generate(this.currentWorld, this.randomGenerator, this.chunkPos.add(k, i1, l));
        }

        for (j = 0; doGen && j < 10; ++j)
        {
            k = this.randomGenerator.nextInt(16) + 8;
            l = this.randomGenerator.nextInt(16) + 8;
            i1 = nextInt(this.currentWorld.getHorizon(this.chunkPos.add(k, 0, l)).getY() * 2);
            this.reedGen.generate(this.currentWorld, this.randomGenerator, this.chunkPos.add(k, i1, l));
        }

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunkPos, PUMPKIN);
        if (doGen && this.randomGenerator.nextInt(32) == 0)
        {
            j = this.randomGenerator.nextInt(16) + 8;
            k = this.randomGenerator.nextInt(16) + 8;
            l = nextInt(this.currentWorld.getHorizon(this.chunkPos.add(j, 0, k)).getY() * 2);
            (new WorldGenPumpkin()).generate(this.currentWorld, this.randomGenerator, this.chunkPos.add(j, l, k));
        }

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunkPos, CACTUS);
        for (j = 0; doGen && j < this.cactiPerChunk; ++j)
        {
            k = this.randomGenerator.nextInt(16) + 8;
            l = this.randomGenerator.nextInt(16) + 8;
            i1 = nextInt(this.currentWorld.getHorizon(this.chunkPos.add(k, 0, l)).getY() * 2);
            this.cactusGen.generate(this.currentWorld, this.randomGenerator, this.chunkPos.add(k, i1, l));
        }


         */
		MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Post(currentWorld, randomGenerator, chunkPos));
	}
	
	private int nextInt(Random randomGenerator, int i)
	{ //Safety wrapper to prevent exceptions.
		if(i <= 1)
			return 0;
		return randomGenerator.nextInt(i);
	}
}
