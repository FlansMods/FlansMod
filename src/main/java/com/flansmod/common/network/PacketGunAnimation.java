package com.flansmod.common.network;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.client.model.GunAnimations.LookAtState;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.EnumHand;

public class PacketGunAnimation extends PacketBase
{

	private AnimationType type;
	private AnimationType type2 = AnimationType.NONE;
	private Float minigunRotationAddSpeed;
	private Integer pumpdelay;
	private Integer pumptime;
	private Float recoil;
	private Integer reloadtime;
	private EnumHand hand;
	
	public PacketGunAnimation()
	{
		
	}
	
	public PacketGunAnimation(EnumHand hand, Integer pumpdelay, Integer pumptime, Float recoil)
	{
		this.type = AnimationType.SHOOT;
		this.pumpdelay = pumpdelay;
		this.pumptime = pumptime;
		this.recoil = recoil;
		this.hand = hand;
	}
	
	public PacketGunAnimation(EnumHand hand, Integer pumpdelay, Integer pumptime, Float recoil, Float minigunAddSpeed)
	{
		this(hand,pumpdelay,pumptime,recoil);
		this.type2 = AnimationType.ROTATION;
		this.minigunRotationAddSpeed = minigunAddSpeed;
	}
	
	public PacketGunAnimation(EnumHand hand, Float minigunAddSpeed)
	{
		this.type = AnimationType.ROTATION;
		this.hand = hand;
		this.minigunRotationAddSpeed = minigunAddSpeed;
	}
	
	public PacketGunAnimation(EnumHand hand, Integer reloadtime, Integer pumpdelay, Integer pumptime)
	{
		this.type = AnimationType.RELOAD;
		this.hand = hand;
		this.pumpdelay = pumpdelay;
		this.pumptime = pumptime;
		this.reloadtime = reloadtime;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		data.writeInt(encode(type));
		data.writeInt(encode(type2));
		//TODO proper enum encoding
		data.writeInt(hand.equals(EnumHand.MAIN_HAND)?0:1);
		encodeInto(ctx, data, type);
		encodeInto(ctx, data, type2);
	}

	private void encodeInto(ChannelHandlerContext ctx, ByteBuf data,AnimationType type)
	{
		switch (type)
		{
			case NONE:
				break;
				
			case ROTATION:
				data.writeFloat(minigunRotationAddSpeed);
				break;
				
			case SHOOT:
				data.writeInt(pumpdelay);
				data.writeInt(pumptime);
				data.writeFloat(recoil);
				break;
				
			case RELOAD:
				data.writeInt(pumpdelay);
				data.writeInt(pumptime);
				data.writeInt(reloadtime);
				break;
		}
	}
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
		this.type = decode(data.readInt());
		this.type2 = decode(data.readInt());
		//TODO proper enum decoding
		this.hand = data.readInt()==0?EnumHand.MAIN_HAND:EnumHand.OFF_HAND;
		decodeInto(ctx, data, type);
		decodeInto(ctx, data, type2);
	}

	private void decodeInto(ChannelHandlerContext ctx, ByteBuf data,AnimationType type)
	{
		switch (type)
		{
			case NONE:
				break;
				
			case ROTATION:
				this.minigunRotationAddSpeed = data.readFloat();
				break;
				
			case SHOOT:
				pumpdelay = data.readInt();
				pumptime = data.readInt();
				recoil = data.readFloat();
				break;
				
			case RELOAD:
				pumpdelay = data.readInt();
				pumptime = data.readInt();
				reloadtime = data.readInt();
				break;
		}
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity)
	{
		FlansMod.log.warn("Server Side should not receive this Packet");
	}

	@Override
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		GunAnimations animations = FlansModClient.getGunAnimations(clientPlayer, hand);
		
		handleAnimation(animations, type, clientPlayer);
		handleAnimation(animations, type2, clientPlayer);
	}

	private void handleAnimation(GunAnimations animations, AnimationType type, EntityPlayer player)
	{
		switch (type)
		{
			case NONE:
				break;
			
			case RELOAD:
				animations.doReload(reloadtime, pumpdelay, pumptime);
				PlayerData data = PlayerHandler.getPlayerData(player);
				data.shootTimeRight = data.shootTimeLeft = reloadtime;
				data.SetBurstRoundsRemaining(hand, 0);
				data.reloadingLeft = data.reloadingRight = true;
				break;
				
			case SHOOT:
				//TODO lookatstate not send by Server, may cause problems in future
				animations.lookAt = LookAtState.NONE;
				animations.doShoot(pumpdelay, pumptime);
				FlansModClient.playerRecoil += recoil;
				animations.recoil += recoil;
				break;
			
			case ROTATION:
				animations.addMinigunBarrelRotationSpeed(minigunRotationAddSpeed);
				break;
		}
	}
	
	//TODO proper enum decoding
	private static AnimationType decode(Integer i)
	{
		if (i == 0) {
			return AnimationType.NONE;
		} else if (i == 1) {
			return AnimationType.RELOAD;
		} else if (i == 2) {
			return AnimationType.SHOOT;
		} else if (i == 3) {
			return AnimationType.ROTATION;
		}
		throw new NullPointerException("Integer not kown");
	}
	
	//TODO proper enum encoding
	private static Integer encode(AnimationType a)
	{
		if (a == AnimationType.NONE) {
			return 0;
		} else if (a == AnimationType.RELOAD) {
			return 1;
		} else if (a == AnimationType.SHOOT) {
			return 2;
		} else if (a == AnimationType.ROTATION) {
			return 3;
		}
		throw new NullPointerException("Animation not kown");
	}
	
	public static enum AnimationType
	{
		SHOOT,RELOAD,ROTATION,NONE
	}
	
}
