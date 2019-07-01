package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.ItemGun;

public class PacketGunFire extends PacketBase
{
	private EnumHand hand;
	
	public PacketGunFire() {
		
	}
	
	public PacketGunFire(EnumHand hand)
	{
		this.hand = hand;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		//TODO Proper packet enum encoding
		data.writeInt(EnumHand.MAIN_HAND.equals(hand)?0:1);
	}
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		//TODO Proper packet enum encoding
		hand = data.readInt()==0?EnumHand.MAIN_HAND:EnumHand.OFF_HAND;
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity)
	{
		ItemStack itemstack = playerEntity.getHeldItem(hand);
		//TODO can itemstack be null?
		Item item = itemstack.getItem();
		if (item instanceof ItemGun) {
			ItemGun gun = (ItemGun) item;
			gun.shootServer(hand, playerEntity, itemstack);
			
		} else {
			FlansMod.log.warn("Received invalid PacketGunFire. Item in hand is not an instance of ItemGun");
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		FlansMod.log.warn("Received gun button packet on client. Skipping.");
	}
}
