package com.flansmod.common.types;

import java.util.HashMap;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootEntry;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.RandomValueRange;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

import com.flansmod.common.FlansMod;

public class InfoType
{
	/**
	 * infoTypes
	 */
	public static HashMap<Integer, InfoType> infoTypes = new HashMap<>();
	
	public final String contentPack;
	public Item item;
	public int colour = 0xffffff;
	public String[] recipeLine;
	public char[][] recipeGrid = new char[3][3];
	public int recipeOutput = 1;
	public boolean shapeless;
	public String smeltableFrom = null;
	public String modelString = null;
	public String name = "";
	public String shortName = "";
	public String texture = "";
	public String description = "";
	public String iconPath = "";
	public float modelScale = 1F;
	/**
	 * If this is set to false, then this item cannot be dropped
	 */
	public boolean canDrop = true;
	
	public int hash = 0;
	
	/**
	 * The probability that this item will appear in a dungeon chest.
	 * Scaled so that each chest is likely to have a fixed number of Flan's Mod items.
	 * Must be greater than or equal to 0, and should probably not exceed 100
	 */
	public int dungeonChance = 1;
	
	public static Random random = new Random();
	
	/**
	 * Used for scaling
	 */
	public static int totalDungeonChance = 0;
	
	public InfoType(TypeFile file)
	{
		contentPack = file.contentPack;
	}
	
	public void read(TypeFile file)
	{
		preRead(file);
		for(; ; )
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
		
		hash = file.hashCode();
		infoTypes.put(shortName.hashCode(), this);
		totalDungeonChance += dungeonChance;
	}
	
	/**
	 * Method for performing actions prior to reading the type file
	 */
	protected void preRead(TypeFile file)
	{
	}
	
	/**
	 * Method for performing actions after reading the type file
	 */
	protected void postRead(TypeFile file)
	{
		// Check that recommended values were set
		if(shortName.isEmpty())
		{
			FlansMod.log.warn("ShortName not set: " + file.name);
		}
		if(name.isEmpty())
		{
			FlansMod.log.warn("Name not set: " + file.name);
		}
	}
	
	@SideOnly(Side.CLIENT)
	public ModelBase GetModel()
	{
		return null;
	}
	
	/**
	 * Pack reader
	 */
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
			if(split[0].equals("Colour") || split[0].equals("Color"))
			{
				colour = (Integer.parseInt(split[1]) << 16) + ((Integer.parseInt(split[2])) << 8) + ((Integer.parseInt(split[3])));
			}
			
