package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.network.ByteBufUtils;

import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.driveables.mechas.EnumMechaSlotType;

public class PacketMechaControl extends PacketDriveableControl 
{
	public float legYaw, legSwing;
	public ItemStack leftStack, rightStack;
	
	public float leftLegUpperAngle, leftLegLowerAngle, leftFootAngle, rightLegUpperAngle, rightLegLowerAngle ,rightFootAngle;
	
	public float prevLeftLegUpperAngle, prevLeftLegLowerAngle, prevLeftFootAngle, prevRightLegUpperAngle, prevRightLegLowerAngle ,prevRightFootAngle;

	
	public PacketMechaControl() {}

	public PacketMechaControl(EntityDriveable driveable) 
	{
		super(driveable);
		EntityMecha mecha = (EntityMecha)driveable;
		legYaw = mecha.legAxes.getYaw();
		legSwing = mecha.legSwing;
		leftStack = mecha.inventory.getStackInSlot(EnumMechaSlotType.leftTool);
		rightStack = mecha.inventory.getStackInSlot(EnumMechaSlotType.rightTool);
		leftLegUpperAngle = mecha.leftLegUpperAngle;
		leftLegLowerAngle = mecha.leftLegLowerAngle;
		leftFootAngle = mecha.leftFootAngle;
		rightLegUpperAngle = mecha.rightLegUpperAngle;
		rightLegLowerAngle = mecha.rightLegLowerAngle;
		rightFootAngle = mecha.rightFootAngle;
		prevLeftLegUpperAngle = mecha.prevLeftLegUpperAngle;
		prevLeftLegLowerAngle = mecha.prevLeftLegLowerAngle;
		prevLeftFootAngle = mecha.prevLeftFootAngle;
		prevRightLegUpperAngle = mecha.prevRightLegUpperAngle;
		prevRightLegLowerAngle = mecha.prevRightLegLowerAngle;
		prevRightFootAngle = mecha.prevRightFootAngle;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
    	super.encodeInto(ctx, data);
    	data.writeFloat(legYaw);
    	data.writeFloat(legSwing);
    	data.writeFloat(leftLegUpperAngle);
    	data.writeFloat(leftLegLowerAngle);
    	data.writeFloat(leftFootAngle);
    	data.writeFloat(rightLegLowerAngle);
    	data.writeFloat(rightLegUpperAngle);
    	data.writeFloat(rightFootAngle);
    	data.writeFloat(prevLeftLegUpperAngle);
    	data.writeFloat(prevLeftLegLowerAngle);
    	data.writeFloat(prevLeftFootAngle);
    	data.writeFloat(prevRightLegLowerAngle);
    	data.writeFloat(prevRightLegUpperAngle);
    	data.writeFloat(prevRightFootAngle);
    	ByteBufUtils.writeItemStack(data, leftStack);
    	ByteBufUtils.writeItemStack(data, rightStack);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		super.decodeInto(ctx, data);
		legYaw = data.readFloat();
		legSwing = data.readFloat();
		leftLegUpperAngle = data.readFloat();
		leftLegLowerAngle = data.readFloat();
		leftFootAngle = data.readFloat();
		rightLegUpperAngle = data.readFloat();
		rightLegLowerAngle = data.readFloat();
		rightFootAngle = data.readFloat();
		prevLeftLegUpperAngle = data.readFloat();
		prevLeftLegLowerAngle = data.readFloat();
		prevLeftFootAngle = data.readFloat();
		prevRightLegUpperAngle = data.readFloat();
		prevRightLegLowerAngle = data.readFloat();
		prevRightFootAngle = data.readFloat();
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
		//mecha.leftLegUpperAngle = leftLegUpperAngle;
		//mecha.leftLegLowerAngle = leftLegLowerAngle;
		//mecha.leftFootAngle = leftFootAngle;
		//mecha.rightLegUpperAngle = rightLegUpperAngle;
		//mecha.rightLegLowerAngle = rightLegLowerAngle;
		//mecha.rightFootAngle = rightFootAngle;
		//mecha.prevLeftLegUpperAngle = prevLeftLegUpperAngle;
		//mecha.prevLeftLegLowerAngle = prevLeftLegLowerAngle;
		//mecha.prevLeftFootAngle = prevLeftFootAngle;
		//mecha.prevRightLegUpperAngle = prevRightLegUpperAngle;
		//mecha.prevRightLegLowerAngle = prevRightLegLowerAngle;
		//mecha.prevRightFootAngle = prevRightFootAngle;
		mecha.setLegAngles(leftLegUpperAngle, prevLeftLegUpperAngle, rightLegUpperAngle, prevRightLegUpperAngle, leftLegLowerAngle, prevLeftLegLowerAngle, rightLegLowerAngle, prevRightLegLowerAngle, leftFootAngle, prevLeftFootAngle, rightFootAngle, prevRightFootAngle);
		if(clientSide)
		{
			mecha.inventory.setInventorySlotContents(EnumMechaSlotType.leftTool, leftStack);
			mecha.inventory.setInventorySlotContents(EnumMechaSlotType.rightTool, rightStack);
		}
	}
}
