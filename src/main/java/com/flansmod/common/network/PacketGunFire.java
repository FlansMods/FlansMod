package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;

public class PacketGunFire extends PacketBase 
{
	public boolean held;
	public boolean left;
	public float yaw;
	public float pitch;

	
	public PacketGunFire() {}
	
	public PacketGunFire(boolean l, boolean h, float y, float p)
	{
		left = l;
		held = h;
		yaw  = y;
		pitch= p;

	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeBoolean(held);
		data.writeBoolean(left);
		data.writeFloat(yaw);
		data.writeFloat(pitch);

	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		held = data.readBoolean();
		left = data.readBoolean();
		yaw  = data.readFloat();
		pitch= data.readFloat();
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		ItemStack currentItem = playerEntity.inventory.getCurrentItem();
		if(currentItem != null && currentItem.getItem() != null && currentItem.getItem() instanceof ItemGun)
		{
			float bkYaw  = playerEntity.rotationYaw;
			float bkPitch= playerEntity.rotationPitch;
			playerEntity.rotationYaw   = yaw;
			playerEntity.rotationPitch = pitch;
			((ItemGun)currentItem.getItem()).onMouseHeld(currentItem, playerEntity.worldObj, playerEntity, left, held);
			playerEntity.rotationYaw	= bkYaw;
			playerEntity.rotationPitch	= bkPitch;

		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		FlansMod.log("Received gun button packet on client. Skipping.");
		ItemStack currentItem = clientPlayer.inventory.getCurrentItem();

	}
}
