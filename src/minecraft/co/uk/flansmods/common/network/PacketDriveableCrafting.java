package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.driveables.DriveableType;
import co.uk.flansmods.common.driveables.PlaneType;
import co.uk.flansmods.common.driveables.VehicleType;
import cpw.mods.fml.relauncher.Side;

/** Sent from client to server when the player clicks the "Craft" button in the driveable crafting GUI */
public class PacketDriveableCrafting extends FlanPacketCommon 
{
	public static final byte packetID = 9;
	
	public static Packet buildCraftingPacket(String s)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID);
        	data.writeUTF(s);
        	
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
		try
        {
			//Read the type's shortName from the packet
			DriveableType type = DriveableType.getDriveable(stream.readUTF());   
			EntityPlayer player = (EntityPlayer)extradata[0];
			
			//Try to craft the driveable
			FlansMod.proxy.craftDriveable(player, type);
        }
        catch(Exception e)
        {
        	FlansMod.log("Error crafting driveable");
        	e.printStackTrace();
        }
	}

	@Override
	public byte getPacketID()
	{
		return packetID;
	}
}
