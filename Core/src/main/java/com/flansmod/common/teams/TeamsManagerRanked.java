package com.flansmod.common.teams;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.client.gui.teams.EnumLoadoutSlot;
import com.flansmod.client.gui.teams.GuiChooseLoadout;
import com.flansmod.client.teams.ClientTeamsData;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.network.PacketLoadoutData;
import com.flansmod.common.network.PacketOpenRewardBox;
import com.flansmod.common.network.PacketRoundFinished;
import com.flansmod.common.network.PacketTeamSelect;
import com.flansmod.common.network.PacketVoting;

public class TeamsManagerRanked extends TeamsManager
{
	public static HashMap<UUID, PlayerRankData> rankData = new HashMap<>();
	
	public LoadoutPool currentPool;
	
	public float XPMultiplier = 1.0f;
	
	public RoundFinishedData roundFinishedTemplateData = new RoundFinishedData();
	
	public static TeamsManagerRanked GetInstance()
	{
		return (TeamsManagerRanked)TeamsManager.instance;
	}
	
	public TeamsManagerRanked()
	{
		super();
	}
	
	@Override
	public void startRound()
	{
		if(currentPool == null)
		{
			
			return;
		}
		
		for(EntityPlayer player : getPlayers())
		{
			ProcessRankData((EntityPlayerMP)player);
		}
		
		super.startRound();
		
		for(EntityPlayer player : getPlayers())
		{
			PlayerData data = PlayerHandler.getPlayerData(player);
			if(data != null && !data.builder)
			{
				sendLoadoutData((EntityPlayerMP)player);
			}
		}
	}
	
	@Override
	public void tick()
	{
		super.tick();
		
		if(interRoundTimeLeft > 0 && time % 10 == 0
				&& roundFinishedTemplateData.votingOptions != null && roundFinishedTemplateData.votingOptions.length > 0)
		{
			for(int i = 0; i < roundFinishedTemplateData.votingOptions.length; i++)
			{
				roundFinishedTemplateData.votingOptions[i].numVotes = 0;
			}
			for(EntityPlayer player : getPlayers())
			{
				PlayerData data = PlayerHandler.getPlayerData(player);
				if(!data.builder && data.vote != 0 && data.vote - 1 < roundFinishedTemplateData.votingOptions.length)
					roundFinishedTemplateData.votingOptions[data.vote - 1].numVotes++;
			}
			for(EntityPlayer player : getPlayers())
			{
				PlayerData data = PlayerHandler.getPlayerData(player);
				if(!data.builder)
					sendPacketToPlayer(new PacketVoting(roundFinishedTemplateData), (EntityPlayerMP)player);
			}
		}
	}
	
	public void sendLoadoutData(EntityPlayerMP player)
	{
		PacketLoadoutData data = new PacketLoadoutData();
		
		//Get the available teams from the gametype
		Team[] availableTeams = currentRound.gametype.getTeamsCanSpawnAs(currentRound, player);
		//Add in the spectators as an option and "none" if the player is an op
		boolean playerIsOp = FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().canSendCommands(player.getGameProfile());
		Team[] allAvailableTeams = new Team[availableTeams.length + (playerIsOp ? 2 : 1)];
		System.arraycopy(availableTeams, 0, allAvailableTeams, 0, availableTeams.length);
		allAvailableTeams[availableTeams.length] = Team.spectators;
		
		data.teamsAvailable = allAvailableTeams;
		data.currentPool = currentPool;
		data.myRankData = rankData.get(player.getUniqueID());
		data.motd = motd;
		
		FlansMod.getPacketHandler().sendTo(data, player);
	}
	
	@Override
	public void onPlayerLogin(EntityPlayer player)
	{
		if(!rankData.containsKey(player.getUniqueID()))
		{
			PlayerRankData data = new PlayerRankData();
			
			if(currentPool != null)
			{
				for(int i = 0; i < 5; i++)
				{
					for(int j = 0; j < EnumLoadoutSlot.values().length; j++)
					{
						if(currentPool.defaultLoadouts[i].slots[j] != null)
						{
							data.loadouts[i].slots[j] = currentPool.defaultLoadouts[i].slots[j].copy();
						}
					}
				}
			}
			
			rankData.put(player.getUniqueID(), data);
		}
		
		//super.onPlayerLogin(player);
		
		if(!enabled || currentRound == null)
			return;
		
		if(player instanceof EntityPlayerMP)
		{
			EntityPlayerMP playerMP = (EntityPlayerMP)player;
			//sendTeamsMenuToPlayer(playerMP);
			sendLoadoutData(playerMP);
			currentRound.gametype.playerJoined(playerMP);
		}
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
		
		PlayerData victimData = PlayerHandler.getPlayerData(victim);
		
		if(source.getTrueSource() instanceof EntityPlayerMP)
		{
			EntityPlayerMP attacker = ((EntityPlayerMP)source.getTrueSource());
			PlayerData attackerData = PlayerHandler.getPlayerData(attacker);
			if(attackerData != null && attackerData.team != null)
			{
				// Make sure players are on opposing teams
				if(attackerData.team != victimData.team)
				{
					AwardXP(attacker, MathHelper.floor(currentPool.XPForKill * XPMultiplier));
					AwardXP(victim, MathHelper.floor(currentPool.XPForDeath * XPMultiplier));
				}
			}
		}
	}
	
