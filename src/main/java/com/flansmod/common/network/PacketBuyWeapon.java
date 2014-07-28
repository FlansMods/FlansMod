package com.flansmod.common.network;

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
	public int purchaseType; //0 = Gun, 1 = Ammo, 2 = AltAmmo
	public int weaponID;
	
	public PacketBuyWeapon() {}
	
	public PacketBuyWeapon(GunBoxType box, int type, int wepID)
	{
		boxShortName = box.shortName;
		purchaseType = type;
		weaponID = wepID;
	}
		
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
    	writeUTF(data, boxShortName);
    	data.writeInt(purchaseType);
    	data.writeInt(weaponID);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		boxShortName = readUTF(data);
		purchaseType = data.readInt();
		weaponID = data.readInt();
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		GunBoxType box = GunBoxType.getBox(boxShortName);
		box.block.purchaseItem(purchaseType, weaponID, playerEntity.inventory, box);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		FlansMod.log("Received gun box purchase packet on client. Skipping.");
	}
}
