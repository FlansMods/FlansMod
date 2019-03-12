package com.flansmod.common.teams;

import java.util.ArrayList;
import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.registries.IForgeRegistry;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.boxes.BoxType;
import com.flansmod.common.types.TypeFile;

public class ArmourBoxType extends BoxType
{
	public BlockArmourBox block;
	
	public ArrayList<ArmourBoxEntry> pages = new ArrayList<>();
	
	/**
	 * The static box map. Indexed by shortName for server ~ client syncing
	 */
	public static HashMap<String, ArmourBoxType> boxes = new HashMap<>();
	
	public ArmourBoxType(TypeFile file)
	{
		super(file);
	}
	
	@Override
	public void postRead(TypeFile file)
	{
		super.postRead(file);
		boxes.put(shortName, this);
	}
	
	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if(split[0].toLowerCase().equals("addarmour") || split[0].toLowerCase().equals("addarmor"))
			{
				String name = split[2];
				for(int i = 3; i < split.length; i++)
					name = name + " " + split[i];
				ArmourBoxEntry entry = new ArmourBoxEntry(split[1], name);
				//Read the next 4 lines for each armour piece
				for(int i = 0; i < 4; i++)
				{
					String line = null;
					line = file.readLine();
					if(line == null)
						continue;
					if(line.startsWith("//"))
					{
						i--;
						continue;
					}
					String[] lineSplit = line.split(" ");
					entry.armours[i] = ArmourType.getArmourType(lineSplit[0]);
					for(int j = 0; j < (lineSplit.length - 1) / 2; j++)
					{
						ItemStack stack = ItemStack.EMPTY.copy();
						if(lineSplit[j * 2 + 1].contains("."))
							stack = getRecipeElement(lineSplit[j * 2 + 1].split("\\.")[0], Integer.valueOf(lineSplit[j * 2 + 2]), Integer.valueOf(lineSplit[j * 2 + 1].split("\\.")[1]), shortName);
						else
							stack = getRecipeElement(lineSplit[j * 2 + 1], Integer.valueOf(lineSplit[j * 2 + 2]), 0, shortName);
						
						if(stack != null && !stack.isEmpty())
							entry.requiredStacks[i].add(stack);
					}
				}
				
				pages.add(entry);
			}
			
		}
		catch(Exception e)
		{
			FlansMod.log.error("Reading gun box file failed : " + shortName);
			FlansMod.log.throwing(e);
		}
	}
	
	@Override
	public void registerItem(IForgeRegistry<Item> registry)
	{
		item = new ItemBlock(block).setRegistryName(shortName + "_item");
		registry.register(item);
	}
	
	@Override
	public void registerBlock(IForgeRegistry<Block> registry)
	{
		registry.register(block);
	}
	
	/**
	 * Each instance of this class refers to one page full of recipes, that is, one full set of armour
	 */
	public class ArmourBoxEntry
	{
		public String shortName;
		public String name = "";
		public ArmourType[] armours;
		public ArrayList<ItemStack>[] requiredStacks;
		
		public ArmourBoxEntry(String s, String s1)
		{
			shortName = s;
			name = s1;
			
			//Prep arrays and lists
			armours = new ArmourType[4];
			requiredStacks = new ArrayList[4];
			for(int i = 0; i < 4; i++)
				requiredStacks[i] = new ArrayList<>();
		}
	}
	
	public static ArmourBoxType getBox(String boxShortName)
	{
		return boxes.get(boxShortName);
	}
}
