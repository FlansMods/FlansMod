package com.flansmod.common.types;

import java.util.HashMap;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBase;
import net.minecraft.init.Blocks;
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
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.OreIngredient;
import net.minecraftforge.registries.IForgeRegistry;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveableType;

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
	
	public interface ParseFunc<T extends InfoType>
	{
		void Parse(String[] split, T d);
	}
	
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
			GameRegistry.addSmelting(getRecipeElement(smeltableFrom, 1, 0), new ItemStack(item), 0.0F);
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
				HashMap<Character, Ingredient> menu = new HashMap<>();
				for(int i = 0; i < (recipeLine.length - 1) / 2; i++)
				{
					char c = recipeLine[i * 2 + 1].charAt(0);
					Ingredient stack = getRecipeIngredient(recipeLine[i * 2 + 2]);
					
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
							ingredients.add(Ingredient.EMPTY);
						}
						else
						{
							Ingredient stack = menu.get(c);
							if(stack == null)
							{
								FlansMod.log.warn("Failed to find " + c + " in recipe for " + shortName);
								// This recipe is BORK. Kill it
								return;
							}
							ingredients.add(stack); 
						}
					}
				}
				// And finally hand all that over to the registry
				registry.register(new ShapedRecipes("FlansMod", width, height, ingredients, new ItemStack(item, recipeOutput)).setRegistryName(shortName + "_shaped"));
			}
			else
			{
				NonNullList<Ingredient> ingredients = NonNullList.create();
				for(int i = 0; i < (recipeLine.length - 1); i++)
				{
					ingredients.add(getRecipeIngredient(recipeLine[i + 1]));
				}
				
				registry.register(new ShapelessRecipes("FlansMod", new ItemStack(item, recipeOutput), ingredients).setRegistryName(shortName + "_shapeless"));
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
			
	public static ItemStack getRecipeElement(String str)
	{
		String[] split = str.split("\\.");
		if(split.length == 0)
			return ItemStack.EMPTY;
		
		String id = split[0];
		int damage = split.length > 1 ? Short.parseShort(split[1]) : Short.MAX_VALUE;
		int amount = 1;
		
		return getRecipeElement(id, amount, damage);
	}
	
	public static Ingredient getRecipeIngredient(String str)
	{
		String[] split = str.split("\\.");
		if(split.length == 0)
			return Ingredient.EMPTY;
		
		String id = split[0];
		int damage = split.length > 1 ? Short.parseShort(split[1]) : Short.MAX_VALUE;
		int amount = 1;
		
		return getRecipeIngredient(id, amount, damage);
	}
	
	public static Ingredient getRecipeIngredient(String id, int amount, int damage)
	{
		// Legacy cases
		switch(id)
		{
			case "doorIron": return Ingredient.fromItem(Items.IRON_DOOR);
			case "clayItem": return Ingredient.fromItem(Items.CLAY_BALL);
			case "iron_trapdoor": return Ingredient.fromItem(Item.getItemFromBlock(Blocks.IRON_TRAPDOOR));
			case "trapdoor": return Ingredient.fromItem(Item.getItemFromBlock(Blocks.TRAPDOOR));
			case "gunpowder": return Ingredient.fromItem(Items.GUNPOWDER);
			case "ingotIron":
			case "iron": return Ingredient.fromItem(Items.IRON_INGOT);
			case "boat": return Ingredient.fromItem(Items.BOAT);
		}
		
		// Special ingredients, allows for steel with iron fallback etc.
		if(SPECIAL_INGREDIENTS.containsKey(id))
		{
			return SPECIAL_INGREDIENTS.get(id);
		}
		
		return Ingredient.fromStacks(getRecipeElement(id, amount, damage));
	}
	
	public static ItemStack getRecipeElement(String id, int amount, int damage)
	{
		// Do a handful of special cases, mostly legacy recipes
		switch(id)
		{
			case "doorIron": return new ItemStack(Items.IRON_DOOR, amount);
			case "clayItem": return new ItemStack(Items.CLAY_BALL, amount);
			case "iron_trapdoor": return new ItemStack(Blocks.IRON_TRAPDOOR, amount);
			case "trapdoor": return new ItemStack(Blocks.TRAPDOOR, amount);
			case "gunpowder": return new ItemStack(Items.GUNPOWDER, amount);
			case "ingotIron":
			case "iron": return new ItemStack(Items.IRON_INGOT, amount);
			case "boat": return new ItemStack(Items.BOAT, amount);
		}
		
		// Now try a modern "modid:itemid" style lookup
		// No modid, try a search with "minecraft:"
		{
			String modPrefixName = id;
			if(!modPrefixName.contains(":"))
				modPrefixName = "minecraft:" + modPrefixName;
	
			Item item = Item.getByNameOrId(modPrefixName);
			if(item != null)
				return new ItemStack(item, amount, damage);
		}
		
		// Then fallback to the original way we used to do it, for legacy packs
		for(InfoType type : infoTypes.values())
		{
			if(type.shortName.equals(id))
				return new ItemStack(type.item, amount, damage);
		}
		
		// OreIngredients, just pick an ingot
		if(SPECIAL_INGREDIENTS.containsKey(id))
		{
			Ingredient ing = SPECIAL_INGREDIENTS.get(id);
			if(ing.getMatchingStacks().length > 0)
				return ing.getMatchingStacks()[0];
		}

		for(Item item : Item.REGISTRY)
		{
			if(item != null && (item.getTranslationKey().equals("item." + id) || item.getTranslationKey().equals("tile." + id)))
			{
				// Turned off console spam for this case. It's legacy, but there's so much of it now that this is pretty standard in official packs
				return new ItemStack(item, amount, damage); 
			}
		}
		
		FlansMod.log.warn("Could not find " + id + " in recipe");		
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
	
	//public void onWorldLoad(World world)
	//{
	//	
	//}
	
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
	
	private static HashMap<String, Ingredient> SPECIAL_INGREDIENTS = new HashMap<String, Ingredient>();
	public static void InitializeSpecialIngredients()
	{
		// Steel ingot - fallback is iron
		AddOreDictEntry("nuggetSteel", Ingredient.fromItem(Items.IRON_NUGGET));
		AddOreDictEntry("ingotSteel", Ingredient.fromItem(Items.IRON_INGOT));
		AddOreDictEntry("blockSteel", Ingredient.fromItems(Item.getItemFromBlock(Blocks.IRON_BLOCK)));
		// Nickel with fallback iron
		AddOreDictEntry("nuggetNickel", Ingredient.fromItem(Items.IRON_NUGGET));
		AddOreDictEntry("ingotNickel", Ingredient.fromItem(Items.IRON_INGOT));
		AddOreDictEntry("blockNickel", Ingredient.fromItems(Item.getItemFromBlock(Blocks.IRON_BLOCK)));
		// Lead with fallback iron
		AddOreDictEntry("nuggetLead", Ingredient.fromItem(Items.IRON_NUGGET));
		AddOreDictEntry("ingotLead", Ingredient.fromItem(Items.IRON_INGOT));
		AddOreDictEntry("blockLead", Ingredient.fromItems(Item.getItemFromBlock(Blocks.IRON_BLOCK)));
		// Copper with fallback iron
		AddOreDictEntry("nuggetCopper", Ingredient.fromItem(Items.IRON_NUGGET));
		AddOreDictEntry("ingotCopper", Ingredient.fromItem(Items.IRON_INGOT));
		AddOreDictEntry("blockCopper", Ingredient.fromItems(Item.getItemFromBlock(Blocks.IRON_BLOCK)));
		// Tin with fallback iron
		AddOreDictEntry("nuggetTin", Ingredient.fromItem(Items.IRON_NUGGET));
		AddOreDictEntry("ingotTin", Ingredient.fromItem(Items.IRON_INGOT));
		AddOreDictEntry("blockTin", Ingredient.fromItems(Item.getItemFromBlock(Blocks.IRON_BLOCK)));
		
		// Electrum with fallback gold
		AddOreDictEntry("nuggetElectrum", Ingredient.fromItem(Items.GOLD_NUGGET));
		AddOreDictEntry("ingotElectrum", Ingredient.fromItem(Items.GOLD_INGOT));
		AddOreDictEntry("blockElectrum", Ingredient.fromItems(Item.getItemFromBlock(Blocks.GOLD_BLOCK)));
		// Constantan with fallback gold
		AddOreDictEntry("nuggetConstantan", Ingredient.fromItem(Items.GOLD_NUGGET));
		AddOreDictEntry("ingotConstantan", Ingredient.fromItem(Items.GOLD_INGOT));
		AddOreDictEntry("blockConstantan", Ingredient.fromItems(Item.getItemFromBlock(Blocks.GOLD_BLOCK)));
		// Silver with fallback gold
		AddOreDictEntry("nuggetSilver", Ingredient.fromItem(Items.GOLD_NUGGET));
		AddOreDictEntry("ingotSilver", Ingredient.fromItem(Items.GOLD_INGOT));
		AddOreDictEntry("blockSilver", Ingredient.fromItems(Item.getItemFromBlock(Blocks.GOLD_BLOCK)));
		// Bronze with fallback gold
		AddOreDictEntry("nuggetBronze", Ingredient.fromItem(Items.GOLD_NUGGET));
		AddOreDictEntry("ingotBronze", Ingredient.fromItem(Items.GOLD_INGOT));
		AddOreDictEntry("blockBronze", Ingredient.fromItems(Item.getItemFromBlock(Blocks.GOLD_BLOCK)));

		// IE lookups
		AddModEntry("treatedPlanks", "immersiveengineering:treated_wood",  Ingredient.fromItems(Item.getItemFromBlock(Blocks.PLANKS)));
	}
	
	private static void AddModEntry(String name, String resLoc, Ingredient fallback)
	{
		Item item = Item.getByNameOrId(resLoc);
		if(item != null)
			SPECIAL_INGREDIENTS.put(name, Ingredient.fromItem(item));
		else
			SPECIAL_INGREDIENTS.put(name, fallback);
	}
	
	private static void AddOreDictEntry(String name, Ingredient fallback)
	{
		if(OreDictionary.doesOreNameExist(name))
			SPECIAL_INGREDIENTS.put(name, new OreIngredient(name));
		else
			SPECIAL_INGREDIENTS.put(name, fallback);
	}
}
