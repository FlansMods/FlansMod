package com.flansmod.common.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.Paintjob;

public class InfoType
{
	/** infoTypes */
	public static HashMap<Integer, InfoType> infoTypes = new HashMap<Integer, InfoType>();

	public String contentPack;
	public Item item;
	public int colour = 0xffffff;
	public String iconPath;
	public Object[] recipe;
	public String[] recipeLine;
	public int recipeOutput = 1;
	public boolean shapeless;
	public String smeltableFrom = null;
	public String name;
	public String shortName;
	public String texture;
	public String modelString = null;
	public String description;
	public float modelScale = 1F;
	/** If this is set to false, then this item cannot be dropped */
	public boolean canDrop = true;
	
	/** The probability that this item will appear in a dungeon chest. 
	 *  Scaled so that each chest is likely to have a fixed number of Flan's Mod items.
	 *  Must be greater than or equal to 0, and should probably not exceed 100 */
	public int dungeonChance = 1;
	
	private static Random random = new Random();
	
	/** Used for scaling */
	public static int totalDungeonChance = 0;
	
	public InfoType(TypeFile file)
	{
		contentPack = file.contentPack;
	}
	
	public void read(TypeFile file)
	{
		preRead(file);
		for(;;)
		{
			String line = null;
			line = file.readLine();
			if(line == null)
				break;
			if(line.startsWith("//"))
				continue;
			String[] split = line.split(" ");
			if(split.length < 2)
				continue;
			read(split, file);
		}
		postRead(file);

		infoTypes.put(shortName.hashCode(), this);
		totalDungeonChance += dungeonChance;
	}
	
	/** Method for performing actions prior to reading the type file */
	protected void preRead(TypeFile file) {}
	
	/** Method for performing actions after reading the type file */
	protected void postRead(TypeFile file) {}
	
	@SideOnly(Side.CLIENT)
	public ModelBase GetModel() { return null; }

	/** Pack reader */
	protected void read(String[] split, TypeFile file)
	{
		try
		{
			// Standard line reads
			shortName = Read(split, "ShortName", shortName);
			name = ReadAndConcatenateMultipleStrings(split, "Name", name);
			description = ReadAndConcatenateMultipleStrings(split, "Description", description);
			
			modelString = Read(split, "Model", modelString);
			modelScale = Read(split, "ModelScale", modelScale);
			texture = Read(split, "Texture", texture);
			
			iconPath = Read(split, "Icon", iconPath);

			dungeonChance = Read(split, "DungeonProbability", dungeonChance);
			dungeonChance = Read(split, "DungeonLootChance", dungeonChance);
			
			recipeOutput = Read(split, "RecipeOutput", recipeOutput);
			
			smeltableFrom = Read(split, "SmeltableFrom", smeltableFrom);
			canDrop = Read(split, "CanDrop", canDrop);

			// More complicated line reads
			if (split[0].equals("Colour") || split[0].equals("Color"))
			{
				colour = (Integer.parseInt(split[1]) << 16) + ((Integer.parseInt(split[2])) << 8) + ((Integer.parseInt(split[3])));
			}
			
			if (split[0].equals("Recipe"))
			{
				recipe = new Object[split.length + 2];
				for (int i = 0; i < 3; i++)
				{
					String line = null;
					line = file.readLine();
					if (line == null)
					{
						continue;
					}
					if (line == null || line.startsWith("//"))
					{
						i--;
						continue;
					}
					recipe[i] = line;
				}
				recipeLine = split;
				shapeless = false;
			}
			else if (split[0].equals("ShapelessRecipe"))
			{
				recipeLine = split;
				shapeless = true;
			}
		} 
		catch (Exception e)
		{
			FlansMod.log("Reading file failed : " + shortName);
			e.printStackTrace();
		}
	}
	
	/** -------------------------------------------------------------------------------------------------------- */
	/** HELPER FUNCTIONS FOR READING. Should give better debug output                                            */
	/** -------------------------------------------------------------------------------------------------------- */
	protected boolean KeyMatches(String[] split, String key)
	{
		return split != null && split.length > 1 && key != null && split[0].toLowerCase().equals(key.toLowerCase());
	}
	
