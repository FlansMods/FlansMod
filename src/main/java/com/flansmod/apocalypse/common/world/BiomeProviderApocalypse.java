package com.flansmod.apocalypse.common.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeCache;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class BiomeProviderApocalypse extends BiomeProvider
{
	private GenLayer unzoomedBiomes;
	private GenLayer zoomedBiomes;
	/**
	 * The biome list.
	 */
	private BiomeCache myBiomeCache;
	private List<Biome> myBiomesToSpawnIn;
	
	
	public BiomeProviderApocalypse()
	{
		this.myBiomeCache = new BiomeCache(this);
		this.myBiomesToSpawnIn = new ArrayList();
		this.myBiomesToSpawnIn.add(BiomeApocalypse.deepCanyon);
		this.myBiomesToSpawnIn.add(BiomeApocalypse.canyon);
		this.myBiomesToSpawnIn.add(BiomeApocalypse.desert);
		this.myBiomesToSpawnIn.add(BiomeApocalypse.plateau);
		this.myBiomesToSpawnIn.add(BiomeApocalypse.highPlateau);
	}
	
	public BiomeProviderApocalypse(long par1, WorldType worldType)
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
	
	public BiomeProviderApocalypse(World world)
	{
		this(world.getSeed(), world.getWorldInfo().getTerrainType());
	}
	
	@Override
	public List getBiomesToSpawnIn()
	{
		return this.myBiomesToSpawnIn;
	}
	
	@Override
	public Biome getBiome(BlockPos pos)
	{
		Biome biome = this.myBiomeCache.getBiome(pos.getX(), pos.getZ(), null);
		if(biome == null)
		{
			return BiomeApocalypse.desert;
		}
		
		return biome;
	}
    
    /*
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
        if ((ai[i] >= 0) && (Biome.getBiome(ai[i]) != null)) {
          float f = Biome.getBiome(ai[i]).getRainfall() / 65536.0F;

          if (f > 1.0F)
          {
            f = 1.0F;
          }

          par1ArrayOfFloat[i] = f;
        }

      }

      return par1ArrayOfFloat;
    }
    */
	
	@Override
	public float getTemperatureAtHeight(float par1, int par2)
	{
		return par1;
	}
	
	@Override
	public Biome[] getBiomesForGeneration(Biome[] par1ArrayOfBiome, int x, int z, int length, int width)
	{
		IntCache.resetIntCache();
		
		if((par1ArrayOfBiome == null) || (par1ArrayOfBiome.length < length * width))
		{
			par1ArrayOfBiome = new Biome[length * width];
		}
		
		int[] arrayOfInts = this.unzoomedBiomes.getInts(x, z, length, width);
		
		for(int i = 0; i < length * width; i++)
		{
			if(arrayOfInts[i] >= 0)
			{
				par1ArrayOfBiome[i] = Biome.getBiome(arrayOfInts[i]);
			}
			else
			{
				par1ArrayOfBiome[i] = BiomeApocalypse.desert;
			}
		}
		
		return par1ArrayOfBiome;
	}
	
	@Override
	public Biome[] getBiomes(Biome[] par1ArrayOfBiome, int x, int y, int width, int length, boolean cacheFlag)
	{
		IntCache.resetIntCache();
		
		if((par1ArrayOfBiome == null) || (par1ArrayOfBiome.length < width * length))
		{
			par1ArrayOfBiome = new Biome[width * length];
		}
		
		if((cacheFlag) && (width == 16) && (length == 16) && ((x & 0xF) == 0) && ((y & 0xF) == 0))
		{
			Biome[] aBiome = this.myBiomeCache.getCachedBiomes(x, y);
			System.arraycopy(aBiome, 0, par1ArrayOfBiome, 0, width * length);
			return par1ArrayOfBiome;
		}
		
		int[] ai = this.zoomedBiomes.getInts(x, y, width, length);
		
		for(int i = 0; i < width * length; i++)
		{
			if(ai[i] >= 0)
			{
				par1ArrayOfBiome[i] = Biome.getBiome(ai[i]);
			}
			else
			{
				par1ArrayOfBiome[i] = BiomeApocalypse.desert;
			}
		}
		
		return par1ArrayOfBiome;
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
		
		for(int k1 = 0; k1 < i1 * j1; k1++)
		{
			Biome biome = Biome.getBiome(ai[k1]);
			
			if(!biomes.contains(biome))
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
		
		for(int l1 = 0; l1 < ai.length; l1++)
		{
			int i2 = i + l1 % i1 << 2;
			int j2 = j + l1 / i1 << 2;
			Biome biome = Biome.getBiome(ai[l1]);
			
			if((biomes.contains(biome)) && ((blockpos == null) || (par5Random.nextInt(k1 + 1) == 0)))
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
