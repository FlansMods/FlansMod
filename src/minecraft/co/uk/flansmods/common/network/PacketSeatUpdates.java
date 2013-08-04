package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import co.uk.flansmods.common.EntityDriveable;
import co.uk.flansmods.common.FlansMod;
import cpw.mods.fml.relauncher.Side;

public class PacketSeatUpdates extends FlanPacketCommon 
{
	public static final byte packetID = 21;
	
	public static Packet buildUpdatePacket(EntityDriveable driveable)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID);
        	data.writeInt(driveable.entityId);
        	for(int i = 0; i < driveable.seats.length; i++)
        	{
        		data.writeInt(driveable.seats[i].riddenByEntity == null ? -1 : driveable.seats[i].riddenByEntity.entityId);
        		data.writeFloat(driveable.seats[i].gunYaw);
        		data.writeFloat(driveable.seats[i].gunPitch);
        	}
        	
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
	        	for(int i = 0; i < driveable.seats.length; i++)
	        	{
	        		int riddenById = stream.readInt();
	        		float yaw = stream.readFloat();	        		
	        		float pitch = stream.readFloat();
	        		
	        		if(riddenById == -1 && driveable.seats[i].riddenByEntity != null)
	        			driveable.seats[i].riddenByEntity.mountEntity(null);
	        		if(riddenById != -1)
	        		{
	        			//If wrong entity is in seat
	        			if(driveable.seats[i].riddenByEntity != null && driveable.seats[i].riddenByEntity.entityId != riddenById)
	        			{
	        				//Dismount
	        				driveable.seats[i].riddenByEntity.mountEntity(null);
	        			}
	        			//If seat is empty
	        			if(driveable.seats[i].riddenByEntity == null)
	        			{
	        				//Find entity and mount
	        				for(Object obj : player.worldObj.loadedEntityList)
	        				{
	        					if(((Entity)obj).entityId == riddenById)
	        					{
	        						//((Entity)obj).ridingEntity = driveable.seats[i];
	        						//driveable.seats[i].riddenByEntity = ((Entity)obj);
	        						((Entity)obj).mountEntity(driveable.seats[i]);
	        					}
	        				}	        				
	        			}
	        		}
	        		driveable.seats[i].gunYaw = yaw;
	        		driveable.seats[i].gunPitch = pitch;
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
