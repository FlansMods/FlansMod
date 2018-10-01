package com.flansmod.common.teams;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.network.PacketTeamSelect;

public class TeamsManagerClassic extends TeamsManager
{
	private static TeamsManagerClassic INSTANCE;
	
	public static TeamsManagerClassic GetInstance()
	{
		return INSTANCE;
	}
	
	public TeamsManagerClassic()
	{
		super();
		INSTANCE = this;
	}
	
	@Override
	protected void OnRoundEnded()
	{
		super.OnRoundEnded();
	}
	
	@Override
	public void onPlayerLogout(EntityPlayer player)
	{
		super.onPlayerLogout(player);
	}
	
	@Override
	public void OnPlayerKilled(EntityPlayerMP victim, DamageSource source)
	{
		super.OnPlayerKilled(victim, source);
		
	}
	
	@Override
	public void startRound()
	{
		super.startRound();
	}
	
	@Override
	public void tick()
	{
		super.tick();
	}
	
	@Override
	public void onPlayerLogin(EntityPlayer player)
	{
		if(!enabled || currentRound == null)
			return;
		
		if(player instanceof EntityPlayerMP)
		{
			EntityPlayerMP playerMP = (EntityPlayerMP)player;
			sendTeamsMenuToPlayer(playerMP);
			currentRound.gametype.playerJoined(playerMP);
		}
	}
	
	@Override
	public void showTeamsMenuToAll(boolean info)
	{
		for(EntityPlayer player : getPlayers())
		{
			PlayerData data = PlayerHandler.getPlayerData(player);
			//Catch for broken player data
			if(data == null)
				continue;
			//Catch for people not on a team, such as builders
			if(data.builder && playerIsOp(player))
				continue;
			
			sendTeamsMenuToPlayer((EntityPlayerMP)player, info);
		}
	}
	
	@Override
	public void sendTeamsMenuToPlayer(EntityPlayerMP player, boolean info)
	{
		if(!enabled || currentRound == null || currentRound.teams == null)
			return;
		//Get the available teams from the gametype
		Team[] availableTeams = currentRound.gametype.getTeamsCanSpawnAs(currentRound, player);
		//Add in the spectators as an option and "none" if the player is an op
		boolean playerIsOp = FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().canSendCommands(player.getGameProfile());
		Team[] allAvailableTeams = new Team[availableTeams.length + (playerIsOp ? 2 : 1)];
		System.arraycopy(availableTeams, 0, allAvailableTeams, 0, availableTeams.length);
		allAvailableTeams[availableTeams.length] = Team.spectators;
		
		sendPacketToPlayer(new PacketTeamSelect(allAvailableTeams, info), player);
	}
	
	@Override
	public void sendClassMenuToPlayer(EntityPlayerMP player)
	{
		Team team = PlayerHandler.getPlayerData(player).newTeam;
		if(team == null)
		{
			sendTeamsMenuToPlayer(player);
		}
		else if(team != Team.spectators && team.classes.size() > 0)
		{
			sendPacketToPlayer(new PacketTeamSelect(team.classes.toArray(new PlayerClass[team.classes.size()])), player);
		}
	}
	
	@Override
	protected void ReadFromNBT(NBTTagCompound tags, World world)
	{
		super.ReadFromNBT(tags, world);
	}
	
	@Override
	protected void WriteToNBT(NBTTagCompound tags)
	{
		super.WriteToNBT(tags);
	}
	
	@Override
	public void playerSelectedClass(EntityPlayerMP player, String className)
	{
		if(!enabled || currentRound == null)
			return;
		
		//Get player class requested
		PlayerClass playerClass = PlayerClass.getClass(className);
		PlayerData data = PlayerHandler.getPlayerData(player);
		
		//Validate class
		if(!data.newTeam.classes.contains(playerClass))
		{
			player.sendMessage(new TextComponentString("You may not select " + playerClass.name + ". Please try again"));
			FlansMod.log.warn(player.getName() + " tried to pick an invalid class : " + playerClass.name);
			//sendClassMenuToPlayer(player);
			return;
		}
		
		playerSelectedClass(player, playerClass);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void SelectTeam(Team team)
	{
		FlansMod.getPacketHandler().sendToServer(new PacketTeamSelect(team == null ? "null" : team.shortName, false));
		Minecraft.getMinecraft().displayGuiScreen(null);
	}
}
