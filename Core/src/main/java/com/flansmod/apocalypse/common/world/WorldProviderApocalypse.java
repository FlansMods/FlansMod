package com.flansmod.apocalypse.common.world;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.apocalypse.common.FlansModApocalypse;

public class WorldProviderApocalypse extends WorldProvider
{
	@Override
	public void init()
	{
		super.init();
		
		this.biomeProvider = new BiomeProviderApocalypse(this.world);
		this.setDimension(FlansModApocalypse.dimensionID);
	}
	
	@Override
	public IChunkGenerator createChunkGenerator()
	{
		return new ChunkProviderApocalypse(world, world.getSeed(), true);
	}
	
	@Override
	public boolean canRespawnHere()
	{
		return true;
	}
	
	@Override
	public boolean canCoordinateBeSpawn(int x, int z)
	{
		return this.world.getGroundAboveSeaLevel(new BlockPos(x, 0, z)) == Blocks.SAND;
	}
	
	/**
	 * Return Vec3D with biome specific fog color
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public Vec3d getFogColor(float celestialAngle, float partialTicks)
	{
		float f2 = MathHelper.cos(celestialAngle * (float)Math.PI * 2.0F) * 2.0F + 0.5F;
		f2 = MathHelper.clamp(f2, 0.0F, 1.0F);
		
		float f3 = 1.0F;
		float f4 = 0.85F;
		float f5 = 0.75F;
		f3 *= f2 * 0.94F + 0.06F;
		f4 *= f2 * 0.94F + 0.06F;
		f5 *= f2 * 0.91F + 0.09F;
		return new Vec3d((double)f3, (double)f4, (double)f5);
	}
	
	@SideOnly(Side.CLIENT)
	public Vec3d getSkyColor(net.minecraft.entity.Entity cameraEntity, float partialTicks)
	{
		return new Vec3d(0.8F, 0.6F, 0.5F);
	}
	
	@Override
	public boolean canDoLightning(net.minecraft.world.chunk.Chunk chunk)
	{
		return false;
	}
	
	@Override
	public boolean canDoRainSnowIce(net.minecraft.world.chunk.Chunk chunk)
	{
		return false;
	}
	
	@Override
	public DimensionType getDimensionType()
	{
		return DimensionType.OVERWORLD;
	}
}
