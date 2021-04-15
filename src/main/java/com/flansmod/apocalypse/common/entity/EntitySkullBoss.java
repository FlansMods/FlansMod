package com.flansmod.apocalypse.common.entity;

import com.flansmod.apocalypse.common.FlansModApocalypse;
import com.flansmod.apocalypse.common.world.buildings.WorldGenBossPillar;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.EntityDamageSourceFlan;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.network.PacketPlaySound;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.monster.EntityShulker;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.BossInfo;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.World;

public class EntitySkullBoss extends EntityLiving
{
    protected static final DataParameter<Byte> ACTION = EntityDataManager.<Byte>createKey(EntitySkullBoss.class, DataSerializers.BYTE);
    protected static final DataParameter<Integer> LOOKING_AT_ENTITY = EntityDataManager.<Integer>createKey(EntitySkullBoss.class, DataSerializers.VARINT);
    private final BossInfoServer bossInfo = (BossInfoServer)(new BossInfoServer(this.getDisplayName(), BossInfo.Color.WHITE, BossInfo.Overlay.PROGRESS)).setDarkenSky(true);
    private int timeInCurrentMode = 0;
    private EnumAction prevAction = EnumAction.IDLE;
    
    public enum EnumAction
    {
    	IDLE,
    	LAUGH,
    	SPAWN_DRONES,
    	SHOOT_TNT,
    }
    
    private static final int kLaughTicks = 80;
    private static final int kNumLaughs = 6;
    private static final float kLaughContributionOffset = 1.0f / ((float)kNumLaughs + 1);
    private static final float kLaughContributionLength = 2.0f * kLaughContributionOffset;
    
    // in degrees
    public float GetSpawnSpin(float partialTicks)
    {
    	if(GetCurrentAction() == EnumAction.SPAWN_DRONES)
    	{
    		float parametric = (float)(timeInCurrentMode + partialTicks) / (float)kLaughTicks;
    		float smoothstep =  parametric * parametric * (3 - 2 * parametric);

    		return smoothstep * 720f;    		
    	}
    	return 0.0f;
    }
    
    public float GetLaughFactor(float partialTicks)
    {
    	if(GetCurrentAction() == EnumAction.LAUGH || GetCurrentAction() == EnumAction.SHOOT_TNT)
    	{
    		float result = 0.0f;
    		float parametric = (float)(timeInCurrentMode + partialTicks) / (float)kLaughTicks;
    		for(int i = 0; i < kNumLaughs; i++)
    		{
    			if(kLaughContributionOffset * i <= parametric && parametric <= kLaughContributionOffset * (i + 2))
    			{
    				result += Math.sin(Math.PI * (parametric - kLaughContributionOffset * i) / kLaughContributionLength);
    			}
    		}
    		
    		return result;    		
    	}
    	return 0.0f;
    }
	
	public EntitySkullBoss(World worldIn) 
	{
		super(worldIn);
		setSize(16F, 16F);
		experienceValue = 5000;
		setNoGravity(true);
		enablePersistence();
		setNoAI(true);
		ignoreFrustumCheck = true;
	}
	
