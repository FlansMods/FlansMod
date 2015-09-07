package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/** Base class for all packets in Flan's Mod. */
public abstract class PacketBase 
{
	/** Encode the packet into a ByteBuf stream. Advanced data handlers can be found at @link{cpw.mods.fml.common.network.ByteBufUtils} */
	public abstract void encodeInto(ChannelHandlerContext ctx, ByteBuf data);

	/** Decode the packet from a ByteBuf stream. Advanced data handlers can be found at @link{cpw.mods.fml.common.network.ByteBufUtils} */
	public abstract void decodeInto(ChannelHandlerContext ctx, ByteBuf data);

	/** Handle the packet on server side, post-decoding */
	public abstract void handleServerSide(EntityPlayerMP playerEntity);

	/** Handle the packet on client side, post-decoding */
	@SideOnly(Side.CLIENT)
	public abstract void handleClientSide(EntityPlayer clientPlayer);
	
	/** Util method for quickly writing strings */
	public void writeUTF(ByteBuf data, String s)
	{
		ByteBufUtils.writeUTF8String(data, s);
	}
	
	/** Util method for quickly reading strings */
	public String readUTF(ByteBuf data)
	{
		return ByteBufUtils.readUTF8String(data);
	}
}
