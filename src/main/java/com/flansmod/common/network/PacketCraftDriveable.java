package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveableType;

public class PacketCraftDriveable extends PacketBase
{
	public String shortName;
	
	public PacketCraftDriveable()
	{
	}
	
	public PacketCraftDriveable(String s)
	{
		shortName = s;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		writeUTF(data, shortName);
	}
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		shortName = readUTF(data);
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity)
	{
		DriveableType type = DriveableType.getDriveable(shortName);
		//Try to craft the driveable
		FlansMod.proxy.craftDriveable(playerEntity, type);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		FlansMod.log.warn("Received driveable repair packet on client side. Skipping.");
	}
}
