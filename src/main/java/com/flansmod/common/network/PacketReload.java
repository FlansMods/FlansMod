package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ItemShootable;
import com.flansmod.common.guns.ShootableType;

//When the client receives one, it "reloads". Basically to stop client side recoil effects when the gun should be in a reload animation
//When the server receives one, it is interpreted as a forced reload
public class PacketReload extends PacketBase 
{
	public boolean left;
	
	public PacketReload() {}
	
	public PacketReload(boolean l) 
	{
		left = l;
	}
		
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeBoolean(left);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		left = data.readBoolean();
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
    	PlayerData data = PlayerHandler.getPlayerData(playerEntity);
    	ItemStack stack = playerEntity.getCurrentEquippedItem();
    	if(left && data.offHandGunSlot != 0)
    	{
    		stack = playerEntity.inventory.getStackInSlot(data.offHandGunSlot - 1);
    	}
    	if(data != null && stack != null && stack.getItem() instanceof ItemGun)
    	{
    		GunType type = ((ItemGun)stack.getItem()).type;
    		if(((ItemGun)stack.getItem()).reload(stack, type, playerEntity.worldObj, playerEntity, true, left))
    		{
    			//Set the reload delay
    			data.shootTimeRight = data.shootTimeLeft = type.reloadTime;
    			if(left)
    				data.reloadingLeft = true;
    			else data.reloadingRight = true;
				//Send reload packet to induce reload effects client side
				FlansMod.getPacketHandler().sendTo(new PacketReload(left), playerEntity);
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
    	PlayerData data = PlayerHandler.getPlayerData(clientPlayer, Side.CLIENT);
    	if(left)
    		stack = clientPlayer.inventory.getStackInSlot(data.offHandGunSlot - 1);
    	if(stack != null && stack.getItem() instanceof ItemGun)
    	{
    		GunType type = ((ItemGun)stack.getItem()).type;
    		if(left)
    			FlansModClient.shootTimeLeft = type.reloadTime;
    		else FlansModClient.shootTimeRight = type.reloadTime;
    		
    		//Apply animations
    		GunAnimations animations = null;
    		if(left)
    		{
    			if(FlansModClient.gunAnimationsLeft.containsKey(clientPlayer))
					animations = FlansModClient.gunAnimationsLeft.get(clientPlayer);
				else 
				{
					animations = new GunAnimations();
					FlansModClient.gunAnimationsLeft.put(clientPlayer, animations);
				}
    		}
    		else
    		{
				if(FlansModClient.gunAnimationsRight.containsKey(clientPlayer))
					animations = FlansModClient.gunAnimationsRight.get(clientPlayer);
				else 
				{
					animations = new GunAnimations();
					FlansModClient.gunAnimationsRight.put(clientPlayer, animations);
				}
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
				if (item != null && item.getItem() instanceof ItemShootable && type.isAmmo(((ItemShootable)(item.getItem())).type))
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
				ShootableType newBulletType = ((ItemShootable)newBulletStack.getItem()).type;
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
