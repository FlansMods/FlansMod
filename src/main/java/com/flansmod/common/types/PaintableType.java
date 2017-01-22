package com.flansmod.common.types;

import java.util.ArrayList;
import java.util.HashMap;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.Paintjob;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;

public abstract class PaintableType extends InfoType
{
	//Paintjobs
	/** The list of all available paintjobs for this gun */
	public ArrayList<Paintjob> paintjobs = new ArrayList<Paintjob>();
	/** The default paintjob for this gun. This is created automatically in the load process from existing info */
	public Paintjob defaultPaintjob;	
	/** Assigns IDs to paintjobs */
	private int nextPaintjobID = 1;
	
	private static HashMap<Integer, PaintableType> paintableTypes = new HashMap<Integer, PaintableType>();
	public static PaintableType GetPaintableType(int iHash) { return paintableTypes.get(iHash); }
	public static PaintableType GetPaintableType(String name) { return paintableTypes.get(name.hashCode()); }
	
	public PaintableType(TypeFile file)
	{
		super(file);
	}
	
	@Override
	public void postRead(TypeFile file)
	{
		//After all lines have been read, set up the default paintjob
		defaultPaintjob = new Paintjob(this, 0, "", texture, new ItemStack[0]);
		//Move to a new list to ensure that the default paintjob is always first
		ArrayList<Paintjob> newPaintjobList = new ArrayList<Paintjob>();
		newPaintjobList.add(defaultPaintjob);
		newPaintjobList.addAll(paintjobs);
		paintjobs = newPaintjobList;
		if(infoTypes.containsKey(shortName.hashCode()))
		{
			FlansMod.Assert(false, "Duplicate info type name " + shortName);
		}
		
		// Add all custom paintjobs to dungeon loot. Equal chance for each
		totalDungeonChance += dungeonChance * (paintjobs.size() - 1);
		
		paintableTypes.put(shortName.hashCode(), this);
	}
	
	/** Pack reader */
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			//Paintjobs
			if(KeyMatches(split, "Paintjob"))
			{
				ItemStack[] dyeStacks = new ItemStack[(split.length - 3) / 2];
				for(int i = 0; i < (split.length - 3) / 2; i++)
					dyeStacks[i] = new ItemStack(Items.dye, Integer.parseInt(split[i * 2 + 4]), getDyeDamageValue(split[i * 2 + 3]));
				if(split[1].contains("_"))
				{
					String[] splat = split[1].split("_");
					if(splat[0].equals(iconPath))
						split[1] = splat[1];
				}
				paintjobs.add(new Paintjob(this, nextPaintjobID++, split[1], split[2], dyeStacks));
			}
		} 
		catch (Exception e)
		{
			FlansMod.log("Reading file failed : " + shortName);
			e.printStackTrace();
		}
	}
	
	public Paintjob getPaintjob(String s)
	{
		for(Paintjob paintjob : paintjobs)
		{
			if(paintjob.textureName.equals(s))
				return paintjob;
			
			if(paintjob.iconName.equals(s))
			{
				FlansMod.Assert(false, "Not sure this should be the right way to find a paintjob");
				return paintjob;
			}
		}
		FlansMod.Assert(false, "Could not find paintjob " + s);
		return defaultPaintjob;
	}
	
	public Paintjob getPaintjob(int i)
	{
		return paintjobs.get(i);
	}
	
	@Override
	public void addDungeonLoot() 
	{
		if(dungeonChance > 0)
		{
			for(int i = 0; i < paintjobs.size(); i++)
			{
				ItemStack stack = new ItemStack(this.item);
				NBTTagCompound tags = new NBTTagCompound();
				tags.setString("Paint", paintjobs.get(i).iconName);
				stack.setTagCompound(tags);
				
				addToRandomChest(stack, (float)(FlansMod.dungeonLootChance * dungeonChance) / (float)totalDungeonChance);
			}
		}
	}

	public float GetRecommendedScale()
	{
		return 50.0f;
	}
	
	public static boolean HasCustomPaintjob(ItemStack stack)
	{
		if(stack == null)
		{
			return false;
		}
		
		if(stack.getItem() instanceof IPaintableItem)
		{
			return stack.getTagCompound().hasKey("CustomPaint");
		}
		return false;
	}
	
	public static ResourceLocation GetCustomPaintjobSkinResource(ItemStack stack)
	{
		NBTTagCompound tags = stack.getTagCompound().getCompoundTag("CustomPaint");
		int customPaintHash = tags.getInteger("Hash");
		
		if(!FlansModResourceHandler.HasResourceForHash(customPaintHash))
		{
			FlansModResourceHandler.CreateSkinResourceFromByteArray(tags.getByteArray("Skin"), tags.getInteger("SkinWidth"), tags.getInteger("SkinHeight"), customPaintHash);
			FlansModResourceHandler.CreateIconResourceFromByteArray(tags.getByteArray("Icon"), tags.getInteger("IconWidth"), tags.getInteger("IconHeight"), customPaintHash);
		}
		
		return FlansModResourceHandler.GetSkinResourceFromHash(customPaintHash);
	}
	
	public static ResourceLocation GetCustomPaintjobIconResource(ItemStack stack)
	{
		NBTTagCompound tags = stack.getTagCompound().getCompoundTag("CustomPaint");
		int customPaintHash = tags.getInteger("Hash");
		
		if(!FlansModResourceHandler.HasResourceForHash(customPaintHash))
		{
			FlansModResourceHandler.CreateSkinResourceFromByteArray(tags.getByteArray("Skin"), tags.getInteger("SkinWidth"), tags.getInteger("SkinHeight"), customPaintHash);
			FlansModResourceHandler.CreateIconResourceFromByteArray(tags.getByteArray("Icon"), tags.getInteger("IconWidth"), tags.getInteger("IconHeight"), customPaintHash);
		}
		
		return FlansModResourceHandler.GetIconResourceFromHash(customPaintHash);
	}
}
