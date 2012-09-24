package co.uk.flansmods.client.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.client.Minecraft;
import net.minecraft.src.Packet;
import net.minecraft.src.Packet250CustomPayload;
import net.minecraft.src.World;
import co.uk.flansmods.client.GuiPlaneFuel;
import co.uk.flansmods.client.GuiTeamSelect;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.teams.PlayerClass;
import co.uk.flansmods.common.teams.Team;

public class PacketTeamSelect extends FlanPacketClient 
{
	public static final byte packetID = 6;
	
	//Build a packet with the name of the team the player is selecting
	public static Packet buildTeamSelectPacket(String teamShortName)
	{
		return buildSelectionPacket(teamShortName, false);
	}
	
	//Build a packet with the name of the class the player is selecting
	public static Packet buildClassSelectPacket(String classShortName)
	{
		return buildSelectionPacket(classShortName, true);
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

	//Upon recieving, read the teams / classes list and pass them to a new Team / Class Selection GUI
	@Override
	public void interpret(DataInputStream stream, Object[] extradata)
	{
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
