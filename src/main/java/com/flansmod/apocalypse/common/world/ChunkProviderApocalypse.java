package com.flansmod.apocalypse.common.world;

import static net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.ANIMALS;
import static net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.DUNGEON;
import static net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.ICE;
import static net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.LAKE;
import static net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.LAVA;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.flansmod.apocalypse.common.FlansModApocalypse;
import com.flansmod.apocalypse.common.entity.EntitySurvivor;
import com.flansmod.apocalypse.common.world.buildings.MapGenAbandonedVillage;
import com.flansmod.apocalypse.common.world.buildings.WorldGenDeadTree;
import com.flansmod.apocalypse.common.world.buildings.WorldGenDyeFactory;
import com.flansmod.apocalypse.common.world.buildings.WorldGenResearchLab;
import com.flansmod.apocalypse.common.world.buildings.WorldGenRunway;
import com.flansmod.apocalypse.common.world.buildings.WorldGenSkeleton;
import com.flansmod.common.ModuloHelper;
import com.flansmod.common.driveables.DriveableData;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.types.EnumType;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.world.SpawnerAnimals;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderSettings;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.NoiseGeneratorPerlin;
import net.minecraft.world.gen.feature.WorldGenDungeons;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.ChunkProviderEvent;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.fml.common.eventhandler.Event.Result;

public class ChunkProviderApocalypse implements IChunkProvider 
{
	private Random rand;
	private NoiseGeneratorOctaves noiseGen1;
	private NoiseGeneratorOctaves noiseGen2;
	private NoiseGeneratorOctaves noiseGen3;
	private NoiseGeneratorPerlin noiseGen4;
	public NoiseGeneratorOctaves noiseGen5;
	public NoiseGeneratorOctaves noiseGen6;
	public NoiseGeneratorOctaves mobSpawnerNoise;
	private World worldObj;
	private double[] noiseArray;
	private double[] stoneNoise = new double[256];
	//private MapGenBase caveGenerator = new MapGenCaves();
	//private MapGenStronghold strongholdGenerator = new MapGenStronghold();
	private MapGenAbandonedVillage villageGenerator = new MapGenAbandonedVillage();
	//private MapGenMineshaft mineshaftGenerator = new MapGenMineshaft();
	//private MapGenScatteredFeature scatteredFeatureGenerator = new MapGenScatteredFeature();
	//private MapGenBase ravineGenerator = new MapGenRavine();
	
	private WorldGenDyeFactory dyeFactoryGenerator = new WorldGenDyeFactory();
	private WorldGenRunway runwayGenerator = new WorldGenRunway();	
	private WorldGenSkeleton skeletonGenerator = new WorldGenSkeleton();
	private WorldGenDeadTree deadTreeGenerator = new WorldGenDeadTree();
	public static List<BiomeGenBase> runwaySpawnBiome = Arrays.asList(new BiomeGenBase[] {BiomeGenApocalypse.highPlateau});
	private WorldGenResearchLab researchLabGenerator = new WorldGenResearchLab();
	public static List<BiomeGenBase> labSpawnBiome = Arrays.asList(new BiomeGenBase[] {BiomeGenApocalypse.highPlateau});
	
	
	private BiomeGenBase[] biomesForGeneration;
	double[] noise3;
	double[] noise1;
	double[] noise2;
	double[] noise5;
	double[] noise6;
	float[] parabolicField;
	int[][] field_73219_j = new int[32][32];
    private final double[] noisemap;
    
    double[] field_147427_d;
    double[] field_147428_e;
    double[] field_147425_f;
    double[] field_147426_g;
    
