package com.flansmod.client.model;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.EnumPlaneMode;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.driveables.Propeller;
import com.flansmod.common.vector.Vector3f;

/** Extensible ModelPlane class for rendering plane models */
public class ModelPlane extends ModelDriveable
{
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
	
	//Helicopter bits
	public ModelRendererTurbo heliMainRotorModels[][] = new ModelRendererTurbo[0][0]; //Helicopter main rotors model array [numProps][prop blades]
	public Vector3f[] heliMainRotorOrigins = new Vector3f[0]; //Rotation origin of the rotors [numProps]
	public ModelRendererTurbo heliTailRotorModels[][] = new ModelRendererTurbo[0][0]; //Helicopter tail rotors model array [numProps][prop blades]
	public Vector3f[] heliTailRotorOrigins = new Vector3f[0]; //Rotation origin of the tail rotors [numProps]
	public ModelRendererTurbo skidsModel[] = new ModelRendererTurbo[0]; //Same as landing gear, but for helicopters
	
	//VTOL bits. They are swapped between when you swap modes
	public ModelRendererTurbo helicopterModeParts[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo planeModeParts[] = new ModelRendererTurbo[0];		
	
	public ModelRendererTurbo bodyWheelModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo tailWheelModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo leftWingWheelModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo rightWingWheelModel[] = new ModelRendererTurbo[0];
	
	public ModelRendererTurbo tailDoorOpenModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo tailDoorCloseModel[] = new ModelRendererTurbo[0];
		
	public ModelRendererTurbo rightWingPos1Model[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo rightWingPos2Model[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo leftWingPos1Model[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo leftWingPos2Model[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo hudModel[] = new ModelRendererTurbo[0];
	@Override
	public void render(EntityDriveable driveable, float f1)
	{
		render(0.0625F, (EntityPlane)driveable, f1);
	}
	
	@Override
	/** GUI render method */
	public void render(DriveableType type)
	{
		super.render(type);
		renderPart(noseModel);
		renderPart(leftWingModel);
		renderPart(rightWingModel);
		renderPart(topWingModel);
		renderPart(bayModel);
		renderPart(tailModel);
		for(ModelRendererTurbo[] prop : propellerModels)
		{
			for(int j = 0; j < prop.length; j++)
			{
				prop[j].rotateAngleX = (j * 2F * 3.1415926535F) / (prop.length);
				prop[j].render(0.0625F);
			}
		}
		for(int i = 0; i < heliMainRotorModels.length; i++)
			renderPart(heliMainRotorModels[i]);
		for(int i = 0; i < heliTailRotorModels.length; i++)
			renderPart(heliTailRotorModels[i]);
		renderPart(helicopterModeParts);
		renderPart(skidsModel);
		renderPart(yawFlapModel);
		renderPart(pitchFlapLeftModel);
		renderPart(pitchFlapRightModel);
		renderPart(pitchFlapLeftWingModel);
		renderPart(pitchFlapRightWingModel);
		renderPart(bodyWheelModel);
		renderPart(tailWheelModel);
		renderPart(leftWingWheelModel);
		renderPart(rightWingWheelModel);
		renderPart(tailDoorCloseModel);
		renderPart(rightWingPos1Model);
		renderPart(leftWingPos1Model);
		renderPart(hudModel);
	}
	
    public void render(float f5, EntityPlane plane, float f)
    {
    	PlaneType type = plane.getPlaneType();
		//Rotating the propeller
		float angle = plane.propAngle;
		for(Propeller propeller : plane.getPlaneType().propellers)
		{
			if(plane.isPartIntact(propeller.planePart) && propellerModels.length > propeller.ID)
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
		if(plane.isPartIntact(EnumDriveablePart.skids))
		{
			//Skids
			for(int i = 0; i < skidsModel.length; i++)
			{
				if(plane.varGear)
					skidsModel[i].render(f5);
			}
		}
		if(plane.isPartIntact(EnumDriveablePart.tailWheel))
		{
			//Gear
			for(int i = 0; i < tailWheelModel.length; i++)
			{
				if(plane.varGear)
					tailWheelModel[i].render(f5);
			}
		}
		if(plane.isPartIntact(EnumDriveablePart.leftWing))
		{
			//Rendering the left wing
	        for(int i = 0; i < leftWingModel.length; i++)
	        {
				leftWingModel[i].render(f5);
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
		if(plane.isPartIntact(EnumDriveablePart.leftWingWheel))
		{
			//Gear
			for(int i = 0; i < leftWingWheelModel.length; i++)
			{
				if(plane.varGear)
					leftWingWheelModel[i].render(f5);
			}
		}
		if(plane.isPartIntact(EnumDriveablePart.rightWingWheel))
		{
	        //Gear
			for(int i = 0; i < rightWingWheelModel.length; i++)
			{
				if(plane.varGear)
					rightWingWheelModel[i].render(f5);
			}
		}
		if(plane.isPartIntact(EnumDriveablePart.core))
		{
			//Rendering the body
	        for(int i = 0; i < bodyModel.length; i++)
	        {
	            bodyModel[i].render(f5);
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
			for(int i = 0; i < hudModel.length; i++)
			{
				hudModel[i].rotateAngleX = -(plane.axes.getRoll() * 3.14159265F / 180F);
				hudModel[i].render(f5);
			}
			//VTOL bits
			if(plane.mode == EnumPlaneMode.HELI)
			{
				renderPart(helicopterModeParts);
			}
			else renderPart(planeModeParts);
		}
		if(plane.isPartIntact(EnumDriveablePart.coreWheel))
		{
			//Gear
			for(int i = 0; i < bodyWheelModel.length; i++)
			{
				if(plane.varGear)
					bodyWheelModel[i].render(f5);
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
        		float yaw = seat.prevLooking.getYaw() + (seat.looking.getYaw() - seat.prevLooking.getYaw()) * f;
        		float pitch = seat.prevLooking.getPitch() + (seat.looking.getPitch() - seat.prevLooking.getPitch()) * f;  
        		
        		//Iterate over the parts of that model
        		ModelRendererTurbo[][] gunModel = gunModels.get(seat.seatInfo.gunName);
        		//Yaw only parts
    			for(ModelRendererTurbo gunModelPart : gunModel[0])
    			{
    				//Yaw and render
        			gunModelPart.rotateAngleY = (180F - yaw) * 3.14159265F / 180F;
        			gunModelPart.render(f5);
    			}
        		//Yaw and pitch, no recoil parts
    			for(ModelRendererTurbo gunModelPart : gunModel[1])
    			{
    				//Yaw, pitch and render
        			gunModelPart.rotateAngleY = (180F - yaw) * 3.14159265F / 180F;
        			gunModelPart.rotateAngleZ = -pitch * 3.14159265F / 180F;
        			gunModelPart.render(f5);
    			}
        		//Yaw, pitch and recoil parts
    			for(ModelRendererTurbo gunModelPart : gunModel[2])
    			{
    				//Yaw, pitch, recoil and render
        			gunModelPart.rotateAngleY = (180F - yaw) * 3.14159265F / 180F;
        			gunModelPart.rotateAngleZ = -pitch * 3.14159265F / 180F;
        			gunModelPart.render(f5);
    			}
    			if(gunModel.length > 3)
    			{
    				//Minigun barrel part
    				float minigunSpeed = seat.getMinigunSpeed();
        			for(ModelRendererTurbo gunModelPart : gunModel[2])
        			{
        				//Yaw, pitch, recoil and render
            			gunModelPart.rotateAngleX = (180F - yaw) * 3.14159265F / 180F;
            			gunModelPart.render(f5);
        			}
    			}
        	}
        }
    }
    

    /** Renders helicopter rotor number i. */
	public void renderRotor(EntityPlane plane, float f5, int i) 
	{
		PlaneType type = plane.getPlaneType();
		//If its not covered by the plane type heli propellers, render it. Otherwise, see if the part is intact
		if(i >= type.heliPropellers.size() || plane.isPartIntact(type.heliPropellers.get(i).planePart))
		{
			for(int j = 0; j < heliMainRotorModels[i].length; j++)
			{
				heliMainRotorModels[i][j].render(f5);
			}
		}
	}
    
	/** Renders helicopter tail rotor number i. */
	public void renderTailRotor(EntityPlane plane, float f5, int i) 
	{
		PlaneType type = plane.getPlaneType();
		//If its not covered by the plane type heli propellers, render it. Otherwise, see if the part is intact
		if(i >= type.heliTailPropellers.size() || plane.isPartIntact(type.heliTailPropellers.get(i).planePart))
		{
			for(int j = 0; j < heliTailRotorModels[i].length; j++)
			{
				heliTailRotorModels[i][j].render(f5);
			}
		}
	}
	
	@Override
	public void flipAll()
	{
		super.flipAll();
		flip(noseModel);
		flip(leftWingModel);
		flip(rightWingModel);
		flip(topWingModel);
		flip(bayModel);
		flip(tailModel);
		flip(yawFlapModel);
		flip(skidsModel);
		flip(helicopterModeParts);
		flip(planeModeParts);
		flip(pitchFlapLeftModel);
		flip(pitchFlapRightModel);
		flip(pitchFlapLeftWingModel);
		flip(pitchFlapRightWingModel);
		flip(bodyWheelModel);
		flip(tailWheelModel);
		flip(leftWingWheelModel);
		flip(rightWingWheelModel);
		flip(tailDoorOpenModel);
		flip(tailDoorCloseModel);
		flip(rightWingPos1Model);
		flip(rightWingPos2Model);
		flip(leftWingPos1Model);
		flip(leftWingPos2Model);
		flip(hudModel);
		
		for(ModelRendererTurbo[] propellerModel : propellerModels)
		{
			flip(propellerModel);
		}
		for(ModelRendererTurbo[] propellerModel : heliMainRotorModels)
		{
			flip(propellerModel);
		}
		for(ModelRendererTurbo[] propellerModel : heliTailRotorModels)
		{
			flip(propellerModel);
		}
	}

	@Override
	public void translateAll(float x, float y, float z)
	{
		super.translateAll(x, y, z);
		translate(noseModel, x, y, z);
		translate(leftWingModel, x, y, z);
		translate(rightWingModel, x, y, z);
		translate(topWingModel, x, y, z);
		translate(bayModel, x, y, z);
		translate(tailModel, x, y, z);
		translate(yawFlapModel, x, y, z);
		translate(skidsModel, x, y, z);
		translate(helicopterModeParts, x, y, z);
		translate(planeModeParts, x, y, z);
		translate(pitchFlapLeftModel, x, y, z);
		translate(pitchFlapRightModel, x, y, z);
		translate(pitchFlapLeftWingModel, x, y, z);
		translate(pitchFlapRightWingModel, x, y, z);
		translate(bodyWheelModel, x, y, z);
		translate(tailWheelModel, x, y, z);
		translate(leftWingWheelModel, x, y, z);
		translate(rightWingWheelModel, x, y, z);
		translate(tailDoorOpenModel, x, y, z);
		translate(tailDoorCloseModel, x, y, z);
		translate(rightWingPos1Model, x, y, z);
		translate(rightWingPos2Model, x, y, z);
		translate(leftWingPos1Model, x, y, z);
		translate(leftWingPos2Model, x, y, z);
		translate(hudModel, x, y, z);

		for(ModelRendererTurbo[] mods : propellerModels)
		{
			translate(mods, x, y, z);
		}
		for(ModelRendererTurbo[] mods : heliMainRotorModels)
		{
			translate(mods, x, y, z);
		}
		for(ModelRendererTurbo[] mods : heliTailRotorModels)
		{
			translate(mods, x, y, z);
		}
		for(Vector3f o : heliMainRotorOrigins)
			Vector3f.add(o, new Vector3f(x / 16F, y / 16F, z / 16F), o);
		for(Vector3f o : heliTailRotorOrigins)
			Vector3f.add(o, new Vector3f(x / 16F, y / 16F, z / 16F), o);
	}
}
