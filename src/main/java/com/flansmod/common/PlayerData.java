package com.flansmod.common;

import java.util.ArrayList;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.EntityMG;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.raytracing.PlayerSnapshot;
import com.flansmod.common.teams.IPlayerClass;
import com.flansmod.common.teams.Team;
import com.flansmod.common.vector.Vector3f;

public class PlayerData
{
	/**
	 * Their username
	 */
	public String username;
	
	//Movement related fields
	/**
	 * Roll variables
	 */
	public float prevRotationRoll, rotationRoll;
	/**
	 * Snapshots for bullet hit detection. Array size is set to number of snapshots required. When a new one is taken,
	 * each snapshot is moved along one place and new one is added at the start, so that when the array fills up, the oldest one is lost
	 */
	public PlayerSnapshot[] snapshots;
	
	//Gun related fields
	/**
	 * The MG this player is using
	 */
	public EntityMG mountingGun;
	/**
	 * Stops player shooting immediately after swapping weapons
	 */
	public int shootClickDelay;
	/**
	 * The speed of the minigun the player is using
	 */
	public float minigunSpeed = 0F;
	/**
	 * When remote explosives are thrown they are added to this list. When the player uses a remote, the first one from this list detonates
	 */
	public ArrayList<EntityGrenade> remoteExplosives = new ArrayList<>();
	/**
	 * Sound delay parameters
	 */
	public int loopedSoundDelay;
	/**
	 * Sound delay parameters
	 */
	public boolean shouldPlayCooldownSound, shouldPlayWarmupSound;
	/**
	 * Melee weapon custom hit simulation
	 */
	public int meleeProgress, meleeLength;
	
	/**
	 * Tickers to stop shooting too fast
	 */
	public float shootTimeRight, shootTimeLeft;
	/**
	 * True if this player is shooting
	 */
	public boolean isShootingRight, isShootingLeft;
	/**
	 * Reloading booleans
	 */
	public boolean reloadingRight, reloadingLeft;
	/**
	 * When the player shoots a burst fire weapon, one shot is fired immediately and this counter keeps track of how many more should be fired
	 */
	public int burstRoundsRemainingLeft = 0, burstRoundsRemainingRight = 0;
	
	// Handed getters and setters
	public float GetShootTime(EnumHand hand)
	{
		return hand == EnumHand.OFF_HAND ? shootTimeLeft : shootTimeRight;
	}
	
	public void SetShootTime(EnumHand hand, float set)
	{
		if(hand == EnumHand.OFF_HAND) shootTimeLeft = set;
		else shootTimeRight = set;
	}
	
	public int GetBurstRoundsRemaining(EnumHand hand)
	{
		return hand == EnumHand.OFF_HAND ? burstRoundsRemainingLeft : burstRoundsRemainingRight;
	}
	
	public void SetBurstRoundsRemaining(EnumHand hand, int set)
	{
		if(hand == EnumHand.OFF_HAND) burstRoundsRemainingLeft = set;
		else burstRoundsRemainingRight = set;
	}
	
	public Vector3f[] lastMeleePositions;
	
	//Teams related fields
	/**
	 * Gametype variables
	 */
	public int score, kills, deaths;
	/**
	 * Zombies variables
	 */
	public int zombieScore;
	/**
	 * Gametype variable for Nerf
	 */
	public boolean out;
	/**
	 * The player's vote for the next round from 1 ~ 5. 0 is not yet voted
	 */
	public int vote;
	/**
	 * The team this player is currently on
	 */
	public Team team;
	/**
	 * The team this player will switch to upon respawning
	 */
	public Team newTeam;
	/**
	 * The class the player is currently using
	 */
	public IPlayerClass playerClass;
	/**
	 * The class the player will switch to upon respawning
	 */
	public IPlayerClass newPlayerClass;
	/**
	 * Keeps the player out of having to rechose their team each round
	 */
	public boolean builder;
	/**
	 * Save the player's skin here, to replace after having done a swap for a certain class override
	 */
	@SideOnly(Side.CLIENT)
	public ResourceLocation skin;
	
	public PlayerData(String name)
	{
		username = name;
		snapshots = new PlayerSnapshot[FlansMod.numPlayerSnapshots];
	}
	
	public void tick(EntityPlayer player)
	{
		if(player.world.isRemote)
			clientTick(player);
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
		
		if(loopedSoundDelay > 0)
		{
			loopedSoundDelay--;
			if(loopedSoundDelay == 0 && !isShootingRight)
				shouldPlayCooldownSound = true;
		}
		
		//Move all snapshots along one place
		System.arraycopy(snapshots, 0, snapshots, 1, snapshots.length - 2 + 1);
		//Take new snapshot
		snapshots[0] = new PlayerSnapshot(player);
	}
	
	public void clientTick(EntityPlayer player)
	{
	}
	
	public IPlayerClass getPlayerClass()
	{
		if(playerClass != newPlayerClass)
			playerClass = newPlayerClass;
		return playerClass;
	}
	
	public void resetScore()
	{
		score = zombieScore = kills = deaths = 0;
		team = newTeam = null;
		playerClass = newPlayerClass = null;
	}
	
	public void playerKilled()
	{
		mountingGun = null;
		isShootingRight = isShootingLeft = false;
		snapshots = new PlayerSnapshot[FlansMod.numPlayerSnapshots];
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
			if(item.GetType().oneHanded)
				return true;
		}
		return false;
	}
	
	public void doMelee(EntityPlayer player, int meleeTime, GunType type)
	{
		meleeLength = meleeTime;
		lastMeleePositions = new Vector3f[type.meleePath.size()];
		
		for(int k = 0; k < type.meleeDamagePoints.size(); k++)
		{
			Vector3f meleeDamagePoint = type.meleeDamagePoints.get(k);
			//Do a raytrace from the prev pos to the current pos and attack anything in the way
			Vector3f nextPos = type.meleePath.get(0);
			Vector3f nextAngles = type.meleePathAngles.get(0);
			RotatedAxes nextAxes = new RotatedAxes(-nextAngles.y, -nextAngles.z, nextAngles.x);
			
			Vector3f nextPosInPlayerCoords = new RotatedAxes(player.rotationYaw + 90F, player.rotationPitch, 0F).findLocalVectorGlobally(nextAxes.findLocalVectorGlobally(meleeDamagePoint));
			Vector3f.add(nextPos, nextPosInPlayerCoords, nextPosInPlayerCoords);
			
			if(!FlansMod.proxy.isThePlayer(player))
				nextPosInPlayerCoords.y += 1.6F;
			
			lastMeleePositions[k] = new Vector3f(player.posX + nextPosInPlayerCoords.x, player.posY + nextPosInPlayerCoords.y, player.posZ + nextPosInPlayerCoords.z);
		}
	}
	
	public void WriteToFile()
	{
		
	}
	
	public void ReadFromFile()
	{
		
	}
	
}
