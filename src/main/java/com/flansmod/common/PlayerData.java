package com.flansmod.common;

import java.util.ArrayList;

import net.minecraft.entity.player.EntityPlayer;

import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.EntityMG;
import com.flansmod.common.teams.PlayerClass;
import com.flansmod.common.teams.Team;

public class PlayerData 
{
	/** Their username */
	public String username;
	
	/** The team this player is currently on */
	public Team team;
	/** The team this player will switch to upon respawning */
	public Team newTeam;
	/** The class the player is currently using */
	public PlayerClass playerClass;
	/** The class the player will switch to upon respawning */
	public PlayerClass newPlayerClass;
	
	/** Keeps the player out of having to rechose their team each round */
	public boolean builder;
	
	public EntityMG mountingGun;
	/** True if this player is shooting */
	public boolean isShooting;
	/** The speed of the minigun the player is using */
	public float minigunSpeed = 0F;
	public int shootTime;
	public int shootClickDelay;
	public int spawnDelay;
	public double spawnX;
	public double spawnY;
	public double spawnZ;
	
	public boolean reloading;

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
	public int loopedSoundDelay;
	public boolean shouldPlayCooldownSound;
	public boolean shouldPlayWarmupSound;
	
	public PlayerData(String name) 
	{
		username = name;	
	}
	
	public void tick()
	{
		if(shootTime > 0)
			shootTime--;
		if(shootTime == 0)
			reloading = false;
		if(shootClickDelay > 0)
			shootClickDelay--;
		spawnDelay--;
		
		//Handle minigun speed
		if(isShooting && !reloading)
			minigunSpeed += 2F; 
		minigunSpeed *= 0.9F;
		if(loopedSoundDelay > 0)
		{
			loopedSoundDelay--;
			if(loopedSoundDelay == 0 && !isShooting)
				shouldPlayCooldownSound = true;
		}
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
		team = newTeam = null;
		playerClass = newPlayerClass = null;
	}
	
	public void playerKilled()
	{
		mountingGun = null;
		isShooting = false;
	}
}
