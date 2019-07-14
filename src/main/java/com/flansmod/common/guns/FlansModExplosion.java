package com.flansmod.common.guns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.EntityWheel;
import com.flansmod.common.network.PacketExplosion;
import com.flansmod.common.network.PacketParticle;
import com.flansmod.common.types.InfoType;

import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentProtection;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.ExplosionEvent;

public class FlansModExplosion extends Explosion
{
	private final static int boomRadius = 16;
    private static final Random explosionRNG = new Random();
    private HashMap<EntityPlayer, Vec3> playerLocations = new HashMap<EntityPlayer, Vec3>();
    private World worldObj;
    public InfoType type;
    public EntityPlayer player;
    private float radius;
    private final float damageVsLiving;
    private final float damageVsPlayer;
    private final float damageVsPlane;
    private final float damageVsVehicle;
    public boolean breakBlocks;
    public boolean canceled = false;

	public FlansModExplosion(World w, Entity e, EntityPlayer p, InfoType t,
			double x, double y, double z, float r, boolean breakBlocks,
			 float damageLiving, float damagePlayer, float damagePlane, float damageVehicle, int smokeCount, int debrisCount)
	{
		super(w, e, x, y, z, r);
		this.radius = r;
		worldObj = w;
		type = t;
		player = p;
        isFlaming = false;
        isSmoking = true;
        this.breakBlocks = breakBlocks;
        damageVsPlayer = damagePlayer;
        damageVsLiving  = damageLiving;
        damageVsPlane   = damagePlane;
        damageVsVehicle = damageVehicle;
        doExplosionA();
        doExplosionB(true);
        spawnParticle(smokeCount, debrisCount);

        ExplosionEvent.Start event = new ExplosionEvent.Start(w, this);
        MinecraftForge.EVENT_BUS.post(event);
        canceled = event.isCanceled();
        
        if(!worldObj.isRemote)
        {
            for (Object playerEntity : worldObj.playerEntities) {
            	if(playerEntity instanceof EntityPlayerMP)
            	{
            		EntityPlayerMP entityplayer = (EntityPlayerMP)playerEntity;
            		if (entityplayer.getDistanceSq(x, y, z) < 4096.0D)
            		{
            			FlansMod.getPacketHandler().sendTo(new PacketExplosion(x, y, z, r), entityplayer);
            		}
            	}
            }
        }
	}


