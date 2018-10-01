package com.flansmod.apocalypse.common.world;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class BiomeApocalypse extends Biome
{
	public static Biome deepCanyon, canyon, desert, plateau, highPlateau;
	public static Biome sulphurPits;
	
	public static void registerBiomes()
	{
		deepCanyon = new BiomeDesertCanyon((new Biome.BiomeProperties("Deep Canyon")).setWaterColor(6316128).setBaseHeight(-1.8F).setHeightVariation(0F).setTemperature(2F).setRainfall(0F).setRainDisabled());
		canyon = new BiomeDesertCanyon((new Biome.BiomeProperties("Canyon")).setWaterColor(6316128).setBaseHeight(-1F).setHeightVariation(0F).setTemperature(2F).setRainfall(0F).setRainDisabled());
		desert = new BiomeDesertCanyon((new Biome.BiomeProperties("Desert")).setWaterColor(6316128).setBaseHeight(0F).setHeightVariation(0F).setTemperature(2F).setRainfall(0F).setRainDisabled());
		plateau = new BiomeDesertCanyon((new Biome.BiomeProperties("Plateau")).setWaterColor(6316128).setBaseHeight(1F).setHeightVariation(0F).setTemperature(2F).setRainfall(0F).setRainDisabled());
		highPlateau = new BiomeDesertCanyon((new Biome.BiomeProperties("High Plateau")).setWaterColor(6316128).setBaseHeight(2.5F).setHeightVariation(0F).setTemperature(2F).setRainfall(0F).setRainDisabled());
		
		sulphurPits = new BiomeSulphurPits((new Biome.BiomeProperties("Sulphur Pits")).setWaterColor(6316128).setBaseHeight(-1.8F).setHeightVariation(0F).setTemperature(2F).setRainfall(0F).setRainDisabled());
		
		deepCanyon.setRegistryName("deepCanyon_apocalypse");
		canyon.setRegistryName("canyon_apocalypse");
		desert.setRegistryName("desert_apocalypse");
		plateau.setRegistryName("plateau_apocalypse");
		highPlateau.setRegistryName("highPlateau_apocalypse");
		sulphurPits.setRegistryName("sulphurPits_apocalypse");
		
		
		//addBiomes(deepCanyon, canyon, desert, plateau, highPlateau, sulphurPits);
	}
	
	private static void addBiomes(Biome... biomes)
	{
		for(Biome biome : biomes)
		{
			BiomeManager.addBiome(BiomeType.DESERT, new BiomeEntry(biome, 1));
			BiomeManager.removeSpawnBiome(biome);
		}
	}
	
	public BiomeApocalypse(Biome.BiomeProperties properties)
	{
		super(properties);
		
		this.spawnableCreatureList.clear();
		topBlock = Blocks.SAND.getStateFromMeta(1);
		fillerBlock = Blocks.SAND.getStateFromMeta(1);
		this.decorator.treesPerChunk = -999;
		this.decorator.deadBushPerChunk = 0;
		this.decorator.reedsPerChunk = 0;
		this.decorator.cactiPerChunk = 0;
		
		this.decorator = new BiomeDecoratorApocalypse();
	}
	
	@Override
	public void genTerrainBlocks(World worldIn, Random p_180622_2_, ChunkPrimer p_180622_3_, int p_180622_4_, int p_180622_5_, double p_180622_6_)
	{
		this.generateBiomeTerrainSandy(worldIn, p_180622_2_, p_180622_3_, p_180622_4_, p_180622_5_, p_180622_6_);
	}
	
	public final void generateBiomeTerrainSandy(World world, Random rand, ChunkPrimer primer, int x, int z, double p_180628_6_)
	{
		boolean flag = true;
		IBlockState iblockstate = this.topBlock;
		IBlockState iblockstate1 = this.fillerBlock;
		int k = -1;
		int l = (int)(p_180628_6_ / 3.0D + 3.0D + rand.nextDouble() * 0.25D);
		int i1 = x & 15;
		int j1 = z & 15;
		
		for(int k1 = 255; k1 >= 0; --k1)
		{
			if(k1 <= rand.nextInt(5))
			{
				primer.setBlockState(j1, k1, i1, Blocks.BEDROCK.getDefaultState());
			}
			else
			{
				IBlockState iblockstate2 = primer.getBlockState(j1, k1, i1);
				
				if(iblockstate2.getMaterial() == Material.AIR)
				{
					k = -1;
				}
				else if(iblockstate2.getBlock() == Blocks.STONE)
				{
					if(k == -1)
					{
						if(l <= 0)
						{
							iblockstate = null;
							iblockstate1 = Blocks.STONE.getDefaultState();
						}
						else if(k1 >= 59 && k1 <= 64)
						{
							iblockstate = this.topBlock;
							iblockstate1 = this.fillerBlock;
						}
						
						k = l;
						
						if(k1 >= 62)
						{
							primer.setBlockState(j1, k1, i1, iblockstate);
						}
						//else if (k1 < 56 - l)
						//{
						//    iblockstate = null;
						//    iblockstate1 = Blocks.STONE.getDefaultState();
						//    primer.setBlockState(j1, k1, i1, Blocks.GRAVEL.getDefaultState());
						//}
						else
						{
							primer.setBlockState(j1, k1, i1, iblockstate1);
						}
					}
					else if(k > 0)
					{
						--k;
						primer.setBlockState(j1, k1, i1, iblockstate1);

                        /*
                        if (k == 0 && iblockstate1.getBlock() == Blocks.SAND)
                        {
                            k = rand.nextInt(4) + Math.max(0, k1 - 63);
                            iblockstate1 = iblockstate1.getValue(BlockSand.VARIANT) == BlockSand.EnumType.RED_SAND ? Blocks.red_sandstone.getDefaultState() : Blocks.SANDstone.getDefaultState();
                        }
                        */
					}
				}
			}
		}
	}
	
}
