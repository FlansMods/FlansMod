package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Random;

import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import co.uk.flansmods.common.FlansMod;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PacketPlaySound extends FlanPacketCommon {
	
public static Random rand = new Random();
public static final byte packetID = 8;
	
	public static Packet buildSoundPacket(double x, double y, double z, String s)
	{
		return buildSoundPacket(x, y, z, s, false);
	}


	public static Packet buildSoundPacket(double x, double y, double z, String s, boolean distort)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID); // this is the packet ID. identifies it as a BreakSoundPacket
        	data.writeFloat((float)x);
        	data.writeFloat((float)y);
        	data.writeFloat((float)z);
        	data.writeUTF(s);
        	data.writeBoolean(distort);
        	
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
		if(side.equals(Side.CLIENT))
			interpretClient(stream, extradata);
		else FlansMod.log("Sound packet recieved on server. Skipping interpretation.");
	}
	
	@SideOnly(value = Side.CLIENT)
	private void interpretClient(DataInputStream stream, Object[] extradata)
	{
        try
        {
        	float x = stream.readFloat();
        	float y = stream.readFloat();
        	float z = stream.readFloat();
        	String sound = stream.readUTF();      
        	boolean distort = stream.readBoolean();
        	FMLClientHandler.instance().getClient().sndManager.playSound(sound, x, y, z, 1F, distort ? 1.0F / (rand.nextFloat() * 0.4F + 0.8F) : 1.0F);
        }
        catch(Exception e)
        {
        	FlansMod.log("Error reading or playing sound");
        	e.printStackTrace();
        }
	}

	@Override
	public byte getPacketID()
	{
		return packetID;
	}

}
