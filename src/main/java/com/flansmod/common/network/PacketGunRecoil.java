package com.flansmod.common.network;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;


//Packets must be registered in .network.PacketHandler!
public class PacketGunRecoil extends PacketBase 
{
	
	public float recoilPitch;
	public float recoilYaw;
	public float decreaseRecoilPitch;
	public float decreaseRecoilYaw;

	
	public PacketGunRecoil()
	{

	}
	
	public PacketGunRecoil(float recoilPitch, float recoilYaw, float decreaseRecoilPitch, float decreaseRecoilYaw)
	{
		this.recoilPitch = recoilPitch;
		this.recoilYaw = recoilYaw;
		this.decreaseRecoilPitch = decreaseRecoilPitch;
		this.decreaseRecoilYaw = decreaseRecoilYaw;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeFloat(recoilPitch);
		data.writeFloat(recoilYaw);
		data.writeFloat(decreaseRecoilPitch);
		data.writeFloat(decreaseRecoilYaw);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		recoilPitch = data.readFloat();
		recoilYaw = data.readFloat();
		decreaseRecoilPitch = data.readFloat();
		decreaseRecoilYaw = data.readFloat();
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		if(!clientPlayer.isSneaking())
		{
			FlansModClient.playerRecoilPitch += recoilPitch;
			FlansModClient.playerRecoilYaw += recoilYaw;
		}
		else
		{
			FlansModClient.playerRecoilPitch += recoilPitch - decreaseRecoilPitch;
			FlansModClient.playerRecoilYaw += recoilYaw / decreaseRecoilYaw;
		}
		//FlansMod.log("Recoil packet received");
	}
}
