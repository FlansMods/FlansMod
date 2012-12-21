package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.world.World;
import co.uk.flansmods.common.EntityMG;
import co.uk.flansmods.common.FlansModPlayerHandler;
import co.uk.flansmods.common.TileEntityGunBox;
import cpw.mods.fml.common.Side;

public class PacketMGFire extends FlanPacketCommon 
{
	public static final byte packetID = 12;
	
	public static Packet buildMGFirePacket(boolean held)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID);
        	data.writeBoolean(held);

        	packet.data = bytes.toByteArray();
        	packet.length = packet.data.length;
        	packet.isChunkDataPacket = true;

        	data.close();
        	bytes.close();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }

        return packet;
	}

	// extradata [0] = player
	@Override
	public void interpret(DataInputStream stream, Object[] extradata, Side side)
	{
		if(side.isClient())
			return;
		try
		{
			EntityPlayer player = (EntityPlayer)extradata[0];
			EntityMG mg = FlansModPlayerHandler.getPlayerData(player).mountingGun;
			if(mg != null)
			{
				mg.mouseHeld(stream.readBoolean());
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public byte getPacketID()
	{
		return packetID;
	}
}
