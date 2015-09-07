package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.api.IControllable;
import com.flansmod.common.FlansMod;

public class PacketDriveableKeyHeld extends PacketBase 
{	
	public int key;
	public boolean held;
	
	public PacketDriveableKeyHeld() {}
	
	public PacketDriveableKeyHeld(int key, boolean held)
	{
		this.key = key;
		this.held = held;
	}
		
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
    	data.writeInt(key);
    	data.writeBoolean(held);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		key = data.readInt();
		held = data.readBoolean();
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		if(playerEntity.ridingEntity != null && playerEntity.ridingEntity instanceof IControllable)
		{
			((IControllable)playerEntity.ridingEntity).updateKeyHeldState(key, held);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		FlansMod.log("Driveable key packet received on client. Skipping.");
	}
}
