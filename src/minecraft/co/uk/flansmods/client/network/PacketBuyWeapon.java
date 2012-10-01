package co.uk.flansmods.client.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.src.Packet;
import net.minecraft.src.Packet250CustomPayload;
import net.minecraft.src.World;
import co.uk.flansmods.common.BlockGunBox;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.GunBoxType;

public class PacketBuyWeapon extends FlanPacketClient 
{
	public static final byte packetID = 5;
	
	//type is 0 for gun, 1 for ammo, 2 for altAmmo
	public static Packet buildBuyWeaponPacket(GunBoxType box, int type, int weaponID)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
	    ByteArrayOutputStream bytes = new ByteArrayOutputStream();
	    DataOutputStream data = new DataOutputStream(bytes);
	    try
	    {
	    	data.write(packetID); // this is the packet ID. identifies it as a BreakSoundPacket
	    	data.writeUTF(box.shortName);
	    	data.write(type);
	    	data.write(weaponID);
	
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
		FlansMod.log("Buy weapon packet recieved on server. Skipping interpretation.");
	}

	@Override
	public byte getPacketID()
	{
		return packetID;
	}
}
