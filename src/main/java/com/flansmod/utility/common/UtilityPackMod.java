package com.flansmod.utility.common;

import com.flansmod.common.FlansMod;
import com.flansmod.common.IFlansModContentProvider;

import net.minecraftforge.fml.common.Mod;

@Mod(modid = UtilityPackMod.MODID, 
			name = "Utility Pack", 
			version = UtilityPackMod.VERSION,
			dependencies = "required-after:" + FlansMod.MODID)
public class UtilityPackMod implements IFlansModContentProvider
{
	public static final String MODID = "flansutilitypack";
	public static final String VERSION = "@VERSION@";
	
	@Override
	public String GetContentFolder() 
	{
		return "Utility Pack";
	}
	
	@Override
	public void RegisterModelRedirects()
	{
		FlansMod.RegisterModelRedirect("utility", "com.flansmod.utility.client.model");
	}
}
