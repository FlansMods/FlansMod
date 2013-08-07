package co.uk.flansmods.common;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;

import co.uk.flansmods.client.model.ModelPlane;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class PlaneType extends DriveableType
{
	@SideOnly(value = Side.CLIENT)
	public ModelPlane model;
	
	public float maxPropSpeed = 1F;
	public float takeOffSpeed = 1F;
	public double lookDownModifier = 1F;
	public double lookUpModifier = 1F;
	public double rollLeftModifier = 1F;
	public double rollRightModifier = 1F;
	public double turnLeftModifier = 1F;
	public double turnRightModifier = 1F;
	public double acceleration = 1F;
	public double decceleration = 1F;
	public int maxHeight = 256;
	public float yOffset = 10F / 16F;
	public float cameraDistance = 5F;
	
	public int[] barrelX = new int[4];
	public int[] barrelY = new int[4];
	public int[] barrelZ = new int[4];
	public boolean shootAlternately;
	
	public int bombXOffset;
	public int bombYOffset;
	public int bombZOffset;
	
	public int numProps;
	public int[] propellerX;
	public int[] propellerY;
	public int[] propellerZ;
	
	public int numPassengers;
	public int[] seatsX;
	public int[] seatsY;
	public int[] seatsZ;
	public int[] gunner; //Denotes the gunner position of the passenger
	//0 = No gun, 1 = Left Side Gunner, 2 = Right Side Gunner, 3 = Tail Gunner, 4 = Dorsal Gunner
	
	public int pilotX;
	public int pilotY;
	public int pilotZ;
	
	public int planeShootDelay;
	public int planeBombDelay;

	public String startSound;
	public int startSoundLength;
	public String propSound;
	public int propSoundLength;
	public String shootSound;
	public String bombSound;

	//Single wing on small table = Inner wing on big table
	public boolean bigTable = false;
	public boolean dyes = false;
	public int dyeColour = 0;
	public PartType bay;
	public PartType tail;
	public PartType cockpit;
	public PartType propeller;
	public PartType wings;
	public boolean allowWingGuns = false;
	public boolean allowNoseGuns = true;
	public boolean allowSideGuns = false;
	public boolean allowTailGuns = false; //Large planes only
	public boolean allowDorsalGun = false;
	public int propSetup = 0; //0 - Nose propeller, 1 - Inner Wing Propellers, 2 - Outer Wing Propellers, 3 - Inner and Outer Propellers

    public boolean hasGear = false;
    public boolean hasDoor = false;
    public boolean hasWing = false;
    public float posPark = 0F;
    public boolean invInflight = true;

	public static int nextIconIndex = 5;
	public static HashMap<String, PlaneType> types = new HashMap<String, PlaneType>();
	
    public PlaneType(TypeFile file)
    {
		super(file);
		//Make sure the passenger and prop arrays are set up first
		for(String line : file.lines)
		{
			if(line == null)
				break;
			if(line.startsWith("//"))
				continue;
			String[] split = line.split(" ");
			if(split.length < 2)
				continue;
			
			if(split[0].equals("Passengers"))
			{
				numPassengers = Integer.parseInt(split[1]);
				if(numPassengers > 0)
				{
					seatsX = new int[numPassengers];
					seatsY = new int[numPassengers];
					seatsZ = new int[numPassengers];
					gunner = new int[numPassengers];
				}
			}
			if(split[0].equals("PropSetup"))
			{
				propSetup = Integer.parseInt(split[1]);
				numProps = (propSetup > 0 ? 2 : 1);
				if(propSetup == 3)
					numProps = 4;
				propellerX = new int[numProps];
				propellerY = new int[numProps];
				propellerZ = new int[numProps];
			}
		}
		read(file);
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
			
			//Movement modifiers
			if(split[0].equals("MaxPropellerSpeed"))
				maxPropSpeed = Float.parseFloat(split[1]);
			if(split[0].equals("TakeOffSpeed"))
				takeOffSpeed = Float.parseFloat(split[1]);
			if(split[0].equals("TurnLeftSpeed"))
				turnLeftModifier = Float.parseFloat(split[1]);
			if(split[0].equals("TurnRightSpeed"))
				turnRightModifier = Float.parseFloat(split[1]);
			if(split[0].equals("RollLeftSpeed"))
				rollLeftModifier = Float.parseFloat(split[1]);
			if(split[0].equals("RollRightSpeed"))
				rollRightModifier = Float.parseFloat(split[1]);
			if(split[0].equals("LookUpSpeed"))
				lookUpModifier = Float.parseFloat(split[1]);
			if(split[0].equals("LookDownSpeed"))
				lookDownModifier = Float.parseFloat(split[1]);
			if(split[0].equals("Acceleration"))
				acceleration = Float.parseFloat(split[1]);
			if(split[0].equals("Decceleration"))
				decceleration = Float.parseFloat(split[1]);
			if(split[0].equals("MaxHeight"))
				maxHeight = Integer.parseInt(split[1]);
			if(split[0].equals("YOffset"))
				yOffset = Float.parseFloat(split[1]);

            if(split[0].equals("HasGear"))
                hasGear = split[1].equals("True");
            if(split[0].equals("HasDoor"))
                hasDoor = split[1].equals("True");
            if(split[0].equals("HasWing"))
                hasWing = split[1].equals("True");
            if(split[0].equals("PosPark"))
                posPark = Float.parseFloat(split[1]);
            if(split[0].equals("InflightInventory"))
                invInflight = split[1].equals("False");
                
			if(split[0].equals("CameraDistance"))
				cameraDistance = Float.parseFloat(split[1]);
				
			//Propellers and Armaments
			if(split[0].equals("AddGunPosition"))
			{
				int i = Integer.parseInt(split[1]);
				barrelX[i] = Integer.parseInt(split[2]);
				barrelY[i] = Integer.parseInt(split[3]);
				barrelZ[i] = Integer.parseInt(split[4]);			
			}
			if(split[0].equals("BombPosition"))
			{
				bombXOffset = Integer.parseInt(split[1]);
				bombYOffset = Integer.parseInt(split[2]);
				bombZOffset = Integer.parseInt(split[3]);				
			}
			if(split[0].equals("ShootDelay"))
				planeShootDelay = Integer.parseInt(split[1]);
			if(split[0].equals("BombDelay"))
				planeBombDelay = Integer.parseInt(split[1]);
			if(split[0].equals("PropellerPos"))
			{
				int i = Integer.parseInt(split[1]);
				propellerX[i] = Integer.parseInt(split[2]);
				propellerY[i] = Integer.parseInt(split[3]);
				propellerZ[i] = Integer.parseInt(split[4]);				
			}
			//Passengers / Gunner Seats
			if(split[0].equals("Passenger"))
			{
				int id = Integer.parseInt(split[1]);
				seatsX[id] = Integer.parseInt(split[2]);
				seatsY[id] = Integer.parseInt(split[3]);
				seatsZ[id] = Integer.parseInt(split[4]);
				gunner[id] = Integer.parseInt(split[5]);
			}
			if(split[0].equals("Pilot"))
			{
				pilotX = Integer.parseInt(split[1]);
				pilotY = Integer.parseInt(split[2]);
				pilotZ = Integer.parseInt(split[3]);
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
			}
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