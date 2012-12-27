package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.GunBoxType;
import cpw.mods.fml.relauncher.Side;

public class PacketGunBoxOrdering extends FlanPacketCommon 
{
	public static final byte packetID = 20;
	
	public static Packet buildGunBoxOrderingPacket()
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
	    ByteArrayOutputStream bytes = new ByteArrayOutputStream();
	    DataOutputStream data = new DataOutputStream(bytes);
	    try
	    {
	    	data.write(packetID);
	    	data.writeInt(GunBoxType.shortNameList.size());
	    	for(int i = 0; i < GunBoxType.shortNameList.size(); i++)
	    	{
	    		data.writeUTF(GunBoxType.shortNameList.get(i));
	    	}
	    	
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
	}
		
	public void interpretClient(DataInputStream stream, Object[] extradata) {
	try
		{
			//HashMap<String, GunBoxType> types = new HashMap<String, GunBoxType>();
			ArrayList<String> typeNames = new ArrayList<String>();
			int numBoxes = stream.readInt();
			for(int i = 0; i < numBoxes; i++)
			{
				String boxName = stream.readUTF();
				typeNames.add(boxName);
				//types.put(boxName, GunBoxType.getBox(boxName));
			}
			//GunBoxType.gunBoxMap = types;
			GunBoxType.shortNameList = typeNames;
		}
		catch(Exception e)
		{
			FlansMod.log("Error reading gun box list ordering packet");
			e.printStackTrace();
		}
	}
}
