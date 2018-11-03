package com.flansmod.apocalypse.common.world;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldEntitySpawner;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.MapGenRavine;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.NoiseGeneratorPerlin;
import net.minecraft.world.gen.feature.WorldGenDungeons;
import net.minecraft.world.gen.structure.MapGenMineshaft;

import com.flansmod.apocalypse.common.FlansModApocalypse;
import com.flansmod.apocalypse.common.world.buildings.MapGenAbandonedVillage;
import com.flansmod.apocalypse.common.world.buildings.WorldGenDeadTree;
import com.flansmod.apocalypse.common.world.buildings.WorldGenDyeFactory;
import com.flansmod.apocalypse.common.world.buildings.WorldGenResearchLab;
import com.flansmod.apocalypse.common.world.buildings.WorldGenRunway;
import com.flansmod.apocalypse.common.world.buildings.WorldGenSkeleton;
import com.flansmod.common.ModuloHelper;

public class ChunkProviderApocalypse implements IChunkGenerator
{
	protected static final IBlockState STONE = Blocks.STONE.getDefaultState();
	private final Random rand;
	private NoiseGeneratorOctaves minLimitPerlinNoise;
	private NoiseGeneratorOctaves maxLimitPerlinNoise;
	private NoiseGeneratorOctaves mainPerlinNoise;
	private NoiseGeneratorPerlin surfaceNoise;
	public NoiseGeneratorOctaves scaleNoise;
	public NoiseGeneratorOctaves depthNoise;
	public NoiseGeneratorOctaves forestNoise;
	private final World world;
	private final boolean mapFeaturesEnabled;
	private final WorldType terrainType;
	private final double[] heightMap;
	private final float[] biomeWeights;
	private IBlockState oceanBlock = Blocks.WATER.getDefaultState();
	private double[] depthBuffer = new double[256];
	private MapGenAbandonedVillage villageGenerator = new MapGenAbandonedVillage();
	private MapGenMineshaft mineshaftGenerator = new MapGenMineshaft();
	private MapGenBase ravineGenerator = new MapGenRavine();
	private Biome[] biomesForGeneration;
	double[] mainNoiseRegion;
	double[] minLimitRegion;
	double[] maxLimitRegion;
	double[] depthRegion;
	
	private WorldGenDyeFactory dyeFactoryGenerator = new WorldGenDyeFactory();
	private WorldGenRunway runwayGenerator = new WorldGenRunway();
	private WorldGenSkeleton skeletonGenerator = new WorldGenSkeleton();
	private WorldGenDeadTree deadTreeGenerator = new WorldGenDeadTree();
	public static List<Biome> runwaySpawnBiome = Arrays.asList(BiomeApocalypse.highPlateau);
	private WorldGenResearchLab researchLabGenerator = new WorldGenResearchLab();
	public static List<Biome> labSpawnBiome = Arrays.asList(BiomeApocalypse.highPlateau);
	
	private final int seaLevel = 24;
	private final float coordinateScale = 684.412F, heightScale = 684.412F;
	private final double depthNoiseScaleX = 200F, depthNoiseScaleZ = 200F, depthNoiseScaleExponent = 0.5F;
	private final float mainNoiseScaleX = 80F, mainNoiseScaleY = 160F, mainNoiseScaleZ = 80F;
	private final float biomeDepthOffSet = 0.0F, biomeScaleOffset = 0.0F;
	private final float biomeDepthWeight = 1.0F, biomeScaleWeight = 1.0F;
	private final double stretchY = 12.0F;
	private final double baseSize = 8.5F;
	private final float lowerLimitScale = 512F, upperLimitScale = 512F;
	private final float dungeonChance = 8F;
	
