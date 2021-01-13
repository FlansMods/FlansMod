package com.flansmod.apocalypse.common.entity;

import javax.annotation.Nullable;

import com.flansmod.apocalypse.common.FlansModApocalypse;
import com.flansmod.common.guns.ItemGun;
import com.google.common.base.Predicate;

import net.minecraft.entity.EntityBodyHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityShulker;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityShulkerBullet;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntitySkuller extends EntityShulker 
{
	public ItemStack gunStack;
	public ItemStack ammoStack;
	
	public EntitySkuller(World worldIn) 
	{
		super(worldIn);
	}
	
	public void AssignRandomGun()
	{
		gunStack = FlansModApocalypse.lootGenerator.getRandomLoadedGun(rand, false);
		ammoStack = new ItemStack(((ItemGun)gunStack.getItem()).GetType().nonExplosiveAmmo.get(0).item);
	}

    protected void initEntityAI()
    {
        this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(4, new EntitySkuller.AIAttack());
        this.tasks.addTask(7, new EntitySkuller.AIPeek());
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[0]));
        this.targetTasks.addTask(2, new EntitySkuller.AIAttackNearest(this));
        this.targetTasks.addTask(3, new EntitySkuller.AIDefenseAttack(this));
    }
    
    class AIAttack extends EntityAIBase
    {
        private int attackTime;

        public AIAttack()
        {
            this.setMutexBits(3);
        }

        /**
         * Returns whether the EntityAIBase should begin execution.
         */
        public boolean shouldExecute()
        {
            EntityLivingBase entitylivingbase = EntitySkuller.this.getAttackTarget();

            if (entitylivingbase != null && entitylivingbase.isEntityAlive())
            {
                return EntitySkuller.this.world.getDifficulty() != EnumDifficulty.PEACEFUL;
            }
            else
            {
                return false;
            }
        }

        /**
         * Execute a one shot task or start executing a continuous task
         */
        public void startExecuting()
        {
            this.attackTime = 20;
            EntitySkuller.this.updateArmorModifier(100);
        }

        /**
         * Reset the task's internal state. Called when this task is interrupted by another one
         */
        public void resetTask()
        {
        	EntitySkuller.this.updateArmorModifier(0);
        }

        /**
         * Keep ticking a continuous task that has already been started
         */
        public void updateTask()
        {
            if (EntitySkuller.this.world.getDifficulty() != EnumDifficulty.PEACEFUL)
            {
                --this.attackTime;
                EntityLivingBase entitylivingbase = EntitySkuller.this.getAttackTarget();
                EntitySkuller.this.getLookHelper().setLookPositionWithEntity(entitylivingbase, 180.0F, 180.0F);
                double d0 = EntitySkuller.this.getDistanceSq(entitylivingbase);

                if (d0 < 400.0D)
                {
                    if (this.attackTime <= 0)
                    {
                        this.attackTime = 20 + EntitySkuller.this.rand.nextInt(10) * 20 / 2;
                        //EntityShulkerBullet entityshulkerbullet = new EntityShulkerBullet(EntitySkuller.this.world, EntitySkuller.this, entitylivingbase, EntitySkuller.this.getAttachmentFacing().getAxis());
                        //EntitySkuller.this.world.spawnEntity(entityshulkerbullet);
                        EntitySkuller.this.playSound(SoundEvents.ENTITY_SHULKER_SHOOT, 2.0F, (EntitySkuller.this.rand.nextFloat() - EntitySkuller.this.rand.nextFloat()) * 0.2F + 1.0F);
                    }
                }
                else
                {
                	EntitySkuller.this.setAttackTarget((EntityLivingBase)null);
                }

                super.updateTask();
            }
        }
    }

    class AIAttackNearest extends EntityAINearestAttackableTarget<EntityPlayer>
    {
        public AIAttackNearest(EntityShulker shulker)
        {
            super(shulker, EntityPlayer.class, true);
        }

        /**
         * Returns whether the EntityAIBase should begin execution.
         */
        public boolean shouldExecute()
        {
            return EntitySkuller.this.world.getDifficulty() == EnumDifficulty.PEACEFUL ? false : super.shouldExecute();
        }

        protected AxisAlignedBB getTargetableArea(double targetDistance)
        {
            EnumFacing enumfacing = ((EntityShulker)this.taskOwner).getAttachmentFacing();

            if (enumfacing.getAxis() == EnumFacing.Axis.X)
            {
                return this.taskOwner.getEntityBoundingBox().grow(4.0D, targetDistance, targetDistance);
            }
            else
            {
                return enumfacing.getAxis() == EnumFacing.Axis.Z ? this.taskOwner.getEntityBoundingBox().grow(targetDistance, targetDistance, 4.0D) : this.taskOwner.getEntityBoundingBox().grow(targetDistance, 4.0D, targetDistance);
            }
        }
    }

    static class AIDefenseAttack extends EntityAINearestAttackableTarget<EntityLivingBase>
        {
            public AIDefenseAttack(EntityShulker shulker)
            {
                super(shulker, EntityLivingBase.class, 10, true, false, new Predicate<EntityLivingBase>()
                {
                    public boolean apply(@Nullable EntityLivingBase p_apply_1_)
                    {
                        return p_apply_1_ instanceof IMob;
                    }
                });
            }

            /**
             * Returns whether the EntityAIBase should begin execution.
             */
            public boolean shouldExecute()
            {
                return this.taskOwner.getTeam() == null ? false : super.shouldExecute();
            }

            protected AxisAlignedBB getTargetableArea(double targetDistance)
            {
                EnumFacing enumfacing = ((EntityShulker)this.taskOwner).getAttachmentFacing();

                if (enumfacing.getAxis() == EnumFacing.Axis.X)
                {
                    return this.taskOwner.getEntityBoundingBox().grow(4.0D, targetDistance, targetDistance);
                }
                else
                {
                    return enumfacing.getAxis() == EnumFacing.Axis.Z ? this.taskOwner.getEntityBoundingBox().grow(targetDistance, targetDistance, 4.0D) : this.taskOwner.getEntityBoundingBox().grow(targetDistance, 4.0D, targetDistance);
                }
            }
        }

    class AIPeek extends EntityAIBase
    {
        private int peekTime;

        private AIPeek()
        {
        }

        /**
         * Returns whether the EntityAIBase should begin execution.
         */
        public boolean shouldExecute()
        {
            return EntitySkuller.this.getAttackTarget() == null && EntitySkuller.this.rand.nextInt(40) == 0;
        }

        /**
         * Returns whether an in-progress EntityAIBase should continue executing
         */
        public boolean shouldContinueExecuting()
        {
            return EntitySkuller.this.getAttackTarget() == null && this.peekTime > 0;
        }

        /**
         * Execute a one shot task or start executing a continuous task
         */
        public void startExecuting()
        {
            this.peekTime = 20 * (1 + EntitySkuller.this.rand.nextInt(3));
            EntitySkuller.this.updateArmorModifier(30);
        }

        /**
         * Reset the task's internal state. Called when this task is interrupted by another one
         */
        public void resetTask()
        {
            if (EntitySkuller.this.getAttackTarget() == null)
            {
            	EntitySkuller.this.updateArmorModifier(0);
            }
        }

        /**
         * Keep ticking a continuous task that has already been started
         */
        public void updateTask()
        {
            --this.peekTime;
        }
    }

    class BodyHelper extends EntityBodyHelper
    {
        public BodyHelper(EntityLivingBase theEntity)
        {
            super(theEntity);
        }

        /**
         * Update the Head and Body rendenring angles
         */
        public void updateRenderAngles()
        {
        }
    }
}
