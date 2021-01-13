package com.flansmod.simple.common;

import com.flansmod.common.FlansMod;
import com.flansmod.common.IFlansModContentProvider;

import net.minecraftforge.fml.common.Mod;

@Mod(modid = SimplePartsPackMod.MODID, 
			name = "Simple Parts Pack", 
			version = SimplePartsPackMod.VERSION,
			dependencies = "required-after:" + FlansMod.MODID)
public class SimplePartsPackMod implements IFlansModContentProvider
{
	public static final String MODID = "simplepartspack";
	public static final String VERSION = "@VERSION@";
	
	@Override
	public String GetContentFolder() 
	{
		return "Parts Pack";
	}

	@Override
	public void RegisterModelRedirects() {}
}