package co.uk.flansmods.common.network;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Arrays;

import co.uk.flansmods.common.FlansMod;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.network.Player;

import net.minecraft.src.Block;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.INetworkManager;
import net.minecraft.src.Packet;
import net.minecraft.src.Packet250CustomPayload;
import net.minecraft.src.WorldServer;

public class FlanPacketCommon implements IPacketHandler
{
	public static String channelFlan = "flansmods";
	protected Packet250CustomPayload internalPacket;
	
	@Override
	public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player)
	{
		String name = ((EntityPlayer) player).username;
		EntityPlayer playerEntity = FMLCommonHandler.instance().getSidedDelegate().getServer().getConfigurationManager().getPlayerForUsername(name);
		
		recieve(packet, playerEntity, manager);
	}
	
	public static final void recieve(Packet250CustomPayload packet, EntityPlayer player, INetworkManager manager)
	{
		if (!packet.channel.equals(channelFlan))
			return;
		
		WorldServer world = (WorldServer) player.worldObj;
		
        try
        {
			DataInputStream stream = new DataInputStream(new ByteArrayInputStream(packet.data));
        	
        	int ID = stream.read();
        	
    		switch(ID)
    		{
	    		case 1: (new PacketBreakSound()).interpret(stream, null, Side.SERVER); break;
	    		case 2: (new PacketParticleSpawn()).interpret(stream, new Object[] {world}, Side.SERVER); break;
	    		case 3: (new PacketVehicleControl()).interpret(stream, new Object[] {player}, Side.SERVER); break;
	    		case 4: (new PacketVehicleKey()).interpret(stream, new Object[] {player}, Side.SERVER); break;
	    		case 5: (new PacketBuyWeapon()).interpret(stream, new Object[] {world, player}, Side.SERVER); break;
	    		case 6: (new PacketTeamSelect()).interpret(stream, new Object[] {player}, Side.SERVER); break;
	    		case 7: (new PacketGunBoxTE()).interpret(stream, new Object[] {world}, Side.SERVER); break;
	    		case 8: (new PacketPlaySound()).interpret(stream, null, Side.SERVER); break;
	    		case 9: (new PacketBlueprint()).interpret(stream, new Object[] {player}, Side.SERVER); break;
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
	public void interpret(DataInputStream stream, Object[] extradata, Side side)
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