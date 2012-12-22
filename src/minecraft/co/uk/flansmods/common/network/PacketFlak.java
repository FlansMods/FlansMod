package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Random;

import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.particle.EntitySmokeFX;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.world.World;
import co.uk.flansmods.common.FlansMod;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PacketFlak extends FlanPacketCommon 
{
	public static final byte packetID = 14;
	public static Random rand = new Random();
	
	public static Packet buildFlakPacket(double x, double y, double z, int numParticles)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID);
        	data.writeDouble(x);
        	data.writeDouble(y);
        	data.writeDouble(z);
        	data.writeInt(numParticles);

        	packet.data = bytes.toByteArray();
        	packet.length = packet.data.length;
        	packet.isChunkDataPacket = true;

        	data.close();
        	bytes.close();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }

        return packet;
	}

	// extradata [0] = world
	@Override
	public void interpret(DataInputStream stream, Object[] extradata, Side side)
	{
		if(side.isClient())
		{
			interpretClient(stream, extradata, side);
		}
		else
		{
			FlansMod.log("Flak packet received on server. Skipping interpretation.");
		}
	}	
	
	@SideOnly(Side.CLIENT)
	public void interpretClient(DataInputStream stream, Object[] extradata, Side side)
	{
		try
		{
			World world = (World)extradata[0];
			double x = stream.readDouble();
			double y = stream.readDouble();
			double z = stream.readDouble();
			int numParticles = stream.readInt();
			for (int i = 0; i < numParticles; i++)
			{
				EntityFX obj = new EntitySmokeFX(world, x + rand.nextGaussian(), y + rand.nextGaussian(), z + rand.nextGaussian(), 0.01D, 0.01D, 0.01D);
				obj.motionX = rand.nextGaussian() / 20;
				obj.motionY = rand.nextGaussian() / 20;
				obj.motionZ = rand.nextGaussian() / 20;
				obj.renderDistanceWeight = 250D;
				FMLClientHandler.instance().getClient().effectRenderer.addEffect(obj);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public byte getPacketID()
	{
		return packetID;
	}
}
