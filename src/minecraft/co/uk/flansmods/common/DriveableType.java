package co.uk.flansmods.common;

import net.minecraft.client.Minecraft;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.io.File;

public class DriveableType extends InfoType
{
    public DriveableType(String pack)
    {
		super(pack);
		typeList.add(this);
    }
	
	protected void read(String[] split, BufferedReader file)
	{
		super.read(split, file);
		try
		{
			if(split[0].equals("Texture"))
			{
				texture = split[1];
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
			
			//Cargo / Payload
			if(split[0].equals("CargoSlots"))
				numCargoSlots = Integer.parseInt(split[1]);
			if(split[0].equals("BombSlots"))
				numBombSlots = Integer.parseInt(split[1]);
			if(split[0].equals("FuelTankSize"))
				tankSize = Integer.parseInt(split[1]);

			//Health
			if(split[0].equals("Health"))
				health = Integer.parseInt(split[1]);
		}
		catch (Exception e)
		{
		}
	}
	
	public static DriveableType getDriveable(String find)
	{
		return types.get(find);
	}
	
	protected static void populate()
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
		
		typeList = null;
	}
	
	public CollisionBox[] boxes;
		
	public String texture;
			
	public int health;

	public int numCargoSlots;
	public int numBombSlots;
	public int tankSize = 100;

	public static HashMap<String, DriveableType> types = new HashMap<String, DriveableType>();
	private static ArrayList<DriveableType> typeList = new ArrayList<DriveableType>();
}