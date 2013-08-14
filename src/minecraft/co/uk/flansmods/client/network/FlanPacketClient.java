package co.uk.flansmods.client.network;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.network.PacketBlueprint;
import co.uk.flansmods.common.network.PacketBreakSound;
import co.uk.flansmods.common.network.PacketBuyWeapon;
import co.uk.flansmods.common.network.PacketContentPackList;
import co.uk.flansmods.common.network.PacketDriveableDamage;
import co.uk.flansmods.common.network.PacketFlak;
import co.uk.flansmods.common.network.PacketGunBoxTE;
import co.uk.flansmods.common.network.PacketGunFire;
import co.uk.flansmods.common.network.PacketMGFire;
import co.uk.flansmods.common.network.PacketMGMount;
import co.uk.flansmods.common.network.PacketParticleSpawn;
import co.uk.flansmods.common.network.PacketPlaySound;
import co.uk.flansmods.common.network.PacketPlayerSpawn;
import co.uk.flansmods.common.network.PacketReload;
import co.uk.flansmods.common.network.PacketSeatUpdates;
import co.uk.flansmods.common.network.PacketTeamInfo;
import co.uk.flansmods.common.network.PacketTeamSelect;
import co.uk.flansmods.common.network.PacketVehicleControl;
import co.uk.flansmods.common.network.PacketVehicleGUI;
import co.uk.flansmods.common.network.PacketVehicleKey;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;
import cpw.mods.fml.relauncher.Side;

public class FlanPacketClient implements IPacketHandler
{
	public static String channelFlan = "flansmods";
	protected Packet250CustomPayload internalPacket;
	
	@Override
	public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player)
	{
		String name = ((EntityPlayer) player).username;
		EntityPlayer playerEntity = FMLClientHandler.instance().getClient().thePlayer;
		recieve(packet, playerEntity, manager);
	}
	
	public static final void recieve(Packet250CustomPayload packet, EntityPlayer player, INetworkManager manager)
	{
		if (!packet.channel.equals(channelFlan))
			return;
		
		WorldClient world = Minecraft.getMinecraft().theWorld;
		
        try
        {
			DataInputStream stream = new DataInputStream(new ByteArrayInputStream(packet.data));
        	
        	int ID = stream.read();
        	
    		switch(ID)
    		{
    		case 1: (new PacketBreakSound()).interpret(stream, null, Side.CLIENT); break;
    		case 2: (new PacketParticleSpawn()).interpret(stream, new Object[] {world}, Side.CLIENT); break;
    		case 3: (new PacketVehicleControl()).interpret(stream, new Object[] {player}, Side.CLIENT); break;
    		case 4: (new PacketVehicleKey()).interpret(stream, new Object[] {player}, Side.CLIENT); break;
    		case 5: (new PacketBuyWeapon()).interpret(stream, new Object[] {world, player},Side.CLIENT); break;
    		case 6: (new PacketTeamSelect()).interpret(stream, new Object[] {player}, Side.CLIENT); break;
    		case 7: (new PacketGunBoxTE()).interpret(stream, new Object[] {world}, Side.CLIENT); break;
    		case 8: (new PacketPlaySound()).interpret(stream, null, Side.CLIENT); break;
    		case 9: (new PacketBlueprint()).interpret(stream, new Object[] {player}, Side.CLIENT); break;
    		case 10: (new PacketMGMount()).interpret(stream, new Object[] {world}, Side.CLIENT); break;
    		case 11: (new PacketDriveableDamage()).interpret(stream, new Object[] {player}, Side.CLIENT); break;
    		case 12: (new PacketMGFire()).interpret(stream, new Object[] {player}, Side.CLIENT); break;
    		case 13: (new PacketGunFire()).interpret(stream, new Object[] {player, world}, Side.CLIENT); break;
    		case 14: (new PacketFlak()).interpret(stream, new Object[] {world}, Side.CLIENT); break;
    		case 15: (new PacketVehicleGUI()).interpret(stream, new Object[] {player}, Side.CLIENT); break;
    		case 16: (new PacketContentPackList()).interpret(stream, new Object[] {player}, Side.CLIENT); break;
       		case 17: break; //FREE PACKET ID
       		case 18: (new PacketTeamInfo()).interpret(stream, new Object[] {}, Side.CLIENT); break;
       		case 19: (new PacketReload()).interpret(stream, new Object[] {player}, Side.CLIENT); break;
       		case 20: (new PacketPlayerSpawn()).interpret(stream, null, Side.CLIENT); break;
       		case 21: (new PacketSeatUpdates()).interpret(stream, new Object[] {player}, Side.CLIENT); break;
       	    default: FlansMod.logLoudly("Unknown packet type recieved : " + ID); break;
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