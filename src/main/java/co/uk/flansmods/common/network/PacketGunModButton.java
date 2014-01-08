package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.driveables.DriveableType;
import co.uk.flansmods.common.guns.ContainerGunModTable;
import cpw.mods.fml.relauncher.Side;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;

public class PacketGunModButton extends FlanPacketCommon 
{
	public static final byte packetID = 2;

	//Currently not in use. Too complicated to bother implementing right now
	public static Packet buildButtonPressPacket(boolean paint, boolean left)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID);
        	data.writeBoolean(false);
        	data.writeBoolean(paint);
        	data.writeBoolean(left);
        	
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
			EntityPlayer player = (EntityPlayer)extradata[0];
			ContainerGunModTable container = (ContainerGunModTable)player.openContainer;
			
			if(stream.readBoolean())
			{
				//Coming soon
			}
			else container.pressButton(stream.readBoolean(), stream.readBoolean());
        }
        catch(Exception e)
        {
        	FlansMod.log("Error pressing button in gun modification table GUI");
        	e.printStackTrace();
        }
	}

	@Override
	public byte getPacketID()
	{
		return packetID;
	}
}