    private final int seaLevel = 24;
    private final float coordinateScale = 684.412F, heightScale = 684.412F;
	private final double depthNoiseScaleX = 200F, depthNoiseScaleZ = 200F, depthNoiseScaleExponent = 0.5F;
	private final float mainNoiseScaleX = 80F, mainNoiseScaleY = 160F, mainNoiseScaleZ = 80F;
	private final float biomeDepthOffSet = 0.0F, biomeScaleOffset = 0.0F;
	private final float biomeDepthWeight = 1.0F, biomeScaleWeight = 1.0F;
	private final double stretchY = 12.0F;
	private final double baseSize = 8.5F;
	private final float lowerLimitScale = 512F, upperLimitScale = 512F;
	
	public ChunkProviderApocalypse(World world, long seed) 
	{
		worldObj = world;
		rand = new Random(seed);
		noiseGen1 = new NoiseGeneratorOctaves(rand, 16);
		noiseGen2 = new NoiseGeneratorOctaves(rand, 16);
		noiseGen3 = new NoiseGeneratorOctaves(rand, 8);
		noiseGen4 = new NoiseGeneratorPerlin(rand, 4);
		noiseGen5 = new NoiseGeneratorOctaves(rand, 10);
		noiseGen6 = new NoiseGeneratorOctaves(rand, 16);
		mobSpawnerNoise = new NoiseGeneratorOctaves(rand, 8);
		
        this.noisemap = new double[825];
        this.parabolicField = new float[25];
        
        for (int j = -2; j <= 2; ++j)
        {
            for (int k = -2; k <= 2; ++k)
            {
                float f = 10.0F / MathHelper.sqrt_float((float)(j * j + k * k) + 0.2F);
                this.parabolicField[j + 2 + (k + 2) * 5] = f;
            }
        }
	}
	
	@Override
	public boolean chunkExists(int x, int z) 
	{
		return true;
	}

	@Override
	public Chunk provideChunk(int x, int z) 
	{
		this.rand.setSeed((long)x * 341873128712L + (long)z * 132897987541L);
        ChunkPrimer chunkprimer = new ChunkPrimer();
        this.setBlocksInChunk(x, z, chunkprimer);
        this.biomesForGeneration = this.worldObj.getWorldChunkManager().loadBlockGeneratorData(this.biomesForGeneration, x * 16, z * 16, 16, 16);
        this.func_180517_a(x, z, chunkprimer, this.biomesForGeneration);

        /*
        if (this.settings.useCaves)
        {
            this.caveGenerator.func_175792_a(this, this.worldObj, x, z, chunkprimer);
        }

        if (this.settings.useRavines)
        {
            this.ravineGenerator.func_175792_a(this, this.worldObj, x, z, chunkprimer);
        }

        if (this.settings.useMineShafts && this.mapFeaturesEnabled)
        {
            this.mineshaftGenerator.func_175792_a(this, this.worldObj, x, z, chunkprimer);
        }
*/
        this.villageGenerator.generate(this, this.worldObj, x, z, chunkprimer);
        
        //this.generateEntities(x, z);
/*
        if (this.settings.useStrongholds && this.mapFeaturesEnabled)
        {
            this.strongholdGenerator.func_175792_a(this, this.worldObj, x, z, chunkprimer);
        }

        if (this.settings.useTemples && this.mapFeaturesEnabled)
        {
            this.scatteredFeatureGenerator.func_175792_a(this, this.worldObj, x, z, chunkprimer);
        }

        if (this.settings.useMonuments && this.mapFeaturesEnabled)
        {
            this.oceanMonumentGenerator.func_175792_a(this, this.worldObj, x, z, chunkprimer);
        }
        */
        

        Chunk chunk = new Chunk(this.worldObj, chunkprimer, x, z);
        byte[] abyte = chunk.getBiomeArray();

        for (int k = 0; k < abyte.length; ++k)
        {
            abyte[k] = (byte)this.biomesForGeneration[k].biomeID;
        }

        chunk.generateSkylightMap();
        return chunk;
	}

	@Override
	public Chunk provideChunk(BlockPos blockPosIn) 
	{
		return this.provideChunk(blockPosIn.getX() >> 4, blockPosIn.getZ() >> 4);
	}

