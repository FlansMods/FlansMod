package com.flansmod.common.network;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.driveables.mechas.EnumMechaSlotType;

import cpw.mods.fml.common.network.ByteBufUtils;

public class PacketMechaControl extends PacketDriveableControl 
{
	public float legYaw, legSwing;
	public ItemStack leftStack, rightStack;
	
	public PacketMechaControl() {}

	public PacketMechaControl(EntityDriveable driveable) 
	{
		super(driveable);
		EntityMecha mecha = (EntityMecha)driveable;
		legYaw = mecha.legAxes.getYaw();
		legSwing = mecha.legSwing;
		leftStack = mecha.inventory.getStackInSlot(EnumMechaSlotType.leftTool);
		rightStack = mecha.inventory.getStackInSlot(EnumMechaSlotType.rightTool);
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
    	super.encodeInto(ctx, data);
    	data.writeFloat(legYaw);
    	data.writeFloat(legSwing);
    	ByteBufUtils.writeItemStack(data, leftStack);
    	ByteBufUtils.writeItemStack(data, rightStack);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		super.decodeInto(ctx, data);
		legYaw = data.readFloat();
		legSwing = data.readFloat();
		leftStack = ByteBufUtils.readItemStack(data);
		rightStack = ByteBufUtils.readItemStack(data);
	}
	
	@Override
	protected void updateDriveable(EntityDriveable driveable, boolean clientSide)
	{
		super.updateDriveable(driveable, clientSide);
		EntityMecha mecha = (EntityMecha)driveable;
		mecha.legAxes.setAngles(legYaw, 0F, 0F);
		mecha.legSwing = legSwing / 2F;
		if(clientSide)
		{
			mecha.inventory.setInventorySlotContents(EnumMechaSlotType.leftTool, leftStack);
			mecha.inventory.setInventorySlotContents(EnumMechaSlotType.rightTool, rightStack);
		}
	}
}
