package com.flansmod.common.network;

import com.flansmod.client.model.InstantBulletRenderer;
import com.flansmod.client.model.InstantBulletRenderer.InstantShotTrail;
import com.flansmod.common.FlansMod;
import com.flansmod.common.vector.Vector3f;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketBulletTrail extends PacketBase
{

	private Vector3f origin;
	private Vector3f hitPos;
	private Float width;
	private Float length;
	private Float bulletSpeed;
	private String trailTexture;
	
	public PacketBulletTrail()
	{
	}
	
	public PacketBulletTrail(Vector3f origin, Vector3f hitPos, Float width, Float length, Float bulletSpeed, String trailTexture)
	{
		this.origin = origin;
		this.hitPos = hitPos;
		this.width = width;
		this.length = length;
		this.bulletSpeed = bulletSpeed;
		this.trailTexture = trailTexture;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		//origin Vector
		data.writeFloat(origin.x);
		data.writeFloat(origin.y);
		data.writeFloat(origin.z);
		//hit position vector
		data.writeFloat(hitPos.x);
		data.writeFloat(hitPos.y);
		data.writeFloat(hitPos.z);
		// trail width, length and speed
		data.writeFloat(width);
		data.writeFloat(length);
		data.writeFloat(bulletSpeed);
		//trailTexture
		writeUTF(data, trailTexture);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		//origin Vector
		origin = new Vector3f(data.readFloat(), data.readFloat(), data.readFloat());
		//hit position vector
		hitPos = new Vector3f(data.readFloat(), data.readFloat(), data.readFloat());
		// trail width, length and speed
		width = data.readFloat();
		length = data.readFloat();
		bulletSpeed = data.readFloat();
		//trailTexture
		trailTexture = readUTF(data);
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity)
	{
		FlansMod.log.warn("Received PacketBulletTrail on Server. This packet should only be send to clients");
	}

	@Override
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		//TODO trails not visible when trail origin position and player camera position are to close. the can only be seen with an slight angle
		InstantBulletRenderer.AddTrail(new InstantShotTrail(origin, hitPos, width, length, bulletSpeed, trailTexture));
	}

}
