package com.flansmod.client.model;

import net.minecraft.client.model.ModelBase;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.guns.EntityMG;

public class ModelMG extends ModelBase
{
	public ModelRendererTurbo bipodModel[];
	public ModelRendererTurbo gunModel[];
	public ModelRendererTurbo ammoModel[];
	public ModelRendererTurbo ammoBoxModel[] = new ModelRendererTurbo[0];

	public void renderBipod(float f, float f1, float f2, float f3, float f4, float f5, EntityMG mg)
	{
		for (ModelRendererTurbo bipodPart : bipodModel)
		{
			bipodPart.render(f5);
		}
		if (mg.reloadTimer > 0 || mg.ammo == null)
			return;

		for (ModelRendererTurbo ammoBoxPart : ammoBoxModel)
		{
			ammoBoxPart.render(f5);
		}
	}

	public void renderGun(float f, float f1, float f2, float f3, float f4, float f5, float f6, EntityMG mg)
	{
		for (ModelRendererTurbo gunPart : gunModel)
		{
			gunPart.rotateAngleX = -(mg.prevRotationPitch + (mg.rotationPitch - mg.prevRotationPitch) * f6) / 180F * 3.141592653589793238462643383279502884197169399F;
			gunPart.render(f5);
		}

		if (mg.reloadTimer > 0 || mg.ammo == null)
			return;

		for (ModelRendererTurbo ammoPart : ammoModel)
		{
			ammoPart.rotateAngleX = -(mg.prevRotationPitch + (mg.rotationPitch - mg.prevRotationPitch) * f6) / 180F * 3.141592653589793238462643383279502884197169399F;
			ammoPart.render(f5);
		}
	}
	
	public void flipAll()
	{
		for(int i = 0; i < bipodModel.length; i++)
		{
			bipodModel[i].doMirror(false, true, true);
			bipodModel[i].setRotationPoint(bipodModel[i].rotationPointX, - bipodModel[i].rotationPointY, - bipodModel[i].rotationPointZ);
		}
		for(int i = 0; i < gunModel.length; i++)
		{
			gunModel[i].doMirror(false, true, true);
			gunModel[i].setRotationPoint(gunModel[i].rotationPointX, - gunModel[i].rotationPointY, - gunModel[i].rotationPointZ);
		}
		for(int i = 0; i < ammoModel.length; i++)
		{
			ammoModel[i].doMirror(false, true, true);
			ammoModel[i].setRotationPoint(ammoModel[i].rotationPointX, - ammoModel[i].rotationPointY, - ammoModel[i].rotationPointZ);
		}
		for(int i = 0; i < ammoBoxModel.length; i++)
		{
			ammoBoxModel[i].doMirror(false, true, true);
			ammoBoxModel[i].setRotationPoint(ammoBoxModel[i].rotationPointX, - ammoBoxModel[i].rotationPointY, - ammoBoxModel[i].rotationPointZ);
		}
	}	
}
