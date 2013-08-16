package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.driveables.EntityDriveable;
import co.uk.flansmods.common.driveables.EntitySeat;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.relauncher.Side;

public class PacketSeatUpdates extends FlanPacketCommon 
{
	public static final byte packetID = 21;
	
	public static Packet buildUpdatePacket(EntitySeat seat)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID);
        	data.writeInt(seat.driveable.entityId);
        	data.writeInt(seat.seatInfo.id);
        	data.writeFloat(seat.looking.getYaw());
        	data.writeFloat(seat.looking.getPitch());
        	
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
					
			int entityId = stream.readInt();
			EntityDriveable driveable = null;
			for(Object obj : player.worldObj.loadedEntityList)
			{
				if(obj instanceof EntityDriveable && ((Entity)obj).entityId == entityId)
				{
					driveable = (EntityDriveable)obj;
					break;
				}
			}
			if(driveable != null)
			{
	        	int seatID = stream.readInt();
        		float yaw = stream.readFloat();	        		
        		float pitch = stream.readFloat();
        		//If this is the player who sent the packet in the first place, don't read it
        		if(side == Side.CLIENT && driveable.seats[seatID].riddenByEntity == player)
        			return;
        		driveable.seats[seatID].looking.setAngles(yaw, pitch, 0F);
        		//If on the server, update all surrounding players with these new angles
				if(side == Side.SERVER)
				{
					PacketDispatcher.sendPacketToAllAround(driveable.posX, driveable.posY, driveable.posZ, 50, driveable.dimension, buildUpdatePacket(driveable.seats[seatID]));
				}
			}
		}
        catch(Exception e)
        {
        	FlansMod.log("Error parsing seat updates packet");
        	e.printStackTrace();
        }
	}
	
	@Override
	public byte getPacketID()
	{
		return packetID;
	}
}
