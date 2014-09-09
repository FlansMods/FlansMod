package com.flansmod.client.model;

import net.minecraft.client.model.ModelBase;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelGun extends ModelBase 
{
	//These first 4 models are static with no animation
	public ModelRendererTurbo[] gunModel = new ModelRendererTurbo[0];
	//These models appear when no attachment exists
	public ModelRendererTurbo[] defaultBarrelModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] defaultScopeModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] defaultStockModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] defaultGripModel = new ModelRendererTurbo[0];
	
	//Animated models follow. 
	public ModelRendererTurbo[] ammoModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] revolverBarrelModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] breakActionModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] slideModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] pumpModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] minigunBarrelModel = new ModelRendererTurbo[0];
	/** The point about which the minigun barrel rotates. Rotation is along the line of the gun through this point */
	public Vector3f minigunBarrelOrigin = new Vector3f();
	
	//These designate the locations of 3D attachment models on the gun
	public Vector3f barrelAttachPoint = new Vector3f();
	public Vector3f scopeAttachPoint = new Vector3f();
	public Vector3f stockAttachPoint = new Vector3f();
	public Vector3f gripAttachPoint = new Vector3f();
	
	//Various animation parameters
	public float gunSlideDistance = 1F / 4F;
	public EnumAnimationType animationType = EnumAnimationType.NONE;
	public EnumMeleeAnimation meleeAnimation = EnumMeleeAnimation.DEFAULT;
	public float tiltGunTime = 0.25F, unloadClipTime = 0.25F, loadClipTime = 0.25F, untiltGunTime = 0.25F;
	/** If true, then the scope attachment will move with the top slide */
	public boolean scopeIsOnSlide = false;
	/** For rifles and shotguns. Currently a generic reload animation regardless of how full the internal magazine already is */
	public float numBulletsInReloadAnimation = 1;
	/** For shotgun pump handles and rifle bolts */
	public int pumpDelay = 0, pumpDelayAfterReload = 0, pumpTime = 1;
	/** For shotgun pump handle */
	public float pumpHandleDistance = 4F / 16F;
	/** For end loaded projectiles */
	public float endLoadedAmmoDistance = 1F;
	/** If true, then the grip attachment will move with the shotgun pump */
	public boolean gripIsOnPump = false;
	/** The rotation point for the barrel break */
	public Vector3f barrelBreakPoint = new Vector3f();
	
	/** This offsets the render position for third person */
	public Vector3f thirdPersonOffset = new Vector3f();
	
	public void renderGun(float f)
	{
		render(gunModel, f);
	}
	
	public void renderSlide(float f)
	{
		render(slideModel, f);
	}
	
	public void renderPump(float f)
	{
		render(pumpModel, f);
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
	
	public void renderDefaultGrip(float f)
	{
		render(defaultGripModel, f);
	}
	
	public void renderAmmo(float f)
	{
		render(ammoModel, f);
	}

	public void renderMinigunBarrel(float f) 
	{
		render(minigunBarrelModel, f);
	}
	
	public void renderRevolverBarrel(float f) 
	{
		render(revolverBarrelModel, f);
	}
	
	public void renderBreakAction(float f)
	{
		render(breakActionModel, f);
	}


	/** For renderering models simply */
	private void render(ModelRendererTurbo[] models, float f)
	{
		for(ModelRendererTurbo model : models)
			if(model != null)
				model.render(f);
	}
	
	/** Flips the model. Generally only for backwards compatibility */
	public void flipAll()
	{
		flip(gunModel);
		flip(defaultBarrelModel);
		flip(defaultScopeModel);
		flip(defaultStockModel);
		flip(defaultGripModel);
		flip(ammoModel);
		flip(slideModel);
		flip(pumpModel);
		flip(minigunBarrelModel);
		flip(revolverBarrelModel);
	}	
	
	protected void flip(ModelRendererTurbo[] model)
	{
		for(ModelRendererTurbo part : model)
		{
			part.doMirror(false, true, true);
			part.setRotationPoint(part.rotationPointX, - part.rotationPointY, - part.rotationPointZ);
		}
	}
	
	/** Translates the model */
	public void translateAll(float x, float y, float z)
	{
		translate(gunModel, x, y, z);
		translate(defaultBarrelModel, x, y, z);
		translate(defaultScopeModel, x, y, z);
		translate(defaultStockModel, x, y, z);
		translate(defaultGripModel, x, y, z);
		translate(ammoModel, x, y, z);
		translate(slideModel, x, y, z);
		translate(pumpModel, x, y, z);
		translate(minigunBarrelModel, x, y, z);
		translate(revolverBarrelModel, x, y, z);
	}
	
	protected void translate(ModelRendererTurbo[] model, float x, float y, float z)
	{
		for(ModelRendererTurbo mod : model)
		{
			mod.rotationPointX += x;
			mod.rotationPointY += y;
			mod.rotationPointZ += z;
		}
	}


}