	public static void AwardXP(EntityPlayerMP player, int amount)
	{
		PlayerRankData data = rankData.get(player.getUniqueID());
		if(data != null)
		{
			data.AddXP(amount);
		}
	}
	
	public static void ResetRank(EntityPlayerMP player)
	{
		PlayerRankData data = rankData.get(player.getUniqueID());
		if(data != null)
		{
			data.currentLevel = 0;
			data.currentXP = 0;
		}
	}
	
	@Override
	protected void OnRoundEnded()
	{
		pickVoteOptions();
		
		UpdateRoundFinishedTemplate();
		
		for(EntityPlayer player : getPlayers())
		{
			SendRoundFinishedDataToPlayer((EntityPlayerMP)player);
		}
		
		super.OnRoundEnded();
	}
	
	private void UpdateRoundFinishedTemplate()
	{
		roundFinishedTemplateData.votingTime = votingTime;
		roundFinishedTemplateData.scoresTime = scoreDisplayTime;
		roundFinishedTemplateData.rankUpdateTime = rankUpdateTime;
		
		roundFinishedTemplateData.votingEnabled = voting;
		if(voting)
		{
			roundFinishedTemplateData.FillVoteOptions(voteOptions);
		}
	}
	
	private void SendRoundFinishedDataToPlayer(EntityPlayerMP player)
	{
		PlayerData pData = PlayerHandler.getPlayerData(player);
		if(pData != null && pData.builder)
		{
			return;
		}
		
		RoundFinishedData finishedData = new RoundFinishedData(roundFinishedTemplateData);
		PlayerRankData data = rankData.get(player.getUniqueID());
		
		int resultantXP = data.pendingXP + data.currentXP;
		int resultantLevel = data.currentLevel;
		
		int XPForNextLevel = currentPool.GetXPForLevel(resultantLevel + 1);
		while(XPForNextLevel > 0 && resultantXP >= XPForNextLevel)
		{
			resultantXP -= XPForNextLevel;
			resultantLevel++;
			
			XPForNextLevel = currentPool.GetXPForLevel(resultantLevel + 1);
		}
		
		finishedData.pendingXP = data.pendingXP;
		finishedData.resultantXP = resultantXP;
		finishedData.resultantLevel = resultantLevel;
		
		FlansMod.getPacketHandler().sendTo(new PacketRoundFinished(finishedData), player);
	}
	
	
	private void SendRankDataToPlayer(EntityPlayerMP player)
	{
		/*
		FlansMod.log("Sending rank data to " + player.getDisplayNameString());
		PacketRankUpdate packet = new PacketRankUpdate();
		PlayerRankData data = rankData.get(player.getUniqueID());
		if(data != null)
		{
			packet.pendingXP = data.pendingXP;
			int resultantXP = data.pendingXP + data.currentXP;
			int resultantLevel = data.currentLevel;
			while(resultantXP >= currentPool.XPPerLevel[resultantLevel + 1])
			{
				resultantXP -= currentPool.XPPerLevel[resultantLevel + 1];
				resultantLevel++;
			}
			
			packet.resultantXP = resultantXP;
			packet.resultantLevel = resultantLevel;
			packet.showScoresFor = scoreDisplayTime + (voting ? votingTime : 0);
			
			FlansMod.getPacketHandler().sendTo(packet, player);
			
			data.pendingXP = 0;
			data.currentLevel = resultantLevel;
			data.currentXP = resultantXP;
		}
		else
		{
			FlansMod.Assert(false, "Failed to send rank data");
		}
		*/
	}
	
	private void ProcessRankData(EntityPlayerMP player)
	{
		PlayerRankData data = rankData.get(player.getUniqueID());
		if(data != null)
		{
			int resultantXP = data.pendingXP + data.currentXP;
			int resultantLevel = data.currentLevel;
			
			int XPForNextLevel = currentPool.GetXPForLevel(resultantLevel + 1);
			while(XPForNextLevel > 0 && resultantXP >= XPForNextLevel)
			{
				resultantXP -= XPForNextLevel;
				resultantLevel++;
				GiveRewardsForLevelUp(resultantLevel, player);
				
				XPForNextLevel = currentPool.GetXPForLevel(resultantLevel + 1);
			}
			
			data.pendingXP = 0;
			data.currentLevel = resultantLevel;
			data.currentXP = resultantXP;
			data.currentKillstreak = 0;
			data.bestKillstreak = 0;
		}
	}
	
	private void GiveRewardsForLevelUp(int level, EntityPlayerMP player)
	{
		for(RewardBox box : currentPool.rewardsPerLevel[level - 1])
		{
			RewardBoxInstance instance = RewardBoxInstance.CreateLevelUpReward(box, player);
			PlayerRankData data = TeamsManagerRanked.GetRankData(player);
			data.AddRewardBoxInstance(instance);
		}
	}
	
