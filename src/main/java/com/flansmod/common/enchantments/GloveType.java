package com.flansmod.common.enchantments;

import java.util.ArrayList;
import java.util.HashMap;

import com.flansmod.client.model.ModelDriveable;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveablePosition;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.Seat;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.types.InfoType.ParseFunc;

import net.minecraftforge.fml.common.FMLCommonHandler;

public class GloveType extends InfoType
{
	public static ArrayList<GloveType> gloves = new ArrayList<>();
	private static HashMap<String, ParseFunc<GloveType>> parsers = new HashMap<>();
	static
	{
		// BASICS /////////////////////////////////////////////////////////////////////////////
		parsers.put("Enchantability", (split, d) -> d.Enchantability = Integer.parseInt(split[1]));
		parsers.put("Durability", (split, d) -> d.Durability = Integer.parseInt(split[1]));
	}
	
	public int Enchantability = 20;
	public int Durability = 200;
	
	public GloveType(TypeFile file) 
	{
		super(file);
	}

	@Override
	public void preRead(TypeFile file)
	{
		super.preRead(file);
		gloves.add(this);
	}
	
	@Override
	protected void read(String[] split, TypeFile file)
	{
		try
		{			
			ParseFunc parser = parsers.get(split[0]);
			if(parser != null)
			{
				parser.Parse(split, this);
			}
			else
			{
				super.read(split, file);
			}
		}
		catch(Exception e)
		{
			FlansMod.log.error("Errored reading " + file.name);
			FlansMod.log.throwing(e);
		}
	}
	
	@Override
	public void postRead(TypeFile file)
	{
		super.postRead(file);
	}

	public static GloveType getGlove(String s) 
	{
		for(GloveType glove : gloves)
		{
			if(glove.shortName.equals(s))
				return glove;
		}
		return null;
	}
}
