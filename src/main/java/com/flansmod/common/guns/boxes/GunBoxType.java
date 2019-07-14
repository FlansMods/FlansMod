package com.flansmod.common.guns.boxes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

public class GunBoxType extends InfoType
{
	public BlockGunBox block;
	
	public String topTexturePath;
	public String sideTexturePath;
	public String bottomTexturePath;
	@SideOnly(Side.CLIENT)
	public IIcon top;
	@SideOnly(Side.CLIENT)
	public IIcon side;
	@SideOnly(Side.CLIENT)
	public IIcon bottom;
	public int nextGun = -1;

	public GunBoxEntry[] gunEntries;
	public List<GunPage> gunPages = new ArrayList<GunPage>();
	public GunPage currentPage;

	/** Custom GUI variables. Use an unsigned hex code for colors.*/
	public String guiTexturePath;
	public String gunBoxTextColor = "404040";
	public String itemListTextColor = "404040";
	public String itemTextColor= "404040";
	public String pageTextColor = "FFFFFF";
	public String buttonTextColor = "FFFFFF";
	public String buttonTextHoverColor = "FFFFA0";

	private static int lastIconIndex = 2;
	public static HashMap<String, GunBoxType> gunBoxMap = new HashMap<String, GunBoxType>();
	
	public GunBoxType(TypeFile file)
	{
		super(file);
	}
	
	@Override
	public void preRead(TypeFile file)
	{
		gunEntries = new GunBoxEntry[8];
		currentPage = new GunPage("default");
	}
	
	@Override
	public void postRead(TypeFile file)
	{
		//Add any remaining gun entries to the pagelist if EOF.
		currentPage.addGunList(Arrays.copyOf(gunEntries, nextGun + 1));
		gunPages.add(currentPage);

		gunBoxMap.put(this.shortName, this);
	}

	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if (split[0].equals("TopTexture"))
				topTexturePath = split[1];
			if (split[0].equals("BottomTexture"))
				bottomTexturePath = split[1];
			if (split[0].equals("SideTexture"))
				sideTexturePath = split[1];
			if (split[0].equals("Page") || split[0].equals("SetPage"))
			{
				//If empty, rename the page. If not, add the current page to list and start next one.
				String[] pageNameArray = Arrays.copyOfRange(split, 1, split.length);
				String pageName = "";
				for(int i = 0; i < pageNameArray.length; i++)
				{
				    pageName += pageNameArray[i];
				    if((i + 1) < pageNameArray.length)
				    {
				        pageName += " ";
				    }
				}
				if(gunEntries[0] != null)
				{
					currentPage.addGunList(Arrays.copyOf(gunEntries, nextGun + 1));
					iteratePage(pageName);
				}
				else
				{
					currentPage.setPageName(pageName);
				}

			}
			if (split[0].equals("AddGun"))
			{
				nextGun++;
				if(nextGun > gunEntries.length - 1)
				{
					currentPage.addGunList(Arrays.copyOf(gunEntries, nextGun));
					iteratePage("default " + (gunPages.size() + 2));
					nextGun++;
				}
				gunEntries[nextGun] = new GunBoxEntry(InfoType.getType(split[1]), getRecipe(split));
			}
			if (split[0].equals("AddAmmo") || split[0].equals("AddAltAmmo") || split[0].equals("AddAlternateAmmo"))
				gunEntries[nextGun].addAmmoEntry(new GunBoxEntry(InfoType.getType(split[1]), getRecipe(split)));

			//GunBox gui customisation
			if(split[0].equals("GuiTexture"))
				guiTexturePath = split[1];
			if(split[0].equals("GunBoxNameColor"))
				gunBoxTextColor = split[1];
			if(split[0].equals("PageTextColor"))
				pageTextColor = split[1];
			if(split[0].equals("ListTextColor"))
				itemListTextColor = split[1];
			if(split[0].equals("ItemTextColor"))
				itemTextColor = split[1];
			if(split[0].equals("ButtonTextColor"))
				buttonTextColor = split[1];
			if(split[0].equals("ButtonTextHighlight"))
				buttonTextHoverColor = split[1];

		}
		catch (Exception e)
		{
			FlansMod.log("Reading gun box file failed : " + shortName);
			e.printStackTrace();
		}
	}

	public void iteratePage(String s)
	{
		//Add current to the pages and setup a new current
		gunPages.add(currentPage);
		gunEntries = new GunBoxEntry[8];
		nextGun = -1;
		currentPage = new GunPage(s);
	}

	public static GunBoxType getBox(String s)
	{
		return gunBoxMap.get(s);
	}
	
	public static GunBoxType getBox(Block block)
	{
		for(GunBoxType type : gunBoxMap.values())
		{
			if(type.block == block)
				return type;
		}
		return null;
	}

	//Gunbox Entry method
	public List<ItemStack> getRecipe(String[] split)
	{
		List<ItemStack> recipe = new ArrayList<ItemStack>();

		for (int i = 0; i < (split.length - 2) / 2; i++)
		{
			if (split[i * 2 + 3].contains("."))
				recipe.add(getRecipeElement(split[i * 2 + 3].split("\\.")[0], Integer.parseInt(split[i * 2 + 2]), Integer.valueOf(split[i * 2 + 3].split("\\.")[1]), shortName));
			else
				recipe.add(getRecipeElement(split[i * 2 + 3], Integer.parseInt(split[i * 2 + 2]), 0, shortName));
		}

		return recipe;
	}
	
	/** Reimported from old code */
	@Override
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
					// Split ID with . and if it contains a second part, use it
					// as damage value.
					if (recipeLine[i * 2 + 2].contains("."))
						recipe[i * 2 + rows + 1] = getRecipeElement(recipeLine[i * 2 + 2].split("\\.")[0], Integer.valueOf(recipeLine[i * 2 + 2].split("\\.")[1]));
					else
						recipe[i * 2 + rows + 1] = getRecipeElement(recipeLine[i * 2 + 2], 0);
				}
				GameRegistry.addRecipe(new ItemStack(block, recipeOutput, 0), recipe);
			}
			else
			{
				recipe = new Object[recipeLine.length - 1];
				for (int i = 0; i < (recipeLine.length - 1); i++)
				{
					if (recipeLine[i + 1].contains("."))
						recipe[i] = getRecipeElement(recipeLine[i + 1].split("\\.")[0], Integer.valueOf(recipeLine[i + 1].split("\\.")[1]));
					else
						recipe[i] = getRecipeElement(recipeLine[i + 1], 0);
				}
				GameRegistry.addShapelessRecipe(new ItemStack(block, recipeOutput, 0), recipe);
			}
		}
		catch (Exception e)
		{
			if(recipe!=null)
			{
				String msg = " : ";
				for(Object o : recipe) msg = msg + " " + o;
				FlansMod.log("Failed to add recipe for : " + shortName + msg);
			}
			else
			{
				FlansMod.log("Failed to add recipe for : " + shortName);
			}
			if(FlansMod.printStackTrace)
			{
				e.printStackTrace();
			}
		}
	}

	@Override
	public float GetRecommendedScale() 
	{
		return 50.0f;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBase GetModel() 
	{
		return null;
	}
}