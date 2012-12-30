package co.uk.flansmods.common;

import net.minecraft.entity.player.EntityPlayer;
import co.uk.flansmods.common.teams.PlayerClass;
import co.uk.flansmods.common.teams.Team;

public class FlansModPlayerData 
{
	public String username;
	public EntityMG mountingGun;
	public Team team;
	public PlayerClass playerClass;
	public PlayerClass newPlayerClass;
	public boolean isShooting;
	public int shootTime;
	public int shootClickDelay;
	//For use by the currentGametype
	public int score;
	public int kills;
	public int deaths;

	
	//TODO Unknown purpose!
	public FlansModPlayerData(String name) 
	{
		username = name;
		
	}
	
	public void tick()
	{
		if(shootTime > 0)
			shootTime--;
		if(shootClickDelay > 0)
			shootClickDelay--;
	}
	
	public PlayerClass getPlayerClass()
	{
		if(playerClass != newPlayerClass)
			playerClass = newPlayerClass;
		return playerClass;
	}

	public void resetScore() 
	{
		score = kills = deaths = 0;
	}
}
