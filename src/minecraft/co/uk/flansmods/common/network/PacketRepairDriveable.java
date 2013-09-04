package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.driveables.DriveableType;
import co.uk.flansmods.common.driveables.EntitySeat;
import co.uk.flansmods.common.driveables.EnumDriveablePart;
import cpw.mods.fml.relauncher.Side;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;

public class PacketRepairDriveable extends FlanPacketCommon 
{
	public static final byte packetID = 17;
	
	public static Packet buildRepairPacket(EnumDriveablePart part)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID);
        	data.writeUTF(part.getShortName());
        	
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
			//Read the part's shortName from the packet
			EnumDriveablePart part = EnumDriveablePart.getPart(stream.readUTF());   
			EntityPlayer player = (EntityPlayer)extradata[0];
			
			//Try to craft the driveable
			FlansMod.proxy.repairDriveable(player, ((EntitySeat)player.ridingEntity).driveable, ((EntitySeat)player.ridingEntity).driveable.parts.get(part));
        }
        catch(Exception e)
        {
        	FlansMod.log("Error repairing driveable");
        	e.printStackTrace();
        }
	}

	@Override
	public byte getPacketID()
	{
		return packetID;
	}
}
