package co.uk.flansmods.common.network;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.world.WorldServer;
import co.uk.flansmods.common.FlansMod;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;
import cpw.mods.fml.relauncher.Side;

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
	    		case 10: (new PacketMGMount()).interpret(stream, new Object[] {world}, Side.SERVER); break;
	    		case 11: (new PacketRightClick()).interpret(stream, new Object[] {player}, Side.SERVER); break;
	    		case 12: (new PacketMGFire()).interpret(stream, new Object[] {player}, Side.SERVER); break;
	    		case 13: (new PacketGunFire()).interpret(stream, new Object[] {player, world}, Side.SERVER); break;
	    		case 14: (new PacketFlak()).interpret(stream, new Object[] {world}, Side.SERVER); break;
	    		case 15: (new PacketVehicleGUI()).interpret(stream, new Object[] {player}, Side.SERVER); break;
	    		case 16: (new PacketContentPackList()).interpret(stream, new Object[] {player}, Side.SERVER); break;
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