	@Override
	public void showTeamsMenuToAll(boolean info)
	{
		// Do nothing. We never need this
	}
	
	@Override
	public void sendTeamsMenuToPlayer(EntityPlayerMP player, boolean info)
	{
		if(!enabled || currentRound == null || currentRound.teams == null)
			return;
		
		sendLoadoutData(player);
	}
	
	@Override
	public void sendClassMenuToPlayer(EntityPlayerMP player)
	{
		// Don't need this either
	}
	
	@Override
	protected void ReadFromNBT(NBTTagCompound tags, World world)
	{
		super.ReadFromNBT(tags, world);
		
		int iPoolHash = tags.getInteger("pool");
		currentPool = LoadoutPool.GetPool(iPoolHash);
		
		NBTTagList ranks = tags.getTagList("playerRanks", 10); // 10 = CompoundTag
		if(ranks != null)
		{
			for(int i = 0; i < ranks.tagCount(); i++)
			{
				NBTTagCompound playerTags = ranks.getCompoundTagAt(i);
				UUID uuid = new UUID(playerTags.getLong("uuid1"), playerTags.getLong("uuid2"));
				PlayerRankData rData = new PlayerRankData();
				rData.readFromNBT(playerTags);
				rankData.put(uuid, rData);
			}
		}
	}
	
	@Override
	protected void WriteToNBT(NBTTagCompound tags)
	{
		super.WriteToNBT(tags);
		
		if(currentPool != null)
		{
			tags.setInteger("pool", currentPool.shortName.hashCode());
		}
		
		NBTTagList ranks = new NBTTagList();
		for(Map.Entry<UUID, PlayerRankData> entry : rankData.entrySet())
		{
			NBTTagCompound playerTags = new NBTTagCompound();
			playerTags.setLong("uuid1", entry.getKey().getMostSignificantBits());
			playerTags.setLong("uuid2", entry.getKey().getLeastSignificantBits());
			entry.getValue().writeToNBT(playerTags);
			
			ranks.appendTag(playerTags);
		}
		
		tags.setTag("playerRanks", ranks);
	}
	
	@Override
	public void playerSelectedClass(EntityPlayerMP player, String className)
	{
		if(!enabled || currentRound == null)
			return;
		
		//Get player class requested
		int selection = Integer.parseInt(className);
		PlayerRankData data = rankData.get(player.getUniqueID());
		//PlayerData data = PlayerHandler.getPlayerData(player);
		
		IPlayerClass playerClass = new PlayerClassCustom(selection, data.loadouts[selection]);
		
		playerSelectedClass(player, playerClass);
	}
	
	@SideOnly(Side.CLIENT)
	public static void ConfirmLoadoutChanges()
	{
		PacketLoadoutData packet = new PacketLoadoutData();
		packet.myRankData = ClientTeamsData.theRankData;
		FlansMod.getPacketHandler().sendToServer(packet);
	}
	
	@SideOnly(Side.CLIENT)
	public static void ChooseLoadout(int id)
	{
		PacketTeamSelect packet = new PacketTeamSelect();
		packet.classChoicesPacket = true;
		packet.info = false;
		packet.selection = "" + id;
		packet.selectionPacket = true;
		
		FlansMod.getPacketHandler().sendToServer(packet);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void SelectTeam(Team team)
	{
		FlansMod.getPacketHandler().sendToServer(new PacketTeamSelect(team == null ? "null" : team.shortName, false));
		if(team == null)
		{
			FMLClientHandler.instance().getClient().displayGuiScreen(null);
		}
		else
		{
			FMLClientHandler.instance().getClient().displayGuiScreen(new GuiChooseLoadout());
		}
	}
	
	@SideOnly(Side.CLIENT)
	public static boolean LocalPlayerOwnsUnlock(int unlockHash)
	{
		return ClientTeamsData.theRankData.OwnsUnlock(unlockHash);
	}
	
	public static boolean PlayerOwnsUnlock(int hashCode, UUID uuid)
	{
		return false;
	}
	
	public static void OpenRewardBox(EntityPlayerMP player, RewardBox box)
	{
		PlayerRankData data = rankData.get(player.getUniqueID());
		for(RewardBoxInstance instance : data.rewardBoxData)
		{
			if(!instance.opened
					&& instance.boxHash == box.hashCode()
					&& instance.unlockHash == 0)
			{
				int unlockHash = instance.OpenBox(data);
				FlansMod.getPacketHandler().sendTo(new PacketOpenRewardBox(box.hashCode(), unlockHash), player);
				return;
			}
		}
		
		FlansMod.Assert(false, "Player " + player.getDisplayNameString() + " tried to open box they don't have");
	}
	
	public static PlayerRankData GetRankData(EntityPlayer player)
	{
		return GetInstance().rankData.get(player.getUniqueID());
	}
	
	public static PlayerRankData GetRankData(UUID id)
	{
		return GetInstance().rankData.get(id);
	}
}
