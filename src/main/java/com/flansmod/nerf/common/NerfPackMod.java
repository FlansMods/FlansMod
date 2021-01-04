package com.flansmod.nerf.common;

import com.flansmod.common.FlansMod;
import com.flansmod.common.IFlansModContentProvider;

import net.minecraftforge.fml.common.Mod;

@Mod(modid = NerfPackMod.MODID, 
			name = "Nerf Pack", 
			version = NerfPackMod.VERSION,
			dependencies = "required-after:" + FlansMod.MODID)
public class NerfPackMod implements IFlansModContentProvider
{
	public static final String MODID = "nerfpack";
	public static final String VERSION = "@VERSION@";
	
	@Override
	public String GetContentFolder() 
	{
		return "Nerf Pack";
	}
	
	@Override
	public void RegisterModelRedirects()
	{
		FlansMod.RegisterModelRedirect("nerf", "com.flansmod.nerf.client.model");
	}
}