	@Override
    public void doExplosionA()
    {
        float f = explosionSize;
        HashSet hashset = new HashSet();
        double d0;
        double d1;
        double d2;

        for(int i = 0; i < boomRadius; ++i)
        {
            for(int j = 0; j < boomRadius; ++j)
            {
                for(int k = 0; k < boomRadius; ++k)
                {
                    if(i == 0 || i == boomRadius - 1 || j == 0 || j == boomRadius - 1 || k == 0 || k == boomRadius - 1)
                    {
                        double d3 = (i / (boomRadius - 1.0F) * 2.0F - 1.0F);
                        double d4 = (j / (boomRadius - 1.0F) * 2.0F - 1.0F);
                        double d5 = (k / (boomRadius - 1.0F) * 2.0F - 1.0F);
                        double d6 = Math.sqrt(d3 * d3 + d4 * d4 + d5 * d5);
                        d3 /= d6;
                        d4 /= d6;
                        d5 /= d6;
                        float f1 = explosionSize * (0.7F + worldObj.rand.nextFloat() * 0.6F);
                        d0 = explosionX;
                        d1 = explosionY;
                        d2 = explosionZ;

                        for (float f2 = 0.3F; f1 > 0.0F; f1 -= f2 * 0.75F)
                        {
                            int l = MathHelper.floor_double(d0);
                            int i1 = MathHelper.floor_double(d1);
                            int j1 = MathHelper.floor_double(d2);
                            Block block = worldObj.getBlock(l, i1, j1);

                            float f3 = exploder != null ? exploder.func_145772_a(this, worldObj, l, i1, j1, block) : block.getExplosionResistance(exploder, worldObj, l, i1, j1, explosionX, explosionY, explosionZ);
                            f1 -= (f3 + 0.3F) * f2;

                            if (f1 > 0.0F && (exploder == null || exploder.func_145774_a(this, worldObj, l, i1, j1, block, f1)))
                            {
                                hashset.add(new ChunkPosition(l, i1, j1));
                            }

                            d0 += d3 * f2;
                            d1 += d4 * f2;
                            d2 += d5 * f2;
                        }
                    }
                }
            }
        }

        if(!canceled)
        	affectedBlockPositions.addAll(hashset);
        
        explosionSize *= 2.0F;
        int i = MathHelper.floor_double(explosionX - explosionSize - 1.0D);
        int j = MathHelper.floor_double(explosionX + explosionSize + 1.0D);
        int k = MathHelper.floor_double(explosionY - explosionSize - 1.0D);
        int l1 = MathHelper.floor_double(explosionY + explosionSize + 1.0D);
        int i2 = MathHelper.floor_double(explosionZ - explosionSize - 1.0D);
        int j2 = MathHelper.floor_double(explosionZ + explosionSize + 1.0D);
        List list = worldObj.getEntitiesWithinAABBExcludingEntity(exploder, AxisAlignedBB.getBoundingBox(i, k, i2, j, l1, j2));
        Vec3 vec3 = Vec3.createVectorHelper(explosionX, explosionY, explosionZ);

        for (Object aList : list) {
            Entity entity = (Entity) aList;
            double d7 = entity.getDistance(explosionX, explosionY, explosionZ) / explosionSize;

            if (d7 <= 1.0D) {
                d0 = entity.posX - explosionX;
                d1 = entity.posY + entity.getEyeHeight() - explosionY;
                d2 = entity.posZ - explosionZ;
                double d8 = MathHelper.sqrt_double(d0 * d0 + d1 * d1 + d2 * d2);

                if (d8 != 0.0D) {
                    d0 /= d8;
                    d1 /= d8;
                    d2 /= d8;
                    double d9 = getBlockDensity(vec3, entity.boundingBox);
                    double d10 = (1.0D - d7) * d9;

                    EntityDriveable entityDriveable = null;
                    float damage = (float)((d10 * d10 + d10) / 2.0D * 8.0D * explosionSize + 1.0D);
                    if(entity instanceof EntityPlayer)      damage *= damageVsPlayer;
                    else if(entity instanceof EntityLivingBase) damage *= damageVsLiving;
                    else if(entity instanceof EntityPlane)      damage *= damageVsPlane;
                    else if(entity instanceof EntityVehicle)    damage *= damageVsVehicle;
                    else if(entity instanceof EntityWheel)
                    {
                    	entityDriveable = ((EntityWheel) entity).vehicle;
                    }
                    else if(entity instanceof EntitySeat)
                    {
                    	entityDriveable = ((EntitySeat) entity).driveable;
                    }

                    if(entityDriveable instanceof EntityPlane)      damage *= damageVsPlane;
                    if(entityDriveable instanceof EntityVehicle)    damage *= damageVsVehicle;

                    if( damage > 0.5F)
                    {
                    	boolean b = entity.attackEntityFrom(player == null || type == null ? DamageSource.setExplosionSource(this) : new EntityDamageSourceGun(type.shortName, entity, player, type, false), damage);
                    	if(b)
                    	{
                    		EntityBullet.hitCrossHair = true;
                    	}
                        double d11 = EnchantmentProtection.func_92092_a(entity, d10);
                        entity.motionX += d0 * d11;
                        entity.motionY += d1 * d11;
                        entity.motionZ += d2 * d11;
                    }

                    if (entity instanceof EntityPlayer) {
                        playerLocations.put((EntityPlayer) entity, Vec3.createVectorHelper(d0 * d10, d1 * d10, d2 * d10));
                    }
                }
            }
        }
        explosionSize = f;
    }

