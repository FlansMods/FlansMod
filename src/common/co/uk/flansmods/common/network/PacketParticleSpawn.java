package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import co.uk.flansmods.common.FlansMod;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;

import net.minecraft.client.Minecraft;
import net.minecraft.src.Packet;
import net.minecraft.src.Packet250CustomPayload;

public class PacketParticleSpawn extends FlanPacketServer
{
	
	public static final byte packetID = 2;
	
	public static Packet buildParticleSpawnPacket(String type, double x1, double y1, double z1, double x2, double y2, double z2, int number)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID); // this is the packet ID. identifies it as a BreakSoundPacket
        	data.writeDouble(x1);
        	data.writeDouble(y1);
        	data.writeDouble(z1);
        	data.writeDouble(x2);
        	data.writeDouble(y2);
        	data.writeDouble(z2);
        	data.write(number);
        	data.writeUTF(type);

        	packet.data = bytes.toByteArray();
        	packet.length = packet.data.length;

        	data.close();
        	bytes.close();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }

        return packet;
	}

	@Override
	public void interpret(DataInputStream stream, Object[] extradata)
	{
		FlansMod.log("Particle packet recieved on server. Skipping interpretation.");
	}

	@Override
	public byte getPacketID()
	{
		return packetID;
	}
}
