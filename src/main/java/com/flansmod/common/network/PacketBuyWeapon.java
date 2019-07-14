package com.flansmod.common.network;

import com.flansmod.common.types.InfoType;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.boxes.GunBoxType;

public class PacketBuyWeapon extends PacketBase
{
	public String boxShortName;
	public String itemShortName;
	
	public PacketBuyWeapon() {}
	
	public PacketBuyWeapon(GunBoxType box, InfoType type)
	{
		boxShortName = box.shortName;
		itemShortName = type.shortName;
	}
		
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
    	writeUTF(data, boxShortName);
		writeUTF(data, itemShortName);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		boxShortName = readUTF(data);
		itemShortName = readUTF(data);
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		GunBoxType box = GunBoxType.getBox(boxShortName);
		box.block.buyGun(InfoType.getType(itemShortName), playerEntity.inventory, box);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		FlansMod.log("Received gun box purchase packet on client. Skipping.");
	}
}