	protected int Read(String[] split, String key, int currentValue)
	{
		if(KeyMatches(split, key))
		{
			if(split.length == 2)
			{
				try
				{
					currentValue = Integer.parseInt(split[1]);
				}
				catch (Exception e)
				{
					InfoType.LogError(shortName, "Incorrect format for " + key + ". Passed in value is not an integer");
				}
			}
			else
			{
				InfoType.LogError(shortName, "Incorrect format for " + key + ". Should be \"" + key + " <integer value>\"");
			}
		}
		
		return currentValue;
	}
	
	protected float Read(String[] split, String key, float currentValue)
	{
		if(KeyMatches(split, key))
		{
			if(split.length == 2)
			{
				try
				{
					currentValue = Float.parseFloat(split[1]);
				}
				catch (Exception e)
				{
					InfoType.LogError(shortName, "Incorrect format for " + key + ". Passed in value is not an float");
				}
			}
			else
			{
				InfoType.LogError(shortName, "Incorrect format for " + key + ". Should be \"" + key + " <float value>\"");
			}
		}
		
		return currentValue;
	}
	
	protected double Read(String[] split, String key, double currentValue)
	{
		if(KeyMatches(split, key))
		{
			if(split.length == 2)
			{
				try
				{
					currentValue = Double.parseDouble(split[1]);
				}
				catch (Exception e)
				{
					InfoType.LogError(shortName, "Incorrect format for " + key + ". Passed in value is not an float");
				}
			}
			else
			{
				InfoType.LogError(shortName, "Incorrect format for " + key + ". Should be \"" + key + " <float value>\"");
			}
		}
		
		return currentValue;
	}
	
	protected String Read(String[] split, String key, String currentValue)
	{
		if(KeyMatches(split, key))
		{
			if(split.length == 2)
			{
				currentValue = split[1];
			}
			else
			{
				InfoType.LogError(shortName, "Incorrect format for " + key + ". Should be \"" + key + " <singleWord>\"");
			}
		}
		
		return currentValue;
	}
	
	protected String ReadAndConcatenateMultipleStrings(String[] split, String key, String currentValue)
	{
		if(KeyMatches(split, key))
		{
			if(split.length > 1)
			{
				currentValue = split[1];
				for (int i = 0; i < split.length - 2; i++)
				{
					currentValue = currentValue + " " + split[i + 2];
				}
			}
			else
			{
				InfoType.LogError(shortName, "Incorrect format for " + key + ". Should be \"" + key + " <long string>\"");
			}
		}
		
		return currentValue;
	}
	
	protected boolean Read(String[] split, String key, boolean currentValue)
	{
		if(KeyMatches(split, key))
		{
			if(split.length == 2)
			{
				try
				{
					currentValue = Boolean.parseBoolean(split[1]);
				}
				catch (Exception e)
				{
					InfoType.LogError(shortName, "Incorrect format for " + key + ". Passed in value is not an boolean");
				}
			}
			else
			{
				InfoType.LogError(shortName, "Incorrect format for " + key + ". Should be \"" + key + " <true/false>\"");
			}
		}
		
		return currentValue;
	}
	/** -------------------------------------------------------------------------------------------------------- */
	/**                                                                                                          */
	/** -------------------------------------------------------------------------------------------------------- */
	
	protected static void LogError(String shortName, String s)
	{
		FlansMod.log("[Problem in " + shortName + ".txt]" + s);
	}
	
	@Override
	public String toString()
	{
		return super.getClass().getSimpleName() + ": " + shortName;
	}

	public void addRecipe()
	{
		this.addRecipe(getItem());
	}

