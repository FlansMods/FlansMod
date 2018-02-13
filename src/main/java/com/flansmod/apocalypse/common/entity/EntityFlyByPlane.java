package com.flansmod.apocalypse.common.entity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

import com.flansmod.apocalypse.common.world.BiomeGenApocalypse;
import com.flansmod.common.driveables.DriveableData;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.PlaneType;

public class EntityFlyByPlane extends EntityPlane 
{
	public EntityFlyByPlane(World world, double x, double y, double z, PlaneType type, DriveableData data) 
	{
		super(world, x, y, z, type, data);
	}
	
	public void onUpdate()
	{
		throttle = 1F;
		

		//float lookAheadDist = 20F;
		
		//float targetHeight = getBiomeHeight(worldObj.getBiomeGenForCoords(new BlockPos((int)(posX + motionX * lookAheadDist), (int)(posY + motionY * lookAheadDist), (int)(posZ + motionZ * lookAheadDist))));
		//float currentTargetHeight = getBiomeHeight(worldObj.getBiomeGenForCoords(new BlockPos((int)(posX), (int)(posY), (int)(posZ))));
		

		//flapsPitchLeft = flapsPitchRight += (Math.max(currentTargetHeight, targetHeight) - (float)posY) * 0.1F;
		
		super.onUpdate();
		
		
		
		
	}
	
	private float getBiomeHeight(BiomeGenBase biome)
	{
		if(biome == BiomeGenApocalypse.desert)
			return 80F;
		else if(biome == BiomeGenApocalypse.deepCanyon || biome == BiomeGenApocalypse.sulphurPits)
			return 80F;
		else if(biome == BiomeGenApocalypse.highPlateau)
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
