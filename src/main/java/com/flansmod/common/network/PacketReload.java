package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;

/**
 * This packet is send by the client to request a reload. The server checks if the player can reload and in this case actually reloads and sends a GunAnimationPacket as response.
 * The GunAnimationPacket plays the reload animation and sets the pumpDelay & pumpTime times to prevent the client from shooting while reloading
 */
public class PacketReload extends PacketBase
{
	public boolean isOffHand;
	public boolean isForced;
	
	public PacketReload()
	{
	}
	
	public PacketReload(EnumHand hand, boolean isForced)
	{
		this.isOffHand = hand == EnumHand.OFF_HAND;
		this.isForced = isForced;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		data.writeBoolean(isOffHand);
		data.writeBoolean(isForced);
	}
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		isOffHand = data.readBoolean();
		isForced = data.readBoolean();
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity)
	{
		EnumHand hand = isOffHand ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND;
		PlayerData data = PlayerHandler.getPlayerData(playerEntity);
		ItemStack main = playerEntity.getHeldItemMainhand();
		ItemStack off = playerEntity.getHeldItemOffhand();
		ItemStack stack = isOffHand ? off : main;
		boolean hasOffHand = main != null && !main.isEmpty() && off != null && !off.isEmpty();
		if(data != null && stack != null && stack.getItem() instanceof ItemGun)
		{
			GunType type = ((ItemGun)stack.getItem()).GetType();
			
			if(((ItemGun)stack.getItem()).Reload(stack, playerEntity.world, playerEntity, playerEntity.inventory, hand, hasOffHand, isForced, playerEntity.capabilities.isCreativeMode))
			{
				//Set the reload delay
				data.shootTimeRight = data.shootTimeLeft = type.reloadTime;
				if(isOffHand)
					data.reloadingLeft = true;
				else data.reloadingRight = true;
				//Play reload sound
				if(type.reloadSound != null)
					PacketPlaySound.sendSoundPacket(playerEntity.posX, playerEntity.posY, playerEntity.posZ, FlansMod.soundRange, playerEntity.dimension, type.reloadSound, false);
			
				FlansMod.getPacketHandler().sendTo(new PacketGunAnimation(hand, type.reloadTime, type.getPumpDelayAfterReload(), type.getPumpTime()), playerEntity);
			}
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		FlansMod.log.warn("Recieved reload packet on client!");
	}
}
