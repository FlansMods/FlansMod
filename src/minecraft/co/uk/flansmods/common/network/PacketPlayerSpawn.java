package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import co.uk.flansmods.common.FlansMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PacketPlayerSpawn extends FlanPacketCommon 
{
	public static final byte packetID = 20;
	
	public static Packet buildPlayerSpawnPacket(EntityPlayer player, double x, double y, double z)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID);
        	data.writeUTF(player.username);
        	data.writeDouble(x);
        	data.writeDouble(y);
        	data.writeDouble(z);

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
		if(side.equals(Side.CLIENT)) interpretClient(stream, extradata);
		else FlansMod.log("Received player spawn packet on server! Doing nothing");
	}
	
	@SideOnly(Side.CLIENT)
	public void interpretClient(DataInputStream stream, Object[] extradata) {
		try
		{
			String name = stream.readUTF();
			double x = stream.readDouble();
			double y = stream.readDouble();
			double z = stream.readDouble();
			Minecraft minecraft = Minecraft.getMinecraft();
			for(Object obj : Minecraft.getMinecraft().theWorld.playerEntities)
			{
				EntityPlayer player = (EntityPlayer)obj;
				if(!player.isDead && player.username.equals(name))
				{
					//player.setPositionAndRotation2(x, y, z, 0, 0, 1);
					//player.lastTickPosX = player.prevPosX = x;
					//player.lastTickPosY = player.prevPosY = y;
					//player.lastTickPosZ = player.prevPosZ = z;
				}
			}
		}
		catch(Exception e)
		{
			FlansMod.log("Error reading packet or setting player spawn position");
			e.printStackTrace();
		}
	}

	@Override
	public byte getPacketID()
	{
		return packetID;
	}
}
