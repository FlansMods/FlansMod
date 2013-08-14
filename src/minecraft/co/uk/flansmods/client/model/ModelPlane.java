package co.uk.flansmods.client.model;

import java.util.HashMap;

import net.minecraft.client.model.ModelBase;
import co.uk.flansmods.client.tmt.ModelRendererTurbo;
import co.uk.flansmods.common.driveables.EntityPlane;
import co.uk.flansmods.common.driveables.EntitySeat;
import co.uk.flansmods.common.driveables.EnumDriveablePart;
import co.uk.flansmods.common.driveables.Propeller;
import co.uk.flansmods.common.vector.Vector3f;

//Extensible ModelPlane class for rendering plane models
public class ModelPlane extends ModelBase
{
    public void render(float f, float f1, float f2, float f3, float f4, float f5, EntityPlane plane)
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
	
	public void flipAll()
	{
		for(int i = 0; i < bodyModel.length; i++)
		{
			bodyModel[i].doMirror(false, true, true);
			bodyModel[i].setRotationPoint(bodyModel[i].rotationPointX, - bodyModel[i].rotationPointY, - bodyModel[i].rotationPointZ);
		}
		for(int i = 0; i < leftWingModel.length; i++)
		{
			leftWingModel[i].doMirror(false, true, true);
			leftWingModel[i].setRotationPoint(leftWingModel[i].rotationPointX, - leftWingModel[i].rotationPointY, - leftWingModel[i].rotationPointZ);
		}
		for(int i = 0; i < rightWingModel.length; i++)
		{
			rightWingModel[i].doMirror(false, true, true);
			rightWingModel[i].setRotationPoint(rightWingModel[i].rotationPointX, - rightWingModel[i].rotationPointY, - rightWingModel[i].rotationPointZ);
		}
		for(int i = 0; i < topWingModel.length; i++)
		{
			topWingModel[i].doMirror(false, true, true);
			topWingModel[i].setRotationPoint(topWingModel[i].rotationPointX, - topWingModel[i].rotationPointY, - topWingModel[i].rotationPointZ);
		}
		for(int i = 0; i < tailModel.length; i++)
		{
			tailModel[i].doMirror(false, true, true);
			tailModel[i].setRotationPoint(tailModel[i].rotationPointX, - tailModel[i].rotationPointY, - tailModel[i].rotationPointZ);
		}
		for(int i = 0; i < propellerModels.length; i++)
		{
			for(int j = 0; j < propellerModels[i].length; j++)
			{
				propellerModels[i][j].doMirror(false, true, true);
				propellerModels[i][j].setRotationPoint(propellerModels[i][j].rotationPointX, - propellerModels[i][j].rotationPointY, - propellerModels[i][j].rotationPointZ);
			}
		}
		for(ModelRendererTurbo[][] modsOfMods : gunModels.values())
		{
			for(ModelRendererTurbo[] mods : modsOfMods)
			{
				for(ModelRendererTurbo mod : mods)
				{
					mod.doMirror(false, true, true);
					mod.setRotationPoint(mod.rotationPointX, - mod.rotationPointY, - mod.rotationPointZ);
				}
			}
		}
		for(int i = 0; i < yawFlapModel.length; i++)
		{
			yawFlapModel[i].doMirror(false, true, true);
			yawFlapModel[i].setRotationPoint(yawFlapModel[i].rotationPointX, - yawFlapModel[i].rotationPointY, - yawFlapModel[i].rotationPointZ);
		}
		for(int i = 0; i < pitchFlapLeftModel.length; i++)
		{
			pitchFlapLeftModel[i].doMirror(false, true, true);
			pitchFlapLeftModel[i].setRotationPoint(pitchFlapLeftModel[i].rotationPointX, - pitchFlapLeftModel[i].rotationPointY, - pitchFlapLeftModel[i].rotationPointZ);
		}
		for(int i = 0; i < pitchFlapRightModel.length; i++)
		{
			pitchFlapRightModel[i].doMirror(false, true, true);
			pitchFlapRightModel[i].setRotationPoint(pitchFlapRightModel[i].rotationPointX, - pitchFlapRightModel[i].rotationPointY, - pitchFlapRightModel[i].rotationPointZ);
		}
		for(int i = 0; i < pitchFlapLeftWingModel.length; i++)
		{
			pitchFlapLeftWingModel[i].doMirror(false, true, true);
			pitchFlapLeftWingModel[i].setRotationPoint(pitchFlapLeftWingModel[i].rotationPointX, - pitchFlapLeftWingModel[i].rotationPointY, - pitchFlapLeftWingModel[i].rotationPointZ);
		}
		for(int i = 0; i < pitchFlapRightWingModel.length; i++)
		{
			pitchFlapRightWingModel[i].doMirror(false, true, true);
			pitchFlapRightWingModel[i].setRotationPoint(pitchFlapRightWingModel[i].rotationPointX, - pitchFlapRightWingModel[i].rotationPointY, - pitchFlapRightWingModel[i].rotationPointZ);
		}
		//Gear
		for(int i = 0; i < bodyGearDownModel.length; i++)
		{
			bodyGearDownModel[i].doMirror(false, true, true);
			bodyGearDownModel[i].setRotationPoint(bodyGearDownModel[i].rotationPointX, - bodyGearDownModel[i].rotationPointY, - bodyGearDownModel[i].rotationPointZ);
		}
		for(int i = 0; i < tailGearDownModel.length; i++)
		{
			tailGearDownModel[i].doMirror(false, true, true);
			tailGearDownModel[i].setRotationPoint(tailGearDownModel[i].rotationPointX, - tailGearDownModel[i].rotationPointY, - tailGearDownModel[i].rotationPointZ);
		}
		for(int i = 0; i < leftWingGearDownModel.length; i++)
		{
			leftWingGearDownModel[i].doMirror(false, true, true);
			leftWingGearDownModel[i].setRotationPoint(leftWingGearDownModel[i].rotationPointX, - leftWingGearDownModel[i].rotationPointY, - leftWingGearDownModel[i].rotationPointZ);
		}
		for(int i = 0; i < rightWingGearDownModel.length; i++)
		{
			rightWingGearDownModel[i].doMirror(false, true, true);
			rightWingGearDownModel[i].setRotationPoint(rightWingGearDownModel[i].rotationPointX, - rightWingGearDownModel[i].rotationPointY, - rightWingGearDownModel[i].rotationPointZ);
		}

		//Door
		for(int i = 0; i < bodyDoorOpenModel.length; i++)
		{
			bodyDoorOpenModel[i].doMirror(false, true, true);
			bodyDoorOpenModel[i].setRotationPoint(bodyDoorOpenModel[i].rotationPointX, - bodyDoorOpenModel[i].rotationPointY, - bodyDoorOpenModel[i].rotationPointZ);
		}
		for(int i = 0; i < bodyDoorCloseModel.length; i++)
		{
			bodyDoorCloseModel[i].doMirror(false, true, true);
			bodyDoorCloseModel[i].setRotationPoint(bodyDoorCloseModel[i].rotationPointX, - bodyDoorCloseModel[i].rotationPointY, - bodyDoorCloseModel[i].rotationPointZ);
		}
		for(int i = 0; i < tailDoorOpenModel.length; i++)
		{
			tailDoorOpenModel[i].doMirror(false, true, true);
			tailDoorOpenModel[i].setRotationPoint(tailDoorOpenModel[i].rotationPointX, - tailDoorOpenModel[i].rotationPointY, - tailDoorOpenModel[i].rotationPointZ);
		}
		for(int i = 0; i < tailDoorCloseModel.length; i++)
		{
			tailDoorCloseModel[i].doMirror(false, true, true);
			tailDoorCloseModel[i].setRotationPoint(tailDoorCloseModel[i].rotationPointX, - tailDoorCloseModel[i].rotationPointY, - tailDoorCloseModel[i].rotationPointZ);
		}

		//Wings
		for(int i = 0; i < rightWingPos1Model.length; i++)
		{
			rightWingPos1Model[i].doMirror(false, true, true);
			rightWingPos1Model[i].setRotationPoint(rightWingPos1Model[i].rotationPointX, - rightWingPos1Model[i].rotationPointY, - rightWingPos1Model[i].rotationPointZ);
		}
		for(int i = 0; i < rightWingPos2Model.length; i++)
		{
			rightWingPos2Model[i].doMirror(false, true, true);
			rightWingPos2Model[i].setRotationPoint(rightWingPos2Model[i].rotationPointX, - rightWingPos2Model[i].rotationPointY, - rightWingPos2Model[i].rotationPointZ);
		}
		for(int i = 0; i < leftWingPos1Model.length; i++)
		{
			leftWingPos1Model[i].doMirror(false, true, true);
			leftWingPos1Model[i].setRotationPoint(leftWingPos1Model[i].rotationPointX, - leftWingPos1Model[i].rotationPointY, - leftWingPos1Model[i].rotationPointZ);
		}
		for(int i = 0; i < leftWingPos2Model.length; i++)
		{
			leftWingPos2Model[i].doMirror(false, true, true);
			leftWingPos2Model[i].setRotationPoint(leftWingPos2Model[i].rotationPointX, - leftWingPos2Model[i].rotationPointY, - leftWingPos2Model[i].rotationPointZ);
		}
	}
	
