package com.flansmod.common.network;

import java.util.ArrayList;
import java.util.List;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.guns.ShotData;
import com.flansmod.common.guns.ShotData.InstantShotData;
import com.flansmod.common.guns.ShotData.SpawnEntityShotData;
import com.flansmod.common.guns.raytracing.FlansModRaytracer;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.BulletHit;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;

public class PacketShotData extends PacketBase
{
	private List<ShotData> shotData;
	
	public PacketShotData()
	{
	}
	
	public PacketShotData(List<ShotData> shotData)
	{
		this.shotData = shotData;
	}
	
	public PacketShotData(ShotData shotData)
	{
		this.shotData = new ArrayList<>();
		this.shotData.add(shotData);
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		data.writeInt(shotData.size());
		for(ShotData current : shotData)
		{
			data.writeByte((byte)current.slot);
			data.writeInt(current.shotFrom.hashCode());
			data.writeInt(current.shotType.hashCode());
			data.writeBoolean(current.hand == EnumHand.MAIN_HAND);
			
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
				FlansModRaytracer.WriteToBuffer(currentCast.hitData, data);
				currentCast.hitPos.writeToBuffer(data);
				data.writeFloat(currentCast.damage);
				data.writeBoolean(currentCast.isExtraBullet);
				data.writeBoolean(currentCast.silenced);
			}
		}
	}
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		shotData = new ArrayList<>();
		int numEntries = data.readInt();
		for(int i = 0; i < numEntries; i++)
		{
			// Lookup types by hash
			byte slot = data.readByte();
			InfoType shotFrom = InfoType.getType(data.readInt());
			ShootableType shotType = ShootableType.getShootableType(data.readInt());
			EnumHand hand = data.readBoolean() ? EnumHand.MAIN_HAND : EnumHand.OFF_HAND;
			
			byte dataType = data.readByte();
			switch(dataType)
			{
				case 0: // SpawnEntityShotData
				{
					int shooterID = data.readInt();
					Vector3f direction = Vector3f.readFromBuffer(data);
					
					shotData.add(new SpawnEntityShotData(slot, hand, shotFrom, shotType, shooterID, direction));
					break;
				}
				case 1: // InstantShotData
				{
					int shooterID = data.readInt();
					Vector3f origin = Vector3f.readFromBuffer(data);
					BulletHit hitData = FlansModRaytracer.ReadFromBuffer(data);
					Vector3f hit = Vector3f.readFromBuffer(data);
					float damage = data.readFloat();
					boolean isExtraBullet = data.readBoolean();
					boolean silenced = data.readBoolean();
					
					shotData.add(new InstantShotData(slot, hand, shotFrom, shotType, shooterID, origin, hitData, hit, damage, isExtraBullet, silenced));
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
		for(ShotData entry : shotData)
		{
			if(entry.slot == -1)
			{
				if(entry.shotFrom instanceof GunType)
				{
					((ItemGun)entry.shotFrom.item).handlePlayerShotData(null, entry.slot, player.world, player, false, entry);
				}
			}
			else if(entry.hand == EnumHand.OFF_HAND)
			{
				ItemStack gunStack = player.getHeldItemOffhand();
				if(gunStack.getItem() instanceof ItemGun)
				{
					ItemGun gunItem = (ItemGun)gunStack.getItem();
					gunItem.handlePlayerShotData(gunStack, entry.slot, player.world, player, true, entry);
				}
			}
			else
			{
				ItemStack gunStack = player.inventory.getStackInSlot(entry.slot);
				if(gunStack.getItem() instanceof ItemGun)
				{
					ItemGun gunItem = (ItemGun)gunStack.getItem();
					gunItem.handlePlayerShotData(gunStack, entry.slot, player.world, player, false, entry);
				}
			}
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		for(ShotData entry : shotData)
		{
			if(entry instanceof InstantShotData)
			{
				InstantShotData instantData = ((InstantShotData)entry);
				if(entry.shotFrom instanceof GunType)
				{
					ItemGun gunItem = (ItemGun)entry.shotFrom.getItem();
					
					gunItem.doInstantShot(clientPlayer.world,
							(EntityLivingBase)FlansModRaytracer.GetEntityByID(instantData.shooterID),
							instantData.shotFrom, (BulletType)instantData.shotType,
							instantData.origin, instantData.hitPos,
							instantData.hitData, instantData.damage,
							instantData.isExtraBullet,
							instantData.silenced);
				}
			}
			else
			{
				FlansMod.log.warn("Only expect instant shot types on client side.");
			}
		}
	}
}
