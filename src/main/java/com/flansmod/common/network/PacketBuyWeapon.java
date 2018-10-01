package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.boxes.GunBoxType;
import com.flansmod.common.types.InfoType;

public class PacketBuyWeapon extends PacketBase
{
	public String boxShortName;
	private String typeShortName;
	
	public PacketBuyWeapon()
	{
	}
	
	public PacketBuyWeapon(GunBoxType box, InfoType type)
	{
		boxShortName = box.shortName;
		typeShortName = type.shortName;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		writeUTF(data, boxShortName);
		writeUTF(data, typeShortName);
	}
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		boxShortName = readUTF(data);
		typeShortName = readUTF(data);
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity)
	{
		GunBoxType box = GunBoxType.getBox(boxShortName);
		box.block.buyGun(InfoType.getType(typeShortName), playerEntity.inventory, box);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		FlansMod.log.warn("Received gun box purchase packet on client. Skipping.");
	}
}
