package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityPlane;

public class PacketPlaneControl extends PacketDriveableControl
{
	public boolean gear, doors, wings;
	
	public PacketPlaneControl()
	{
	}
	
	public PacketPlaneControl(EntityDriveable driveable)
	{
		super(driveable);
		EntityPlane plane = (EntityPlane)driveable;
		gear = plane.varGear;
		doors = plane.varDoor;
		wings = plane.varWing;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		super.encodeInto(ctx, data);
		data.writeBoolean(gear);
		data.writeBoolean(doors);
		data.writeBoolean(wings);
	}
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		super.decodeInto(ctx, data);
		gear = data.readBoolean();
		doors = data.readBoolean();
		wings = data.readBoolean();
	}
	
	@Override
	protected void updateDriveable(EntityDriveable driveable, boolean clientSide)
	{
		super.updateDriveable(driveable, clientSide);
		EntityPlane plane = (EntityPlane)driveable;
		plane.varDoor = doors;
		plane.varGear = gear;
		plane.varWing = wings;
	}
}

