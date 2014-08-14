package com.flansmod.common.network;

import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;

import cpw.mods.fml.relauncher.Side;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketSelectOffHandGun extends PacketBase 
{
	public int slot;
	
	public PacketSelectOffHandGun()
	{
		
	}
	
	public PacketSelectOffHandGun(int i)
	{
		slot = i;
	}
	
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeByte(slot);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		slot = data.readByte();
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		PlayerData data = PlayerHandler.getPlayerData(playerEntity, Side.SERVER);
		data.offHandGunSlot = slot;
	}

	@Override
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		
	}

}
