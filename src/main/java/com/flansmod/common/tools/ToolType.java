package com.flansmod.common.tools;

import java.util.ArrayList;
import java.util.HashMap;

import net.minecraft.client.model.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

public class ToolType extends InfoType 
{
	public static HashMap<String, ToolType> tools = new HashMap<String, ToolType>();
	
	@SideOnly(value = Side.CLIENT)
	/** The parachute model */
	public ModelBase model;
	
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
	/** If true, then this tool will deploy a parachute upon use (and consume itself) */
	public boolean parachute = false;
	/** If true, then this will detonate the least recently placed remote explosive */
	public boolean remote = false;
	/** If > 0, then the player can eat this and recover this much hunger */
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

	/** Pack reader */
	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if(FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model"))
				model = FlansMod.proxy.loadModel(split[1], shortName, ModelBase.class);
			else if(split[0].equals("Texture"))
				texture = split[1];
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
	
	public static ToolType getType(String shortName)
	{
		return tools.get(shortName);
	}
}
