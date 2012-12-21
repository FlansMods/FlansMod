package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import co.uk.flansmods.common.EntityDriveable;
import co.uk.flansmods.common.FlansMod;
import cpw.mods.fml.common.Side;

public class PacketVehicleGUI extends FlanPacketCommon {
	
	public static final byte packetID = 15;
	
	public static Packet buildGUIPacket(int guiID)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID);
        	data.writeInt(guiID);
        	
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
			
			int guiID = stream.readInt();
			if(player.ridingEntity != null && player.ridingEntity instanceof EntityDriveable)
			{
				EntityDriveable d = ((EntityDriveable)player.ridingEntity);
				switch(guiID)
				{
				case 0 : //Guns
					player.openGui(FlansMod.instance, 6, player.worldObj, d.chunkCoordX, d.chunkCoordY, d.chunkCoordZ); break;
				case 1 : //Bombs / Shells
					player.openGui(FlansMod.instance, 7, player.worldObj, d.chunkCoordX, d.chunkCoordY, d.chunkCoordZ); break;
				case 2 : //Fuel
					player.openGui(FlansMod.instance, 8, player.worldObj, d.chunkCoordX, d.chunkCoordY, d.chunkCoordZ); break;
				case 3 : //Cargo
					player.openGui(FlansMod.instance, 9, player.worldObj, d.chunkCoordX, d.chunkCoordY, d.chunkCoordZ); break;
				}
			}
			
		}
        catch(Exception e)
        {
        	FlansMod.log("error parsing GUI packet");
        	e.printStackTrace();
        }
	}
	
	@Override
	public byte getPacketID()
	{
		return packetID;
	}

}