	/**
     * Populates chunk with ores etc etc
     */
    public void populate(IChunkProvider p_73153_1_, int p_73153_2_, int p_73153_3_)
    {
        BlockFalling.fallInstantly = true;
        int k = p_73153_2_ * 16;
        int l = p_73153_3_ * 16;
        BlockPos blockpos = new BlockPos(k, 0, l);
        BiomeGenBase biomegenbase = this.worldObj.getBiomeGenForCoords(blockpos.add(16, 0, 16));
        this.rand.setSeed(this.worldObj.getSeed());
        long i1 = this.rand.nextLong() / 2L * 2L + 1L;
        long j1 = this.rand.nextLong() / 2L * 2L + 1L;
        this.rand.setSeed((long)p_73153_2_ * i1 + (long)p_73153_3_ * j1 ^ this.worldObj.getSeed());
        boolean flag = false;
        ChunkCoordIntPair chunkcoordintpair = new ChunkCoordIntPair(p_73153_2_, p_73153_3_);

        MinecraftForge.EVENT_BUS.post(new PopulateChunkEvent.Pre(p_73153_1_, worldObj, rand, p_73153_2_, p_73153_3_, flag));

        /*
        if (this.settings.useMineShafts && this.mapFeaturesEnabled)
        {
            this.mineshaftGenerator.func_175794_a(this.worldObj, this.rand, chunkcoordintpair);
        }
	*/

        flag = this.villageGenerator.generateStructure(this.worldObj, this.rand, chunkcoordintpair);
        
        
/*
        if (this.settings.useStrongholds && this.mapFeaturesEnabled)
        {
            this.strongholdGenerator.func_175794_a(this.worldObj, this.rand, chunkcoordintpair);
        }

        if (this.settings.useTemples && this.mapFeaturesEnabled)
        {
            this.scatteredFeatureGenerator.func_175794_a(this.worldObj, this.rand, chunkcoordintpair);
        }

        if (this.settings.useMonuments && this.mapFeaturesEnabled)
        {
            this.oceanMonumentGenerator.func_175794_a(this.worldObj, this.rand, chunkcoordintpair);
        }
*/
        int k1;
        int l1;
        int i2;

        if(rand.nextInt(FlansModApocalypse.SKELETON_RARITY) == 0)
        {
	        k1 = this.rand.nextInt(16) + 8;
	        l1 = this.rand.nextInt(this.rand.nextInt(248) + 8);
	        i2 = this.rand.nextInt(16) + 8;
	        skeletonGenerator.generate(worldObj, rand, blockpos.add(k1, l1, i2));
        }
        
        if(rand.nextInt(FlansModApocalypse.DEAD_TREE_RARITY) == 0)
        {
	        k1 = this.rand.nextInt(16) + 8;
	        l1 = this.rand.nextInt(this.rand.nextInt(248) + 8);
	        i2 = this.rand.nextInt(16) + 8;
	        deadTreeGenerator.generate(worldObj, rand, blockpos.add(k1, l1, i2));
        }
        
        
        if(rand.nextInt(FlansModApocalypse.DYE_FACTORY_RARITY) == 0)
        {
	        k1 = this.rand.nextInt(16) + 8;
	        l1 = this.rand.nextInt(this.rand.nextInt(248) + 8);
	        i2 = this.rand.nextInt(16) + 8;
	        dyeFactoryGenerator.generate(worldObj, rand, blockpos.add(k1, l1, i2));
        }
        
        
        
        /*
        if (TerrainGen.populate(p_73153_1_, worldObj, rand, p_73153_2_, p_73153_3_, flag, LAVA) && !flag && this.rand.nextInt(this.settings.lavaLakeChance / 10) == 0 && this.settings.useLavaLakes)
        {
            k1 = this.rand.nextInt(16) + 8;
            l1 = this.rand.nextInt(this.rand.nextInt(248) + 8);
            i2 = this.rand.nextInt(16) + 8;

            if (l1 < 63 || this.rand.nextInt(this.settings.lavaLakeChance / 8) == 0)
            {
                (new WorldGenLakes(Blocks.lava)).generate(this.worldObj, this.rand, blockpos.add(k1, l1, i2));
            }
        }

        if (this.settings.useDungeons)
        {
            boolean doGen = TerrainGen.populate(p_73153_1_, worldObj, rand, p_73153_2_, p_73153_3_, flag, DUNGEON);
            for (k1 = 0; doGen && k1 < this.settings.dungeonChance; ++k1)
            {
                l1 = this.rand.nextInt(16) + 8;
                i2 = this.rand.nextInt(256);
                int j2 = this.rand.nextInt(16) + 8;
                (new WorldGenDungeons()).generate(this.worldObj, this.rand, blockpos.add(l1, i2, j2));
            }
        }
		*/
        
        biomegenbase.decorate(this.worldObj, this.rand, new BlockPos(k, 0, l));
        
        this.generateEntities(chunkcoordintpair);
        if (TerrainGen.populate(p_73153_1_, worldObj, rand, p_73153_2_, p_73153_3_, flag, ANIMALS))
        {
        SpawnerAnimals.performWorldGenSpawning(this.worldObj, biomegenbase, k + 8, l + 8, 16, 16, this.rand);
        //this.generateEntities(chunkcoordintpair);
        }
        blockpos = blockpos.add(8, 0, 8);

        MinecraftForge.EVENT_BUS.post(new PopulateChunkEvent.Post(p_73153_1_, worldObj, rand, p_73153_2_, p_73153_3_, flag));
        
        int xOrigin = ModuloHelper.divide(p_73153_2_, 4);
        
        this.rand.setSeed(this.worldObj.getSeed());
        i1 = this.rand.nextLong() / 2L * 2L + 1L;
        j1 = this.rand.nextLong() / 2L * 2L + 1L;
        this.rand.setSeed((long)xOrigin * i1 + (long)p_73153_3_ * j1 ^ this.worldObj.getSeed());
        
        if(rand.nextInt(FlansModApocalypse.AIRPORT_RARITY) == 0)
        {
        	boolean canSpawn = true;
        	for(int i = 0; i < 4; i++)
        	{
        		if(!worldObj.getWorldChunkManager().areBiomesViable((xOrigin * 4 + i) * 16 + 8, p_73153_3_ * 16 + 8, 0, runwaySpawnBiome))
        			canSpawn = false;
        	}
        	//Generate runway section xOffset at chunk p_73153_2_
        	if(canSpawn)
        		runwayGenerator.generate(worldObj, rand, new BlockPos(xOrigin * 4 * 16, 0, p_73153_3_ * 16));
        }
        
        xOrigin = ModuloHelper.divide(p_73153_2_, 3);
        int zOrigin = ModuloHelper.divide(p_73153_3_, 3);
        
        this.rand.setSeed(this.worldObj.getSeed());
        i1 = this.rand.nextLong() / 2L * 2L + 1L;
        j1 = this.rand.nextLong() / 2L * 2L + 1L;
        this.rand.setSeed((long)xOrigin * i1 + (long)zOrigin * j1 ^ this.worldObj.getSeed());
        
        if(rand.nextInt(FlansModApocalypse.LAB_RARITY) == 0)
        {
        	boolean canSpawn = true;
        	for(int i = 0; i < 5; i++)
        	{
            	for(int j = 0; j < 5; j++)
            	{
	        		if(!worldObj.getWorldChunkManager().areBiomesViable((xOrigin * 3 - 1 + i) * 16 + 8, (zOrigin * 3 - 1 + j) * 16 + 8, 0, labSpawnBiome))
	        			canSpawn = false;
            	}
        	}
        	//Generate lab rooms in chunk
        	if(canSpawn)
        	{
        		//Reset random seed
                this.rand.setSeed(this.worldObj.getSeed());
                i1 = this.rand.nextLong() / 2L * 2L + 1L;
                j1 = this.rand.nextLong() / 2L * 2L + 1L;
                this.rand.setSeed((long)p_73153_2_ * i1 + (long)p_73153_3_ * j1 ^ this.worldObj.getSeed());
        		researchLabGenerator.generate(worldObj, rand, new BlockPos(p_73153_2_ * 16, 0, p_73153_3_ * 16));
        	}
        }

        BlockFalling.fallInstantly = false;
    }
    

