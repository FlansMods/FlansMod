package co.uk.flansmods.common.driveables;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.io.File;

import co.uk.flansmods.common.InfoType;
import co.uk.flansmods.common.TypeFile;
import co.uk.flansmods.common.vector.Vector3f;

public class DriveableType extends InfoType
{
	/** Points for calculating collision. Each one is tied to a part of the driveable */
	public ArrayList<CollisionPoint> points = new ArrayList<CollisionPoint>();

	/** Health of each driveable part */
	public HashMap<EnumDriveablePart, CollisionBox> health = new HashMap<EnumDriveablePart, CollisionBox>();
	
	/** The number of passengers, not including the pilot */
	public int numPassengers = 0;	
	/** Seat objects for holding information about the position and gun setup of each seat */
	public Seat[] seats;
	/** Inventory sizes */
	public int numCargoSlots, numBombSlots;
	/** The fuel tank size */
	public int fuelTankSize = 100;
	
	/** The yOffset of the model. Shouldn't be needed if you made your model properly */
	public float yOffset = 10F / 16F;
	/** Third person render distance */
	public float cameraDistance = 5F;
	
	/** Generic movement modifiers, no longer repeated for plane and vehicle */
	public float maxThrottle = 1F, maxNegativeThrottle = 0F;
	
	/** Mass in tons */
	public float mass = 1;
	
	
	/** Static DriveableType map for obtaining Types from Strings */
	public static HashMap<String, DriveableType> types = new HashMap<String, DriveableType>();
	public static ArrayList<DriveableType> typeList = new ArrayList<DriveableType>();
	
    public DriveableType(TypeFile file)
    {
		super(file);
		//Make sure the passenger arrays are set up first
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
				seats = new Seat[numPassengers + 1];
			}
		}
		typeList.add(this);
    }
	
    @Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if(split[0].equals("Texture"))
			{
				texture = split[1];
			}
			if(split[0].equals("AddCollisionPoint"))
			{
				points.add(new CollisionPoint(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), split[4], Integer.parseInt(split[5])));
			}
			
			//Movement Variables
			if(split[0].equals("MaxThrottle"))
				maxThrottle = Float.parseFloat(split[1]);
			if(split[0].equals("MaxNegativeThrottle"))
				maxNegativeThrottle = Float.parseFloat(split[1]);
			if(split[0].equals("Mass"))
				mass = Float.parseFloat(split[1]);
			
			//Cargo / Payload
			if(split[0].equals("CargoSlots"))
				numCargoSlots = Integer.parseInt(split[1]);
			if(split[0].equals("BombSlots"))
				numBombSlots = Integer.parseInt(split[1]);
			if(split[0].equals("FuelTankSize"))
				fuelTankSize = Integer.parseInt(split[1]);

			//Health
			if(split[0].equals("Health"))
			{
				EnumDriveablePart part = EnumDriveablePart.getPart(split[1]);
				health.put(part, new CollisionBox(Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6]), Integer.parseInt(split[7]), Integer.parseInt(split[8])));
			}
			
			//Driver Position
			if(split[0].equals("Driver") || split[0].equals("Pilot"))
			{
				seats[0] = new Seat(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]));
			}
			
			//Passengers / Gunner Seats
			if(split[0].equals("Passenger"))
			{
				Seat seat = new Seat(split);
				seats[seat.id] = seat;
			}
			
			//Y offset for badly built models :P
			if(split[0].equals("YOffset"))
				yOffset = Float.parseFloat(split[1]);
            //Third person camera distance
			if(split[0].equals("CameraDistance"))
				cameraDistance = Float.parseFloat(split[1]);
		}
		catch (Exception e)
		{
		}
	}
	
	public static DriveableType getDriveable(String find)
	{
		return types.get(find);
	}
	
	public static void populate()
	{
		for (DriveableType type: typeList)
		{
			types.put(type.shortName, type);
			if (type instanceof PlaneType)
			{
				PlaneType.types.put(type.shortName, (PlaneType) type);
			}
			else if (type instanceof VehicleType)
			{
				VehicleType.types.put(type.shortName, (VehicleType) type);
			}
		}
	}
}