package co.uk.flansmods.common.teams;

import java.util.ArrayList;
import java.util.List;

import co.uk.flansmods.common.FlansModPlayerData;
import co.uk.flansmods.common.network.PacketTeamSelect;
import cpw.mods.fml.common.network.PacketDispatcher;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.Vec3;

public class GametypeTDM extends Gametype 
{

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
		showTeamsMenuToAll();
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
	public void playerChoseTeam(EntityPlayerMP player, Team team, Team previousTeam) 
	{
		if(previousTeam != null && Gametype.isAValidTeam(previousTeam))
		{
			getPlayerData(player).deaths++;
			getPlayerData(player).score--;
		}
		
		sendClassMenuToPlayer((EntityPlayerMP)player);
		teamsManager.forceRespawn(player);
	}

	@Override
	public void playerChoseClass(EntityPlayerMP player, PlayerClass playerClass) 
	{
	}

	@Override
	public void playerQuit(EntityPlayerMP player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean playerAttacked(EntityPlayerMP player, DamageSource source) 
	{
		EntityPlayerMP attacker = getPlayerFromDamageSource(source);
		if(attacker != null)
		{
			//Spectators may not attack players
			if(getPlayerData(attacker).team == Team.spectators)
				return false;
		}
		//Players may not attack spectators
		if(getPlayerData(player).team == Team.spectators)
			return false;
		return true;
	}

	@Override
	public void playerKilled(EntityPlayerMP player, DamageSource source) 
	{
		EntityPlayerMP attacker = getPlayerFromDamageSource(source);
		if(attacker != null)
		{
			if(attacker == player)
				givePoints(attacker, -1);
			else 
			{	
				givePoints(attacker, 1);
				getPlayerData(attacker).kills++;
			}
		}
		getPlayerData(player).deaths++;
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
	public Vec3 getSpawnPoint(EntityPlayerMP player) 
	{
		FlansModPlayerData data = getPlayerData(player);
		List<ITeamObject> validSpawnPoints = new ArrayList<ITeamObject>();
		for(ITeamBase base : data.team.bases)
		{
			for(ITeamObject object : base.getObjects())
			{
				if(object.isSpawnPoint())
					validSpawnPoints.add(object);
			}
		}
		
		if(validSpawnPoints.size() > 0)
		{
			ITeamObject spawnPoint = validSpawnPoints.get(rand.nextInt(validSpawnPoints.size()));
			return Vec3.createVectorHelper(spawnPoint.getPosX(), spawnPoint.getPosY(), spawnPoint.getPosZ());
		}
		
		return null;
	}

	@Override
	public void playerRespawned(EntityPlayerMP player) {
		// TODO Auto-generated method stub
		
	}
}
