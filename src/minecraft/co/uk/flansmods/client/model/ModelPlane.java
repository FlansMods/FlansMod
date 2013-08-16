package co.uk.flansmods.client.model;

import java.util.HashMap;

import net.minecraft.client.model.ModelBase;
import co.uk.flansmods.client.tmt.ModelRendererTurbo;
import co.uk.flansmods.common.driveables.EntityDriveable;
import co.uk.flansmods.common.driveables.EntityPlane;
import co.uk.flansmods.common.driveables.EntitySeat;
import co.uk.flansmods.common.driveables.EnumDriveablePart;
import co.uk.flansmods.common.driveables.Propeller;
import co.uk.flansmods.common.vector.Vector3f;

/** Extensible ModelPlane class for rendering plane models */
public class ModelPlane extends ModelDriveable
{
	@Override
	public void render(EntityDriveable driveable)
	{
		render(0.0625F, (EntityPlane)driveable);
	}
	
	@Override
	/** GUI render method */
	public void render()
	{
		renderPart(bodyModel);
		renderPart(noseModel);
		renderPart(leftWingModel);
		renderPart(rightWingModel);
		renderPart(topWingModel);
		renderPart(bayModel);
		renderPart(tailModel);
		for(ModelRendererTurbo[] prop : propellerModels)
			renderPart(prop);
		renderPart(yawFlapModel);
		renderPart(pitchFlapLeftModel);
		renderPart(pitchFlapRightModel);
		renderPart(pitchFlapLeftWingModel);
		renderPart(pitchFlapRightWingModel);
		for(ModelRendererTurbo[][] gun : gunModels.values())
			for(ModelRendererTurbo[] gunPart : gun)
				renderPart(gunPart);
		renderPart(bodyGearDownModel);
		renderPart(tailGearDownModel);
		renderPart(leftWingGearDownModel);
		renderPart(rightWingGearDownModel);
		renderPart(bodyDoorCloseModel);
		renderPart(tailDoorCloseModel);
		renderPart(rightWingPos1Model);
		renderPart(leftWingPos1Model);
	}
	