			if(split[0].equals("Recipe"))
			{
				for(int i = 0; i < 3; i++)
				{
					String line = null;
					line = file.readLine();
					if(line == null)
					{
						continue;
					}
					if(line.startsWith("//"))
					{
						i--;
						continue;
					}
					
					if(line.length() > 3)
						FlansMod.log.warn("Looks like a bad recipe in " + shortName + ". Double check whether '"
								+ line + "' is supposed to be part of the recipe");
					
					for(int j = 0; j < 3; j++)
					{
						recipeGrid[i][j] = j < line.length() ? line.charAt(j) : ' ';
					}
				}
				recipeLine = split;
				shapeless = false;
			}
			else if(split[0].equals("ShapelessRecipe"))
			{
				recipeLine = split;
				shapeless = true;
			}
		}
		catch(Exception e)
		{
			FlansMod.log.error("Reading file failed : " + shortName);
			FlansMod.log.throwing(e);
		}
	}
	
	/** -------------------------------------------------------------------------------------------------------- */
	/** HELPER FUNCTIONS FOR READING. Should give better debug output                                            */
	/**
	 * --------------------------------------------------------------------------------------------------------
	 */
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
				catch(Exception e)
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
				catch(Exception e)
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
				catch(Exception e)
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
				for(int i = 0; i < split.length - 2; i++)
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
				catch(Exception e)
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
	/**
	 * --------------------------------------------------------------------------------------------------------
	 */
	
	protected static void LogError(String shortName, String s)
	{
		FlansMod.log.error("[Problem in " + shortName + ".txt]" + s);
	}
	
	@Override
	public String toString()
	{
		return super.getClass().getSimpleName() + ": " + shortName;
	}
	
	public void registerItem(IForgeRegistry<Item> registry)
	{
		if(item != null)
			registry.register(item);
	}
	
	public void registerBlock(IForgeRegistry<Block> registry)
	{
		
	}
	
	public void addRecipe(IForgeRegistry<IRecipe> registry)
	{
		this.addRecipe(registry, getItem());
	}
	
	/**
	 * Reimported from old code
	 */
	public void addRecipe(IForgeRegistry<IRecipe> registry, Item par1Item)
	{
		if(smeltableFrom != null)
		{
			GameRegistry.addSmelting(getRecipeElement(smeltableFrom, 0), new ItemStack(item), 0.0F);
		}
		if(recipeLine == null)
			return;
		try
		{
			if(!shapeless)
			{
				// Find the smallest bounding grid
				int minX = 3, minY = 3, maxX = -1, maxY = -1;
				
				for(int i = 0; i < 3; i++)
				{
					for(int j = 0; j < 3; j++)
					{
						if(recipeGrid[i][j] != ' ')
						{
							// This is a valid element. Adjust bounds accordingly
							if(i < minX)
								minX = i;
							if(i > maxX)
								maxX = i;
							if(j < minY)
								minY = j;
							if(j > maxY)
								maxY = j;
						}
					}
				}
				
				// Make the recipe square
				if(maxX != maxY)
				{
					maxX = maxY = Math.max(maxX, maxY);
				}
				if(minX != minY)
				{
					minX = minY = Math.min(minX, minY);
				}
				
				if((minX == 3 && maxX == -1) || (minY == 3 && maxY == -1))
				{
					FlansMod.log.warn("Invalid recipe grid in " + shortName);
					return;
				}
				
				int width = maxX - minX + 1;
				int height = maxY - minY + 1;
				
				// Make a menu of ingredients from the main recipe line
				HashMap<Character, ItemStack> menu = new HashMap<>();
				for(int i = 0; i < (recipeLine.length - 1) / 2; i++)
				{
					char c = recipeLine[i * 2 + 1].charAt(0);
					ItemStack stack = getRecipeElement(recipeLine[i * 2 + 2]);
					
					menu.put(c, stack);
				}
				
				// Now pick off the menu and fill out the list
				NonNullList<Ingredient> ingredients = NonNullList.create();
				for(int i = 0; i < width; i++)
				{
					for(int j = 0; j < height; j++)
					{
						char c = recipeGrid[minX + i][minY + j];
						if(c == ' ')
						{
							ingredients.add(Ingredient.fromStacks(ItemStack.EMPTY.copy()));
						}
						else
						{
							ItemStack stack = menu.get(c);
							if(stack == null || stack.isEmpty())
							{
								FlansMod.log.warn("Failed to find " + c + " in recipe for " + shortName);
								// This recipe is BORK. Kill it
								return;
							}
							ingredients.add(Ingredient.fromStacks(stack.copy()));
						}
					}
				}
				// And finally hand all that over to the registry
				registry.register(new ShapedRecipes("FlansMod", width, height, ingredients, new ItemStack(item, recipeOutput)).setRegistryName(name + "_shaped"));
			}
			else
			{
				NonNullList<Ingredient> ingredients = NonNullList.create();
				for(int i = 0; i < (recipeLine.length - 1); i++)
				{
					ingredients.add(Ingredient.fromStacks(getRecipeElement(recipeLine[i + 1])));
				}
				
				registry.register(new ShapelessRecipes("FlansMod", new ItemStack(item, recipeOutput), ingredients).setRegistryName(name + "_shapeless"));
			}
		}
		catch(Exception e)
		{
			FlansMod.log.error("Failed to add recipe for : " + shortName);
			FlansMod.log.throwing(e);
		}
	}
	
	/**
	 * Return a dye damage value from a string name
	 */
	protected int getDyeDamageValue(String dyeName)
	{
		int damage = -1;
		for(int i = 0; i < EnumDyeColor.values().length; i++)
		{
			if(EnumDyeColor.byDyeDamage(i).getTranslationKey().equals(dyeName))
				damage = i;
		}
		if(damage == -1)
			FlansMod.log.warn("Failed to find dye colour : " + dyeName + " while adding " + contentPack);
		
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
		if(str.contains("."))
			return getRecipeElement(str.split("\\.")[0], Integer.valueOf(str.split("\\.")[1]));
		else
			return getRecipeElement(str, 0);
	}
	
	public static ItemStack getRecipeElement(String str)
	{
		// Split ID with . and if it contains a second part, use it
		// as damage value.
		if(str.contains("."))
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
		return getRecipeElement(s, amount, damage, "unknown");
	}
	
	public static ItemStack getRecipeElement(String s, int amount, int damage, String requester)
	{
		if(s.equals("doorIron"))
		{
			return new ItemStack(Items.IRON_DOOR, amount);
		}
		else if(s.equals("clayItem"))
		{
			return new ItemStack(Items.CLAY_BALL, amount);
		}
		else if(s.equals("gunpowder"))
		{
			return new ItemStack(Items.GUNPOWDER, amount);
		}
		else if(s.equals("iron"))
		{
			return new ItemStack(Items.IRON_INGOT, amount);
		}
		else if(s.equals("boat"))
		{
			return new ItemStack(Items.BOAT, amount);
		}
		for(Item item : Item.REGISTRY)
		{
			if(item != null && (item.getTranslationKey().equals("item." + s) || item.getTranslationKey().equals("tile." + s)))
			{
				return new ItemStack(item, amount, damage);
			}
		}
		for(InfoType type : infoTypes.values())
		{
			if(type.shortName.equals(s))
				return new ItemStack(type.item, amount, damage);
		}
		
		
		FlansMod.log.warn("Could not find " + s + " when adding recipe for " + requester);
		return ItemStack.EMPTY.copy();
	}
	
	/**
	 * To be overriden by subtypes for model reloading
	 */
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
		if(itemStack == null || itemStack.isEmpty())
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
		return new PotionEffect(Potion.getPotionById(potionID), duration, amplifier, false, false);
	}
	
	public static Material getMaterial(String mat)
	{
		return Material.GROUND;
	}
	
	public void addLoot(LootTableLoadEvent event)
	{
		if(dungeonChance > 0)
		{
			LootPool pool = event.getTable().getPool("FlansMod");
			if(pool == null)
			{
				pool = new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1, 1), new RandomValueRange(1, 1), "FlansMod");
				event.getTable().addPool(pool);
			}
			
			LootEntry entry = new LootEntryItem(item, FlansMod.dungeonLootChance * dungeonChance, 1, new LootFunction[0], new LootCondition[0], shortName);
			
			if(pool != null)
			{
				pool.addEntry(entry);
			}
		}
	}
	
	
}
