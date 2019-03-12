package com.flansmod.common;

import java.util.HashMap;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.client.model.ModelItemHolder;
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
	protected void preRead(TypeFile file)
	{
	}
	
	@Override
	public void postRead(TypeFile file)
	{
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
		}
		catch(Exception e)
		{
			FlansMod.log.error("Reading item holder file failed : " + shortName);
			FlansMod.log.throwing(e);
		}
	}
	
	@Override
	public void GetItemsForRegistration(List<Item> list)
	{
		if(item != null)
			list.add(item);
		
		//.setRegistryName(shortName + "_item");
	}
		
	@Override
	public void GetBlocksForRegistration(List<Block> list)
	{
		list.add(block);
	}
	
	public static ItemHolderType getItemHolder(String string)
	{
		return itemHolders.get(string);
	}
	
	/**
	 * To be overriden by subtypes for model reloading
	 */
	@Override
	public void reloadModel()
	{
		model = FlansMod.proxy.loadModel(modelString, shortName, ModelItemHolder.class);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBase GetModel()
	{
		return model;
	}
}
