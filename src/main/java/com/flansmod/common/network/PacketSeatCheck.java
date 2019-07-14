package com.flansmod.common.network;

import java.util.Iterator;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.rcon.RConConsoleSource;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EntitySeat;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PacketSeatCheck extends PacketBase 
{
	public int entityId;
	public int checkCount;
	
	public PacketSeatCheck() {}

	public PacketSeatCheck(EntitySeat seat)
	{
		entityId = seat.getEntityId();
		checkCount = 3;
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeInt(entityId);
		data.writeInt(checkCount);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		entityId = data.readInt();
		checkCount = data.readInt();
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		log("handleServerSide", playerEntity);
		
		if(checkCount <= 0)
		{
			ChatComponentText cct1 = new ChatComponentText("[FlansMod] "+playerEntity.getDisplayName()+" was recovering from a fall. id=" + entityId);
			cct1.getChatStyle().setColor(EnumChatFormatting.YELLOW);
			ChatComponentText cct2 = new ChatComponentText("[FlansMod]================================================");
			cct2.getChatStyle().setColor(EnumChatFormatting.RED);
			
/*
			Iterator iterator = MinecraftServer.getServer().getConfigurationManager().playerEntityList.iterator();

			while (iterator.hasNext())
			{
				EntityPlayer entityplayer = (EntityPlayer)iterator.next();
				entityplayer.addChatMessage(cct2);
				entityplayer.addChatMessage(cct1);
				entityplayer.addChatMessage(cct2);
			}
*/
		}
		else
		{
			if(playerEntity.ridingEntity instanceof EntitySeat)
			{
				entityId = playerEntity.ridingEntity.getEntityId();
			}
			else
			{
				entityId = -1;
			}
			FlansMod.getPacketHandler().sendTo(this, playerEntity);
		}
	}

	private void log(String s, EntityPlayer player)
	{
		Entity re = player.ridingEntity;
		System.out.println(s +" :"+player.getDisplayName()+
				" : rideEntity="+(re!=null? re.getClass().getName(): re)+
				" : seatEntityId="+entityId+
				" : check="+checkCount);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		log("handleClientSide", clientPlayer);
		
		if(clientPlayer.ridingEntity==null && entityId != -1)
		{
			if(checkCount > 1)
			{
				checkCount--;
			}
			else
			{
				checkCount--;
				Entity entity = clientPlayer.worldObj.getEntityByID(entityId);
				if(entity instanceof EntitySeat)
				{
					System.out.println("mount seat :"+clientPlayer.getDisplayName()+
							" : seatEntityId="+entityId+
							" : check="+checkCount);

					clientPlayer.mountEntity(entity);
				}
			}
			FlansMod.getPacketHandler().sendToServer(this);
		}
	}
}
