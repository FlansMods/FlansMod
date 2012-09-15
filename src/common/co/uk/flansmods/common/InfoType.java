package co.uk.flansmods.common;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

public class InfoType
{
	/** infoTypes */
	public static List<InfoType> infoTypes = new ArrayList<InfoType>();

	public String contentPack;
	public Item item;
	public int colour = 0xffffff;
	public int itemID;
	public String iconPath;
	public int iconIndex;
	public Object[] recipe;
	public String[] recipeLine;
	public int recipeOutput = 1;
	public boolean shapeless;
	public String smeltableFrom = null;
	public String name;
	public String shortName;

	public InfoType()
	{
		infoTypes.add(this);
	}

	public InfoType(String pack)
	{
		this();
		contentPack = pack;
	}

	/** Pack reader */
	protected void read(String[] arg0, BufferedReader file)
	{
		try
		{
			if (arg0[0].equals("Name"))
			{
				name = arg0[1];
				for (int i = 0; i < arg0.length - 2; i++)
				{
					name = name + " " + arg0[i + 2];
				}
			}
			if (arg0[0].equals("ShortName"))
			{
				shortName = arg0[1];
			}
			if (arg0[0].equals("Colour"))
			{
				colour = (Integer.parseInt(arg0[1])) + ((Integer.parseInt(arg0[2])) << 8) + ((Integer.parseInt(arg0[3])) << 16);
			}
			if (arg0[0].equals("ItemID"))
			{
				itemID = Integer.parseInt(arg0[1]);
			}
			if (arg0[0].equals("Icon"))
			{
				iconPath = "/icons/" + arg0[1] + ".png";
			}
			if (arg0[0].equals("RecipeOutput"))
			{
				recipeOutput = Integer.parseInt(arg0[1]);
			}
			if (arg0[0].equals("Recipe"))
			{
				recipe = new Object[arg0.length + 2];
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
				recipeLine = arg0;
				shapeless = false;
			}
			if (arg0[0].equals("ShapelessRecipe"))
			{
				recipeLine = arg0;
				shapeless = true;
			}
			if (arg0[0].equals("SmeltableFrom"))
			{
				smeltableFrom = arg0[1];
			}
		} catch (Exception e)
		{
			FlansMod.log("Reading file failed : " + shortName);
			e.printStackTrace();
		}
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
			GameRegistry.addSmelting(getRecipeElement(smeltableFrom, 0).itemID, new ItemStack(item), 0.0F);
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
					// Split ID with . and if it contains a second part, use it
					// as damage value.
					if (recipeLine[i * 2 + 2].contains("."))
						recipe[i * 2 + rows + 1] = getRecipeElement(recipeLine[i * 2 + 2].split("\\.")[0], Integer.valueOf(recipeLine[i * 2 + 2].split("\\.")[1]));
					else
						recipe[i * 2 + rows + 1] = getRecipeElement(recipeLine[i * 2 + 2], 0);
				}
				GameRegistry.addRecipe(new ItemStack(item, recipeOutput), recipe);
			} else
			{
				recipe = new Object[recipeLine.length - 1];
				for (int i = 0; i < (recipeLine.length - 1); i++)
				{
					if (recipeLine[i + 1].contains("."))
						recipe[i] = getRecipeElement(recipeLine[i + 1].split("\\.")[0], Integer.valueOf(recipeLine[i + 1].split("\\.")[1]));
					else
						recipe[i] = getRecipeElement(recipeLine[i + 1], 0);
				}
				GameRegistry.addShapelessRecipe(new ItemStack(item, recipeOutput), recipe);
			}
		} catch (Exception e)
		{
			FlansMod.log("Failed to add recipe for : " + shortName);
			e.printStackTrace();
		}
	}

	public Item getItem()
	{
		return item;
	}

	public static ItemStack getRecipeElement(String arg0, int damage)
	{
		if (arg0.equals("doorIron"))
		{
			return new ItemStack(Item.doorSteel, 1);
		}
		if (arg0.equals("doorWood"))
		{
			return new ItemStack(Item.doorWood, 1);
		}
		if (arg0.equals("clayItem"))
		{
			return new ItemStack(Item.clay, 1);
		}
		for (Item item : Item.itemsList)
		{
			if (item != null && item.getItemName() != null && item.getItemName().split("\\.")[1].equals(arg0))
			{
				return new ItemStack(item, 1, damage);
			}
		}
		if (arg0.equals("gunpowder"))
		{
			return new ItemStack(Item.gunpowder, 1);
		}
		if (arg0.equals("iron"))
		{
			return new ItemStack(Item.ingotIron, 1);
		}
		FlansMod.log("Could not find " + arg0 + " when adding recipe");
		return null;
	}
}
