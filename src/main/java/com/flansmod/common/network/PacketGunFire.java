package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.ItemGun;

import cpw.mods.fml.relauncher.Side;

public class PacketGunFire extends PacketBase 
{
	public boolean held;
	
	public PacketGunFire() {}
	
	public PacketGunFire(boolean h)
	{
		held = h;
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeBoolean(held);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		held = data.readBoolean();
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		ItemStack currentItem = playerEntity.inventory.getCurrentItem();
		if(currentItem != null && currentItem.getItem() != null && currentItem.getItem() instanceof ItemGun)
		{
			((ItemGun)currentItem.getItem()).onMouseHeld(currentItem, playerEntity.worldObj, playerEntity, held);
		}
	}

	@Override
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		FlansMod.log("Received gun button packet on client. Skipping.");
	}
}
