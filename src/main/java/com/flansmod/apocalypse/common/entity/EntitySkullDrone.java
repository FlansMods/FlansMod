package com.flansmod.apocalypse.common.entity;

import java.util.Optional;

import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.FlansMod;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.EnumFireMode;
import com.flansmod.common.guns.EnumSpreadPattern;
import com.flansmod.common.guns.FireableGun;
import com.flansmod.common.guns.FiredShot;
import com.flansmod.common.guns.GrenadeType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemGrenade;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ItemShootable;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.guns.ShotHandler;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.vector.Vector3f;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntitySkullDrone extends EntityLiving implements IInventory
{
	protected static final DataParameter<Integer> LOOKING_AT_ENTITY = EntityDataManager.<Integer>createKey(EntitySkullDrone.class, DataSerializers.VARINT);
	   
	private float shootDelay = 0;
	private int soundDelay = 0;

	private Vector3f offsetFromTarget = new Vector3f();
	
	@SideOnly(Side.CLIENT)
	public GunAnimations animations = new GunAnimations();
	
	public EntitySkullDrone(World worldIn) 
	{
		super(worldIn);
		setSize(3F, 1F);
		setNoGravity(true);
		enablePersistence();
		setNoAI(true);	
		experienceValue = 50;
	}
	
	@Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(60.0D);
    }

	
	@Override 
	public void onUpdate()
	{
		super.onUpdate();
		
		animations.update();
		this.fallDistance = 0f;
		
		int entityID = dataManager.get(LOOKING_AT_ENTITY);
		Entity target = world.getEntityByID(entityID);
		
		if(target != null)
		{
			if(target.isDead)
			{
				SetTarget(null);
			}
			else if(rand.nextInt(1200) == 0)
			{
				SetTarget(null);
			}
			else
			{
				double dX = target.posX - posX;
				double dY = target.posY - posY;
				double dZ = target.posZ - posZ;
				
				if(!world.isRemote)
				{
					// Position code
					if(rand.nextInt(60) == 0)
					{
						offsetFromTarget.scale(0.5f);
						offsetFromTarget.x += rand.nextGaussian() * 10f;
						offsetFromTarget.z += rand.nextGaussian() * 10f;
						offsetFromTarget.y = rand.nextFloat() * 5.0f + 5.0f;		
					}
					
					this.motionX = ((target.posX + offsetFromTarget.x) - posX) * 0.06f;
					this.motionY = ((target.posY + offsetFromTarget.y) - posY) * 0.06f;
					this.motionZ = ((target.posZ + offsetFromTarget.z) - posZ) * 0.06f;
					
					this.move(MoverType.SELF, motionX, motionY, motionZ);
				}
				
				// Look at code
				float targetYaw = (float)(Math.atan2(dZ, dX) * 180d / Math.PI);
				float targetPitch = (float)(Math.atan2(dY, Math.sqrt(dX * dX + dZ * dZ)) * 180d / Math.PI);
				
				float deltaYaw = targetYaw - rotationYaw;
				float deltaPitch = targetPitch - rotationPitch;
				
				while(deltaYaw > 180f)
					deltaYaw -= 360f;
				while(deltaYaw < -180f)
					deltaYaw += 360f;
				
				rotationYaw += deltaYaw / 2f;
				rotationPitch += deltaPitch / 2f;
				
				if(!world.isRemote)// && deltaYaw < 1f && deltaPitch < 1f)
				{
					shootDelay--;
					UseGun();
				}
			}
		}
		else if(rand.nextInt(1200) == 0)
		{
			Entity closestPlayer = world.getClosestPlayer(posX, posY, posZ, 100.0d, false);
			if(closestPlayer != null)
			{
				SetTarget(closestPlayer);
			}
		}
	}
	
	private void UseGun()
	{
		ItemStack gunStack = getItemStackFromSlot(EntityEquipmentSlot.MAINHAND);
		if(!gunStack.isEmpty() && gunStack.getItem() instanceof ItemGun)
		{
			ItemGun gunItem = (ItemGun)gunStack.getItem();
			GunType gunType = gunItem.GetType();
			
			//If we can shoot
			if(shootDelay <= 0)
			{
				//Go through the bullet stacks in the gun and see if any of them are not null
				int bulletID = 0;
				ItemStack ammoStackInGun = null;
				for(; bulletID < gunType.numAmmoItemsInGun; bulletID++)
				{
					ItemStack checkingStack = gunItem.getBulletItemStack(gunStack, bulletID);
					if(checkingStack != null && !checkingStack.isEmpty() && checkingStack.getItemDamage() < checkingStack.getMaxDamage())
					{
						ammoStackInGun = checkingStack;
						break;
					}
				}
				
				//If no bullet stack was found, reload
				if(ammoStackInGun == null || ammoStackInGun.isEmpty())
				{
					gunItem.Reload(gunStack, world, this, this, EnumHand.MAIN_HAND, true, true, true);
					
					if(gunType.reloadSound != null)
						PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, gunType.reloadSound, gunType.distortSound);
					
					shootDelay = gunType.reloadTime * 3f;
				}
				//A bullet stack was found, so try shooting with it
				else if(ammoStackInGun.getItem() instanceof ItemBullet || ammoStackInGun.getItem() instanceof ItemGrenade)
				{
					//Shoot
					DoShoot(gunStack, gunType, ammoStackInGun, true, true);
					
					//Apply animations to 3D modelled guns
					//TODO this doesn't work
					animations.doShoot(gunType.getPumpDelay(), gunType.getPumpTime());
					
					//Damage the bullet item
					ammoStackInGun.setItemDamage(ammoStackInGun.getItemDamage() + 1);
					
					//Update the stack in the gun
					gunItem.setBulletItemStack(gunStack, ammoStackInGun, bulletID);
				}
			}
		}
	}
	
	private void DoShoot(ItemStack stack, GunType gunType, ItemStack bulletStack, boolean creative, boolean left)
	{
		int entityID = dataManager.get(LOOKING_AT_ENTITY);
		Entity target = world.getEntityByID(entityID);
		ShootableType bulletType = ((ItemShootable)bulletStack.getItem()).type;		
		Vector3f bulletOrigin = new Vector3f(posX, posY - 1f, posZ);
		Vector3f aimVector = new Vector3f(target.posX - posX, target.posY - (posY - 1f), target.posZ - posZ);
		
		if(!world.isRemote)
		{
			ShootableType shootableType = ((ItemShootable)bulletStack.getItem()).type;
			if (shootableType instanceof BulletType)
			{
				FireableGun fireableGun = new FireableGun(gunType, gunType.getDamage(stack), gunType.getSpread(stack) * 5f + 10f, gunType.getBulletSpeed(stack), EnumSpreadPattern.circle);
				FiredShot shot = new FiredShot(fireableGun, (BulletType)shootableType, this, null);
				ShotHandler.fireGun(world, shot, gunType.numBullets*bulletType.numBullets, bulletOrigin, aimVector);
			}
			else if (shootableType instanceof GrenadeType)
			{
				double yaw = Math.atan2(aimVector.z, aimVector.x);
				double pitch = Math.atan2(Math.sqrt(aimVector.z * aimVector.z + aimVector.x * aimVector.x), aimVector.y) - Math.PI/2;
				Optional<Entity> ent = Optional.of(this);
				Optional<EntityPlayer> player = Optional.ofNullable(null);
				
				EntityGrenade grenade = new EntityGrenade(world, bulletOrigin, (GrenadeType) shootableType, (float)Math.toDegrees(pitch), (float)Math.toDegrees(yaw + Math.PI*1.5), player, ent);
				world.spawnEntity(grenade);
			}
		}
		
		shootDelay = gunType.mode == EnumFireMode.SEMIAUTO ? Math.max(gunType.GetShootDelay(stack), 5) : gunType.GetShootDelay(stack);
				
		// Play a sound if the previous sound has finished
		if(soundDelay <= 0 && gunType.shootSound != null)
		{
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, gunType.shootSound, gunType.distortSound);
			soundDelay = gunType.shootSoundLength;
		}
	}
	
	public void SetTarget(Entity entity)
	{
		dataManager.set(LOOKING_AT_ENTITY, entity == null ? 0 : entity.getEntityId());
		
		offsetFromTarget.x += rand.nextGaussian() * 5f;
		offsetFromTarget.z += rand.nextGaussian() * 5f;
		offsetFromTarget.y = 10.0f;		
	}
	
	@Override
    public boolean attackEntityFrom(DamageSource source, float amount)
    {
		if(source.isExplosion() || source.isFireDamage())
			return false;
		if(source.getTrueSource() instanceof EntitySkullBoss 
		|| source.getTrueSource() instanceof EntitySkullDrone)
			return false;
		
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
		dataManager.register(LOOKING_AT_ENTITY, 0);
	}
	
	@Override
	public void readEntityFromNBT(NBTTagCompound tags) 
	{
		super.readEntityFromNBT(tags);
		dataManager.set(LOOKING_AT_ENTITY, tags.getInteger("LookingAt"));
		bulletStack = new ItemStack( tags.getCompoundTag("BulletStack"));
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound tags) 
	{
		super.writeEntityToNBT(tags);
		tags.setInteger("LookingAt", dataManager.get(LOOKING_AT_ENTITY));
		tags.setTag("BulletStack", bulletStack.writeToNBT(new NBTTagCompound()));
	}
	
	// IInventory
	private ItemStack bulletStack = ItemStack.EMPTY;
	
	@Override
	public int getSizeInventory()  { return 1; }
	@Override
	public boolean isEmpty() { return bulletStack.isEmpty(); }
	@Override
	public ItemStack getStackInSlot(int index) { return bulletStack; }
	@Override
	public ItemStack decrStackSize(int index, int count) { bulletStack.setCount(bulletStack.getCount() - count); return bulletStack; }
	@Override
	public ItemStack removeStackFromSlot(int index) { ItemStack temp = bulletStack; bulletStack = ItemStack.EMPTY; return temp; }
	@Override
	public void setInventorySlotContents(int index, ItemStack stack) { bulletStack = stack;	}
	@Override
	public int getInventoryStackLimit() { return 64; }
	@Override
	public void markDirty() {}
	@Override
	public boolean isUsableByPlayer(EntityPlayer player) { return false; }
	@Override
	public void openInventory(EntityPlayer player) {}
	@Override
	public void closeInventory(EntityPlayer player) {}
	@Override
	public boolean isItemValidForSlot(int index, ItemStack stack) { return stack.getItem() instanceof ItemShootable; }
	@Override
	public int getField(int id) { return 0; }
	@Override
	public void setField(int id, int value) { }
	@Override
	public int getFieldCount() { return 0; }
	@Override
	public void clear() { bulletStack = ItemStack.EMPTY; }
}
