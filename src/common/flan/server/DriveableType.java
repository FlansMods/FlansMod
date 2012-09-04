package flan.server;

import net.minecraft.client.Minecraft;

import java.io.BufferedReader;
import java.util.List;
import java.util.ArrayList;
import java.io.File;

public class DriveableType extends InfoType
{
    public DriveableType(String pack)
    {
		super(pack);
		types.add(this);
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
		for(DriveableType type : types)
		{
			if(type.shortName.equals(find))
				return type;
		}
		return null;
	}
	
	public CollisionBox[] boxes;
		
	public String texture;
			
	public int health;

	public int numCargoSlots;
	public int numBombSlots;
	public int tankSize = 100;

	public static List<DriveableType> types = new ArrayList<DriveableType>();
}