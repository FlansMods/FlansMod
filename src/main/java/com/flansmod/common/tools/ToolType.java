package com.flansmod.common.tools;

import java.util.ArrayList;
import java.util.HashMap;

import net.minecraft.client.model.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

public class ToolType extends InfoType
{
	public static HashMap<String, ToolType> tools = new HashMap<>();
	
	@SideOnly(value = Side.CLIENT)
	/** The parachute model */
	public ModelBase model;
	
	/**
	 * Boolean switches that decide whether the tool should heal players and / or driveables
	 */
	public boolean healPlayers = false, healDriveables = false;
	/**
	 * The amount to heal per use (one use per click)
	 */
	public int healAmount = 0;
	/**
	 * The amount of uses the tool has. 0 means infinite
	 */
	public int toolLife = 0;
	/**
	 * If true, the tool will destroy itself when finished. Disable this for rechargeable tools
	 */
	public boolean destroyOnEmpty = true;
	/**
	 * The items required to be added (shapelessly) to recharge the tool
	 */
	public ArrayList<ItemStack> rechargeRecipe = new ArrayList<>();
	/**
	 * Not yet implemented. For making tools chargeable with IC2 EU
	 */
	public int EUPerCharge = 0;
	/**
	 * If true, then this tool will deploy a parachute upon use (and consume itself)
	 */
	public boolean parachute = false;
	/**
	 * If true, then this will detonate the least recently placed remote explosive
	 */
	public boolean remote = false;
	/**
	 * If > 0, then the player can eat this and recover this much hunger
	 */
	public int foodness = 0;
	
	public ToolType(TypeFile file)
	{
		super(file);
	}
	
	@Override
	protected void postRead(TypeFile file)
	{
		tools.put(shortName, this);
	}
	
	/**
	 * Pack reader
	 */
	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if(FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model"))
				model = FlansMod.proxy.loadModel(split[1], shortName, ModelBase.class);
			else if(split[0].equals("Parachute"))
				parachute = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("ExplosiveRemote"))
				remote = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("Heal") || split[0].equals("HealPlayers"))
				healPlayers = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("Repair") || split[0].equals("RepairVehicles"))
				healDriveables = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("HealAmount") || split[0].equals("RepairAmount"))
				healAmount = Integer.parseInt(split[1]);
			else if(split[0].equals("ToolLife") || split[0].equals("ToolUses"))
				toolLife = Integer.parseInt(split[1]);
			else if(split[0].equals("EUPerCharge"))
				EUPerCharge = Integer.parseInt(split[1]);
			else if(split[0].equals("RechargeRecipe"))
			{
				for(int i = 0; i < (split.length - 1) / 2; i++)
				{
					int amount = Integer.parseInt(split[2 * i + 1]);
					boolean damaged = split[2 * i + 2].contains(".");
					String itemName = damaged ? split[2 * i + 2].split("\\.")[0] : split[2 * i + 2];
					int damage = damaged ? Integer.parseInt(split[2 * i + 2].split("\\.")[1]) : 0;
					rechargeRecipe.add(getRecipeElement(itemName, amount, damage, shortName));
				}
			}
			else if(split[0].equals("DestroyOnEmpty"))
				destroyOnEmpty = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("Food") || split[0].equals("Foodness"))
				foodness = Integer.parseInt(split[1]);
		}
		catch(Exception e)
		{
			FlansMod.log.error("Reading file failed : " + shortName);
			FlansMod.log.throwing(e);
		}
	}
	
	@Override
	public void addRecipe(IForgeRegistry<IRecipe> registry, Item item)
	{
		super.addRecipe(registry, item);
		//Add the recharge recipe if there is one
		if(rechargeRecipe.size() < 1)
			return;
		rechargeRecipe.add(new ItemStack(item, 1, toolLife));
		
		NonNullList<Ingredient> ingredients = NonNullList.create();
		for(ItemStack stack : rechargeRecipe)
		{
			ingredients.add(Ingredient.fromStacks(stack));
		}
		registry.register(new ShapelessRecipes("FlansMod", new ItemStack(item, 1, 0), ingredients).setRegistryName(name + "_recharge"));
	}
	
	public static ToolType getType(String shortName)
	{
		return tools.get(shortName);
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
