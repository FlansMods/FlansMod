package co.uk.flansmods.common;

import java.util.ArrayList;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ToolType extends InfoType 
{
	public static ArrayList<ToolType> tools = new ArrayList<ToolType>();
	
	/** Boolean switches that decide whether the tool should heal players and / or driveables */
	public boolean healPlayers = false, healDriveables = false;
	/** The amount to heal per use (one use per click) */
	public int healAmount = 0;
	/** The amount of uses the tool has. 0 means infinite */
	public int toolLife = 0;
	/** If true, the tool will destroy itself when finished. Disable this for rechargeable tools */
	public boolean destroyOnEmpty = true;
	/** The items required to be added (shapelessly) to recharge the tool */
	public ArrayList<ItemStack> rechargeRecipe = new ArrayList<ItemStack>();
	/** Not yet implemented. For making tools chargeable with IC2 EU */
	public int EUPerCharge = 0;
	
	public ToolType(TypeFile file) 
	{
		super(file);
		tools.add(this);
	}

	/** Pack reader */
	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if(split[0].equals("Heal") || split[0].equals("HealPlayers"))
				healPlayers = Boolean.parseBoolean(split[1]);
			if(split[0].equals("Repair") || split[0].equals("RepairVehicles"))
				healDriveables = Boolean.parseBoolean(split[1]);
			if(split[0].equals("HealAmount") || split[0].equals("RepairAmount"))
				healAmount = Integer.parseInt(split[1]);
			if(split[0].equals("ToolLife") || split[0].equals("ToolUses"))
				toolLife = Integer.parseInt(split[1]);
			if(split[0].equals("EUPerCharge"))
				EUPerCharge = Integer.parseInt(split[1]);
			if(split[0].equals("RechargeRecipe"))
			{
				for(int i = 0; i < (split.length - 2) / 2; i++)
				{
					int amount = Integer.parseInt(split[2 * i + 2]);
					boolean damaged = split[2 * i + 3].contains(".");
					String itemName = damaged ? split[2 * i + 3].split("\\.")[0] : split[2 * i + 3];
					int damage = damaged ? Integer.parseInt(split[2 * i + 3].split("\\.")[1]) : 0;
					rechargeRecipe.add(getRecipeElement(itemName, amount, damage));
				}
			}
			if(split[0].equals("DestroyOnEmpty"))
				destroyOnEmpty = Boolean.parseBoolean(split[1]);
		} 
		catch (Exception e)
		{
			FlansMod.log("Reading file failed : " + shortName);
			e.printStackTrace();
		}
	}
	
	@Override
	public void addRecipe(Item item)
	{
		super.addRecipe(item);
		//Add the recharge recipe if there is one
		if(rechargeRecipe.size() < 1)
			return;
		rechargeRecipe.add(new ItemStack(item, 1, toolLife));
		GameRegistry.addShapelessRecipe(new ItemStack(item, 1, 0), rechargeRecipe.toArray());
	}
}