	private void generateEntities(int x, int z) 
	{
		generateEntities(new ChunkCoordIntPair(x, z));
	}
	
	private void generateEntities(ChunkCoordIntPair chunkcoordintpair) 
	{
        if (rand.nextInt(FlansModApocalypse.SURVIVOR_RARITY) == 0)
        {
        	
            EntitySurvivor survivor = new EntitySurvivor(worldObj);
            double x = chunkcoordintpair.chunkXPos * 16 + rand.nextInt(16) + 0.5D;
            double z = chunkcoordintpair.chunkZPos * 16 + rand.nextInt(16) + 0.5D;
            
            BlockPos surface = new BlockPos((int)x, 30, (int)z);
            for(; !worldObj.isAirBlock(surface.up()); surface = surface.up()) {}
            
            survivor.setLocationAndAngles(x, surface.getY() + 1, z, 0.0F, 0.0F);
            //survivor.func_180482_a(world.getDifficultyForLocation(new BlockPos(entityvillager)), (IEntityLivingData)null);
            worldObj.spawnEntityInWorld(survivor);
        }
        
        if(rand.nextInt(FlansModApocalypse.VEHICLE_RARITY) == 0)
        {
            double x = chunkcoordintpair.chunkXPos * 16 + rand.nextInt(16) + 0.5D;
            double z = chunkcoordintpair.chunkZPos * 16 + rand.nextInt(16) + 0.5D;
            
            BlockPos surface = new BlockPos((int)x, 30, (int)z);
            for(; !worldObj.isAirBlock(surface.up()); surface = surface.up()) {}
            
        	DriveableType type = FlansModApocalypse.getLootGenerator().getRandomDriveable(rand);
        	NBTTagCompound tags = new NBTTagCompound();
        	tags.setString("Engine", FlansModApocalypse.getLootGenerator().getRandomEngine(type, rand).shortName);
        	tags.setString("Type", type.shortName);
        	for(EnumDriveablePart part : EnumDriveablePart.values())
        	{
        		tags.setInteger(part.getShortName() + "_Health", type.health.get(part) == null ? 0 : rand.nextInt(type.health.get(part).health));
        		tags.setBoolean(part.getShortName() + "_Fire", false);
        	}
        	for(int i = 0; i < 10; i++)
        	{
        		EnumDriveablePart randomPart = EnumDriveablePart.values()[rand.nextInt(EnumDriveablePart.values().length)];
        		if(randomPart != EnumDriveablePart.core)
        			killPart(randomPart, tags);
        	}
        	
        	EntityDriveable entity = type.createDriveable(worldObj, x, surface.getY() + 1, z, new DriveableData(tags));
        	
        	if(rand.nextBoolean())
        		entity.driveableData.fuel = new ItemStack(FlansModApocalypse.getLootGenerator().getRandomFuel(rand).item, 1);
        	entity.setRotation(rand.nextInt(360), 0, 0);
        	
            worldObj.spawnEntityInWorld(entity);
        }

    }
	
