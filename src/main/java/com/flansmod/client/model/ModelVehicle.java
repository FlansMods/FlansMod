package com.flansmod.client.model;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.FlansMod;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.VehicleType;
import com.flansmod.common.vector.Vector3f;

//Extensible ModelVehicle class for rendering vehicle models
public class ModelVehicle extends ModelDriveable
{
    public ModelRendererTurbo turretModel[] = new ModelRendererTurbo[0];			//The turret (for tanks)
	public ModelRendererTurbo barrelModel[] = new ModelRendererTurbo[0];			//The barrel of the main turret
	public ModelRendererTurbo ammoModel[][] = new ModelRendererTurbo[0][0];			//Ammo models for the main turret. ammoModel[i] will render if the vehicle has less than 3 ammo slots or if slot i is full. Checks shell / missile inventory
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
    
	public ModelRendererTurbo leftAnimTrackModel[][] = new ModelRendererTurbo[0][0];  //Unlimited frame track animations
	public ModelRendererTurbo rightAnimTrackModel[][] = new ModelRendererTurbo[0][0];
	
	public ModelRendererTurbo fancyTrackModel[] = new ModelRendererTurbo[0];
	
	public ModelRendererTurbo rightAnimTrackModel1[] = new ModelRendererTurbo[0]; //3 frame track animation
	public ModelRendererTurbo leftAnimTrackModel1[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo rightAnimTrackModel2[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo leftAnimTrackModel2[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo rightAnimTrackModel3[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo leftAnimTrackModel3[] = new ModelRendererTurbo[0];
	
	public ModelRendererTurbo bodyDoorOpenModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo bodyDoorCloseModel[] = new ModelRendererTurbo[0];	
	public ModelRendererTurbo trailerModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo steeringWheelModel[] = new ModelRendererTurbo[0];
	
	public ModelRendererTurbo drillHeadModel[] = new ModelRendererTurbo[0]; 		//Drill head. Rotates around
	public Vector3f drillHeadOrigin = new Vector3f();		
	
	//Body part for Strv103. Very strang.
	public ModelRendererTurbo barrelSpecModel[] = new ModelRendererTurbo[0];
	
	//recoiling barrel part
	public ModelRendererTurbo animBarrelModel[] = new ModelRendererTurbo[0];
	public Vector3f barrelAttach = new Vector3f();
	
    //Doors
	public ModelRendererTurbo doorAnimModel[] = new ModelRendererTurbo[0];
	public Vector3f doorAttach = new Vector3f();
	public ModelRendererTurbo door2AnimModel[] = new ModelRendererTurbo[0];
	public Vector3f door2Attach = new Vector3f();
	
	
	//IT-1
	public ModelRendererTurbo drakonModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo drakonReloadModel[] = new ModelRendererTurbo[0];
	
	public ModelRendererTurbo drakonArmModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo drakonRailModel[] = new ModelRendererTurbo[0];
	public ModelRendererTurbo drakonDoorModel[] = new ModelRendererTurbo[0];

	public Vector3f drakonArmAttach = new Vector3f(0,0,0);
	public Vector3f drakonRailAttach = new Vector3f(0,0,0);
	public Vector3f drakonDoorAttach = new Vector3f(0,0,0);
	
	public float animFrameLeft = 0;
	public float animFrameRight = 0;
	//this point
	
	//Turret modifier
	public Vector3f turretScale = new Vector3f(1,1,1);
	public Vector3f turretTrans = new Vector3f(0,0,0);
	
	//model stuff
	public boolean fancyTurret = false;
	public String turretName;
	
	

	@Override
	public void render(EntityDriveable driveable, float f1)
	{
		render(0.0625F, (EntityVehicle)driveable, f1);
	}
	
	@Override
	/** GUI render method */
	public void render(DriveableType type)
	{
		super.render(type);
		renderPart(leftBackWheelModel);
		renderPart(rightBackWheelModel);
		renderPart(leftFrontWheelModel);
		renderPart(rightFrontWheelModel);
		renderPart(rightTrackModel);
		renderPart(leftTrackModel);
		renderPart(rightTrackWheelModels);
		renderPart(leftTrackWheelModels);
		renderPart(bodyDoorCloseModel);
		renderPart(trailerModel);
		GL11.glPushMatrix();
		GL11.glScalef(turretScale.x, turretScale.y, turretScale.z);
		GL11.glTranslatef(turretTrans.x, turretTrans.y, turretTrans.z);
		renderPart(turretModel);
		renderPart(barrelModel);
		GL11.glPopMatrix();
		renderPart(drillHeadModel);
		for(ModelRendererTurbo[] mods : ammoModel)
			renderPart(mods);
		for(ModelRendererTurbo[] latm : leftAnimTrackModel)
			renderPart(latm);
		for(ModelRendererTurbo[] ratm : rightAnimTrackModel)
			renderPart(ratm);
		renderPart(rightAnimTrackModel1);
		renderPart(leftAnimTrackModel1);
		renderPart(rightAnimTrackModel2);
		renderPart(leftAnimTrackModel2);
		renderPart(rightAnimTrackModel3);
		renderPart(leftAnimTrackModel3);
		renderPart(steeringWheelModel);
		renderPart(steeringWheelModel);
		renderPart(barrelSpecModel);	
		renderTrackInGUI(type);
		GL11.glPushMatrix();
		GL11.glTranslatef(barrelAttach.x, barrelAttach.y, -barrelAttach.z);
		renderPart(animBarrelModel);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(doorAttach.x, doorAttach.y, -doorAttach.z);
		renderPart(doorAnimModel);
		GL11.glPopMatrix();	
		GL11.glPushMatrix();
		GL11.glTranslatef(door2Attach.x, door2Attach.y, -door2Attach.z);
		renderPart(door2AnimModel);
		GL11.glPopMatrix();	
		GL11.glPushMatrix();
		GL11.glTranslatef(drakonArmAttach.x, drakonArmAttach.y, drakonArmAttach.z);
		renderPart(drakonArmModel);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(drakonRailAttach.x, drakonRailAttach.y, drakonRailAttach.z);
		renderPart(drakonRailModel);
		renderPart(drakonModel);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(drakonDoorAttach.x, drakonDoorAttach.y, drakonDoorAttach.z);
		renderPart(drakonDoorModel);
		GL11.glPopMatrix();
	}
	
	public void renderTrackInGUI(DriveableType type){
		AnimTankTrack rightTrack = new AnimTankTrack(type.rightTrackPoints, type.trackLinkLength);
		AnimTankTrack leftTrack = new AnimTankTrack(type.leftTrackPoints, type.trackLinkLength);
		AnimTrackLink trackLinksLeft[] = new AnimTrackLink[0];
		AnimTrackLink trackLinksRight[] = new AnimTrackLink[0];
		int numLinks = Math.round(rightTrack.getTrackLength()/ type.trackLinkLength);
		trackLinksLeft = new AnimTrackLink[numLinks];
		trackLinksRight = new AnimTrackLink[numLinks];
        for(int i = 0; i < numLinks; i++)
        {
        	float progress = 0.01F + (type.trackLinkLength * i);
    		int trackPart = leftTrack.getTrackPart(progress);
        	trackLinksLeft[i] = new AnimTrackLink(progress);
        	trackLinksRight[i] = new AnimTrackLink(progress);
        	trackLinksLeft[i].position = leftTrack.getPositionOnTrack(progress);
        	trackLinksRight[i].position = rightTrack.getPositionOnTrack(progress);
        	trackLinksLeft[i].rot = new RotatedAxes(0,0,rotateTowards(leftTrack.points.get((trackPart == 0)? leftTrack.points.size()-1:trackPart-1), trackLinksLeft[i].position));
        	trackLinksRight[i].rot = new RotatedAxes(0,0,rotateTowards(rightTrack.points.get((trackPart == 0)? rightTrack.points.size()-1:trackPart-1), trackLinksRight[i].position));
        	trackLinksLeft[i].zRot = rotateTowards(leftTrack.points.get((trackPart == 0)? leftTrack.points.size()-1:trackPart-1), trackLinksLeft[i].position);
        	trackLinksRight[i].zRot = rotateTowards(rightTrack.points.get((trackPart == 0)? rightTrack.points.size()-1:trackPart-1), trackLinksRight[i].position);
        }
        
        for(int i = 0; i < trackLinksLeft.length; i++)
        {
        	AnimTrackLink link = trackLinksLeft[i];
        	float rotZ = link.zRot;
        	GL11.glPushMatrix();
        	GL11.glTranslatef(link.position.x/16F, link.position.y/16F, link.position.z/16F);
			for(; rotZ > 180F; rotZ -= 360F) {}
			for(; rotZ <= -180F; rotZ += 360F) {}
        	GL11.glRotatef(rotZ * (float)(180/Math.PI), 0, 0, 1);
        	renderPart(fancyTrackModel);
        	GL11.glPopMatrix();
        }
        
        for(int i = 0; i < trackLinksRight.length; i++)
        {
        	AnimTrackLink link = trackLinksRight[i];
        	float rotZ = link.zRot;
			for(; rotZ > 180F; rotZ -= 360F) {}
			for(; rotZ <= -180F; rotZ += 360F) {}
        	GL11.glPushMatrix();
        	GL11.glTranslatef(link.position.x/16F, link.position.y/16F, link.position.z/16F);
        	GL11.glRotatef(rotZ * (float)(180/Math.PI), 0, 0, 1);
        	renderPart(fancyTrackModel);
        	GL11.glPopMatrix();
        }
	}
	
    public float rotateTowards(Vector3f point, Vector3f original)
    {
    	
    	float angle = (float)Math.atan2(point.y - original.y, point.x - original.x);
    	return angle;
    }

	public void render(float f5, EntityVehicle vehicle, float f)
    {
    	boolean rotateWheels = vehicle.getVehicleType().rotateWheels;
		animFrameLeft = vehicle.animFrameLeft;
		animFrameRight = vehicle.animFrameRight;
    	
		//Rendering the body
        if(vehicle.isPartIntact(EnumDriveablePart.core))
        {
			for (ModelRendererTurbo aBodyModel : bodyModel) {
				aBodyModel.render(f5, oldRotateOrder);
			}
			for (ModelRendererTurbo aBodyDoorOpenModel : bodyDoorOpenModel) {
				if (vehicle.varDoor)
					aBodyDoorOpenModel.render(f5, oldRotateOrder);
			}
			for (ModelRendererTurbo aBodyDoorCloseModel : bodyDoorCloseModel) {
				if (!vehicle.varDoor)
					aBodyDoorCloseModel.render(f5, oldRotateOrder);
			}
			for (ModelRendererTurbo aSteeringWheelModel : steeringWheelModel) {
				if(!vehicle.hugeBoat)
				aSteeringWheelModel.rotateAngleX = vehicle.wheelsYaw * 3.14159265F / 180F * 3F;
				else aSteeringWheelModel.rotateAngleX = -vehicle.wheelsYaw * 3.14159265F / 180F * 3F;
				aSteeringWheelModel.render(f5, oldRotateOrder);
			}
        }
		
		//Wheels
        if(vehicle.isPartIntact(EnumDriveablePart.backLeftWheel))
        {
			for (ModelRendererTurbo aLeftBackWheelModel : leftBackWheelModel) {
				aLeftBackWheelModel.rotateAngleZ = rotateWheels ? -vehicle.wheelsAngle : 0;
				aLeftBackWheelModel.render(f5, oldRotateOrder);
			}
        }
        if(vehicle.isPartIntact(EnumDriveablePart.backRightWheel))
        {
			for (ModelRendererTurbo aRightBackWheelModel : rightBackWheelModel) {
				aRightBackWheelModel.rotateAngleZ = rotateWheels ? -vehicle.wheelsAngle : 0;
				aRightBackWheelModel.render(f5, oldRotateOrder);
			}
        }
        if(vehicle.isPartIntact(EnumDriveablePart.frontLeftWheel))
        {
			for (ModelRendererTurbo aLeftFrontWheelModel : leftFrontWheelModel) {
				aLeftFrontWheelModel.rotateAngleZ = rotateWheels ? -vehicle.wheelsAngle : 0;
				aLeftFrontWheelModel.rotateAngleY = -vehicle.wheelsYaw * 3.14159265F / 180F * 3F;
				aLeftFrontWheelModel.render(f5, oldRotateOrder);
			}
        }
        if(vehicle.isPartIntact(EnumDriveablePart.frontRightWheel))
        {
			for (ModelRendererTurbo aRightFrontWheelModel : rightFrontWheelModel) {
				aRightFrontWheelModel.rotateAngleZ = rotateWheels ? -vehicle.wheelsAngle : 0;
				aRightFrontWheelModel.rotateAngleY = -vehicle.wheelsYaw * 3.14159265F / 180F * 3F;
				aRightFrontWheelModel.render(f5, oldRotateOrder);
			}
        }        
        if(vehicle.isPartIntact(EnumDriveablePart.frontWheel))
        {
			for (ModelRendererTurbo aFrontWheelModel : frontWheelModel) {
				aFrontWheelModel.rotateAngleZ = rotateWheels ? -vehicle.wheelsAngle : 0;
				aFrontWheelModel.rotateAngleY = -vehicle.wheelsYaw * 3.14159265F / 180F * 3F;
				aFrontWheelModel.render(f5, oldRotateOrder);
			}
        }
        if(vehicle.isPartIntact(EnumDriveablePart.backWheel))
        {
			for (ModelRendererTurbo aBackWheelModel : backWheelModel) {
				aBackWheelModel.rotateAngleZ = rotateWheels ? -vehicle.wheelsAngle : 0;
				aBackWheelModel.render(f5, oldRotateOrder);
			}
        }
        
		if(vehicle.isPartIntact(EnumDriveablePart.leftTrack))
		{
			for (ModelRendererTurbo aLeftTrackModel : leftTrackModel) {
				aLeftTrackModel.render(f5, oldRotateOrder);
			}
			for (ModelRendererTurbo leftTrackWheelModel : leftTrackWheelModels) {
				leftTrackWheelModel.rotateAngleZ = rotateWheels ? -vehicle.wheelsAngle : 0;
				leftTrackWheelModel.render(f5, oldRotateOrder);
			}
			
			if(vehicle.animFrameLeft == 0){
				for (ModelRendererTurbo aLeftTrackModel1 : leftAnimTrackModel1) {
					aLeftTrackModel1.render(f5, oldRotateOrder);
				} 
			} else if (vehicle.animFrameLeft == 1){
				for (ModelRendererTurbo aLeftTrackModel2 : leftAnimTrackModel2) {
					aLeftTrackModel2.render(f5, oldRotateOrder);
				}
			} else if (vehicle.animFrameLeft == 2){
				for (ModelRendererTurbo aLeftTrackModel3 : leftAnimTrackModel3) {
					aLeftTrackModel3.render(f5, oldRotateOrder);
				}
			}
			
			
			for(int i = 0; i < leftAnimTrackModel.length; i++)
			{
				if(i == animFrameLeft)
				{
					for (ModelRendererTurbo aLeftAnimTrackModel : leftAnimTrackModel[i]) {
						aLeftAnimTrackModel.render(f5, oldRotateOrder);
					}
				}
			}

		}

		if(vehicle.isPartIntact(EnumDriveablePart.rightTrack))
		{
			for (ModelRendererTurbo aRightTrackModel : rightTrackModel) {
				aRightTrackModel.render(f5, oldRotateOrder);
			}
			for (ModelRendererTurbo rightTrackWheelModel : rightTrackWheelModels) {
				rightTrackWheelModel.rotateAngleZ = rotateWheels ? -vehicle.wheelsAngle : 0;
				rightTrackWheelModel.render(f5, oldRotateOrder);
			}

			if(vehicle.animFrameRight == 0){
				for (ModelRendererTurbo aRightTrackModel1 : rightAnimTrackModel1) {
					aRightTrackModel1.render(f5, oldRotateOrder);
				} 
			} else if (vehicle.animFrameRight == 1){
				for (ModelRendererTurbo aRightTrackModel2 : rightAnimTrackModel2) {
					aRightTrackModel2.render(f5, oldRotateOrder);
				}
			} else if (vehicle.animFrameRight == 2){
				for (ModelRendererTurbo aRightTrackModel3 : rightAnimTrackModel3) {
					aRightTrackModel3.render(f5, oldRotateOrder);
				}
			}	
			
			
			for(int i = 0; i < rightAnimTrackModel.length; i++)
			{
				if(i == animFrameRight)
				{
					for (ModelRendererTurbo aRightAnimTrackModel : rightAnimTrackModel[i]) {
						aRightAnimTrackModel.render(f5, oldRotateOrder);
					}
				}
			}
		}

        if(vehicle.isPartIntact(EnumDriveablePart.trailer))
        {
			for (ModelRendererTurbo aTrailerModel : trailerModel) {
				aTrailerModel.render(f5, oldRotateOrder);
			}
        }
                
        //Render guns
        for(EntitySeat seat : vehicle.seats)
        {
        	//If the seat has a gun model attached
        	if(seat != null && seat.seatInfo != null && seat.seatInfo.gunName != null && gunModels.get(seat.seatInfo.gunName) != null && vehicle.isPartIntact(seat.seatInfo.part) && !vehicle.rotateWithTurret(seat.seatInfo))
        	{
        		float yaw = seat.prevLooking.getYaw() + (seat.looking.getYaw() - seat.prevLooking.getYaw()) * f;
        		float pitch = seat.prevLooking.getPitch() + (seat.looking.getPitch() - seat.prevLooking.getPitch()) * f;     
        		
        		//Iterate over the parts of that model
        		ModelRendererTurbo[][] gunModel = gunModels.get(seat.seatInfo.gunName);
        		//Yaw only parts
    			for(ModelRendererTurbo gunModelPart : gunModel[0])
    			{
    				//Yaw and render
    				GL11.glPushMatrix();
    				GL11.glScalef(vehicle.getVehicleType().vehicleGunModelScale, vehicle.getVehicleType().vehicleGunModelScale, vehicle.getVehicleType().vehicleGunModelScale);
        			gunModelPart.rotateAngleY = -yaw * 3.14159265F / 180F;
        			gunModelPart.render(f5);
        			GL11.glPopMatrix();
    			}

    			GL11.glPushMatrix();
    			GL11.glScalef(vehicle.getVehicleType().vehicleGunModelScale, vehicle.getVehicleType().vehicleGunModelScale, vehicle.getVehicleType().vehicleGunModelScale);
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

    			GL11.glPopMatrix();
        	}
        }
	}
    
    public void renderDoor(EntityVehicle vehicle, float f5)
    {
		if(vehicle.isPartIntact(EnumDriveablePart.core))
		{
			for (ModelRendererTurbo aDoorAnimModel : doorAnimModel) {
				aDoorAnimModel.render(f5);
			}
		}
    }
    
    public void renderDoor2(EntityVehicle vehicle, float f5)
    {
		if(vehicle.isPartIntact(EnumDriveablePart.core))
		{
			for (ModelRendererTurbo aDoor2AnimModel : door2AnimModel) {
				aDoor2AnimModel.render(f5);
			}
		}
    }
		
    /** Render the tank turret 
     * @param dt */
	public void renderTurret(float f, float f1, float f2, float f3, float f4, float f5, EntityVehicle vehicle, float dt)
    {		
		VehicleType type = vehicle.getVehicleType();
		GL11.glPushMatrix();
		GL11.glScalef(turretScale.x, turretScale.y, turretScale.z);
		GL11.glTranslatef(turretTrans.x, turretTrans.y, turretTrans.z);
		IModelCustom model;
		ResourceLocation turretobj;
		//Render main turret barrel
		{
			if(fancyTurret){
			turretobj = new ResourceLocation(FlansMod.MODID, "models/"+ turretName);
			model = AdvancedModelLoader.loadModel(turretobj);
			GL11.glPushMatrix();
			float scale = 1.0F;
			//GL11.glScalef(scale,scale,scale);
			//GL11.glRotatef(0, 0, 1, 0);
			//GL11.glTranslatef(0, -0.55F, 0);
			model.renderAll();
			GL11.glPopMatrix();
			}
			float yaw = vehicle.seats[0].looking.getYaw();
			float pitch = vehicle.seats[0].looking.getPitch();
			float dPitch = (vehicle.seats[0].looking.getPitch() - vehicle.seats[0].prevLooking.getPitch());
    		float aPitch = vehicle.seats[0].prevLooking.getPitch() + dPitch * dt;

			for (ModelRendererTurbo aTurretModel : turretModel) {
				aTurretModel.render(f5, oldRotateOrder);
			}
			for (ModelRendererTurbo aBarrelModel : barrelModel) {
				aBarrelModel.rotateAngleZ = -(aPitch * 3.14159265F / 180F);	
				aBarrelModel.render(f5, oldRotateOrder);
			}
			GL11.glPushMatrix();
			GL11.glTranslatef(barrelAttach.x,barrelAttach.y, -barrelAttach.z);
			GL11.glRotatef(-aPitch, 0F, 0F, 1F);
			for (ModelRendererTurbo aBarrelModel : barrelSpecModel) {
				aBarrelModel.render(f5, oldRotateOrder);
			}
			GL11.glPopMatrix();
			for(int i = 0; i < ammoModel.length; i++)
			{
				if(i >= type.numMissileSlots || vehicle.getDriveableData().missiles[i] != null)
				{
					for(int j = 0; j < ammoModel[i].length; j++)
					{
						ammoModel[i][j].rotateAngleZ = -pitch * 3.14159265F / 180F;
						ammoModel[i][j].render(f5, oldRotateOrder);
					}
				}
			}
			
			
			//Render Drakon models
			float armAngle = vehicle.drakonArmAngle;
			float dArmAngle = (vehicle.drakonArmAngle - vehicle.prevDrakonArmAngle);
	        for(; dArmAngle > 180F; dArmAngle -= 360F) {}
	        for(; dArmAngle <= -180F; dArmAngle += 360F) {}
    		float drakonArmAngle = vehicle.prevDrakonArmAngle + dArmAngle * dt;
    		
			float railAngle = vehicle.drakonRailAngle;
			float dRailAngle = (vehicle.drakonRailAngle - vehicle.prevDrakonRailAngle);
	        for(; dRailAngle > 180F; dRailAngle -= 360F) {}
	        for(; dRailAngle <= -180F; dRailAngle += 360F) {}
    		float drakonRailAngle = vehicle.prevDrakonRailAngle + dRailAngle * dt;

			float doorAngle = vehicle.drakonDoorAngle;
			float dDoorAngle = (vehicle.drakonDoorAngle - vehicle.prevDrakonDoorAngle);
	        for(; dDoorAngle > 180F; dDoorAngle -= 360F) {}
	        for(; dDoorAngle <= -180F; dDoorAngle += 360F) {}
    		float drakonDoorAngle = vehicle.prevDrakonDoorAngle + dDoorAngle * dt;
			
			
			GL11.glPushMatrix();
			GL11.glTranslatef(drakonArmAttach.x, drakonArmAttach.y, drakonArmAttach.z);
			GL11.glRotatef(drakonArmAngle, 0F, 0F, 1F);
			for (ModelRendererTurbo aArmModel : drakonArmModel) {
				aArmModel.render(f5, oldRotateOrder);
			}
			
			GL11.glTranslatef(drakonRailAttach.x - drakonArmAttach.x, drakonRailAttach.y - drakonArmAttach.y, drakonRailAttach.z - drakonArmAttach.z);
			GL11.glRotatef(drakonRailAngle, 0F, 0F, 1F);
			for (ModelRendererTurbo aRailModel : drakonRailModel) {
				aRailModel.render(f5, oldRotateOrder);
			}
			if(vehicle.canFireIT1)
				{
				for (ModelRendererTurbo aMissileModel : drakonModel) {
					aMissileModel.render(f5, oldRotateOrder);
				}
			}
			
			if(vehicle.reloadingDrakon && !vehicle.canFireIT1)
			{
				for (ModelRendererTurbo aMissileModel : drakonReloadModel) {
					aMissileModel.render(f5, oldRotateOrder);
				}
			}
			
			GL11.glPopMatrix();
			
			GL11.glPushMatrix();
			
			GL11.glTranslatef(drakonDoorAttach.x, drakonDoorAttach.y, drakonDoorAttach.z);
			GL11.glRotatef(drakonDoorAngle, 1F, 0F, 0F);
			for (ModelRendererTurbo aDoorModel : drakonDoorModel) {
				aDoorModel.render(f5, oldRotateOrder);
			}
			
			GL11.glPopMatrix();
			
		}
		
        //Render turret guns
        for(EntitySeat seat : vehicle.seats)
        {
        	//If the seat has a gun model attached
        	if(seat != null && seat.seatInfo != null && seat.seatInfo.gunName != null && gunModels.get(seat.seatInfo.gunName) != null && vehicle.isPartIntact(seat.seatInfo.part) && vehicle.rotateWithTurret(seat.seatInfo))
        	{
        		EntitySeat driverSeat = vehicle.seats[0];
        		
        		float driverYaw = driverSeat.prevLooking.getYaw() + (driverSeat.looking.getYaw() - driverSeat.prevLooking.getYaw()) * dt;
        		float yaw = seat.prevLooking.getYaw() + (seat.looking.getYaw() - seat.prevLooking.getYaw()) * dt;
        		float pitch = seat.prevLooking.getPitch() + (seat.looking.getPitch() - seat.prevLooking.getPitch()) * dt;     
        		
        		float effectiveYaw = yaw - driverYaw;
        		
        		//Iterate over the parts of that model
        		ModelRendererTurbo[][] gunModel = gunModels.get(seat.seatInfo.gunName);
        		//Yaw only parts
    			for(ModelRendererTurbo gunModelPart : gunModel[0])
    			{
    				//Yaw and render
        			gunModelPart.rotateAngleY = -effectiveYaw * 3.14159265F / 180F;
        			gunModelPart.render(f5, oldRotateOrder);
    			}
        		//Yaw and pitch, no recoil parts
    			for(ModelRendererTurbo gunModelPart : gunModel[1])
    			{
    				//Yaw, pitch and render
        			gunModelPart.rotateAngleY = -effectiveYaw * 3.14159265F / 180F;
        			gunModelPart.rotateAngleZ = -pitch * 3.14159265F / 180F;
        			gunModelPart.render(f5, oldRotateOrder);
    			}
        		//Yaw, pitch and recoil parts
    			for(ModelRendererTurbo gunModelPart : gunModel[2])
    			{
    				//Yaw, pitch, recoil and render
        			gunModelPart.rotateAngleY = -effectiveYaw * 3.14159265F / 180F;
        			gunModelPart.rotateAngleZ = -pitch * 3.14159265F / 180F;
        			gunModelPart.render(f5, oldRotateOrder);
    			}
        	}
        }
        GL11.glPopMatrix();
    }
	
	public void renderAnimBarrel(float f, float f1, float f2, float f3, float f4, float f5, EntityVehicle vehicle, float dt)
	{
        if(vehicle.isPartIntact(EnumDriveablePart.turret))
        {
			for (ModelRendererTurbo aAnimBarrelModel : animBarrelModel) {
				aAnimBarrelModel.render(f5, oldRotateOrder);
			}
        }
	}
	
	public void renderDrillBit(EntityVehicle vehicle, float f) 
	{
        if(vehicle.isPartIntact(EnumDriveablePart.harvester))
        {
			for (ModelRendererTurbo adrillHeadModel : drillHeadModel) {
				adrillHeadModel.render(0.0625F, oldRotateOrder);
			}
        }
	}
	
	public void renderFancyTracks(EntityVehicle vehicle, float f)
	{
		for (ModelRendererTurbo adrillHeadModel : fancyTrackModel) {
			adrillHeadModel.render(0.0625F, oldRotateOrder);
		}
	}
	
	@Override
	public void flipAll()
	{
		super.flipAll();
		flip(bodyDoorOpenModel);
		flip(bodyDoorCloseModel);
		flip(turretModel);
		flip(barrelModel);
		flip(barrelSpecModel);
		flip(animBarrelModel);
		flip(leftFrontWheelModel);
		flip(rightFrontWheelModel);
		flip(leftBackWheelModel);
		flip(rightBackWheelModel);
		flip(rightTrackModel);
		flip(leftTrackModel);
		flip(rightTrackWheelModels);
		flip(leftTrackWheelModels);
		flip(trailerModel);
		flip(steeringWheelModel);
		flip(frontWheelModel);
		flip(backWheelModel);
		flip(drillHeadModel);
		flip(rightAnimTrackModel1);
		flip(leftAnimTrackModel1);
		flip(rightAnimTrackModel2);
		flip(leftAnimTrackModel2);
		flip(rightAnimTrackModel3);
		flip(leftAnimTrackModel3);
		flip(drakonArmModel);
		flip(drakonRailModel);
		flip(drakonDoorModel);
		flip(drakonModel);
		flip(drakonReloadModel);
		for(ModelRendererTurbo[] latm : leftAnimTrackModel)
			flip(latm);
		for(ModelRendererTurbo[] ratm : rightAnimTrackModel)
			flip(ratm);
		flip(doorAnimModel);
		flip(door2AnimModel);
		flip(fancyTrackModel);
	}	
	
	@Override
	public void translateAll(float x, float y, float z)
	{
		super.translateAll(x, y, z);
		translate(bodyDoorOpenModel, x, y, z);
		translate(bodyDoorCloseModel, x, y, z);		
		translate(turretModel, x, y, z);
		translate(barrelModel, x, y, z);
		translate(barrelSpecModel, x, y, z);
		translate(animBarrelModel, x,y,z);
		translate(leftFrontWheelModel, x, y, z);
		translate(rightFrontWheelModel, x, y, z);
		translate(leftBackWheelModel, x, y, z);
		translate(rightBackWheelModel, x, y, z);
		translate(rightTrackModel, x, y, z);
		translate(leftTrackModel, x, y, z);
		translate(rightTrackWheelModels, x, y, z);
		translate(leftTrackWheelModels, x, y, z);
		translate(trailerModel, x, y, z);
		translate(steeringWheelModel, x, y, z);
		translate(frontWheelModel, x, y, z);
		translate(backWheelModel, x, y, z);
		translate(drillHeadModel, x, y, z);
		translate(rightAnimTrackModel1, x, y, z);
		translate(leftAnimTrackModel1, x, y, z);
		translate(rightAnimTrackModel2, x, y, z);
		translate(leftAnimTrackModel2, x, y, z);
		translate(rightAnimTrackModel3, x, y, z);
		translate(leftAnimTrackModel3, x, y, z);
		for(ModelRendererTurbo[] latm : leftAnimTrackModel)
			translate(latm, x, y, z);
		for(ModelRendererTurbo[] ratm : rightAnimTrackModel)
			translate(ratm, x, y, z);
		translate(doorAnimModel, x,y,z);
		translate(door2AnimModel, x,y,z);
		translate(drakonArmModel, x, y, z);
		translate(drakonRailModel, x, y, z);
		translate(drakonDoorModel, x, y, z);
		translate(drakonReloadModel, x, y, z);
		translate(drakonModel, x, y, z);
		translate(fancyTrackModel, x, y, z);
	}
}
