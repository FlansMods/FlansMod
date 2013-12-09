package co.uk.flansmods.client.model;

public class GunAnimations 
{
	public static GunAnimations defaults = new GunAnimations();
	
	/** (Purely aesthetic) gun animation variables */
	/** */
	public float gunSlide = 0F, lastGunSlide = 0F;
	
	public boolean reloading = false;
	
	public float reloadAnimationTime = 0;
	
	public float reloadAnimationProgress = 0F, lastReloadAnimationProgress = 0F;
	
	public GunAnimations()
	{
		
	}
	
	public void update()
	{
		lastGunSlide = gunSlide;
		if(gunSlide > 0)
			gunSlide *= 0.4F;
		
		lastReloadAnimationProgress = reloadAnimationProgress;
		if(reloading)
			reloadAnimationProgress += 1F / reloadAnimationTime;
		if(reloading && reloadAnimationProgress >= 1F)
			reloading = false;
	}
	
	public void doReload(int reloadTime)
	{
		reloading = true;
		lastReloadAnimationProgress = reloadAnimationProgress = 0F;
		reloadAnimationTime = reloadTime;
	}
}
