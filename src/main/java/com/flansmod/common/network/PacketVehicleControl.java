package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityVehicle;

public class PacketVehicleControl extends PacketDriveableControl 
{
	public boolean doors;
	
	public PacketVehicleControl() {}

	public PacketVehicleControl(EntityDriveable driveable) 
	{
		super(driveable);
		EntityVehicle vehicle = (EntityVehicle)driveable;
		doors = vehicle.varDoor;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
    	super.encodeInto(ctx, data);
    	data.writeBoolean(doors);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		super.decodeInto(ctx, data);
		doors = data.readBoolean();
	}
	
	@Override
	protected void updateDriveable(EntityDriveable driveable, boolean clientSide)
	{
		super.updateDriveable(driveable, clientSide);
		EntityVehicle vehicle = (EntityVehicle)driveable;
		vehicle.varDoor = doors;
	}
}
