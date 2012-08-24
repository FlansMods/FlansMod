package flansmod.common;

import net.minecraft.client.Minecraft;

import java.io.BufferedReader;
import java.util.List;
import java.util.ArrayList;
import java.io.File;

import cpw.mods.fml.client.FMLClientHandler;

import flansmod.client.ModelVehicle;

public class VehicleType extends DriveableType
{
    public VehicleType(BufferedReader file, String pack)
    {
		super(pack);
		do
		{
			String line = null;
			try
			{
				line = file.readLine();
			}
			catch(Exception e)
			{
				break;
			}
			if(line == null)
			{
				break;
			}
			if(line.startsWith("//"))
				continue;
			String[] split = line.split(" ");
			if(split.length < 2)
				continue;
			read(split, file);
		}
		while(true);
		iconIndex = nextIconIndex++;
		types.add(this);
    }
	
	protected void read(String[] split, BufferedReader file)
	{
		super.read(split, file);
		try
		{
			if(split[0].equals("Model"))
			{
				model = FlansMod.proxy.loadVehicleModel(split, shortName);
			}
					
			//Movement modifiers
			if(split[0].equals("MaxSpeed"))
				maxSpeed = Float.parseFloat(split[1]);
			if(split[0].equals("TurnLeftSpeed"))
				turnLeftModifier = Float.parseFloat(split[1]);
			if(split[0].equals("TurnRightSpeed"))
				turnRightModifier = Float.parseFloat(split[1]);
			if(split[0].equals("Acceleration"))
				acceleration = Float.parseFloat(split[1]);
			if(split[0].equals("Decceleration"))
				decceleration = Float.parseFloat(split[1]);
			if(split[0].equals("YOffset"))
				yOffset = Float.parseFloat(split[1]);
			if(split[0].equals("Tank"))
				tank = split[1].equals("True");
			if(split[0].equals("SquashMobs"))
				squashMobs = split[1].equals("True");
				
			if(split[0].equals("CameraDistance"))
				cameraDistance = Float.parseFloat(split[1]);
				
			//Propellers and Armaments
			if(split[0].equals("GunPosition"))
			{
				barrelX = Integer.parseInt(split[1]);
				barrelY = Integer.parseInt(split[2]);
				barrelZ = Integer.parseInt(split[3]);				
			}
			if(split[0].equals("ShootDelay"))
				vehicleShootDelay = Integer.parseInt(split[1]);
			if(split[0].equals("ShellDelay"))
				vehicleShellDelay = Integer.parseInt(split[1]);
				
			if(split[0].equals("GunYawMin"))
				gunYawMin = Float.parseFloat(split[1]);
			if(split[0].equals("GunYawMax"))
				gunYawMax = Float.parseFloat(split[1]);
			if(split[0].equals("GunPitchMin"))
				gunPitchMin = -Float.parseFloat(split[1]);
			if(split[0].equals("GunPitchMax"))
				gunPitchMax = -Float.parseFloat(split[1]);

			if(split[0].equals("TurretYawMin"))
				turretYawMin = Float.parseFloat(split[1]);
			if(split[0].equals("TurretYawMax"))
				turretYawMax = Float.parseFloat(split[1]);
			if(split[0].equals("TurretPitchMin"))
				turretPitchMin = -Float.parseFloat(split[1]);
			if(split[0].equals("TurretPitchMax"))
				turretPitchMax = -Float.parseFloat(split[1]);

				
			//Passengers / Gunner Seats
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
			if(split[0].equals("CollisionBoxes"))
			{
				boxes = new CollisionBox[Integer.parseInt(split[1])];
			}
			if(split[0].equals("AddCollisionBox"))
			{
				int id = Integer.parseInt(split[1]);
				boxes[id] = new CollisionBox(Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]));
			}
			if(split[0].equals("Passenger"))
			{
				int id = Integer.parseInt(split[1]);
				seatsX[id] = Integer.parseInt(split[2]);
				seatsY[id] = Integer.parseInt(split[3]);
				seatsZ[id] = Integer.parseInt(split[4]);
				gunner[id] = Integer.parseInt(split[5]);
			}
			if(split[0].equals("Driver"))
			{
				driverX = Integer.parseInt(split[1]);
				driverY = Integer.parseInt(split[2]);
				driverZ = Integer.parseInt(split[3]);
			}

			if(split[0].equals("WheelPosition"))
			{
				int id = Integer.parseInt(split[1]);
				wheelsX[id] = Integer.parseInt(split[2]);
				wheelsY[id] = Integer.parseInt(split[3]);
				wheelsZ[id] = Integer.parseInt(split[4]);
			}
			
