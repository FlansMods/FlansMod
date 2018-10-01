package com.flansmod.common.network;

import java.util.Random;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.client.particle.Particle;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;

public class PacketFlak extends PacketBase
{
	public static Random rand = new Random();
	
	/**
	 * Position of this flak
	 */
	public double x, y, z;
	/**
	 * Num particles
	 */
	public int numParticles;
	/**
	 * Particle type
	 */
	public String particleType;
	
	public PacketFlak()
	{
	}
	
	public PacketFlak(double x1, double y1, double z1, int n, String s)
	{
		x = x1;
		y = y1;
		z = z1;
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
		FlansMod.log.warn("Received flak packet on server. Disregarding.");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		World world = clientPlayer.world;
		for(int i = 0; i < numParticles; i++)
		{
			Particle obj = FlansModClient.getParticle(particleType, world, x + rand.nextGaussian(), y + rand.nextGaussian(), z + rand.nextGaussian());
			if(obj != null)
			{
				obj.multiplyVelocity((float)rand.nextGaussian() / 20.0f);
				// TODO: [1.12] Apparently we can't set the render distance higher, so let's boost the scale and see how that works
				obj.multipleParticleScaleBy(5.0f);
				FMLClientHandler.instance().getClient().effectRenderer.addEffect(obj);
			}
		}
	}
}
