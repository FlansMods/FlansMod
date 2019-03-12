package com.flansmod.common.guns.raytracing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.EntityAAGun;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.teams.Team;
import com.flansmod.common.vector.Vector3f;

public class FlansModRaytracer
{
	
	public static List<BulletHit> Raytrace(World world, Entity playerToIgnore, boolean canHitSelf, Entity entityToIgnore, Vector3f origin, Vector3f motion, int pingOfShooter)
	{
		//Create a list for all bullet hits
		ArrayList<BulletHit> hits = new ArrayList<>();
		
		float speed = motion.length();
		
		//Iterate over all entities
		for(int i = 0; i < world.loadedEntityList.size(); i++)
		{
			Entity obj = world.loadedEntityList.get(i);
			boolean shouldDoNormalHitDetect = true;
			//Get driveables
			if(obj instanceof EntityDriveable)
			{
				EntityDriveable driveable = (EntityDriveable)obj;
				shouldDoNormalHitDetect = false;
				
				if(driveable.isDead() || driveable.isPartOfThis(playerToIgnore))
					continue;
				
				//If this bullet is within the driveable's detection range
				if(driveable.getDistanceSq(origin.x, origin.y, origin.z) <= (driveable.getDriveableType().bulletDetectionRadius + speed) * (driveable.getDriveableType().bulletDetectionRadius + speed))
				{
					//Raytrace the bullet
					ArrayList<BulletHit> driveableHits = driveable.attackFromBullet(origin, motion);
					hits.addAll(driveableHits);
				}
			}
			//Get players
			else if(obj instanceof EntityPlayer)
			{
				EntityPlayer player = (EntityPlayer)obj;
				PlayerData data = PlayerHandler.getPlayerData(player);
				shouldDoNormalHitDetect = false;
				if(data != null)
				{
					if(player.isDead || data.team == Team.spectators)
					{
						continue;
					}
					if(player == playerToIgnore && !canHitSelf)
						continue;
					int snapshotToTry = pingOfShooter / 50;
					if(snapshotToTry >= data.snapshots.length)
						snapshotToTry = data.snapshots.length - 1;
					
					PlayerSnapshot snapshot = data.snapshots[snapshotToTry];
					if(snapshot == null)
						snapshot = data.snapshots[0];
					
					//DEBUG
					//snapshot = new PlayerSnapshot(player);
					
					//Check one last time for a null snapshot. If this is the case, fall back to normal hit detection
					if(snapshot == null)
						shouldDoNormalHitDetect = true;
					else
					{
						//Raytrace
						ArrayList<BulletHit> playerHits = snapshot.raytrace(origin, motion);
						hits.addAll(playerHits);
					}
				}
			}
			
			if(shouldDoNormalHitDetect)
			{
				Entity entity = obj;
				if(entity != entityToIgnore && entity != playerToIgnore
						&& !entity.isDead
						&& (entity instanceof EntityLivingBase || entity instanceof EntityAAGun || entity instanceof EntityGrenade))
				{
					RayTraceResult mop = entity.getEntityBoundingBox().calculateIntercept(origin.toVec3(), new Vec3d(origin.x + motion.x, origin.y + motion.y, origin.z + motion.z));
					if(mop != null)
					{
						Entity[] parts = entity.getParts();
						boolean hit = true;
						// If parts exist, the intercepted part is calculated and used instead of the whole entity.
						// If no part is intercepted, the entity itself is not hit
						if(parts != null)
						{
							hit = false;
							for(Entity part : parts)
							{
								RayTraceResult result = part.getEntityBoundingBox().calculateIntercept(origin.toVec3(), new Vec3d(origin.x + motion.x, origin.y + motion.y, origin.z + motion.z));
								if(result != null)
								{
									mop = result;
									entity = part;
									hit = true;
									break;
								}
							}
						}
						
						if(hit)
						{
							Vector3f hitPoint = new Vector3f(mop.hitVec.x - origin.x, mop.hitVec.y - origin.y, mop.hitVec.z - origin.z);
							float hitLambda = 1F;
							if(motion.x != 0F)
								hitLambda = hitPoint.x / motion.x;
							else if(motion.y != 0F)
								hitLambda = hitPoint.y / motion.y;
							else if(motion.z != 0F)
								hitLambda = hitPoint.z / motion.z;
							if(hitLambda < 0)
								hitLambda = -hitLambda;
							
							hits.add(new EntityHit(entity, hitLambda));
						}
					}
				}
			}
		}
		
		//Ray trace the bullet by comparing its next position to its current position
		Vec3d posVec = origin.toVec3();
		Vec3d nextPosVec = motion.toVec3().add(posVec);
		RayTraceResult hit = world.rayTraceBlocks(posVec, nextPosVec, false, true, true);
		
		posVec = origin.toVec3();
		
		if(hit != null)
		{
			//Calculate the lambda value of the intercept
			Vec3d hitVec = posVec.subtract(hit.hitVec);
			float lambda = 1;
			//Try each co-ordinate one at a time.
			if(motion.x != 0)
				lambda = (float)(hitVec.x / motion.x);
			else if(motion.y != 0)
				lambda = (float)(hitVec.y / motion.y);
			else if(motion.z != 0)
				lambda = (float)(hitVec.z / motion.z);
			
			if(lambda < 0)
				lambda = -lambda;
			hits.add(new BlockHit(hit, lambda));
		}
		
		//We hit something
		if(!hits.isEmpty())
		{
			//Sort the hits according to the intercept position
			Collections.sort(hits);
		}
		
		return hits;
	}
	
