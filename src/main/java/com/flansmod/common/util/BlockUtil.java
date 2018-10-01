package com.flansmod.common.util;

import java.util.UUID;

import com.mojang.authlib.GameProfile;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;

public class BlockUtil
{
	public static boolean destroyBlock(WorldServer world, BlockPos pos, Entity entity, boolean dropBlock)
	{
		EntityPlayer player;
		if(entity instanceof EntityPlayer)
		{
			player = (EntityPlayer)entity;
		}
		else
		{
			player = new FakePlayer(world, new GameProfile(UUID.randomUUID(), "fakePlayer"));
		}
		
		BreakEvent breakEvent = new BreakEvent(world, pos, world.getBlockState(pos), player);
		MinecraftForge.EVENT_BUS.post(breakEvent);
		
		if(breakEvent.isCanceled())
		{
			return false;
		}
		
		world.destroyBlock(pos, dropBlock);
		
		return true;
	}
}
