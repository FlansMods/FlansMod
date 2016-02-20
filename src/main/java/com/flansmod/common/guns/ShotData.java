package com.flansmod.common.guns;

import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;


public class ShotData 
{
	public int slot; // May include special cases like deployable
	public InfoType shotFrom;
	public ShootableType shotType;
	
	public ShotData(int slot, InfoType shotFrom, ShootableType shotType)
	{
		this.slot = slot;
		this.shotFrom = shotFrom;
		this.shotType = shotType;
	}
	
	public static class SpawnEntityShotData extends ShotData
	{		
		public SpawnEntityShotData(int slot, InfoType shotFrom, ShootableType shotType, int shooterID, Vector3f direction)
		{
			super(slot, shotFrom, shotType);
			this.shooterID = shooterID;
			this.direction = direction;
		}
		
		public SpawnEntityShotData(int slot, InfoType shotFrom, ShootableType shotType, Entity shooter, Vector3f direction)
		{
			this(slot, shotFrom, shotType, shooter.getEntityId(), direction);
		}
		
		public int shooterID;
		public Vector3f direction;
	}
	
	public static class InstantShotData extends ShotData
	{		
		public InstantShotData(int slot, InfoType shotFrom, ShootableType shotType, int shooterID, Vector3f origin, int victimID, Vector3f hit)
		{
			super(slot, shotFrom, shotType);
			this.shooterID = shooterID;
			this.origin = origin;
			this.victimID = victimID;
			this.hit = hit;
		}
		
		public InstantShotData(int slot, InfoType shotFrom, ShootableType shotType, Entity shooter, Vector3f origin, Entity victim, Vector3f hit)
		{
			this(slot, shotFrom, shotType, shooter.getEntityId(), origin, victim.getEntityId(), hit);
		}
		
		public int shooterID;
		public Vector3f origin;
		
		// Can be null for environment hits etc
		public int victimID; 
		public Vector3f hit;
	}
}
