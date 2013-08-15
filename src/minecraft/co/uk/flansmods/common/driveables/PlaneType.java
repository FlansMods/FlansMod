package co.uk.flansmods.common.driveables;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;

import co.uk.flansmods.client.model.ModelPlane;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.GunType;
import co.uk.flansmods.common.PartType;
import co.uk.flansmods.common.TypeFile;
import co.uk.flansmods.common.vector.Vector3f;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PlaneType extends DriveableType
{
	@SideOnly(value = Side.CLIENT)
	/** The plane model */
	public ModelPlane model;
	
	/** Pitch modifiers */
	public float lookDownModifier = 1F, lookUpModifier = 1F;
	/** Roll modifiers */
	public float rollLeftModifier = 1F, rollRightModifier = 1F;
	/** Yaw modifiers */
	public float turnLeftModifier = 1F, turnRightModifier = 1F;
	/** Co-efficients of drag and lift which determine how the plane flies */
	public float drag = 1F, lift = 1F;
	
	/** The point at which bomb entities spawn */
	public Vector3f bombPosition;
	/** The time in ticks between bullets fired by the nose / wing guns */
	public int planeShootDelay;
	/** The time in ticks between bombs dropped */
	public int planeBombDelay;
	
	/** The positions, parent parts and recipe items of the propellers, used to calculate forces and render the plane correctly */
	public ArrayList<Propeller> propellers = new ArrayList<Propeller>();
				
	/** Sounds */
	//TODO : Overhaul sounds
	public String startSound;
	public int startSoundLength;
	public String propSound;
	public int propSoundLength;
	public String shootSound;
	public String bombSound;
	
	/** Aesthetic features */
    public boolean hasGear = false, hasDoor = false, hasWing = false;
    /** Default pitch for when parked. Will implement better system soon */
    public float posPark = 0F;
    
    /** Whether the player can access the inventory while in the air */
    public boolean invInflight = true;

	public static int nextIconIndex = 5;
	public static HashMap<String, PlaneType> types = new HashMap<String, PlaneType>();
	
    public PlaneType(TypeFile file)
    {
		super(file);
		iconIndex = nextIconIndex++;
    }
    
    @Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if(FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model"))
				FlansMod.proxy.loadPlaneModel(split, shortName, this);
			
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
			
			//Drag and Lift
			if(split[0].equals("Drag"))
				drag = Float.parseFloat(split[1]);
			if(split[0].equals("Lift"))
				lift = Float.parseFloat(split[1]);
				
			//Propellers and Armaments
			if(split[0].equals("BombPosition"))
			{
				bombPosition = new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F);	
			}
			if(split[0].equals("ShootDelay"))
				planeShootDelay = Integer.parseInt(split[1]);
			if(split[0].equals("BombDelay"))
				planeBombDelay = Integer.parseInt(split[1]);
			
			//Propellers
			if(split[0].equals("Propeller"))
			{
				propellers.add(new Propeller(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), EnumDriveablePart.getPart(split[5]), PartType.getPart(split[6])));
			}

			//Sound
			if(split[0].equals("StartSoundLength"))
				startSoundLength = Integer.parseInt(split[1]);
			if(split[0].equals("PropSoundLength"))
				propSoundLength = Integer.parseInt(split[1]);
			if(split[0].equals("StartSound"))
			{
				startSound = contentPack + "planes." + split[1];
				FlansMod.proxy.loadSound(contentPack, contentPack + "planes", split[1]);
			}
			if(split[0].equals("PropSound"))
			{
				propSound = contentPack + "planes." + split[1];
				FlansMod.proxy.loadSound(contentPack, contentPack + "planes", split[1]);
			}
			if(split[0].equals("ShootSound"))
			{
				shootSound = contentPack + "planes." + split[1];
				FlansMod.proxy.loadSound(contentPack, contentPack + "planes", split[1]);
			}
			if(split[0].equals("BombSound"))
			{
				bombSound = contentPack + "planes." + split[1];
				FlansMod.proxy.loadSound(contentPack, contentPack + "planes", split[1]);
			}
				
			//Recipe
			/*
			if(split[0].equals("BigTable"))
				bigTable = split[1].equals("True");
			if(split[0].equals("AllowWingGuns"))
				allowWingGuns = split[1].equals("True");
			if(split[0].equals("AllowNoseGuns"))
				allowNoseGuns = split[1].equals("True");
			if(split[0].equals("AllowSideGuns"))
				allowSideGuns = split[1].equals("True");
			if(split[0].equals("AllowTailGuns"))
				allowTailGuns = split[1].equals("True");
			if(split[0].equals("AllowDorsalGun"))
				allowDorsalGun = split[1].equals("True");
			if(split[0].equals("Propeller"))
				propeller = PartType.getPart(split[1]);
			if(split[0].equals("Cockpit"))
				cockpit = PartType.getPart(split[1]);
			if(split[0].equals("Wings"))
				wings = PartType.getPart(split[1]);
			if(split[0].equals("Bay"))
				bay = PartType.getPart(split[1]);
			if(split[0].equals("Tail"))
				tail = PartType.getPart(split[1]);
			if(split[0].equals("Dyes"))
			{
				if(split[1].equals("None"))
					dyes = false;
				else
				{
					dyes = true;
					if(split[1].equals("Black"))
						dyeColour = 0;
					if(split[1].equals("Red"))
						dyeColour = 1;
					if(split[1].equals("Green"))
						dyeColour = 2;
					if(split[1].equals("Brown"))
						dyeColour = 3;
					if(split[1].equals("Blue"))
						dyeColour = 4;
					if(split[1].equals("Purple"))
						dyeColour = 5;
					if(split[1].equals("Cyan"))
						dyeColour = 6;
					if(split[1].equals("LGrey"))
						dyeColour = 7;
					if(split[1].equals("Grey"))
						dyeColour = 8;
					if(split[1].equals("Pink"))
						dyeColour = 9;
					if(split[1].equals("Lime"))
						dyeColour = 10;
					if(split[1].equals("Yellow"))
						dyeColour = 11;
					if(split[1].equals("LBlue"))
						dyeColour = 12;
					if(split[1].equals("Magenta"))
						dyeColour = 13;
					if(split[1].equals("Orange"))
						dyeColour = 14;
					if(split[1].equals("White"))
						dyeColour = 15;
				}
			}*/
			
			//Aesthetics
            if(split[0].equals("HasGear"))
                hasGear = split[1].equals("True");
            if(split[0].equals("HasDoor"))
                hasDoor = split[1].equals("True");
            if(split[0].equals("HasWing"))
                hasWing = split[1].equals("True");
            if(split[0].equals("PosPark"))
                posPark = Float.parseFloat(split[1]);
            
            //In-flight inventory
            if(split[0].equals("InflightInventory"))
                invInflight = split[1].equals("False");
		}
		catch (Exception e)
		{
		}
	}
	
	public static PlaneType getPlane(String find)
	{
		return types.get(find);
	}
}