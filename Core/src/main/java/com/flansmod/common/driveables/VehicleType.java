package com.flansmod.common.driveables;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.common.FlansMod;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.TypeFile;

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
	 * Shoot delays
	 */
	public int vehicleShootDelay, vehicleShellDelay;
	/**
	 * Aesthetic door variable
	 */
	public boolean hasDoor = false;
	
	public static ArrayList<VehicleType> types = new ArrayList<>();
	
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
		super.read(split, file);
		try
		{
			//Movement modifiers
			if(split[0].equals("TurnLeftSpeed"))
				turnLeftModifier = Float.parseFloat(split[1]);
			if(split[0].equals("TurnRightSpeed"))
				turnRightModifier = Float.parseFloat(split[1]);
			if(split[0].equals("SquashMobs"))
				squashMobs = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("FourWheelDrive"))
				fourWheelDrive = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("Tank") || split[0].equals("TankMode"))
				tank = Boolean.parseBoolean(split[1].toLowerCase());
			
			//Visuals
			if(split[0].equals("HasDoor"))
				hasDoor = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("RotateWheels"))
				rotateWheels = Boolean.parseBoolean(split[1].toLowerCase());
			
			//Armaments
			if(split[0].equals("ShootDelay"))
				vehicleShootDelay = Integer.parseInt(split[1]);
			if(split[0].equals("ShellDelay"))
				vehicleShellDelay = Integer.parseInt(split[1]);
			
			//Sound
			if(split[0].equals("ShootSound"))
			{
				shootSoundPrimary = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			if(split[0].equals("ShellSound"))
			{
				shootSoundSecondary = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
		}
		catch(Exception ignored)
		{
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
