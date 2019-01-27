package com.flansmod.common.guns;

import static com.flansmod.common.util.BlockUtil.destroyBlock;
import static com.flansmod.common.guns.raytracing.FlansModRaytracer.Raytrace;

import java.util.List;
import com.flansmod.client.debug.EntityDebugDot;
import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.BlockHit;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.BulletHit;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.DriveableHit;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.EntityHit;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.PlayerBulletHit;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.vector.Vector3f;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class ShotHandler
{

	public static void createMultipleShots(World world, FiredShot shot, Integer bulletAmount, Vector3f gunOrigin, Vector3f rayTraceOrigin, Vector3f shootingDirection, ShootBulletHandler handler)
	{
		Float bulletspread = 0.0025f * shot.getFireableGun().getGunSpread() * shot.getBulletType().bulletSpread;
		for(int i = 0; i < bulletAmount; i++)
		{
			createShot(world, shot, bulletspread, gunOrigin, rayTraceOrigin, shootingDirection);
			handler.shooting(i < bulletAmount - 1);
		}
	}

	public static void createShot(World world, FiredShot shot, Float bulletspread, Vector3f gunOrigin, Vector3f rayTraceOrigin, Vector3f shootingDirection)
	{
		shootingDirection.x += (float)world.rand.nextGaussian() * bulletspread;
		shootingDirection.y += (float)world.rand.nextGaussian() * bulletspread;
		shootingDirection.z += (float)world.rand.nextGaussian() * bulletspread;

				shootingDirection.scale(500.0f);
				
				List<BulletHit> hits = Raytrace(world, shot.getPlayerOrNull(), false, null, rayTraceOrigin, shootingDirection, 0);
				Vector3f hitPos = Vector3f.add(rayTraceOrigin, shootingDirection, null);
				BulletHit firstHit = null;
				if(!hits.isEmpty())
				{
					firstHit = hits.get(0);
					hitPos = Vector3f.add(rayTraceOrigin, (Vector3f)shootingDirection.scale(firstHit.intersectTime), null);
				}
				
				//TODO
				if(FlansMod.DEBUG)
				{
					world.spawnEntity(new EntityDebugDot(world, gunOrigin, 100, 1.0f, 1.0f, 1.0f));
					world.spawnEntity(new EntityDebugVector(world, gunOrigin, Vector3f.sub(hitPos, gunOrigin, null), 1000, 0.5f, 0.5f, 1.0f));
				}
				
				if(OnHit(world, hitPos, shot, null, firstHit, shot.getBulletType().penetratingPower, shot.getFireableGun().getDamage()))
				{
					//TODO separate EntityBulletStuff
					//EntityBullet fakeBullet = new EntityBullet(world, hit.toVec3(), 0f, 0f, shooter, 0f, 0f, shotType, 0f, shotFrom);
					//EntityBullet.OnDetonate(world, hit, shooter, fakeBullet, shotFrom, shotType);
				}
	}
	
	public static boolean OnHit(World world, Vector3f hit, FiredShot shot, EntityBullet bullet, BulletHit bulletHit, Float penetratingPower, Float damage)
	{
		
		//TODO correct penetration stuff
		
		BulletType bulletType = shot.getBulletType();
		if(bulletHit instanceof DriveableHit)
		{
			DriveableHit driveableHit = (DriveableHit)bulletHit;
			penetratingPower = driveableHit.driveable.bulletHit(bulletType, damage, driveableHit, penetratingPower);
			if(FlansMod.DEBUG && world.isRemote)
				world.spawnEntity(new EntityDebugDot(world, hit, 1000, 0F, 0F, 1F));
			
		}
		else if(bulletHit instanceof PlayerBulletHit)
		{
			PlayerBulletHit playerHit = (PlayerBulletHit)bulletHit;
			penetratingPower = playerHit.hitbox.hitByBullet(shot, damage, penetratingPower);
			if(FlansMod.DEBUG && world.isRemote)
				world.spawnEntity(new EntityDebugDot(world, hit, 1000, 1F, 0F, 0F));
		}
		else if(bulletHit instanceof EntityHit)
		{
			EntityHit entityHit = (EntityHit)bulletHit;
			
			if(entityHit.entity != null)
			{
				if(entityHit.entity.attackEntityFrom(shot.getDamageSource(), damage * bulletType.damageVsLiving) && entityHit.entity instanceof EntityLivingBase)
				{
					EntityLivingBase living = (EntityLivingBase)entityHit.entity;
					for(PotionEffect effect : bulletType.hitEffects)
					{
						living.addPotionEffect(new PotionEffect(effect));
					}
					//If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
					living.hurtResistantTime = 0;
				}
				if(bulletType.setEntitiesOnFire)
					entityHit.entity.setFire(20);
				penetratingPower -= 1F;
				if(FlansMod.DEBUG && world.isRemote)
					world.spawnEntity(new EntityDebugDot(world, hit, 1000, 1F, 1F, 0F));
			}
		}
		else if(bulletHit instanceof BlockHit)
		{
			BlockHit blockHit = (BlockHit)bulletHit;
			RayTraceResult raytraceResult = blockHit.raytraceResult;
			//If the hit wasn't an entity hit, then it must've been a block hit
			BlockPos pos = raytraceResult.getBlockPos();
			//TODO debug
			if(FlansMod.DEBUG && world.isRemote || true)
				world.spawnEntity(new EntityDebugDot(world, hit, 1000, 0F, 1F, 0F));
			
			Block block = world.getBlockState(pos).getBlock();
			Material mat = world.getBlockState(pos).getMaterial();
			//If the bullet breaks glass, and can do so according to FlansMod, do so.
			if(bulletType.breaksGlass && mat == Material.GLASS && !world.isRemote)
			{
				if(TeamsManager.canBreakGlass)
				{
					WorldServer worldServer = (WorldServer)world;
					destroyBlock(worldServer, pos, shot.getPlayerOrNull(), false);
				}
			}
			
			
			//penetratingPower -= block.getBlockHardness(world, zTile, zTile, zTile);
			if(bullet != null)
				bullet.setPosition(blockHit.raytraceResult.hitVec.x, blockHit.raytraceResult.hitVec.y, blockHit.raytraceResult.hitVec.z);
			//play sound when bullet hits block
			//if(!world.isRemote && shooter != null && bulletType.hitSound != null)
				//PacketPlaySound.sendSoundPacket(hit.x, hit.y, hit.z, bulletType.hitSoundRange, world, bulletType.hitSound, true);
				//TODO Now always server sided
			if(bullet != null) bullet.penetratingPower = penetratingPower;
			return true;
		}
		//TODO seperate EntityBullet stuff
		if(penetratingPower <= 0F || (bulletType.explodeOnImpact && (bullet == null || bullet.ticksInAir > 1)))
		{
			if(bullet != null)
			{
				bullet.setPosition(hit.x, hit.y, hit.z);
				bullet.penetratingPower = penetratingPower;
			}
			return true;
		}
		return false;
	}
}
