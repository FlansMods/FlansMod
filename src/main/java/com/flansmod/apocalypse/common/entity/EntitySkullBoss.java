package com.flansmod.apocalypse.common.entity;

import com.flansmod.apocalypse.common.world.buildings.WorldGenBossPillar;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityShulker;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
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
    	LOOK_AT_PLAYER,
    	LAUGH,
    	SPAWN_DRONES,
    	SHOOT_TNT,
    }
    
    private static final int kLaughTicks = 80;
    private static final int kNumLaughs = 6;
    private static final float kLaughContributionOffset = 1.0f / ((float)kNumLaughs + 1);
    private static final float kLaughContributionLength = 2.0f * kLaughContributionOffset;
    
    public float GetLaughFactor(float partialTicks)
    {
    	if(GetCurrentAction() == EnumAction.LAUGH)
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
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1000.0D);
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
			this.motionX -= this.posX * lerpSpeed / 20f; 
			this.motionZ -= this.posZ * lerpSpeed / 20f; 
			this.motionY = (WorldGenBossPillar.kBossSpawnHeight - this.posY) * lerpSpeed / 20f; 
									
			switch(currentAction)
			{
				case IDLE:
				{
					if(timeInCurrentMode >= 20)	// After 1s in idle, choose another mode
					{
						switch(rand.nextInt(4))
						{
							//case 0: SwitchAction(EnumAction.LOOK_AT_PLAYER); break;
							//case 1: SwitchAction(EnumAction.LAUGH); break;
							//case 2: SwitchAction(EnumAction.SPAWN_DRONES); break;
							//case 3: SwitchAction(EnumAction.SHOOT_TNT); break;
							
							default: SwitchAction(EnumAction.LAUGH); break;
						}
					}
					break;
				}
				case LOOK_AT_PLAYER:
				{
					break;
				}
				case LAUGH:	
				{
					if(timeInCurrentMode >= kLaughTicks)
					{
						SwitchAction(EnumAction.IDLE);
					}
					break;
				}
				case SPAWN_DRONES:
				{
					break;
				}
				case SHOOT_TNT:
				{
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
	
	@Override
    public boolean attackEntityFrom(DamageSource source, float amount)
    {
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

}
