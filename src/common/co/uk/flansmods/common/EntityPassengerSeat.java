package co.uk.flansmods.common;

import java.util.List;
import java.util.Random;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.DamageSource;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityAITaskEntry;
import net.minecraft.src.EntityAITasks;
import net.minecraft.src.EntityAITempt;
import net.minecraft.src.EntityDamageSource;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EntityTameable;
import net.minecraft.src.EnumGameType;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.Vec3;
import net.minecraft.src.World;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import cpw.mods.fml.client.FMLClientHandler;

public class EntityPassengerSeat extends Entity
{
    public EntityPassengerSeat(World world)
    {
        super(world);
        setSize(1.0F, 1.0F);
		preventEntitySpawning = true;
        yOffset = 0;
    }
	
	public EntityPassengerSeat(World world, EntityDriveable plane1, int seat, int x, int y, int z, int guns)
	{
		this(world);
		plane = plane1;
		seatID = seat;
		seatX = x;
		seatY = y;
		seatZ = z;
		gunnerID = guns;
		updatePosition();
	}
	
	public void onUpdate()
	{
		super.onUpdate();
		if(plane == null || plane.isDead)
			setDead();
		else
			updatePosition();
		
		/*
		if(riddenByEntity == FMLClientHandler.instance().getClient().thePlayer && Keyboard.isKeyDown(FlansMod.exitKey))
			riddenByEntity.mountEntity(this);
			*/
		
		if(gunDelay > 0)
			gunDelay--;
		if(soundDelay > 0)
			soundDelay--;
		//Decrement the reload timer and reload
		if(reloadTimer > 0)
			reloadTimer--;
		GunType type = plane.superData.guns[1];
		if(type != null)
		{
			if(plane.superData.ammo[1] != null && plane.superData.ammo[1].getItemDamage() == plane.superData.ammo[1].getMaxDamage())
			{
				plane.superData.ammo[1] = null;
				//Scrap metal output?
			}
			if(plane.superData.ammo == null && riddenByEntity != null && riddenByEntity instanceof EntityPlayer)
			{
				int slot = findAmmo(((EntityPlayer)riddenByEntity), type);
				if(slot >= 0)
				{
					plane.superData.ammo[1] = ((EntityPlayer)riddenByEntity).inventory.getStackInSlot(slot);
					if(worldObj.getWorldInfo().getGameType() != EnumGameType.CREATIVE)
						((EntityPlayer)riddenByEntity).inventory.setInventorySlotContents(slot, null);
					reloadTimer = type.reloadTime;
					worldObj.playSoundAtEntity(this, type.reloadSound, 1.0F, 1.0F / (rand.nextFloat() * 0.4F + 0.8F));
				}
			}
			// TODO FIX THIS EVENTUALLY
			if(riddenByEntity != null && riddenByEntity == FMLClientHandler.instance().getClient().thePlayer && type.mode == 1 && Mouse.isButtonDown(0))
			{
				//Check for plane.data.ammo / reloading
				if(plane.superData.ammo == null || reloadTimer > 0 || FlansMod.shootTime > 0)
				{
					return;
				}
				//Fire
				BulletType bullet = BulletType.getBullet(plane.superData.ammo[1].itemID);
				if(worldObj.getWorldInfo().getGameType() != EnumGameType.CREATIVE)
					plane.superData.ammo[1].damageItem(1, ((EntityPlayer)riddenByEntity));
				FlansMod.shootTime = type.shootDelay;
				if(!worldObj.isRemote)
				{
					//worldObj.spawnEntityInWorld(new EntityBullet(worldObj, Vec3D.createVectorHelper(blockX + 0.5D, blockY + type.pivotHeight, blockZ + 0.5D), (direction * 90F + rotationYaw), rotationPitch, riddenByEntity, type.accuracy, type.damage, bullet));
					worldObj.playSoundAtEntity(this, type.shootSound, 1.0F, 1.0F / (rand.nextFloat() * 0.4F + 0.8F));
				}
			}
		}
	}
	
	public int findAmmo(EntityPlayer player, GunType type)
	{
		for(int i = 0; i < player.inventory.getSizeInventory(); i++)
		{
			ItemStack stack = player.inventory.getStackInSlot(i);
			if(type.isAmmo(stack))
			{
				return i;
			}
		}
		return -1;
	}
	
