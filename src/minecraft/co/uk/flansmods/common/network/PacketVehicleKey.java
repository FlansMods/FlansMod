package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import co.uk.flansmods.api.IControllable;
import co.uk.flansmods.common.FlansMod;
import cpw.mods.fml.relauncher.Side;

public class PacketVehicleKey extends FlanPacketCommon {
	
public static final byte packetID = 4;
	
	public static Packet buildKeyPacket(int key)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID);
        	data.writeInt(key);
        	
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
			
			int key = stream.readInt();
			if(player.ridingEntity != null && player.ridingEntity instanceof IControllable)
			{
				((IControllable)player.ridingEntity).pressKey(key, player);
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
