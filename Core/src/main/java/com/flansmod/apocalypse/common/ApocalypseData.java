package com.flansmod.apocalypse.common;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.flansmod.common.FlansMod;

public class ApocalypseData
{
	/**
	 * The point at which each player entered the apocalypse. For deciding where they should come out
	 */
	public HashMap<UUID, BlockPos> entryPoints = new HashMap<>();
	
	@SubscribeEvent
	public void worldData(WorldEvent event)
	{
		if(event.getWorld().isRemote)
			return;
		if(event instanceof WorldEvent.Load)
		{
			loadPerWorldData(event, event.getWorld());
			savePerWorldData(event, event.getWorld());
		}
		if(event instanceof WorldEvent.Save)
		{
			savePerWorldData(event, event.getWorld());
		}
	}

	private void savePerWorldData(WorldEvent event, World world)
	{
		if(world.provider.getDimension() == 0)
		{
			try
			{
				//Make directory
				File dir = new File(world.getSaveHandler().getWorldDirectory(), "apocalypse");
				if(!dir.exists())
					dir.mkdirs();
				
				//Save per-world file
				File file = new File(dir, "apocalypse.dat");
				NBTTagCompound tags = new NBTTagCompound();
				if(!file.exists())
					file.createNewFile();

				CompressedStreamTools.write(tags, new DataOutputStream(new FileOutputStream(file)));
				
				
				//Save per-player file
				for(Map.Entry<UUID, BlockPos> uuidBlockPosEntry : entryPoints.entrySet())
				{
					UUID uuid = (uuidBlockPosEntry).getKey();
					File playerFile = new File(dir, uuid.toString() + ".dat");
					NBTTagCompound playerTags = new NBTTagCompound();
					if(!playerFile.exists())
						playerFile.createNewFile();
					
					BlockPos pos = entryPoints.get(uuid);
					playerTags.setIntArray("EntryPoint", new int[]{pos.getX(), pos.getY(), pos.getZ()});
					
					CompressedStreamTools.write(playerTags, new DataOutputStream(new FileOutputStream(playerFile)));
				}
			}
			catch(Exception e)
			{
				FlansMod.log.throwing(e);
			}
		}
	}

	private void loadPerWorldData(WorldEvent event, World world)
	{
		if(world.provider.getDimension() == 0)
		{
			try
			{
				//Make directory
				File dir = new File(world.getSaveHandler().getWorldDirectory(), "apocalypse");
				if(!dir.exists())
					return;
				
				//Load per-world file
				File file = new File(world.getSaveHandler().getWorldDirectory(), "apocalypse/apocalypse.dat");
				if(!file.exists())
					file.createNewFile();

				NBTTagCompound tags = CompressedStreamTools.read(new DataInputStream(new FileInputStream(file)));
				
				
				//Load per-player file
				for(File playerFile : dir.listFiles())
				{
					if(playerFile.getName().equals("apocalypse.dat"))
						continue;
					UUID uuid = UUID.fromString(playerFile.getName().split("\\.")[0]);
					NBTTagCompound playerTags = CompressedStreamTools.read(new DataInputStream(new FileInputStream(playerFile)));
					int[] entryPoint = playerTags.getIntArray("EntryPoint");
					entryPoints.put(uuid, new BlockPos(entryPoint[0], entryPoint[1], entryPoint[2]));
				}
			}
			catch(Exception e)
			{
				FlansMod.log.throwing(e);
			}
		}
	}
	
	
}
