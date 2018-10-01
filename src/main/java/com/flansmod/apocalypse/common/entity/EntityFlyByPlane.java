package com.flansmod.apocalypse.common.entity;

import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

import com.flansmod.apocalypse.common.world.BiomeApocalypse;
import com.flansmod.common.driveables.DriveableData;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.PlaneType;

public class EntityFlyByPlane extends EntityPlane
{
	public EntityFlyByPlane(World world)
	{
		super(world);
	}
	
	public EntityFlyByPlane(World world, double x, double y, double z, PlaneType type, DriveableData data)
	{
		super(world, x, y, z, type, data);
	}
	
	public void onUpdate()
	{
		throttle = 1F;
		

		//float lookAheadDist = 20F;
		
		//float targetHeight = getBiomeHeight(world.getBiomeGenForCoords(new BlockPos((int)(posX + motionX * lookAheadDist), (int)(posY + motionY * lookAheadDist), (int)(posZ + motionZ * lookAheadDist))));
		//float currentTargetHeight = getBiomeHeight(world.getBiomeGenForCoords(new BlockPos((int)(posX), (int)(posY), (int)(posZ))));
		

		//flapsPitchLeft = flapsPitchRight += (Math.max(currentTargetHeight, targetHeight) - (float)posY) * 0.1F;
		
		super.onUpdate();
		
		
	}
	
	private float getBiomeHeight(Biome biome)
	{
		if(biome == BiomeApocalypse.desert)
			return 80F;
		else if(biome == BiomeApocalypse.deepCanyon || biome == BiomeApocalypse.sulphurPits)
			return 80F;
		else if(biome == BiomeApocalypse.highPlateau)
			return 120F;
		return 128F;
	}

	@Override
	public boolean canThrust()
	{
		return true;
	}
	
	@Override
	public boolean hasFuel()
	{
		return true;
	}

	@Override
	public boolean hasEnoughFuel()
	{
		return true;
	}
}
