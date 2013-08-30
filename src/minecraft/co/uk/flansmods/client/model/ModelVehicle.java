package co.uk.flansmods.client.model;

import net.minecraft.client.model.ModelBase;
import co.uk.flansmods.client.tmt.ModelRendererTurbo;
import co.uk.flansmods.common.driveables.EntityDriveable;
import co.uk.flansmods.common.driveables.EntityPlane;
import co.uk.flansmods.common.driveables.EntityVehicle;

//Extensible ModelVehicle class for rendering vehicle models
public class ModelVehicle extends ModelDriveable
{
	@Override
	public void render(EntityDriveable driveable, float f1)
	{
		render(0.0625F, (EntityVehicle)driveable, f1);
	}
	
	@Override
	/** GUI render method */
	public void render()
	{
		super.render();
		renderPart(leftBackWheelModel);
		renderPart(rightBackWheelModel);
		renderPart(leftFrontWheelModel);
		renderPart(rightFrontWheelModel);
		renderPart(bodyDoorCloseModel);
		renderPart(trailerModel);
		renderPart(turretModel);
		renderPart(barrelModel);
	}
	
    public void render(float f5, EntityVehicle vehicle, float f)
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
			leftFrontWheelModel[i].rotateAngleY = -vehicle.wheelsYaw * 3.14159265F / 180F * 3F;
			leftFrontWheelModel[i].render(f5);
		}
		for(int i = 0; i < rightFrontWheelModel.length; i++)
		{
			rightFrontWheelModel[i].rotateAngleY = -vehicle.wheelsYaw * 3.14159265F / 180F * 3F;
			rightFrontWheelModel[i].render(f5);
		}
		for(int i = 0; i < bodyDoorOpenModel.length; i++)
		{
			if(vehicle.varDoor == true)
				bodyDoorOpenModel[i].render(f5);
		}
		for(int i = 0; i < bodyDoorCloseModel.length; i++)
		{
			if(vehicle.varDoor == false)
				bodyDoorCloseModel[i].render(f5);
		}
		for(int i = 0; i < trailerModel.length; i++)
		{
			//trailerModel[i].rotateAngleY = vehicle.trailerAngle;
			trailerModel[i].render(f5);
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
	
	@Override
	public void flipAll()
	{
		super.flipAll();
		flip(turretModel);
		flip(barrelModel);
		flip(leftFrontWheelModel);
		flip(rightFrontWheelModel);
		flip(leftBackWheelModel);
		flip(rightBackWheelModel);
		flip(bodyDoorOpenModel);
		flip(bodyDoorCloseModel);
		flip(trailerModel);
	}	
	
	public void translateAll(int y)
	{
		translate(bodyModel, y);
		translate(turretModel, y);
		translate(barrelModel, y);
		translate(leftFrontWheelModel, y);
		translate(rightFrontWheelModel, y);
		translate(leftBackWheelModel, y);
		translate(rightBackWheelModel, y);
		translate(bodyDoorOpenModel, y);
		translate(bodyDoorCloseModel, y);
		translate(trailerModel, y);
	}
	
	protected void translate(ModelRendererTurbo[] model, int y)
	{
		for(ModelRendererTurbo mod : model)
		{
			mod.rotationPointY += y;
		}
	}

    public ModelRendererTurbo turretModel[] = new ModelRendererTurbo[0];			//The turret (for tanks)
	public ModelRendererTurbo barrelModel[] = new ModelRendererTurbo[0];			//The barrel of the main turret
    public ModelRendererTurbo frontWheelModel[] = new ModelRendererTurbo[0];		//Front and back wheels are for bicycles and motorbikes and whatnot
    public ModelRendererTurbo backWheelModel[] = new ModelRendererTurbo[0];
    public ModelRendererTurbo leftFrontWheelModel[] = new ModelRendererTurbo[0];	//This set of 4 wheels are for 4 or more wheeled things
    public ModelRendererTurbo rightFrontWheelModel[] = new ModelRendererTurbo[0];	//The front wheels will turn as the player steers, and the back ones will not
    public ModelRendererTurbo leftBackWheelModel[] = new ModelRendererTurbo[0];		//They will all turn as the car drives if the option to do so is set on
    public ModelRendererTurbo rightBackWheelModel[] = new ModelRendererTurbo[0];	//In the vehicle type file
    public ModelRendererTurbo rightTrackModel[] = new ModelRendererTurbo[0];
    public ModelRendererTurbo leftTrackModel[] = new ModelRendererTurbo[0];
	
	public ModelRendererTurbo bodyDoorOpenModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo bodyDoorCloseModel[] = new ModelRendererTurbo[0];	
	public ModelRendererTurbo trailerModel[] = new ModelRendererTurbo[0];
}
