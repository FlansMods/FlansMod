package com.flansmod.client.model;

import java.util.Random;

import com.flansmod.common.vector.Vector3f;

public class GunAnimations
{
	public static GunAnimations defaults = new GunAnimations();
	
	/** (Purely aesthetic) gun animation variables */
	/**
	 * Slide
	 */
	public float gunSlide = 0F, lastGunSlide = 0F;
	/**
	 * Delayed Reload Animations
	 */
	public int timeUntilPump = 0, timeToPumpFor = 0;
	/**
	 * Delayed Reload Animations : -1, 1 = At rest, 0 = Mid Animation
	 */
	public float pumped = -1F, lastPumped = -1F;
	/**
	 * Delayed Reload Animations : Doing the delayed animation
	 */
	public boolean pumping = false;
	
	public boolean reloading = false;
	
	public float reloadAnimationTime = 0;
	
	public float reloadAnimationProgress = 0F, lastReloadAnimationProgress = 0F;
	
	public float minigunBarrelRotation = 0F;
	public float minigunBarrelRotationSpeed = 0F;
	
	/**
	 * Melee animations
	 */
	public int meleeAnimationProgress = 0, meleeAnimationLength = 0;
	
	public float recoil = 0.0f, antiRecoil = 0.0f, recoilAngle = 0.0f;
	public Vector3f recoilOffset = new Vector3f(), recoilVelocity = new Vector3f();
	public Random random = new Random();
	
	public LookAtState lookAt = LookAtState.NONE;
	public float lookAtTimer = 0;
	
	public static final int[] lookAtTimes = new int[]{1, 10, 20, 10, 20, 10};
	
	public enum LookAtState
	{
		NONE,
		TILT1,
		LOOK1,
		TILT2,
		LOOK2,
		UNTILT
	}
	
	public GunAnimations()
	{
		
	}
	
	public void update()
	{
		lastPumped = pumped;
		
		if(timeUntilPump > 0)
		{
			timeUntilPump--;
			if(timeUntilPump == 0)
			{
				//Pump it!
				pumping = true;
				lastPumped = pumped = -1F;
			}
		}
		
		if(pumping)
		{
			pumped += 2F / timeToPumpFor;
			if(pumped >= 0.999F)
				pumping = false;
		}
		
		lastGunSlide = gunSlide;
		if(gunSlide > 0)
			gunSlide *= 0.4F;
		
		lastReloadAnimationProgress = reloadAnimationProgress;
		if(reloading)
			reloadAnimationProgress += 1F / reloadAnimationTime;
		if(reloading && reloadAnimationProgress >= 1F)
			reloading = false;
		
		minigunBarrelRotation += minigunBarrelRotationSpeed;
		minigunBarrelRotationSpeed *= 0.9F;
		
		if(meleeAnimationLength > 0)
		{
			meleeAnimationProgress++;
			//If we are done, reset
			if(meleeAnimationProgress == meleeAnimationLength)
				meleeAnimationProgress = meleeAnimationLength = 0;
		}
		
		float scale = 0.5f;
		float offsetScale = 0.005f;
		
		if(recoil > 0)
			recoil *= 0.5F;
		
		recoilVelocity.x += (random.nextGaussian() - 0.5f) * recoil * offsetScale;
		recoilVelocity.y += (random.nextGaussian() - 0.5f) * recoil * offsetScale;
		recoilVelocity.z += (random.nextGaussian() - 0.25f) * recoil * offsetScale;
		recoilVelocity.scale(0.5f);
		
		Vector3f.add(recoilOffset, recoilVelocity, recoilOffset);
		
		recoilOffset.scale(0.9f);
		
		recoilAngle -= recoil * scale;
		antiRecoil += recoil;
		
		recoilAngle += antiRecoil * 0.2f * scale;
		antiRecoil *= 0.8F;
		
		switch(lookAt)
		{
			case NONE:
				lookAtTimer = 0;
				break;
			case TILT1:
			case LOOK1:
			case TILT2:
			case LOOK2:
			case UNTILT:
			{
				lookAtTimer++;
				if(lookAtTimer >= lookAtTimes[lookAt.ordinal()])
				{
					lookAt = LookAtState.values()[(lookAt.ordinal() + 1) % LookAtState.values().length];
					lookAtTimer = 0;
				}
				break;
			}
			default:
				break;
		}
	}
	
	public void doShoot(int pumpDelay, int pumpTime)
	{
		minigunBarrelRotationSpeed += 2F;
		lastGunSlide = gunSlide = 1F;
		timeUntilPump = pumpDelay;
		timeToPumpFor = pumpTime;
	}
	
	public void doReload(int reloadTime, int pumpDelay, int pumpTime)
	{
		reloading = true;
		lastReloadAnimationProgress = reloadAnimationProgress = 0F;
		reloadAnimationTime = reloadTime;
		timeUntilPump = pumpDelay;
		timeToPumpFor = pumpTime;
	}
	
	public void doMelee(int meleeTime)
	{
		meleeAnimationLength = meleeTime;
	}
}
