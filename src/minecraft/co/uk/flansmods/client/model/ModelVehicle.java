package co.uk.flansmods.client.model;

import net.minecraft.client.model.ModelBase;
import co.uk.flansmods.client.tmt.ModelRendererTurbo;
import co.uk.flansmods.common.driveables.EntityDriveable;
import co.uk.flansmods.common.driveables.EntityPlane;
import co.uk.flansmods.common.driveables.EntitySeat;
import co.uk.flansmods.common.driveables.EntityVehicle;
import co.uk.flansmods.common.driveables.EnumDriveablePart;

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
		renderPart(steeringWheelModel);
	}
	
    public void render(float f5, EntityVehicle vehicle, float f)
    {
    	boolean rotateWheels = vehicle.getVehicleType().rotateWheels;
    	
		//Rendering the body
        if(vehicle.isPartIntact(EnumDriveablePart.core))
        {
	        for(int i = 0; i < bodyModel.length; i++)
	        {
				bodyModel[i].render(f5);
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
			for(int i = 0; i < steeringWheelModel.length; i++)
			{
				steeringWheelModel[i].rotateAngleX = vehicle.wheelsYaw * 3.14159265F / 180F * 3F;
				steeringWheelModel[i].render(f5);
			}
        }
		
		//Wheels
        if(vehicle.isPartIntact(EnumDriveablePart.backLeftWheel))
        {
			for(int i = 0; i < leftBackWheelModel.length; i++)
			{
				leftBackWheelModel[i].rotateAngleZ = rotateWheels ? -vehicle.wheelsAngle : 0;
				leftBackWheelModel[i].render(f5);
			}
        }
        if(vehicle.isPartIntact(EnumDriveablePart.backRightWheel))
        {
			for(int i = 0; i < rightBackWheelModel.length; i++)
			{
				rightBackWheelModel[i].rotateAngleZ = rotateWheels ? -vehicle.wheelsAngle : 0;
				rightBackWheelModel[i].render(f5);
			}
        }
        if(vehicle.isPartIntact(EnumDriveablePart.frontLeftWheel))
        {
			for(int i = 0; i < leftFrontWheelModel.length; i++)
			{
				leftFrontWheelModel[i].rotateAngleZ = rotateWheels ? -vehicle.wheelsAngle : 0;
				leftFrontWheelModel[i].rotateAngleY = -vehicle.wheelsYaw * 3.14159265F / 180F * 3F;
				leftFrontWheelModel[i].render(f5);
			}
        }
        if(vehicle.isPartIntact(EnumDriveablePart.frontRightWheel))
        {
			for(int i = 0; i < rightFrontWheelModel.length; i++)
			{
				rightFrontWheelModel[i].rotateAngleZ = rotateWheels ? -vehicle.wheelsAngle : 0;
				rightFrontWheelModel[i].rotateAngleY = -vehicle.wheelsYaw * 3.14159265F / 180F * 3F;
				rightFrontWheelModel[i].render(f5);
			}
        }        
        if(vehicle.isPartIntact(EnumDriveablePart.frontWheel))
        {
			for(int i = 0; i < frontWheelModel.length; i++)
			{
				frontWheelModel[i].rotateAngleZ = rotateWheels ? -vehicle.wheelsAngle : 0;
				frontWheelModel[i].rotateAngleY = -vehicle.wheelsYaw * 3.14159265F / 180F * 3F;
				frontWheelModel[i].render(f5);
			}
        }
        if(vehicle.isPartIntact(EnumDriveablePart.backWheel))
        {
			for(int i = 0; i < backWheelModel.length; i++)
			{
				backWheelModel[i].rotateAngleY = -vehicle.wheelsYaw * 3.14159265F / 180F * 3F;
				backWheelModel[i].render(f5);
			}
        }
        
        if(vehicle.isPartIntact(EnumDriveablePart.leftTrack))
        {
			for(int i = 0; i < leftTrackModel.length; i++)
			{
				leftTrackModel[i].render(f5);
			}
			for(int i = 0; i < leftTrackWheelModels.length; i++)
			{
				leftTrackWheelModels[i].rotateAngleY = -vehicle.wheelsYaw * 3.14159265F / 180F * 3F;
				leftTrackWheelModels[i].render(f5);
			}
        }
        
        if(vehicle.isPartIntact(EnumDriveablePart.rightTrack))
        {
			for(int i = 0; i < rightTrackModel.length; i++)
			{
				rightTrackModel[i].render(f5);
			}
			for(int i = 0; i < rightTrackWheelModels.length; i++)
			{
				rightTrackWheelModels[i].rotateAngleY = -vehicle.wheelsYaw * 3.14159265F / 180F * 3F;
				rightTrackWheelModels[i].render(f5);
			}
        }

        if(vehicle.isPartIntact(EnumDriveablePart.trailer))
        {
			for(int i = 0; i < trailerModel.length; i++)
			{
				trailerModel[i].render(f5);
			}
        }
        
        //Render guns
        for(EntitySeat seat : vehicle.seats)
        {
        	//If the seat has a gun model attached
        	if(seat != null && seat.seatInfo != null && seat.seatInfo.gunName != null && gunModels.get(seat.seatInfo.gunName) != null && vehicle.isPartIntact(seat.seatInfo.part))// && !vehicle.rotateWithTurret(seat.seatInfo))
        	{
        		float yaw = seat.prevLooking.getYaw() + (seat.looking.getYaw() - seat.prevLooking.getYaw()) * f;
        		float pitch = seat.prevLooking.getPitch() + (seat.looking.getPitch() - seat.prevLooking.getPitch()) * f;     
        		
        		//Iterate over the parts of that model
        		ModelRendererTurbo[][] gunModel = gunModels.get(seat.seatInfo.gunName);
        		//Yaw only parts
    			for(ModelRendererTurbo gunModelPart : gunModel[0])
    			{
    				//Yaw and render
        			gunModelPart.rotateAngleY = -yaw * 3.14159265F / 180F;
        			gunModelPart.render(f5);
    			}
        		//Yaw and pitch, no recoil parts
    			for(ModelRendererTurbo gunModelPart : gunModel[1])
    			{
    				//Yaw, pitch and render
        			gunModelPart.rotateAngleY = -yaw * 3.14159265F / 180F;
        			gunModelPart.rotateAngleZ = -pitch * 3.14159265F / 180F;
        			gunModelPart.render(f5);
    			}
        		//Yaw, pitch and recoil parts
    			for(ModelRendererTurbo gunModelPart : gunModel[2])
    			{
    				//Yaw, pitch, recoil and render
        			gunModelPart.rotateAngleY = -yaw * 3.14159265F / 180F;
        			gunModelPart.rotateAngleZ = -pitch * 3.14159265F / 180F;
        			gunModelPart.render(f5);
    			}
        	}
        }
	}
		
    /** Render the tank turret */
	public void renderTurret(float f, float f1, float f2, float f3, float f4, float f5, EntityVehicle vehicle)
    {		
		//Render main turret barrel
		{
			float yaw = vehicle.seats[0].looking.getYaw();
			float pitch = vehicle.seats[0].looking.getPitch();
			
			for(int i = 0; i < turretModel.length; i++)
			{
				turretModel[i].render(f5);
			}		
			for(int i = 0; i < barrelModel.length; i++)
			{
				barrelModel[i].rotateAngleZ = -pitch * 3.14159265F / 180F;
				barrelModel[i].render(f5);
			}
		}
		
        //Render turret guns
        /*for(EntitySeat seat : vehicle.seats)
        {
        	//If the seat has a gun model attached
        	if(seat != null && seat.seatInfo != null && seat.seatInfo.gunName != null && gunModels.get(seat.seatInfo.gunName) != null && vehicle.isPartIntact(seat.seatInfo.part) && vehicle.rotateWithTurret(seat.seatInfo))
        	{
        		float yaw = seat.prevLooking.getYaw() + (seat.looking.getYaw() - seat.prevLooking.getYaw()) * f;
        		float pitch = seat.prevLooking.getPitch() + (seat.looking.getPitch() - seat.prevLooking.getPitch()) * f;     
        		
        		//Iterate over the parts of that model
        		ModelRendererTurbo[][] gunModel = gunModels.get(seat.seatInfo.gunName);
        		//Yaw only parts
    			for(ModelRendererTurbo gunModelPart : gunModel[0])
    			{
    				//Yaw and render
        			gunModelPart.rotateAngleY = -yaw * 3.14159265F / 180F;
        			gunModelPart.render(f5);
    			}
        		//Yaw and pitch, no recoil parts
    			for(ModelRendererTurbo gunModelPart : gunModel[1])
    			{
    				//Yaw, pitch and render
        			gunModelPart.rotateAngleY = -yaw * 3.14159265F / 180F;
        			gunModelPart.rotateAngleZ = -pitch * 3.14159265F / 180F;
        			gunModelPart.render(f5);
    			}
        		//Yaw, pitch and recoil parts
    			for(ModelRendererTurbo gunModelPart : gunModel[2])
    			{
    				//Yaw, pitch, recoil and render
        			gunModelPart.rotateAngleY = -yaw * 3.14159265F / 180F;
        			gunModelPart.rotateAngleZ = -pitch * 3.14159265F / 180F;
        			gunModelPart.render(f5);
    			}
        	}
        }*/
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
		flip(rightTrackModel);
		flip(leftTrackModel);
		flip(rightTrackWheelModels);
		flip(leftTrackWheelModels);
		flip(trailerModel);
		flip(steeringWheelModel);
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
		translate(rightTrackModel, y);
		translate(leftTrackModel, y);
		translate(rightTrackWheelModels, y);
		translate(leftTrackWheelModels, y);
		translate(trailerModel, y);
		translate(steeringWheelModel, y);
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
    public ModelRendererTurbo rightTrackWheelModels[] = new ModelRendererTurbo[0];	//These go with the tracks but rotate
    public ModelRendererTurbo leftTrackWheelModels[] = new ModelRendererTurbo[0];
	
	public ModelRendererTurbo bodyDoorOpenModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo bodyDoorCloseModel[] = new ModelRendererTurbo[0];	
	public ModelRendererTurbo trailerModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo steeringWheelModel[] = new ModelRendererTurbo[0];
}
