package co.uk.flansmods.common;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import net.minecraft.server.MinecraftServer;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.World;
import net.minecraft.src.WorldServer;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ServerTickHandler implements ITickHandler {

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData)
	{
		EntityPlayer player = (EntityPlayer) tickData[0];
		World world = (World) player.worldObj;
		
		// do whatever here
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData)
	{
		EntityPlayer player = (EntityPlayer) tickData[0];
		World world = (World) player.worldObj;
		
		// do whatever here
	}
	
	public EnumSet<TickType> ticks()
	{
		return EnumSet.of(TickType.PLAYER);
	}

	@Override
	public String getLabel()
	{
		return "FlansMod ServerTickhandler";
	}

}
