package com.flansmod.common.network;

import java.util.Random;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;

public class PacketFlak extends PacketBase 
{
	public static Random rand = new Random();
	
	/** Position of this flak */
	public double x, y, z;
	/** Num particles */
	public int numParticles;
	/** Particle type */
	public String particleType;

	public PacketFlak() {}

	public PacketFlak(double x1, double y1, double z1, int n, String s)
	{
		x = x1; y = y1; z = z1;
		numParticles = n;
		particleType = s;
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeDouble(x);
    	data.writeDouble(y);
    	data.writeDouble(z);
    	data.writeInt(numParticles);
    	writeUTF(data, particleType);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		x = data.readDouble();
		y = data.readDouble();
		z = data.readDouble();
		numParticles = data.readInt();
		particleType = readUTF(data);
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		FlansMod.log("Received flak packet on server. Disregarding.");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		World world = clientPlayer.worldObj;
		for (int i = 0; i < numParticles; i++)
		{
			EntityFX obj = FlansModClient.getParticle(particleType, world, x + rand.nextGaussian(), y + rand.nextGaussian(), z + rand.nextGaussian());
			if(obj != null)
			{
				obj.motionX = rand.nextGaussian() / 20;
				obj.motionY = rand.nextGaussian() / 20;
				obj.motionZ = rand.nextGaussian() / 20;
				obj.renderDistanceWeight = 250D;
				FMLClientHandler.instance().getClient().effectRenderer.addEffect(obj);
			}
		}		
	}
}
