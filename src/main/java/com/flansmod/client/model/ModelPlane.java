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
	//Shapebox template for copy paste
	//, 0F, /* 0 */ 0F, 0F, 0F, /* 1 */ 0F, 0F, 0F, /* 2 */ 0F, 0F, 0F, /* 3 */ 0F, 0F, 0F, /* 4 */ 0F, 0F, 0F, /* 5 */ 0F, 0F, 0F, /* 6 */ 0F, 0F, 0F, /* 7 */ 0F, 0F, 0F);	
	
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
	public float[] heliRotorSpeeds = new float[0]; //Speed for rotor rotation. Make this negative for reverse blades
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
		for (ModelRendererTurbo[] heliMainRotorModel : heliMainRotorModels) renderPart(heliMainRotorModel);
		for (ModelRendererTurbo[] heliTailRotorModel : heliTailRotorModels) renderPart(heliTailRotorModel);
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
			for (ModelRendererTurbo aNoseModel : noseModel) {
				aNoseModel.render(f5);
			}
		}
		if(plane.isPartIntact(EnumDriveablePart.bay))
		{
			//Bay
			for (ModelRendererTurbo aBayModel : bayModel) {
				aBayModel.render(f5);
			}
		}
		if(plane.isPartIntact(EnumDriveablePart.tail))
		{
			//Rendering the tail
			for (ModelRendererTurbo aTailModel : tailModel) {
				aTailModel.render(f5);
			}
			//Doors
			for (ModelRendererTurbo aTailDoorOpenModel : tailDoorOpenModel) {
				if (plane.varDoor)
					aTailDoorOpenModel.render(f5);
			}
			for (ModelRendererTurbo aTailDoorCloseModel : tailDoorCloseModel) {
				if (!plane.varDoor)
					aTailDoorCloseModel.render(f5);
			}
			//Rotating the yaw flap
			for (ModelRendererTurbo aYawFlapModel : yawFlapModel) {
				aYawFlapModel.rotateAngleY = plane.flapsYaw * 3.14159265F / 180F;
				aYawFlapModel.render(f5);
			}
			//Rotating the left pitch flap
			for (ModelRendererTurbo aPitchFlapLeftModel : pitchFlapLeftModel) {
				aPitchFlapLeftModel.rotateAngleZ = plane.flapsPitchLeft * 3.14159265F / 180F;
				aPitchFlapLeftModel.render(f5);
			}
			//Rotating the right pitch flap
			for (ModelRendererTurbo aPitchFlapRightModel : pitchFlapRightModel) {
				aPitchFlapRightModel.rotateAngleZ = plane.flapsPitchRight * 3.14159265F / 180F;
				aPitchFlapRightModel.render(f5);
			}
		}
		if(plane.isPartIntact(EnumDriveablePart.skids))
		{
			//Skids
			for (ModelRendererTurbo aSkidsModel : skidsModel) {
				if (plane.varGear)
					aSkidsModel.render(f5);
			}
		}
		if(plane.isPartIntact(EnumDriveablePart.tailWheel))
		{
			//Gear
			for (ModelRendererTurbo aTailWheelModel : tailWheelModel) {
				if (plane.varGear)
					aTailWheelModel.render(f5);
			}
		}
		if(plane.isPartIntact(EnumDriveablePart.leftWing))
		{
			//Rendering the left wing
			for (ModelRendererTurbo aLeftWingModel : leftWingModel) {
				aLeftWingModel.render(f5);
			}
			//Changeable Wings
			for (ModelRendererTurbo aLeftWingPos1Model : leftWingPos1Model) {
				if (plane.varWing)
					aLeftWingPos1Model.render(f5);
			}
			for (ModelRendererTurbo aLeftWingPos2Model : leftWingPos2Model) {
				if (!plane.varWing)
					aLeftWingPos2Model.render(f5);
			}
			//Rotating the left wing pitch flap
			for (ModelRendererTurbo aPitchFlapLeftWingModel : pitchFlapLeftWingModel) {
				aPitchFlapLeftWingModel.rotateAngleZ = plane.flapsPitchLeft * 3.14159265F / 180F;
				aPitchFlapLeftWingModel.render(f5);
			}
		}
		if(plane.isPartIntact(EnumDriveablePart.rightWing))
		{
			//Rendering the right wing
			for (ModelRendererTurbo aRightWingModel : rightWingModel) {
				aRightWingModel.render(f5);
			}
			//Changeable Wings
			for (ModelRendererTurbo aRightWingPos1Model : rightWingPos1Model) {
				if (plane.varWing)
					aRightWingPos1Model.render(f5);
			}
			for (ModelRendererTurbo aRightWingPos2Model : rightWingPos2Model) {
				if (!plane.varWing)
					aRightWingPos2Model.render(f5);
			}
			//Rotating the right wing pitch flap
			for (ModelRendererTurbo aPitchFlapRightWingModel : pitchFlapRightWingModel) {
				aPitchFlapRightWingModel.rotateAngleZ = plane.flapsPitchRight * 3.14159265F / 180F;
				aPitchFlapRightWingModel.render(f5);
			}
		}
		if(plane.isPartIntact(EnumDriveablePart.leftWingWheel))
		{
			//Gear
			for (ModelRendererTurbo aLeftWingWheelModel : leftWingWheelModel) {
				if (plane.varGear)
					aLeftWingWheelModel.render(f5);
			}
		}
		if(plane.isPartIntact(EnumDriveablePart.rightWingWheel))
		{
	        //Gear
			for (ModelRendererTurbo aRightWingWheelModel : rightWingWheelModel) {
				if (plane.varGear)
					aRightWingWheelModel.render(f5);
			}
		}
		if(plane.isPartIntact(EnumDriveablePart.core))
		{
			//Rendering the body
			for (ModelRendererTurbo aBodyModel : bodyModel) {
				aBodyModel.render(f5);
			}
			//Doors
			for (ModelRendererTurbo aBodyDoorOpenModel : bodyDoorOpenModel) {
				if (plane.varDoor)
					aBodyDoorOpenModel.render(f5);
			}
			for (ModelRendererTurbo aBodyDoorCloseModel : bodyDoorCloseModel) {
				if (!plane.varDoor)
					aBodyDoorCloseModel.render(f5);
			}
			for (ModelRendererTurbo aHudModel : hudModel) {
				aHudModel.rotateAngleX = -(plane.axes.getRoll() * 3.14159265F / 180F);
				aHudModel.render(f5);
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
			for (ModelRendererTurbo aBodyWheelModel : bodyWheelModel) {
				if (plane.varGear)
					aBodyWheelModel.render(f5);
			}
		}
		if(plane.isPartIntact(EnumDriveablePart.topWing))
		{
			//Rendering the top wing
			for (ModelRendererTurbo aTopWingModel : topWingModel) {
				aTopWingModel.render(f5);
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
        			for(ModelRendererTurbo gunModelPart : gunModel[3])
        			{
        				//Yaw, pitch, recoil and render
            			gunModelPart.rotateAngleY = (180F - yaw) * 3.14159265F / 180F;
            			gunModelPart.rotateAngleZ = -pitch * 3.14159265F / 180F;
            			gunModelPart.rotateAngleX = seat.minigunAngle * 0.5F;
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