	public static Vector3f GetPlayerMuzzlePosition(EntityPlayer player, EnumHand hand)
	{
		PlayerSnapshot snapshot = new PlayerSnapshot(player);
		PlayerData data = PlayerHandler.getPlayerData(player);
		
		ItemStack itemstack = hand == EnumHand.OFF_HAND ? player.getHeldItemOffhand() : player.getHeldItemMainhand();
		
		if(itemstack.getItem() instanceof ItemGun)
		{
			GunType gunType = ((ItemGun)itemstack.getItem()).GetType();
			AttachmentType barrelType = gunType.getBarrel(itemstack);
			
			return Vector3f.add(new Vector3f(player.posX, player.posY, player.posZ), snapshot.GetMuzzleLocation(gunType, barrelType, hand), null);
		}
		
		return new Vector3f(player.getPositionEyes(0.0f));
	}
	
	public static abstract class BulletHit implements Comparable<BulletHit>
	{
		/**
		 * The time along the ray that the intersection happened. Between 0 and 1
		 */
		public float intersectTime;
		
		public BulletHit(float f)
		{
			intersectTime = f;
		}
		
		@Override
		public int compareTo(BulletHit other)
		{
			if(intersectTime < other.intersectTime)
				return -1;
			else if(intersectTime > other.intersectTime)
				return 1;
			return 0;
		}
		
		public abstract Entity GetEntity();
	}
	
	public static class BlockHit extends BulletHit
	{
		public RayTraceResult raytraceResult;
		
		public BlockHit(RayTraceResult mop, float f)
		{
			super(f);
			raytraceResult = mop;
		}
		
		@Override
		public Entity GetEntity()
		{
			return null;
		}
	}
	
	public static class EntityHit extends BulletHit
	{
		public Entity entity;
		
		public EntityHit(Entity e, float f)
		{
			super(f);
			entity = e;
		}
		
		@Override
		public Entity GetEntity()
		{
			return entity;
		}
	}
	
	public static class DriveableHit extends BulletHit
	{
		public EntityDriveable driveable;
		public EnumDriveablePart part;
		
		public DriveableHit(EntityDriveable d, EnumDriveablePart p, float f)
		{
			super(f);
			part = p;
			driveable = d;
		}
		
		@Override
		public Entity GetEntity()
		{
			return driveable;
		}
	}
	
	/**
	 * Raytracing will return a load of these objects containing hit data. These will then be compared against each other and against any block hits
	 * The hit that occurs first along the path of the bullet is the one that is acted upon. Unless the bullet has penetration of course
	 */
	public static class PlayerBulletHit extends BulletHit
	{
		/**
		 * The hitbox hit
		 */
		public PlayerHitbox hitbox;
		
		public PlayerBulletHit(PlayerHitbox box, float f)
		{
			super(f);
			hitbox = box;
		}
		
