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
		for (ModelRendererTurbo aBipodModel : bipodModel) {
			aBipodModel.doMirror(false, true, true);
			aBipodModel.setRotationPoint(aBipodModel.rotationPointX, -aBipodModel.rotationPointY, -aBipodModel.rotationPointZ);
		}
		for (ModelRendererTurbo aGunModel : gunModel) {
			aGunModel.doMirror(false, true, true);
			aGunModel.setRotationPoint(aGunModel.rotationPointX, -aGunModel.rotationPointY, -aGunModel.rotationPointZ);
		}
		for (ModelRendererTurbo anAmmoModel : ammoModel) {
			anAmmoModel.doMirror(false, true, true);
			anAmmoModel.setRotationPoint(anAmmoModel.rotationPointX, -anAmmoModel.rotationPointY, -anAmmoModel.rotationPointZ);
		}
		for (ModelRendererTurbo anAmmoBoxModel : ammoBoxModel) {
			anAmmoBoxModel.doMirror(false, true, true);
			anAmmoBoxModel.setRotationPoint(anAmmoBoxModel.rotationPointX, -anAmmoBoxModel.rotationPointY, -anAmmoBoxModel.rotationPointZ);
		}
	}	
}
