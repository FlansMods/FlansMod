package com.flansmod.common;

import java.util.EnumSet;

import com.flansmod.common.teams.TeamsManager;

import net.minecraft.server.MinecraftServer;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class CommonTickHandler 
{
	public CommonTickHandler()
	{
		FMLCommonHandler.instance().bus().register(this);
	}
	
	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event)
	{
		switch(event.phase)
		{
		case START :
		{
			break;
		}
		case END :
		{
			TeamsManager.getInstance().tick();
			FlansMod.playerHandler.tick();
			FlansMod.ticker++;
			break;
		}		
		}
	}
}
