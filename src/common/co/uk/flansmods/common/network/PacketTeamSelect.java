package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.client.Minecraft;
import net.minecraft.src.EntityPlayerMP;
import net.minecraft.src.Packet;
import net.minecraft.src.Packet250CustomPayload;
import co.uk.flansmods.client.GuiTeamSelect;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.teams.PlayerClass;
import co.uk.flansmods.common.teams.Team;
import co.uk.flansmods.common.teams.TeamsManager;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

public class PacketTeamSelect extends FlanPacketCommon 
{
public static final byte packetID = 6;
	
	//Build a packet with the names of the teams the player can choose
	public static Packet buildTeamChoicesPacket(Team[] teams)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
	    ByteArrayOutputStream bytes = new ByteArrayOutputStream();
	    DataOutputStream data = new DataOutputStream(bytes);
	    try
	    {
	    	data.write(packetID); // this is the packet ID. identifies it as a TeamSelectPacket
	    	data.writeBoolean(false);	//False for team choices
	    	data.writeByte(teams.length);
	    	for(int i = 0; i < teams.length; i++)
	    	{
	    		data.writeUTF(teams[i].shortName);
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
	
	//Build a packet with the names of the classes the player can choose
	public static Packet buildClassChoicesPacket(PlayerClass[] classes)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
	    ByteArrayOutputStream bytes = new ByteArrayOutputStream();
	    DataOutputStream data = new DataOutputStream(bytes);
	    try
	    {
	    	data.write(packetID); 		//this is the packet ID. identifies it as a TeamSelectPacket
	    	data.writeBoolean(true);	//True for class choices
	    	data.writeByte(classes.length);
	    	for(int i = 0; i < classes.length; i++)
	    	{
	    		data.writeUTF(classes[i].shortName);
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
	
	public static Packet buildSelectionPacket(String shortName, boolean classPacket)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
	    ByteArrayOutputStream bytes = new ByteArrayOutputStream();
	    DataOutputStream data = new DataOutputStream(bytes);
	    try
	    {
	    	data.write(packetID); // this is the packet ID. identifies it as a TeamSelectPacket
	    	data.writeBoolean(classPacket);	//True if selecting class, false if selecting team
	    	data.writeUTF(shortName);
	
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

	//Upon recieving, read the team / class chosen and pass it to the gametype
	@Override
	public void interpret(DataInputStream stream, Object[] extradata, Side side)
	{
		if(side.equals(Side.CLIENT)) interpretClient(stream, extradata);
	}
	
	@SideOnly(Side.CLIENT)
	public void interpretClient(DataInputStream stream, Object[] extradata) {
		try
		{
			boolean classPacket = stream.readBoolean();
			if(classPacket)
			{
				int numClasses = stream.readByte();
				PlayerClass[] classes = new PlayerClass[numClasses];
				for(int i = 0; i < numClasses; i++)
				{
					classes[i] = PlayerClass.getClass(stream.readUTF());
				}
				Minecraft.getMinecraft().displayGuiScreen(new GuiTeamSelect(classes));
			}
			else
			{
				int numTeams = stream.readByte();
				Team[] teams = new Team[numTeams];
				for(int i = 0; i < numTeams; i++)
				{
					teams[i] = Team.getTeam(stream.readUTF());
				}
				Minecraft.getMinecraft().displayGuiScreen(new GuiTeamSelect(teams));
			}
		}
		catch(Exception e)
		{
			FlansMod.log("Error reading packet or spawning particles");
			e.printStackTrace();
		}
	}
}