	public void killPart(EnumDriveablePart part, NBTTagCompound tags)
	{
		tags.setInteger(part.getShortName() + "_Health", 0);
		for(EnumDriveablePart child : part.getChildren())
			killPart(child, tags);
	}

	@Override
	public boolean saveChunks(boolean p_73151_1_, IProgressUpdate p_73151_2_) 
	{
		return true;
	}

	@Override
	public boolean unloadQueuedChunks() 
	{
		return false;
	}

	@Override
	public boolean canSave() 
	{
		return true;
	}

	@Override
	public String makeString() 
	{
		return "RandomLevelSource";
	}

	@Override
	public List getPossibleCreatures(EnumCreatureType p_177458_1_, BlockPos p_177458_2_) 
	{
        BiomeGenBase biomegenbase = this.worldObj.getBiomeGenForCoords(p_177458_2_);

        /*
        if (this.mapFeaturesEnabled)
        {
            if (p_177458_1_ == EnumCreatureType.MONSTER && this.scatteredFeatureGenerator.func_175798_a(p_177458_2_))
            {
                return this.scatteredFeatureGenerator.getScatteredFeatureSpawnList();
            }

            if (p_177458_1_ == EnumCreatureType.MONSTER && this.settings.useMonuments && this.oceanMonumentGenerator.func_175796_a(this.worldObj, p_177458_2_))
            {
                return this.oceanMonumentGenerator.func_175799_b();
            }
        }
*/
        return biomegenbase.getSpawnableList(p_177458_1_);
	}

