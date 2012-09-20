package co.uk.flansmods.common;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import net.minecraft.server.MinecraftServer;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ServerTickHandler implements ITickHandler {

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData)
	{
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData)
	{
	}
	
	public EnumSet<TickType> ticks()
	{
		return EnumSet.of(TickType.SERVER);
	}

	@Override
	public String getLabel()
	{
		return null;
	}

}
