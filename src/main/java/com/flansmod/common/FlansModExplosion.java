package com.flansmod.common;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.flansmod.common.guns.EntityDamageSourceGun;
import com.flansmod.common.guns.GrenadeType;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.types.InfoType;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentProtection;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.network.play.server.S27PacketExplosion;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.event.world.ExplosionEvent;

public class FlansModExplosion extends Explosion 
{
	/** The type of Flan's Mod weapon that caused this explosion */
	private InfoType type;
	private double x, y, z;
	private float radius;
	private World world;
	private Entity explosive;
	private EntityPlayer detonator;
	private List affectedBlockPositions;
    private final Vec3 position;
    /** whether or not the explosion sets fire to blocks around it */
    private final boolean isFlaming;
    /** whether or not this explosion spawns smoke particles */
    private final boolean isSmoking;
    private final Random explosionRNG;
    private final Map playerMap;
    private boolean breaksBlocks;
    
	public FlansModExplosion(World world, Entity entity, EntityPlayer detonator, InfoType type, double x, double y, double z, float radius, boolean flaming, boolean smoking, boolean breaksBlocks) 
	{
		super(world, entity, x, y, z, radius, flaming, smoking);
        this.explosionRNG = new Random();
        this.affectedBlockPositions = Lists.newArrayList();
        this.playerMap = Maps.newHashMap();
		this.type = type;
		this.x = x;
		this.y = y;
		this.z = z;
		this.radius = radius;
		this.world = world;
		this.explosive = entity;
		this.detonator = detonator;
		this.affectedBlockPositions = Lists.newArrayList();
        this.isFlaming = flaming;
        this.isSmoking = true;
        this.breaksBlocks = breaksBlocks && TeamsManager.explosions;
        this.position = new Vec3(x, y, z);
        
        if (!net.minecraftforge.event.ForgeEventFactory.onExplosionStart(world, this))
        {
	        this.doExplosionA();
	        this.doExplosionB(true);
	        for(Object obj : world.playerEntities)
	        	FlansMod.getPacketHandler().sendTo(new S27PacketExplosion(x, y, z, radius, func_180343_e(), (Vec3)func_77277_b().get((EntityPlayer)obj)), (EntityPlayerMP)obj);
        }
	}

