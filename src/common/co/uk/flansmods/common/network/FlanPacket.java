package co.uk.flansmods.common.network;

import java.util.Arrays;

import net.minecraft.src.Packet250CustomPayload;

public abstract class FlanPacket
{
	public static String channelFlan = "flansmods";
	
	public static void recieve(Packet250CustomPayload packet)
	{
		if (packet.channel.equals(channelFlan))
			return;
		
		int ID = packet.data[0];
		packet.data = Arrays.copyOfRange(packet.data, 1, packet.data.length-1);
		
		switch(ID)
		{
		case 1: break; // TODO: Entity Spawn packets (World, x, y, z, Byte[] Extra Data to decide what entity and what args)
		case 2: break; // TODO: Entity Control Packets (world, entityID, byte[] extra stuff for exactly what to do.)
		case 3: break; // TODO: Gui packets (world, x, y, z, ExtraData for what gui and if its a TE and stuff.)
		default: return;
		}
	}
}