    public void render(float f5, EntityPlane plane)
    {
		//Rotating the propeller
		float angle = plane.propAngle;
		for(Propeller propeller : plane.getPlaneType().propellers)
		{
			if(plane.isPartIntact(propeller.planePart))
			{
				int numParts = propellerModels[propeller.ID].length;
				for(int j = 0; j < numParts; j++)
				{
					propellerModels[propeller.ID][j].rotateAngleX = angle + (j * 2F * 3.1415926535F) / (numParts);
					propellerModels[propeller.ID][j].render(f5);
				}
			}
		}
		if(plane.isPartIntact(EnumDriveablePart.nose))
		{
			//Nose
	        for(int i = 0; i < noseModel.length; i++)
	        {
	        	noseModel[i].render(f5);
	        }
		}
		if(plane.isPartIntact(EnumDriveablePart.bay))
		{
			//Bay
	        for(int i = 0; i < bayModel.length; i++)
	        {
				bayModel[i].render(f5);
	        }
		}
		if(plane.isPartIntact(EnumDriveablePart.tail))
		{
			//Rendering the tail
	        for(int i = 0; i < tailModel.length; i++)
	        {
				tailModel[i].render(f5);
	        }
	        //Gear
			for(int i = 0; i < tailGearDownModel.length; i++)
			{
				if(plane.varGear)
					tailGearDownModel[i].render(f5);
			}
			//Doors
			for(int i = 0; i < tailDoorOpenModel.length; i++)
			{
				if(plane.varDoor)
					tailDoorOpenModel[i].render(f5);
			}
			for(int i = 0; i < tailDoorCloseModel.length; i++)
			{
				if(!plane.varDoor)
					tailDoorCloseModel[i].render(f5);
			}
			//Rotating the yaw flap
			for(int i = 0; i < yawFlapModel.length; i++)
			{
				yawFlapModel[i].rotateAngleY = plane.flapsYaw * 3.14159265F / 180F;
				yawFlapModel[i].render(f5);
			}
			//Rotating the left pitch flap
			for(int i = 0; i < pitchFlapLeftModel.length; i++)
			{
				pitchFlapLeftModel[i].rotateAngleZ = plane.flapsPitchLeft * 3.14159265F / 180F;
				pitchFlapLeftModel[i].render(f5);
			}
			//Rotating the right pitch flap
			for(int i = 0; i < pitchFlapRightModel.length; i++)
			{
				pitchFlapRightModel[i].rotateAngleZ = plane.flapsPitchRight * 3.14159265F / 180F;
				pitchFlapRightModel[i].render(f5);
			}
		}
		if(plane.isPartIntact(EnumDriveablePart.leftWing))
		{
			//Rendering the left wing
	        for(int i = 0; i < leftWingModel.length; i++)
	        {
				leftWingModel[i].render(f5);
	        }	
			//Gear
			for(int i = 0; i < leftWingGearDownModel.length; i++)
			{
				if(plane.varGear)
					leftWingGearDownModel[i].render(f5);
			}
			//Changeable Wings
			for(int i = 0; i < leftWingPos1Model.length; i++)
			{
				if(plane.varWing)
					leftWingPos1Model[i].render(f5);
			}
			for(int i = 0; i < leftWingPos2Model.length; i++)
			{
				if(!plane.varWing)
					leftWingPos2Model[i].render(f5);
			}
			//Rotating the left wing pitch flap
			for(int i = 0; i < pitchFlapLeftWingModel.length; i++)
			{
				pitchFlapLeftWingModel[i].rotateAngleZ = plane.flapsPitchLeft * 3.14159265F / 180F;
				pitchFlapLeftWingModel[i].render(f5);
			}
		}
		if(plane.isPartIntact(EnumDriveablePart.rightWing))
		{
			//Rendering the right wing
	        for(int i = 0; i < rightWingModel.length; i++)
	        {
				rightWingModel[i].render(f5);
	        }
	        //Gear
			for(int i = 0; i < rightWingGearDownModel.length; i++)
			{
				if(plane.varGear)
					rightWingGearDownModel[i].render(f5);
			}
			//Changeable Wings
			for(int i = 0; i < rightWingPos1Model.length; i++)
			{
				if(plane.varWing)
					rightWingPos1Model[i].render(f5);
			}
			for(int i = 0; i < rightWingPos2Model.length; i++)
			{
				if(!plane.varWing)
					rightWingPos2Model[i].render(f5);
			}
			//Rotating the right wing pitch flap
			for(int i = 0; i < pitchFlapRightWingModel.length; i++)
			{
				pitchFlapRightWingModel[i].rotateAngleZ = plane.flapsPitchRight * 3.14159265F / 180F;
				pitchFlapRightWingModel[i].render(f5);
			}
		}
		if(plane.isPartIntact(EnumDriveablePart.core))
		{
			//Rendering the body
	        for(int i = 0; i < bodyModel.length; i++)
	        {
	            bodyModel[i].render(f5);
	        }
			//Gear
			for(int i = 0; i < bodyGearDownModel.length; i++)
			{
				if(plane.varGear)
					bodyGearDownModel[i].render(f5);
			}
			//Doors
			for(int i = 0; i < bodyDoorOpenModel.length; i++)
			{
				if(plane.varDoor)
					bodyDoorOpenModel[i].render(f5);
			}
			for(int i = 0; i < bodyDoorCloseModel.length; i++)
			{
				if(!plane.varDoor)
					bodyDoorCloseModel[i].render(f5);
			}
		}
		if(plane.isPartIntact(EnumDriveablePart.topWing))
		{
			//Rendering the top wing
	        for(int i = 0; i < topWingModel.length; i++)
	        {
				topWingModel[i].render(f5);
	        }
		}
        //Render guns
        for(EntitySeat seat : plane.seats)
        {
        	//If the seat has a gun model attached
        	if(seat != null && seat.seatInfo != null && seat.seatInfo.gunName != null && gunModels.get(seat.seatInfo.gunName) != null && plane.isPartIntact(seat.seatInfo.part))
        	{
        		//Iterate over the parts of that model
        		ModelRendererTurbo[][] gunModel = gunModels.get(seat.seatInfo.gunName);
        		//Yaw only parts
    			for(ModelRendererTurbo gunModelPart : gunModel[0])
    			{
    				//Yaw and render
        			gunModelPart.rotateAngleY = (180F - seat.looking.getYaw()) * 3.14159265F / 180F;
        			gunModelPart.render(f5);
    			}
        		//Yaw and pitch, no recoil parts
    			for(ModelRendererTurbo gunModelPart : gunModel[1])
    			{
    				//Yaw, pitch and render
        			gunModelPart.rotateAngleY = (180F - seat.looking.getYaw()) * 3.14159265F / 180F;
        			gunModelPart.rotateAngleZ = -seat.looking.getPitch() * 3.14159265F / 180F;
        			gunModelPart.render(f5);
    			}
        		//Yaw, pitch and recoil parts
    			for(ModelRendererTurbo gunModelPart : gunModel[2])
    			{
    				//Yaw, pitch, recoil and render
        			gunModelPart.rotateAngleY = (180F - seat.looking.getYaw()) * 3.14159265F / 180F;
        			gunModelPart.rotateAngleZ = -seat.looking.getPitch() * 3.14159265F / 180F;
        			gunModelPart.render(f5);
    			}
        	}
        }
    }
    
