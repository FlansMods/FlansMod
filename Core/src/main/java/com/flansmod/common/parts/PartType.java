package com.flansmod.common.parts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import net.minecraft.client.model.ModelBase;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.EnumType;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

public class PartType extends InfoType
{
	/**
	 * Category
	 */
	public EnumPartCategory category;
	/**
	 * Max stack size of item
	 */
	public int stackSize;
	/**
	 * (Engine) Multiplier applied to the thrust of the driveable
	 */
	public float engineSpeed = 1.0F;
	/**
	 * (Engine) Rate at which this engine consumes fuel
	 */
	public float fuelConsumption = 1.0F;
	/**
	 * (Fuel) The amount of fuel this fuel tank gives
	 */
	public int fuel = 0;
	/**
	 * The types of driveables that this engine works with. Used to designate some engines as mecha CPUs and whatnot
	 */
	public List<EnumType> worksWith = Arrays.asList(EnumType.mecha, EnumType.plane, EnumType.vehicle);
	/**
	 * Let's just say you probably don't want to use this to power a mecha...
	 */
	public boolean isAIChip = false;
	/**
	 * If set to false, then this engine will definitely not be the default for creatively spawned vehicles
	 */
	public boolean canBeDefaultEngine = true;
	
	public ArrayList<ItemStack> partBoxRecipe = new ArrayList<ItemStack>();
	
	//------- RedstoneFlux -------
	/**
	 * If true, then this engine will draw from RedstoneFlux power source items such as power cubes. Otherwise it will draw from Flan's Mod fuel items
	 */
	public boolean useRFPower = false;
	/**
	 * The power draw rate for RF (per tick)
	 */
	public int RFDrawRate = 1;
	//-----------------------------
	
	/**
	 * The default engine (normally the first one read by the type loader) for driveables with corrupt nbt or those spawned in creative
	 */
	public static HashMap<EnumType, PartType> defaultEngines = new HashMap<EnumType, PartType>();
	/**
	 * The list of all PartTypes
	 */
	public static List<PartType> parts = new ArrayList<PartType>();
	/**
	 * Hash map sorted
	 */
	public static HashMap<EnumPartCategory, ArrayList<PartType>> partsByCategory = new HashMap<EnumPartCategory, ArrayList<PartType>>();
	
	static
	{
		for(EnumPartCategory cat : EnumPartCategory.values())
			partsByCategory.put(cat, new ArrayList<PartType>());
	}
	
	public PartType(TypeFile file)
	{
		super(file);
		parts.add(this);
	}
	
	@Override
	public void postRead(TypeFile file)
	{
		if(category == EnumPartCategory.ENGINE && !useRFPower && canBeDefaultEngine)
		{
			for(EnumType type : worksWith)
			{
				//If there is already a default engine for this type, compare and see if this one is better
				if(defaultEngines.containsKey(type))
				{
					PartType possiblyInferiorEngine = defaultEngines.get(type);
					if(isInferiorEngine(possiblyInferiorEngine))
						defaultEngines.put(type, this);
				}
				else defaultEngines.put(type, this);
			}
		}
		partsByCategory.get(category).add(this);
	}
	
	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if(split[0].equals("Category"))
				category = getCategory(split[1]);
			else if(split[0].equals("StackSize"))
				stackSize = Integer.parseInt(split[1]);
			else if(split[0].equals("EngineSpeed"))
				engineSpeed = Float.parseFloat(split[1]);
			else if(split[0].equals("FuelConsumption"))
				fuelConsumption = Float.parseFloat(split[1]);
			else if(split[0].equals("Fuel"))
				fuel = Integer.parseInt(split[1]);
				//Recipe
			else if(split[0].equals("PartBoxRecipe"))
			{
				ItemStack[] stacks = new ItemStack[(split.length - 2) / 2];
				for(int i = 0; i < (split.length - 2) / 2; i++)
				{
					int amount = Integer.parseInt(split[2 * i + 2]);
					boolean damaged = split[2 * i + 3].contains(".");
					String itemName = damaged ? split[2 * i + 3].split("\\.")[0] : split[2 * i + 3];
					int damage = damaged ? Integer.parseInt(split[2 * i + 3].split("\\.")[1]) : 0;
					stacks[i] = getRecipeElement(itemName, amount, damage, shortName);
				}
				partBoxRecipe.addAll(Arrays.asList(stacks));
			}
			else if(split[0].equals("WorksWith"))
			{
				worksWith = new ArrayList<EnumType>();
				for(int i = 0; i < split.length - 1; i++)
				{
					worksWith.add(EnumType.get(split[i + 1]));
				}
			}
			
			//------- RedstoneFlux -------
			else if(split[0].equals("UseRF") || split[0].equals("UseRFPower"))
				useRFPower = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("RFDrawRate"))
				RFDrawRate = Integer.parseInt(split[1]);
				//-----------------------------
			
			else if(split[0].equals("IsAIChip"))
				isAIChip = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("CanBeDefaultEngine"))
				canBeDefaultEngine = Boolean.parseBoolean(split[1]);
		}
		catch(Exception e)
		{
			FlansMod.log.error("Reading part file failed.");
			FlansMod.log.throwing(e);
		}
	}
	
	public boolean isInferiorEngine(PartType quitePossiblyAnInferiorEngine)
	{
		return engineSpeed > quitePossiblyAnInferiorEngine.engineSpeed;
	}
	
	public static PartType getPart(String s)
	{
		for(PartType part : parts)
		{
			if(part.shortName.equals(s))
				return part;
		}
		return null;
	}
	
	private EnumPartCategory getCategory(String s)
	{
		if(s.equals("Cockpit"))
			return EnumPartCategory.COCKPIT;
		if(s.equals("Wing"))
			return EnumPartCategory.WING;
		if(s.equals("Engine"))
			return EnumPartCategory.ENGINE;
		if(s.equals("Propeller"))
			return EnumPartCategory.PROPELLER;
		if(s.equals("Bay"))
			return EnumPartCategory.BAY;
		if(s.equals("Tail"))
			return EnumPartCategory.TAIL;
		if(s.equals("Wheel"))
			return EnumPartCategory.WHEEL;
		if(s.equals("Chassis"))
			return EnumPartCategory.CHASSIS;
		if(s.equals("Turret"))
			return EnumPartCategory.TURRET;
		if(s.equals("Fuel"))
			return EnumPartCategory.FUEL;
		if(s.equals("Misc"))
			return EnumPartCategory.MISC;
		return EnumPartCategory.MISC;
	}
	
	@Override
	protected void preRead(TypeFile file)
	{
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBase GetModel()
	{
		return null;
	}
}
