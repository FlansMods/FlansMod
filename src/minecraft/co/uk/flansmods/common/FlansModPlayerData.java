package co.uk.flansmods.common;

import net.minecraft.entity.player.EntityPlayer;
import co.uk.flansmods.common.guns.EntityMG;
import co.uk.flansmods.common.teams.PlayerClass;
import co.uk.flansmods.common.teams.Team;
import co.uk.flansmods.common.teams.TeamsManager;

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
	public int spawnDelay;
	public double spawnX;
	public double spawnY;
	public double spawnZ;

	public float prevRotationRoll;
	public float rotationRoll;
	
	//For use by the currentGametype
	public int score;
	public int kills;
	public int deaths;
	public boolean out; //For Nerf gametypes

	
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
		spawnDelay--;
	}
	
	public void setSpawn(double x, double y, double z, int t)
	{
		spawnX = x;
		spawnY = y;
		spawnZ = z;
		spawnDelay = t;
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