	@Override
	public BlockPos getStrongholdGen(World worldIn, String p_180513_2_, BlockPos p_180513_3_) 
	{
		 return null;//"Stronghold".equals(p_180513_2_) && this.strongholdGenerator != null ? this.strongholdGenerator.getClosestStrongholdPos(worldIn, p_180513_3_) : null;
	}

	@Override
	public int getLoadedChunkCount() 
	{
		return 0;
	}

	@Override
	public void recreateStructures(Chunk p_180514_1_, int p_180514_2_, int p_180514_3_) 
	{

	}

	@Override
	public void saveExtraData() 
	{
	}

    public void setBlocksInChunk(int p_180518_1_, int p_180518_2_, ChunkPrimer p_180518_3_)
    {
        this.biomesForGeneration = this.worldObj.getWorldChunkManager().getBiomesForGeneration(this.biomesForGeneration, p_180518_1_ * 4 - 2, p_180518_2_ * 4 - 2, 10, 10);
        this.generateNoisemap(p_180518_1_ * 4, 0, p_180518_2_ * 4);
        
        //subChunkX and subChunkZ split it into 4 separate subchunks of size 4. subChunkY then splits it into 32 of size 8
        
        for (int subChunkX = 0; subChunkX < 4; ++subChunkX)
        {
            int minX = subChunkX * 5;
            int maxX = (subChunkX + 1) * 5;
            
            for (int subChunkZ = 0; subChunkZ < 4; ++subChunkZ)
            {
                int minXminZ = (minX + subChunkZ) * 33;
                int minXmaxZ = (minX + subChunkZ + 1) * 33;
                int maxXminZ = (maxX + subChunkZ) * 33;
                int maxXmaxZ = (maxX + subChunkZ + 1) * 33;

                for (int subChunkY = 0; subChunkY < 32; ++subChunkY)
                {
                	int squishedSubChunkY = subChunkY;//heightScaling[subChunkY * 8] / 8;
                	int nextSquishedSubChunkY = subChunkY + 1;//subChunkY == 31 ? subChunkY : heightScaling[(subChunkY + 1) * 8] / 8;
                	
                    double d0 = 0.125D;
                    double xzy = this.noisemap[minXminZ + squishedSubChunkY];
                    double xZy = this.noisemap[minXmaxZ + squishedSubChunkY];
                    double Xzy = this.noisemap[maxXminZ + squishedSubChunkY];
                    double XZy = this.noisemap[maxXmaxZ + squishedSubChunkY];
                    double xzY = (this.noisemap[minXminZ + nextSquishedSubChunkY] - xzy) * d0;
                    double xZY = (this.noisemap[minXmaxZ + nextSquishedSubChunkY] - xZy) * d0;
                    double XzY = (this.noisemap[maxXminZ + nextSquishedSubChunkY] - Xzy) * d0;
                    double XZY = (this.noisemap[maxXmaxZ + nextSquishedSubChunkY] - XZy) * d0;

                    for (int blockY = 0; blockY < 8; ++blockY)
                    {
                        double d9 = 0.25D;
                        double d10 = xzy;
                        double d11 = xZy;
                        double d12 = (Xzy - xzy) * d9;
                        double d13 = (XZy - xZy) * d9;

                        for (int blockX = 0; blockX < 4; ++blockX)
                        {
                            double d14 = 0.25D;
                            double d16 = (d11 - d10) * d14;
                            double d15 = d10 - d16;

                            for (int blockZ = 0; blockZ < 4; ++blockZ)
                            {
                                if ((d15 += d16) > 0.0D)
                                {
                                    p_180518_3_.setBlockState(subChunkX * 4 + blockX, subChunkY * 8 + blockY, subChunkZ * 4 + blockZ, Blocks.stone.getDefaultState());
                                }
                                else if (subChunkY * 8 + blockY < this.seaLevel)
                                {
                                    p_180518_3_.setBlockState(subChunkX * 4 + blockX, subChunkY * 8 + blockY, subChunkZ * 4 + blockZ, Blocks.water.getDefaultState());
                                }
                            }

                            d10 += d12;
                            d11 += d13;
                        }

                        xzy += xzY;
                        xZy += xZY;
                        Xzy += XzY;
                        XZy += XZY;
                    }
                }
            }
        }
    }
    
