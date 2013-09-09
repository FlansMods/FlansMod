package co.uk.flansmods.common;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import co.uk.flansmods.common.guns.AAGunType;
import co.uk.flansmods.common.guns.BulletType;
import co.uk.flansmods.common.guns.GunType;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class GunBoxType extends InfoType
{
	public int blockID;
	public Material material = Material.iron;
	public String topTexturePath;
	public String sideTexturePath;
	public String bottomTexturePath;
	@SideOnly(Side.CLIENT)
	public Icon top;
	@SideOnly(Side.CLIENT)
	public Icon side;
	@SideOnly(Side.CLIENT)
	public Icon bottom;
	//Unique to this box. Used to determine its damage value.
	public int gunBoxID;
	public int numGuns;
	public int nextGun = -1;
	public InfoType[] guns;
	public BulletType[] bullets;
	public BulletType[] altBullets;
	public List<ItemStack>[] gunParts;
	public List<ItemStack>[] bulletParts;
	public List<ItemStack>[] altBulletParts;
	private static int lastIconIndex = 2;
	public static HashMap<String, GunBoxType> gunBoxMap = new HashMap<String, GunBoxType>();
	public static ArrayList<String> shortNameList = new ArrayList<String>(); 
	//Give each box a default ID upon construction and then override it by reading from the text file later.
	//This way unconverted content packs will still work in SP at least
	public static int nextDefaultID;

	public GunBoxType(TypeFile file)
	{
		super(file);
		//Make sure NumGuns is read before anything else
		for(String line : file.lines)
		{
			if(line == null)
				break;
			if(line.startsWith("//"))
				continue;
			String[] split = line.split(" ");
			if(split.length < 2)
				continue;
			
			if (split[0].equals("NumGuns"))
			{
				numGuns = Integer.parseInt(split[1]);
				guns = new InfoType[numGuns];
				bullets = new BulletType[numGuns];
				altBullets = new BulletType[numGuns];
				gunParts = new List[numGuns];
				bulletParts = new List[numGuns];
				altBulletParts = new List[numGuns];
				for (int i = 0; i < numGuns; i++)
				{
					gunParts[i] = new ArrayList<ItemStack>();
					bulletParts[i] = new ArrayList<ItemStack>();
					altBulletParts[i] = new ArrayList<ItemStack>();
				}
			}
		}
	}
	
	@Override
	protected void read(TypeFile file)
	{
		super.read(file);
		if(gunBoxID == 0)
			gunBoxID = nextDefaultID++;		
		gunBoxMap.put(this.shortName, this);
		shortNameList.add(this.shortName);
	}

	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{		
			if (split[0].equals("Material"))
				material = getMaterial(split[1]);
			if (split[0].equals("TopTexture"))
				topTexturePath = split[1];
			if (split[0].equals("BottomTexture"))
				bottomTexturePath = split[1];
			if (split[0].equals("SideTexture"))
				sideTexturePath = split[1];
			if (split[0].equals("GunBoxID") || split[0].equals("BlockID"))
				gunBoxID = Integer.parseInt(split[1]);
			if (split[0].equals("AddGun"))
			{
				nextGun++;
				if (gunParts[nextGun] == null)
					FlansMod.log("NumGuns was not found or was incorrect");
				
				guns[nextGun] = InfoType.getType(split[1]);
				for (int i = 0; i < (split.length - 2) / 2; i++)
				{
					if (split[i * 2 + 3].contains("."))
						gunParts[nextGun].add(getRecipeElement(split[i * 2 + 3].split("\\.")[0], Integer.parseInt(split[i * 2 + 2]), Integer.valueOf(split[i * 2 + 3].split("\\.")[1])));
					else
						gunParts[nextGun].add(getRecipeElement(split[i * 2 + 3], Integer.parseInt(split[i * 2 + 2]), 0));
				}
				
			}
			if (split[0].equals("AddAmmo"))
			{
				if (bulletParts[nextGun] == null)
					FlansMod.log("NumGuns was not found or was incorrect");
				bullets[nextGun] = BulletType.getBullet(split[1]);
				for (int i = 0; i < (split.length - 2) / 2; i++)
				{
					if (split[i * 2 + 3].contains("."))
						bulletParts[nextGun].add(getRecipeElement(split[i * 2 + 3].split("\\.")[0], Integer.parseInt(split[i * 2 + 2]), Integer.valueOf(split[i * 2 + 3].split("\\.")[1])));
					else
						bulletParts[nextGun].add(getRecipeElement(split[i * 2 + 3], Integer.parseInt(split[i * 2 + 2]), 0));
				}
			}
			if (split[0].equals("AddAltAmmo") || split[0].equals("AddAlternateAmmo"))
			{
				if (altBulletParts[nextGun] == null)
					FlansMod.log("NumGuns was not found or was incorrect");
				altBullets[nextGun] = BulletType.getBullet(split[1]);
				for (int i = 0; i < (split.length - 2) / 2; i++)
				{
					if (split[i * 2 + 3].contains("."))
						altBulletParts[nextGun].add(getRecipeElement(split[i * 2 + 3].split("\\.")[0], Integer.parseInt(split[i * 2 + 2]), Integer.valueOf(split[i * 2 + 3].split("\\.")[1])));
					else
						altBulletParts[nextGun].add(getRecipeElement(split[i * 2 + 3], Integer.parseInt(split[i * 2 + 2]), 0));
				}
			}
		} catch (Exception e)
		{
			System.out.println("Reading gun box file failed : " + shortName);
			e.printStackTrace();
		}
	}

	public static GunBoxType getBox(String s)
	{
		return gunBoxMap.get(s);
	}
	
	public static GunBoxType getBox(int ID)
	{
		for(GunBoxType type : gunBoxMap.values())
		{
			if(type.gunBoxID == ID)
				return type;
		}
		return null;
	}

	// TODO: remove. material will One and ONLY!  wood.
	public static Material getMaterial(String mat)
	{
		if (mat.equals("wood"))
			return Material.wood;
		if (mat.equals("rock") || mat.equals("stone"))
			return Material.rock;
		if (mat.equals("iron"))
			return Material.iron;
		if (mat.equals("cloth"))
			return Material.cloth;
		return Material.iron;
	}

	public static ItemStack getRecipeElement(String stringy, int amount, int damage)
	{
		ItemStack stack = getRecipeElement(stringy, damage);
		if (stack == null)
			return stack;
		stack.stackSize = amount;
		return stack;
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
				GameRegistry.addRecipe(new ItemStack(FlansMod.gunBoxBlock, recipeOutput, gunBoxID), recipe);
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
				GameRegistry.addShapelessRecipe(new ItemStack(FlansMod.gunBoxBlock, recipeOutput, gunBoxID), recipe);
			}
		} catch (Exception e)
		{
			FlansMod.log("Failed to add recipe for : " + shortName);
			e.printStackTrace();
		}
	}
}