package co.uk.flansmods.common.teams;

import net.minecraft.src.CommandBase;
import net.minecraft.src.ICommandSender;

public class CommandTeams extends CommandBase {
	
	public static TeamsManager teamsManager = TeamsManager.getInstance();

	@Override
	public String getCommandName() 
	{
		return "teams";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] split) 
	{
		if(teamsManager == null || split == null || split.length == 0 || split[0].equals("help") || split[0].equals("?"))
		{
			//TODO : Add help information
			return;
		}
		if(split[0].equals("listGametypes"))
		{
			sender.sendChatToPlayer("\u00a72Showing all avaliable gametypes");
			sender.sendChatToPlayer("\u00a72To pick a gametype, use \"/teams setGametype <gametype>\" with the name in brackets");
			for(Gametype gametype : Gametype.gametypes)
			{
				sender.sendChatToPlayer("\u00a7f" + gametype.name + " (" + gametype.shortName + ")");
			}
		}
		if(split[0].equals("setGametype"))
		{
			if(split.length == 0)
			{
				sender.sendChatToPlayer("\u00a74To set the gametype, use \"/teams setGametype <gametype>\" with a valid gametype.");
				return;
			}
			Gametype gametype = Gametype.getGametype(split[1]);
			if(gametype == null)
			{
				sender.sendChatToPlayer("\u00a74Invalid gametype. To see gametypes available type \"/teams listGametypes\"");
				return;
			}
			if(teamsManager.currentGametype != null)
			{
				teamsManager.currentGametype.stopGametype();
			}
			teamsManager.currentGametype = gametype;
			gametype.initGametype();
			teamsManager.messageAll("\u00a72" + sender.getCommandSenderName() + " changed the gametype to " + gametype.name);
			if(teamsManager.teams != null && gametype.numTeamsRequired == teamsManager.teams.length)
			{
				teamsManager.messageAll("\u00a72Teams will remain the same unless altered by an op.");
			}
			else
			{
				teamsManager.teams = new Team[gametype.numTeamsRequired];
				teamsManager.messageAll("\u00a72Teams must be reassigned for this gametype. Please wait for an op to do so.");
			}
		}
		if(split[0].equals("listTeams"))
		{
			if(teamsManager.teams == null)
			{
				sender.sendChatToPlayer("\u00a74The gametype is not yet set. Set it by \"/teams setGametype <gametype>\"");
				return;
			}
			sender.sendChatToPlayer("\u00a72Showing currently in use teams");
			for(int i = 0; i < teamsManager.teams.length; i++)
			{
				Team team = teamsManager.teams[i];
				if(team == null)
					sender.sendChatToPlayer("\u00a7f" + i + " : No team");
				else
					sender.sendChatToPlayer("\u00a7f" + team.textColour + i + " : " + team.name + " (" + team.shortName + ")");
			}
		}
		if(split[0].equals("listAllTeams"))
		{
			if(Team.teams.size() == 0)
			{
				sender.sendChatToPlayer("\u00a74No teams available. You need a content pack that has some teams with it");
				return;
			}
			sender.sendChatToPlayer("\u00a72Showing all avaliable teams");
			sender.sendChatToPlayer("\u00a72To pick these teams, use /teams setTeams <team1> <team2> with the names in brackets");
			for(Team team : Team.teams)
			{
				sender.sendChatToPlayer("\u00a7" + team.textColour + team.name + " (" + team.shortName + ")");
			}
		}
		if(split[0].equals("setTeams"))
		{
			if(teamsManager.currentGametype == null)
			{
				sender.sendChatToPlayer("\u00a74No gametype selected. Please select the gametype with the setGametype command");
				return;
			}
			if(split.length - 1 != teamsManager.teams.length)
			{
				sender.sendChatToPlayer("\u00a74Wrong number of teams given. This gametype requires " + teamsManager.teams.length + " teams to work");
				return;
			}
			Team[] teams = new Team[teamsManager.teams.length];
			String teamList = "";
			for(int i = 0; i < split.length - 1; i++)
			{
				Team team = Team.getTeam(split[i + 1]);
				if(team == null)
				{
					sender.sendChatToPlayer("\u00a74" + split[i + 1] + " is not a valid team");
					return;
				}
				for(int j = 0; j < i; j++)
				{
					if(team == teams[j])
					{
						sender.sendChatToPlayer("\u00a74You may not add " + split[i + 1] + " twice");
						return;
					}
				}
				teams[i] = team;
				teamList += (i == 0 ? "" : (i == split.length - 2 ? " and " : ", ")) + team.name;
			}
			teamsManager.messageAll("\u00a72" + sender.getCommandSenderName() + " changed the teams to be " + teamList);
		}
	}

}
