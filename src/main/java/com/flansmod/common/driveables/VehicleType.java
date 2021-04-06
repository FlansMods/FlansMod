package com.flansmod.common.driveables;

import java.util.ArrayList;
import java.util.HashMap;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.common.FlansMod;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.types.InfoType.ParseFunc;

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
	 * Aesthetic door variable
	 */
	public boolean hasDoor = false;
	
	public int trackLinkFix = 5;
	public boolean flipLinkFix = false;
	
	public static ArrayList<VehicleType> types = new ArrayList<>();
	private static HashMap<String, ParseFunc<VehicleType>> parsers = new HashMap<>();
	
	static
	{
		parsers.put("SquashMobs", (split, d) -> d.squashMobs = Boolean.parseBoolean(split[1]));
		parsers.put("FourWheelDrive", (split, d) -> d.fourWheelDrive = Boolean.parseBoolean(split[1]));
		parsers.put("Tank", (split, d) -> d.tank = Boolean.parseBoolean(split[1]));
		parsers.put("TankMode", (split, d) -> d.tank = Boolean.parseBoolean(split[1]));
		parsers.put("HasDoor", (split, d) -> d.hasDoor = Boolean.parseBoolean(split[1]));
		parsers.put("RotateWheels", (split, d) -> d.rotateWheels = Boolean.parseBoolean(split[1]));
			
		parsers.put("TurnLeftSpeed", (split, d) -> d.turnLeftModifier = Float.parseFloat(split[1]));
		parsers.put("TurnRightSpeed", (split, d) -> d.turnRightModifier = Float.parseFloat(split[1]));
		parsers.put("ShootDelay", (split, d) -> d.shootDelaySecondary = Integer.parseInt(split[1]));
		parsers.put("ShellDelay", (split, d) -> d.shootDelayPrimary = Integer.parseInt(split[1]));
		
		parsers.put("ShellSound", (split, d) -> 
		{
			d.shootSoundSecondary = split[1];
			FlansMod.proxy.loadSound(d.contentPack, "driveables", split[1]);
		});
		parsers.put("ShootSound", (split, d) -> 
		{
			d.shootSoundPrimary = split[1];
			FlansMod.proxy.loadSound(d.contentPack, "driveables", split[1]);
		});
	}
	
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
	
	/**
	 * Find the items needed to rebuild a part. The returned array is disconnected from the template items it has looked
	 * up
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
	
	/**
	 * To be overriden by subtypes for model reloading
	 */
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
