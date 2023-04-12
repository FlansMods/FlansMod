package com.flansmod.common.network;

import java.util.Random;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.client.handlers.FlansModResourceHandler;
import com.flansmod.common.FlansMod;
import com.flansmod.common.vector.Matrix2f;

public class PacketPlaySound extends PacketBase
{
	public static Random rand = new Random();
	public float posX, posY, posZ;
	public String sound;
	public boolean distort, silenced;
	public int hash, value;
	
	public PacketPlaySound()
	{
	}
	
	public static void sendSoundPacket(double x, double y, double z, double range, int dimension, String s, boolean silenced)
	{
		sendSoundPacket(x, y, z, range, dimension, s, silenced, false);
	}
	
	public static void sendSoundPacket(double x, double y, double z, double range, int dimension, String s, boolean silenced, boolean distort)
	{
		FlansMod.getPacketHandler().sendToAllAround(new PacketPlaySound(x, y, z, s, silenced, distort), x, y, z, (float)range, dimension);
	}
	
	public PacketPlaySound(double x, double y, double z, String s)
	{
		this(x, y, z, s, false);
	}
	
	public PacketPlaySound(double x, double y, double z, String s, boolean silenced)
	{
		this(x, y, z, s, silenced, false);
	}
	
	public PacketPlaySound(double x, double y, double z, String s, boolean silenced, boolean distort)
	{
		posX = (float)x;
		posY = (float)y;
		posZ = (float)z;
		sound = s;
		this.silenced = silenced;
		this.distort = distort;
		
		Matrix2f audioMatrix = Matrix2f.generateAudioMatrix(x, y, z);
		hash = audioMatrix.coords.hash;
		value = audioMatrix.value;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		data.writeFloat(posX);
		data.writeFloat(posY);
		data.writeFloat(posZ);
		writeUTF(data, sound);
		data.writeBoolean(distort);
		data.writeBoolean(silenced);
		data.writeInt(hash);
		data.writeInt(value);
	}
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		posX = data.readFloat();
		posY = data.readFloat();
		posZ = data.readFloat();
		sound = readUTF(data);
		distort = data.readBoolean();
		silenced = data.readBoolean();
		hash = data.readInt();
		value = data.readInt();
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity)
	{
		FlansMod.log.warn("Received play sound packet on server. Skipping.");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		SoundEvent event = FlansModResourceHandler.getSoundEvent(sound);
		FMLClientHandler.instance().getClient().getSoundHandler().playSound(
				new PositionedSoundRecord(event,
						SoundCategory.PLAYERS,
						silenced ? 2F : 4F,
						(distort ? 1.0F / (rand.nextFloat() * 0.4F + 0.8F) : 1.0F) * (silenced ? 2F : 1F),
						posX, posY, posZ));
		
		Matrix2f.verifyMatrixNormals(new Matrix2f(hash, value));
	}
	
}
