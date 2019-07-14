package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;

public class PacketFlashBang extends PacketBase
{
	public int time = 10;

	public PacketFlashBang() {}

	public PacketFlashBang(int flashTime)
	{
		time = flashTime;
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		data.writeInt(time);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		time = data.readInt();
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity)
	{
		FlansMod.log("Received flashBang packet on server. Disregarding.");
		//FlansMod.getPacketHandler().sendTo(new PacketFlashBang(time),playerEntity);
	}

	@Override
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		//if(clientPlayer.worldObj.isRemote)
			if(FlansMod.proxy.isThePlayer(clientPlayer))
				FlansModClient.isInFlash = true;
				FlansModClient.flashTime = time;
	}

}
