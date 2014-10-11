package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.ItemGun;

public class PacketGunFire extends PacketBase 
{
	public boolean held;
	public boolean left;
	
	public PacketGunFire() {}
	
	public PacketGunFire(boolean l, boolean h)
	{
		left = l;
		held = h;
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeBoolean(held);
		data.writeBoolean(left);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		held = data.readBoolean();
		left = data.readBoolean();
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		ItemStack currentItem = playerEntity.inventory.getCurrentItem();
		if(currentItem != null && currentItem.getItem() != null && currentItem.getItem() instanceof ItemGun)
		{
			((ItemGun)currentItem.getItem()).onMouseHeld(currentItem, playerEntity.worldObj, playerEntity, left, held);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		FlansMod.log("Received gun button packet on client. Skipping.");
	}
}
