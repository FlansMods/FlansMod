package co.uk.flansmods.client.model;

import net.minecraft.client.model.ModelBase;
import co.uk.flansmods.client.tmt.ModelRendererTurbo;
import co.uk.flansmods.common.EntityVehicle;

//Extensible ModelVehicle class for rendering vehicle models
public class ModelVehicle extends ModelBase
{
    public void render(float f, float f1, float f2, float f3, float f4, float f5, EntityVehicle vehicle)
    {		
		//Rendering the body
        for(int i = 0; i < bodyModel.length; i++)
        {
			bodyModel[i].render(f5);
        }	
		
		//Wheels
		for(int i = 0; i < leftBackWheelModel.length; i++)
		{
			leftBackWheelModel[i].render(f5);
		}
		for(int i = 0; i < rightBackWheelModel.length; i++)
		{
			rightBackWheelModel[i].render(f5);
		}
		for(int i = 0; i < leftFrontWheelModel.length; i++)
		{
			leftFrontWheelModel[i].rotateAngleY = -vehicle.wheelsYaw * 3.14159265F / 180F * 10F;
			leftFrontWheelModel[i].render(f5);
		}
		for(int i = 0; i < rightFrontWheelModel.length; i++)
		{
			rightFrontWheelModel[i].rotateAngleY = -vehicle.wheelsYaw * 3.14159265F / 180F * 10F;
			rightFrontWheelModel[i].render(f5);
		}
	}
	
    public void renderGun(float f, float f1, float f2, float f3, float f4, float f5, EntityVehicle vehicle, float gunYaw, float gunPitch)
    {		
		for(int i = 0; i < gunModel.length; i++)
		{
			gunModel[i].rotateAngleX = gunPitch * 3.14159265F / 180F;
			gunModel[i].render(f5);
		}		
		if(vehicle.data.ammo[1] != null)
		{
			for(int i = 0; i < ammoModel.length; i++)
			{
				ammoModel[i].rotateAngleX = gunPitch * 3.14159265F / 180F;
				ammoModel[i].render(f5);
			}
		}
    }
	
	public void renderTurret(float f, float f1, float f2, float f3, float f4, float f5, EntityVehicle vehicle, float gunYaw, float gunPitch)
    {		
		for(int i = 0; i < turretModel.length; i++)
		{
			//turretModel[i].rotateAngleX = gunPitch * 3.14159265F / 180F;
			turretModel[i].render(f5);
		}		
		for(int i = 0; i < barrelModel.length; i++)
		{
			barrelModel[i].rotateAngleZ = -gunPitch * 3.14159265F / 180F;
			barrelModel[i].render(f5);
		}
    }
	
	public void flipAll()
	{
		for(int i = 0; i < bodyModel.length; i++)
		{
			bodyModel[i].doMirror(false, true, true);
			bodyModel[i].setRotationPoint(bodyModel[i].rotationPointX, - bodyModel[i].rotationPointY, - bodyModel[i].rotationPointZ);
		}
		for(int i = 0; i < turretModel.length; i++)
		{
			turretModel[i].doMirror(false, true, true);
			turretModel[i].setRotationPoint(turretModel[i].rotationPointX, - turretModel[i].rotationPointY, - turretModel[i].rotationPointZ);
		}
		for(int i = 0; i < barrelModel.length; i++)
		{
			barrelModel[i].doMirror(false, true, true);
			barrelModel[i].setRotationPoint(barrelModel[i].rotationPointX, - barrelModel[i].rotationPointY, - barrelModel[i].rotationPointZ);
		}
		for(int i = 0; i < leftFrontWheelModel.length; i++)
		{
			leftFrontWheelModel[i].doMirror(false, true, true);
			leftFrontWheelModel[i].setRotationPoint(leftFrontWheelModel[i].rotationPointX, - leftFrontWheelModel[i].rotationPointY, - leftFrontWheelModel[i].rotationPointZ);
		}
		for(int i = 0; i < rightFrontWheelModel.length; i++)
		{
			rightFrontWheelModel[i].doMirror(false, true, true);
			rightFrontWheelModel[i].setRotationPoint(rightFrontWheelModel[i].rotationPointX, - rightFrontWheelModel[i].rotationPointY, - rightFrontWheelModel[i].rotationPointZ);
		}
		for(int i = 0; i < leftBackWheelModel.length; i++)
		{
			leftBackWheelModel[i].doMirror(false, true, true);
			leftBackWheelModel[i].setRotationPoint(leftBackWheelModel[i].rotationPointX, - leftBackWheelModel[i].rotationPointY, - leftBackWheelModel[i].rotationPointZ);
		}
		for(int i = 0; i < rightBackWheelModel.length; i++)
		{
			rightBackWheelModel[i].doMirror(false, true, true);
			rightBackWheelModel[i].setRotationPoint(rightBackWheelModel[i].rotationPointX, - rightBackWheelModel[i].rotationPointY, - rightBackWheelModel[i].rotationPointZ);
		}
	}	
	
	public void translateAll(int y)
	{
		for(ModelRendererTurbo mod : bodyModel)
		{
			mod.rotationPointY += y;
		}
		for(ModelRendererTurbo mod : turretModel)
		{
			mod.rotationPointY += y;
		}
		for(ModelRendererTurbo mod : barrelModel)
		{
			mod.rotationPointY += y;
		}
		for(ModelRendererTurbo mod : gunModel)
		{
			mod.rotationPointY += y;
		}
		for(ModelRendererTurbo mod : ammoModel)
		{
			mod.rotationPointY += y;
		}
		for(ModelRendererTurbo mod : leftFrontWheelModel)
		{
			mod.rotationPointY += y;
		}
		for(ModelRendererTurbo mod : rightFrontWheelModel)
		{
			mod.rotationPointY += y;
		}
		for(ModelRendererTurbo mod : leftBackWheelModel)
		{
			mod.rotationPointY += y;
		}
		for(ModelRendererTurbo mod : rightBackWheelModel)
		{
			mod.rotationPointY += y;
		}
	}

    public ModelRendererTurbo bodyModel[];				//The main body of the vehicle
    public ModelRendererTurbo turretModel[];			//The turret (for tanks)
	public ModelRendererTurbo barrelModel[];			//The barrel of the main turret
    public ModelRendererTurbo gunModel[];   			//The passenger controlled gun model
	public ModelRendererTurbo ammoModel[];				//The ammo box for the above gun
    public ModelRendererTurbo leftFrontWheelModel[];	//Obvious really...
    public ModelRendererTurbo rightFrontWheelModel[];
    public ModelRendererTurbo leftBackWheelModel[];
    public ModelRendererTurbo rightBackWheelModel[];
}
