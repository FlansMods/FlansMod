package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemGun;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

//When the client receives one, it "reloads". Basically to stop client side recoil effects when the gun should be in a reload animation
//When the server receives one, it is interpreted as a forced reload
public class PacketReload extends PacketBase 
{
	public PacketReload() {}
		
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
    	PlayerData data = PlayerHandler.getPlayerData(playerEntity);
    	ItemStack stack = playerEntity.getCurrentEquippedItem();
    	if(data != null && stack != null && stack.getItem() instanceof ItemGun)
    	{
    		GunType type = ((ItemGun)stack.getItem()).type;
    		if(((ItemGun)stack.getItem()).reload(stack, playerEntity.worldObj, playerEntity, true))
    		{
    			//Set the reload delay
    			data.shootTime = type.reloadTime;
    			data.reloading = true;
				//Send reload packet to induce reload effects client side
				FlansMod.getPacketHandler().sendTo(new PacketReload(), playerEntity);
				//Play reload sound
				if(type.reloadSound != null)
					PacketPlaySound.sendSoundPacket(playerEntity.posX, playerEntity.posY, playerEntity.posZ, FlansMod.soundRange, playerEntity.dimension, type.reloadSound, false);
    		}
    	}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
    	ItemStack stack = clientPlayer.getCurrentEquippedItem();
    	if(stack != null && stack.getItem() instanceof ItemGun)
    	{
    		GunType type = ((ItemGun)stack.getItem()).type;
    		FlansModClient.shootTime = type.reloadTime;
    		
    		//Apply animations
    		GunAnimations animations = null;
			if(FlansModClient.gunAnimations.containsKey(clientPlayer))
				animations = FlansModClient.gunAnimations.get(clientPlayer);
			else 
			{
				animations = new GunAnimations();
				FlansModClient.gunAnimations.put((EntityLivingBase)clientPlayer, animations);
			}
			int pumpDelay = type.model == null ? 0 : type.model.pumpDelayAfterReload;
			int pumpTime = type.model == null ? 1 : type.model.pumpTime;
			animations.doReload(type.reloadTime, pumpDelay, pumpTime);
    		
			//Iterate over all inventory slots and find the magazine / bullet item with the most bullets
			int bestSlot = -1;
			int bulletsInBestSlot = 0;
			for (int j = 0; j < clientPlayer.inventory.getSizeInventory(); j++)
			{
				ItemStack item = clientPlayer.inventory.getStackInSlot(j);
				if (item != null && item.getItem() instanceof ItemBullet && type.isAmmo(((ItemBullet)(item.getItem())).type))
				{
					int bulletsInThisSlot = item.getMaxDamage() - item.getItemDamage();
					if(bulletsInThisSlot > bulletsInBestSlot)
					{
						bestSlot = j;
						bulletsInBestSlot = bulletsInThisSlot;
					}
				}
			}
			//If there was a valid non-empty magazine / bullet item somewhere in the inventory, take one to put in the gun
			if(bestSlot != -1)
			{
				ItemStack newBulletStack = clientPlayer.inventory.getStackInSlot(bestSlot);
				BulletType newBulletType = ((ItemBullet)newBulletStack.getItem()).type;
				//Remove the magazine from the inventory
				if(!clientPlayer.capabilities.isCreativeMode)
					newBulletStack.stackSize--;
				if(newBulletStack.stackSize <= 0)
					newBulletStack = null;
				clientPlayer.inventory.setInventorySlotContents(bestSlot, newBulletStack);
			}
    	}
	}
}
