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

public class PacketTeamSelect extends FlanPacketServer 
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

	//Upon recieving, read the team / class chosen and pass it to the gametype
	@Override
	public void interpret(DataInputStream stream, Object[] extradata)
	{
		try
		{
			EntityPlayerMP player = (EntityPlayerMP)extradata[0];
			boolean classPacket = stream.readBoolean();
			if(classPacket)
			{
				PlayerClass playerClass = PlayerClass.getClass(stream.readUTF());
				TeamsManager.getInstance().currentGametype.playerChoseClass(player, playerClass);
			}
			else
			{
				Team team = Team.getTeam(stream.readUTF());
				TeamsManager.getInstance().currentGametype.playerChoseTeam(player, team);
			}
		}
		catch(Exception e)
		{
			FlansMod.log("Error reading packet");
			e.printStackTrace();
		}
	}
}