	public ChunkProviderApocalypse(World worldIn, long seed, boolean mapFeaturesEnabledIn)
	{
		{
			mineshaftGenerator = (MapGenMineshaft)net.minecraftforge.event.terraingen.TerrainGen.getModdedMapGen(mineshaftGenerator, net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.MINESHAFT);
			ravineGenerator = net.minecraftforge.event.terraingen.TerrainGen.getModdedMapGen(ravineGenerator, net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.RAVINE);
		}
		this.world = worldIn;
		this.mapFeaturesEnabled = mapFeaturesEnabledIn;
		this.terrainType = worldIn.getWorldInfo().getTerrainType();
		this.rand = new Random(seed);
		this.minLimitPerlinNoise = new NoiseGeneratorOctaves(this.rand, 16);
		this.maxLimitPerlinNoise = new NoiseGeneratorOctaves(this.rand, 16);
		this.mainPerlinNoise = new NoiseGeneratorOctaves(this.rand, 8);
		this.surfaceNoise = new NoiseGeneratorPerlin(this.rand, 4);
		this.scaleNoise = new NoiseGeneratorOctaves(this.rand, 10);
		this.depthNoise = new NoiseGeneratorOctaves(this.rand, 16);
		this.forestNoise = new NoiseGeneratorOctaves(this.rand, 8);
		this.heightMap = new double[825];
		this.biomeWeights = new float[25];
		
		for(int i = -2; i <= 2; ++i)
		{
			for(int j = -2; j <= 2; ++j)
			{
				float f = 10.0F / MathHelper.sqrt((float)(i * i + j * j) + 0.2F);
				this.biomeWeights[i + 2 + (j + 2) * 5] = f;
			}
		}
		
		worldIn.setSeaLevel(0);
		
		net.minecraftforge.event.terraingen.InitNoiseGensEvent.ContextOverworld ctx =
				new net.minecraftforge.event.terraingen.InitNoiseGensEvent.ContextOverworld(minLimitPerlinNoise, maxLimitPerlinNoise, mainPerlinNoise, surfaceNoise, scaleNoise, depthNoise, forestNoise);
		ctx = net.minecraftforge.event.terraingen.TerrainGen.getModdedNoiseGenerators(worldIn, this.rand, ctx);
		this.minLimitPerlinNoise = ctx.getLPerlin1();
		this.maxLimitPerlinNoise = ctx.getLPerlin2();
		this.mainPerlinNoise = ctx.getPerlin();
		this.surfaceNoise = ctx.getHeight();
		this.scaleNoise = ctx.getScale();
		this.depthNoise = ctx.getDepth();
		this.forestNoise = ctx.getForest();
	}
	
	public void setBlocksInChunk(int x, int z, ChunkPrimer primer)
	{
		this.biomesForGeneration = this.world.getBiomeProvider().getBiomesForGeneration(this.biomesForGeneration, x * 4 - 2, z * 4 - 2, 10, 10);
		this.generateHeightmap(x * 4, 0, z * 4);
		
		for(int i = 0; i < 4; ++i)
		{
			int j = i * 5;
			int k = (i + 1) * 5;
			
			for(int l = 0; l < 4; ++l)
			{
				int i1 = (j + l) * 33;
				int j1 = (j + l + 1) * 33;
				int k1 = (k + l) * 33;
				int l1 = (k + l + 1) * 33;
				
				for(int i2 = 0; i2 < 32; ++i2)
				{
					double d0 = 0.125D;
					double d1 = this.heightMap[i1 + i2];
					double d2 = this.heightMap[j1 + i2];
					double d3 = this.heightMap[k1 + i2];
					double d4 = this.heightMap[l1 + i2];
					double d5 = (this.heightMap[i1 + i2 + 1] - d1) * 0.125D;
					double d6 = (this.heightMap[j1 + i2 + 1] - d2) * 0.125D;
					double d7 = (this.heightMap[k1 + i2 + 1] - d3) * 0.125D;
					double d8 = (this.heightMap[l1 + i2 + 1] - d4) * 0.125D;
					
					for(int j2 = 0; j2 < 8; ++j2)
					{
						double d9 = 0.25D;
						double d10 = d1;
						double d11 = d2;
						double d12 = (d3 - d1) * 0.25D;
						double d13 = (d4 - d2) * 0.25D;
						
						for(int k2 = 0; k2 < 4; ++k2)
						{
							double d14 = 0.25D;
							double d16 = (d11 - d10) * 0.25D;
							double lvt_45_1_ = d10 - d16;
							
							for(int l2 = 0; l2 < 4; ++l2)
							{
								if((lvt_45_1_ += d16) > 0.0D)
								{
									primer.setBlockState(i * 4 + k2, i2 * 8 + j2, l * 4 + l2, STONE);
								}
							}
							
							d10 += d12;
							d11 += d13;
						}
						
						d1 += d5;
						d2 += d6;
						d3 += d7;
						d4 += d8;
					}
				}
			}
		}
	}
	
