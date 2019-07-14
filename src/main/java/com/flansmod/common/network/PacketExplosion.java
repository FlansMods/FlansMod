package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.FlansModExplosion;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PacketExplosion extends PacketBase 
{
	/** Position of this flak */
	public double explosionX, explosionY, explosionZ;
	public float explosionSize;

	public PacketExplosion() {}

	public PacketExplosion(double x1, double y1, double z1, float s)
	{
		explosionX = x1;
		explosionY = y1;
		explosionZ = z1;
		explosionSize = s;
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeDouble(explosionX);
    	data.writeDouble(explosionY);
    	data.writeDouble(explosionZ);
    	data.writeFloat(explosionSize);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		explosionX = data.readDouble();
		explosionY = data.readDouble();
		explosionZ = data.readDouble();
		explosionSize = data.readFloat();
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		FlansMod.log("Received Explosion packet on server. Disregarding.");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		FlansModExplosion.clientExplosion(clientPlayer.worldObj,
				explosionSize, explosionX, explosionY, explosionZ);
	}
}
