package com.flansmod.titan.common;

import com.flansmod.common.FlansMod;
import com.flansmod.common.IFlansModContentProvider;

import net.minecraftforge.fml.common.Mod;

@Mod(modid = TitanPackMod.MODID, 
			name = "Titan Pack", 
			version = TitanPackMod.VERSION,
			dependencies = "required-after:" + FlansMod.MODID)
public class TitanPackMod implements IFlansModContentProvider
{
	public static final String MODID = "titanpack";
	public static final String VERSION = "@VERSION@";
	
	@Override
	public String GetContentFolder() 
	{
		return "Titan Pack";
	}
	
	@Override
	public void RegisterModelRedirects()
	{
		FlansMod.RegisterModelRedirect("titan", "com.flansmod.titan.client.model");
	}
}
