package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.src.Block;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Packet;
import net.minecraft.src.Packet250CustomPayload;
import net.minecraft.src.WorldServer;
import co.uk.flansmods.common.EntityDriveable;
import co.uk.flansmods.common.FlansMod;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

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
				driveable.setPosition(stream.readDouble(), stream.readDouble(), stream.readDouble());
				driveable.setRotation(stream.readFloat(), stream.readFloat(), stream.readFloat());
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
