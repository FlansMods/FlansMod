package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.world.World;
import co.uk.flansmods.common.EntityMG;
import co.uk.flansmods.common.FlansMod;
import cpw.mods.fml.relauncher.Side;

public class PacketMGMount extends FlanPacketCommon 
{
	public static final byte packetID = 10;
	
	public static Packet buildMGPacket(EntityPlayer player, EntityMG mg, boolean mounting)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID); // this is the packet ID. identifies it as a BreakSoundPacket
        	data.writeInt(player.entityId);
        	data.writeInt(mg.entityId);
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
			EntityPlayer player = null;
			for(Object obj : world.loadedEntityList)
			{
				if(obj instanceof EntityPlayer && ((Entity)obj).entityId == playerId)
				{
					player = (EntityPlayer)obj;
					break;
				}
			}
			int mgId = stream.readInt();
			EntityMG mg = null;
			for(Object obj : world.loadedEntityList)
			{
				if(obj instanceof EntityMG && ((Entity)obj).entityId == mgId)
				{
					mg = (EntityMG)obj;
					break;
				}
			}
			boolean mounting = stream.readBoolean();
			mg.mountGun(player, mounting);
        }
        catch(Exception e)
        {
        	FlansMod.log("Error reading mountMG packet");
        	e.printStackTrace();
        }
	}

	@Override
	public byte getPacketID()
	{
		return packetID;
	}
}
