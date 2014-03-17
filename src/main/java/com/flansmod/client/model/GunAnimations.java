package com.flansmod.client.model;

public class GunAnimations 
{
	public static GunAnimations defaults = new GunAnimations();
	
	/** (Purely aesthetic) gun animation variables */
	/** Slide */
	public float gunSlide = 0F, lastGunSlide = 0F;
	/** Delayed Reload Animations */
	public int timeUntilPump = 0, timeToPumpFor = 0;
	/** Delayed Reload Animations : -1, 1 = At rest, 0 = Mid Animation */
	public float pumped = -1F, lastPumped = -1F;
	/** Delayed Reload Animations : Doing the delayed animation */
	public boolean pumping = false;
	
	public boolean reloading = false;
	
	public float reloadAnimationTime = 0;
	
	public float reloadAnimationProgress = 0F, lastReloadAnimationProgress = 0F;
	
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
	}
	
	public void doShoot(int pumpDelay, int pumpTime)
	{
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
}