	/** First part of the explosion. Damage blocks and entities */
	@Override
    public void doExplosionA()
    {
        HashSet hashset = Sets.newHashSet();
        boolean flag = true;
        int j;
        int k;

        if(breaksBlocks)
        {
	        for (int i = 0; i < 16; ++i)
	        {
	            for (j = 0; j < 16; ++j)
	            {
	                for (k = 0; k < 16; ++k)
	                {
	                    if (i == 0 || i == 15 || j == 0 || j == 15 || k == 0 || k == 15)
	                    {
	                        double d0 = (double)((float)i / 15.0F * 2.0F - 1.0F);
	                        double d1 = (double)((float)j / 15.0F * 2.0F - 1.0F);
	                        double d2 = (double)((float)k / 15.0F * 2.0F - 1.0F);
	                        double d3 = Math.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
	                        d0 /= d3;
	                        d1 /= d3;
	                        d2 /= d3;
	                        float f = radius * (0.7F + world.rand.nextFloat() * 0.6F);
	                        double d4 = x;
	                        double d6 = y;
	                        double d8 = z;
	
	                        for (float f1 = 0.3F; f > 0.0F; f -= 0.22500001F)
	                        {
	                            BlockPos blockpos = new BlockPos(d4, d6, d8);
	                            IBlockState iblockstate = world.getBlockState(blockpos);
	
	                            if (iblockstate.getBlock().getMaterial() != Material.air)
	                            {
	                                float f2 = explosive != null ? explosive.getExplosionResistance(this, world, blockpos, iblockstate) : iblockstate.getBlock().getExplosionResistance(world, blockpos, (Entity)null, this);
	                                f -= (f2 + 0.3F) * 0.3F;
	                            }
	
	                            if (f > 0.0F && (explosive == null || explosive.func_174816_a(this, world, blockpos, iblockstate, f)))
	                            {
	                                hashset.add(blockpos);
	                            }
	
	                            d4 += d0 * 0.30000001192092896D;
	                            d6 += d1 * 0.30000001192092896D;
	                            d8 += d2 * 0.30000001192092896D;
	                        }
	                    }
	                }
	            }
	        }
        }
        
        this.affectedBlockPositions.addAll(hashset);
        float f3 = this.radius * 2.0F;
        j = MathHelper.floor_double(this.x - (double)f3 - 1.0D);
        k = MathHelper.floor_double(this.x + (double)f3 + 1.0D);
        int j1 = MathHelper.floor_double(this.y - (double)f3 - 1.0D);
        int l = MathHelper.floor_double(this.y + (double)f3 + 1.0D);
        int k1 = MathHelper.floor_double(this.z - (double)f3 - 1.0D);
        int i1 = MathHelper.floor_double(this.z + (double)f3 + 1.0D);
        List list = this.world.getEntitiesWithinAABBExcludingEntity(explosive, new AxisAlignedBB((double)j, (double)j1, (double)k1, (double)k, (double)l, (double)i1));
        net.minecraftforge.event.ForgeEventFactory.onExplosionDetonate(this.world, this, list, f3);
        Vec3 vec3 = new Vec3(x, y, z);

        for (int l1 = 0; l1 < list.size(); ++l1)
        {
            Entity entity = (Entity)list.get(l1);

            if (!entity.func_180427_aV())
            {
                double d12 = entity.getDistance(x, y, z) / (double)f3;

                if (d12 <= 1.0D)
                {
                    double d5 = entity.posX - x;
                    double d7 = entity.posY + (double)entity.getEyeHeight() - y;
                    double d9 = entity.posZ - z;
                    double d13 = (double)MathHelper.sqrt_double(d5 * d5 + d7 * d7 + d9 * d9);

                    if (d13 != 0.0D)
                    {
                        d5 /= d13;
                        d7 /= d13;
                        d9 /= d13;
                        double d14 = (double)this.world.getBlockDensity(vec3, entity.getEntityBoundingBox());
                        double d10 = (1.0D - d12) * d14;
                        double d11 = EnchantmentProtection.func_92092_a(entity, d10);
                        entity.motionX += d5 * d11;
                        entity.motionY += d7 * d11;
                        entity.motionZ += d9 * d11;

                        if (entity instanceof EntityPlayer)
                        {
                            this.playerMap.put((EntityPlayer)entity, new Vec3(d5 * d10, d7 * d10, d9 * d10));
                        }
                    }
                }
            }
        }
    }
	
    /** Second part of the explosion (sound, particles, drop spawn) */
    public void doExplosionB(boolean p_77279_1_)
    {

        if (!this.isSmoking)
        {
            this.world.spawnParticle(EnumParticleTypes.EXPLOSION_LARGE, this.x, this.y, this.z, 1.0D, 0.0D, 0.0D, new int[0]);
        }

        Iterator iterator;
        BlockPos blockpos;

        if (this.isSmoking&&breaksBlocks)
        {
            this.world.createExplosion(detonator, x, y, z, radius, true);
        }
        
        else if (this.isSmoking)
        {
        	Explosion expl=new Explosion(world, explosive, x, y, z, radius, true, true);
        	expl.doExplosionA();
        	this.world.playSoundEffect(this.x, this.y, this.z, "random.explode", 4.0F, (1.0F + (this.world.rand.nextFloat() - this.world.rand.nextFloat()) * 0.2F) * 0.7F);
        }

        if (this.isFlaming)
        {
            iterator = this.affectedBlockPositions.iterator();

            while (iterator.hasNext())
            {
                blockpos = (BlockPos)iterator.next();

                if (this.world.getBlockState(blockpos).getBlock().getMaterial() == Material.air && this.world.getBlockState(blockpos.down()).getBlock().isFullBlock() && this.explosionRNG.nextInt(3) == 0)
                {
                    this.world.setBlockState(blockpos, Blocks.fire.getDefaultState());
                }
            }
        }
    }
	
	@Override
    public Map func_77277_b()
    {
        return this.playerMap;
    }

    /**
     * Returns either the entity that placed the explosive block, the entity that caused the explosion or null.
     */
	@Override
    public EntityLivingBase getExplosivePlacedBy()
    {
        return detonator;
    }

	@Override
    public void func_180342_d()
    {
        this.affectedBlockPositions.clear();
    }

	@Override
    public List func_180343_e()
    {
        return this.affectedBlockPositions;
    }

	@Override
    public Vec3 getPosition(){ return this.position; }
}
