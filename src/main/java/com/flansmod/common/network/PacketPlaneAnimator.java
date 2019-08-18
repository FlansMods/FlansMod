package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.vector.Vector3f;

public class PacketPlaneAnimator extends PacketBase
{
	public int entityId;
	public float wingPosx, wingPosy, wingPosz;
	public float wingRotx, wingRoty, wingRotz;
	public float wingWheelPosx, wingWheelPosy, wingWheelPosz;
	public float wingWheelRotx, wingWheelRoty, wingWheelRotz;
	public float coreWheelPosx, coreWheelPosy, coreWheelPosz;
	public float coreWheelRotx, coreWheelRoty, coreWheelRotz;
	public float tailWheelPosx, tailWheelPosy, tailWheelPosz;
	public float tailWheelRotx, tailWheelRoty, tailWheelRotz;
	public float doorPosx, doorPosy, doorPosz;
	public float doorRotx, doorRoty, doorRotz;

	
	public PacketPlaneAnimator() {}
	
	public PacketPlaneAnimator(EntityPlane plane)
	{
		entityId = plane.getEntityId();
		//x
		wingPosx = plane.wingPos.x;
		wingRotx = plane.wingRot.x;
		wingWheelPosx = plane.wingWheelPos.x;
		wingWheelRotx = plane.wingWheelRot.x;
		coreWheelPosx = plane.coreWheelPos.x;
		coreWheelRotx = plane.coreWheelRot.x;
		tailWheelPosx = plane.tailWheelPos.x;
		tailWheelRotx = plane.tailWheelRot.x;
		doorPosx = plane.doorPos.x;
		doorRotx = plane.doorRot.x;
		//y
		wingPosy = plane.wingPos.y;
		wingRoty = plane.wingRot.y;
		wingWheelPosy = plane.wingWheelPos.y;
		wingWheelRoty = plane.wingWheelRot.y;
		coreWheelPosy = plane.coreWheelPos.y;
		coreWheelRoty = plane.coreWheelRot.y;
		tailWheelPosy = plane.tailWheelPos.y;
		tailWheelRoty = plane.tailWheelRot.y;
		doorPosy = plane.doorPos.y;
		doorRoty = plane.doorRot.y;
		//z
		wingPosz = plane.wingPos.z;
		wingRotz = plane.wingRot.z;
		wingWheelPosz = plane.wingWheelPos.z;
		wingWheelRotz = plane.wingWheelRot.z;
		coreWheelPosz = plane.coreWheelPos.z;
		coreWheelRotz = plane.coreWheelRot.z;
		tailWheelPosz = plane.tailWheelPos.z;
		tailWheelRotz = plane.tailWheelRot.z;
		doorPosz = plane.doorPos.z;
		doorRotz = plane.doorRot.z;
	}
		
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
    	data.writeInt(entityId);
    	//WingPos
    	data.writeFloat(wingPosx);
    	data.writeFloat(wingPosy);
    	data.writeFloat(wingPosz);
    	//WingRot
    	data.writeFloat(wingRotx);
    	data.writeFloat(wingRoty);
    	data.writeFloat(wingRotz);
    	//wingWheelPos
    	data.writeFloat(wingWheelPosx);
    	data.writeFloat(wingWheelPosy);
    	data.writeFloat(wingWheelPosz);
    	//wingWheelRot
    	data.writeFloat(wingWheelRotx);
    	data.writeFloat(wingWheelRoty);
    	data.writeFloat(wingWheelRotz);
    	//coreWheelPos
    	data.writeFloat(coreWheelPosx);
    	data.writeFloat(coreWheelPosy);
    	data.writeFloat(coreWheelPosz);
    	//coreWheelRot
    	data.writeFloat(coreWheelRotx);
    	data.writeFloat(coreWheelRoty);
    	data.writeFloat(coreWheelRotz);
    	//tailWheelPos
    	data.writeFloat(tailWheelPosx);
    	data.writeFloat(tailWheelPosy);
    	data.writeFloat(tailWheelPosz);
    	//tailWheelRot
    	data.writeFloat(tailWheelRotx);
    	data.writeFloat(tailWheelRoty);
    	data.writeFloat(tailWheelRotz);
    	//doorPos
    	data.writeFloat(doorPosx);
    	data.writeFloat(doorPosy);
    	data.writeFloat(doorPosz);
    	//doorRot
    	data.writeFloat(doorRotx);
    	data.writeFloat(doorRoty);
    	data.writeFloat(doorRotz);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		entityId = data.readInt();
		//wingPos
		wingPosx = data.readFloat();
		wingPosy = data.readFloat();
		wingPosz = data.readFloat();
		//wingRot
		wingRotx = data.readFloat();
		wingRoty = data.readFloat();
		wingRotz = data.readFloat();
		//wingWheelPos
		wingWheelPosx = data.readFloat();
		wingWheelPosy = data.readFloat();
		wingWheelPosz = data.readFloat();
		//wingWheelRot
		wingWheelRotx = data.readFloat();
		wingWheelRoty = data.readFloat();
		wingWheelRotz = data.readFloat();
		//coreWheelPos
		coreWheelPosx = data.readFloat();
		coreWheelPosy = data.readFloat();
		coreWheelPosz = data.readFloat();
		//coreWheelRot
		coreWheelRotx = data.readFloat();
		coreWheelRoty = data.readFloat();
		coreWheelRotz = data.readFloat();
		//tailWheelPos
		tailWheelPosx = data.readFloat();
		tailWheelPosy = data.readFloat();
		tailWheelPosz = data.readFloat();
		//tailWheelRot
		tailWheelRotx = data.readFloat();
		tailWheelRoty = data.readFloat();
		tailWheelRotz = data.readFloat();
		//doorPos
		doorPosx = data.readFloat();
		doorPosy = data.readFloat();
		doorPosz = data.readFloat();
		//doorRot
		doorRotx = data.readFloat();
		doorRoty = data.readFloat();
		doorRotz = data.readFloat();
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		EntityPlane plane = null;
		for(Object obj : playerEntity.worldObj.loadedEntityList)
		{
			if(obj instanceof EntityPlane && ((Entity)obj).getEntityId() == entityId)
			{
				plane = (EntityPlane)obj;
				break;
			}
		}
		if(plane != null)
			updateDriveable(plane, false);
	}
	
	protected void updateDriveable(EntityPlane plane, boolean clientSide)
	{
		plane.wingPos = new Vector3f(wingPosx, wingPosy, wingPosz);
		plane.wingRot = new Vector3f(wingRotx, wingRoty, wingRotz);
		plane.wingWheelPos = new Vector3f(wingWheelPosx, wingWheelPosy, wingWheelPosz);
		plane.wingWheelRot = new Vector3f(wingWheelRotx, wingWheelRoty, wingWheelRotz);
		plane.coreWheelPos = new Vector3f(coreWheelPosx, coreWheelPosy, coreWheelPosz);
		plane.coreWheelRot = new Vector3f(coreWheelRotx, coreWheelRoty, coreWheelRotz);
		plane.tailWheelPos = new Vector3f(tailWheelPosx, tailWheelPosy, tailWheelPosz);
		plane.tailWheelRot = new Vector3f(tailWheelRotx, tailWheelRoty, tailWheelRotz);
		plane.doorPos = new Vector3f(doorPosx, doorPosy, doorPosz);
		plane.doorRot = new Vector3f(doorRotx, doorRoty, doorRotz);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		if(clientPlayer == null || clientPlayer.worldObj == null)
			return;
		EntityPlane plane = null;
		for(Object obj : clientPlayer.worldObj.loadedEntityList)
		{
			if(obj instanceof EntityPlane && ((Entity)obj).getEntityId() == entityId)
			{
				plane = (EntityPlane)obj;
				if(plane.seats[0] != null && plane.seats[0].riddenByEntity == clientPlayer)
					return;
				break;
			}
		}
		if(plane != null){
			updateDriveable(plane, true);
		}
	}
}
