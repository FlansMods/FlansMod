package com.flansmod.client;

import java.util.ArrayList;
import java.util.Iterator;

import javax.vecmath.Vector3f;

import jinngine.geometry.Box;
import jinngine.geometry.Geometry;
import jinngine.math.Vector3;
import jinngine.physics.Body;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.event.world.ChunkEvent;

import com.flansmod.client.debug.EntityDebugAABB;
import com.flansmod.common.FlansMod;
import com.flansmod.common.physics.PhysicsHandler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class PhysicsHandlerClient extends PhysicsHandler 
{
	/** The Forge hook for chunk loading on the client side is before the chunk is actually filled, so make a note of loaded chunks here and look at them a tick later */
	private ArrayList<Chunk> chunksToLoad = new ArrayList<Chunk>();
	
	public PhysicsHandlerClient()
	{
		super();
	}
	
	@Override
	public void tick()
	{
		super.tick();
		
		//Convert chunks the tick after they've been loaded, so that they are actually filled
		for(int i = 0; i < chunksToLoad.size(); i++)
		{
			Chunk chunk = chunksToLoad.get(i);
			createPhysicsObjectsFromChunk(chunk);
		}
		
		chunksToLoad.clear();
		
		//DEBUG
		if(FlansMod.ticker % 200 == 0)
		{
			World world = Minecraft.getMinecraft().theWorld;
			EntityPlayer player = Minecraft.getMinecraft().thePlayer;
			if(player == null || !FlansMod.DEBUG)
				return;
			Chunk chunk = world.getChunkFromChunkCoords(player.chunkCoordX, player.chunkCoordZ);
			Body body = chunkCollisionObjects.get(chunk);
			if(body == null)
				return;
			Iterator<Geometry> geometries = body.getGeometries();
			while(geometries.hasNext())
			{
				Box box = (Box)geometries.next();
				Vector3 origin = new Vector3();


				box.getLocalTranslation(origin);
				Vector3 lengths = box.getDimentions();
				if(player.getDistance(origin.x, origin.y, origin.z) > 20D)
					continue;
				world.spawnEntityInWorld(new EntityDebugAABB(world, origin, lengths, 400));
			}
		}
	}
	
	/** Upon chunk loading, create a set of collision shapes */
	@SubscribeEvent
	public void chunkLoaded(ChunkEvent event)
	{
		Chunk chunk = event.getChunk();
		if(event instanceof ChunkEvent.Load)
		{
			chunksToLoad.add(chunk);
		}
		else if(event instanceof ChunkEvent.Unload)
		{
			chunkCollisionObjects.remove(chunk);
		}
	}
}
