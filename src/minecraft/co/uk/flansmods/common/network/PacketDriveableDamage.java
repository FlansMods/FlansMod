package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.driveables.DriveablePart;
import co.uk.flansmods.common.driveables.EntityDriveable;
import co.uk.flansmods.common.driveables.EnumDriveablePart;
import cpw.mods.fml.relauncher.Side;

public class PacketDriveableDamage extends FlanPacketCommon
{
	public static final byte packetID = 11;
	
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
        	for(EnumDriveablePart ep : EnumDriveablePart.values())
        	{
        		DriveablePart part = driveable.parts.get(ep);
        		data.writeShort((short)part.health);
        		data.writeBoolean(part.onFire);
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
	        	for(EnumDriveablePart ep : EnumDriveablePart.values())
	        	{
	        		DriveablePart part = driveable.parts.get(ep);
	        		part.health = stream.readShort();
	        		part.onFire = stream.readBoolean();
	        	}
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