	/** Reimported from old code */
	public void addRecipe(Item par1Item)
	{
		if (smeltableFrom != null)
		{
			GameRegistry.addSmelting(getRecipeElement(smeltableFrom, 0), new ItemStack(item), 0.0F);
		}
		if (recipeLine == null)
			return;
		try
		{
			if (!shapeless)
			{
				// Fix oversized recipes
				int rows = 3;
				// First column
				if (((String) recipe[0]).charAt(0) == ' ' && ((String) recipe[1]).charAt(0) == ' ' && ((String) recipe[2]).charAt(0) == ' ')
				{
					for (int i = 0; i < 3; i++)
						recipe[i] = ((String) recipe[i]).substring(1);
					// New first column
					if (((String) recipe[0]).charAt(0) == ' ' && ((String) recipe[1]).charAt(0) == ' ' && ((String) recipe[2]).charAt(0) == ' ')
					{
						for (int i = 0; i < 3; i++)
							recipe[i] = ((String) recipe[i]).substring(1);
					}
				}
				// Last column
				int last = ((String) recipe[0]).length() - 1;
				if (((String) recipe[0]).charAt(last) == ' ' && ((String) recipe[1]).charAt(last) == ' ' && ((String) recipe[2]).charAt(last) == ' ')
				{
					for (int i = 0; i < 3; i++)
						recipe[i] = ((String) recipe[i]).substring(0, last);
					// New last column
					last--;
					if (((String) recipe[0]).charAt(last) == ' ' && ((String) recipe[1]).charAt(last) == ' ' && ((String) recipe[2]).charAt(last) == ' ')
					{
						for (int i = 0; i < 3; i++)
							recipe[i] = ((String) recipe[i]).substring(0, 0);
					}
				}
				// Top row
				if (recipe[0].equals(" ") || recipe[0].equals("  ") || recipe[0].equals("   "))
				{
					Object[] newRecipe = new Object[recipe.length - 1];
					newRecipe[0] = recipe[1];
					newRecipe[1] = recipe[2];
					recipe = newRecipe;
					rows--;
					// Next top row
					if (recipe[0].equals(" ") || recipe[0].equals("  ") || recipe[0].equals("   "))
					{
						Object[] newRecipe1 = new Object[recipe.length - 1];
						newRecipe1[0] = recipe[1];
						recipe = newRecipe1;
						rows--;
					}
				}
				// Bottom row
				if (recipe[rows - 1].equals(" ") || recipe[rows - 1].equals("  ") || recipe[rows - 1].equals("   "))
				{
					Object[] newRecipe = new Object[recipe.length - 1];
					newRecipe[0] = recipe[0];
					newRecipe[1] = recipe[1];
					recipe = newRecipe;
					rows--;
					// Next bottom row
					if (recipe[rows - 1].equals(" ") || recipe[rows - 1].equals("  ") || recipe[rows - 1].equals("   "))
					{
						Object[] newRecipe1 = new Object[recipe.length - 1];
						newRecipe1[0] = recipe[0];
						recipe = newRecipe1;
						rows--;
					}
				}
				for (int i = 0; i < (recipeLine.length - 1) / 2; i++)
				{
					recipe[i * 2 + rows] = recipeLine[i * 2 + 1].charAt(0);
					recipe[i * 2 + rows + 1] = getRecipeElement(recipeLine[i * 2 + 2]);
				}
				GameRegistry.addRecipe(new ItemStack(item, recipeOutput), recipe);
			} else
			{
				recipe = new Object[recipeLine.length - 1];
				for (int i = 0; i < (recipeLine.length - 1); i++)
				{
					recipe[i] = getRecipeElement(recipeLine[i + 1]);
				}
				GameRegistry.addShapelessRecipe(new ItemStack(item, recipeOutput), recipe);
			}
		} catch (Exception e)
		{
			FlansMod.log("Failed to add recipe for : " + shortName);
			e.printStackTrace();
		}
	}
	
	/** Return a dye damage value from a string name */
	protected int getDyeDamageValue(String dyeName)
	{
		int damage = -1;
		for(int i = 0; i < EnumDyeColor.values().length; i++)
		{
			if(EnumDyeColor.byDyeDamage(i).getUnlocalizedName().equals(dyeName))
				damage = i;
		}
		if(damage == -1)
			FlansMod.log("Failed to find dye colour : " + dyeName + " while adding " + contentPack);
		
		return damage;
	}

	public Item getItem()
	{
		return item;
	}
	
	public static ItemStack getNonRecipeElement(String str)
	{					
		// Split ID with . and if it contains a second part, use it
		// as damage value.
		if (str.contains("."))
			return getRecipeElement(str.split("\\.")[0], Integer.valueOf(str.split("\\.")[1]));
		else
			return getRecipeElement(str, 0);
	}
	
	public static ItemStack getRecipeElement(String str)
	{					
		// Split ID with . and if it contains a second part, use it
		// as damage value.
		if (str.contains("."))
			return getRecipeElement(str.split("\\.")[0], Integer.valueOf(str.split("\\.")[1]));
		else
			return getRecipeElement(str, 32767);
	}
	
	public static ItemStack getRecipeElement(String s, int damage)
	{
		return getRecipeElement(s, 1, damage);
	}
	
	public static ItemStack getRecipeElement(String s, int amount, int damage)
	{
		return getRecipeElement(s, amount, damage, "nothing");
	}
	
