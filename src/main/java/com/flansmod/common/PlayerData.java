package com.flansmod.common;

import java.util.ArrayList;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.EntityMG;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.network.PacketSelectOffHandGun;
import com.flansmod.common.teams.PlayerClass;
import com.flansmod.common.teams.Team;
import com.flansmod.common.teams.TeamsRound;

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
	public boolean isShootingRight, isShootingLeft;
	/** The speed of the minigun the player is using */
	public float minigunSpeed = 0F;
	
	/** The slotID of the gun being used by the off-hand. 0 = no slot. 1 ~ 9 = hotbar slots */
	public int offHandGunSlot = 0;
	
	public int shootTimeRight, shootTimeLeft;
	public int shootClickDelay;
	public int spawnDelay;
	public double spawnX;
	public double spawnY;
	public double spawnZ;
	
	public boolean reloadingRight, reloadingLeft;

	public float prevRotationRoll;
	public float rotationRoll;
	
	/** When remote explosives are thrown they are added to this list. When the player uses a remote, the first one from this list detonates */
	public ArrayList<EntityGrenade> remoteExplosives = new ArrayList<EntityGrenade>();
	
	//For use by the currentGametype
	public int score;
	public int kills;
	public int deaths;
	public boolean out; //For Nerf gametypes

	public int loopedSoundDelay;
	public boolean shouldPlayCooldownSound;
	public boolean shouldPlayWarmupSound;
	
	/** The player's vote for the next round from 1 ~ 5. 0 is not yet voted */
	public int vote;
	
	public PlayerData(String name) 
	{
		username = name;	
	}
	
	public void tick()
	{
		if(shootTimeRight > 0)
			shootTimeRight--;
		if(shootTimeRight == 0)
			reloadingRight = false;
		
		if(shootTimeLeft > 0)
			shootTimeLeft--;
		if(shootTimeLeft == 0)
			reloadingLeft = false;
		
		if(shootClickDelay > 0)
			shootClickDelay--;
		spawnDelay--;
		
		//Handle minigun speed
		if(isShootingRight && !reloadingRight)
			minigunSpeed += 2F; 
		minigunSpeed *= 0.9F;
		if(loopedSoundDelay > 0)
		{
			loopedSoundDelay--;
			if(loopedSoundDelay == 0 && !isShootingRight)
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
		isShootingRight = isShootingLeft = false;
	}
	
	public void selectOffHandWeapon(EntityPlayer player, int slot)
	{
		if(isValidOffHandWeapon(player, slot))
			offHandGunSlot = slot;
	}
	
	public boolean isValidOffHandWeapon(EntityPlayer player, int slot)
	{
		if(slot == 0)
			return true;
		if(slot - 1 == player.inventory.currentItem)
			return false;
		ItemStack stackInSlot = player.inventory.getStackInSlot(slot - 1);
		if(stackInSlot == null)
			return false;
		if(stackInSlot.getItem() instanceof ItemGun)
		{
			ItemGun item = ((ItemGun)stackInSlot.getItem());
			if(item.type.oneHanded)
				return true;
		}
		return false;
	}

	public void cycleOffHandItem(EntityPlayer player, int dWheel) 
	{
		if(dWheel < 0)
			for(offHandGunSlot = ((offHandGunSlot + 1) % 10); !isValidOffHandWeapon(player, offHandGunSlot); offHandGunSlot = ((offHandGunSlot + 1) % 10)) ;
		else if(dWheel > 0)
			for(offHandGunSlot = ((offHandGunSlot + 9) % 10); !isValidOffHandWeapon(player, offHandGunSlot); offHandGunSlot = ((offHandGunSlot + 9) % 10)) ;
		
		FlansModClient.currentScope = null;
		
		FlansMod.getPacketHandler().sendToServer(new PacketSelectOffHandGun(offHandGunSlot));
	}
}
