package com.flansmod.steampunk.common;

import com.flansmod.common.FlansMod;
import com.flansmod.common.IFlansModContentProvider;

import net.minecraftforge.fml.common.Mod;

@Mod(modid = SteampunkPackMod.MODID, 
			name = "Steampunk Pack", 
			version = SteampunkPackMod.VERSION,
			dependencies = "required-after:" + FlansMod.MODID)
public class SteampunkPackMod implements IFlansModContentProvider
{
	public static final String MODID = "steampunkpack";
	public static final String VERSION = "@VERSION@";
	
	@Override
	public String GetContentFolder() 
	{
		return "Steampunk Pack";
	}
	
	@Override
	public void RegisterModelRedirects()
	{
		FlansMod.RegisterModelRedirect("steampunk", "com.flansmod.steampunk.client.model");
	}
}