	public static ItemStack getRecipeElement(String s, int amount, int damage, String requester)
	{
		if (s.equals("doorIron"))
		{
			return new ItemStack(Items.iron_door, amount);
		}
		if (s.equals("clayItem"))
		{
			return new ItemStack(Items.clay_ball, amount);
		}
		for(Object object : Item.itemRegistry)
		{
			Item item = (Item)object;
			if (item != null && item.getUnlocalizedName() != null && (item.getUnlocalizedName().equals("item." + s) || item.getUnlocalizedName().equals("tile." + s)))
			{
				return new ItemStack(item, amount, damage);
			}
		}
		for(InfoType type : infoTypes.values())
		{
			if(type.shortName.equals(s))
				return new ItemStack(type.item, amount, damage);
		}
		if (s.equals("gunpowder"))
		{
			return new ItemStack(Items.gunpowder, amount);
		}
		if (s.equals("iron"))
		{
			return new ItemStack(Items.iron_ingot, amount);
		}
		FlansMod.log("Could not find " + s + " when adding recipe for " + requester);
		return null;
	}
	
	/** To be overriden by subtypes for model reloading */
	public void reloadModel()
	{
		
	}
	
	@Override
	public int hashCode()
	{
		return shortName.hashCode();
	}
	
	public static InfoType getType(String s)
	{
		return infoTypes.get(s.hashCode());
	}
	
	public static InfoType getType(int hash)
	{
		return infoTypes.get(hash);
	}

	public void onWorldLoad(World world) 
	{
		
	}

	public static InfoType getType(ItemStack itemStack) 
	{
		if(itemStack == null)
			return null;
		Item item = itemStack.getItem();
		if(item instanceof IFlanItem)
			return ((IFlanItem)item).getInfoType();
		return null;
	}
	
	public static PotionEffect getPotionEffect(String[] split)
	{
		int potionID = Integer.parseInt(split[1]);
		int duration = Integer.parseInt(split[2]);
		int amplifier = Integer.parseInt(split[3]);
		return new PotionEffect(potionID, duration, amplifier, false, false);
	}
	
	public static Material getMaterial(String mat)
	{
		return Material.ground;
	}

	public void addDungeonLoot() 
	{
		if(dungeonChance > 0)
		{
			ItemStack stack = new ItemStack(this.item);
			addToRandomChest(stack, (float)(FlansMod.dungeonLootChance * dungeonChance) / (float)totalDungeonChance);
		}
	}
	
	protected void addToRandomChest(ItemStack stack, float rawChance)
	{
		if(rawChance >= 1 || random.nextFloat() < rawChance)
		{
			int chance = MathHelper.ceiling_float_int(rawChance);
			switch(random.nextInt(10))
			{
			case 0 : ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new WeightedRandomChestContent(new ItemStack(this.item), 1, 1, chance)); break;
			case 1 : ChestGenHooks.addItem(ChestGenHooks.MINESHAFT_CORRIDOR, new WeightedRandomChestContent(new ItemStack(this.item), 1, 1, chance)); break;
			case 2 : ChestGenHooks.addItem(ChestGenHooks.PYRAMID_DESERT_CHEST, new WeightedRandomChestContent(new ItemStack(this.item), 1, 1, chance)); break;
			case 3 : ChestGenHooks.addItem(ChestGenHooks.PYRAMID_JUNGLE_CHEST, new WeightedRandomChestContent(new ItemStack(this.item), 1, 1, chance)); break;
			case 4 : ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_CORRIDOR, new WeightedRandomChestContent(new ItemStack(this.item), 1, 1, chance)); break;
			case 5 : ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_LIBRARY, new WeightedRandomChestContent(new ItemStack(this.item), 1, 1, chance)); break;
			case 6 : ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_CROSSING, new WeightedRandomChestContent(new ItemStack(this.item), 1, 1, chance)); break;
			case 7 : ChestGenHooks.addItem(ChestGenHooks.VILLAGE_BLACKSMITH, new WeightedRandomChestContent(new ItemStack(this.item), 1, 1, chance)); break;
			case 8 : ChestGenHooks.addItem(ChestGenHooks.BONUS_CHEST, new WeightedRandomChestContent(new ItemStack(this.item), 1, 1, chance)); break;
			case 9 : ChestGenHooks.addItem(ChestGenHooks.NETHER_FORTRESS, new WeightedRandomChestContent(new ItemStack(this.item), 1, 1, chance)); break;
			}
		}
	}
}
