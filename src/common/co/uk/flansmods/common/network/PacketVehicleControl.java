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
	
	public static Packet buildVehicleControlMouse(int xChange, int yChange)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID);
        	data.writeBoolean(true);
        	data.writeInt(xChange);
        	data.writeInt(yChange);
        	
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
	
	public static Packet buildVehicleControlButton(int button)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID);
        	data.writeBoolean(false);
        	data.writeInt(button);
        	
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
			
			boolean mouse = stream.readBoolean();        	

			if (mouse)
			{
				int x = stream.readInt();
				int y = stream.readInt();

				FlansMod.proxy.onMouseMoved(x, y, (EntityPlayer)extradata[0]);
			}
			else
			{
				int button = stream.readInt();
				
				WorldServer world = (WorldServer) player.worldObj;
				Entity entityTest  = player.ridingEntity;
				
				if (entityTest == null || !(entityTest instanceof EntityDriveable))
					return;
				
				EntityDriveable entity = (EntityDriveable)entityTest;
				
				entity.pressKey(button);
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
