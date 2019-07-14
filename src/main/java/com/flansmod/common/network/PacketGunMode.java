package com.flansmod.common.network;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.*;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;

public class PacketGunMode extends PacketBase 
{
	private int handle;

	/** Only server to client */
	public EnumFireMode mode = EnumFireMode.SEMIAUTO;
	public boolean isInSecondary;
	
	public PacketGunMode() {}

	public PacketGunMode(int aHandle)
	{
		handle = aHandle;
	}
	
	public PacketGunMode(EnumFireMode md)
	{
		this.mode = md;
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeByte(this.mode.ordinal());
		data.writeByte(handle);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		int i = data.readByte();
		if(i < EnumFireMode.values().length)
		{
			this.mode = EnumFireMode.values()[i];
		}
		this.handle = data.readByte();
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		ItemStack itemStack = playerEntity.inventory.getCurrentItem();
		if(handle == 1)
		{
			if(itemStack != null && itemStack.getItem() instanceof ItemGun)
			{
				ItemGun gun = (ItemGun) itemStack.getItem();
				EnumFireMode currentMode = gun.type.getFireMode(itemStack);
				EnumFireMode nextMode = currentMode;
				EnumFireMode[] submode = gun.type.submode;
								
				for( int i=0; i<submode.length; i++ )
				{
					if(currentMode == submode[i])
					{
						nextMode = submode[ (i + 1) % submode.length ];
						
						break;
					}
				}

				if(currentMode != nextMode)
				{
					gun.type.setFireMode(itemStack, nextMode.ordinal());
					FlansMod.getPacketHandler().sendTo(new PacketGunMode(nextMode), playerEntity);
				}
			}
		}
		else
		{
			PlayerData data = PlayerHandler.getPlayerData(playerEntity);
			if(data.shootTimeLeft <= 0)
			{
				if(itemStack != null && itemStack.getItem() instanceof ItemGun)
				{
					GunType type = ((ItemGun)itemStack.getItem()).type;
					AttachmentType attachment = type.getGrip(itemStack);

					if(attachment != null && attachment.secondaryFire)
					{
						boolean mode = type.getSecondaryFire(itemStack);
						((ItemGun)itemStack.getItem()).type.setSecondaryFire(itemStack, !mode);

						if(attachment.toggleSound != null)
							PacketPlaySound.sendSoundPacket(playerEntity.posX, playerEntity.posY, playerEntity.posZ, type.reloadSoundRange, playerEntity.dimension, attachment.toggleSound, true);
					}
				}
			}
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		ItemStack itemStack = clientPlayer.inventory.getCurrentItem();

		if(handle == 1)
		{
			if(itemStack != null && itemStack.getItem() instanceof ItemGun)
			{
				((ItemGun)itemStack.getItem()).type.setFireMode(itemStack, this.mode.ordinal());
			}
		}
		else
		{
			if(FlansModClient.shootTimeLeft <= 0)
			{
				GunType type = ((ItemGun)itemStack.getItem()).type;
				AttachmentType attachment = type.getGrip(itemStack);

				if(attachment != null && attachment.secondaryFire)
				{
					boolean mode = type.getSecondaryFire(itemStack);
					((ItemGun)itemStack.getItem()).type.setSecondaryFire(itemStack, !mode);
				}
			}
		}
	}
}
