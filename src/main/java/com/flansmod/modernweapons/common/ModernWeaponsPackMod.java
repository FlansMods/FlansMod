package com.flansmod.modernweapons.common;

import com.flansmod.common.FlansMod;
import com.flansmod.common.IFlansModContentProvider;

import net.minecraftforge.fml.common.Mod;

@Mod(modid = ModernWeaponsPackMod.MODID, 
			name = "Modern Weapons Pack", 
			version = ModernWeaponsPackMod.VERSION,
			dependencies = "required-after:" + FlansMod.MODID)
public class ModernWeaponsPackMod implements IFlansModContentProvider
{
	public static final String MODID = "modernweaponspack";
	public static final String VERSION = "@VERSION@";
	
	@Override
	public String GetContentFolder() 
	{
		return "Modern Weapons Pack";
	}
	
	@Override
	public void RegisterModelRedirects()
	{
		FlansMod.RegisterModelRedirect("mw", "com.flansmod.modernweapons.client.model");
	}
}
