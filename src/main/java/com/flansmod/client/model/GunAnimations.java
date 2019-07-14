package com.flansmod.client.model;

import java.util.Random;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.vector.Vector3f;

public class GunAnimations 
{
	public static GunAnimations defaults = new GunAnimations();
	
    
	/** (Purely aesthetic) gun animation variables */
	public boolean isGunEmpty;
	/** Recoil */
	public float gunRecoil = 0F, lastGunRecoil = 0F, recoilAmount = 0.33F;
	/** Slide */
	public float gunSlide = 0F, lastGunSlide = 0F;
	/** Delayed Reload Animations */
	public int timeUntilPump = 0, timeToPumpFor = 0;
	/** Delayed Reload Animations : -1, 1 = At rest, 0 = Mid Animation */
	public float pumped = -1F, lastPumped = -1F;
	/** Delayed Reload Animations : Doing the delayed animation */
	public boolean pumping = false;
	/** Charge handle variables */
	public int timeUntilCharge = 0, timeToChargeFor = 0;
	public float charged = -1F, lastCharged = -1F;
	public boolean charging = false;
	
	public boolean reloading = false;
	public float reloadAnimationTime = 0;
	public float reloadAnimationProgress = 0F, lastReloadAnimationProgress = 0F;
	public int reloadAmmoCount = 1;

	public float minigunBarrelRotation = 0F;
	public float minigunBarrelRotationSpeed = 0F;
	
	public int muzzleFlashTime = 0;
	public int flashInt = 0;

	/** Casing mechanics */
	public int timeUntilCasing = 0;
	public int casingStage = 0;
	public int lastCasingStage = 0;

	/** Hammer model mechanics */
	/** If in single action, the model will play a modified animation and delay hammer reset */
	public float hammerRotation = 0F;
	public float althammerRotation = 0F;
	public int timeUntilPullback = 0;
	public float gunPullback = -1F, lastGunPullback = -1F;
	public boolean isFired = false;
    
    public Vector3f casingRandom = new Vector3f(0F, 0F, 0F);
    
	/** Melee animations */
	public int meleeAnimationProgress = 0, meleeAnimationLength = 0;
	
	public GunAnimations()
	{
		
	}
	
	public void update()
	{
		//Assign values
		lastPumped = pumped;
		lastCharged = charged;
		lastGunPullback = gunPullback;
		lastCasingStage = casingStage;

		//Time until pump-action
		if(timeUntilPump > 0)
		{
			timeUntilPump--;
			if(timeUntilPump == 0)
			{
				//Pump it!
				pumping = true;	
				lastPumped = pumped = -1F;
				FlansModClient.shotState = 1;
			}
			
		}

		//Timer until pulling back the charge handle/bolt
		if(timeUntilCharge > 0)
		{
			timeUntilCharge--;
			if(timeUntilCharge == 0)
			{
				//Pump it!
				charging = true;	
				lastCharged = charged = -1F;
			}
			
		}

		//Time until hammer pullback
		if(timeUntilPullback > 0)
		{
			timeUntilPullback--;
			if(timeUntilPullback == 0)
			{
				//Reset the hammer
				isFired = true;
				lastGunPullback = gunPullback = -1F;
			}
		}
		else
		{
			//Automatically reset hammer
			hammerRotation *= 0.6F;
			althammerRotation *= 0.6F;
		}

		//Time until bullet casing ejection
		if(timeUntilCasing > 0)
		{
			timeUntilCasing--;
			if(timeUntilCasing == 0)
				casingStage++;
		}
		else
		{
			casingStage++;
		}

		if(muzzleFlashTime > 0)
			muzzleFlashTime--;
		
		if(pumping)
		{
			pumped += 2F / timeToPumpFor;
			if(pumped >= 0.999F)
				pumping = false;
		}
		if(charging)
		{
			charged += 2F / timeToChargeFor;
			if(charged >= 0.999F)
				charging = false;
		}

		if(isFired)
		{
			gunPullback += 2F / 4;
			if(gunPullback >= 0.999F)
				isFired = false;
		}

		//Recoil model
		lastGunRecoil = gunRecoil;
		if(gunRecoil > 0)
			gunRecoil *= 0.7F;

		//Slide model
		lastGunSlide = gunSlide;
		if(isGunEmpty)
			lastGunSlide = gunSlide = 0.5F;
		if(!isGunEmpty && gunSlide > 0.9)	//Add one extra frame to slide
			gunSlide -= 0.1F;
		else if(gunSlide > 0 && !isGunEmpty)
			gunSlide *= 0.5F;

		//Reload
		lastReloadAnimationProgress = reloadAnimationProgress;
		if(reloading)
			reloadAnimationProgress += 1F / reloadAnimationTime;
		if(reloading && reloadAnimationProgress >= 0.9F)	//reset if slide locked
			isGunEmpty = false;
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
	}

	//Not to be used for mechas
	public void onGunEmpty(boolean atLastBullet)
	{
		isGunEmpty = atLastBullet;
	}
	
	public void doShoot(int pumpDelay, int pumpTime, int hammerDelay, float hammerAngle, float althammerAngle, int casingDelay)
	{
		Random r = new Random();

		//Accumulative recoil function
		lastGunRecoil = gunRecoil += recoilAmount;

		minigunBarrelRotationSpeed += 2F;
		lastGunSlide = gunSlide = 1F;
		timeUntilPump = pumpDelay;
		timeToPumpFor = pumpTime;
		timeUntilPullback = hammerDelay;
		timeUntilCasing = casingDelay;
		hammerRotation = hammerAngle;
		althammerRotation = althammerAngle;
		muzzleFlashTime = 2;

		int Low = -1;
		int High = 3;
		int result = r.nextInt(High-Low) + Low;
		if(result == -1) result = 0;
		if(result == 3) result = 2;
        flashInt = result;
        
        casingRandom.x = ((r.nextFloat()*2)-1);
        casingRandom.y = ((r.nextFloat()*2)-1);
        casingRandom.z = ((r.nextFloat()*2)-1);
		casingStage = 0;
		
		if(pumpDelay == 0)
		{
			FlansModClient.shotState = 1;
		}
	}
		
	public void doReload(int reloadTime, int pumpDelay, int pumpTime, int chargeDelay, int chargeTime, int ammoCount)
	{
		reloading = true;
		lastReloadAnimationProgress = reloadAnimationProgress = 0F;
		reloadAnimationTime = reloadTime;
		timeUntilPump = pumpDelay;
		timeToPumpFor = pumpTime;
		timeUntilCharge = chargeDelay;
		timeToChargeFor = chargeTime;
		reloadAmmoCount = ammoCount;
		FlansModClient.lastBulletReload = ammoCount - 1;
	}
	
	public void doMelee(int meleeTime)
	{
		meleeAnimationLength = meleeTime;
	}
}
