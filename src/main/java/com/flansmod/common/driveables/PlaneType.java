package com.flansmod.common.driveables;

import java.util.ArrayList;
import java.util.HashMap;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.common.FlansMod;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.types.InfoType.ParseFunc;
import com.flansmod.common.vector.Vector3f;

public class PlaneType extends DriveableType
{
	/**
	 * What type of flying vehicle is this?
	 */
	public EnumPlaneMode mode = EnumPlaneMode.PLANE;
	/**
	 * Pitch modifiers
	 */
	public float lookDownModifier = 1F, lookUpModifier = 1F;
	/**
	 * Roll modifiers
	 */
	public float rollLeftModifier = 1F, rollRightModifier = 1F;
	/**
	 * Yaw modifiers
	 */
	public float turnLeftModifier = 1F, turnRightModifier = 1F;
	/**
	 * Co-efficient of lift which determines how the plane flies
	 */
	public float lift = 1F;
	
	/**
	 * The point at which bomb entities spawn
	 */
	public Vector3f bombPosition;
	/**
	 * The time in ticks between bullets fired by the nose / wing guns
	 */
	public int planeShootDelay;
	/**
	 * The time in ticks between bombs dropped
	 */
	public int planeBombDelay;
	
	/**
	 * The positions, parent parts and recipe items of the propellers, used to calculate forces and render the plane correctly
	 */
	public ArrayList<Propeller> propellers = new ArrayList<>();
	/**
	 * The positions, parent parts and recipe items of the helicopter propellers, used to calculate forces and render the plane correctly
	 */
	public ArrayList<Propeller> heliPropellers = new ArrayList<>(), heliTailPropellers = new ArrayList<>();
	
	/**
	 * Aesthetic features
	 */
	public boolean hasGear = false, hasDoor = false, hasWing = false;
	/**
	 * Default pitch for when parked. Will implement better system soon
	 */
	public float restingPitch = 0F;
	
	/**
	 * Whether the player can access the inventory while in the air
	 */
	public boolean invInflight = true;
	
	public static ArrayList<PlaneType> types = new ArrayList<>();
	
	private static HashMap<String, ParseFunc<PlaneType>> parsers = new HashMap<>();
	static
	{
		// Plane / Heli Mode
		parsers.put("Mode", (split, d) -> d.mode = EnumPlaneMode.getMode(split[1]));
		// Yaw modifiers
		parsers.put("TurnLeftSpeed", (split, d) -> d.turnLeftModifier = Float.parseFloat(split[1]));
		parsers.put("TurnRightSpeed", (split, d) -> d.turnRightModifier = Float.parseFloat(split[1]));
		// Pitch modifiers
		parsers.put("LookUpSpeed", (split, d) -> d.lookUpModifier = Float.parseFloat(split[1]));
		parsers.put("LookDownSpeed", (split, d) -> d.lookDownModifier = Float.parseFloat(split[1]));
		// Roll modifiers
		parsers.put("RollLeftSpeed", (split, d) -> d.rollLeftModifier = Float.parseFloat(split[1]));
		parsers.put("RollRightSpeed", (split, d) -> d.rollRightModifier = Float.parseFloat(split[1]));
		
		// Lift
		parsers.put("Lift", (split, d) -> d.lift = Float.parseFloat(split[1]));
		// Armaments
		parsers.put("ShootDelay", (split, d) -> d.planeShootDelay = Integer.parseInt(split[1]));
		parsers.put("BombDelay", (split, d) -> d.planeBombDelay = Integer.parseInt(split[1]));
		
		// Propellers
		parsers.put("Propeller", (split, d) -> 
		{
			Propeller propeller = new Propeller(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), EnumDriveablePart.getPart(split[5]), PartType.getPart(split[6]));
			d.propellers.add(propeller);
			d.driveableRecipe.add(new ItemStack(propeller.itemType.item));
		});
		parsers.put("HeliPropeller", (split, d) -> 
		{
			Propeller propeller = new Propeller(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), EnumDriveablePart.getPart(split[5]), PartType.getPart(split[6]));
			d.heliPropellers.add(propeller);
			d.driveableRecipe.add(new ItemStack(propeller.itemType.item));
		});
		parsers.put("HeliTailPropeller", (split, d) -> 
		{
			Propeller propeller = new Propeller(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), EnumDriveablePart.getPart(split[5]), PartType.getPart(split[6]));
			d.heliTailPropellers.add(propeller);
			d.driveableRecipe.add(new ItemStack(propeller.itemType.item));
		});
		
		// Sound
		parsers.put("PropSoundLength", (split, d) -> d.engineSoundLength = Integer.parseInt(split[1]));
		parsers.put("PropSound", (split, d) -> 
		{
			d.engineSound = split[1];
			FlansMod.proxy.loadSound(d.contentPack, "driveables", split[1]);
		});
		parsers.put("ShootSound", (split, d) -> 
		{
			d.shootSoundPrimary = split[1];
			FlansMod.proxy.loadSound(d.contentPack, "driveables", split[1]);
		});
		parsers.put("BombSound", (split, d) -> 
		{
			d.shootSoundSecondary = split[1];
			FlansMod.proxy.loadSound(d.contentPack, "driveables", split[1]);
		});
		
		// Aesthetics
		parsers.put("HasGear", (split, d) -> d.hasGear = Boolean.parseBoolean(split[1]));
		parsers.put("HasDoor", (split, d) -> d.hasDoor = Boolean.parseBoolean(split[1]));
		parsers.put("HasWing", (split, d) -> d.hasWing = Boolean.parseBoolean(split[1]));
		parsers.put("RestingPitch", (split, d) -> d.restingPitch = Float.parseFloat(split[1]));
		
		parsers.put("InflightInventory", (split, d) -> d.invInflight = Boolean.parseBoolean(split[1]));
	}
	
	

	
	@Override
	protected void read(String[] split, TypeFile file)
	{
		try
		{			
			ParseFunc parser = parsers.get(split[0]);
			if(parser != null)
			{
				parser.Parse(split, this);
			}
			else
			{
				super.read(split, file);
			}
		}
		catch(Exception ignored)
		{
		}
	}
	
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
	public int numEngines()
	{
		switch(mode)
		{
			case VTOL: return Math.max(propellers.size(), heliPropellers.size());
			case PLANE: return propellers.size();
			case HELI: return heliPropellers.size();
			default: return 1;
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
	
	/**
	 * To be overriden by subtypes for model reloading
	 */
	public void reloadModel()
	{
		model = FlansMod.proxy.loadModel(modelString, shortName, ModelPlane.class);
	}
	
	@Override
	public EntityDriveable createDriveable(World world, double x, double y, double z, DriveableData data)
	{
		return new EntityPlane(world, x, y, z, this, data);
	}
}
