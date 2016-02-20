package com.flansmod.common.network;

import java.util.ArrayList;
import java.util.List;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.guns.ShotData;
import com.flansmod.common.guns.ShotData.InstantShotData;
import com.flansmod.common.guns.ShotData.SpawnEntityShotData;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PacketShotData extends PacketBase 
{
	private List<ShotData> shotData;
	
	public PacketShotData() {}
	
	public PacketShotData(List<ShotData> shotData)
	{
		this.shotData = shotData;
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeInt(shotData.size());
		for(int i = 0; i < shotData.size(); i++)
		{
			ShotData current = shotData.get(i);
			data.writeByte((byte)current.slot);
			data.writeInt(current.shotFrom.hashCode());
			data.writeInt(current.shotType.hashCode());
			
			if(current instanceof SpawnEntityShotData)
			{
				SpawnEntityShotData currentCast = (SpawnEntityShotData)current;
				data.writeByte(0);
				data.writeInt(currentCast.shooterID);
				currentCast.direction.writeToBuffer(data);
			}
			else if(current instanceof InstantShotData)
			{
				InstantShotData currentCast = (InstantShotData)current;
				data.writeByte(1);
				data.writeInt(currentCast.shooterID);
				currentCast.origin.writeToBuffer(data);
				data.writeInt(currentCast.victimID);
				currentCast.hit.writeToBuffer(data);
			}			
		}
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		shotData = new ArrayList<ShotData>();
		int numEntries = data.readInt();
		for(int i = 0; i < numEntries; i++)
		{
			// Lookup types by hash
			byte slot = data.readByte();
			InfoType shotFrom = InfoType.getType(data.readInt());	
			ShootableType shotType = ShootableType.getShootableType(data.readInt());
			
			byte dataType = data.readByte();
			switch(dataType)
			{
				case 0: // SpawnEntityShotData
				{
					int shooterID = data.readInt();
					Vector3f direction = Vector3f.readFromBuffer(data);
					
					shotData.add(new SpawnEntityShotData(slot, shotFrom, shotType, shooterID, direction));
					break;
				}
				case 1: // InstantShotData
				{
					int shooterID = data.readInt();
					Vector3f origin = Vector3f.readFromBuffer(data);
					int victimID = data.readInt();
					Vector3f hit = Vector3f.readFromBuffer(data);
					
					shotData.add(new InstantShotData(slot, shotFrom, shotType, shooterID, origin, victimID, hit));
					break;
				}
				default:
					break;
			}
		}
	}

	@Override
	public void handleServerSide(EntityPlayerMP player) 
	{
		PlayerData data = PlayerHandler.getPlayerData(player, Side.SERVER);
		
		for(ShotData entry : shotData)
		{
			ItemStack gunStack = player.inventory.getStackInSlot(entry.slot);
			if(gunStack != null && gunStack.getItem() instanceof ItemGun)
			{
				ItemGun gunItem = (ItemGun)gunStack.getItem();
				boolean isOffHand = (data.offHandGunSlot + 1 == entry.slot);
				gunItem.ServerHandleShotData(gunStack, entry.slot, player.worldObj, player, isOffHand, entry);
			}
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		FlansMod.log("Received gun button packet on client. Skipping.");
	}
}
