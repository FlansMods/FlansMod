package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import co.uk.flansmods.client.FlansModClient;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.ItemGun;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

//An incredibly simple packet. When the client recieves one it "reloads". Basically to stop recoil
public class PacketReload extends FlanPacketCommon 
{
	public static final byte packetID = 19;
	
	public static Packet buildReloadPacket()
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID);
        	
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
		else FlansMod.log("Reload packet recieved on server. Skipping interpretation.");
	}
	
	@SideOnly(value = Side.CLIENT)
	private void interpretClient(DataInputStream stream, Object[] extradata)
	{
        try
        {
        	EntityPlayer player = (EntityPlayer)extradata[0];
        	ItemStack stack = player.getCurrentEquippedItem();
        	if(stack != null && stack.getItem() instanceof ItemGun)
        	{
        		FlansModClient.shootTime = ((ItemGun)stack.getItem()).type.reloadTime;
        	}
        }
        catch(Exception e)
        {
        	FlansMod.log("Error \"reload\"ing from reload packet");
        	e.printStackTrace();
        }
	}

	@Override
	public byte getPacketID()
	{
		return packetID;
	}
}