			//Sound
			if(split[0].equals("StartSoundLength"))
				startSoundLength = Integer.parseInt(split[1]);
			if(split[0].equals("EngineSoundLength"))
				engineSoundLength = Integer.parseInt(split[1]);
			if(split[0].equals("StartSound"))
			{
				startSound = "vehicles." + split[1];
				FMLClientHandler.instance().getClient().installResource("newSound/vehicles/" + split[1] + ".ogg", new File(FMLClientHandler.instance().getClient().mcDataDir, "/Flan/" + contentPack + "/sounds/" + split[1] + ".ogg"));
			}
			if(split[0].equals("EngineSound"))
			{
				engineSound = "vehicles." + split[1];
				FMLClientHandler.instance().getClient().installResource("newSound/vehicles/" + split[1] + ".ogg", new File(FMLClientHandler.instance().getClient().mcDataDir, "/Flan/" + contentPack + "/sounds/" + split[1] + ".ogg"));
			}
			if(split[0].equals("ShootSound"))
			{
				shootSound = "vehicles." + split[1];
				FMLClientHandler.instance().getClient().installResource("newSound/vehicles/" + split[1] + ".ogg", new File(FMLClientHandler.instance().getClient().mcDataDir, "/Flan/" + contentPack + "/sounds/" + split[1] + ".ogg"));
			}
			if(split[0].equals("ShellSound"))
			{
				shellSound = "vehicles." + split[1];
				FMLClientHandler.instance().getClient().installResource("newSound/vehicles/" + split[1] + ".ogg", new File(FMLClientHandler.instance().getClient().mcDataDir, "/Flan/" + contentPack + "/sounds/" + split[1] + ".ogg"));
			}
				
			if(split[0].equals("AllowTurretGuns"))
				allowTurretGuns = split[1].equals("True");
			if(split[0].equals("AllowBodyGuns"))
				allowBodyGuns = split[1].equals("True");
			if(split[0].equals("HasTurret"))
				hasTurret = split[1].equals("True");
			
				
			//Recipe
			if(split[0].equals("FrontWheels"))
				frontWheels = PartType.getPart(split[1]);
			if(split[0].equals("BackWheels"))
				backWheels = PartType.getPart(split[1]);
			if(split[0].equals("Tracks"))
				tracks = PartType.getPart(split[1]);
			if(split[0].equals("Chassis"))
				chassis = PartType.getPart(split[1]);
			if(split[0].equals("Turret"))
				turret = PartType.getPart(split[1]);
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
	
	public static VehicleType getVehicle(String find)
	{
		for(VehicleType type : types)
		{
			if(type.shortName.equals(find))
				return type;
		}
		return null;
	}
		
	public Object model;
	
	public CollisionBox[] boxes;
	
	public float maxSpeed = 1F;
	public double turnLeftModifier = 1F;
	public double turnRightModifier = 1F;
	public double acceleration = 1F;
	public double decceleration = 1F;
	public float yOffset = 10F / 16F;
	//Unused boolean supposedly for an alternate movement system
	public boolean tank = false;
	public boolean squashMobs = false;
	public float cameraDistance = 5F;
		
	public int barrelX;
	public int barrelY;
	public int barrelZ;
		
	public int numPassengers;
	public int[] seatsX;
	public int[] seatsY;
	public int[] seatsZ;
	public int[] gunner; //Denotes the gunner position of the passenger
	//0 = No gun, 1 = Turret gunner
	
	//For the passenger controlled MG
	public float gunYawMin;
	public float gunYawMax;
	public float gunPitchMin;
	public float gunPitchMax;	
	
	//For the tank turret
	public float turretYawMin = 180F;
	public float turretYawMax = -180F;
	public float turretPitchMin = -45F;
	public float turretPitchMax = 0F;
	
	public int driverX;
	public int driverY;
	public int driverZ;
	
	public int[] wheelsX = new int[] {-16, 16, 16, -16};
	public int[] wheelsY = new int[] {0, 0, 0, 0};
	public int[] wheelsZ = new int[] {16, 16, -16, -16};
	
	public int vehicleShootDelay;
	public int vehicleShellDelay;

	public String startSound;
	public int startSoundLength;
	public String engineSound;
	public int engineSoundLength;
	public String shootSound;
	public String shellSound;

	public boolean dyes = false;
	public int dyeColour = 0;
	public PartType frontWheels;
	public PartType backWheels;
	public PartType tracks;
	public PartType chassis;
	public PartType turret;
	public boolean allowTurretGuns = false;
	public boolean allowBodyGuns = true;
	public boolean hasTurret = false;
	
	public static int nextIconIndex = 2;
	public static List<VehicleType> types = new ArrayList<VehicleType>();
}