	public void registerGunModel(String name, ModelRendererTurbo[][] gunModel)
	{
		gunModels.put(name, gunModel);
	}

    public ModelRendererTurbo bodyModel[];
    public ModelRendererTurbo leftWingModel[];	
    public ModelRendererTurbo rightWingModel[];
    public ModelRendererTurbo topWingModel[];	
	public ModelRendererTurbo tailModel[];	
	public ModelRendererTurbo propellerModels[][]; //Propeller array [numProps][prop blades]
	public ModelRendererTurbo yawFlapModel[];
	public ModelRendererTurbo pitchFlapLeftModel[];
	public ModelRendererTurbo pitchFlapRightModel[];
	public ModelRendererTurbo pitchFlapLeftWingModel[];
	public ModelRendererTurbo pitchFlapRightWingModel[];
	
	public HashMap<String, ModelRendererTurbo[][]> gunModels = new HashMap<String, ModelRendererTurbo[][]>();
	
	public ModelRendererTurbo bodyGearDownModel[];
	public ModelRendererTurbo tailGearDownModel[];
	public ModelRendererTurbo leftWingGearDownModel[];
	public ModelRendererTurbo rightWingGearDownModel[];
	
	public ModelRendererTurbo bodyDoorOpenModel[];
	public ModelRendererTurbo bodyDoorCloseModel[];
	public ModelRendererTurbo tailDoorOpenModel[];
	public ModelRendererTurbo tailDoorCloseModel[];
		
	public ModelRendererTurbo rightWingPos1Model[];
	public ModelRendererTurbo rightWingPos2Model[];
	public ModelRendererTurbo leftWingPos1Model[];
	public ModelRendererTurbo leftWingPos2Model[];
}
