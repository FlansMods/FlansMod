package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import co.uk.flansmods.common.EntityPassengerSeat;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.driveables.EntityDriveable;
import cpw.mods.fml.relauncher.Side;

public class PacketRightClick extends FlanPacketCommon 
{
	public static final byte packetID = 11;
	
	public static Packet buildClickPacket(EntityPassengerSeat seat)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID);
        	data.writeBoolean(true);
        	data.writeInt(seat.getDriveable().entityId);
        	data.writeInt(seat.seatID);
        	
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
	
	// extradata: 0 = player
	@Override
	public void interpret(DataInputStream stream, Object[] extradata, Side side)
	{
		try
		{
			EntityPlayer player =  (EntityPlayer)extradata[0];
			boolean passengerSeat = stream.readBoolean();
			int entityId = stream.readInt();
			int i = stream.readInt();
			EntityDriveable driveable = null;
			for(Object obj : player.worldObj.loadedEntityList)
			{
				if(obj instanceof EntityDriveable && ((Entity)obj).entityId == entityId)
				{
					driveable = (EntityDriveable)obj;
					break;
				}
			}
			if(driveable != null && ((passengerSeat && driveable.seats.length > i)))
			{
				if(passengerSeat)
					driveable.seats[i].func_130002_c(player); //interact - change back next update
			}
		}
        catch(Exception e)
        {
        	FlansMod.log("Error reading seat / box click packet");
        	e.printStackTrace();
        }
	}
	
	@Override
	public byte getPacketID()
	{
		return packetID;
	}
}
