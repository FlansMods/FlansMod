package com.flansmod.apocalypse.common.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackRangedBow;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ItemShootable;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.vector.Vector3f;

public class EntityFlansModShooter extends EntityMob implements IRangedAttackMob
{
	private EntityAIAttackRangedBow aiArrowAttack = new EntityAIAttackRangedBow(this, 1.0D, 20, 70.0F);
	public ItemStack[] ammoStacks;
	public float shootDelay = 0;
	public float minigunSpeed = 0.0F;
	public int loopedSoundDelay = 0;
	public boolean reloading = false;
	public boolean shouldPlayWarmupSound = true;
	private int soundDelay = 0;
	
	public EntityFlansModShooter(World world)
	{
		super(world);
		ammoStacks = new ItemStack[0];
		tasks.addTask(1, new EntityAISwimming(this));
		tasks.addTask(4, new EntityAIWander(this, 1.0D));
		tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		tasks.addTask(6, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
		targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityIronGolem.class, true));

		if(world != null && !world.isRemote)
		{
			tasks.addTask(4, this.aiArrowAttack);
		}
		else
		{
			setRenderDistanceWeight(200D);
		}
	}
	
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		if(shootDelay > 0)
			shootDelay--;
	}
	
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(80D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}
	
	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData data)
	{
		data = super.onInitialSpawn(difficulty, data);

		this.tasks.addTask(4, this.aiArrowAttack);
		this.setEquipmentBasedOnDifficulty(difficulty);
		this.setEnchantmentBasedOnDifficulty(difficulty);

		this.setCanPickUpLoot(this.rand.nextFloat() < 0.55F * difficulty.getClampedAdditionalDifficulty());

		return data;
	}

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase entity, float range)
	{
		ItemStack stack = getHeldItemMainhand();
		if(stack != null && stack.getItem() instanceof ItemGun)
		{
			ItemGun item = (ItemGun)stack.getItem();
			GunType type = item.GetType();
			boolean shouldShoot = false;
			switch(type.mode)
			{
				case MINIGUN:
					shouldShoot = minigunSpeed >= type.minigunStartSpeed && shootDelay <= 0;
					break;
				case BURST:
				case FULLAUTO:
				case SEMIAUTO:
					shouldShoot = shootDelay <= 0;
					break;
			}
			
			if(type.useLoopingSounds && loopedSoundDelay <= 0 && minigunSpeed > 0.1F && !reloading)
			{
				loopedSoundDelay = shouldPlayWarmupSound ? type.warmupSoundLength : type.loopedSoundLength;
				PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, shouldPlayWarmupSound ? type.warmupSound : type.loopedSound, false);
				shouldPlayWarmupSound = false;
			}
			
			if(shouldShoot)
			{
				//player.inventory.setInventorySlotContents(player.inventory.currentItem, tryToShoot(itemstack, type, world, player, false));
				int damage = 0;
				//Check all gun's slots for a valid bullet to shoot
				int bulletID = 0;
				ItemStack bulletStack = ItemStack.EMPTY.copy();
				for(; bulletID < type.numAmmoItemsInGun; bulletID++)
				{
					ItemStack checkingStack = item.getBulletItemStack(stack, bulletID);
					if(checkingStack != null && !checkingStack.isEmpty() && checkingStack.getItemDamage() < checkingStack.getMaxDamage())
					{
						bulletStack = checkingStack;
						break;
					}
				}
				
				//If no bullet stack was found, reload
				if(bulletStack == null || bulletStack.isEmpty())
				{
					if(reload(stack, type, world, this, false, false))
					{
						//Set player shoot delay to be the reload delay
						//Set both gun delays to avoid reloading two guns at once
						shootDelay = (int)type.getReloadTime(stack);
						
						reloading = true;
						
						//Play reload sound
						if(type.reloadSound != null)
							PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.reloadSound, true);
					}
				}
				//A bullet stack was found, so try shooting with it
				else if(bulletStack.getItem() instanceof ItemShootable)
				{
					//Shoot
					shoot(stack, type, world, bulletStack, this, false, entity);
					//Damage the bullet item
					damage = bulletStack.getItemDamage() + 1;
					bulletStack.setItemDamage(damage);
					
					//Update the stack in the gun
					item.setBulletItemStack(stack, bulletStack, bulletID);
				}
				
				switch(type.mode)
				{
					case FULLAUTO: case MINIGUN:
					shootDelay = type.GetShootDelay(stack);
					break;
					case SEMIAUTO:
						shootDelay = 2 * type.shootDelay;
						break;
					case BURST:
						shootDelay = (damage % 3 == 0 ? 3 * shootDelay : shootDelay);
						break;
				}

			}
		}
	}
	
	/**
	 * Reload method. Called automatically when firing with an empty clip
	 */
	public boolean reload(ItemStack gunStack, GunType gunType, World world, Entity entity, boolean creative, boolean forceReload)
	{
		ItemGun item = ((ItemGun)gunType.item);
		//Deployable guns cannot be reloaded in the inventory
		if(gunType.deployable)
			return false;
		//If you cannot reload half way through a clip, reject the player for trying to do so
		if(forceReload && !gunType.canForceReload)
			return false;
		//For playing sounds afterwards
		boolean reloadedSomething = false;
		//Check each ammo slot, one at a time
		for(int i = 0; i < gunType.numAmmoItemsInGun; i++)
		{
			//Get the stack in the slot
			ItemStack bulletStack = item.getBulletItemStack(gunStack, i);
			
			//If there is no magazine, if the magazine is empty or if this is a forced reload
			if(bulletStack == null || bulletStack.isEmpty() || bulletStack.getItemDamage() == bulletStack.getMaxDamage() || forceReload)
			{
				//Iterate over all inventory slots and find the magazine / bullet item with the most bullets
				int bestSlot = -1;
				int bulletsInBestSlot = 0;
				for(int j = 0; j < ammoStacks.length; j++)
				{
					ItemStack searchingStack = ammoStacks[j];
					if(searchingStack != null && searchingStack.getItem() instanceof ItemShootable && gunType.isAmmo(((ItemShootable)(searchingStack.getItem())).type))
					{
						int bulletsInThisSlot = searchingStack.getMaxDamage() - searchingStack.getItemDamage();
						if(bulletsInThisSlot > bulletsInBestSlot)
						{
							bestSlot = j;
							bulletsInBestSlot = bulletsInThisSlot;
						}
					}
				}
				//If there was a valid non-empty magazine / bullet item somewhere in the inventory, load it
				if(bestSlot != -1)
				{
					ItemStack newBulletStack = ammoStacks[bestSlot];
					ShootableType newBulletType = ((ItemShootable)newBulletStack.getItem()).type;
					//Unload the old magazine (Drop an item if it is required and the player is not in creative mode)
					if(bulletStack != null && bulletStack.getItem() instanceof ItemShootable && ((ItemShootable)bulletStack.getItem()).type.dropItemOnReload != null && !creative)
						item.dropItem(world, this, ((ItemShootable)bulletStack.getItem()).type.dropItemOnReload);
					
					//Load the new magazine
					ItemStack stackToLoad = newBulletStack.copy();
					stackToLoad.setCount(1);
					item.setBulletItemStack(gunStack, stackToLoad, i);
					
					//Remove the magazine from the inventory
					if(!creative)
						newBulletStack.setCount(newBulletStack.getCount() - 1);
					if(newBulletStack.getCount() <= 0)
						newBulletStack = null;
					ammoStacks[bestSlot] = newBulletStack;

					
					//Tell the sound player that we reloaded something
					reloadedSomething = true;
				}
			}
		}
		return reloadedSomething;
	}
	
	/**
	 * Method for shooting to avoid repeated code
	 */
	private void shoot(ItemStack stack, GunType gunType, World world, ItemStack bulletStack, Entity entity, boolean left, EntityLivingBase target)
	{
		ItemGun item = (ItemGun)gunType.item;
		ShootableType bullet = ((ItemShootable)bulletStack.getItem()).type;
		// Play a sound if the previous sound has finished
		if(soundDelay <= 0 && gunType.shootSound != null)
		{
			AttachmentType barrel = gunType.getBarrel(stack);
			boolean silenced = barrel != null && barrel.silencer;
			//world.playSoundAtEntity(entityplayer, type.shootSound, 10F, type.distortSound ? 1.0F / (world.rand.nextFloat() * 0.4F + 0.8F) : 1.0F);
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, gunType.shootSound, gunType.distortSound, silenced);
			soundDelay = gunType.shootSoundLength;
		}
		if(!world.isRemote)
		{
			float inaccuracy = 0.5F;
			
			// Spawn the bullet entities
			for(int k = 0; k < gunType.numBullets * bullet.numBullets; k++)
			{
				Vector3f origin = new Vector3f(posX, posY + getEyeHeight(), posZ);
				Vector3f direction = new Vector3f(target.posX - posX, (target.posY + target.getEyeHeight()) - (posY + getEyeHeight()), target.posZ - posZ).normalise(null);
				Vector3f.add(direction, new Vector3f(rand.nextFloat() * direction.x * inaccuracy, rand.nextFloat() * direction.y * inaccuracy, rand.nextFloat() * direction.z * inaccuracy), direction);
				ItemShootable shootableItem = (ItemShootable)bulletStack.getItem();
				shootableItem.shoot(world,
						origin,
						direction,
						gunType.getDamage(stack),
						gunType.getSpread(stack),
						gunType.getBulletSpeed(stack),
						gunType,
						this);
			}
			// Drop item on shooting if bullet requires it
			if(bullet.dropItemOnShoot != null)
				item.dropItem(world, this, bullet.dropItemOnShoot);
			// Drop item on shooting if gun requires it
			if(gunType.dropItemOnShoot != null)
				item.dropItem(world, this, gunType.dropItemOnShoot);
		}
		shootDelay = gunType.GetShootDelay(stack);
	}
	
	@Override
	protected boolean canDespawn()
	{
		return false;
	}
	
	@Override
	protected boolean isValidLightLevel()
	{
		return true;
	}

	@Override
	public boolean getCanSpawnHere()
	{
		return this.world.getDifficulty() != EnumDifficulty.PEACEFUL;
	}

	@Override
	public void setSwingingArms(boolean swingingArms)
	{
		
	}
}
