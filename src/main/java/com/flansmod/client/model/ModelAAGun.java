package com.flansmod.client.model;

import net.minecraft.client.model.ModelBase;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.guns.EntityAAGun;

public class ModelAAGun extends ModelBase
{
	public boolean oldModel = false;

    public void renderBase(float f, float f1, float f2, float f3, float f4, float f5, EntityAAGun aa)
    {
		for (ModelRendererTurbo aBaseModel : baseModel) {
			aBaseModel.render(f5);
		}
    }
	
	public void renderGun(float f, float f1, float f2, float f3, float f4, float f5, EntityAAGun aa)
    {
		for (ModelRendererTurbo aSeatModel : seatModel) {
			aSeatModel.render(f5);
		}

		for (ModelRendererTurbo aGunModel : gunModel) {
			aGunModel.setPosition(barrelX, barrelY, barrelZ);
			aGunModel.rotateAngleZ = -aa.gunPitch / 180F * 3.141592653589793238462643383279502884197169399F;
			aGunModel.render(f5);
		}

		for (ModelRendererTurbo aGunsightModel : gunsightModel) {
			aGunsightModel.rotateAngleZ = -aa.gunPitch / 180F * 3.141592653589793238462643383279502884197169399F;
			aGunsightModel.render(f5);
		}

        for(int i = 0; i < barrelModel.length; i++)
        {
		    for(int j = 0; j < barrelModel[i].length; j++)
			{
				barrelModel[i][j].setPosition(-aa.barrelRecoil[i] * (float)(Math.cos(-aa.gunPitch * 3.14159265358979F / 180F)) + barrelX, - aa.barrelRecoil[i] * (float)(Math.sin(-aa.gunPitch * 3.14159265358979F / 180F)) + barrelY, barrelZ);
				barrelModel[i][j].rotateAngleZ = -aa.gunPitch / 180F * 3.141592653589793238462643383279502884197169399F;
				barrelModel[i][j].render(f5);
			}
        }
		
		for(int i = 0; i < ammoModel.length; i++)
        {
			if(aa.ammo[i] != null)
			{
				for(int j = 0; j < ammoModel[i].length; j++)
				{
					ammoModel[i][j].setPosition(barrelX, barrelY, barrelZ);
					ammoModel[i][j].rotateAngleZ = -aa.gunPitch / 180F * 3.141592653589793238462643383279502884197169399F;
					ammoModel[i][j].render(f5);
				}
			}
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }
	
	public void flipAll()
	{
		for (ModelRendererTurbo aBaseModel : baseModel) {
			aBaseModel.doMirror(false, true, true);
			aBaseModel.setRotationPoint(aBaseModel.rotationPointX, -aBaseModel.rotationPointY, -aBaseModel.rotationPointZ);
		}
		for (ModelRendererTurbo aSeatModel : seatModel) {
			aSeatModel.doMirror(false, true, true);
			aSeatModel.setRotationPoint(aSeatModel.rotationPointX, -aSeatModel.rotationPointY, -aSeatModel.rotationPointZ);
		}
		for (ModelRendererTurbo aGunModel : gunModel) {
			aGunModel.doMirror(false, true, true);
			aGunModel.setRotationPoint(aGunModel.rotationPointX, -aGunModel.rotationPointY, -aGunModel.rotationPointZ);
		}
		for (ModelRendererTurbo aGunsightModel : gunsightModel) {
			aGunsightModel.doMirror(false, true, true);
			aGunsightModel.setRotationPoint(aGunsightModel.rotationPointX, -aGunsightModel.rotationPointY, -aGunsightModel.rotationPointZ);
		}
		for (ModelRendererTurbo[] aBarrelModel : barrelModel) {
			for (int j = 0; j < aBarrelModel.length; j++) {
				aBarrelModel[j].doMirror(false, true, true);
				aBarrelModel[j].setRotationPoint(aBarrelModel[j].rotationPointX, -aBarrelModel[j].rotationPointY, -aBarrelModel[j].rotationPointZ);
			}
		}
		for (ModelRendererTurbo[] anAmmoModel : ammoModel) {
			for (int j = 0; j < anAmmoModel.length; j++) {
				anAmmoModel[j].doMirror(false, true, true);
				anAmmoModel[j].setRotationPoint(anAmmoModel[j].rotationPointX, -anAmmoModel[j].rotationPointY, -anAmmoModel[j].rotationPointZ);
			}
		}
	}	

    public ModelRendererTurbo baseModel[] = new ModelRendererTurbo[0];		//The base which stays put
	public ModelRendererTurbo seatModel[] = new ModelRendererTurbo[0];			//The bit which swivels around the yaw axis, but which does not pitch
	public ModelRendererTurbo gunModel[] = new ModelRendererTurbo[0];			//The bit of the gun that points where you look, but doesn't move
	public ModelRendererTurbo barrelModel[][] = new ModelRendererTurbo[0][0];		//The end of the barrel that recoils
	public ModelRendererTurbo ammoModel[][] = new ModelRendererTurbo[0][0];		//The magazines for each barrel.
	public ModelRendererTurbo gunsightModel[] = new ModelRendererTurbo[0];	//The gunsight for the Gun.

	public int barrelX, barrelY, barrelZ;
}
