package com.flansmod.common.driveables.mechas;

import java.util.ArrayList;

import net.minecraft.client.model.ModelBase;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.client.model.ModelMechaTool;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

public class MechaItemType extends InfoType
{
	public static ArrayList<MechaItemType> types = new ArrayList<>();
	
	/**
	 * The type of item
	 */
	public EnumMechaItemType type;
	/**
	 * If this is a tool, then what type of tool is this? Axe? Pick?
	 */
	public EnumMechaToolType function = EnumMechaToolType.sword;
	/**
	 * How quickly this tool works
	 */
	public float speed = 1F;
	/**
	 * The maximum block hardness you can break with this tool
	 */
	public float toolHardness = 1F;
	/**
	 * This is multiplied by the mecha reach to calculate the total reach
	 */
	public float reach = 1F;
	/**
	 * This makes the mecha float towards the surface when underwater, because apparently people prefer limited functionality
	 */
	public boolean floater = false;
	/**
	 * This allows an upgrade to affect the mecha's move speed
	 */
	public float speedMultiplier = 1F;
	/**
	 * This allows upgrades to reduce incoming damage
	 */
	public float damageResistance = 0F;
	/**
	 * This allows a sound to be played upon use (RocketPack only for the moment)
	 */
	public String soundEffect = "";
	public String detectSound = "";
	public float soundTime = 0;
	public int energyShield = 0;
	public int lightLevel = 0;
	/**
	 * The following are a ton of upgrade flags and modifiers. The mecha will iterate over all upgrades in its
	 * inventory multiplying multipliers and looking for true booleans in order to decide if things should happen
	 * or what certain values should take
	 */
	public boolean stopMechaFallDamage = false, forceBlockFallDamage = false, vacuumItems = false, refineIron = false, autoCoal = false, autoRepair = false, rocketPack = false, diamondDetect = false, infiniteAmmo = false, forceDark = false, wasteCompact = false, flameBurst = false;
	
	/**
	 * The drop rate of these items are multiplied by this float. They stack between items too.
	 * Once dropRate has been calculated, each block then gives floor(dropRate) items with a
	 * dropRate - floor(dropRate) chance of getting one more
	 */
	public float fortuneDiamond = 1F, fortuneRedstone = 1F, fortuneCoal = 1F, fortuneEmerald = 1F, fortuneIron = 1F;
	
	/**
	 * The power of any attached jet pack is multiplied by this float
	 */
	public float rocketPower = 1F;
	
	/**
	 * The model
	 */
	@SideOnly(Side.CLIENT)
	public ModelMechaTool model;
	
	public MechaItemType(TypeFile file)
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
			if(FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model"))
				model = FlansMod.proxy.loadModel(split[1], shortName, ModelMechaTool.class);
			if(split[0].equals("Type"))
				type = EnumMechaItemType.getToolType(split[1]);
			if(split[0].equals("ToolType"))
				function = EnumMechaToolType.getToolType(split[1]);
			if(split[0].equals("Speed"))
				speed = Float.parseFloat(split[1]);
			if(split[0].equals("ToolHardness"))
				toolHardness = Float.parseFloat(split[1]);
			if(split[0].equals("Reach"))
				reach = Float.parseFloat(split[1]);
			
			/** The following are the upgrade booleans and multipliers, which
			 *  are alphabetised. Mess with the order at your peril*/
			
			if(split[0].equals("AutoFuel"))
				autoCoal = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("Armour"))
				damageResistance = Float.parseFloat(split[1]);
			if(split[0].equals("CoalMultiplier"))
				fortuneCoal = Float.parseFloat(split[1]);
			if(split[0].equals("DetectSound"))
			{
				detectSound = split[1];
				FlansMod.proxy.loadSound(contentPack, shortName, split[1]);
			}
			if(split[0].equals("DiamondDetect"))
				diamondDetect = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("DiamondMultiplier"))
				fortuneDiamond = Float.parseFloat(split[1]);
			if(split[0].equals("EmeraldMultiplier"))
				fortuneEmerald = Float.parseFloat(split[1]);
			if(split[0].equals("FlameBurst"))
				flameBurst = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("Floatation"))
				floater = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("ForceBlockFallDamage"))
				forceBlockFallDamage = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("ForceDark"))
				forceDark = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("InfiniteAmmo"))
				infiniteAmmo = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("IronMultiplier"))
				fortuneIron = Float.parseFloat(split[1]);
			if(split[0].equals("IronRefine"))
				refineIron = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("ItemVacuum"))
				vacuumItems = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("LightLevel"))
				lightLevel = Integer.parseInt(split[1]);
			if(split[0].equals("Nanorepair"))
				autoRepair = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("RedstoneMultiplier"))
				fortuneRedstone = Float.parseFloat(split[1]);
			if(split[0].equals("RocketPack"))
				rocketPack = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("RocketPower"))
				rocketPower = Float.parseFloat(split[1]);
			if(split[0].equals("SoundEffect"))
				soundEffect = split[1];
			if(split[0].equals("SoundTime"))
				soundTime = Float.parseFloat(split[1]);
			if(split[0].equals("SpeedMultiplier"))
				speedMultiplier = Float.parseFloat(split[1]);
			if(split[0].equals("StopMechaFallDamage"))
				stopMechaFallDamage = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("WasteCompact"))
				wasteCompact = Boolean.parseBoolean(split[1].toLowerCase());
		}
		catch(Exception ignored)
		{
		}
	}
	
	public static MechaItemType getTool(String find)
	{
		for(MechaItemType type : types)
		{
			if(type.shortName.equals(find))
				return type;
		}
		return null;
	}
	
	public void reloadModel()
	{
		if(modelString != null)
			model = FlansMod.proxy.loadModel(modelString, shortName, ModelMechaTool.class);
	}
	
	@Override
	protected void preRead(TypeFile file)
	{
	}
	
	@Override
	protected void postRead(TypeFile file)
	{
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBase GetModel()
	{
		return model;
	}
	
}
