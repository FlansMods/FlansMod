package com.flansmod.common.guns;

import static com.flansmod.common.util.BlockUtil.destroyBlock;
import static com.flansmod.common.guns.raytracing.FlansModRaytracer.Raytrace;

import java.util.List;
import java.util.Optional;

import com.flansmod.client.debug.EntityDebugDot;
import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.common.FlansMod;
import com.flansmod.common.FlansModExplosion;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.BlockHit;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.BulletHit;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.DriveableHit;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.EntityHit;
import com.flansmod.common.guns.raytracing.FlansModRaytracer.PlayerBulletHit;
import com.flansmod.common.network.PacketBlockHitEffect;
import com.flansmod.common.network.PacketBulletTrail;
import com.flansmod.common.network.PacketFlak;
import com.flansmod.common.network.PacketHitMarker;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.teams.Team;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.teams.TeamsRound;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

/**
 * Class containing a bunch of shooting related functions
 */
public class ShotHandler
{
	
	/**
	 * For any kind of shooting this method should be used. It handles everything including the differentiation between spawning a EntityBullet and performing a raytrace
	 * 
	 * @param world             World where the shot is fired
	 * @param shot              FiredShot object, created using the guidelines
	 * @param bulletAmount      Number how many bullets should be fired
	 * @param rayTraceOrigin    Origin of the bullet
	 * @param shootingDirection Direction where the bullet will travel
	 */	
	public static void fireGun(World world, FiredShot shot, Integer bulletAmount, Vector3f rayTraceOrigin, Vector3f shootingDirection)
	{
		fireGun(world, shot, bulletAmount, rayTraceOrigin, shootingDirection, ShootBulletHandler.instance);
	}
	
	/**
	 * For any kind of shooting this method should be used. It handles everything including the differentiation between spawning a EntityBullet and performing a raytrace
	 * 
	 * @param world             World where the shot is fired
	 * @param shot              FiredShot object, created using the guidelines
	 * @param bulletAmount      Number how many bullets should be fired
	 * @param rayTraceOrigin    Origin of the bullet
	 * @param shootingDirection Direction where the bullet will travel
	 * @param handler           ShootBulletHandler which is called every time a shot is fired (bulletAmount times)
	 */
	public static void fireGun(World world, FiredShot shot, Integer bulletAmount, Vector3f rayTraceOrigin, Vector3f shootingDirection, ShootBulletHandler handler)
	{
		if (shot.getFireableGun().getBulletSpeed() == 0f)
		{
			//Raytrace
			createMultipleShots(world, shot, bulletAmount, rayTraceOrigin, shootingDirection, handler);
		}
		else
		{
			//Spawn EntityBullet
			for(int i = 0; i < bulletAmount; i++)
			{
				world.spawnEntity(new EntityBullet(world, shot, rayTraceOrigin.toVec3(), shootingDirection.toVec3()));
				handler.shooting(i < bulletAmount - 1);
			}
		}
	}
	
	private static void createMultipleShots(World world, FiredShot shot, Integer bulletAmount, Vector3f rayTraceOrigin, Vector3f shootingDirection, ShootBulletHandler handler)
	{
		Float bulletspread = 0.0025f * shot.getFireableGun().getGunSpread() * shot.getBulletType().bulletSpread;
		for(int i = 0; i < bulletAmount; i++)
		{
			createShot(world, shot, bulletspread, rayTraceOrigin, new Vector3f(shootingDirection));
			handler.shooting(i < bulletAmount - 1);
		}
	}

	private static void createShot(World world, FiredShot shot, Float bulletspread, Vector3f rayTraceOrigin, Vector3f shootingDirection)
	{
		randomizeVectorDirection(world, shootingDirection, bulletspread);
		shootingDirection.scale(500.0f);
		
		Float penetrationPower = shot.getBulletType().penetratingPower;
		//first tries to get the player because the players vehicle is also ignored, or get the player independent shooter or null
		Entity ignore = shot.getPlayerOptional().isPresent() ? shot.getPlayerOptional().get() : shot.getShooterOptional().orElse(null);
		
		List<BulletHit> hits = Raytrace(world, ignore, false, null, rayTraceOrigin, shootingDirection, 0, penetrationPower);
		Vector3f previousHitPos = rayTraceOrigin;
		Vector3f finalhit = null;
		
		for (int i = 0;i<hits.size();i++)
		{
			BulletHit hit = hits.get(i);
			Vector3f shotVector = (Vector3f) new Vector3f(shootingDirection).scale(hit.intersectTime);
			Vector3f hitPos = Vector3f.add(rayTraceOrigin, shotVector, null);
			
			if(FlansMod.DEBUG)
			{
				if (hit instanceof BlockHit)
				{
					world.spawnEntity(new EntityDebugDot(world, hitPos, 1000, 1.0f, 0f, 1.0f));
				}
				else
				{
					world.spawnEntity(new EntityDebugDot(world, hitPos, 1000, 1.0f, 1.0f, 1.0f));
				}
				world.spawnEntity(new EntityDebugVector(world, previousHitPos, Vector3f.sub(hitPos, previousHitPos, null), 1000, 0.5f, 0.5f, ((float)i/hits.size())));
			}
			previousHitPos = hitPos;
			
			penetrationPower = OnHit(world, hitPos, shootingDirection, shot, hit, penetrationPower);
			if (penetrationPower <= 0f) {
				onDetonate(world, shot, hitPos);
				finalhit = hitPos;
				break;
			}
		}
		
		if (finalhit == null)
		{
			finalhit = Vector3f.add(rayTraceOrigin, shootingDirection, null);
		}
		//Animation
		//TODO should this be send to all Players?
		FlansMod.packetHandler.sendToAllAround(new PacketBulletTrail(rayTraceOrigin, finalhit, 0.05f, 10f, 10f, shot.getBulletType().trailTexture), rayTraceOrigin.x, rayTraceOrigin.y, rayTraceOrigin.z, 500f, world.provider.getDimension());
	}
	
