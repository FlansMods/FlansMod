package co.uk.flansmods.common;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAITaskEntry;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import org.lwjgl.input.Mouse;

import co.uk.flansmods.common.network.PacketRightClick;
import co.uk.flansmods.common.network.PacketSeatMount;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.common.network.PacketDispatcher;

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
		vehicle = plane1;
		seatID = seat;
		seatX = x;
		seatY = y;
		seatZ = z;
		gunnerID = guns;
		updatePosition();
	}
	
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		if(vehicle == null || vehicle.isDead)
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
		GunType type = vehicle.superData.guns[1];
		if(type != null)
		{
			if(vehicle.superData.ammo[1] != null && vehicle.superData.ammo[1].getItemDamage() == vehicle.superData.ammo[1].getMaxDamage())
			{
				vehicle.superData.ammo[1] = null;
				//Scrap metal output?
			}
			if(vehicle.superData.ammo == null && riddenByEntity != null && riddenByEntity instanceof EntityPlayer)
			{
				int slot = findAmmo(((EntityPlayer)riddenByEntity), type);
				if(slot >= 0)
				{
					vehicle.superData.ammo[1] = ((EntityPlayer)riddenByEntity).inventory.getStackInSlot(slot);
					if(!((EntityPlayer)riddenByEntity).capabilities.isCreativeMode)
						((EntityPlayer)riddenByEntity).inventory.setInventorySlotContents(slot, null);
					reloadTimer = type.reloadTime;
					worldObj.playSoundAtEntity(this, type.reloadSound, 1.0F, 1.0F / (rand.nextFloat() * 0.4F + 0.8F));
				}
			}
			// TODO FIX THIS EVENTUALLY
			/*if(riddenByEntity != null && riddenByEntity == FMLClientHandler.instance().getClient().thePlayer && type.mode == 1 && Mouse.isButtonDown(0))
			{
				//Check for plane.data.ammo / reloading
				if(vehicle.superData.ammo == null || reloadTimer > 0 || FlansMod.shootTime > 0)
				{
					return;
				}
				//Fire
				BulletType bullet = BulletType.getBullet(vehicle.superData.ammo[1].itemID);
				if(worldObj.getWorldInfo().getGameType() != EnumGameType.CREATIVE)
					vehicle.superData.ammo[1].damageItem(1, ((EntityPlayer)riddenByEntity));
				FlansMod.shootTime = type.shootDelay;
				if(!worldObj.isRemote)
				{
					//worldObj.spawnEntityInWorld(new EntityBullet(worldObj, Vec3D.createVectorHelper(blockX + 0.5D, blockY + type.pivotHeight, blockZ + 0.5D), (direction * 90F + rotationYaw), rotationPitch, riddenByEntity, type.accuracy, type.damage, bullet));
					worldObj.playSoundAtEntity(this, type.shootSound, 1.0F, 1.0F / (rand.nextFloat() * 0.4F + 0.8F));
				}
			}*/
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
		prevRotationYaw = vehicle.prevRotationYaw;
		prevRotationPitch = vehicle.prevRotationPitch;
		prevRotationRoll = vehicle.prevRotationRoll;
		prevPosX = posX;
		prevPosY = posY;
		prevPosZ = posZ;
		setRotation(vehicle.axes.getYaw(), vehicle.axes.getPitch());
		rotationRoll = vehicle.axes.getRoll();
		Vec3 posVec = vehicle.rotate((double)seatX / 16D, (double)seatY / 16D, (double)seatZ / 16D).addVector(vehicle.posX, vehicle.posY, vehicle.posZ);
		setPosition(posVec.xCoord, posVec.yCoord, posVec.zCoord);
	}
	
	public double getMountedYOffset()
	{
		if(gunnerID > 0)
			return (double)height * 0.25D;
		return (double)height * 0.75D;
	}

	@Override
    protected boolean canTriggerWalking()
    {
        return false;
    }

	@Override
    protected void entityInit()
    {
    }

	@Override
    public AxisAlignedBB getCollisionBox(Entity entity)
    {
        return entity.boundingBox;
    }

	@Override
    public AxisAlignedBB getBoundingBox()
    {
        return boundingBox;
    }

	@Override
    public boolean canBePushed()
    {
        return true;
    }
	
	@Override
    public boolean canBeCollidedWith()
    {
        return !isDead;
    }
	
	@Override
	public float getShadowSize()
    {
        return 0.0F;
    }
	
	// Flan is this meant to go in attackEntityFrom(DamageSource damagesource, int i). 
    public boolean attackEntityFrom1(DamageSource damagesource, int i)
    {
		if(damagesource.damageType.equals("player"))
		{
			EntityPlayer player = (EntityPlayer)((EntityDamageSource)damagesource).getEntity();
			if(player == riddenByEntity)
			{
				if(reloadTimer > 0)
					return true;
				vehicle.useGun(gunnerID, player, this);
				return true;
			}
		}
		return vehicle.attackEntityFrom(damagesource, i);
    }
	
    @Override
    public boolean attackEntityFrom(DamageSource damagesource, int i)
    {	
		return vehicle.attackEntityFrom(damagesource, i);
    }
	
    @Override
    public void updateRiderPosition()
    {
        if(riddenByEntity == null)
        {
            return;
        } else if(riddenByEntity instanceof EntityLiving)
        {	
			Vec3 vec = vehicle.rotate(0D, getMountedYOffset() + riddenByEntity.getYOffset() - 0.5D, 0D);
            riddenByEntity.setPosition(posX + vec.xCoord, posY + vec.yCoord, posZ + vec.zCoord);

			riddenByEntity.rotationYaw -= 2F * (rotationYaw - prevRotationYaw);
			return;
        }
		else { return; }
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound nbttagcompound)
    {
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound nbttagcompound)
    {
    }

    @Override
	public boolean interact(EntityPlayer player)
    {
		if(worldObj.isRemote)
		{
			PacketDispatcher.sendPacketToServer(PacketRightClick.buildClickPacket(this));
			return true;
		}
		if(worldObj.isRemote || isDead || vehicle == null || vehicle.isDead)
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
						for(Object obj : (List)ObfuscationReflectionHelper.getPrivateValue(EntityAITasks.class, ((EntityLiving)entity).tasks, 1))
						{
							EntityAITaskEntry task = (EntityAITaskEntry)obj;
							if(task.action instanceof EntityAITempt)
							{
								if((EntityPlayer)ObfuscationReflectionHelper.getPrivateValue(EntityAITempt.class, (EntityAITempt)task.action, 7) == player)
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
			sitInSeat(player, false);
			return true;
		}
		if(riddenByEntity != null && riddenByEntity != player && !(riddenByEntity instanceof EntityPlayer))
		{
			sitInSeat(riddenByEntity, false);
			return true;
		}
		if(riddenByEntity == null)
		{
			//Holding wheat, put following mob into seat
			if(following != null && stack != null && stack.itemID == Item.wheat.shiftedIndex)
			{
				sitInSeat(following, true);
				return true;
			}
			//Otherwise, get in seat
			sitInSeat(player, true);
			return true;
		}
        return true;
    }
    
    public void sitInSeat(Entity entity, boolean sit)
    {
    	if(!worldObj.isRemote)
    	{
    		PacketDispatcher.sendPacketToAllInDimension(PacketSeatMount.buildMountPacket(entity, this, sit), dimension);
    	}
    	if(sit)
    	{
    		if(riddenByEntity != null)
    			riddenByEntity.mountEntity(this);
    		entity.ridingEntity = this;
    		riddenByEntity = entity;
    	}
    	else
    	{
    		entity.ridingEntity = null;
    		riddenByEntity = null;
    	}
    }
    
	@Override
    public boolean isEntityEqual(Entity entity)
    {
		for(EntityCollisionBox box : vehicle.boxes)
		{
			if(entity == box)
				return true;
		}
		for(EntityPassengerSeat seat : vehicle.seats)
		{
			if(entity == seat || entity == seat.riddenByEntity)
				return true;
		}
        return this == entity || vehicle == entity || vehicle.riddenByEntity == entity;
    }
    
	public EntityDriveable vehicle;
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