	public void replaceBiomeBlocks(int x, int z, ChunkPrimer primer, Biome[] biomesIn)
	{
		if(!net.minecraftforge.event.ForgeEventFactory.onReplaceBiomeBlocks(this, x, z, primer, this.world)) return;
		double d0 = 0.03125D;
		this.depthBuffer = this.surfaceNoise.getRegion(this.depthBuffer, (double)(x * 16), (double)(z * 16), 16, 16, 0.0625D, 0.0625D, 1.0D);
		
		for(int i = 0; i < 16; ++i)
		{
			for(int j = 0; j < 16; ++j)
			{
				Biome biome = biomesIn[j + i * 16];
				biome.genTerrainBlocks(this.world, this.rand, primer, x * 16 + i, z * 16 + j, this.depthBuffer[j + i * 16]);
			}
		}
	}
	
	/**
	 * Generates the chunk at the specified position, from scratch
	 */
	public Chunk generateChunk(int x, int z)
	{
		this.rand.setSeed((long)x * 341873128712L + (long)z * 132897987541L);
		ChunkPrimer chunkprimer = new ChunkPrimer();
		this.setBlocksInChunk(x, z, chunkprimer);
		this.biomesForGeneration = this.world.getBiomeProvider().getBiomes(this.biomesForGeneration, x * 16, z * 16, 16, 16);
		this.replaceBiomeBlocks(x, z, chunkprimer, this.biomesForGeneration);
		
		//this.ravineGenerator.generate(this.world, x, z, chunkprimer);
		this.mineshaftGenerator.generate(this.world, x, z, chunkprimer);
		this.villageGenerator.generate(this.world, x, z, chunkprimer);
		
		
		Chunk chunk = new Chunk(this.world, chunkprimer, x, z);
		byte[] abyte = chunk.getBiomeArray();
		
		for(int i = 0; i < abyte.length; ++i)
		{
			abyte[i] = (byte)Biome.getIdForBiome(this.biomesForGeneration[i]);
		}
		
		chunk.generateSkylightMap();
		return chunk;
	}
	
