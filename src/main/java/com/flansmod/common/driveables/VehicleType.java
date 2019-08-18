package com.flansmod.common.driveables;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.common.FlansMod;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.TypeFile;

public class VehicleType extends DriveableType
{
	/**
	 * Movement modifiers
	 */
	public float turnLeftModifier = 1F, turnRightModifier = 1F;
	/**
	 * If true, this will crush any living entity under the wheels
	 */
	public boolean squashMobs = false;
	/**
	 * If this is true, the vehicle will drive from all wheels
	 */
	public boolean fourWheelDrive = false;
	/**
	 * If true, then wheels will rotate as the vehicle drives
	 */
	public boolean rotateWheels = false;
	/**
	 * Tank movement system. Uses track collision box for thrust, rather than the wheels
	 */
	public boolean tank = false;
	
	/**
	 * Shoot delays
	 */
	public int vehicleShootDelay, vehicleShellDelay;
	/**
	 * Aesthetic door variable
	 */
	public boolean hasDoor = false;
	
    
    
	//Door animations
	public Vector3f doorPos1 = new Vector3f(0,0,0);
	public Vector3f doorPos2 = new Vector3f(0,0,0);
	public Vector3f doorRot1 = new Vector3f(0,0,0);
	public Vector3f doorRot2 = new Vector3f(0,0,0);
	public Vector3f doorRate = new Vector3f(0,0,0);
	public Vector3f doorRotRate = new Vector3f(0,0,0);
	
	public Vector3f door2Pos1 = new Vector3f(0,0,0);
	public Vector3f door2Pos2 = new Vector3f(0,0,0);
	public Vector3f door2Rot1 = new Vector3f(0,0,0);
	public Vector3f door2Rot2 = new Vector3f(0,0,0);
	public Vector3f door2Rate = new Vector3f(0,0,0);
	public Vector3f door2RotRate = new Vector3f(0,0,0);
	
	public boolean shootWithOpenDoor = false;
	
	public int trackLinkFix = 5;
	public boolean flipLinkFix = false;
	
	public String driftSound = "";
	public int driftSoundLength;
	
	public ArrayList<SmokePoint> smokers = new ArrayList<SmokePoint>();

	public class SmokePoint
	{
		public Vector3f position;
		public Vector3f direction;
		public int detTime;
		public String part;
	}
	
	public static ArrayList<VehicleType> types = new ArrayList<VehicleType>();
	
	public VehicleType(TypeFile file)
	{
		super(file);
		types.add(this);
	}
	
