package com.flansmod.common.guns;

import static com.flansmod.common.util.BlockUtil.destroyBlock;

import java.util.List;
import com.flansmod.client.debug.EntityDebugDot;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.raytracing.FlansModRaytracer;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.BlockHit;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.BulletHit;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.DriveableHit;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.EntityHit;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.PlayerBulletHit;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class ShotHandler
{

	public void createMultipleShots(World world, Entity shooter, Integer bulletAmount, Float bulletspread, Vector3f gunOrigin, Vector3f rayTraceOrigin, Vector3f shootingDirection, Boolean silenced)
	{
		for(int i = 0; i < bulletAmount; i++)
		{
			createShot(world, shooter, bulletspread, gunOrigin, rayTraceOrigin, shootingDirection, silenced);
		}
	}

	public void createShot(World world, Entity shooter, Float bulletspread, Vector3f gunOrigin, Vector3f rayTraceOrigin, Vector3f shootingDirection, Boolean silenced)
	{
		shootingDirection.x += (float)world.rand.nextGaussian() * bulletspread;
		shootingDirection.y += (float)world.rand.nextGaussian() * bulletspread;
		shootingDirection.z += (float)world.rand.nextGaussian() * bulletspread;

				shootingDirection.scale(500.0f);
				
				List<BulletHit> hits = FlansModRaytracer.Raytrace(world, shooter, false, null, rayTraceOrigin, shootingDirection, 0);
				Entity victim = null;
				Vector3f hitPos = Vector3f.add(rayTraceOrigin, shootingDirection, null);
				BulletHit firstHit = null;
				if(!hits.isEmpty())
				{
					firstHit = hits.get(0);
					hitPos = Vector3f.add(rayTraceOrigin, (Vector3f)shootingDirection.scale(firstHit.intersectTime), null);
					victim = firstHit.GetEntity();
				}
				
				if(FlansMod.DEBUG)
				{
					world.spawnEntity(new EntityDebugDot(world, gunOrigin, 100, 1.0f, 1.0f, 1.0f));
				}
				
				if(OnHit(world, firstHit, shooter, shotFrom, bulletType, bullet, bulletHit, penetratingPower, damage))
				{
					EntityBullet fakeBullet = new EntityBullet(world, hit.toVec3(), 0f, 0f, shooter, 0f, 0f, shotType, 0f, shotFrom);
					EntityBullet.OnDetonate(world, hit, shooter, fakeBullet, shotFrom, shotType);
				}
	}
	
	public static boolean OnHit(World world, Vector3f hit, Entity shooter, InfoType shotFrom, BulletType bulletType, EntityBullet bullet, BulletHit bulletHit, Float penetratingPower, Float damage)
	{
		
		
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
			penetratingPower = playerHit.hitbox.hitByBullet(shooter, shotFrom, bulletType, damage, penetratingPower);
			if(FlansMod.DEBUG && world.isRemote)
				world.spawnEntity(new EntityDebugDot(world, hit, 1000, 1F, 0F, 0F));
		}
		else if(bulletHit instanceof EntityHit)
		{
			EntityHit entityHit = (EntityHit)bulletHit;
			
			if(entityHit.entity != null)
			{
				if(entityHit.entity.attackEntityFrom(EntityBullet.getDamageSource(shotFrom, bulletType, shooter, false), damage * bulletType.damageVsLiving) && entityHit.entity instanceof EntityLivingBase)
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
			if(FlansMod.DEBUG && world.isRemote)
				world.spawnEntity(new EntityDebugDot(world, hit, 1000, 0F, 1F, 0F));
			
			Block block = world.getBlockState(pos).getBlock();
			Material mat = world.getBlockState(pos).getMaterial();
			//If the bullet breaks glass, and can do so according to FlansMod, do so.
			if(bulletType.breaksGlass && mat == Material.GLASS && !world.isRemote)
			{
				if(TeamsManager.canBreakGlass)
				{
					WorldServer worldServer = (WorldServer)world;
					destroyBlock(worldServer, pos, shooter, false);
				}
			}
			
			//penetratingPower -= block.getBlockHardness(world, zTile, zTile, zTile);
			if(bullet != null)
				bullet.setPosition(blockHit.raytraceResult.hitVec.x, blockHit.raytraceResult.hitVec.y, blockHit.raytraceResult.hitVec.z);
			//play sound when bullet hits block
			if(!world.isRemote && shooter != null && bulletType.hitSound != null)
				PacketPlaySound.sendSoundPacket(hit.x, hit.y, hit.z, bulletType.hitSoundRange, shooter.dimension, bulletType.hitSound, true);
			if(bullet != null) bullet.penetratingPower = penetratingPower;
			return true;
		}
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
