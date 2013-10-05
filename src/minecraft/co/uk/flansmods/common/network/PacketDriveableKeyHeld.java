package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import co.uk.flansmods.api.IControllable;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.driveables.mechas.EntityMecha;
import cpw.mods.fml.relauncher.Side;

public class PacketDriveableKeyHeld extends FlanPacketCommon 
{
	public static final byte packetID = 22;
	
	public static Packet buildKeyPacket(int key, boolean held)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID);
        	data.writeInt(key);
        	data.writeBoolean(held);
        	
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
			boolean held = stream.readBoolean();
			if(player.ridingEntity != null && player.ridingEntity instanceof IControllable)
			{
				((IControllable)player.ridingEntity).updateKeyHeldState(key, held);
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
