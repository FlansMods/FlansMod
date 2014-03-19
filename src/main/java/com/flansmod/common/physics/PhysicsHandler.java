package com.flansmod.common.physics;

import java.util.ArrayList;
import java.util.HashMap;

import javax.vecmath.Quat4f;
import javax.vecmath.Vector3f;

import jinngine.geometry.Box;
import jinngine.geometry.Geometry;
import jinngine.physics.Body;
import jinngine.physics.DefaultScene;
import jinngine.physics.Scene;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.ChunkEvent;
import net.minecraftforge.event.world.WorldEvent;

import com.flansmod.client.debug.EntityDebugAABB;
import com.flansmod.common.FlansMod;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class PhysicsHandler 
{
	private static final float STEPSIZE = 5;
		
	protected HashMap<Chunk, Body> chunkCollisionObjects = new HashMap<Chunk, Body>();
	protected Scene physicsScene;
	
	public PhysicsHandler()
	{
		physicsScene = new DefaultScene();
		physicsScene.setTimestep(1D / 20D);
				
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	public Scene getPhysicsScene() 
	{
		return physicsScene;
	}
	
	public void tick()
	{
		//Simulate the physics world
		if (physicsScene != null) 
			physicsScene.tick();
	}
	
	/** Upon chunk loading, create a set of collision shapes */
	@SubscribeEvent
	public void chunkLoaded(ChunkEvent event)
	{
		Chunk chunk = event.getChunk();
		if(event instanceof ChunkEvent.Load)
		{
			createPhysicsObjectsFromChunk(chunk);
		}
		else if(event instanceof ChunkEvent.Unload)
		{
			chunkCollisionObjects.remove(chunk);
		}
	}
	
	protected void createPhysicsObjectsFromChunk(Chunk chunk)
	{
		ArrayList<Geometry> boxes = new ArrayList<Geometry>();
		
		//Chunk to collision shape set conversion algorithm follows. Could probably be better implemented. Will look into in future
		boolean [][][] doneConverting = new boolean[16][256][16];
		
		//Iterate over all blocks in the chunk in the order xzy
		for(int j = 0; j < 256; j++)
		{
			for(int i = 0; i < 16; i++)
			{
				for(int k = 0; k < 16; k++)
				{
					//If this block has already been included in some collision shape, skip it
					if(doneConverting[i][j][k])
						continue;
					else
					{
						//We are looking at a solid block
						if(opaque(chunk, i, j, k))
						{
							//The end of the longest possible solid row in x
							int x = i + 1;
							for(; x < 16; x++)
							{
								if(!opaque(chunk, x, j, k))
								{	
									
									break; 
								}
							}
							
							int z = k + 1;
							//Find the biggest slab of rows made from our row in x
							for(; z < 16; z++)
							{
								//Check that the entire row in x is solid
								boolean rowSolid = true;
								for(int i1 = i; i1 < x; i1++)
								{
									if(!opaque(chunk, i1, j, z))
										rowSolid = false;
								}
								//If the next row is not solid, return
								if(!rowSolid)
								{
									break;
								}
							}
							
							int y = j + 1;
							//Find the tallest tower made from our slabs in x-z
							for(; y < 16; y++)
							{
								//Check that the entire slab in x-z is solid
								boolean slabSolid = true;
								for(int i1 = i; i1 < x; i1++)
								{
									for(int k1 = k; k1 < z; k1++)
									{
										if(!opaque(chunk, i1, y, k1))
											slabSolid = false;
									}
								}
								//If the next slab is not solid, return
								if(!slabSolid)
								{
									break;
								}
							}
							
							for(int i1 = i; i1 < x; i1++)
							{
								for(int j1 = j; j1 < y; j1++)
								{
									for(int k1 = k; k1 < z; k1++)
									{
										doneConverting[i1][j1][k1] = true;
									}
								}
							}
							
							//Now we have a cuboid from i to x, j to y, k to z that is completely solid
							
							Box box = new Box(x - i, y - j, z - k, chunk.xPosition * 16 + i, j, chunk.zPosition * 16 + k);
							box.setMass(0);
							boxes.add(box);
						}
						else
						{
							doneConverting[i][j][k] = true;
						}
					}
				}
			}
		}
		
		//Box box = new Box(16, 16, 16, chunk.xPosition * 16, 64, chunk.zPosition * 16);
		//box.setMass(0);
		//boxes.add(box);
		
		Body body = new Body("x" + chunk.xPosition + "|z" + chunk.zPosition, boxes.iterator());
		chunkCollisionObjects.put(chunk, body);
	}
	
	private boolean opaque(Chunk chunk, int x, int y, int z)
	{
		return chunk.getBlock(x, y, z).isOpaqueCube();
	}
}