	private void updatePosition()
	{
		prevRotationYaw = plane.prevRotationYaw;
		prevRotationPitch = plane.prevRotationPitch;
		prevRotationRoll = plane.prevRotationRoll;
		prevPosX = posX;
		prevPosY = posY;
		prevPosZ = posZ;
		setRotation(plane.axes.getYaw(), plane.axes.getPitch());
		rotationRoll = plane.axes.getRoll();
		Vec3 posVec = plane.rotate((double)seatX / 16D, (double)seatY / 16D, (double)seatZ / 16D).addVector(plane.posX, plane.posY, plane.posZ);
		setPosition(posVec.xCoord, posVec.yCoord, posVec.zCoord);
	}
	
	public double getMountedYOffset()
	{
		if(gunnerID > 0)
			return (double)height * 0.25D;
		return (double)height * 0.75D;
	}

    protected boolean canTriggerWalking()
    {
        return false;
    }

    protected void entityInit()
    {
    }

    public AxisAlignedBB getCollisionBox(Entity entity)
    {
        return entity.boundingBox;
    }

    public AxisAlignedBB getBoundingBox()
    {
        return boundingBox;
    }

    public boolean canBePushed()
    {
        return true;
    }
	
    public boolean canBeCollidedWith()
    {
        return !isDead;
    }
	
	public float getShadowSize()
    {
        return 0.0F;
    }
	
    public boolean attackEntityFrom1(DamageSource damagesource, int i)
    {
		if(damagesource.damageType.equals("player"))
		{
			EntityPlayer player = (EntityPlayer)((EntityDamageSource)damagesource).getEntity();
			if(player == riddenByEntity)
			{
				if(reloadTimer > 0)
					return true;
				plane.useGun(gunnerID, player, this);
				return true;
			}
		}
		return plane.attackEntityFrom(damagesource, i);
    }
	
    public boolean attackEntityFrom(DamageSource damagesource, int i)
    {	
		return plane.attackEntityFrom(damagesource, i);
    }
	
    public void updateRiderPosition()
    {
        if(riddenByEntity == null)
        {
            return;
        } else if(riddenByEntity instanceof EntityLiving)
        {	
			Vec3 vec = plane.rotate(0D, getMountedYOffset() + riddenByEntity.getYOffset() - 0.5D, 0D);
            riddenByEntity.setPosition(posX + vec.xCoord, posY + vec.yCoord, posZ + vec.zCoord);

			riddenByEntity.rotationYaw -= 2F * (rotationYaw - prevRotationYaw);
			return;
        }
		else { return; }
    }

    protected void writeEntityToNBT(NBTTagCompound nbttagcompound)
    {
    }

    protected void readEntityFromNBT(NBTTagCompound nbttagcompound)
    {
    }

	public boolean interact(EntityPlayer player)
    {
		if(worldObj.isRemote || isDead || plane == null || plane.isDead)
			return true;
		ItemStack stack = player.inventory.getCurrentItem();
		Entity following = null;
		List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.expand(10D, 10D, 10D));
		try
		{
			if(list != null && list.size() > 0)
			{
				for(int i = 0; i < list.size(); i++)
				{
					Entity entity = (Entity)list.get(i);
					if(entity instanceof EntityLiving)
					{
						for(Object obj : (List)ModLoader.getPrivateValue(EntityAITasks.class, ((EntityLiving)entity).tasks, 1))
						{
							EntityAITaskEntry task = (EntityAITaskEntry)obj;
							if(task.action instanceof EntityAITempt)
							{
								if((EntityPlayer)ModLoader.getPrivateValue(EntityAITempt.class, (EntityAITempt)task.action, 7) == player)
									following = entity;
							}
						}
					}
					if(entity instanceof EntityTameable && ((EntityTameable)entity).isTamed() && ((EntityTameable)entity).getOwnerName().equals(player.username) && !((EntityTameable)entity).isSitting())
					{
						following = entity;
					}
				}
			}
		}
		catch(Exception e)
		{
			FlansMod.log("Error occured while checking entity tasks");
			e.printStackTrace();
		}
		if(player == riddenByEntity)
		{
			player.mountEntity(this);
			return true;
		}
		if(riddenByEntity != null && riddenByEntity != player)
		{
			riddenByEntity.mountEntity(this);
			return true;
		}
		if(riddenByEntity == null)
		{
			//Holding wheat, put following mob into seat
			if(following != null && stack != null && stack.itemID == Item.wheat.shiftedIndex)
			{
				following.mountEntity(this);
				return true;
			}
			//Otherwise, get in seat
			player.mountEntity(this);
			return true;
		}
        return true;
    }
		
	public EntityDriveable plane;
	public int seatID;
	public int seatX;
	public int seatY;
	public int seatZ;
	public int gunnerID;
	
	public int gunDelay;
	public int soundDelay;
	public int reloadTimer;
	
	public float rotationRoll;
	public float prevRotationRoll;
}
