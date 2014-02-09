package co.uk.flansmods.common.guns;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import co.uk.flansmods.common.InfoType;

import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentProtection;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.packet.Packet60Explosion;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;

public class FlansModExplosion extends Explosion 
{
	private int boomRadius = 16;
    private Random explosionRNG = new Random();
    private HashMap<EntityPlayer, Vec3> playerLocations = new HashMap<EntityPlayer, Vec3>();
    private World worldObj;
    public InfoType type;
    public EntityPlayer player;
    
	public FlansModExplosion(World w, Entity e, EntityPlayer p, InfoType t, double x, double y, double z, float r, boolean breakBlocks) 
	{
		super(w, e, x, y, z, r);
		worldObj = w;
		type = t;
		player = p;
        isFlaming = false;
        isSmoking = breakBlocks;
        doExplosionA();
        doExplosionB(true);
        
        if(!worldObj.isRemote)
        {
	        if (!breakBlocks)
	            affectedBlockPositions.clear();
	
	        Iterator iterator = worldObj.playerEntities.iterator();
	
	        while (iterator.hasNext())
	        {
	            EntityPlayer entityplayer = (EntityPlayer)iterator.next();
	            if (entityplayer.getDistanceSq(x, y, z) < 4096.0D)
	                ((EntityPlayerMP)entityplayer).playerNetServerHandler.sendPacketToPlayer(new Packet60Explosion(x, y, z, r, affectedBlockPositions, (Vec3)func_77277_b().get(entityplayer)));
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
                            int k1 = worldObj.getBlockId(l, i1, j1);

                            if (k1 > 0)
                            {
                                Block block = Block.blocksList[k1];
                                float f3 = exploder != null ? exploder.getBlockExplosionResistance(this, worldObj, l, i1, j1, block) : block.getExplosionResistance(exploder, worldObj, l, i1, j1, explosionX, explosionY, explosionZ);
                                f1 -= (f3 + 0.3F) * f2;
                            }

                            if (f1 > 0.0F && (exploder == null || exploder.shouldExplodeBlock(this, worldObj, l, i1, j1, k1, f1)))
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

        affectedBlockPositions.addAll(hashset);
        explosionSize *= 2.0F;
        int i = MathHelper.floor_double(explosionX - explosionSize - 1.0D);
        int j = MathHelper.floor_double(explosionX + explosionSize + 1.0D);
        int k = MathHelper.floor_double(explosionY - explosionSize - 1.0D);
        int l1 = MathHelper.floor_double(explosionY + explosionSize + 1.0D);
        int i2 = MathHelper.floor_double(explosionZ - explosionSize - 1.0D);
        int j2 = MathHelper.floor_double(explosionZ + explosionSize + 1.0D);
        List list = worldObj.getEntitiesWithinAABBExcludingEntity(exploder, AxisAlignedBB.getAABBPool().getAABB(i, k, i2, j, l1, j2));
        Vec3 vec3 = worldObj.getWorldVec3Pool().getVecFromPool(explosionX, explosionY, explosionZ);

        for (int k2 = 0; k2 < list.size(); ++k2)
        {
            Entity entity = (Entity)list.get(k2);
            double d7 = entity.getDistance(explosionX, explosionY, explosionZ) / explosionSize;

            if (d7 <= 1.0D)
            {
                d0 = entity.posX - explosionX;
                d1 = entity.posY + entity.getEyeHeight() - explosionY;
                d2 = entity.posZ - explosionZ;
                double d8 = MathHelper.sqrt_double(d0 * d0 + d1 * d1 + d2 * d2);

                if (d8 != 0.0D)
                {
                    d0 /= d8;
                    d1 /= d8;
                    d2 /= d8;
                    double d9 = worldObj.getBlockDensity(vec3, entity.boundingBox);
                    double d10 = (1.0D - d7) * d9;
                    entity.attackEntityFrom(player == null ? DamageSource.setExplosionSource(this) : new EntityDamageSourceGun(type.shortName, entity, player, type), ((int)((d10 * d10 + d10) / 2.0D * 8.0D * explosionSize + 1.0D)));
                    double d11 = EnchantmentProtection.func_92092_a(entity, d10);
                    entity.motionX += d0 * d11;
                    entity.motionY += d1 * d11;
                    entity.motionZ += d2 * d11;

                    if (entity instanceof EntityPlayer)
                    {
                    	playerLocations.put((EntityPlayer)entity, worldObj.getWorldVec3Pool().getVecFromPool(d0 * d10, d1 * d10, d2 * d10));
                    }
                }
            }
        }

        explosionSize = f;
    }

    /**
     * Does the second part of the explosion (sound, particles, drop spawn)
     */
    @Override
	public void doExplosionB(boolean par1)
    {
        worldObj.playSoundEffect(explosionX, explosionY, explosionZ, "random.explode", 4.0F, (1.0F + (worldObj.rand.nextFloat() - worldObj.rand.nextFloat()) * 0.2F) * 0.7F);

        if (explosionSize >= 2.0F && isSmoking)
        {
            worldObj.spawnParticle("hugeexplosion", explosionX, explosionY, explosionZ, 1.0D, 0.0D, 0.0D);
        }
        else
        {
            worldObj.spawnParticle("largeexplode", explosionX, explosionY, explosionZ, 1.0D, 0.0D, 0.0D);
        }

        Iterator iterator;
        ChunkPosition chunkposition;
        int i;
        int j;
        int k;
        int l;

        if (isSmoking)
        {
            iterator = affectedBlockPositions.iterator();

            while (iterator.hasNext())
            {
                chunkposition = (ChunkPosition)iterator.next();
                i = chunkposition.x;
                j = chunkposition.y;
                k = chunkposition.z;
                l = worldObj.getBlockId(i, j, k);

                if (par1)
                {
                    double d0 = (i + worldObj.rand.nextFloat());
                    double d1 = (j + worldObj.rand.nextFloat());
                    double d2 = (k + worldObj.rand.nextFloat());
                    double d3 = d0 - explosionX;
                    double d4 = d1 - explosionY;
                    double d5 = d2 - explosionZ;
                    double d6 = MathHelper.sqrt_double(d3 * d3 + d4 * d4 + d5 * d5);
                    d3 /= d6;
                    d4 /= d6;
                    d5 /= d6;
                    double d7 = 0.5D / (d6 / explosionSize + 0.1D);
                    d7 *= (worldObj.rand.nextFloat() * worldObj.rand.nextFloat() + 0.3F);
                    d3 *= d7;
                    d4 *= d7;
                    d5 *= d7;
                    worldObj.spawnParticle("explode", (d0 + explosionX * 1.0D) / 2.0D, (d1 + explosionY * 1.0D) / 2.0D, (d2 + explosionZ * 1.0D) / 2.0D, d3, d4, d5);
                    worldObj.spawnParticle("smoke", d0, d1, d2, d3, d4, d5);
                }

                if (l > 0)
                {
                    Block block = Block.blocksList[l];
                    BreakEvent breakEvent = new BreakEvent(i, j, k, worldObj, block, worldObj.getBlockMetadata(i, j, k), player);

                    if(!breakEvent.isCanceled())
                    {
                        if (block.canDropFromExplosion(this))
                        {
                            block.dropBlockAsItemWithChance(worldObj, i, j, k, worldObj.getBlockMetadata(i, j, k), 1.0F / explosionSize, 0);
                        }

                        block.onBlockExploded(worldObj, i, j, k, this);
                    }
                }
            }
        }

        if (isFlaming)
        {
            iterator = affectedBlockPositions.iterator();

            while (iterator.hasNext())
            {
                chunkposition = (ChunkPosition)iterator.next();
                i = chunkposition.x;
                j = chunkposition.y;
                k = chunkposition.z;
                l = worldObj.getBlockId(i, j, k);
                int i1 = worldObj.getBlockId(i, j - 1, k);

                if (l == 0 && Block.opaqueCubeLookup[i1] && explosionRNG.nextInt(3) == 0)
                {
                    worldObj.setBlock(i, j, k, Block.fire.blockID);
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
}
