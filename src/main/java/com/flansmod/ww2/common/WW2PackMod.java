package com.flansmod.ww2.common;

import com.flansmod.common.FlansMod;
import com.flansmod.common.IFlansModContentProvider;

import net.minecraftforge.fml.common.Mod;

@Mod(modid = WW2PackMod.MODID, 
			name = "WW2 Pack", 
			version = WW2PackMod.VERSION,
			dependencies = "required-after:" + FlansMod.MODID)
public class WW2PackMod implements IFlansModContentProvider
{
	public static final String MODID = "ww2pack";
	public static final String VERSION = "@VERSION@";
	
	@Override
	public String GetContentFolder() 
	{
		return "WW2 Pack";
	}
	
	@Override
	public void RegisterModelRedirects()
	{
		FlansMod.RegisterModelRedirect("ww2", "com.flansmod.ww2.client.model");
	}
}