	public void spawnParticle(int numSmoke, int numDebris)
	{
        float mod = radius*0.1F;

		for(int smoke = 0; smoke < numSmoke; smoke++)
		{
			float smokeRand = (float)Math.random();

			if(smokeRand < 0.25)
			{
			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare",explosionX, explosionY, explosionZ, (float)Math.random()*mod, (float)Math.random()*mod, (float)Math.random()*mod), explosionX, explosionY, explosionZ, 150, worldObj.provider.dimensionId);
			//FlansMod.proxy.spawnParticle("flansmod.flare", explosionX, explosionY, explosionZ, (float)Math.random()*mod, (float)Math.random()*mod, (float)Math.random()*mod);
			} else if (smokeRand > 0.25 && smokeRand < 0.5){
			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", explosionX, explosionY, explosionZ, (float)Math.random()*mod, (float)Math.random()*mod, -(float)Math.random()*mod), explosionX, explosionY, explosionZ, 150, worldObj.provider.dimensionId);
			//FlansMod.proxy.spawnParticle("flansmod.flare", explosionX, explosionY, explosionZ, (float)Math.random()*mod, (float)Math.random()*mod, -(float)Math.random()*mod);
			} else if (smokeRand > 0.5 && smokeRand < 0.75){
			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", explosionX, explosionY, explosionZ, -(float)Math.random()*mod, (float)Math.random()*mod, -(float)Math.random()*mod), explosionX, explosionY, explosionZ, 150, worldObj.provider.dimensionId);
			//FlansMod.proxy.spawnParticle("flansmod.flare", explosionX, explosionY, explosionZ, -(float)Math.random()*mod, (float)Math.random()*mod, -(float)Math.random()*mod);
			} else if (smokeRand > 0.75){
			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", explosionX, explosionY, explosionZ, -(float)Math.random()*mod, (float)Math.random()*mod, (float)Math.random()*mod), explosionX, explosionY, explosionZ, 150, worldObj.provider.dimensionId);
			//FlansMod.proxy.spawnParticle("flansmod.flare", explosionX, explosionY, explosionZ, -(float)Math.random()*mod, (float)Math.random()*mod, (float)Math.random()*mod);
			}

		}

		for(int debris = 0; debris < numDebris; debris++)
		{

			float smokeRand = (float)Math.random();

			if(smokeRand < 0.25)
			{
			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.debris1", explosionX, explosionY, explosionZ, (float)Math.random()*mod, (float)Math.random()*mod, (float)Math.random()*mod), explosionX, explosionY, explosionZ, 150, worldObj.provider.dimensionId);
			//FlansMod.proxy.spawnParticle("flansmod.debris1", explosionX, explosionY, explosionZ, (float)Math.random()*mod, (float)Math.random()*mod, (float)Math.random()*mod);
			} else if (smokeRand > 0.25 && smokeRand < 0.5){
			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.debris1", explosionX, explosionY, explosionZ, (float)Math.random()*mod, (float)Math.random()*mod, -(float)Math.random()*mod), explosionX, explosionY, explosionZ, 150, worldObj.provider.dimensionId);
			//FlansMod.proxy.spawnParticle("flansmod.debris1", explosionX, explosionY, explosionZ, (float)Math.random()*mod, (float)Math.random()*mod, -(float)Math.random()*mod);
			} else if (smokeRand > 0.5 && smokeRand < 0.75){
			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.debris1", explosionX, explosionY, explosionZ, -(float)Math.random()*mod, (float)Math.random()*mod, (float)Math.random()*mod), explosionX, explosionY, explosionZ, 150, worldObj.provider.dimensionId);
			//FlansMod.proxy.spawnParticle("flansmod.debris1", explosionX, explosionY, explosionZ, -(float)Math.random()*mod, (float)Math.random()*mod, (float)Math.random()*mod);
			} else if (smokeRand > 0.75){
			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.debris1", explosionX, explosionY, explosionZ, -(float)Math.random()*mod, (float)Math.random()*mod, -(float)Math.random()*mod), explosionX, explosionY, explosionZ, 150, worldObj.provider.dimensionId);
			//FlansMod.proxy.spawnParticle("flansmod.debris1", explosionX, explosionY, explosionZ, -(float)Math.random()*mod, (float)Math.random()*mod, -(float)Math.random()*mod);
			}
    	}
	}

