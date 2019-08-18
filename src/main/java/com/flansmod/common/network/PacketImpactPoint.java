package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.ItemGun;

public class PacketImpactPoint extends PacketBase
{
	public int x;
	public int y;
	public int z;
	//public String pname;
	public int entityId;

	public PacketImpactPoint() {}

	public PacketImpactPoint(int x, int y, int z, int entityId)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.entityId = entityId;
		//this.pname = pName;
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		data.writeInt(x);
		data.writeInt(y);
		data.writeInt(z);
		data.writeInt(entityId);
		//writeUTF(data, pname);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		x = data.readInt();
		y = data.readInt();
		z = data.readInt();
		entityId = data.readInt();
		//pname = readUTF(data);
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity)
	{
		ItemGun itemGun;
		//if(playerEntity.getDisplayName().equals(pname))
		if(playerEntity.getCurrentEquippedItem() != null)
		if(playerEntity.getCurrentEquippedItem().getItem() instanceof ItemGun)
		{
			itemGun = (ItemGun)playerEntity.getCurrentEquippedItem().getItem();
			itemGun.impactX = x;
			itemGun.impactY = y;
			itemGun.impactZ = z;
		}
		//FlansMod.log("Received flashBang packet on server. Disregarding.");
		//FlansMod.getPacketHandler().sendTo(new PacketFlashBang(time),playerEntity);
		//FlansMod.log("aaaaaaaaaaaaaaaaa");
		//FlansMod.getPacketHandler().sendToAll(new PacketImpactPoint(x, y, z, entityId));
	}

	@Override
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		/*if(clientPlayer == null || clientPlayer.worldObj == null)
			return;
		//System.out.println(clientPlayer);
		for(Object obj : clientPlayer.worldObj.loadedEntityList)
		{
			EntityPlayer entP;
			ItemGun itemGun;
			if(obj instanceof EntityPlayer && ((Entity)obj).getEntityId() == entityId)
			{
				entP = (EntityPlayer)obj;
				if(entP.getCurrentEquippedItem() != null)
					if(entP.getCurrentEquippedItem().getItem() instanceof ItemGun)
					{
						itemGun = (ItemGun)entP.getCurrentEquippedItem().getItem();
						itemGun.impactX = x;
						itemGun.impactY = y;
						itemGun.impactZ = z;
						System.out.println("getaaaaaaaaaaaaaaa");
						break;
					}
			}
		}*/
			FlansMod.log("Received impactpoint packet on client. Disregarding.");
	}

}

