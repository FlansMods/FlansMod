package co.uk.flansmods.client.model;

import co.uk.flansmods.client.tmt.ModelRendererTurbo;
import co.uk.flansmods.common.guns.EntityMG;
import co.uk.flansmods.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;

public class ModelGun extends ModelBase 
{
	//These first 4 models are static with no animation
	public ModelRendererTurbo[] gunModel = new ModelRendererTurbo[0];
	//These models appear when no attachment exists
	public ModelRendererTurbo[] defaultBarrelModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] defaultScopeModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] defaultStockModel = new ModelRendererTurbo[0];
	
	//Animated models follow. 
	public ModelRendererTurbo[] ammoModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] slideModel = new ModelRendererTurbo[0];

	
	//These designate the locations of 3D attachment models on the gun
	public Vector3f barrelAttachPoint = new Vector3f();
	public Vector3f scopeAttachPoint = new Vector3f();
	public Vector3f stockAttachPoint = new Vector3f();
	
	//Various animation parameters
	public float gunSlideDistance = 1F / 4F;
	public EnumAnimationType animationType = EnumAnimationType.NONE;
	public float tiltGunTime = 0.25F, unloadClipTime = 0.25F, loadClipTime = 0.25F, untiltGunTime = 0.25F;
	
	public void renderGun(float f)
	{
		render(gunModel, f);
	}
	
	public void renderSlide(float f)
	{
		render(slideModel, f);
	}
	
	public void renderDefaultScope(float f)
	{
		render(defaultScopeModel, f);
	}
	
	public void renderDefaultBarrel(float f)
	{
		render(defaultBarrelModel, f);
	}
	
	public void renderDefaultStock(float f)
	{
		render(defaultStockModel, f);
	}
	
	public void renderAmmo(float f)
	{
		render(ammoModel, f);
	}

	/** For renderering models simply */
	private void render(ModelRendererTurbo[] models, float f)
	{
		for(ModelRendererTurbo model : models)
			if(model != null)
				model.render(f);
	}
}
