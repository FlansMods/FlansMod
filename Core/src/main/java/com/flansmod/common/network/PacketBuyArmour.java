package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.teams.ArmourBoxType;

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
		FlansMod.log.warn("Received armour box purchase packet on client. Skipping.");
	}
	
}
