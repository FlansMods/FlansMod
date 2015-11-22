package com.flansmod.common.network;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;

import cpw.mods.fml.relauncher.Side;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.network.ByteBufUtils;

public class PacketOffHandGunInfo extends PacketBase 
{
	public int entityID;
	public ItemStack gunStack;
	
	public PacketOffHandGunInfo()
	{
		
	}
			
	public PacketOffHandGunInfo(EntityPlayerMP playerEntity, int slot) 
	{
		entityID = playerEntity.getEntityId();
		if(slot == 0)
			gunStack = null;
		else gunStack = playerEntity.inventory.getStackInSlot(slot - 1);
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeInt(entityID);
		ByteBufUtils.writeItemStack(data, gunStack);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		entityID = data.readInt();
		gunStack = ByteBufUtils.readItemStack(data);
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		FlansMod.log("Received off hand gun info packet on server. Skipping. Did you mean to send a PacketSelectOffHandGun?");
	}

	@Override
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		Entity entity = clientPlayer.worldObj.getEntityByID(entityID);
		if(entity instanceof EntityPlayer && entity != clientPlayer)
		{
			PlayerData data = PlayerHandler.getPlayerData((EntityPlayer) entity, Side.CLIENT);
			data.offHandGunStack = gunStack;
		}
	}

}