	@Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1024.0D);
        //this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(10d);
        //this.getEntityAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS).setBaseValue(10d);
    }
	
    /**
     * Add the given player to the list of players tracking this entity. For instance, a player may track a boss in
     * order to view its associated boss bar.
     */
	@Override
    public void addTrackingPlayer(EntityPlayerMP player)
    {
        super.addTrackingPlayer(player);
        this.bossInfo.addPlayer(player);
    }

    /**
     * Removes the given player from the list of players tracking this entity. See {@link Entity#addTrackingPlayer} for
     * more information on tracking.
     */
	@Override
    public void removeTrackingPlayer(EntityPlayerMP player)
    {
        super.removeTrackingPlayer(player);
        this.bossInfo.removePlayer(player);
    }
	
	private void SwitchAction(EnumAction action)
	{
		dataManager.set(ACTION, (byte)action.ordinal());
		timeInCurrentMode = 0;
	}
	
	public EnumAction GetCurrentAction()
	{
		return EnumAction.values()[dataManager.get(ACTION)];
	}
	
	@Override 
	public void onUpdate()
	{
		super.onUpdate();
		
		timeInCurrentMode++;
		this.fallDistance = 0f;
		
		EnumAction currentAction = GetCurrentAction();
		if(currentAction != prevAction)
		{
			// For clients, we just get a data update, so check here for a change
			timeInCurrentMode = 0;
			prevAction = currentAction;
		}
		
		if(!world.isRemote) 
		{
			float lerpSpeed = 0.1f;
			float targetYHeight = 180f + (float)Math.sin(ticksExisted / 200f) * 40f;
			this.motionX -= this.posX * lerpSpeed / 20f; 
			this.motionZ -= this.posZ * lerpSpeed / 20f; 
			this.motionY = (targetYHeight - this.posY) * lerpSpeed / 20f; 
			
			this.move(MoverType.SELF, motionX, motionY, motionZ);
									
			switch(currentAction)
			{
				case IDLE:
				{
					if(timeInCurrentMode >= 20)	// After 1s in idle, choose another mode
					{
						switch(rand.nextInt(3))
						{
							case 1: SwitchAction(EnumAction.LAUGH); break;
							case 2: SwitchAction(EnumAction.SPAWN_DRONES); break;
							case 0: SwitchAction(EnumAction.SHOOT_TNT); break;
							
							default: SwitchAction(EnumAction.SHOOT_TNT); break;
						}
					}
					break;
				}
				case LAUGH:	
				{
					if(timeInCurrentMode == 2)
					{
						PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, "skullboss_laugh", false);
						
					}
					
					if(timeInCurrentMode % 5 == 0)
					{
						world.createExplosion(this, posX + rand.nextGaussian() * 10d, posY + rand.nextGaussian() * 10d, posZ + rand.nextGaussian() * 10d, 10f, false);
					}
					
					if(timeInCurrentMode >= kLaughTicks)
					{						
						SwitchAction(EnumAction.IDLE);
					}
					break;
				}
				case SPAWN_DRONES:
				{
					if(timeInCurrentMode == 2)
					{
						PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, "skullboss_spawn", false);
						
						EntitySkullDrone drone = new EntitySkullDrone(world);
						drone.setPosition(posX, posY - 5f, posZ);
						ItemStack loadedGun = FlansModApocalypse.getLootGenerator().getRandomLoadedGun(rand, false);
						drone.setHeldItem(EnumHand.MAIN_HAND, loadedGun);
						drone.setInventorySlotContents(0, ((ItemGun)loadedGun.getItem()).getBulletItemStack(loadedGun, 0).copy());
						
						int lookingAtID = dataManager.get(LOOKING_AT_ENTITY);
						if(lookingAtID != 0)
						{
							Entity target = world.getEntityByID(lookingAtID);
							drone.SetTarget(target);
						}
						world.spawnEntity(drone);
						
					}
					
					if(timeInCurrentMode >= kLaughTicks)
					{
						SwitchAction(EnumAction.IDLE);
					}
					break;
				}
				case SHOOT_TNT:
				{
					if(timeInCurrentMode % 20 == 0)
					{
						int lookingAtID = dataManager.get(LOOKING_AT_ENTITY);
						if(lookingAtID != 0)
						{
							Entity target = world.getEntityByID(lookingAtID);
							if(target != null)
							{
								EntityTNTPrimed tnt = new EntityTNTPrimed(world);
								Vec3d dPos = new Vec3d(
										target.posX - posX,
										target.posY - posY,
										target.posX - posX);
								
								double distance = dPos.length();
								dPos = dPos.normalize();
								dPos = dPos.scale(2d);
								
								tnt.setNoGravity(true);
								tnt.setPosition(posX + dPos.x, posY + dPos.y, posZ + dPos.z);
								tnt.setVelocity(
										(target.posX - posX) / 40d, 
										(target.posY - posY) / 40d, 
										(target.posZ - posZ) / 40d);
								world.spawnEntity(tnt);
								
								PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, "fire.ignite", true);

							}
						}
					}
					
					if(timeInCurrentMode >= kLaughTicks)
					{
						SwitchAction(EnumAction.IDLE);
					}
					break;
				}
			}
		}
		
		int lookingAtID = dataManager.get(LOOKING_AT_ENTITY);
		if(lookingAtID != 0)
		{
			Entity entity = world.getEntityByID(lookingAtID);
			if(entity == null || entity.isDead)
			{
				if(!world.isRemote)
					dataManager.set(LOOKING_AT_ENTITY, 0);
			}
			else if(!world.isRemote)
			{
				double dX = entity.posX - posX;
				double dY = entity.posY - posY;
				double dZ = entity.posZ - posZ;
				
				float targetYaw = (float)(Math.atan2(dZ, dX) * 180d / Math.PI);
				float targetPitch = (float)(Math.atan2(dY, Math.sqrt(dX * dX + dZ * dZ)) * 180d / Math.PI);
				
				float deltaYaw = targetYaw - rotationYaw;
				float deltaPitch = targetPitch - rotationPitch;
				
				while(deltaYaw > 180f)
					deltaYaw -= 360f;
				while(deltaYaw < -180f)
					deltaYaw += 360f;
				
				rotationYaw += deltaYaw / 20f;
				rotationPitch += deltaPitch / 20f;
			}
		}
		
		this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
	}
	
	public void SetTarget(Entity target)
	{
		dataManager.set(LOOKING_AT_ENTITY, target == null ? 0 : target.getEntityId());
	}
	
	@Override
    public boolean attackEntityFrom(DamageSource source, float amount)
    {
		if(source.isExplosion())
			return false;
		if(source.getTrueSource() instanceof EntitySkullDrone || 
				source instanceof EntityDamageSourceFlan && ((EntityDamageSourceFlan)source).getCausedPlayer() == null)
		{
			return false; 
		}
		// Hard cap because some Flan's Mod configs can get a bit out of hand
		if(amount > 99f)
			amount = 99f;
		
		switch(world.getWorldInfo().getDifficulty())
		{
			case HARD:
				amount *= 0.25f;
				break;
			case NORMAL:
				amount *= 0.5f;
				break;
			default:
			case EASY:
			case PEACEFUL:
				break;
		}
		
		super.attackEntityFrom(source, amount);
		if(!world.isRemote)
		{
			Entity sourceEntity = source.getTrueSource();
			if(sourceEntity != null)
				dataManager.set(LOOKING_AT_ENTITY, sourceEntity.getEntityId());
		}
		return true;
    }
	
	@Override
	protected void entityInit() 
	{
		super.entityInit();
		dataManager.register(ACTION, (byte)0);
		dataManager.register(LOOKING_AT_ENTITY, 0);
		
		PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, "skullboss_spawn", true);

	}

	@Override
	public void readEntityFromNBT(NBTTagCompound tags) 
	{
		super.readEntityFromNBT(tags);
		dataManager.set(ACTION, tags.getByte("Action"));
		dataManager.set(LOOKING_AT_ENTITY, tags.getInteger("LookingAt"));
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound tags) 
	{
		super.writeEntityToNBT(tags);
		tags.setByte("Action", dataManager.get(ACTION));
		tags.setInteger("LookingAt", dataManager.get(LOOKING_AT_ENTITY));
	}
	
	@Override 
	public void setDead()
	{
		super.setDead();
		
		if(!world.isRemote)
		{
			dropItem(Items.GOLDEN_APPLE, rand.nextInt(4) + 1);
			dropItem(Items.TOTEM_OF_UNDYING, 1);
			// Lots of gunpowder
			dropItem(Items.GUNPOWDER, rand.nextInt(32) + 1);
			dropItem(Items.GUNPOWDER, rand.nextInt(32) + 1);
			dropItem(Items.GUNPOWDER, rand.nextInt(32) + 1);
			dropItem(FlansMod.gunpowderBlockItem, rand.nextInt(4) + 1);
			dropItem(FlansMod.gunpowderBlockItem, rand.nextInt(4) + 1);
			dropItem(FlansMod.gunpowderBlockItem, rand.nextInt(4) + 1);
			
			if(FlansModApocalypse.nukraniumGauntlet != null)
			{
				ItemStack gauntlet = new ItemStack(FlansModApocalypse.nukraniumGauntlet);
				// 50% enchanted, 50% clean
				if(rand.nextBoolean())
				{
					EnchantmentHelper.addRandomEnchantment(world.rand, gauntlet, 50, true);
				}
				entityDropItem(gauntlet, 0.0f);
			}
		}
	}
}