    public void func_180517_a(int p_180517_1_, int p_180517_2_, ChunkPrimer p_180517_3_, BiomeGenBase[] p_180517_4_)
    {
        ChunkProviderEvent.ReplaceBiomeBlocks event = new ChunkProviderEvent.ReplaceBiomeBlocks(this, p_180517_1_, p_180517_2_, p_180517_3_, this.worldObj);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.getResult() == Result.DENY) return;

        double d0 = 0.03125D;
        this.stoneNoise = this.noiseGen4.func_151599_a(this.stoneNoise, (double)(p_180517_1_ * 16), (double)(p_180517_2_ * 16), 16, 16, d0 * 2.0D, d0 * 2.0D, 1.0D);

        for (int k = 0; k < 16; ++k)
        {
            for (int l = 0; l < 16; ++l)
            {
                BiomeGenBase biomegenbase = p_180517_4_[l + k * 16];
                biomegenbase.genTerrainBlocks(this.worldObj, this.rand, p_180517_3_, p_180517_1_ * 16 + k, p_180517_2_ * 16 + l, this.stoneNoise[l + k * 16]);
            }
        }
    }
    
    private void generateNoisemap(int xSize, int ySize, int zSize)
    {
        this.field_147426_g = this.noiseGen6.generateNoiseOctaves(this.field_147426_g, xSize, zSize, 5, 5, (double)this.depthNoiseScaleX, (double)this.depthNoiseScaleZ, (double)this.depthNoiseScaleExponent);
        float f = this.coordinateScale;
        float f1 = this.heightScale;
        this.field_147427_d = this.noiseGen3.generateNoiseOctaves(this.field_147427_d, xSize, ySize, zSize, 5, 33, 5, (double)(f / this.mainNoiseScaleX), (double)(f1 / this.mainNoiseScaleY), (double)(f / this.mainNoiseScaleZ));
        this.field_147428_e = this.noiseGen2.generateNoiseOctaves(this.field_147428_e, xSize, ySize, zSize, 5, 33, 5, (double)f, (double)f1, (double)f);
        this.field_147425_f = this.noiseGen1.generateNoiseOctaves(this.field_147425_f, xSize, ySize, zSize, 5, 33, 5, (double)f, (double)f1, (double)f);
        boolean flag1 = false;
        boolean flag = false;
        int l = 0;
        int i1 = 0;

        for (int noiseX = 0; noiseX < 5; ++noiseX)
        {
            for (int noiseZ = 0; noiseZ < 5; ++noiseZ)
            {
                float f2 = 0.0F;
                float f3 = 0.0F;
                float f4 = 0.0F;
                byte b0 = 2;
                BiomeGenBase biomegenbase = this.biomesForGeneration[noiseX + 2 + (noiseZ + 2) * 10];

                for (int l1 = -b0; l1 <= b0; ++l1)
                {
                    for (int i2 = -b0; i2 <= b0; ++i2)
                    {
                        BiomeGenBase biomegenbase1 = this.biomesForGeneration[noiseX + l1 + 2 + (noiseZ + i2 + 2) * 10];
                        float f5 = this.biomeDepthOffSet + biomegenbase1.minHeight * this.biomeDepthWeight;
                        float f6 = this.biomeScaleOffset + biomegenbase1.maxHeight * this.biomeScaleWeight;

                        /*
                        if (this.field_177475_o == WorldType.AMPLIFIED && f5 > 0.0F)
                        {
                            f5 = 1.0F + f5 * 2.0F;
                            f6 = 1.0F + f6 * 4.0F;
                        }
                        */
                        float f7 = this.parabolicField[l1 + 2 + (i2 + 2) * 5] / (f5 + 2.0F);

                        if (biomegenbase1.minHeight > biomegenbase.minHeight)
                        {
                            f7 /= 2.0F;
                        }

                        f2 += f6 * f7;
                        f3 += f5 * f7;
                        f4 += f7;
                    }
                }

                f2 /= f4;
                f3 /= f4;
                f2 = f2 * 0.9F + 0.1F;
                f3 = (f3 * 4.0F - 1.0F) / 8.0F;
                double d7 = this.field_147426_g[i1] / 8000.0D;

                if (d7 < 0.0D)
                {
                    d7 = -d7 * 0.3D;
                }

                d7 = d7 * 3.0D - 2.0D;

                if (d7 < 0.0D)
                {
                    d7 /= 2.0D;

                    if (d7 < -1.0D)
                    {
                        d7 = -1.0D;
                    }

                    d7 /= 1.4D;
                    d7 /= 2.0D;
                }
                else
                {
                    if (d7 > 1.0D)
                    {
                        d7 = 1.0D;
                    }

                    d7 /= 8.0D;
                }

                ++i1;
                double d8 = (double)f3;
                double d9 = (double)f2;
                d8 += d7 * 0.2D;
                d8 = d8 * (double)this.baseSize / 8.0D;
                double d0 = (double)this.baseSize + d8 * 4.0D;

                for (int noiseY = 0; noiseY < 33; ++noiseY)
                {
                    double d1 = ((double)noiseY - d0) * (double)this.stretchY * 128.0D / 256.0D / d9;

                    if (d1 < 0.0D)
                    {
                        d1 *= 4.0D;
                    }
                    
                    

                    double d2 = this.field_147428_e[l] / (double)this.lowerLimitScale;
                    double d3 = this.field_147425_f[l] / (double)this.upperLimitScale;
                    double d4 = (this.field_147427_d[l] / 10.0D + 1.0D) / 2.0D;
                    double d5 = MathHelper.denormalizeClamp(d2, d3, d4) - d1;

                    if (noiseY > 29)
                    {
                        double d6 = (double)((float)(noiseY - 29) / 3.0F);
                        d5 = d5 * (1.0D - d6) + -10.0D * d6;
                    }

                    this.noisemap[l] = d5;
                    ++l;
                }
            }
        }
    }
    
    public boolean func_177460_a(IChunkProvider p_177460_1_, Chunk p_177460_2_, int p_177460_3_, int p_177460_4_)
    {
        boolean flag = false;

        /*
        if (this.settings.useMonuments && this.mapFeaturesEnabled && p_177460_2_.getInhabitedTime() < 3600L)
        {
            flag |= this.oceanMonumentGenerator.func_175794_a(this.worldObj, this.rand, new ChunkCoordIntPair(p_177460_3_, p_177460_4_));
        }
*/
        return flag;
    }
}
