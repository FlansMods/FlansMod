package com.flansmod.common.teams;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

import com.flansmod.common.FlansMod;

public class CommandTeams extends CommandBase 
{
	
	public static TeamsManager teamsManager = TeamsManager.getInstance();

	@Override
	public String getCommandName() 
	{
		return "teams";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] split) 
	{
		if(teamsManager == null)
		{
			sender.addChatMessage(new ChatComponentText("Teams mod is broken. You will need to look at the server side logs to see what's wrong"));
			return;
		}
		if(split == null || split.length == 0 || split[0].equals("help") || split[0].equals("?"))
		{
			if(split.length == 2)
				sendHelpInformation(sender, Integer.parseInt(split[1]));
			else sendHelpInformation(sender, 1);
			return;
		}
		//On / off
		if(split[0].equals("off"))
		{
			teamsManager.currentRound = null;
			teamsManager.enabled = false;
			TeamsManager.messageAll("Flan's Teams Mod disabled");
			return;
		}
		if(split[0].equals("on"))
		{
			teamsManager.enabled = true;
			TeamsManager.messageAll("Flan's Teams Mod enabled");
			return;
		}
		if(!teamsManager.enabled)
		{
			sender.addChatMessage(new ChatComponentText("Teams mod is disabled. Try /teams on"));
			return;
		}
		if(split[0].equals("survival"))
		{
			teamsManager.explosions = true;
			teamsManager.driveablesBreakBlocks = true;
			teamsManager.bombsEnabled = true;
			teamsManager.bulletsEnabled = true;
			teamsManager.forceAdventureMode = false;
			teamsManager.overrideHunger = false;
			teamsManager.canBreakGuns = true;
			teamsManager.canBreakGlass = true;
			teamsManager.armourDrops = true;
			teamsManager.weaponDrops = 1;
			teamsManager.vehiclesNeedFuel = true;
			teamsManager.mgLife = teamsManager.planeLife = teamsManager.vehicleLife = teamsManager.aaLife = teamsManager.mechaLove = 0;
			teamsManager.messageAll("Flan's Mod switching to survival presets");
			return;
		}
		if(split[0].equals("arena"))
		{
			teamsManager.explosions = false;
			teamsManager.driveablesBreakBlocks = false;
			teamsManager.bombsEnabled = true;
			teamsManager.bulletsEnabled = true;
			teamsManager.forceAdventureMode = true;
			teamsManager.overrideHunger = true;
			teamsManager.canBreakGuns = true;
			teamsManager.canBreakGlass = false;
			teamsManager.armourDrops = false;
			teamsManager.weaponDrops = 2;
			teamsManager.vehiclesNeedFuel = false;
			teamsManager.mgLife = teamsManager.planeLife = teamsManager.vehicleLife = teamsManager.aaLife = teamsManager.mechaLove = 120;
			TeamsManager.messageAll("Flan's Mod switching to arena mode presets");
			return;
		}
		if(split[0].equals("listGametypes"))
		{
			sender.addChatMessage(new ChatComponentText("\u00a72Showing all avaliable gametypes"));
			sender.addChatMessage(new ChatComponentText("\u00a72To pick a gametype, use \"/teams setGametype <gametype>\" with the name in brackets"));
			for(Gametype gametype : Gametype.gametypes.values())
			{
				sender.addChatMessage(new ChatComponentText("\u00a7f" + gametype.name + " (" + gametype.shortName + ")"));
			}
			return;
		}
		/*
		No longer used
		if(split[0].equals("setGametype"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("\u00a74To set the gametype, use \"/teams setGametype <gametype>\" with a valid gametype."));
				return;
			}
			if(split[1].toLowerCase().equals("none"))
			{
				if(teamsManager.currentGametype != null)
					teamsManager.currentGametype.stopGametype();
				teamsManager.currentGametype = null;
				for(PlayerData data : PlayerHandler.serverSideData.values())
				{
					if(data != null)
						data.team = null;
				}
				return;
			}
			Gametype gametype = Gametype.getGametype(split[1]);
			if(gametype == null)
			{
				sender.addChatMessage(new ChatComponentText("\u00a74Invalid gametype. To see gametypes available type \"/teams listGametypes\""));
				return;
			}
			if(teamsManager.currentGametype != null)
			{
				teamsManager.currentGametype.stopGametype();
			}
			teamsManager.currentGametype = gametype;

			TeamsManager.messageAll("\u00a72" + sender.getCommandSenderName() + "\u00a7f changed the gametype to \u00a72" + gametype.name);
			if(teamsManager.teams != null && gametype.numTeamsRequired == teamsManager.teams.length)
			{
				TeamsManager.messageAll("\u00a7fTeams will remain the same unless altered by an op.");
			}
			else
			{
				teamsManager.teams = new Team[gametype.numTeamsRequired];
				TeamsManager.messageAll("\u00a7fTeams must be reassigned for this gametype. Please wait for an op to do so.");
			}
			gametype.initGametype();
			return;
		}*/
		if(split[0].equals("listMaps"))
		{
			if(teamsManager.maps == null)
			{
				sender.addChatMessage(new ChatComponentText("The map list is null"));
				return;
			}
			sender.addChatMessage(new ChatComponentText("\u00a72Listing maps"));
			for(TeamsMap map : teamsManager.maps.values())
			{
				sender.addChatMessage(new ChatComponentText((teamsManager.currentRound != null && map == teamsManager.currentRound.map ? "\u00a74" : "") + map.name + " (" + map.shortName + ")"));
			}
			return;
		}
		if(split[0].equals("addMap"))
		{
			if(split.length < 3)
			{
				sender.addChatMessage(new ChatComponentText("You need to specify a map name"));
				return;
			}
			String shortName = split[1];
			String name = split[2];
			for(int i = 3; i < split.length; i++)
			{
				name += " " + split[i];
			}
			teamsManager.maps.put(shortName, new TeamsMap(sender.getEntityWorld(), shortName, name));
			sender.addChatMessage(new ChatComponentText("Added new map : " + name + " (" + shortName + ")"));
			return;
		}
		if(split[0].equals("removeMap"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("You need to specify a map's short name"));
				return;
			}
			if(teamsManager.maps.containsKey(split[1]))
			{
				teamsManager.maps.remove(split[1]);
				sender.addChatMessage(new ChatComponentText("Removed map " + split[1]));
			}
			else
			{
				sender.addChatMessage(new ChatComponentText("Map (" + split[1] + ") not found"));
			}
			
			return;
		}
		if(split[0].equals("setRound"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("You need to specify the round index (see /teams listRounds)"));
				return;
			}
			TeamsRound round = teamsManager.rounds.get(Integer.parseInt(split[1]));
			if(round != null)
			{
				teamsManager.nextRound = round;
				TeamsManager.messageAll("\u00a72Next round will be " + round.gametype.shortName + " in " + round.map.name);
			}
			return;
		}
		/*
		if(split[0].equals("listTeams"))
		{
			if(teamsManager.currentGametype == null || teamsManager.teams == null)
			{
				sender.addChatMessage(new ChatComponentText("\u00a74The gametype is not yet set. Set it by \"/teams setGametype <gametype>\""));
				return;
			}
			sender.addChatMessage(new ChatComponentText("\u00a72Showing currently in use teams"));
			for(int i = 0; i < teamsManager.teams.length; i++)
			{
				Team team = teamsManager.teams[i];
				if(team == null)
					sender.addChatMessage(new ChatComponentText("\u00a7f" + i + " : No team"));
				else
					sender.addChatMessage(new ChatComponentText("\u00a7" + team.textColour + i + " : " + team.name + " (" + team.shortName + ")"));
			}
			return;
		}
		*/
		if(split[0].equals("listTeams") || split[0].equals("listAllTeams"))
		{
			if(Team.teams.size() == 0)
			{
				sender.addChatMessage(new ChatComponentText("\u00a74No teams available. You need a content pack that has some teams with it"));
				return;
			}
			sender.addChatMessage(new ChatComponentText("\u00a72Showing all avaliable teams"));
			sender.addChatMessage(new ChatComponentText("\u00a72To pick these teams, use /teams setTeams <team1> <team2> with the names in brackets"));
			for(Team team : Team.teams)
			{
				sender.addChatMessage(new ChatComponentText("\u00a7" + team.textColour + team.name + " (" + team.shortName + ")"));
			}
			return;
		}
		/*
		 * No longer used
		if(split[0].equals("setTeams"))
		{
			if(teamsManager.currentGametype == null || teamsManager.teams == null)
			{
				sender.addChatMessage(new ChatComponentText("\u00a74No gametype selected. Please select the gametype with the setGametype command"));
				return;
			}
			if(split.length - 1 != teamsManager.teams.length)
			{
				sender.addChatMessage(new ChatComponentText("\u00a74Wrong number of teams given. This gametype requires " + teamsManager.teams.length + " teams to work"));
				return;
			}
			Team[] teams = new Team[teamsManager.teams.length];
			String teamList = "";
			for(int i = 0; i < split.length - 1; i++)
			{
				Team team = Team.getTeam(split[i + 1]);
				if(team == null)
				{
					sender.addChatMessage(new ChatComponentText("\u00a74" + split[i + 1] + " is not a valid team"));
					return;
				}
				for(int j = 0; j < i; j++)
				{
					if(team == teams[j])
					{
						sender.addChatMessage(new ChatComponentText("\u00a74You may not add " + split[i + 1] + " twice"));
						return;
					}
				}
				teams[i] = team;
				teamList += (i == 0 ? "" : (i == split.length - 2 ? " and " : ", ")) + "\u00a7" + team.textColour + team.name + "\u00a7f";
			}
			teamsManager.teams = teams;
			teamsManager.currentGametype.teamsSet();
			TeamsManager.messageAll("\u00a72" + sender.getCommandSenderName() + "\u00a7f changed the teams to be " + teamList);
			return;
		}
		*/
		if(split[0].equals("getSticks") || split[0].equals("getOpSticks") || split[0].equals("getOpKit"))
		{
			EntityPlayerMP player = getPlayer(sender.getCommandSenderName());
			if(player != null)
			{
				player.inventory.addItemStackToInventory(new ItemStack(FlansMod.opStick, 1, 0));
				player.inventory.addItemStackToInventory(new ItemStack(FlansMod.opStick, 1, 1));
				player.inventory.addItemStackToInventory(new ItemStack(FlansMod.opStick, 1, 2));
				player.inventory.addItemStackToInventory(new ItemStack(FlansMod.opStick, 1, 3));
				sender.addChatMessage(new ChatComponentText("\u00a72Enjoy your op sticks."));
				sender.addChatMessage(new ChatComponentText("\u00a77The Stick of Connecting connects objects (spawners, banners etc) to bases (flagpoles etc)"));
				sender.addChatMessage(new ChatComponentText("\u00a77The Stick of Ownership sets the team that currently owns a base"));
				sender.addChatMessage(new ChatComponentText("\u00a77The Stick of Mapping sets the map that a base is currently associated with"));
				sender.addChatMessage(new ChatComponentText("\u00a77The Stick of Destruction deletes bases and team objects"));
			}
			return;
		}
		if(split[0].toLowerCase().equals("autobalance"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));	
				return;
			}
			TeamsManager.autoBalance = Boolean.parseBoolean(split[1]);
			sender.addChatMessage(new ChatComponentText("Autobalance is now " + (TeamsManager.autoBalance ? "enabled" : "disabled")));
			return;
		}
		if(split[0].equals("useRotation"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));	
				return;
			}
			TeamsManager.voting = !Boolean.parseBoolean(split[1]);
			sender.addChatMessage(new ChatComponentText("Voting is now " + (TeamsManager.voting ? "enabled" : "disabled")));
			return;
		}
		if(split[0].equals("voting"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));	
				return;
			}
			TeamsManager.voting = Boolean.parseBoolean(split[1]);
			sender.addChatMessage(new ChatComponentText("Voting is now " + (TeamsManager.voting ? "enabled" : "disabled")));
			return;
		}
		if(split[0].equals("listRounds") || split[0].equals("listRotation"))
		{
			sender.addChatMessage(new ChatComponentText("\u00a72Current Round List"));
			for(int i = 0; i < TeamsManager.getInstance().rounds.size(); i++)
			{
				TeamsRound entry = TeamsManager.getInstance().rounds.get(i);
				if(entry.map == null)
				{
					sender.addChatMessage(new ChatComponentText("Round had null map"));
					return;
				}
				if(entry.gametype == null)
				{
					sender.addChatMessage(new ChatComponentText("Round had null gametype"));
					return;
				}
				String s = i + ". " + entry.map.shortName + ", " + entry.gametype.shortName;
				if(entry == TeamsManager.getInstance().currentRound)
				{
					s = "\u00a74" + s;
				}
				for(int j = 0; j < entry.teams.length; j++)
				{
					s += ", " + entry.teams[j].shortName;
				}
				s += ", " + entry.timeLimit;
				s += ", " + entry.scoreLimit;
				s += ", Pop : " + (int)(entry.popularity * 100F) + "%";
				sender.addChatMessage(new ChatComponentText(s));
			}
			return;
		}
		if(split[0].equals("removeRound") || split[0].equals("removeMapFromRotation") || split[0].equals("removeFromRotation") || split[0].equals("removeRotation"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <ID>"));	
				return;
			}
			int map = Integer.parseInt(split[1]);
			sender.addChatMessage(new ChatComponentText("Removed map " + map + " (" + TeamsManager.getInstance().rounds.get(map).map.shortName + ") from rotation"));
			TeamsManager.getInstance().rounds.remove(map);
			return;
		}
		if(split[0].equals("addMapToRotation") || split[0].equals("addToRotation") || split[0].equals("addRotation") || split[0].equals("addRound"))
		{
			if(split.length < 7)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <Map> <Gametype> <Team1> <Team2> ... <TimeLimit> <ScoreLimit>"));	
				return;
			}
			TeamsMap map = TeamsManager.getInstance().maps.get(split[1]);
			if(map == null)
			{
				sender.addChatMessage(new ChatComponentText("Could not find map : " + split[1]));	
				return;
			}
			Gametype gametype = Gametype.getGametype(split[2]);
			if(gametype == null)
			{
				sender.addChatMessage(new ChatComponentText("Could not find gametype : " + split[2]));	
				return;
			}
			if(split.length != 5 + gametype.numTeamsRequired)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <Map> <Gametype> <Team1> <Team2> ... <ScoreLimit> <TimeLimit>"));	
				return;
			}
			Team[] teams = new Team[gametype.numTeamsRequired];
			for(int i = 0; i < teams.length; i++)
			{
				teams[i] = Team.getTeam(split[3 + i]);
			}
			sender.addChatMessage(new ChatComponentText("Added map (" + map.shortName + ") to rotation"));
			TeamsManager.getInstance().rounds.add(new TeamsRound(map, gametype, teams, Integer.parseInt(split[3 + gametype.numTeamsRequired]), Integer.parseInt(split[4 + gametype.numTeamsRequired])));
			return;
		}
		if(split[0].equals("start") || split[0].equals("begin"))
		{
			teamsManager.start();
			sender.addChatMessage(new ChatComponentText("Started teams map rotation"));
			return;
		}
		if(split[0].equals("nextMap") || split[0].equals("next") || split[0].equals("nextRound"))
		{
			teamsManager.roundTimeLeft = 1;
			return;
		}
		/*
		 * Ignore
		if(split[0].equals("goToMap"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <ID>"));	
				return;
			}
			int prevRotation = Integer.parseInt(split[1]) - 1;
			if(prevRotation == -1)
				prevRotation = teamsManager.rotation.size() - 1;
			teamsManager.currentRotationEntry = prevRotation;
			teamsManager.switchToNextGametype();
			return;
		}
		*/
		if(split[0].equals("forceAdventure") || split[0].equals("forceAdventureMode"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));	
				return;
			}
			TeamsManager.forceAdventureMode = Boolean.parseBoolean(split[1]);
			sender.addChatMessage(new ChatComponentText("Adventure mode will " + (TeamsManager.forceAdventureMode ? "now" : "no longer") + " be forced"));
			return;
		}
		if(split[0].equals("overrideHunger") || split[0].equals("noHunger"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));	
				return;
			}
			TeamsManager.overrideHunger = Boolean.parseBoolean(split[1]);
			sender.addChatMessage(new ChatComponentText("Players will " + (TeamsManager.overrideHunger ? "no longer" : "now") + " get hungry during rounds"));
			return;
		}
		if(split[0].equals("explosions"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));	
				return;
			}
			TeamsManager.explosions = Boolean.parseBoolean(split[1]);
			sender.addChatMessage(new ChatComponentText("Expolsions are now " + (TeamsManager.explosions ? "enabled" : "disabled")));
			return;
		}
		if(split[0].equals("bombs") || split[0].equals("allowBombs"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));	
				return;
			}
			TeamsManager.bombsEnabled = Boolean.parseBoolean(split[1]);
			sender.addChatMessage(new ChatComponentText("Bombs are now " + (TeamsManager.bombsEnabled ? "enabled" : "disabled")));
			return;
		}
		if(split[0].equals("bullets") || split[0].equals("bulletsEnabled"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));	
				return;
			}
			TeamsManager.bulletsEnabled = Boolean.parseBoolean(split[1]);
			sender.addChatMessage(new ChatComponentText("Bullets are now " + (TeamsManager.bulletsEnabled ? "enabled" : "disabled")));
			return;
		}
		if(split[0].equals("canBreakGuns"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));	
				return;
			}
			TeamsManager.canBreakGuns = Boolean.parseBoolean(split[1]);
			sender.addChatMessage(new ChatComponentText("AAGuns and MGs can " + (TeamsManager.canBreakGuns ? "now" : "no longer") + " be broken"));
			return;
		}
		if(split[0].equals("canBreakGlass"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));	
				return;
			}
			TeamsManager.canBreakGlass = Boolean.parseBoolean(split[1]);
			sender.addChatMessage(new ChatComponentText("Glass and glowstone can " + (TeamsManager.canBreakGlass ? "now" : "no longer") + " be broken"));
			return;
		}
		if(split[0].equals("armourDrops") || split[0].equals("armorDrops"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));	
				return;
			}
			TeamsManager.armourDrops = Boolean.parseBoolean(split[1]);
			sender.addChatMessage(new ChatComponentText("Armour will " + (TeamsManager.armourDrops ? "now" : "no longer") + " be dropped"));
			return;
		}
		if(split[0].equals("weaponDrops"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <on/off/smart>"));	
				return;
			}
			if(split[1].toLowerCase().equals("on"))
			{
				TeamsManager.weaponDrops = 1;
				sender.addChatMessage(new ChatComponentText("Weapons will be dropped normally"));
			}
			else if(split[1].toLowerCase().equals("off"))
			{
				TeamsManager.weaponDrops = 0;
				sender.addChatMessage(new ChatComponentText("Weapons will be not be dropped"));
			}
			else if(split[1].toLowerCase().equals("smart"))
			{
				TeamsManager.weaponDrops = 2;
				sender.addChatMessage(new ChatComponentText("Smart drops enabled"));
			}
			return;
		}
		if(split[0].equals("fuelNeeded"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));	
				return;
			}
			TeamsManager.vehiclesNeedFuel = Boolean.parseBoolean(split[1]);
			sender.addChatMessage(new ChatComponentText("Vehicles will " + (TeamsManager.vehiclesNeedFuel ? "now" : "no longer") + " require fuel"));
			return;
		}
		if(split[0].equals("mgLife"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <time>"));	
				return;
			}
			TeamsManager.mgLife = Integer.parseInt(split[1]);
			if(TeamsManager.mgLife > 0)
				sender.addChatMessage(new ChatComponentText("MGs will despawn after " + TeamsManager.mgLife + " seconds"));
			else sender.addChatMessage(new ChatComponentText("MGs will not despawn"));
			return;
		}
		if(split[0].equals("planeLife"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <time>"));	
				return;
			}
			TeamsManager.planeLife = Integer.parseInt(split[1]);
			if(TeamsManager.planeLife > 0)
				sender.addChatMessage(new ChatComponentText("Planes will despawn after " + TeamsManager.planeLife + " seconds"));
			else sender.addChatMessage(new ChatComponentText("Planes will not despawn"));
			return;
		}
		if(split[0].equals("vehicleLife"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <time>"));	
				return;
			}
			TeamsManager.vehicleLife = Integer.parseInt(split[1]);
			if(TeamsManager.vehicleLife > 0)
				sender.addChatMessage(new ChatComponentText("Vehicles will despawn after " + TeamsManager.vehicleLife + " seconds"));
			else sender.addChatMessage(new ChatComponentText("Vehicles will not despawn"));
			return;
		}
		if(split[0].equals("mechaLife"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <time>"));	
				return;
			}
			TeamsManager.mechaLove = Integer.parseInt(split[1]);
			if(TeamsManager.mechaLove > 0)
				sender.addChatMessage(new ChatComponentText("Mechas will despawn after " + TeamsManager.mechaLove + " seconds"));
			else sender.addChatMessage(new ChatComponentText("Mechas will not despawn"));
			return;
		}
		if(split[0].equals("aaLife"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <time>"));	
				return;
			}
			TeamsManager.aaLife = Integer.parseInt(split[1]);
			if(TeamsManager.aaLife > 0)
				sender.addChatMessage(new ChatComponentText("AA Guns will despawn after " + TeamsManager.aaLife + " seconds"));
			else sender.addChatMessage(new ChatComponentText("AA Guns will not despawn"));
			return;
		}
		if(split[0].equals("vehiclesBreakBlocks"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));	
				return;
			}
			TeamsManager.driveablesBreakBlocks = Boolean.parseBoolean(split[1]);
			sender.addChatMessage(new ChatComponentText("Vehicles will " + (TeamsManager.driveablesBreakBlocks ? "now" : "no longer") + " break blocks"));
			return;
		}
		if(split[0].equals("scoreDisplayTime"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <time>"));	
				return;
			}
			TeamsManager.scoreDisplayTime = Integer.parseInt(split[1]) * 20;
			sender.addChatMessage(new ChatComponentText("Score summary menu will appear for " + TeamsManager.scoreDisplayTime / 20 + " seconds"));
			return;
		}
		if(split[0].equals("votingTime"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <time>"));	
				return;
			}
			TeamsManager.votingTime = Integer.parseInt(split[1]) * 20;
			sender.addChatMessage(new ChatComponentText("Voting menu will appear for " + TeamsManager.votingTime / 20 + " seconds"));
			return;
		}
		if(split[0].toLowerCase().equals("autobalancetime"))
		{
			if(split.length != 2)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <time>"));	
				return;
			}
			TeamsManager.autoBalanceInterval = Integer.parseInt(split[1]) * 20;
			sender.addChatMessage(new ChatComponentText("Autobalance will now occur every " + TeamsManager.autoBalanceInterval / 20 + " seconds"));
			return;
		}
		if(split[0].equals("setVariable"))
		{
			if(TeamsManager.getInstance().currentRound == null)
			{
				sender.addChatMessage(new ChatComponentText("There is no gametype to set variables for"));		
				return;
			}
			if(split.length != 3)
			{
				sender.addChatMessage(new ChatComponentText("Incorrect Usage : Should be /teams setVariable <variable> <value>"));	
				return;
			}
			if(TeamsManager.getInstance().currentRound.gametype.setVariable(split[1], split[2]))
				sender.addChatMessage(new ChatComponentText("Set variable " + split[1] + " in gametype " + TeamsManager.getInstance().currentRound.gametype.shortName + " to " + split[2]));
			else sender.addChatMessage(new ChatComponentText("Variable " + split[1] + " did not exist in gametype " + TeamsManager.getInstance().currentRound.gametype.shortName));
			return;
		}
		sender.addChatMessage(new ChatComponentText(split[0] + " is not a valid teams command. Try /teams help"));
	}
	
	public void sendHelpInformation(ICommandSender sender, int page)
	{
		if(page > 3 || page < 1)
		{
			ChatComponentText text = new ChatComponentText("Invalid help page, should be in the range (1-3)");
			text.getChatStyle().setColor(EnumChatFormatting.RED);
			sender.addChatMessage(text);
			return;
		}
		
		sender.addChatMessage(new ChatComponentText("\u00a72Listing teams commands \u00a7f[Page " + page + " of 3]"));
		switch(page)
		{
		case 1 : 
		{
			sender.addChatMessage(new ChatComponentText("/teams help [page]"));
			sender.addChatMessage(new ChatComponentText("/teams off"));
			sender.addChatMessage(new ChatComponentText("/teams arena"));
			sender.addChatMessage(new ChatComponentText("/teams survival"));
			sender.addChatMessage(new ChatComponentText("/teams getSticks"));
			sender.addChatMessage(new ChatComponentText("/teams listGametypes"));
			//sender.addChatMessage(new ChatComponentText("/teams setGametype <name>"));
			//sender.addChatMessage(new ChatComponentText("/teams listAllTeams"));
			sender.addChatMessage(new ChatComponentText("/teams listTeams"));
			//sender.addChatMessage(new ChatComponentText("/teams setTeams <teamName1> <teamName2>"));
			sender.addChatMessage(new ChatComponentText("/teams addMap <shortName> <longName>"));
			sender.addChatMessage(new ChatComponentText("/teams listMaps"));
			sender.addChatMessage(new ChatComponentText("/teams removeMap <shortName>"));
			break;
		}
		case 2 :
		{

			//sender.addChatMessage(new ChatComponentText("/teams setMap <shortName>"));
			sender.addChatMessage(new ChatComponentText("/teams useRotation <true / false>"));
			sender.addChatMessage(new ChatComponentText("/teams voting <true / false>"));
			sender.addChatMessage(new ChatComponentText("/teams addRound <map> <gametype> <team1> <team2> <TimeLimit> <ScoreLimit>"));
			sender.addChatMessage(new ChatComponentText("/teams listRounds"));
			sender.addChatMessage(new ChatComponentText("/teams removeRound <ID>"));
			sender.addChatMessage(new ChatComponentText("/teams nextMap"));			
			//sender.addChatMessage(new ChatComponentText("/teams goToMap <ID>"));		
			sender.addChatMessage(new ChatComponentText("/teams votingTime <time>"));
			sender.addChatMessage(new ChatComponentText("/teams scoreDisplayTime <time>"));
			break;
		}
		case 3 :
		{
			sender.addChatMessage(new ChatComponentText("/teams setVariable <variable> <value>"));
			sender.addChatMessage(new ChatComponentText("/teams forceAdventure <true / false>"));
			sender.addChatMessage(new ChatComponentText("/teams overrideHunger <true / false>"));
			sender.addChatMessage(new ChatComponentText("/teams explosions <true / false>"));
			sender.addChatMessage(new ChatComponentText("/teams canBreakGuns <true / false>"));
			sender.addChatMessage(new ChatComponentText("/teams canBreakGlass <true / false>"));
			sender.addChatMessage(new ChatComponentText("/teams armourDrops <true / false>"));
			sender.addChatMessage(new ChatComponentText("/teams weaponDrops <off / on / smart>"));
			sender.addChatMessage(new ChatComponentText("/teams fuelNeeded <true / false>"));
			sender.addChatMessage(new ChatComponentText("/teams mgLife <time>"));
			sender.addChatMessage(new ChatComponentText("/teams planeLife <time>"));
			sender.addChatMessage(new ChatComponentText("/teams vehicleLife <time>"));
			sender.addChatMessage(new ChatComponentText("/teams aaLife <time>"));

			sender.addChatMessage(new ChatComponentText("/teams vehiclesBreakBlocks <true / false>"));		
			break;
		}
		}
	}

	public EntityPlayerMP getPlayer(String name)
	{
		return MinecraftServer.getServer().getConfigurationManager().func_152612_a(name);
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) 
	{
		return "Try \"/teams help\"";
	}
}