	private void generateHeightmap(int p_185978_1_, int p_185978_2_, int p_185978_3_)
	{
		this.depthRegion = this.depthNoise.generateNoiseOctaves(this.depthRegion, p_185978_1_, p_185978_3_, 5, 5, this.depthNoiseScaleX, this.depthNoiseScaleZ, this.depthNoiseScaleExponent);
		float f = this.coordinateScale;
		float f1 = this.heightScale;
		this.mainNoiseRegion = this.mainPerlinNoise.generateNoiseOctaves(this.mainNoiseRegion, p_185978_1_, p_185978_2_, p_185978_3_, 5, 33, 5, (double)(f / this.mainNoiseScaleX), (double)(f1 / this.mainNoiseScaleY), (double)(f / this.mainNoiseScaleZ));
		this.minLimitRegion = this.minLimitPerlinNoise.generateNoiseOctaves(this.minLimitRegion, p_185978_1_, p_185978_2_, p_185978_3_, 5, 33, 5, (double)f, (double)f1, (double)f);
		this.maxLimitRegion = this.maxLimitPerlinNoise.generateNoiseOctaves(this.maxLimitRegion, p_185978_1_, p_185978_2_, p_185978_3_, 5, 33, 5, (double)f, (double)f1, (double)f);
		int i = 0;
		int j = 0;
		
		for(int k = 0; k < 5; ++k)
		{
			for(int l = 0; l < 5; ++l)
			{
				float f2 = 0.0F;
				float f3 = 0.0F;
				float f4 = 0.0F;
				int i1 = 2;
				Biome biome = this.biomesForGeneration[k + 2 + (l + 2) * 10];
				
				for(int j1 = -2; j1 <= 2; ++j1)
				{
					for(int k1 = -2; k1 <= 2; ++k1)
					{
						Biome biome1 = this.biomesForGeneration[k + j1 + 2 + (l + k1 + 2) * 10];
						float f5 = this.biomeDepthOffSet + biome1.getBaseHeight() * this.biomeDepthWeight;
						float f6 = this.biomeScaleOffset + biome1.getHeightVariation() * this.biomeScaleWeight;
						
						if(this.terrainType == WorldType.AMPLIFIED && f5 > 0.0F)
						{
							f5 = 1.0F + f5 * 2.0F;
							f6 = 1.0F + f6 * 4.0F;
						}
						
						float f7 = this.biomeWeights[j1 + 2 + (k1 + 2) * 5] / (f5 + 2.0F);
						
						if(biome1.getBaseHeight() > biome.getBaseHeight())
						{
							f7 /= 2.0F;
						}
						
						f2 += f6 * f7;
						f3 += f5 * f7;
						f4 += f7;
					}
				}
				
				f2 = f2 / f4;
				f3 = f3 / f4;
				f2 = f2 * 0.9F + 0.1F;
				f3 = (f3 * 4.0F - 1.0F) / 8.0F;
				double d7 = this.depthRegion[j] / 8000.0D;
				
				if(d7 < 0.0D)
				{
					d7 = -d7 * 0.3D;
				}
				
				d7 = d7 * 3.0D - 2.0D;
				
				if(d7 < 0.0D)
				{
					d7 = d7 / 2.0D;
					
					if(d7 < -1.0D)
					{
						d7 = -1.0D;
					}
					
					d7 = d7 / 1.4D;
					d7 = d7 / 2.0D;
				}
				else
				{
					if(d7 > 1.0D)
					{
						d7 = 1.0D;
					}
					
					d7 = d7 / 8.0D;
				}
				
				++j;
				double d8 = (double)f3;
				double d9 = (double)f2;
				d8 = d8 + d7 * 0.2D;
				d8 = d8 * this.baseSize / 8.0D;
				double d0 = this.baseSize + d8 * 4.0D;
				
				for(int l1 = 0; l1 < 33; ++l1)
				{
					double d1 = ((double)l1 - d0) * this.stretchY * 128.0D / 256.0D / d9;
					
					if(d1 < 0.0D)
					{
						d1 *= 4.0D;
					}
					
					double d2 = this.minLimitRegion[i] / (double)this.lowerLimitScale;
					double d3 = this.maxLimitRegion[i] / (double)this.upperLimitScale;
					double d4 = (this.mainNoiseRegion[i] / 10.0D + 1.0D) / 2.0D;
					double d5 = MathHelper.clampedLerp(d2, d3, d4) - d1;
					
					if(l1 > 29)
					{
						double d6 = (double)((float)(l1 - 29) / 3.0F);
						d5 = d5 * (1.0D - d6) + -10.0D * d6;
					}
					
					this.heightMap[i] = d5;
					++i;
				}
			}
		}
	}
	
