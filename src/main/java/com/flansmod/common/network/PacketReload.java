package com.flansmod.common.network;

import com.flansmod.common.guns.*;
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

//When the client receives one, it "reloads". Basically to stop client side recoil effects when the gun should be in a reload animation
//When the server receives one, it is interpreted as a forced reload
public class PacketReload extends PacketBase 
{
	public boolean left;
	public Integer amount = 0;
	public Integer reloadTime = 0;
	
	public PacketReload() {}
	
	public PacketReload(boolean l) 
	{
		left = l;
	}
	
	public PacketReload(boolean l, int count, int reload) 
	{
		left = l;
		amount = count;
		reloadTime = reload;
	}
		
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeBoolean(left);
		data.writeInt(amount);
		data.writeInt(reloadTime);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		left = data.readBoolean();
		amount = data.readInt();
		reloadTime = data.readInt();
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
    	PlayerData data = PlayerHandler.getPlayerData(playerEntity);
    	ItemStack gunStack = playerEntity.getCurrentEquippedItem();
    	if(left && data.offHandGunSlot != 0)
    	{
    		gunStack = playerEntity.inventory.getStackInSlot(data.offHandGunSlot - 1);
    	}
    	if(data != null && gunStack != null && gunStack.getItem() instanceof ItemGun)
    	{
    		GunType type = ((ItemGun)gunStack.getItem()).type;
			//Check if the gun is empty
			boolean empty = true;
			for(int i = 0; i < type.getNumAmmoItemsInGun(gunStack); i++)
			{
				ItemStack bulletStack = ((ItemGun)gunStack.getItem()).getBulletItemStack(gunStack, i);
				if(bulletStack != null && bulletStack.getItem() != null && bulletStack.getItemDamage() < bulletStack.getMaxDamage())
				{
					empty = false;
					break;
				}
			}
			
			int maxAmmo = type.getNumAmmoItemsInGun(gunStack);
			boolean singlesReload = maxAmmo > 1;
			int reloadCount;
			
			if(singlesReload)
			{
				reloadCount = 0;
				for(int i = 0; i < type.getNumAmmoItemsInGun(gunStack); i++)
				{
					ItemStack oldBulletStack = ((ItemGun)gunStack.getItem()).getBulletItemStack(gunStack, i);
					if(oldBulletStack != null && (oldBulletStack.getMaxDamage() - oldBulletStack.getItemDamage()) == 0)
					{
						reloadCount += 1;
					} else if(oldBulletStack == null)
					{
						reloadCount += 1;
					}
				}
			} else
			{
				reloadCount = 1;
			}

    		if(((ItemGun)gunStack.getItem()).reload(gunStack, type, playerEntity.worldObj, playerEntity, true, left))
    		{
    			float reloadTime = singlesReload ? (type.reloadTime / maxAmmo) * reloadCount : type.reloadTime;
    			data.shootTimeRight = data.shootTimeLeft = reloadTime;
    			    			
    			//Set the reload delay
    			if(left)
    				data.reloadingLeft = true;
    			else data.reloadingRight = true;
				//Send reload packet to induce reload effects client side
    			
				FlansMod.getPacketHandler().sendTo(new PacketReload(left, reloadCount, (int) reloadTime), playerEntity);

				//Play reload sound, empty variant if not null
				String soundToPlay = null;
				AttachmentType grip = type.getGrip(gunStack);

				if(type.getSecondaryFire(gunStack) && grip != null && grip.secondaryReloadSound != null)
					soundToPlay = grip.secondaryReloadSound;
				else if(empty && type.reloadSoundOnEmpty != null)
					soundToPlay = type.reloadSoundOnEmpty;
				else if(type.reloadSound != null)
					soundToPlay = type.reloadSound;

				if(soundToPlay != null && maxAmmo == 1)
					PacketPlaySound.sendSoundPacket(playerEntity.posX, playerEntity.posY, playerEntity.posZ, type.reloadSoundRange, playerEntity.dimension, soundToPlay, true);
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
    			FlansModClient.shootTimeLeft = (int)type.getReloadTime(stack);
    		else FlansModClient.shootTimeRight = (int)type.getReloadTime(stack);
    		
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
			int chargeDelay = type.model == null ? 0 : type.model.chargeDelayAfterReload;
			int chargeTime = type.model == null ? 1 : type.model.chargeTime;
			animations.doReload(reloadTime, pumpDelay, pumpTime, chargeDelay, chargeTime, amount);
    		
			//Iterate over all inventory slots and find the magazine / bullet item with the most bullets
			int bestSlot = -1;
			int bulletsInBestSlot = 0;
			for (int j = 0; j < clientPlayer.inventory.getSizeInventory(); j++)
			{
				ItemStack item = clientPlayer.inventory.getStackInSlot(j);
				if (item != null && item.getItem() instanceof ItemShootable && type.isAmmo(((ItemShootable)(item.getItem())).type, stack))
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
