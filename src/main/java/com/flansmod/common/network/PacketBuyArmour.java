package com.flansmod.common.network;

import com.flansmod.common.FlansMod;
import com.flansmod.common.teams.ArmourBoxType;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketBuyArmour extends PacketBase 
{
	public String boxShortName;
	public String armourShortName;
	public int piece;
	
	public PacketBuyArmour()
	{
	}
	
	public PacketBuyArmour(String box, String armour, int i)
	{
		boxShortName = box;
		armourShortName = armour;
		piece = i;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		writeUTF(data, boxShortName);
		writeUTF(data, armourShortName);
		data.writeByte((byte)piece);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		boxShortName = readUTF(data);
		armourShortName = readUTF(data);
		piece = data.readByte();
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		ArmourBoxType box = ArmourBoxType.getBox(boxShortName);
		box.block.buyArmour(armourShortName, piece, playerEntity.inventory);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		FlansMod.log("Received armour box purchase packet on client. Skipping.");
	}

}
