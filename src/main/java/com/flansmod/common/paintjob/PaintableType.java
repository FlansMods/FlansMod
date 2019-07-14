package com.flansmod.common.paintjob;

import java.util.ArrayList;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public abstract class PaintableType extends InfoType
{
	//Paintjobs
	/** The list of all available paintjobs for this gun */
	public ArrayList<Paintjob> paintjobs = new ArrayList<Paintjob>();
	/** The default paintjob for this gun. This is created automatically in the load process from existing info */
	public Paintjob defaultPaintjob;	
	/** Assigns IDs to paintjobs */
	private int nextPaintjobID = 1;
	/** Add a friendly paintjob name */
	private String paintjobName;
	
	public PaintableType(TypeFile file)
	{
		super(file);
	}

	@Override
	public void preRead(TypeFile file)
	{
	
	}
	
	@Override
	public void postRead(TypeFile file)
	{		
		//After all lines have been read, set up the default paintjob
		defaultPaintjob = new Paintjob(0, iconPath, texture, new ItemStack[0]);
		defaultPaintjob = new Paintjob(0, "default", iconPath, texture, new ItemStack[0]);
		//Move to a new list to ensure that the default paintjob is always first
		ArrayList<Paintjob> newPaintjobList = new ArrayList<Paintjob>();
		newPaintjobList.add(defaultPaintjob);
		newPaintjobList.addAll(paintjobs);
		paintjobs = newPaintjobList;
	}
	
	/** Pack reader */
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			//Paintjobs
			if(split[0].toLowerCase().equals("paintjob"))
			{
				ItemStack[] dyeStacks = new ItemStack[(split.length - 3) / 2];
				for(int i = 0; i < (split.length - 3) / 2; i++)
					dyeStacks[i] = new ItemStack(Items.dye, Integer.parseInt(split[i * 2 + 4]), getDyeDamageValue(split[i * 2 + 3]));
				
				//if(split[1].contains("_"))
				//{
				//	String[] splat = split[1].split("_");
				//	if(splat[0].equals(iconPath))
				//		split[1] = splat[1];
				//}
				paintjobs.add(new Paintjob(nextPaintjobID++, split[1], split[2], dyeStacks));
			}
		} 
		catch (Exception e)
		{
			FlansMod.log("Reading file failed : " + shortName);
			e.printStackTrace();
		}
		super.read(split, file);
		try
		{
			//Paintjobs
			if(split[0].toLowerCase().equals("advpaintjob"))
			{
				ItemStack[] dyeStacks = new ItemStack[(split.length - 4) / 2];
				for(int i = 0; i < (split.length - 4) / 2; i++)
					dyeStacks[i] = new ItemStack(Items.dye, Integer.parseInt(split[i * 2 + 5]), getDyeDamageValue(split[i * 2 + 4]));
				paintjobs.add(new Paintjob(nextPaintjobID++, split[1], split[2], split[3], dyeStacks));
			}
		} 
		catch (Exception e)
		{
			FlansMod.log("Reading file failed : " + shortName);
			e.printStackTrace();
		}
	}
	
	public Paintjob getPaintjob(int i)
	{
		return paintjobs.get(i);
	}

	public float GetRecommendedScale()
	{
		return 50.0f;
	}
}