	public float getBlockDensity(Vec3 p_72842_1_, AxisAlignedBB p_72842_2_)
	{
		double d0 = 1.0D / ((p_72842_2_.maxX - p_72842_2_.minX) * 2.0D + 1.0D);
		double d1 = 1.0D / ((p_72842_2_.maxY - p_72842_2_.minY) * 2.0D + 1.0D);
		double d2 = 1.0D / ((p_72842_2_.maxZ - p_72842_2_.minZ) * 2.0D + 1.0D);

		if(d0 >= 0.0D && d1 >= 0.0D && d2 >= 0.0D)
		{
			int i = 0;
			int j = 0;

			for (float f = 0.0F; f <= 1.0F; f = (float) ((double) f + d0))
			{
				for (float f1 = 0.0F; f1 <= 1.0F; f1 = (float) ((double) f1 + d1))
				{
					for (float f2 = 0.0F; f2 <= 1.0F; f2 = (float) ((double) f2 + d2))
					{
						double d3 = p_72842_2_.minX + (p_72842_2_.maxX - p_72842_2_.minX) * (double) f;
						double d4 = p_72842_2_.minY + (p_72842_2_.maxY - p_72842_2_.minY) * (double) f1;
						double d5 = p_72842_2_.minZ + (p_72842_2_.maxZ - p_72842_2_.minZ) * (double) f2;

						if(this.worldObj.func_147447_a(Vec3.createVectorHelper(d3, d4, d5), p_72842_1_, false, true, false) == null)
						{
							++i;
						}

						++j;
					}
				}
			}

			return (float) i / (float) j;
		}
		else
		{
			return 0.0F;
		}
	}

    /**
     * Does the second part of the explosion (sound, particles, drop spawn)
     */
    @Override
	public void doExplosionB(boolean par1)
    {
        worldObj.playSoundEffect(explosionX, explosionY, explosionZ, "random.explode", 4.0F, (1.0F + (worldObj.rand.nextFloat() - worldObj.rand.nextFloat()) * 0.2F) * 0.7F);

        Iterator iterator;
        ChunkPosition chunkposition;
        int i;
        int j;
        int k;
        Block block;

        if (!worldObj.isRemote && breakBlocks)
        {
          worldObj.createExplosion((Entity) null, explosionX, explosionY, explosionZ, radius, true);
        }

        if (!worldObj.isRemote && isFlaming)
        {
            iterator = affectedBlockPositions.iterator();

            while (iterator.hasNext())
            {
                chunkposition = (ChunkPosition)iterator.next();
                i = chunkposition.chunkPosX;
                j = chunkposition.chunkPosY;
                k = chunkposition.chunkPosZ;
                block = worldObj.getBlock(i, j, k);
                Block blockBelow = worldObj.getBlock(i, j - 1, k);

                if (block == null && blockBelow.isOpaqueCube() && explosionRNG.nextInt(3) == 0)
                {
                    worldObj.setBlock(i, j, k, Blocks.fire);
                }
            }
        }
    }

    @Override
	public Map func_77277_b()
    {
        return playerLocations;
    }

    public EntityLivingBase func_94613_c()
    {
        return exploder == null ? null : (exploder instanceof EntityTNTPrimed ? ((EntityTNTPrimed)exploder).getTntPlacedBy() : (exploder instanceof EntityLivingBase ? (EntityLivingBase)exploder : null));
    }

