package co.uk.flansmods.common;

import java.util.ArrayList;

import co.uk.flansmods.common.guns.EntityGrenade;
import co.uk.flansmods.common.guns.EntityMG;
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
	public int spawnDelay;
	public double spawnX;
	public double spawnY;
	public double spawnZ;

	public float prevRotationRoll;
	public float rotationRoll;
	
	/** When remote explosives are thrown they are added to this list. When the player uses a remote, the first one from this list detonates */
	public ArrayList<EntityGrenade> remoteExplosives = new ArrayList<EntityGrenade>();
	
	//For use by the currentGametype
	public int score;
	public int kills;
	public int deaths;
	public boolean out; //For Nerf gametypes

	//For my quick world edit hack thingy
	public int x1, y1, z1, x2, y2, z2;
	
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
