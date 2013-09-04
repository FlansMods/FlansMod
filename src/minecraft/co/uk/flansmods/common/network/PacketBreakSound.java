package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.block.Block;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import co.uk.flansmods.common.FlansMod;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PacketBreakSound extends FlanPacketCommon
{
	public static final byte packetID = 1;
	
	public static Packet buildBreakSoundPacket(int x, int y, int z, int BlockID)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID); // this is the packet ID. identifies it as a BreakSoundPacket
        	data.writeInt(x);
        	data.writeInt(y);
        	data.writeInt(z);
        	data.writeInt(BlockID);
        	
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
		if (side.equals(Side.CLIENT))
			interpretClient(stream, extradata);	
		else FlansMod.log("Sound packet recieved on server. Skipping interpretation.");
	}
	
	@SideOnly(value = Side.CLIENT)
	private void interpretClient(DataInputStream stream, Object[] extradata)
	{
        try
        {
        	int x = stream.readInt();
        	int y = stream.readInt();
        	int z = stream.readInt();
        	int blockID = stream.readInt();
        	
    		Block block = Block.blocksList[blockID];
        	FMLClientHandler.instance().getClient().effectRenderer.addBlockHitEffects((int)x, (int)y, (int)z, 1);
        	FMLClientHandler.instance().getClient().sndManager.playSound(block.stepSound.getBreakSound(), (float)x + 0.5F, (float)y + 0.5F, (float)z + 0.5F, (block.stepSound.getVolume() + 1.0F) / 2.0F, block.stepSound.getPitch() * 0.8F);
        }
        catch(Exception e)
        {
        	FlansMod.log("Error reading or playing break sound");
        	e.printStackTrace();
        }
	}

	@Override
	public byte getPacketID()
	{
		return packetID;
	}
}
