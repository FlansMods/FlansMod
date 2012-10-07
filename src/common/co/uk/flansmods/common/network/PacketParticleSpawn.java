package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import co.uk.flansmods.common.FlansMod;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

import net.minecraft.client.Minecraft;
import net.minecraft.src.Packet;
import net.minecraft.src.Packet250CustomPayload;
import net.minecraft.src.World;

public class PacketParticleSpawn extends FlanPacketCommon
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
	public void interpret(DataInputStream stream, Object[] extradata, Side side)
	{
		if(side.equals(Side.CLIENT)) interpretClient(stream, extradata);
		else FlansMod.logLoudly("Received particle packet on server (or bukkit server)! Doing nothing");
	}
	
	@SideOnly(Side.CLIENT)
	public void interpretClient(DataInputStream stream, Object[] extradata) {
		try
		{
			double x1 = stream.readDouble();
			double y1 = stream.readDouble();
			double z1 = stream.readDouble();
			double x2 = stream.readDouble();
			double y2 = stream.readDouble();
			double z2 = stream.readDouble();
			int number = stream.read();
			String type = stream.readUTF();
			
			for (int i = 0; i < number; i++)
			{
				((World)extradata[0]).spawnParticle(type, x1, y1, z1, x2, y2, z2);
			}

		}
		catch(Exception e)
		{
			FlansMod.log("Error reading packet or spawning particles");
			e.printStackTrace();
		}
	}

	@Override
	public byte getPacketID()
	{
		return packetID;
	}
}