	/**
	 * @param world             World which contains the location of the hit
	 * @param hit               The location of the hit
	 * @param shootingDirection The direction the shot was fired
	 * @param shot              The FiredShot instance of the shot
	 * @param bulletHit         BulletHit if the object hit
	 * @param penetratingPower  Power of the bullet to penetrate objects
	 * @return The remaining penetrationPower after hitting the object specified in the BulletHit
	 */
	public static Float OnHit(World world, Vector3f hit, Vector3f shootingDirection, FiredShot shot, BulletHit bulletHit, Float penetratingPower)
	{
		Float damage = shot.getFireableGun().getDamage();
		
		BulletType bulletType = shot.getBulletType();
		if(bulletHit instanceof DriveableHit)
		{
			DriveableHit driveableHit = (DriveableHit)bulletHit;
			penetratingPower = driveableHit.driveable.bulletHit(bulletType, shot.getFireableGun().getDamageAgainstVehicles(), driveableHit, penetratingPower);
			if(FlansMod.DEBUG)
				world.spawnEntity(new EntityDebugDot(world, hit, 1000, 0F, 0F, 1F));
			
			//Send hit marker, if player is present
			shot.getPlayerOptional().ifPresent((EntityPlayerMP player) ->
			{
				FlansMod.getPacketHandler().sendTo(new PacketHitMarker(), player);
			});
		}
		else if(bulletHit instanceof PlayerBulletHit)
		{
			PlayerBulletHit playerHit = (PlayerBulletHit)bulletHit;
			penetratingPower = playerHit.hitbox.hitByBullet(shot, damage, penetratingPower);
			if(FlansMod.DEBUG)
				world.spawnEntity(new EntityDebugDot(world, hit, 1000, 1F, 0F, 0F));
			Optional<EntityPlayerMP> optionalPlayer = shot.getPlayerOptional();
			// Check teams
			if (optionalPlayer.isPresent())
			{
				EntityPlayerMP player = optionalPlayer.get();
				TeamsRound round;
				if(TeamsManager.getInstance() != null && (round = TeamsManager.getInstance().currentRound) != null)
				{
					Optional<Team> shooterTeam = round.getTeam(player);
					Optional<Team> victimTeam = round.getTeam(playerHit.hitbox.player);
					
					if (!shooterTeam.isPresent() || !victimTeam.isPresent() || !shooterTeam.get().equals(victimTeam.get()))
					{
						FlansMod.getPacketHandler().sendTo(new PacketHitMarker(), player);
					}
				}
				else // No teams mod, just add marker
				{
					FlansMod.getPacketHandler().sendTo(new PacketHitMarker(), player);
				}
			}
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
				if(FlansMod.DEBUG)
					world.spawnEntity(new EntityDebugDot(world, hit, 1000, 1F, 1F, 0F));
			}
			
			//Send hit marker, if player is present
			shot.getPlayerOptional().ifPresent((EntityPlayerMP player) ->
			{
				FlansMod.getPacketHandler().sendTo(new PacketHitMarker(), player);
			});
			
			
		}
		else if(bulletHit instanceof BlockHit)
		{
			BlockHit blockHit = (BlockHit)bulletHit;
			RayTraceResult raytraceResult = blockHit.getRayTraceResult();
			//If the hit wasn't an entity hit, then it must've been a block hit
			BlockPos pos = raytraceResult.getBlockPos();
			if(FlansMod.DEBUG)
				world.spawnEntity(new EntityDebugDot(world, hit, 1000, 0F, 1F, 0F));
			
			Material mat = blockHit.getIBlockState().getMaterial();
			//If the bullet breaks glass, and can do so according to FlansMod, do so.
			if(bulletType.breaksGlass && mat == Material.GLASS)
			{
				if(TeamsManager.canBreakGlass)
				{
					WorldServer worldServer = (WorldServer)world;
					destroyBlock(worldServer, pos, shot.getPlayerOptional().orElse(null), false);
				}
			}
			IBlockState state = blockHit.getIBlockState().getActualState(world, pos);
			
			penetratingPower -= getBlockPenetrationDecrease(state, pos, world);
			
			EnumFacing faceing = blockHit.getRayTraceResult().sideHit;
			Vector3f bulletDir = new Vector3f(shootingDirection);
			bulletDir.normalise();
			bulletDir.scale(0.5f);
			
			for (EntityPlayer player : world.playerEntities)
			{
				//Checks if the player is in a radius of 300 Blocks (300 squared = 90000)
				if (player.getDistanceSq(pos) < 90000)
				{
					FlansMod.getPacketHandler().sendTo(new PacketBlockHitEffect(hit, bulletDir, pos, faceing), (EntityPlayerMP) player);
				}
			}
			
			//play sound when bullet hits block
			PacketPlaySound.sendSoundPacket(hit.x, hit.y, hit.z, bulletType.hitSoundRange, world.provider.getDimension(), bulletType.hitSound, false);
			//FlansMod.proxy.playBlockBreakSound(pos.getX(), pos.getY(), pos.getZ(), blockHit.getIBlockState().getBlock());
		}
		if(penetratingPower <= 0F || (bulletType.explodeOnImpact
				//&& (bullet == null || bullet.ticksInAir > 1)
		))
		{
			return -1f;
		}
		return penetratingPower;
	}
	
	/**
	 * @param world       World which contains the detonatePos
	 * @param shot        FiredShot instance of the shot
	 * @param detonatePos Location where the detonation should happen
	 */
	public static void onDetonate(World world, FiredShot shot, Vector3f detonatePos)
	{
		BulletType bulletType = shot.getBulletType();
		
		if(bulletType.explosionRadius > 0)
		{
			new FlansModExplosion(world, shot.getShooterOptional().orElse(null), shot.getPlayerOptional(), bulletType,
					detonatePos.x, detonatePos.y, detonatePos.z, bulletType.explosionRadius, bulletType.fireRadius > 0, bulletType.flak > 0, bulletType.explosionBreaksBlocks);
		}
		if(bulletType.fireRadius > 0)
		{
			for(float i = -bulletType.fireRadius; i < bulletType.fireRadius; i++)
			{
				for(float k = -bulletType.fireRadius; k < bulletType.fireRadius; k++)
				{
					for(int j = -1; j < 1; j++)
					{
						if(world.getBlockState(new BlockPos((int)(detonatePos.x + i), (int)(detonatePos.y + j), (int)(detonatePos.z + k))).getMaterial() == Material.AIR)
						{
							world.setBlockState(new BlockPos((int)(detonatePos.x + i), (int)(detonatePos.y + j), (int)(detonatePos.z + k)), Blocks.FIRE.getDefaultState(), 2);
						}
					}
				}
			}
		}
		// Send flak packet
		if(bulletType.flak > 0)
		{
			FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(detonatePos.x, detonatePos.y, detonatePos.z, bulletType.flak, bulletType.flakParticles), detonatePos.x, detonatePos.y, detonatePos.z, 200, world.provider.getDimension());
		}
		// Drop item on hitting if bullet requires it
		if(bulletType.dropItemOnHit != null)
		{
			//TODO save ItemStack on load into the bulletType
			String itemName = bulletType.dropItemOnHit;
			int damage = 0;
			if(itemName.contains("."))
			{
				damage = Integer.parseInt(itemName.split("\\.")[1]);
				itemName = itemName.split("\\.")[0];
			}
			ItemStack dropStack = InfoType.getRecipeElement(itemName, damage);
			
			if(dropStack != null && !dropStack.isEmpty())
			{
				EntityItem entityitem = new EntityItem(world, detonatePos.x, detonatePos.y, detonatePos.z, dropStack);
				entityitem.setDefaultPickupDelay();
				world.spawnEntity(entityitem);
			}
		}

	}
	
	public static void randomizeVectorDirection(World world, Vector3f vector, Float spread)
	{
		vector.x += (float)world.rand.nextGaussian() * spread;
		vector.y += (float)world.rand.nextGaussian() * spread;
		vector.z += (float)world.rand.nextGaussian() * spread;
	}
	
	public static float getBlockPenetrationDecrease(IBlockState blockstate, BlockPos pos, World world)
	{
		float hardness = blockstate.getBlockHardness(world, pos) * 2;
		if (hardness < 0)
		{
			return 1000; // Some high value for invincible blocks
		}
		else
		{
			return Math.max(hardness, 1);
		}
	}
}