    private void flip(ModelRendererTurbo[] model)
    {
    	for(ModelRendererTurbo part : model)
		{
    		part.doMirror(false, true, true);
    		part.setRotationPoint(part.rotationPointX, - part.rotationPointY, - part.rotationPointZ);
		}
    }
	
	public void flipAll()
	{
		flip(bodyModel);
		flip(noseModel);
		flip(leftWingModel);
		flip(rightWingModel);
		flip(topWingModel);
		flip(bayModel);
		flip(tailModel);
		flip(yawFlapModel);
		flip(pitchFlapLeftModel);
		flip(pitchFlapRightModel);
		flip(pitchFlapLeftWingModel);
		flip(pitchFlapRightWingModel);
		flip(bodyGearDownModel);
		flip(tailGearDownModel);
		flip(leftWingGearDownModel);
		flip(rightWingGearDownModel);
		flip(bodyDoorOpenModel);
		flip(bodyDoorCloseModel);
		flip(tailDoorOpenModel);
		flip(tailDoorCloseModel);
		flip(rightWingPos1Model);
		flip(rightWingPos2Model);
		flip(leftWingPos1Model);
		flip(leftWingPos2Model);
		
		for(ModelRendererTurbo[] propellerModel : propellerModels)
		{
			flip(propellerModel);
		}
		for(ModelRendererTurbo[][] modsOfMods : gunModels.values())
		{
			for(ModelRendererTurbo[] mods : modsOfMods)
			{
				flip(mods);
			}
		}
	}
	
	public void registerGunModel(String name, ModelRendererTurbo[][] gunModel)
	{
		gunModels.put(name, gunModel);
	}

    public ModelRendererTurbo bodyModel[] = new ModelRendererTurbo[0];
    public ModelRendererTurbo noseModel[] = new ModelRendererTurbo[0];
    public ModelRendererTurbo leftWingModel[] = new ModelRendererTurbo[0];	
    public ModelRendererTurbo rightWingModel[] = new ModelRendererTurbo[0];
    public ModelRendererTurbo topWingModel[] = new ModelRendererTurbo[0];
    public ModelRendererTurbo bayModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo tailModel[] = new ModelRendererTurbo[0];	
	public ModelRendererTurbo propellerModels[][] = new ModelRendererTurbo[0][0]; //Propeller array [numProps][prop blades]
	public ModelRendererTurbo yawFlapModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo pitchFlapLeftModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo pitchFlapRightModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo pitchFlapLeftWingModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo pitchFlapRightWingModel[] = new ModelRendererTurbo[0];
	
	public HashMap<String, ModelRendererTurbo[][]> gunModels = new HashMap<String, ModelRendererTurbo[][]>();
	
	public ModelRendererTurbo bodyGearDownModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo tailGearDownModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo leftWingGearDownModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo rightWingGearDownModel[] = new ModelRendererTurbo[0];
	
	public ModelRendererTurbo bodyDoorOpenModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo bodyDoorCloseModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo tailDoorOpenModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo tailDoorCloseModel[] = new ModelRendererTurbo[0];
		
	public ModelRendererTurbo rightWingPos1Model[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo rightWingPos2Model[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo leftWingPos1Model[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo leftWingPos2Model[] = new ModelRendererTurbo[0];
}
