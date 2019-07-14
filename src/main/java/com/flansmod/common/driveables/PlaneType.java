package com.flansmod.common.driveables;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.common.FlansMod;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.vector.Vector3f;

public class PlaneType extends DriveableType
{
	/** What type of flying vehicle is this? */
	public EnumPlaneMode mode = EnumPlaneMode.PLANE;	
	/** Pitch modifiers */
	public float lookDownModifier = 1F, lookUpModifier = 1F;
	/** Roll modifiers */
	public float rollLeftModifier = 1F, rollRightModifier = 1F;
	/** Yaw modifiers */
	public float turnLeftModifier = 1F, turnRightModifier = 1F;
	/** Co-efficient of lift which determines how the plane flies */
	public float lift = 1F;
	
	/** The point at which bomb entities spawn */
	public Vector3f bombPosition;
	/** The time in ticks between bullets fired by the nose / wing guns */
	public int planeShootDelay;
	/** The time in ticks between bombs dropped */
	public int planeBombDelay;
	
	
	//Wing Animations
	public Vector3f wingPos1 = new Vector3f(0,0,0);
	public Vector3f wingPos2 = new Vector3f(0,0,0);
	public Vector3f wingRot1 = new Vector3f(0,0,0);
	public Vector3f wingRot2 = new Vector3f(0,0,0);
	public Vector3f wingRate = new Vector3f(0,0,0);
	public Vector3f wingRotRate = new Vector3f(0,0,0);
	
	//Wing Wheel Animations
	public Vector3f wingWheelPos1 = new Vector3f(0,0,0);
	public Vector3f wingWheelPos2 = new Vector3f(0,0,0);
	public Vector3f wingWheelRot1 = new Vector3f(0,0,0);
	public Vector3f wingWheelRot2 = new Vector3f(0,0,0);
	public Vector3f wingWheelRate = new Vector3f(0,0,0);
	public Vector3f wingWheelRotRate = new Vector3f(0,0,0);
	
	//Body Wheel Animations
	public Vector3f bodyWheelPos1 = new Vector3f(0,0,0);
	public Vector3f bodyWheelPos2 = new Vector3f(0,0,0);
	public Vector3f bodyWheelRot1 = new Vector3f(0,0,0);
	public Vector3f bodyWheelRot2 = new Vector3f(0,0,0);
	public Vector3f bodyWheelRate = new Vector3f(0,0,0);
	public Vector3f bodyWheelRotRate = new Vector3f(0,0,0);
	
	//Tail Wheel Animations
	public Vector3f tailWheelPos1 = new Vector3f(0,0,0);
	public Vector3f tailWheelPos2 = new Vector3f(0,0,0);
	public Vector3f tailWheelRot1 = new Vector3f(0,0,0);
	public Vector3f tailWheelRot2 = new Vector3f(0,0,0);
	public Vector3f tailWheelRate = new Vector3f(0,0,0);
	public Vector3f tailWheelRotRate = new Vector3f(0,0,0);
	
	//Door animations
	public Vector3f doorPos1 = new Vector3f(0,0,0);
	public Vector3f doorPos2 = new Vector3f(0,0,0);
	public Vector3f doorRot1 = new Vector3f(0,0,0);
	public Vector3f doorRot2 = new Vector3f(0,0,0);
	public Vector3f doorRate = new Vector3f(0,0,0);
	public Vector3f doorRotRate = new Vector3f(0,0,0);
	
	/** The positions, parent parts and recipe items of the propellers, used to calculate forces and render the plane correctly */
	public ArrayList<Propeller> propellers = new ArrayList<Propeller>();
	/** The positions, parent parts and recipe items of the helicopter propellers, used to calculate forces and render the plane correctly */
	public ArrayList<Propeller> heliPropellers = new ArrayList<Propeller>(), heliTailPropellers = new ArrayList<Propeller>();
				
	/** Aesthetic features */
    public boolean hasGear = false, hasDoor = false, hasWing = false;
    public boolean foldWingForLand = false;
    public boolean flyWithOpenDoor = false;
    /** Default pitch for when parked. Will implement better system soon */
    public float restingPitch = 0F;
    
    public boolean spinWithoutTail = false;
    
    public boolean valkyrie = false;
    
    /** Whether the player can access the inventory while in the air */
    public boolean invInflight = true;