	@Override
	public void preRead(TypeFile file)
	{
		super.preRead(file);
		wheelPositions = new DriveablePosition[4];
	}
	
	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			//Movement modifiers
			if(split[0].equals("TurnLeftSpeed"))
				turnLeftModifier = Float.parseFloat(split[1]);
			if(split[0].equals("TurnRightSpeed"))
				turnRightModifier = Float.parseFloat(split[1]);
			if(split[0].equals("SquashMobs"))
				squashMobs = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("FourWheelDrive"))
				fourWheelDrive = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("Tank") || split[0].equals("TankMode"))
				tank = Boolean.parseBoolean(split[1].toLowerCase());
			
			//Visuals
			if(split[0].equals("HasDoor"))
				hasDoor = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("RotateWheels"))
				rotateWheels = Boolean.parseBoolean(split[1].toLowerCase());
			
            if(split[0].equals("FourWheelDrive"))
            	fourWheelDrive = Boolean.parseBoolean(split[1].toLowerCase());
            if(split[0].equals("Tank") || split[0].equals("TankMode"))
            	tank = Boolean.parseBoolean(split[1].toLowerCase());

            //Visuals
            if(split[0].equals("HasDoor"))
                hasDoor = Boolean.parseBoolean(split[1].toLowerCase());
            if(split[0].equals("ShootWithOpenDoor"))
                shootWithOpenDoor = Boolean.parseBoolean(split[1].toLowerCase());
            if(split[0].equals("RotateWheels"))
            	rotateWheels = Boolean.parseBoolean(split[1].toLowerCase());
            if(split[0].equals("FixTrackLink"))
            	trackLinkFix = Integer.parseInt(split[1].toLowerCase());
            if(split[0].equals("FlipLinkFix"))
            	flipLinkFix = Boolean.parseBoolean(split[1].toLowerCase());
            
            //Animations
            if(split[0].equals("DoorPosition1"))
            	doorPos1 = new Vector3f(split[1], shortName);
            if(split[0].equals("DoorPosition2"))
            	doorPos2 = new Vector3f(split[1], shortName);
            if(split[0].equals("DoorRotation1"))
            	doorRot1 = new Vector3f(split[1], shortName);
            if(split[0].equals("DoorRotation2"))
            	doorRot2 = new Vector3f(split[1], shortName);
            if(split[0].equals("DoorRate"))
            	doorRate = new Vector3f(split[1], shortName);
            if(split[0].equals("DoorRotRate"))
            	doorRotRate = new Vector3f(split[1], shortName);
            
            if(split[0].equals("Door2Position1"))
            	door2Pos1 = new Vector3f(split[1], shortName);
            if(split[0].equals("Door2Position2"))
            	door2Pos2 = new Vector3f(split[1], shortName);
            if(split[0].equals("Door2Rotation1"))
            	door2Rot1 = new Vector3f(split[1], shortName);
            if(split[0].equals("Door2Rotation2"))
            	door2Rot2 = new Vector3f(split[1], shortName);
            if(split[0].equals("Door2Rate"))
            	door2Rate = new Vector3f(split[1], shortName);
            if(split[0].equals("Door2RotRate"))
            	door2RotRate = new Vector3f(split[1], shortName);

            
            
			//Armaments
			if(split[0].equals("ShootDelay"))
				vehicleShootDelay = Integer.parseInt(split[1]);
			if(split[0].equals("ShellDelay"))
				vehicleShellDelay = Integer.parseInt(split[1]);
			
			//Sound
			if(split[0].equals("ShootSound"))
			{
				shootSoundPrimary = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			if(split[0].equals("ShellSound"))
			{
				shootSoundSecondary = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			else if(split[0].equals("DriftSoundLength"))
				driftSoundLength = Integer.parseInt(split[1]);
			else if(split[0].equals("DriftSound"))
			{
				driftSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			if(split[0].equalsIgnoreCase("AddSmokePoint") || split[0].equalsIgnoreCase("AddSmokeDispenser"))
			{
				SmokePoint smoke = new SmokePoint();
				smoke.position = new Vector3f(split[1], shortName);
				smoke.direction = new Vector3f(split[2], shortName);
				smoke.detTime = Integer.parseInt(split[3]);
				smoke.part = split[4];
				smokers.add(smoke);
			}
		}
		catch(Exception ignored)
		{
		}
	}
	
	/**
	 * Find the items needed to rebuild a part. The returned array is disconnected from the template items it has looked up
	 */
	@Override
	public ArrayList<ItemStack> getItemsRequired(DriveablePart part, PartType engine)
	{
		//Get the list of items required by the driveable
		ArrayList<ItemStack> stacks = super.getItemsRequired(part, engine);
		//Add the propellers and engines
		if(EnumDriveablePart.core == part.type)
		{
			stacks.add(new ItemStack(engine.item));
		}
		return stacks;
	}
	
	public static VehicleType getVehicle(String find)
	{
		for(VehicleType type : types)
		{
			if(type.shortName.equals(find))
				return type;
		}
		return null;
	}

	/** To be overriden by subtypes for model reloading */
	public void reloadModel()
	{
		model = FlansMod.proxy.loadModel(modelString, shortName, ModelVehicle.class);
	}
	
	@Override
	public EntityDriveable createDriveable(World world, double x, double y, double z, DriveableData data)
	{
		return new EntityVehicle(world, x, y, z, this, data);
	}
}
