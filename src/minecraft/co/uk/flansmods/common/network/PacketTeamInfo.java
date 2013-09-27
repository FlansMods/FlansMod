package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Collections;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import co.uk.flansmods.client.GuiTeamScores;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.FlansModPlayerData;
import co.uk.flansmods.common.FlansModPlayerHandler;
import co.uk.flansmods.common.teams.Team;
import co.uk.flansmods.common.teams.TeamsManager;
import co.uk.flansmods.common.teams.Team.ComparatorScore;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PacketTeamInfo extends FlanPacketCommon 
{
	public static final byte packetID = 18;
	
	public static Packet buildInfoPacket()
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID);
        	if(TeamsManager.getInstance().currentGametype == null)
        	{
        		data.writeUTF("No Gametype");
        		data.writeInt(0);
        	}
        	else
        	{
        		data.writeUTF(TeamsManager.getInstance().currentGametype.name);
        		data.writeUTF(TeamsManager.getInstance().currentMap.name);
        		if(TeamsManager.getInstance().currentGametype.sortScoreboardByTeam())
        		{
        			data.writeBoolean(true);
		        	if(TeamsManager.getInstance().teams == null)
		        	{
		        		data.writeInt(0);
		        	}
		        	else
		        	{
			        	data.writeInt(TeamsManager.getInstance().teams.length);
			        	for(int i = 0; i < TeamsManager.getInstance().teams.length; i++)
			        	{
			        		Team team = TeamsManager.getInstance().teams[i];
			        		if(team == null)
			        		{
			        			data.writeUTF("none");
			        			continue;
			        		}
			        		data.writeUTF(team.shortName);
			        		data.writeInt(team.score);
			        		team.sortPlayers();
			        		data.writeInt(team.members.size());
			        		for(int j = 0; j < team.members.size(); j++)
			        		{
			        			String username = team.members.get(j);
			        			FlansModPlayerData playerData = FlansModPlayerHandler.getPlayerData(username, Side.SERVER);
			        			data.writeUTF(username);
			        			if(playerData == null)
			        			{
			        				data.writeInt(0);
			        				data.writeInt(0);
			        				data.writeInt(0);
			        			}
			        			else
			        			{
				        			data.writeInt(playerData.score);
				        			data.writeInt(playerData.kills);
				        			data.writeInt(playerData.deaths);
			        			}
			        		}
			        	}
		        	}
        		}
        		else
        		{
        			data.writeBoolean(false);
        			ArrayList<String> playerNames = new ArrayList<String>();
        			for(int i = 0; i < TeamsManager.getInstance().teams.length; i++)
		        	{
		        		Team team = TeamsManager.getInstance().teams[i];
		        		if(team == null || team.members == null)
		        		{
		        			continue;
		        		}
		        		playerNames.addAll(team.members);
		        	}
        			
        			Collections.sort(playerNames, new Team.ComparatorScore());
	        		data.writeInt(playerNames.size());
	        		for(int j = 0; j < playerNames.size(); j++)
	        		{
	        			String username = playerNames.get(j);
	        			FlansModPlayerData playerData = FlansModPlayerHandler.getPlayerData(username, Side.SERVER);
	        			data.writeUTF(username);
	        			if(playerData == null)
	        			{
	        				data.writeInt(0);
	        				data.writeInt(0);
	        				data.writeInt(0);
	        			}
	        			else
	        			{
		        			data.writeInt(playerData.score);
		        			data.writeInt(playerData.kills);
		        			data.writeInt(playerData.deaths);
	        			}
	        		}
		        	
        		}
        	}
        	
        	data.writeBoolean(FlansMod.canBreakGlass);
        	data.writeBoolean(FlansMod.vehiclesNeedFuel);
        	data.writeBoolean(FlansMod.driveablesBreakBlocks);
        	
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
	@SideOnly(Side.CLIENT)
	public void interpret(DataInputStream stream, Object[] extradata, Side side)
	{
		GuiTeamScores.interpret(stream);
	}
	
	@Override
	public byte getPacketID()
	{
		return packetID;
	}
}
