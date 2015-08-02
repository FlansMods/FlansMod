package com.flansmod.common;

import java.util.HashMap;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.client.model.ModelDriveable;
import com.flansmod.client.model.ModelItemHolder;
import com.flansmod.client.model.ModelVehicle;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

public class ItemHolderType extends InfoType 
{
	@SideOnly(Side.CLIENT)
	public ModelItemHolder model;
	
	public BlockItemHolder block;
	
	private static HashMap<String, ItemHolderType> itemHolders = new HashMap<String, ItemHolderType>();
	
	public ItemHolderType(TypeFile file) 
	{
		super(file);
	}

	@Override
	public void postRead(TypeFile file)
	{
		super.postRead(file);
		itemHolders.put(this.shortName, this);
	}
	
	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{		
			if(FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model"))
				model = FlansMod.proxy.loadModel(split[1], shortName, ModelItemHolder.class);
			
			else if(split[0].equals("Texture"))
				texture = split[1];
		}
		catch (Exception e)
		{
			FlansMod.log("Reading item holder file failed : " + shortName);
			e.printStackTrace();
		}
	}
	
	public static ItemHolderType getItemHolder(String string) 
	{
		return itemHolders.get(string);
	}
	
	/** To be overriden by subtypes for model reloading */
	@Override
	public void reloadModel()
	{
		model = FlansMod.proxy.loadModel(modelString, shortName, ModelItemHolder.class);
	}
}