		@Override
		public Entity GetEntity()
		{
			return hitbox.player;
		}
	}
	
	private static byte GetClassType(BulletHit hit)
	{
		if(hit instanceof BlockHit) return 0;
		if(hit instanceof EntityHit) return 1;
		if(hit instanceof DriveableHit) return 2;
		if(hit instanceof PlayerBulletHit) return 3;
		return -1;
	}
	
	public static void WriteToBuffer(BulletHit hit, ByteBuf buffer)
	{
		buffer.writeByte(GetClassType(hit));
		if(hit != null)
		{
			buffer.writeFloat(hit.intersectTime);
			if(hit instanceof BlockHit)
			{
				BlockHit blockHit = (BlockHit)hit;
				buffer.writeByte(blockHit.raytraceResult.sideHit.ordinal());
				buffer.writeInt(blockHit.raytraceResult.getBlockPos().getX());
				buffer.writeInt(blockHit.raytraceResult.getBlockPos().getY());
				buffer.writeInt(blockHit.raytraceResult.getBlockPos().getZ());
			}
			if(hit instanceof EntityHit)
			{
				EntityHit entityHit = (EntityHit)hit;
				buffer.writeInt(entityHit.entity.getEntityId());
			}
			if(hit instanceof DriveableHit)
			{
				DriveableHit driveableHit = (DriveableHit)hit;
				buffer.writeInt(driveableHit.driveable.getEntityId());
				buffer.writeByte(driveableHit.part.ordinal());
			}
			if(hit instanceof PlayerBulletHit)
			{
				PlayerBulletHit playerBulletHit = (PlayerBulletHit)hit;
				buffer.writeInt(playerBulletHit.hitbox.player.getEntityId());
				buffer.writeByte(playerBulletHit.hitbox.type.ordinal());
			}
		}
	}
	
	public static BulletHit ReadFromBuffer(ByteBuf buffer)
	{
		byte type = buffer.readByte();
		
		switch(type)
		{
			default:
			case -1: // No hit
			{
				return null;
			}
			case 0: // BlockHit
			{
				float intersectTime = buffer.readFloat();
				EnumFacing facing = EnumFacing.VALUES[buffer.readByte()];
				BlockPos blockPos = new BlockPos(buffer.readInt(), buffer.readInt(), buffer.readInt());
				return new BlockHit(new RayTraceResult(new Vec3d(0d, 0d, 0d), facing, blockPos), intersectTime);
			}
			case 1: // EntityHit
			{
				float intersectTime = buffer.readFloat();
				Entity entity = GetEntityByID(buffer.readInt());
				return new EntityHit(entity, intersectTime);
			}
			case 2: // DriveableHit
			{
				float intersectTime = buffer.readFloat();
				Entity entity = GetEntityByID(buffer.readInt());
				if(entity instanceof EntityDriveable)
				{
					return new DriveableHit((EntityDriveable)entity, EnumDriveablePart.values()[buffer.readByte()], intersectTime);
				}
				else
				{
					FlansMod.log.warn("Entity was not a driveable");
					return null;
				}
			}
			case 3: // PlayerBulletHit
			{
				float intersectTime = buffer.readFloat();
				Entity entity = GetEntityByID(buffer.readInt());
				if(entity instanceof EntityPlayer)
				{
					EntityPlayer player = (EntityPlayer)entity;
					PlayerSnapshot snapshot = new PlayerSnapshot(player);
					return new PlayerBulletHit(snapshot.GetHitbox(EnumHitboxType.values()[buffer.readByte()]), intersectTime);
				}
				else
				{
					FlansMod.log.warn("Entity was not a player");
					return null;
				}
			}
		}
	}
	
	public static Entity GetEntityByID(int id)
	{
		if(FMLCommonHandler.instance().getEffectiveSide() == Side.SERVER)
		{
			for(World world : FMLCommonHandler.instance().getMinecraftServerInstance().worlds)
			{
				Entity entity = world.getEntityByID(id);
				if(entity != null)
					return entity;
			}
		}
		else
		{
			return Minecraft.getMinecraft().world.getEntityByID(id);
		}
		
		return null;
	}
	
}
