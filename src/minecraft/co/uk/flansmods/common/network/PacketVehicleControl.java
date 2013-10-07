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
import cpw.mods.fml.relauncher.Side;

public class PacketVehicleControl extends FlanPacketCommon
{
	public static final byte packetID = 3;
	
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
        	data.writeDouble(driveable.posX);
        	data.writeDouble(driveable.posY);
        	data.writeDouble(driveable.posZ);
        	data.writeFloat(driveable.axes.getYaw());
        	data.writeFloat(driveable.axes.getPitch());
        	data.writeFloat(driveable.axes.getRoll());
        	data.writeDouble(driveable.motionX);
        	data.writeDouble(driveable.motionY);
        	data.writeDouble(driveable.motionZ);
        	data.writeFloat(driveable.angularVelocity.x);
        	data.writeFloat(driveable.angularVelocity.y);
        	data.writeFloat(driveable.angularVelocity.z);
        	data.writeFloat(driveable.throttle);
        	driveable.writeUpdateData(data);
        	        	
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
					if(side.isClient() && driveable.seats[0] != null && driveable.seats[0].riddenByEntity == player)
						return;
					break;
				}
			}
			if(driveable != null)
			{
				driveable.setPositionRotationAndMotion(stream.readDouble(), stream.readDouble(), stream.readDouble(), stream.readFloat(), stream.readFloat(), stream.readFloat(), stream.readDouble(), stream.readDouble(), stream.readDouble(), stream.readFloat(), stream.readFloat(), stream.readFloat(), stream.readFloat());
				driveable.readUpdateData(stream);
			}
		}
        catch(Exception e)
        {
        	FlansMod.log("error parsing control packet");
        	e.printStackTrace();
        }
	}
	
	@Override
	public byte getPacketID()
	{
		return packetID;
	}
}