	/**
	 * Generate initial structures in this chunk, e.g. mineshafts, temples, lakes, and dungeons
	 */
	public void populate(int x, int z)
	{
		BlockFalling.fallInstantly = true;
		int i = x * 16;
		int j = z * 16;
		BlockPos blockpos = new BlockPos(i, 0, j);
		Biome biome = this.world.getBiome(blockpos.add(16, 0, 16));
		this.rand.setSeed(this.world.getSeed());
		long k = this.rand.nextLong() / 2L * 2L + 1L;
		long l = this.rand.nextLong() / 2L * 2L + 1L;
		this.rand.setSeed((long)x * k + (long)z * l ^ this.world.getSeed());
		boolean flag = false;
		ChunkPos chunkpos = new ChunkPos(x, z);
		
		net.minecraftforge.event.ForgeEventFactory.onChunkPopulate(true, this, this.world, this.rand, x, z, flag);
		int k1;
		int l1;
		int i2;
		if(rand.nextInt(FlansModApocalypse.SKELETON_RARITY) == 0)
		{
			k1 = this.rand.nextInt(16) + 8;
			l1 = this.rand.nextInt(this.rand.nextInt(248) + 8);
			i2 = this.rand.nextInt(16) + 8;
			skeletonGenerator.generate(world, rand, blockpos.add(k1, l1, i2));
		}
		
		if(rand.nextInt(FlansModApocalypse.DEAD_TREE_RARITY) == 0)
		{
			k1 = this.rand.nextInt(16) + 8;
			l1 = this.rand.nextInt(this.rand.nextInt(248) + 8);
			i2 = this.rand.nextInt(16) + 8;
			deadTreeGenerator.generate(world, rand, blockpos.add(k1, l1, i2));
		}
		
		
		if(rand.nextInt(FlansModApocalypse.DYE_FACTORY_RARITY) == 0)
		{
			k1 = this.rand.nextInt(16) + 8;
			l1 = this.rand.nextInt(this.rand.nextInt(248) + 8);
			i2 = this.rand.nextInt(16) + 8;
			dyeFactoryGenerator.generate(world, rand, blockpos.add(k1, l1, i2));
		}
		
		if(this.mapFeaturesEnabled)
		{
			this.mineshaftGenerator.generateStructure(this.world, this.rand, chunkpos);
			flag = this.villageGenerator.generateStructure(this.world, this.rand, chunkpos);
		}
		
		if(net.minecraftforge.event.terraingen.TerrainGen.populate(this, this.world, this.rand, x, z, flag, net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.DUNGEON))
		{
			for(int j2 = 0; j2 < this.dungeonChance; ++j2)
			{
				int i3 = this.rand.nextInt(16) + 8;
				int l3 = this.rand.nextInt(256);
				int g = this.rand.nextInt(16) + 8;
				(new WorldGenDungeons()).generate(this.world, this.rand, blockpos.add(i3, l3, g));
			}
		}
		
		biome.decorate(this.world, this.rand, new BlockPos(i, 0, j));
		if(net.minecraftforge.event.terraingen.TerrainGen.populate(this, this.world, this.rand, x, z, flag, net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.ANIMALS))
			WorldEntitySpawner.performWorldGenSpawning(this.world, biome, i + 8, j + 8, 16, 16, this.rand);
		blockpos = blockpos.add(8, 0, 8);
		
		net.minecraftforge.event.ForgeEventFactory.onChunkPopulate(false, this, this.world, this.rand, x, z, flag);
		
		int xOrigin = ModuloHelper.divide(x, 4);
		
		this.rand.setSeed(this.world.getSeed());
		k = this.rand.nextLong() / 2L * 2L + 1L;
		l = this.rand.nextLong() / 2L * 2L + 1L;
		this.rand.setSeed((long)xOrigin * k + (long)z * l ^ this.world.getSeed());
		
		if(rand.nextInt(FlansModApocalypse.AIRPORT_RARITY) == 0)
		{
			boolean canSpawn = true;
			for(int n = 0; n < 4; n++)
			{
				if(!world.getBiomeProvider().areBiomesViable((xOrigin * 4 + n) * 16 + 8, z * 16 + 8, 0, runwaySpawnBiome))
					canSpawn = false;
			}
			//Generate runway section xOffset at chunk x
			if(canSpawn)
				runwayGenerator.generate(world, rand, new BlockPos(x * 16, 0, z * 16));
		}
		
		xOrigin = ModuloHelper.divide(x, 3);
		int zOrigin = ModuloHelper.divide(z, 3);
		
		this.rand.setSeed(this.world.getSeed());
		k = this.rand.nextLong() / 2L * 2L + 1L;
		l = this.rand.nextLong() / 2L * 2L + 1L;
		this.rand.setSeed((long)xOrigin * k + (long)zOrigin * l ^ this.world.getSeed());
		
		if(rand.nextInt(FlansModApocalypse.LAB_RARITY) == 0)
		{
			boolean canSpawn = true;
			for(int n = 0; n < 5; n++)
			{
				for(int m = 0; m < 5; m++)
				{
					if(!world.getBiomeProvider().areBiomesViable((xOrigin * 3 - 1 + n) * 16 + 8, (zOrigin * 3 - 1 + m) * 16 + 8, 0, labSpawnBiome))
						canSpawn = false;
				}
			}
			//Generate lab rooms in chunk
			if(canSpawn)
			{
				//Reset random seed
				this.rand.setSeed(this.world.getSeed());
				k = this.rand.nextLong() / 2L * 2L + 1L;
				l = this.rand.nextLong() / 2L * 2L + 1L;
				this.rand.setSeed((long)x * k + (long)z * l ^ this.world.getSeed());
				researchLabGenerator.generate(world, rand, new BlockPos(x * 16, 0, z * 16));
			}
		}
		
		
		BlockFalling.fallInstantly = false;
	}
	
