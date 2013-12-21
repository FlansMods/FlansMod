package co.uk.flansmods.common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import co.uk.flansmods.common.driveables.EnumDriveablePart;

import net.minecraft.item.ItemStack;

public class PartType extends InfoType {
	/** Category (TODO : Replace with Enum) */
	public int category;
	/** Max stack size of item */
	public int stackSize;
	/** (Engine) Multiplier applied to the thrust of the driveable */
	public float engineSpeed = 1.0F;
	/** (Engine) Rate at which this engine consumes fuel */
	public float fuelConsumption = 1.0F;
	/** (Fuel) The amount of fuel this fuel tank gives */
	public int fuel = 0;
	/** The types of driveables that this engine works with. Used to designate some engines as mecha CPUs and whatnot */
	public List<EnumType> worksWith = Arrays.asList(EnumType.mecha, EnumType.plane, EnumType.vehicle);
	
	public ArrayList<ItemStack> partBoxRecipe = new ArrayList<ItemStack>();

	/** The default engine (normally the first one read by the type loader) for driveables with corrupt nbt or those spawned in creative  */
	public static HashMap<EnumType, PartType> defaultEngines = new HashMap<EnumType, PartType>();
	/** The list of all PartTypes */
	public static List<PartType> parts = new ArrayList<PartType>();

	public PartType(TypeFile file) {
		super(file);
		parts.add(this);
	}

	@Override
	protected void read(TypeFile file) 
	{
		super.read(file);
		if (category == 2)
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
	}

	@Override
	protected void read(String[] split, TypeFile file) 
	{
		super.read(split, file);
		try 
		{
			if (split[0].equals("Category"))
				category = getCategory(split[1]);
			if (split[0].equals("StackSize"))
				stackSize = Integer.parseInt(split[1]);
			if (split[0].equals("EngineSpeed"))
				engineSpeed = Float.parseFloat(split[1]);
			if (split[0].equals("FuelConsumption"))
				fuelConsumption = Float.parseFloat(split[1]);
			if (split[0].equals("Fuel"))
				fuel = Integer.parseInt(split[1]);
			//Recipe
			if(split[0].equals("PartBoxRecipe"))
			{
				ItemStack[] stacks = new ItemStack[(split.length - 2) / 2];
				for(int i = 0; i < (split.length - 2) / 2; i++)
				{
					int amount = Integer.parseInt(split[2 * i + 2]);
					boolean damaged = split[2 * i + 3].contains(".");
					String itemName = damaged ? split[2 * i + 3].split("\\.")[0] : split[2 * i + 3];
					int damage = damaged ? Integer.parseInt(split[2 * i + 3].split("\\.")[1]) : 0;
					stacks[i] = getRecipeElement(itemName, amount, damage);
				}
				partBoxRecipe.addAll(Arrays.asList(stacks));
			}
			if(split[0].equals("WorksWith"))
			{
				worksWith = new ArrayList<EnumType>();
				for(int i = 0; i < split.length - 1; i++)
				{
					worksWith.add(EnumType.get(split[i + 1]));
				}
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Reading part file failed.");
			e.printStackTrace();
		}
	}
	
	public boolean isInferiorEngine(PartType quitePossiblyAnInferiorEngine)
	{
		return engineSpeed > quitePossiblyAnInferiorEngine.engineSpeed;
	}

	public static PartType getPart(String s) {
		for (PartType part : parts) {
			if (part.shortName.equals(s))
				return part;
		}
		return null;
	}

	private int getCategory(String s) {
		if (s.equals("Cockpit"))
			return 0;
		if (s.equals("Wing"))
			return 1;
		if (s.equals("Engine"))
			return 2;
		if (s.equals("Propeller"))
			return 3;
		if (s.equals("Bay"))
			return 4;
		if (s.equals("Tail"))
			return 5;
		if (s.equals("Wheel"))
			return 6;
		if (s.equals("Chassis"))
			return 7;
		if (s.equals("Turret"))
			return 8;
		if (s.equals("Fuel"))
			return 9;
		if (s.equals("Misc"))
			return 10;
		return 10;
	}
}