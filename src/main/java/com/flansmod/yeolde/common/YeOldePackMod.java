package com.flansmod.yeolde.common;

import com.flansmod.common.FlansMod;
import com.flansmod.common.IFlansModContentProvider;

import net.minecraftforge.fml.common.Mod;

@Mod(modid = YeOldePackMod.MODID, 
			name = "Ye Olde Pack", 
			version = YeOldePackMod.VERSION,
			dependencies = "required-after:" + FlansMod.MODID)
public class YeOldePackMod implements IFlansModContentProvider
{
	public static final String MODID = "yeoldepack";
	public static final String VERSION = "@VERSION@";
	
	@Override
	public String GetContentFolder() 
	{
		return "Ye Olde Pack";
	}
	
	@Override
	public void RegisterModelRedirects()
	{
		FlansMod.RegisterModelRedirect("yeolde", "com.flansmod.yeolde.client.model");
	}
}
