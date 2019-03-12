package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EnumDriveablePart;

public class PacketRepairDriveable extends PacketBase
{
	public String shortName;
	
	public PacketRepairDriveable()
	{
	}
	
	public PacketRepairDriveable(EnumDriveablePart part)
	{
		shortName = part.getShortName();
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
		EnumDriveablePart part = EnumDriveablePart.getPart(shortName);
		//Try to repair the driveable
		FlansMod.proxy.repairDriveable(playerEntity, ((EntitySeat)playerEntity.getRidingEntity()).driveable, ((EntitySeat)playerEntity.getRidingEntity()).driveable.getDriveableData().parts.get(part));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		FlansMod.log.warn("Received driveable repair packet on client side. Skipping.");
	}
}