	public static ArrayList<PlaneType> types = new ArrayList<PlaneType>();
	
    public PlaneType(TypeFile file)
    {
		super(file);
		types.add(this);
    }
    
    @Override
    public void preRead(TypeFile file)
    {
    	super.preRead(file);
    }
    
    @Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{		
			//Plane Mode
			if(split[0].equals("Mode"))
				mode = EnumPlaneMode.getMode(split[1]);
			//Yaw modifiers
			if(split[0].equals("TurnLeftSpeed"))
				turnLeftModifier = Float.parseFloat(split[1]);
			if(split[0].equals("TurnRightSpeed"))
				turnRightModifier = Float.parseFloat(split[1]);
			//Pitch modifiers
			if(split[0].equals("LookUpSpeed"))
				lookUpModifier = Float.parseFloat(split[1]);
			if(split[0].equals("LookDownSpeed"))
				lookDownModifier = Float.parseFloat(split[1]);
			//Roll modifiers
			if(split[0].equals("RollLeftSpeed"))
				rollLeftModifier = Float.parseFloat(split[1]);
			if(split[0].equals("RollRightSpeed"))
				rollRightModifier = Float.parseFloat(split[1]);
			
			//Lift
			if(split[0].equals("Lift"))
				lift = Float.parseFloat(split[1]);
				
			//Propellers and Armaments

			if(split[0].equals("ShootDelay"))
				planeShootDelay = Integer.parseInt(split[1]);
			if(split[0].equals("BombDelay"))
				planeBombDelay = Integer.parseInt(split[1]);
			
			//Propellers
			if(split[0].equals("Propeller"))
			{
				Propeller propeller = new Propeller(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), EnumDriveablePart.getPart(split[5]), PartType.getPart(split[6]));
				propellers.add(propeller);
				driveableRecipe.add(new ItemStack(propeller.itemType.item));
			}
			if(split[0].equals("HeliPropeller"))
			{
				Propeller propeller = new Propeller(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), EnumDriveablePart.getPart(split[5]), PartType.getPart(split[6]));
				heliPropellers.add(propeller);
				driveableRecipe.add(new ItemStack(propeller.itemType.item));
			}
			if(split[0].equals("HeliTailPropeller"))
			{
				Propeller propeller = new Propeller(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), EnumDriveablePart.getPart(split[5]), PartType.getPart(split[6]));
				heliTailPropellers.add(propeller);
				driveableRecipe.add(new ItemStack(propeller.itemType.item));
			}
			

			if(split[0].equals("HasFlare"))
				hasFlare = split[1].equals("True");
			if(split[0].equals("FlareDelay"))
			{
				flareDelay = Integer.parseInt(split[1]);
				if(flareDelay<=0)
					flareDelay = 1;
			}
			if(split[0].equals("TimeFlareUsing"))
			{
				timeFlareUsing = Integer.parseInt(split[1]);
				if(timeFlareUsing<=0)
					timeFlareUsing = 1;
			}

			//Sound
			if(split[0].equals("PropSoundLength"))
				engineSoundLength = Integer.parseInt(split[1]);
			if(split[0].equals("PropSound"))
			{
				engineSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			if(split[0].equals("ShootSound"))
			{
				shootSoundPrimary = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			if(split[0].equals("BombSound"))
			{
				shootSoundSecondary = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}

			
			//Aesthetics
            if(split[0].equals("HasGear"))
                hasGear = split[1].equals("True");
            if(split[0].equals("HasDoor"))
                hasDoor = split[1].equals("True");
            if(split[0].equals("HasWing"))
                hasWing = split[1].equals("True");
            if(split[0].equals("FoldWingForLand"))
                foldWingForLand = split[1].equals("True");
            if(split[0].equals("FlyWithOpenDoor"))
                flyWithOpenDoor = split[1].equals("True");
            if(split[0].equals("RestingPitch"))
                restingPitch = Float.parseFloat(split[1]);
            if(split[0].equals("SpinWithoutTail"))
                spinWithoutTail = Boolean.parseBoolean(split[1]);
            if(split[0].equals("Valkyrie"))
                valkyrie = Boolean.parseBoolean(split[1]);
            
            //Animations
            //Wings
            if(split[0].equals("WingPosition1"))
            	wingPos1 = new Vector3f(split[1], shortName);
            if(split[0].equals("WingPosition2"))
            	wingPos2 = new Vector3f(split[1], shortName);
            if(split[0].equals("WingRotation1"))
            	wingRot1 = new Vector3f(split[1], shortName);
            if(split[0].equals("WingRotation2"))
            	wingRot2 = new Vector3f(split[1], shortName);
            if(split[0].equals("WingRate"))
            	wingRate = new Vector3f(split[1], shortName);
            if(split[0].equals("WingRotRate"))
            	wingRotRate = new Vector3f(split[1], shortName);
            
            //Wing Wheels
            if(split[0].equals("WingWheelPosition1"))
            	wingWheelPos1 = new Vector3f(split[1], shortName);
            if(split[0].equals("WingWheelPosition2"))
            	wingWheelPos2 = new Vector3f(split[1], shortName);
            if(split[0].equals("WingWheelRotation1"))
            	wingWheelRot1 = new Vector3f(split[1], shortName);
            if(split[0].equals("WingWheelRotation2"))
            	wingWheelRot2 = new Vector3f(split[1], shortName);
            if(split[0].equals("WingWheelRate"))
            	wingWheelRate = new Vector3f(split[1], shortName);
            if(split[0].equals("WingWheelRotRate"))
            	wingWheelRotRate = new Vector3f(split[1], shortName);
            
            //Body Wheels
            if(split[0].equals("BodyWheelPosition1"))
            	bodyWheelPos1 = new Vector3f(split[1], shortName);
            if(split[0].equals("BodyWheelPosition2"))
            	bodyWheelPos2 = new Vector3f(split[1], shortName);
            if(split[0].equals("BodyWheelRotation1"))
            	bodyWheelRot1 = new Vector3f(split[1], shortName);
            if(split[0].equals("BodyWheelRotation2"))
            	bodyWheelRot2 = new Vector3f(split[1], shortName);
            if(split[0].equals("BodyWheelRate"))
            	bodyWheelRate = new Vector3f(split[1], shortName);
            if(split[0].equals("BodyWheelRotRate"))
            	bodyWheelRotRate = new Vector3f(split[1], shortName);
            
            //Tail Wheels
            if(split[0].equals("TailWheelPosition1"))
            	tailWheelPos1 = new Vector3f(split[1], shortName);
            if(split[0].equals("TailWheelPosition2"))
            	tailWheelPos2 = new Vector3f(split[1], shortName);
            if(split[0].equals("TailWheelRotation1"))
            	tailWheelRot1 = new Vector3f(split[1], shortName);
            if(split[0].equals("TailWheelRotation2"))
            	tailWheelRot2 = new Vector3f(split[1], shortName);
            if(split[0].equals("TailWheelRate"))
            	tailWheelRate = new Vector3f(split[1], shortName);
            if(split[0].equals("TailWheelRotRate"))
            	tailWheelRotRate = new Vector3f(split[1], shortName);
            
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
            
            //In-flight inventory
            if(split[0].equals("InflightInventory"))
                invInflight = split[1].equals("False");
		}
		catch (Exception ignored)
		{
		}
	}
    
    @Override
    public int numEngines()
    {
    	switch(mode)
    	{
    	case VTOL : return Math.max(propellers.size(), heliPropellers.size());
    	case PLANE : return propellers.size();
    	case HELI : return heliPropellers.size();
    	default : return 1;
    	}
    }
    
    /** Find the items needed to rebuild a part. The returned array is disconnected from the template items it has looked up */
    @Override
    public ArrayList<ItemStack> getItemsRequired(DriveablePart part, PartType engine)
    {
    	//Get the list of items required by the driveable
    	ArrayList<ItemStack> stacks = super.getItemsRequired(part, engine);
    	//Add the propellers and engines
    	for(Propeller propeller : propellers)
    	{
    		if(propeller.planePart == part.type)
    		{
	    		stacks.add(new ItemStack(propeller.itemType.item));
	    		stacks.add(new ItemStack(engine.item));
    		}
    	}
    	return stacks;
    }
    
	public static PlaneType getPlane(String find)
	{
		for(PlaneType type : types)
		{
			if(type.shortName.equals(find))
				return type;
		}
		return null;
	}
	
	/** To be overriden by subtypes for model reloading */
	public void reloadModel()
	{
		model = FlansMod.proxy.loadModel(modelString, shortName, ModelPlane.class);
	}
}