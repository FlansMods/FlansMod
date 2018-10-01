package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;

public class PacketGunFire extends PacketBase
{
	public boolean held;
	public boolean left;
	
	public PacketGunFire()
	{
	}
	
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
		FlansMod.log.warn("Depreceated message!");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		FlansMod.log.warn("Received gun button packet on client. Skipping.");
	}
}
