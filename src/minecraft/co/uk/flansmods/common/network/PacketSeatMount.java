package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.world.World;
import co.uk.flansmods.common.EntityDriveable;
import co.uk.flansmods.common.EntityMG;
import co.uk.flansmods.common.EntityPassengerSeat;
import co.uk.flansmods.common.FlansMod;
import cpw.mods.fml.relauncher.Side;

public class PacketSeatMount extends FlanPacketCommon 
{
	public static final byte packetID = 17;
	
	public static Packet buildMountPacket(Entity entity, EntityPassengerSeat seat, boolean mounting)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID);
        	data.writeInt(entity.entityId);
        	data.writeInt(seat.vehicle.entityId);
        	data.writeInt(seat.seatID);
        	data.writeBoolean(mounting);
        	
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
        	World world = (World)extradata[0];
			int playerId = stream.readInt();
			Entity entity = null;
			for(Object obj : world.loadedEntityList)
			{
				if(((Entity)obj).entityId == playerId)
				{
					entity = (EntityPlayer)obj;
					break;
				}
			}
			int driveableId = stream.readInt();
			EntityDriveable driveable = null;
			for(Object obj : world.loadedEntityList)
			{
				if(obj instanceof EntityDriveable && ((Entity)obj).entityId == driveableId)
				{
					driveable = (EntityDriveable)obj;
					break;
				}
			}
			int seatID = stream.readInt();
			boolean mounting = stream.readBoolean();
			driveable.seats[seatID].sitInSeat(entity, mounting);
        }
        catch(Exception e)
        {
        	FlansMod.log("Error reading mountPassengerSeat packet");
        	e.printStackTrace();
        }
	}

	@Override
	public byte getPacketID()
	{
		return packetID;
	}
}
