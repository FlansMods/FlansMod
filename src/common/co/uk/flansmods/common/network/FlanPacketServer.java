package co.uk.flansmods.common.network;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Arrays;

import co.uk.flansmods.client.network.PacketParticleSpawn;
import co.uk.flansmods.common.FlansMod;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.network.Player;

import net.minecraft.src.Block;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.NetworkManager;
import net.minecraft.src.Packet;
import net.minecraft.src.Packet250CustomPayload;
import net.minecraft.src.WorldServer;

public class FlanPacketServer implements IPacketHandler
{
	public static String channelFlan = "flansmods";
	protected Packet250CustomPayload internalPacket;
	
	@Override
	public void onPacketData(NetworkManager manager, Packet250CustomPayload packet, Player player)
	{
		EntityPlayer playerEntity = (EntityPlayer) player;
		recieve(packet, playerEntity, manager);
	}
	
	public static final void recieve(Packet250CustomPayload packet, EntityPlayer player, NetworkManager manager)
	{
		if (!packet.channel.equals(channelFlan))
			return;
		
		WorldServer world = (WorldServer) player.worldObj;
		
        try
        {
			DataInputStream stream = new DataInputStream(new ByteArrayInputStream(packet.data));
        	
        	int ID = stream.read();
        	
        	/*
        	 *packet ID list...
        	 * 1 = PacketBreakSound 
        	 * 2 = PacketParticleSpawn
        	 */
        	
    		switch(ID)
    		{
    		case 1: (new PacketBreakSound()).interpret(stream, null); break;
    		case 2: (new PacketParticleSpawn()).interpret(stream, new Object[] {world}); break;
    		case 3: break; // TODO: Entity Control Packets (world, entityID, byte[] extra stuff for exactly what to do.)
    		case 4: break; // TODO: Gui packets (world, x, y, z, ExtraData for what gui and if its a TE and stuff.)
    		default: FlansMod.logLoudly("Unknown packet type recieved"); break;
    		}
    		
    		stream.close();
        }
        catch(Exception e)
        {
        	FlansMod.log("Error recieving packet");
        	e.printStackTrace();
        }
	}
	
	/**
	 * MEANT TO BE ONLY EXTENDED
	 * interprets the data and does something with it.
	 * @param stream
	 * @param extradata
	 */
	public void interpret(DataInputStream stream, Object[] extradata)
	{
		
	}
	
	/**
	 * MEAN TO BE ONLY EXTENDED
	 * @return the ID of the packet wrapper
	 */
	public byte getPacketID()
	{
		return 0;
	}
}