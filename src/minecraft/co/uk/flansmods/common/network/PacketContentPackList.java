package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.network.packet.Packet255KickDisconnect;
import co.uk.flansmods.client.GuiTeamSelect;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.teams.PlayerClass;
import co.uk.flansmods.common.teams.Team;
import co.uk.flansmods.common.teams.TeamsManager;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import cpw.mods.fml.common.network.PacketDispatcher;

public class PacketContentPackList extends FlanPacketCommon 
{	
	public static final byte packetID = 16;
	
	public static Packet buildContentPackListPacket(List<File> packs)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
	    ByteArrayOutputStream bytes = new ByteArrayOutputStream();
	    DataOutputStream data = new DataOutputStream(bytes);
	    try
	    {
	    	data.write(packetID); // this is the packet ID. identifies it as a TeamSelectPacket
	    	data.writeInt(packs.size());
	    	for(int i = 0; i < packs.size(); i++)
	    	{
	    		data.writeUTF(packs.get(i).getName());
	    	}
	    	
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
		if(side.equals(Side.SERVER)) interpretServer(stream, extradata); 
	}
		
	public void interpretServer(DataInputStream stream, Object[] extradata) {
	try
		{
			EntityPlayerMP player = (EntityPlayerMP)extradata[0];
			List<String> serverPackNames = new ArrayList<String>();
			for(File file : FlansMod.proxy.getContentList())
			{
				serverPackNames.add(file.getName());
			}
			int numPacks = stream.readInt();
			for(int i = 0; i < numPacks; i++)
			{
				String packName = stream.readUTF();
				serverPackNames.remove(packName);
			}
			//If there are some server packs that the client did not have
			if(!serverPackNames.isEmpty())
			{
				//Kick them		
				String reason = "You lack content packs : ";
				for(String name : serverPackNames)
				{
					reason = reason + name + ". ";
				}
				player.playerNetServerHandler.kickPlayerFromServer(reason);
			}
				
			
		}
		catch(Exception e)
		{
			FlansMod.log("Error reading packet or spawning particles");
			e.printStackTrace();
		}
	}
}

