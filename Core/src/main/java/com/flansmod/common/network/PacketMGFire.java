package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.EntityAAGun;
import com.flansmod.common.guns.EntityMG;

public class PacketMGFire extends PacketBase
{
	public boolean held;
	
	public PacketMGFire()
	{
	}
	
	public PacketMGFire(boolean h)
	{
		held = h;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		data.writeBoolean(held);
	}
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		held = data.readBoolean();
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity)
	{
		EntityMG mg = PlayerHandler.getPlayerData(playerEntity).mountingGun;
		if(mg != null)
		{
			mg.mouseHeld(held);
		}
		else if(playerEntity.getRidingEntity() instanceof EntityAAGun)
		{
			((EntityAAGun)playerEntity.getRidingEntity()).setMouseHeld(held);
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		FlansMod.log.warn("MG firing packet received on client. Skipping.");
	}
}
