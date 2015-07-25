package com.flansmod.apocalypse.common.world;

import java.util.Random;

import net.minecraft.block.BlockSand;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class BiomeGenApocalypse extends BiomeGenBase
{
	protected static final BiomeGenBase.Height height_DeepCanyon = new BiomeGenBase.Height(-1.8F, 0F);
	protected static final BiomeGenBase.Height height_Canyon = new BiomeGenBase.Height(-1F, 0F);
	protected static final BiomeGenBase.Height height_Ground = new BiomeGenBase.Height(0F, 0F);
	protected static final BiomeGenBase.Height height_Plateau = new BiomeGenBase.Height(1F, 0F);
	protected static final BiomeGenBase.Height height_HighPlateau = new BiomeGenBase.Height(2.5F, 0.F);
	
	public static BiomeGenBase deepCanyon, canyon, desert, plateau, highPlateau;
	public static BiomeGenBase sulphurPits;

	public static void registerBiomes()
	{
		deepCanyon = (new BiomeGenDesertCanyon(240, true)).setColor(6316128).setBiomeName("Deep Canyon").setHeight(height_DeepCanyon).setTemperatureRainfall(2F, 0F);
		canyon = (new BiomeGenDesertCanyon(241, true)).setColor(6316128).setBiomeName("Canyon").setHeight(height_Canyon).setTemperatureRainfall(2F, 0F);
		desert = (new BiomeGenDesertCanyon(242, true)).setColor(6316128).setBiomeName("Desert").setHeight(height_Ground).setTemperatureRainfall(2F, 0F);
		plateau = (new BiomeGenDesertCanyon(243, true)).setColor(6316128).setBiomeName("Plateau").setHeight(height_Plateau).setTemperatureRainfall(2F, 0F);
		highPlateau = (new BiomeGenDesertCanyon(244, true)).setColor(6316128).setBiomeName("High Plateau").setHeight(height_HighPlateau).setTemperatureRainfall(2F, 0F);
		
		sulphurPits = (new BiomeGenSulphurPits(245, true)).setColor(6316128).setBiomeName("Sulphur Pits").setHeight(height_DeepCanyon).setTemperatureRainfall(2F, 0.5F);
		
		addBiomes(deepCanyon, canyon, desert, plateau, highPlateau, sulphurPits);
	}
	
	private static void addBiomes(BiomeGenBase... biomes)
	{
		for(BiomeGenBase biome : biomes)	
		{
			BiomeManager.addBiome(BiomeType.DESERT, new BiomeEntry(biome, biome.biomeID));
			BiomeManager.removeSpawnBiome(biome);
		}
	}
	
	public BiomeGenApocalypse(int i, boolean register) 
	{
		super(i, register);
		this.theBiomeDecorator = new BiomeDecoratorApocalypse();
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

        for (int k1 = 255; k1 >= 0; --k1)
        {
            if (k1 <= rand.nextInt(5))
            {
                primer.setBlockState(j1, k1, i1, Blocks.bedrock.getDefaultState());
            }
            else
            {
                IBlockState iblockstate2 = primer.getBlockState(j1, k1, i1);

                if (iblockstate2.getBlock().getMaterial() == Material.air)
                {
                    k = -1;
                }
                else if (iblockstate2.getBlock() == Blocks.stone)
                {
                    if (k == -1)
                    {
                        if (l <= 0)
                        {
                            iblockstate = null;
                            iblockstate1 = Blocks.stone.getDefaultState();
                        }
                        else if (k1 >= 59 && k1 <= 64)
                        {
                            iblockstate = this.topBlock;
                            iblockstate1 = this.fillerBlock;
                        }

                        k = l;

                        if (k1 >= 62)
                        {
                            primer.setBlockState(j1, k1, i1, iblockstate);
                        }
                        //else if (k1 < 56 - l)
                        //{
                        //    iblockstate = null;
                        //    iblockstate1 = Blocks.stone.getDefaultState();
                        //    primer.setBlockState(j1, k1, i1, Blocks.gravel.getDefaultState());
                        //}
                        else
                        {
                            primer.setBlockState(j1, k1, i1, iblockstate1);
                        }
                    }
                    else if (k > 0)
                    {
                        --k;
                        primer.setBlockState(j1, k1, i1, iblockstate1);

                        /*
                        if (k == 0 && iblockstate1.getBlock() == Blocks.sand)
                        {
                            k = rand.nextInt(4) + Math.max(0, k1 - 63);
                            iblockstate1 = iblockstate1.getValue(BlockSand.VARIANT) == BlockSand.EnumType.RED_SAND ? Blocks.red_sandstone.getDefaultState() : Blocks.sandstone.getDefaultState();
                        }
                        */
                    }
                }
            }
        }
    }

}
