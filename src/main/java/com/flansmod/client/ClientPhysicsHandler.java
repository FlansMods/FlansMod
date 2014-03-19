package com.flansmod.client;

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

import com.flansmod.client.debug.EntityDebugAABB;
import com.flansmod.common.FlansMod;
import com.flansmod.common.physics.PhysicsHandler;

public class ClientPhysicsHandler extends PhysicsHandler 
{
	@Override
	public void tick()
	{
		super.tick();
		World world = Minecraft.getMinecraft().theWorld;
		EntityPlayer player = Minecraft.getMinecraft().thePlayer;
		if(player == null || !FlansMod.DEBUG)
			return;
		Chunk chunk = world.getChunkFromChunkCoords(player.chunkCoordX, player.chunkCoordZ);
		Body body = chunkCollisionObjects.get(chunk);
		Iterator<Geometry> geometries = body.getGeometries();
		while(geometries.hasNext())
		{
			Box box = (Box)geometries.next();
			Vector3 origin = new Vector3();
			box.getLocalTranslation(origin);
			Vector3 lengths = box.getDimentions();
			world.spawnEntityInWorld(new EntityDebugAABB(world, origin, lengths, 10));
		}
	}
}
