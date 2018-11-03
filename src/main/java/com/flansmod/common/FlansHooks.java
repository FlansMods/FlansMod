package com.flansmod.common;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;

public class FlansHooks
{
	public Class BuildCraftEnergy;
	
	public ItemStack BuildCraftFuelBucket;
	public ItemStack BuildCraftOilBucket;
	
	public boolean BuildCraftLoaded;
	
	public void hook()
	{
		if(Loader.isModLoaded("BuildCraft|Energy"))
		{
			BuildCraftFuelBucket = getBuildCraftItem("bucketFuel");
			BuildCraftOilBucket = getBuildCraftItem("bucketOil");
			FlansMod.log.info("BuildCraft integration loaded.");
			BuildCraftLoaded = true;
		}
	}
	
	public ItemStack getBuildCraftItem(String name)
	{
		try
		{
			if(BuildCraftEnergy == null) BuildCraftEnergy = Class.forName("buildcraft.BuildCraftEnergy");
			if(BuildCraftEnergy == null)
				BuildCraftEnergy = Class.forName("net.minecraft.src.buildcraft.BuildCraftEnergy");
			Object ret = BuildCraftEnergy.getField(name).get(null);
			
			if(ret instanceof Item)
			{
				return new ItemStack((Item)ret);
			}
			else
			{
				throw new Exception();
			}
		}
		catch(Exception e)
		{
			FlansMod.log.error("Unable to retrieve BuildCraft item " + name + ".");
			return ItemStack.EMPTY.copy();
		}
	}
}
