package com.flansmod.apocalypse.common.world;

import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.BIG_SHROOM;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.CACTUS;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.CLAY;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.DEAD_BUSH;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FLOWERS;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.LAKE_LAVA;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.LAKE_WATER;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.LILYPAD;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.PUMPKIN;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.REED;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.SAND;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.SAND_PASS2;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.SHROOM;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.TREE;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.ANDESITE;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.COAL;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.DIAMOND;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.DIORITE;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.DIRT;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.GOLD;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.GRANITE;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.GRAVEL;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.IRON;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.LAPIS;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.REDSTONE;

import java.util.Random;

import com.flansmod.apocalypse.common.FlansModApocalypse;

import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockStone;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.ChunkProviderSettings;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenDeadBush;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenLiquids;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenPumpkin;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

public class BiomeDecoratorApocalypse extends BiomeDecorator 
{
	public boolean generateSulphurLakes = false;
	
    public void decorate(World worldIn, Random p_180292_2_, BiomeGenBase p_180292_3_, BlockPos p_180292_4_)
    {
        if (this.currentWorld != null)
        {
            throw new RuntimeException("Already decorating");
        }
        else
        {
            this.currentWorld = worldIn;
            String s = worldIn.getWorldInfo().getGeneratorOptions();

            if (s != null)
            {
                this.chunkProviderSettings = ChunkProviderSettings.Factory.jsonToFactory(s).func_177864_b();
            }
            else
            {
                this.chunkProviderSettings = ChunkProviderSettings.Factory.jsonToFactory("").func_177864_b();
            }

            this.randomGenerator = p_180292_2_;
            this.field_180294_c = p_180292_4_;
            this.dirtGen = new WorldGenMinable(Blocks.dirt.getDefaultState(), 8);
            this.clayGen = new WorldGenMinable(Blocks.clay.getDefaultState(), 30);
            this.gravelGen = new WorldGenMinable(Blocks.gravel.getDefaultState(), 25);
            this.graniteGen = new WorldGenMinable(Blocks.stone.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.GRANITE), this.chunkProviderSettings.graniteSize);
            this.dioriteGen = new WorldGenMinable(Blocks.stone.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.DIORITE), this.chunkProviderSettings.dioriteSize);
            this.andesiteGen = new WorldGenMinable(Blocks.stone.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.ANDESITE), this.chunkProviderSettings.andesiteSize);
            this.coalGen = new WorldGenMinable(Blocks.coal_ore.getDefaultState(), 8);
            this.ironGen = new WorldGenMinable(Blocks.iron_ore.getDefaultState(), 25);
            this.goldGen = new WorldGenMinable(Blocks.gold_ore.getDefaultState(), this.chunkProviderSettings.goldSize);
            this.redstoneGen = new WorldGenMinable(Blocks.redstone_ore.getDefaultState(), 16);
            this.diamondGen = new WorldGenMinable(Blocks.diamond_ore.getDefaultState(), 8);
            this.lapisGen = new WorldGenMinable(Blocks.lapis_ore.getDefaultState(), this.chunkProviderSettings.lapisSize);
            this.genDecorations(p_180292_3_);
            this.currentWorld = null;
            this.randomGenerator = null;
        }
    }
    
    protected void genDecorations(BiomeGenBase biome)
    {
        MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(currentWorld, randomGenerator, field_180294_c));
        //Forge generation hook
        boolean doGen;
        int i, j, k;
        
        if(this.generateSulphurLakes)
        {
            BlockPos blockpos1;

            doGen = TerrainGen.decorate(currentWorld, randomGenerator, field_180294_c, LAKE_WATER);
            for(j = 0; doGen && j < 15; ++j)
            {
                blockpos1 = this.field_180294_c.add(this.randomGenerator.nextInt(16) + 8, this.randomGenerator.nextInt(10) + 30, this.randomGenerator.nextInt(16) + 8);
                (new WorldGenSulphurPool(FlansModApocalypse.blockSulphuricAcid)).generate(this.currentWorld, this.randomGenerator, blockpos1);
            }
        }
        
        //Ore generation
        MinecraftForge.ORE_GEN_BUS.post(new OreGenEvent.Pre(currentWorld, randomGenerator, field_180294_c));
        
        //Generic generation
        //First parameter is the amount of ore veins, second is the generator, third and fourth are min and max height
        genStandardOre1(5, this.dirtGen, 12, 34);
        genStandardOre1(5, this.gravelGen, 36, 64);
        genStandardOre1(2, this.dioriteGen, 60, 100);
        genStandardOre1(2, this.graniteGen, 60, 100);
        genStandardOre1(1, this.andesiteGen, 60, 100);
        
    	genStandardOre1(20, this.ironGen, 5, 128);
      
        if(biome == BiomeGenApocalypse.highPlateau)
        {
        	genStandardOre1(1, this.diamondGen, 95, 128);
        	genStandardOre1(1, this.goldGen, 50, 90);
        	genStandardOre2(2, this.lapisGen, 70, 32);
        	genStandardOre1(10, this.redstoneGen, 30, 60);
        }
        else if(biome == BiomeGenApocalypse.sulphurPits)
        {
        	genStandardOre1(15, this.coalGen, 0, 25);
        }

        MinecraftForge.ORE_GEN_BUS.post(new OreGenEvent.Post(currentWorld, randomGenerator, field_180294_c));
        
        /*
        this.generateOres();
        int i;
        int j;
        int k;

        boolean doGen = TerrainGen.decorate(currentWorld, randomGenerator, field_180294_c, SAND);
        for (i = 0; doGen && i < this.sandPerChunk2; ++i)
        {
            j = this.randomGenerator.nextInt(16) + 8;
            k = this.randomGenerator.nextInt(16) + 8;
            this.sandGen.generate(this.currentWorld, this.randomGenerator, this.currentWorld.getTopSolidOrLiquidBlock(this.field_180294_c.add(j, 0, k)));
        }

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, field_180294_c, CLAY);
        for (i = 0; doGen && i < this.clayPerChunk; ++i)
        {
            j = this.randomGenerator.nextInt(16) + 8;
            k = this.randomGenerator.nextInt(16) + 8;
            this.clayGen.generate(this.currentWorld, this.randomGenerator, this.currentWorld.getTopSolidOrLiquidBlock(this.field_180294_c.add(j, 0, k)));
        }

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, field_180294_c, SAND_PASS2);
        for (i = 0; doGen && i < this.sandPerChunk; ++i)
        {
            j = this.randomGenerator.nextInt(16) + 8;
            k = this.randomGenerator.nextInt(16) + 8;
            this.gravelAsSandGen.generate(this.currentWorld, this.randomGenerator, this.currentWorld.getTopSolidOrLiquidBlock(this.field_180294_c.add(j, 0, k)));
        }

        i = this.treesPerChunk;

        if (this.randomGenerator.nextInt(10) == 0)
        {
            ++i;
        }

        int l;
        BlockPos blockpos;

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, field_180294_c, TREE);
        for (j = 0; doGen && j < i; ++j)
        {
            k = this.randomGenerator.nextInt(16) + 8;
            l = this.randomGenerator.nextInt(16) + 8;
            WorldGenAbstractTree worldgenabstracttree = p_150513_1_.genBigTreeChance(this.randomGenerator);
            worldgenabstracttree.func_175904_e();
            blockpos = this.currentWorld.getHorizon(this.field_180294_c.add(k, 0, l));

            if (worldgenabstracttree.generate(this.currentWorld, this.randomGenerator, blockpos))
            {
                worldgenabstracttree.func_180711_a(this.currentWorld, this.randomGenerator, blockpos);
            }
        }

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, field_180294_c, BIG_SHROOM);
        for (j = 0; doGen && j < this.bigMushroomsPerChunk; ++j)
        {
            k = this.randomGenerator.nextInt(16) + 8;
            l = this.randomGenerator.nextInt(16) + 8;
            this.bigMushroomGen.generate(this.currentWorld, this.randomGenerator, this.currentWorld.getHorizon(this.field_180294_c.add(k, 0, l)));
        }

        int i1;

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, field_180294_c, FLOWERS);
        for (j = 0; doGen && j < this.flowersPerChunk; ++j)
        {
            k = this.randomGenerator.nextInt(16) + 8;
            l = this.randomGenerator.nextInt(16) + 8;
            i1 = nextInt(this.currentWorld.getHorizon(this.field_180294_c.add(k, 0, l)).getY() + 32);
            blockpos = this.field_180294_c.add(k, i1, l);
            BlockFlower.EnumFlowerType enumflowertype = p_150513_1_.pickRandomFlower(this.randomGenerator, blockpos);
            BlockFlower blockflower = enumflowertype.getBlockType().getBlock();

            if (blockflower.getMaterial() != Material.air)
            {
                this.yellowFlowerGen.setGeneratedBlock(blockflower, enumflowertype);
                this.yellowFlowerGen.generate(this.currentWorld, this.randomGenerator, blockpos);
            }
        }

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, field_180294_c, GRASS);
        for (j = 0; doGen && j < this.grassPerChunk; ++j)
        {
            k = this.randomGenerator.nextInt(16) + 8;
            l = this.randomGenerator.nextInt(16) + 8;
            i1 = nextInt(this.currentWorld.getHorizon(this.field_180294_c.add(k, 0, l)).getY() * 2);
            p_150513_1_.getRandomWorldGenForGrass(this.randomGenerator).generate(this.currentWorld, this.randomGenerator, this.field_180294_c.add(k, i1, l));
        }

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, field_180294_c, DEAD_BUSH);
        for (j = 0; doGen && j < this.deadBushPerChunk; ++j)
        {
            k = this.randomGenerator.nextInt(16) + 8;
            l = this.randomGenerator.nextInt(16) + 8;
            i1 = nextInt(this.currentWorld.getHorizon(this.field_180294_c.add(k, 0, l)).getY() * 2);
            (new WorldGenDeadBush()).generate(this.currentWorld, this.randomGenerator, this.field_180294_c.add(k, i1, l));
        }

        j = 0;

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, field_180294_c, LILYPAD);
        while (doGen && j < this.waterlilyPerChunk)
        {
            k = this.randomGenerator.nextInt(16) + 8;
            l = this.randomGenerator.nextInt(16) + 8;
            i1 = nextInt(this.currentWorld.getHorizon(this.field_180294_c.add(k, 0, l)).getY() * 2);
            blockpos = this.field_180294_c.add(k, i1, l);

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

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, field_180294_c, SHROOM);
        for (j = 0; doGen && j < this.mushroomsPerChunk; ++j)
        {
            if (this.randomGenerator.nextInt(4) == 0)
            {
                k = this.randomGenerator.nextInt(16) + 8;
                l = this.randomGenerator.nextInt(16) + 8;
                BlockPos blockpos2 = this.currentWorld.getHorizon(this.field_180294_c.add(k, 0, l));
                this.mushroomBrownGen.generate(this.currentWorld, this.randomGenerator, blockpos2);
            }

            if (this.randomGenerator.nextInt(8) == 0)
            {
                k = this.randomGenerator.nextInt(16) + 8;
                l = this.randomGenerator.nextInt(16) + 8;
                i1 = nextInt(this.currentWorld.getHorizon(this.field_180294_c.add(k, 0, l)).getY() * 2);
                blockpos = this.field_180294_c.add(k, i1, l);
                this.mushroomRedGen.generate(this.currentWorld, this.randomGenerator, blockpos);
            }
        }

        if (doGen && this.randomGenerator.nextInt(4) == 0)
        {
            j = this.randomGenerator.nextInt(16) + 8;
            k = this.randomGenerator.nextInt(16) + 8;
            l = nextInt(this.currentWorld.getHorizon(this.field_180294_c.add(j, 0, k)).getY() * 2);
            this.mushroomBrownGen.generate(this.currentWorld, this.randomGenerator, this.field_180294_c.add(j, l, k));
        }

        if (doGen && this.randomGenerator.nextInt(8) == 0)
        {
            j = this.randomGenerator.nextInt(16) + 8;
            k = this.randomGenerator.nextInt(16) + 8;
            l = nextInt(this.currentWorld.getHorizon(this.field_180294_c.add(j, 0, k)).getY() * 2);
            this.mushroomRedGen.generate(this.currentWorld, this.randomGenerator, this.field_180294_c.add(j, l, k));
        }

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, field_180294_c, REED);
        for (j = 0; doGen && j < this.reedsPerChunk; ++j)
        {
            k = this.randomGenerator.nextInt(16) + 8;
            l = this.randomGenerator.nextInt(16) + 8;
            i1 = nextInt(this.currentWorld.getHorizon(this.field_180294_c.add(k, 0, l)).getY() * 2);
            this.reedGen.generate(this.currentWorld, this.randomGenerator, this.field_180294_c.add(k, i1, l));
        }

        for (j = 0; doGen && j < 10; ++j)
        {
            k = this.randomGenerator.nextInt(16) + 8;
            l = this.randomGenerator.nextInt(16) + 8;
            i1 = nextInt(this.currentWorld.getHorizon(this.field_180294_c.add(k, 0, l)).getY() * 2);
            this.reedGen.generate(this.currentWorld, this.randomGenerator, this.field_180294_c.add(k, i1, l));
        }

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, field_180294_c, PUMPKIN);
        if (doGen && this.randomGenerator.nextInt(32) == 0)
        {
            j = this.randomGenerator.nextInt(16) + 8;
            k = this.randomGenerator.nextInt(16) + 8;
            l = nextInt(this.currentWorld.getHorizon(this.field_180294_c.add(j, 0, k)).getY() * 2);
            (new WorldGenPumpkin()).generate(this.currentWorld, this.randomGenerator, this.field_180294_c.add(j, l, k));
        }

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, field_180294_c, CACTUS);
        for (j = 0; doGen && j < this.cactiPerChunk; ++j)
        {
            k = this.randomGenerator.nextInt(16) + 8;
            l = this.randomGenerator.nextInt(16) + 8;
            i1 = nextInt(this.currentWorld.getHorizon(this.field_180294_c.add(k, 0, l)).getY() * 2);
            this.cactusGen.generate(this.currentWorld, this.randomGenerator, this.field_180294_c.add(k, i1, l));
        }


         */
        MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Post(currentWorld, randomGenerator, field_180294_c));
    }
    
    private int nextInt(int i) { //Safety wrapper to prevent exceptions.
        if (i <= 1)
            return 0;
        return this.randomGenerator.nextInt(i);
   }
}
