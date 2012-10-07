package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.src.Packet;
import net.minecraft.src.Packet250CustomPayload;
import net.minecraft.src.World;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.TileEntityGunBox;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Side;

public class PacketGunBoxTE extends FlanPacketServer
{
	public static final byte packetID = 7;
	
	public static Packet buildGunBoxPacket(TileEntityGunBox entity)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID);
        	data.writeInt(entity.xCoord);
        	data.writeInt(entity.yCoord);
        	data.writeInt(entity.zCoord);
        	data.writeUTF(entity.getShortName());

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

	// extradata [0] = world
	@Override
	public void interpret(DataInputStream stream, Object[] extradata, Side side)
	{
		try
		{
			int x = stream.readInt();
			int y = stream.readInt();
			int z = stream.readInt();
			String type = stream.readUTF();
			
			World world = (World) extradata[0];
			
			TileEntityGunBox entity = (TileEntityGunBox) world.getBlockTileEntity(x, y, z);
			entity.setShortName(type);
			
			world.markBlockNeedsUpdate(x, y, z);
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
