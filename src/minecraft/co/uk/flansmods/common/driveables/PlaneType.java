package co.uk.flansmods.common.driveables;

import java.util.ArrayList;
import net.minecraft.item.ItemStack;

import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.PartType;
import co.uk.flansmods.common.TypeFile;
import co.uk.flansmods.common.vector.Vector3f;

public class PlaneType extends DriveableType
{
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
	
	/** The positions, parent parts and recipe items of the propellers, used to calculate forces and render the plane correctly */
	public ArrayList<Propeller> propellers = new ArrayList<Propeller>();
				
	/** Aesthetic features */
    public boolean hasGear = false, hasDoor = false, hasWing = false;
    /** Default pitch for when parked. Will implement better system soon */
    public float restingPitch = 0F;
    
    /** Whether the player can access the inventory while in the air */
    public boolean invInflight = true;

	public static ArrayList<PlaneType> types = new ArrayList<PlaneType>();
	
    public PlaneType(TypeFile file)
    {
		super(file);
		types.add(this);
    }
    
    @Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{		
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
				Propeller propeller = new Propeller(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), EnumDriveablePart.getPart(split[5]), PartType.getPart(split[6]));
				propellers.add(propeller);
				recipe.add(new ItemStack(propeller.itemType.item));
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
				shootMainSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			if(split[0].equals("BombSound"))
			{
				shootSecondarySound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			
			//Aesthetics
            if(split[0].equals("HasGear"))
                hasGear = split[1].equals("True");
            if(split[0].equals("HasDoor"))
                hasDoor = split[1].equals("True");
            if(split[0].equals("HasWing"))
                hasWing = split[1].equals("True");
            if(split[0].equals("RestingPitch"))
                restingPitch = Float.parseFloat(split[1]);
            
            //In-flight inventory
            if(split[0].equals("InflightInventory"))
                invInflight = split[1].equals("False");
		}
		catch (Exception e)
		{
		}
	}
    
    @Override
    public int numEngines()
    {
    	return propellers.size();
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
}