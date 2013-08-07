package co.uk.flansmods.common;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
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

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteArrayDataOutput;

import co.uk.flansmods.api.IControllable;
import co.uk.flansmods.common.network.PacketRightClick;
import co.uk.flansmods.common.network.PacketSeatMount;
import co.uk.flansmods.common.network.PacketSeatUpdates;
import co.uk.flansmods.common.network.PacketVehicleKey;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;

public class EntityPassengerSeat extends Entity implements IControllable, IEntityAdditionalSpawnData
{
	private int driveableID;
	private EntityDriveable driveable;
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
	
	public float gunYaw;
	public float gunPitch;
	
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
		setDriveable(plane1);
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
		if(getDriveable() == null || getDriveable().isDead)
		{
			if(!worldObj.isRemote)
				setDead();
			return;
		}
		else
			updatePosition();
		
		if(gunDelay > 0)
			gunDelay--;
		if(soundDelay > 0)
			soundDelay--;
		//Decrement the reload timer and reload
		if(reloadTimer > 0)
			reloadTimer--;
		GunType type = getDriveable().superData.guns[1];
		if(type != null)
		{
			if(getDriveable().superData.ammo[1] != null && getDriveable().superData.ammo[1].getItemDamage() == getDriveable().superData.ammo[1].getMaxDamage())
			{
				getDriveable().superData.ammo[1] = null;
				//Scrap metal output?
			}
			if(getDriveable().superData.ammo == null && riddenByEntity != null && riddenByEntity instanceof EntityPlayer)
			{
				int slot = findAmmo(((EntityPlayer)riddenByEntity), type);
				if(slot >= 0)
				{
					getDriveable().superData.ammo[1] = ((EntityPlayer)riddenByEntity).inventory.getStackInSlot(slot);
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
		prevRotationYaw = getDriveable().prevRotationYaw;
		prevRotationPitch = getDriveable().prevRotationPitch;
		prevRotationRoll = getDriveable().prevRotationRoll;
		prevPosX = posX;
		prevPosY = posY;
		prevPosZ = posZ;
		setRotation(getDriveable().axes.getYaw(), getDriveable().axes.getPitch());
		rotationRoll = getDriveable().axes.getRoll();
		Vec3 posVec = getDriveable().rotate((double)seatX / 16D, (double)seatY / 16D, (double)seatZ / 16D).addVector(getDriveable().posX, getDriveable().posY, getDriveable().posZ);
		setPosition(posVec.xCoord, posVec.yCoord, posVec.zCoord);
        if(worldObj.isRemote && riddenByEntity != null)
        {
			Vec3 vec = getDriveable().rotate(0D, getMountedYOffset() + riddenByEntity.getYOffset() - 0.5D, 0D);
            riddenByEntity.setPosition(posX + vec.xCoord, posY + vec.yCoord, posZ + vec.zCoord);
        }
		//updateRiderPosition();
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
				getDriveable().useGun(gunnerID, player, this);
				return true;
			}
		}
		return getDriveable().attackEntityFrom(damagesource, i);
    }
	
    @Override
    public boolean attackEntityFrom(DamageSource damagesource, float i)
    {	
		return getDriveable().attackEntityFrom(damagesource, i);
    }
	
    @Override
    public void updateRiderPosition()
    {
        if(riddenByEntity == null)
        {
            return;
        } else if(riddenByEntity instanceof EntityLivingBase)
        {	
			Vec3 vec = getDriveable().rotate(0D, getMountedYOffset() + riddenByEntity.getYOffset() - 0.5D, 0D);
            riddenByEntity.setPosition(posX + vec.xCoord, posY + vec.yCoord, posZ + vec.zCoord);
        }
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
	public boolean func_130002_c(EntityPlayer player) //interact : change back when Forge updates
    {
		if(worldObj.isRemote)
		{
			PacketDispatcher.sendPacketToServer(PacketRightClick.buildClickPacket(this));
			return true;
		}
		if(worldObj.isRemote || isDead || getDriveable() == null || getDriveable().isDead)
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
			if(following != null && stack != null && stack.itemID == Item.wheat.itemID)
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
    	if(sit)
    	{
    		if(riddenByEntity != null)
    		{
    			//riddenByEntity.ridingEntity = null;
    			riddenByEntity.mountEntity(null);
    		}
    		//entity.ridingEntity = this;
    		//riddenByEntity = entity;
    		entity.mountEntity(this);
    	}
    	else
    	{
    		//riddenByEntity.ridingEntity = null;
    		//riddenByEntity = null;
    		riddenByEntity.mountEntity(null);
    	}
    	if(!worldObj.isRemote)
    	{
    		//PacketDispatcher.sendPacketToAllInDimension(PacketSeatUpdates.buildUpdatePacket(vehicle), dimension);
    		//PacketDispatcher.sendPacketToAllInDimension(PacketSeatMount.buildMountPacket(entity, this, sit), dimension);
    	}
    }
   
    
	@Override
    public boolean isEntityEqual(Entity entity)
    {
		for(EntityCollisionBox box : getDriveable().boxes)
		{
			if(entity == box)
				return true;
		}
		for(EntityPassengerSeat seat : getDriveable().seats)
		{
			if(entity == seat || entity == seat.riddenByEntity)
				return true;
		}
        return this == entity || getDriveable() == entity || getDriveable().riddenByEntity == entity;
    }

	@Override
	public void onMouseMoved(int deltaX, int deltaY) 
	{
		
	}

	@Override
	public boolean pressKey(int key, EntityPlayer player) 
	{		
		if(key == 6)
		{		
			if(FMLCommonHandler.instance().getEffectiveSide().isClient() && key == 6)
				PacketDispatcher.sendPacketToServer(PacketVehicleKey.buildKeyPacket(key));

			else
			{	
				riddenByEntity.mountEntity(null);
				//PacketDispatcher.sendPacketToAllInDimension(PacketSeatUpdates.buildUpdatePacket(vehicle), dimension);
				//PacketDispatcher.sendPacketToAllInDimension(PacketSeatMount.buildMountPacket(riddenByEntity, this, false), dimension);
			}
			return true;
		}
		return false;
	}

	@Override
	public void writeSpawnData(ByteArrayDataOutput data) 
	{
		if(getDriveable() == null)
			data.writeInt(0);
		else data.writeInt(getDriveable().entityId);
		data.writeInt(seatID);
		data.writeInt(seatX);
		data.writeInt(seatY);
		data.writeInt(seatZ);
		data.writeInt(gunnerID);
	}

	@Override
	public void readSpawnData(ByteArrayDataInput data) 
	{
		driveableID = data.readInt();
		getDriveable();
		seatID = data.readInt();
		seatX = data.readInt();
		seatY = data.readInt();
		seatZ = data.readInt();
		gunnerID = data.readInt();
	}

	public EntityDriveable getDriveable() 
	{
		if(driveable == null && worldObj.isRemote)
		{
			driveable = (EntityDriveable)worldObj.getEntityByID(driveableID);
			if(driveable != null)
				driveable.seats[seatID] = this;
		}
		return driveable;
	}

	public void setDriveable(EntityDriveable vehicle) 
	{
		driveable = vehicle;
	}
}
