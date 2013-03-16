package co.uk.flansmods.common.teams;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.InfoType;

public class PlayerClass 
{
	public static List<PlayerClass> classes = new ArrayList<PlayerClass>();
	
	public String name;
	public String shortName;
	public List<ItemStack> startingItems = new ArrayList<ItemStack>();
	
	public PlayerClass(BufferedReader file, String pack)
	{
		do
		{
			String line = null;
			try
			{
				line = file.readLine();
			} catch (Exception e)
			{
				break;
			}
			if (line == null)
			{
				break;
			}
			if (line.startsWith("//"))
				continue;
			String[] split = line.split(" ");
			if (split.length < 2)
				continue;
			read(split, file);
		} while (true);
		classes.add(this);
	}
	
	protected void read(String[] split, BufferedReader file)
	{
		try
		{
			if (split[0].equals("Name"))
			{
				name = split[1];
				for (int i = 0; i < split.length - 2; i++)
				{
					name = name + " " + split[i + 2];
				}
			}
			if (split[0].equals("ShortName"))
			{
				shortName = split[1];
			}			
			if (split[0].equals("AddItem"))
			{
				Item matchingItem = null;
				int amount = 1;
				int damage = 0;
				for(Item item : Item.itemsList)
				{
					if(item != null && item.getUnlocalizedName() != null && (item.getUnlocalizedName().equals(split[1]) || (item.getUnlocalizedName().split("\\.").length > 1 && item.getUnlocalizedName().split("\\.")[1].equals(split[1]))))
						matchingItem = item;
				}
				for(InfoType type : InfoType.infoTypes)
				{
					if(type.shortName.equals(split[1]))
						matchingItem = type.item;
				}
				if(matchingItem == null)
				{
					FlansMod.log("Tried to add " + split[1] + " to player class " + shortName + " but the item did not exist");
					return;
				}
				if(split.length > 2)
				{
					amount = Integer.parseInt(split[2]);
				}				
				if(split.length > 3)
				{
					damage = Integer.parseInt(split[3]);
				}
				startingItems.add(new ItemStack(matchingItem, amount, damage));
			}
		} catch (Exception e)
		{
			System.out.println("Reading class file failed.");
			e.printStackTrace();
		}
	}
	
	public static PlayerClass getClass(String s)
	{
		for(PlayerClass playerClass : classes)
		{
			if(playerClass.shortName.equals(s))
				return playerClass;
		}
		return null;
	}
}
