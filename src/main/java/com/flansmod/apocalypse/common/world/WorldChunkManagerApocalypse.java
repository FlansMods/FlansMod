package com.flansmod.apocalypse.common.world;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ReportedException;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeCache;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenHills;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class WorldChunkManagerApocalypse extends WorldChunkManager 
{
	private GenLayer unzoomedBiomes;
	private GenLayer zoomedBiomes;
    /** The biome list. */
    private BiomeCache myBiomeCache;
    private List<BiomeGenBase> myBiomesToSpawnIn;
    
	
    public WorldChunkManagerApocalypse()
    {    	
    	this.myBiomeCache = new BiomeCache(this);
        this.myBiomesToSpawnIn = new ArrayList();
        this.myBiomesToSpawnIn.add(BiomeGenApocalypse.deepCanyon);
        this.myBiomesToSpawnIn.add(BiomeGenApocalypse.canyon);
        this.myBiomesToSpawnIn.add(BiomeGenApocalypse.desert);
        this.myBiomesToSpawnIn.add(BiomeGenApocalypse.plateau);
        this.myBiomesToSpawnIn.add(BiomeGenApocalypse.highPlateau);
    }
    
    public WorldChunkManagerApocalypse(long par1, WorldType worldType)
    {
      this();
      GenLayer[] agenlayer;
      /*
      if (TwilightForestMod.oldMapGen)
      
      {
        agenlayer = GenLayerTF.makeTheWorldOldMapGen(par1);
      }
      else
      {
        agenlayer = GenLayerTF.makeTheWorld(par1);
      }
      */
      agenlayer = GenLayerApocalypse.makeTheWorld(par1);
      this.unzoomedBiomes = agenlayer[0];
      this.zoomedBiomes = agenlayer[1];
    }

    public WorldChunkManagerApocalypse(World world)
    {
      this(world.getSeed(), world.getWorldInfo().getTerrainType());
    }
    
    @Override
    public List getBiomesToSpawnIn()
    {
    	return this.myBiomesToSpawnIn;
    }
        
    @Override
    public BiomeGenBase getBiomeGenerator(BlockPos pos)
    {
      BiomeGenBase biome = this.myBiomeCache.func_180284_a(pos.getX(), pos.getZ(), (BiomeGenBase)null);
      if (biome == null)
      {
        return BiomeGenApocalypse.desert;
      }

      return biome;
    }
    
    @Override
    public float[] getRainfall(float[] par1ArrayOfFloat, int par2, int par3, int par4, int par5)
    {
      IntCache.resetIntCache();

      if ((par1ArrayOfFloat == null) || (par1ArrayOfFloat.length < par4 * par5))
      {
        par1ArrayOfFloat = new float[par4 * par5];
      }

      int[] ai = this.zoomedBiomes.getInts(par2, par3, par4, par5);

      for (int i = 0; i < par4 * par5; i++)
      {
        if ((ai[i] >= 0) && (BiomeGenBase.getBiome(ai[i]) != null)) {
          float f = BiomeGenBase.getBiome(ai[i]).getIntRainfall() / 65536.0F;

          if (f > 1.0F)
          {
            f = 1.0F;
          }

          par1ArrayOfFloat[i] = f;
        }

      }

      return par1ArrayOfFloat;
    }
    
    @Override
    public float getTemperatureAtHeight(float par1, int par2)
    {
      return par1;
    }

    @Override
    public BiomeGenBase[] getBiomesForGeneration(BiomeGenBase[] par1ArrayOfBiomeGenBase, int x, int z, int length, int width)
    {
      IntCache.resetIntCache();

      if ((par1ArrayOfBiomeGenBase == null) || (par1ArrayOfBiomeGenBase.length < length * width))
      {
        par1ArrayOfBiomeGenBase = new BiomeGenBase[length * width];
      }

      int[] arrayOfInts = this.unzoomedBiomes.getInts(x, z, length, width);

      for (int i = 0; i < length * width; i++)
      {
        if (arrayOfInts[i] >= 0)
        {
          par1ArrayOfBiomeGenBase[i] = BiomeGenBase.getBiome(arrayOfInts[i]);
        }
        else
        {
          par1ArrayOfBiomeGenBase[i] = BiomeGenApocalypse.desert;
        }
      }

      return par1ArrayOfBiomeGenBase;
    }

    @Override
    public BiomeGenBase[] loadBlockGeneratorData(BiomeGenBase[] par1ArrayOfBiomeGenBase, int par2, int par3, int par4, int par5)
    {
      return getBiomeGenAt(par1ArrayOfBiomeGenBase, par2, par3, par4, par5, true);
    }

    @Override
    public BiomeGenBase[] getBiomeGenAt(BiomeGenBase[] par1ArrayOfBiomeGenBase, int x, int y, int width, int length, boolean cacheFlag)
    {
      IntCache.resetIntCache();

      if ((par1ArrayOfBiomeGenBase == null) || (par1ArrayOfBiomeGenBase.length < width * length))
      {
        par1ArrayOfBiomeGenBase = new BiomeGenBase[width * length];
      }

      if ((cacheFlag) && (width == 16) && (length == 16) && ((x & 0xF) == 0) && ((y & 0xF) == 0))
      {
        BiomeGenBase[] abiomegenbase = this.myBiomeCache.getCachedBiomes(x, y);
        System.arraycopy(abiomegenbase, 0, par1ArrayOfBiomeGenBase, 0, width * length);
        return par1ArrayOfBiomeGenBase;
      }

      int[] ai = this.zoomedBiomes.getInts(x, y, width, length);

      for (int i = 0; i < width * length; i++)
      {
        if (ai[i] >= 0)
        {
          par1ArrayOfBiomeGenBase[i] = BiomeGenBase.getBiome(ai[i]);
        }
        else
        {
          par1ArrayOfBiomeGenBase[i] = BiomeGenApocalypse.desert;
        }
      }

      return par1ArrayOfBiomeGenBase;
    }

    @Override
    public boolean areBiomesViable(int par1, int par2, int par3, List biomes)
    {
      int i = par1 - par3 >> 2;
      int j = par2 - par3 >> 2;
      int k = par1 + par3 >> 2;
      int l = par2 + par3 >> 2;
      int i1 = k - i + 1;
      int j1 = l - j + 1;
      int[] ai = this.unzoomedBiomes.getInts(i, j, i1, j1);

      for (int k1 = 0; k1 < i1 * j1; k1++)
      {
        BiomeGenBase biomegenbase = BiomeGenBase.getBiome(ai[k1]);

        if (!biomes.contains(biomegenbase))
        {
          return false;
        }
      }

      return true;
    }

    @Override
    public BlockPos findBiomePosition(int x, int z, int range, List biomes, Random par5Random)
    {
      int i = x - range >> 2;
      int j = z - range >> 2;
      int k = x + range >> 2;
      int l = z + range >> 2;
      int i1 = k - i + 1;
      int j1 = l - j + 1;
      int[] ai = this.unzoomedBiomes.getInts(i, j, i1, j1);
      BlockPos blockpos = null;
      int k1 = 0;

      for (int l1 = 0; l1 < ai.length; l1++)
      {
        int i2 = i + l1 % i1 << 2;
        int j2 = j + l1 / i1 << 2;
        BiomeGenBase biomegenbase = BiomeGenBase.getBiome(ai[l1]);

        if ((biomes.contains(biomegenbase)) && ((blockpos == null) || (par5Random.nextInt(k1 + 1) == 0)))
        {
        	blockpos = new BlockPos(i2, 0, j2);
          k1++;
        }
      }

      return blockpos;
    }

    @Override
    public void cleanupCache()
    {
      this.myBiomeCache.cleanupCache();
    }
}