	/**
	 * Called to generate additional structures after initial worldgen, used by ocean monuments
	 */
	public boolean generateStructures(Chunk chunkIn, int x, int z)
	{
		
		return false;
	}
	
	public List<Biome.SpawnListEntry> getPossibleCreatures(EnumCreatureType creatureType, BlockPos pos)
	{
		Biome biome = this.world.getBiome(pos);
		
		return biome.getSpawnableList(creatureType);
	}
	
	public boolean isInsideStructure(World worldIn, String structureName, BlockPos pos)
	{
		if(!this.mapFeaturesEnabled)
		{
			return false;
		}
		else if("Village".equals(structureName) && this.villageGenerator != null)
		{
			return this.villageGenerator.isInsideStructure(pos);
		}
		else if("Mineshaft".equals(structureName) && this.mineshaftGenerator != null)
		{
			return this.mineshaftGenerator.isInsideStructure(pos);
		}
		else
		{
			return false;
		}
	}
	
	@Nullable
	public BlockPos getNearestStructurePos(World worldIn, String structureName, BlockPos position, boolean findUnexplored)
	{
		if(!this.mapFeaturesEnabled)
		{
			return null;
		}
		else if("Village".equals(structureName) && this.villageGenerator != null)
		{
			return this.villageGenerator.getNearestStructurePos(worldIn, position, findUnexplored);
		}
		else if("Mineshaft".equals(structureName) && this.mineshaftGenerator != null)
		{
			return this.mineshaftGenerator.getNearestStructurePos(worldIn, position, findUnexplored);
		}
		else
		{
			return null;
		}
	}
	
	/**
	 * Recreates data about structures intersecting given chunk (used for example by getPossibleCreatures), without
	 * placing any blocks. When called for the first time before any chunk is generated - also initializes the internal
	 * state needed by getPossibleCreatures.
	 */
	public void recreateStructures(Chunk chunkIn, int x, int z)
	{
		if(this.mapFeaturesEnabled)
		{
			this.mineshaftGenerator.generate(this.world, x, z, null);
			this.villageGenerator.generate(this.world, x, z, null);
		}
	}
}
