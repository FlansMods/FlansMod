package com.flansmod.common.guns.boxes;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

import net.minecraft.client.model.ModelBase;

public abstract class BoxType extends InfoType 
{
	public String topTexturePath;
	public String sideTexturePath;
	public String bottomTexturePath;
	
	public BoxType(TypeFile file) 
	{
		super(file);
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
		} catch (Exception e)
		{
			FlansMod.log("Reading box file failed : " + shortName);
			e.printStackTrace();
		}
	}

	@Override
	protected void preRead(TypeFile file)
	{
	}

	@Override
	protected void postRead(TypeFile file)
	{
	}

	@Override
	public ModelBase GetModel()
	{
		return null;
	}
}
