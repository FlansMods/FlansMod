package com.flansmod.common.teams;

import java.util.ArrayList;
import java.util.List;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import com.flansmod.common.guns.ItemGun;

public class PlayerClass extends InfoType
{
	public static List<PlayerClass> classes = new ArrayList<PlayerClass>();
	
	public List<ItemStack> startingItems = new ArrayList<ItemStack>();
	public boolean horse = false;
	
	public PlayerClass(TypeFile file)
	{
		super(file);
		classes.add(this);
	}
	
	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{	
			if (split[0].equals("AddItem"))
			{
				Item matchingItem = null;
				int amount = 1;
				int damage = 0;
				String[] itemNames = split[1].split("\\+");
				for(Object object : Item.itemRegistry)
				{
					Item item = (Item)object;
					if(item != null && item.getUnlocalizedName() != null && (item.getUnlocalizedName().equals(itemNames[0]) || (item.getUnlocalizedName().split("\\.").length > 1 && item.getUnlocalizedName().split("\\.")[1].equals(itemNames[0]))))
						matchingItem = item;
				}
				for(InfoType type : InfoType.infoTypes)
				{
					if(type.shortName.equals(itemNames[0]))
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
				ItemStack stack = new ItemStack(matchingItem, amount, damage);
				if(itemNames.length > 1 && matchingItem instanceof ItemGun)
				{
			    	NBTTagCompound tags = new NBTTagCompound();
			    	NBTTagCompound attachmentTags = new NBTTagCompound();
			    	int genericID = 0;
			    	for(int i = 0; i < itemNames.length - 1; i++)
			    	{
			    		AttachmentType attachment = AttachmentType.getAttachment(itemNames[i + 1]);
			    		String tagName = null;
			    		switch(attachment.type)
			    		{
			    			case sights : tagName = "scope"; break;
			    			case barrel : tagName = "barrel"; break;
			    			case stock : tagName = "stock"; break;
			    			case grip : tagName = "grip"; break;
			    			case generic : tagName = "generic_" + genericID++; break;
			    		}
			    		NBTTagCompound specificAttachmentTags = new NBTTagCompound();
			    		new ItemStack(attachment.item).writeToNBT(specificAttachmentTags);
			    		attachmentTags.setTag(tagName, specificAttachmentTags);
			    	}
			    	tags.setTag("attachments", attachmentTags);
			    	stack.stackTagCompound = tags;
				}
				startingItems.add(stack);
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
