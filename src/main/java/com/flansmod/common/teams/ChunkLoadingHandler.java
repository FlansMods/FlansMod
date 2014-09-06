package com.flansmod.common.teams;

import java.util.List;

import net.minecraft.world.World;
import net.minecraftforge.common.ForgeChunkManager.LoadingCallback;
import net.minecraftforge.common.ForgeChunkManager.Ticket;

public class ChunkLoadingHandler implements LoadingCallback 
{
	@Override
	public void ticketsLoaded(List<Ticket> tickets, World world) 
	{
		for(Ticket ticket : tickets) 
		{
			String s = ticket.getModData().getString("ShortName");
			TeamsMap map = TeamsManager.getInstance().maps.get(s);
			if(ticket != null && map != null)
				map.forceChunkLoading(ticket);
		}
	}

}
