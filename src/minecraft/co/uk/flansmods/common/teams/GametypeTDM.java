package co.uk.flansmods.common.teams;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Vec3;

public class GametypeTDM extends Gametype {

	public GametypeTDM() 
	{
		super("Team Deathmatch", "TDM", 2);
	}

	@Override
	public void initGametype() 
	{
		startNewRound();
	}

	@Override
	public void teamsSet()
	{
		startNewRound();
	}
	
	@Override
	public void startNewRound() 
	{
		for(EntityPlayer player : getPlayers())
		{
			if(getPlayerData((EntityPlayerMP)player).team == null || getPlayerData((EntityPlayerMP)player).team == Team.spectators)
			{
				sendTeamsMenuToPlayer((EntityPlayerMP)player);
			}			
			else if(getPlayerData((EntityPlayerMP)player).playerClass == null)
			{
				sendClassMenuToPlayer((EntityPlayerMP)player);
			}
		}
	}

	@Override
	public void stopGametype() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playerJoined(EntityPlayerMP player) 
	{
		sendTeamsMenuToPlayer(player);
	}
	
	@Override
	public void playerChoseTeam(EntityPlayerMP player, Team team) 
	{
		//TODO : Auto-balancing
		getPlayerData(player).team = team;
		sendClassMenuToPlayer((EntityPlayerMP)player);
		if(team == Team.spectators)
		{
			player.respawnPlayer();
		}
	}

	@Override
	public void playerChoseClass(EntityPlayerMP player, PlayerClass playerClass) 
	{
		getPlayerData(player).playerClass = playerClass;
		teamsManager.forceRespawn(player);
	}

	@Override
	public void playerQuit(EntityPlayerMP player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean playerAttacked(EntityPlayerMP player, DamageSource source) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void playerKilled(EntityPlayerMP player, DamageSource source) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void baseAttacked(ITeamBase base, DamageSource source) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void objectAttacked(ITeamObject object, DamageSource source) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void baseClickedByPlayer(ITeamBase base, EntityPlayerMP player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void objectClickedByPlayer(ITeamObject object, EntityPlayerMP player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vec3 getSpawnPoint(EntityPlayerMP player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void playerRespawned(EntityPlayerMP player) {
		// TODO Auto-generated method stub
		
	}
}