	public static void clientExplosion(World worldObj, float explosionSize,
			double explosionX, double explosionY, double explosionZ)
	{
		List affectedBlockPositions = new ArrayList();
		Entity exploder = null;

		Explosion explosion = new Explosion(worldObj, exploder, explosionX, explosionY, explosionZ, explosionSize);

		if(explosionSize < 2)
		{
			explosionX += explosionRNG.nextFloat() - 0.5F;
			explosionZ += explosionRNG.nextFloat() - 0.5F;
		}

		boolean isSmoking = true;

		//	doExplosionA
		{
			final float f = explosionSize;
			HashSet hashset = new HashSet();
			int i;
			int j;
			int k;
			double d5;
			double d6;
			double d7;

			for (i = 0; i < boomRadius; ++i)
			{
				for (j = 0; j < boomRadius; ++j)
				{
					for (k = 0; k < boomRadius; ++k)
					{
						if (i == 0 || i == boomRadius - 1 || j == 0 || j == boomRadius - 1 || k == 0 || k == boomRadius - 1)
						{
							double d0 = (double)((float)i / ((float)boomRadius - 1.0F) * 2.0F - 1.0F);
							double d1 = (double)((float)j / ((float)boomRadius - 1.0F) * 2.0F - 1.0F);
							double d2 = (double)((float)k / ((float)boomRadius - 1.0F) * 2.0F - 1.0F);
							double d3 = Math.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
							d0 /= d3;
							d1 /= d3;
							d2 /= d3;
							float f1 = explosionSize * (0.7F + worldObj.rand.nextFloat() * 0.6F);
							d5 = explosionX;
							d6 = explosionY;
							d7 = explosionZ;

							for (float f2 = 0.3F; f1 > 0.0F; f1 -= f2 * 0.75F)
							{
								int j1 = MathHelper.floor_double(d5);
								int k1 = MathHelper.floor_double(d6);
								int l1 = MathHelper.floor_double(d7);
								Block block = worldObj.getBlock(j1, k1, l1);

//								if (block.getMaterial() != Material.air)
								{
									float f3 = 0;//exploder != null ? exploder.func_145772_a(explosion, worldObj, j1, k1, l1, block) : block.getExplosionResistance(exploder, worldObj, j1, k1, l1, explosionX, explosionY, explosionZ);
									f1 -= (f3 + 0.3F) * f2;
								}

								if (f1 > 0.0F && (exploder == null || exploder.func_145774_a(explosion, worldObj, j1, k1, l1, block, f1)))
								{
									hashset.add(new ChunkPosition(j1, k1, l1));
								}

								d5 += d0 * (double)f2;
								d6 += d1 * (double)f2;
								d7 += d2 * (double)f2;
							}
						}
					}
				}
			}

			affectedBlockPositions.addAll(hashset);
			explosionSize *= 2.0F;
			i = MathHelper.floor_double(explosionX - (double)explosionSize - 1.0D);
			j = MathHelper.floor_double(explosionX + (double)explosionSize + 1.0D);
			k = MathHelper.floor_double(explosionY - (double)explosionSize - 1.0D);
			int i2 = MathHelper.floor_double(explosionY + (double)explosionSize + 1.0D);
			int l = MathHelper.floor_double(explosionZ - (double)explosionSize - 1.0D);
			int j2 = MathHelper.floor_double(explosionZ + (double)explosionSize + 1.0D);
			List list = worldObj.getEntitiesWithinAABBExcludingEntity(exploder, AxisAlignedBB.getBoundingBox((double)i, (double)k, (double)l, (double)j, (double)i2, (double)j2));
			Vec3 vec3 = Vec3.createVectorHelper(explosionX, explosionY, explosionZ);

			for (int i1 = 0; i1 < list.size(); ++i1)
			{
				Entity entity = (Entity)list.get(i1);
				double d4 = entity.getDistance(explosionX, explosionY, explosionZ) / (double)explosionSize;

				if (d4 <= 1.0D)
				{
					d5 = entity.posX - explosionX;
					d6 = entity.posY + (double)entity.getEyeHeight() - explosionY;
					d7 = entity.posZ - explosionZ;
					double d9 = (double)MathHelper.sqrt_double(d5 * d5 + d6 * d6 + d7 * d7);

					if (d9 != 0.0D)
					{
						d5 /= d9;
						d6 /= d9;
						d7 /= d9;
						double d10 = (double)worldObj.getBlockDensity(vec3, entity.boundingBox);
						double d11 = (1.0D - d4) * d10;
//						entity.attackEntityFrom(DamageSource.setExplosionSource(explosion), (float)((int)((d11 * d11 + d11) / 2.0D * 8.0D * (double)explosionSize + 1.0D)));
						double d8 = EnchantmentProtection.func_92092_a(entity, d11);
						entity.motionX += d5 * d8;
						entity.motionY += d6 * d8;
						entity.motionZ += d7 * d8;
					}
				}
			}

			explosionSize = f;
		}
		//	doExplosionB
		{
//			worldObj.playSoundEffect(explosionX, explosionY, explosionZ, "random.explode", 4.0F, (1.0F + (worldObj.rand.nextFloat() - worldObj.rand.nextFloat()) * 0.2F) * 0.7F);

			if (explosionSize >= 2.0F && isSmoking)
			{
				worldObj.spawnParticle("hugeexplosion", explosionX, explosionY, explosionZ, 1.0D, 0.0D, 0.0D);
			}
			else
			{
				worldObj.spawnParticle("largeexplode", explosionX, explosionY, explosionZ, 1.0D, 0.0D, 0.0D);
			}

			Iterator iterator = affectedBlockPositions.iterator();

			int cnt = 0;
			while (iterator.hasNext())
			{
				cnt++;

				ChunkPosition chunkposition = (ChunkPosition)iterator.next();
				int i = chunkposition.chunkPosX;
				int j = chunkposition.chunkPosY;
				int k = chunkposition.chunkPosZ;
				Block block = worldObj.getBlock(i, j, k);

				double d0 = (double)((float)i + worldObj.rand.nextFloat());
				double d1 = (double)((float)j + worldObj.rand.nextFloat());
				double d2 = (double)((float)k + worldObj.rand.nextFloat());
				double d3 = d0 - explosionX;
				double d4 = d1 - explosionY;
				double d5 = d2 - explosionZ;
				double d6 = (double)MathHelper.sqrt_double(d3 * d3 + d4 * d4 + d5 * d5);
				d3 /= d6;
				d4 /= d6;
				d5 /= d6;
				double d7 = 0.5D / (d6 / (double)explosionSize + 0.1D);
				d7 *= (double)(worldObj.rand.nextFloat() * worldObj.rand.nextFloat() + 0.3F);
				d3 *= d7;
				d4 *= d7;
				d5 *= d7;

				/*
				if(false)
				{
					FlansMod.proxy.spawnParticle("explode", (d0 + explosionX * 1.0D) / 2.0D, (d1 + explosionY * 1.0D) / 2.0D, (d2 + explosionZ * 1.0D) / 2.0D, d3, d4, d5);
					FlansMod.proxy.spawnParticle("smoke", d0, d1, d2, d3, d4, d5);
				}
				else
				*/
				{
					if((explosionSize<=1 && cnt % 4==0) || explosionSize>1)
					{
						FlansMod.proxy.spawnParticle("explode", (d0 + explosionX * 1.0D) / 2.0D, (d1 + explosionY * 1.0D) / 2.0D, (d2 + explosionZ * 1.0D) / 2.0D, d3, d4, d5);
					}
	//				FlansMod.proxy.spawnParticle("smoke", d0, d1, d2, d3, d4, d5);


					block = Blocks.air;
					if(explosionSize <= 2)
					{
						if(cnt % 8==0)
						{
							block = getNearBlock(worldObj, i, j, k);
						}
					}
					else
					{
						block = getNearBlock(worldObj, i, j, k);
					}

					if(block != Blocks.air)
					{
						float m = explosionSize;
						if(m <= 1)
						{
							m *= 2;
						}
						else
						{
							m *= 0.5F;
						}
						final String pname = "blockdust_" + Block.getIdFromBlock(block) + "_" + worldObj.getBlockMetadata(i, j, k);
						FlansMod.proxy.spawnParticle(pname,
								(d0 + explosionX * 1.0D) / 2.0D,
								(d1 + explosionY * 1.0D) / 2.0D,
								(d2 + explosionZ * 1.0D) / 2.0D,
								d3 * m,
								d4 * m,
								d5 * m);
					}
				}
			}
		}
	}
	public static Block getNearBlock(World w, int x, int y, int z)
	{
		final int[][] offset = new int[][]
		{
				{ 0,-1, 0},
				{ 1, 0, 0},
				{-1, 0, 0},
				{ 0, 0, 1},
				{ 0, 0,-1},
		};
		for(int i=0; i<offset.length; i++)
		{
			if(y > 1 || offset[i][1]==0)
			{
				Block block = w.getBlock(x + offset[i][0], y + offset[i][1], z + offset[i][2]);
				if(block != Blocks.air)
				{
					return block;
				}
			}
		}
		return Blocks.air;
	}
}
