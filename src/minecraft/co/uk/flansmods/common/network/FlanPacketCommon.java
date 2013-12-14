package co.uk.flansmods.common.network;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.world.World;
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
		
		if (!packet.channel.equals(channelFlan))
			return;
		
		WorldServer world = (WorldServer) playerEntity.worldObj;
		
		receive(packet, playerEntity, manager, Side.SERVER, world);
	}
	
	public static final void receive(Packet250CustomPayload packet, EntityPlayer player, INetworkManager manager, Side side, World world)
	{
        try
        {
			DataInputStream stream = new DataInputStream(new ByteArrayInputStream(packet.data));
        	
        	int ID = stream.read();
        	
    		switch(ID)
    		{
	    		case 1: (new PacketBreakSound()).interpret(stream, null, side); break;
	    		case 2: (new PacketGunModButton()).interpret(stream, new Object[] {player}, side); break;
	    		case 3: (new PacketVehicleControl()).interpret(stream, new Object[] {player}, side); break;
	    		case 4: (new PacketVehicleKey()).interpret(stream, new Object[] {player}, side); break;
	    		case 5: (new PacketBuyWeapon()).interpret(stream, new Object[] {world, player}, side); break;
	    		case 6: (new PacketTeamSelect()).interpret(stream, new Object[] {player}, side); break;
	    		case 7: (new PacketGunBoxTE()).interpret(stream, new Object[] {world}, side); break;
	    		case 8: (new PacketPlaySound()).interpret(stream, null, side); break;
	    		case 9: (new PacketDriveableCrafting()).interpret(stream, new Object[] {player}, side); break;
	    		case 10: (new PacketMGMount()).interpret(stream, new Object[] {world}, side); break;
	    		case 11: (new PacketDriveableDamage()).interpret(stream, new Object[] {player}, side); break;
	    		case 12: (new PacketMGFire()).interpret(stream, new Object[] {player}, side); break;
	    		case 13: (new PacketGunFire()).interpret(stream, new Object[] {player, world}, side); break;
	    		case 14: (new PacketFlak()).interpret(stream, new Object[] {world}, side); break;
	    		case 15: (new PacketVehicleGUI()).interpret(stream, new Object[] {player}, side); break;
	    		case 16: (new PacketContentPackList()).interpret(stream, new Object[] {player}, side); break;
	    		case 17: (new PacketRepairDriveable()).interpret(stream, new Object[] {player}, side); break;
	       		case 18: (new PacketTeamInfo()).interpret(stream, new Object[] {}, side); break;
	       		case 19: (new PacketReload()).interpret(stream, new Object[] {player}, side); break;
	       		case 20: (new PacketPlayerSpawn()).interpret(stream, null, side); break;
	       		case 21: (new PacketSeatUpdates()).interpret(stream, new Object[] {player}, side); break;
	       		case 22: (new PacketDriveableKeyHeld()).interpret(stream, new Object[] {player}, side); break;
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