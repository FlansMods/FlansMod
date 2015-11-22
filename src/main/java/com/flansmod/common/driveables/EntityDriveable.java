package com.flansmod.common.driveables;

import java.util.ArrayList;

import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import cofh.api.energy.IEnergyContainerItem;

import com.flansmod.api.IControllable;
import com.flansmod.api.IExplodeable;
import com.flansmod.client.EntityCamera;
import com.flansmod.client.FlansModClient;
import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.common.FlansMod;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EntityShootable;
import com.flansmod.common.guns.EnumFireMode;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.InventoryHelper;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemShootable;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.guns.raytracing.BulletHit;
import com.flansmod.common.guns.raytracing.DriveableHit;
import com.flansmod.common.network.PacketDriveableDamage;
import com.flansmod.common.network.PacketDriveableKeyHeld;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.vector.Vector3f;

public abstract class EntityDriveable extends Entity implements IControllable, IExplodeable, IEntityAdditionalSpawnData
{
	public boolean syncFromServer = true;
	/** Ticks since last server update. Use to smoothly transition to new position */
	public int serverPositionTransitionTicker;
	/** Server side position, as synced by PacketVehicleControl packets */
    public double serverPosX, serverPosY, serverPosZ;
	/** Server side rotation, as synced by PacketVehicleControl packets */
    public double serverYaw, serverPitch, serverRoll;
	
	/** The driveable data which contains the inventory, the engine and the fuel */
	public DriveableData driveableData;
	/** The shortName of the driveable type, used to obtain said type */
	public String driveableType;
	
	/** The throttle, in the range -1, 1 is multiplied by the maxThrottle (or maxNegativeThrottle) from the plane type to obtain the thrust */
	public float throttle;
    /** The wheels on this plane */
	public EntityWheel[] wheels;
	
	public boolean fuelling;
	/** Extra prevRoation field for smoothness in all 3 rotational axes */
	public float prevRotationRoll;
	/** Angular velocity */
	public Vector3f angularVelocity = new Vector3f(0F, 0F, 0F);
	
	/** Whether each mouse button is held */
	public boolean leftMouseHeld = false, rightMouseHeld = false;
	
	/** Shoot delay variables */
	public int shootDelayPrimary, shootDelaySecondary;
	/** Minigun speed variables */
	public float minigunSpeedPrimary, minigunSpeedSecondary;
	/** Current gun variables for alternating weapons. */
	public int currentGunPrimary, currentGunSecondary;
	
    /** Angle of harvester aesthetic piece */
	public float harvesterAngle;
	
	public RotatedAxes prevAxes;
	public RotatedAxes axes;
	
	public EntitySeat[] seats;
	
    /** The ID of the slot that we are pulling fuel from. -1 means we have not found one */
    private int foundFuel = -1;
    /** True if we need fuel but could not find any in the inventory. Reset when the inventory updated */
    public boolean couldNotFindFuel = false;
	
	@SideOnly(Side.CLIENT)
	public EntityLivingBase camera;
	
    public EntityDriveable(World world)
    {
        super(world);
		axes = new RotatedAxes();
		prevAxes = new RotatedAxes();
        preventEntitySpawning = true;
        setSize(1F, 1F);
        yOffset = 6F / 16F;
		ignoreFrustumCheck = true;
		renderDistanceWeight = 200D;
    }
	
	public EntityDriveable(World world, DriveableType t, DriveableData d)
	{
		this(world);
		driveableType = t.shortName;
		driveableData = d;
	}
	
	protected void initType(DriveableType type, boolean clientSide)
	{
		seats = new EntitySeat[type.numPassengers + 1];
		for(int i = 0; i < type.numPassengers + 1; i++)
		{
			if(!clientSide)
			{
				seats[i] = new EntitySeat(worldObj, this, i);
				worldObj.spawnEntityInWorld(seats[i]);
			}
		}
		wheels = new EntityWheel[type.wheelPositions.length];
		for(int i = 0; i < wheels.length; i++)
		{
			if(!clientSide)
			{
				wheels[i] = new EntityWheel(worldObj, this, i);
				worldObj.spawnEntityInWorld(wheels[i]);
			}
		}
		stepHeight = type.wheelStepHeight;
		yOffset = type.yOffset;
		
		//Register Plane to Radar on Spawning
		//if(type.onRadar == true)
		//	RadarRegistry.register(this);
	}
	
	@Override
    protected void writeEntityToNBT(NBTTagCompound tag)
    {
		driveableData.writeToNBT(tag);
		tag.setString("Type", driveableType);
		tag.setFloat("RotationYaw", axes.getYaw());
		tag.setFloat("RotationPitch", axes.getPitch());
		tag.setFloat("RotationRoll", axes.getRoll());
    }

	@Override
    protected void readEntityFromNBT(NBTTagCompound tag)
    {
		driveableType = tag.getString("Type");
		driveableData = new DriveableData(tag);
		initType(DriveableType.getDriveable(driveableType), false);
		
		prevRotationYaw = tag.getFloat("RotationYaw");
		prevRotationPitch = tag.getFloat("RotationPitch");
		prevRotationRoll = tag.getFloat("RotationRoll");
		axes = new RotatedAxes(prevRotationYaw, prevRotationPitch, prevRotationRoll);
    }
	
	@Override
	public void writeSpawnData(ByteBuf data)
	{
		ByteBufUtils.writeUTF8String(data, driveableType);
		
		NBTTagCompound tag = new NBTTagCompound();
		driveableData.writeToNBT(tag);
		ByteBufUtils.writeTag(data, tag);
		
		data.writeFloat(axes.getYaw());
		data.writeFloat(axes.getPitch());
		data.writeFloat(axes.getRoll());
		
		//Write damage
    	for(EnumDriveablePart ep : EnumDriveablePart.values())
    	{
    		DriveablePart part = getDriveableData().parts.get(ep);
    		data.writeShort((short)part.health);
    		data.writeBoolean(part.onFire);
    	}
	}

	@Override
	public void readSpawnData(ByteBuf data)
	{
		try
		{
			driveableType = ByteBufUtils.readUTF8String(data);
			driveableData = new DriveableData(ByteBufUtils.readTag(data));
			initType(getDriveableType(), true);
			
			axes.setAngles(data.readFloat(), data.readFloat(), data.readFloat());
			prevRotationYaw = axes.getYaw();
			prevRotationPitch = axes.getPitch();
			prevRotationRoll = axes.getRoll();
			
			//Read damage
        	for(EnumDriveablePart ep : EnumDriveablePart.values())
        	{
        		DriveablePart part = getDriveableData().parts.get(ep);
        		part.health = data.readShort();
        		part.onFire = data.readBoolean();
        	}

		}
		catch(Exception e)
		{
			FlansMod.log("Failed to retreive plane type from server.");
			super.setDead();
			e.printStackTrace();
		}
		
		camera = new EntityCamera(worldObj, this);
		worldObj.spawnEntityInWorld(camera);
	}
	/**
	 * Called with the movement of the mouse. Used in controlling vehicles if need be.
	 * @param deltaY 
	 * @param deltaX 
	 * @return if mouse movement was handled.
	 */
	@Override
	public abstract void onMouseMoved(int deltaX, int deltaY);
	
	@Override
	@SideOnly(Side.CLIENT)
	public EntityLivingBase getCamera()
	{
		return camera;
	}

	protected boolean canSit(int seat)
	{
		return getDriveableType().numPassengers >= seat && seats[seat].riddenByEntity == null;
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
        return null;//entity.boundingBox;
    }

	@Override
    public AxisAlignedBB getBoundingBox()
    {
        return boundingBox;
    }

	@Override
    public boolean canBePushed()
    {
        return false;
    }

	@Override
    public double getMountedYOffset()
    {
        return -0.3D;
    }
	
	@Override
	/** Pass generic damage to the core */
	public boolean attackEntityFrom(DamageSource damagesource, float i) {
		return worldObj.isRemote || isDead || attackPart(EnumDriveablePart.core, damagesource, i);
	}
	
	@Override
	public void setDead()
	{
		super.setDead();
		
		//Unregister to Radar
		//RadarRegistry.unregister(this);
		if(worldObj.isRemote)
			camera.setDead();
		
		for(EntitySeat seat : seats)
			if(seat != null)
				seat.setDead();
	}
	
	@Override
	public void onCollideWithPlayer(EntityPlayer par1EntityPlayer) 
	{
		//Do nothing. Like a boss.
		// TODO: perhaps send the player flying??
		//Sounds good. ^ 
	}

	@Override
    public boolean canBeCollidedWith()
    {
        return !isDead;
    }
	
    @Override
    public void applyEntityCollision(Entity entity)
    {
    	if(!isPartOfThis(entity))
    		super.applyEntityCollision(entity);
    }
	
	@Override
    public void setPositionAndRotation2(double d, double d1, double d2, float f, float f1, int i)
    {
		if(ticksExisted > 1)
			return;
		if(riddenByEntity instanceof EntityPlayer && FlansMod.proxy.isThePlayer((EntityPlayer)riddenByEntity))
		{
		}
		else
		{				
			if(syncFromServer)
	        {
	            serverPositionTransitionTicker = i + 5;
	        }
	        else
	        {
	            double var10 = d - posX;
	            double var12 = d1 - posY;
	            double var14 = d2 - posZ;
	            double var16 = var10 * var10 + var12 * var12 + var14 * var14;
	
	            if (var16 <= 1.0D)
	            {
	                return;
	            }
	
	            serverPositionTransitionTicker = 3;
	        }
	        serverPosX = d;
	        serverPosY = d1;
	        serverPosZ = d2;
	        serverYaw = f;
	        serverPitch = f1;
		}
    }
	
	public void setPositionRotationAndMotion(double x, double y, double z, float yaw, float pitch, float roll, double motX, double motY, double motZ, float velYaw, float velPitch, float velRoll, float throt, float steeringYaw)
	{
		if(worldObj.isRemote)
		{
	        serverPosX = x;
	        serverPosY = y;
	        serverPosZ = z;
	        serverYaw = yaw;
	        serverPitch = pitch;
	        serverRoll = roll;
	        serverPositionTransitionTicker = 5;
		}
		else
		{
			setPosition(x, y, z);
			prevRotationYaw = yaw;
			prevRotationPitch = pitch;
			prevRotationRoll = roll;
			setRotation(yaw, pitch, roll);
		}
		//Set the motions regardless of side.
        motionX = motX;
        motionY = motY;
        motionZ = motZ;
        angularVelocity = new Vector3f(velYaw, velPitch, velRoll);
        throttle = throt;
	}
	

	@Override
    public void setVelocity(double d, double d1, double d2)
    {
        motionX = d;
        motionY = d1;
        motionZ = d2;
    }
	
	@Override
	public boolean pressKey(int key, EntityPlayer player)
	{
		if(!worldObj.isRemote && key == 9 && getDriveableType().modePrimary == EnumFireMode.SEMIAUTO) //Primary
		{
			shoot(false);
			return true;
		}
		else if(!worldObj.isRemote && key == 8 && getDriveableType().modeSecondary == EnumFireMode.SEMIAUTO) //Secondary
		{
			shoot(true);
			return true;
		}
		return false;
	}
	
	@Override
	public void updateKeyHeldState(int key, boolean held)
	{
		if(worldObj.isRemote)
		{
			FlansMod.getPacketHandler().sendToServer(new PacketDriveableKeyHeld(key, held));
		}
		switch(key)
		{
		case 9 : leftMouseHeld = held; break;
		case 8 : rightMouseHeld = held; break;
		}
	}
	
	/** Shoot method called by pressing / holding shoot buttons */
	public void shoot(boolean secondary)
	{
		DriveableType type = getDriveableType();
		if(seats[0] == null && !(seats[0].riddenByEntity instanceof EntityLivingBase))
			return;
		//Check shoot delay
		if(getShootDelay(secondary) <= 0)
		{
			//We can shoot, so grab the available shoot points and the weaponType
			ArrayList<DriveablePosition> shootPoints = type.shootPoints(secondary);
			EnumWeaponType weaponType = type.weaponType(secondary);
			//If there are no shoot points, return
			if(shootPoints.size() == 0)
				return;
			//For alternating guns, move on to the next one
			int currentGun = getCurrentGun(secondary);
			if(type.alternate(secondary))
			{
				currentGun = (currentGun + 1) % shootPoints.size();
				setCurrentGun(currentGun, secondary);
				shootEach(type, shootPoints.get(currentGun), currentGun, secondary, weaponType);
			}
			else for(int i = 0; i < shootPoints.size(); i++)
				shootEach(type, shootPoints.get(i), i, secondary, weaponType);
		}
	}
	
	private void shootEach(DriveableType type, DriveablePosition shootPoint, int currentGun, boolean secondary, EnumWeaponType weaponType)
	{
		//Rotate the gun vector to global axes
		Vector3f gunVec = getOrigin(shootPoint);
		Vector3f lookVector = getLookVector(shootPoint);
		
		//If its a pilot gun, then it is using a gun type, so do the following
		if(shootPoint instanceof PilotGun)
		{
			PilotGun pilotGun = (PilotGun)shootPoint;
			//Get the gun from the plane type and the ammo from the data
			GunType gunType = pilotGun.type;
			ItemStack bulletItemStack = driveableData.ammo[getDriveableType().numPassengerGunners + currentGun];
			//Check that neither is null and that the bullet item is actually a bullet
			if(gunType != null && bulletItemStack != null && bulletItemStack.getItem() instanceof ItemShootable && TeamsManager.bulletsEnabled)
			{
				ShootableType bullet = ((ItemShootable)bulletItemStack.getItem()).type;
				if(gunType.isAmmo(bullet))
				{
					//Spawn a new bullet item
					worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(gunVec, new Vector3f((float)posX, (float)posY, (float)posZ), null), lookVector, (EntityLivingBase)seats[0].riddenByEntity, gunType.bulletSpread / 2, gunType.damage, 10.0F,bulletItemStack.getItemDamage(), type));
					//Play the shoot sound
					PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.shootSound(secondary), false);
					//Get the bullet item damage and increment it
					int damage = bulletItemStack.getItemDamage();
					bulletItemStack.setItemDamage(damage + 1);	
					//If the bullet item is completely damaged (empty)
					if(damage + 1 == bulletItemStack.getMaxDamage())
					{
						//Set the damage to 0 and consume one ammo item (unless in creative)
						bulletItemStack.setItemDamage(0);
						if(seats[0].riddenByEntity instanceof EntityPlayer && !((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode)
						{
							bulletItemStack.stackSize--;
							if(bulletItemStack.stackSize <= 0)
								bulletItemStack = null;
							driveableData.setInventorySlotContents(getDriveableType().numPassengerGunners + currentGun, bulletItemStack);
						}
					}
					//Reset the shoot delay
					setShootDelay(type.shootDelay(secondary), secondary);
				}
			}
		}
		else //One of the other modes
		{
			
			
			switch(weaponType)
			{		
			case BOMB :
			{
				if(TeamsManager.bombsEnabled)
				{
					int slot = -1;
					for(int i = driveableData.getBombInventoryStart(); i < driveableData.getBombInventoryStart() + type.numBombSlots; i++)
					{
						ItemStack bomb = driveableData.getStackInSlot(i);
						if(bomb != null && bomb.getItem() instanceof ItemBullet && type.isValidAmmo(((ItemBullet)bomb.getItem()).type, weaponType))
						{
							slot = i;
						}
					}
					
					if(slot != -1)
					{
						int spread = 0;
						int damageMultiplier = 1;
						float shellSpeed = 0F;

						ItemStack bulletStack = driveableData.getStackInSlot(slot);
						ItemBullet bulletItem = (ItemBullet)bulletStack.getItem();
						EntityShootable bulletEntity = bulletItem.getEntity(worldObj, Vec3.createVectorHelper(posX + gunVec.x, posY + gunVec.y, posZ + gunVec.z), axes.getYaw(), axes.getPitch(), motionX, motionY, motionZ, (EntityLivingBase)seats[0].riddenByEntity, damageMultiplier, driveableData.getStackInSlot(slot).getItemDamage(), type);
						worldObj.spawnEntityInWorld(bulletEntity);
						
						if(type.shootSound(secondary) != null)
							PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.shootSound(secondary), false);					
						if(seats[0].riddenByEntity instanceof EntityPlayer && !((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode)
						{
							bulletStack.setItemDamage(bulletStack.getItemDamage() + 1);
							if(bulletStack.getItemDamage() == bulletStack.getMaxDamage())
							{
								bulletStack.setItemDamage(0);
								bulletStack.stackSize--;
								if(bulletStack.stackSize == 0)
									bulletStack = null;
							}
							driveableData.setInventorySlotContents(slot, bulletStack);
						}
						setShootDelay(type.shootDelay(secondary), secondary);
					}
				}
				break;
			}		
			case MISSILE : //These two are actually almost identical
			case SHELL :
			{
				if(TeamsManager.shellsEnabled)
				{
					int slot = -1;
					for(int i = driveableData.getMissileInventoryStart(); i < driveableData.getMissileInventoryStart() + type.numMissileSlots; i++)
					{
						ItemStack shell = driveableData.getStackInSlot(i);
						if(shell != null && shell.getItem() instanceof ItemBullet && type.isValidAmmo(((ItemBullet)shell.getItem()).type, weaponType))
						{
							slot = i;
						}
					}
					
					if(slot != -1)
					{
						int spread = 0;
						int damageMultiplier = 1;
						float shellSpeed = 3F;

						ItemStack bulletStack = driveableData.getStackInSlot(slot);
						ItemBullet bulletItem = (ItemBullet)bulletStack.getItem();
						EntityShootable bulletEntity = bulletItem.getEntity(worldObj, Vector3f.add(new Vector3f(posX, posY, posZ), gunVec, null), lookVector, (EntityLivingBase)seats[0].riddenByEntity, spread, damageMultiplier, shellSpeed, driveableData.getStackInSlot(slot).getItemDamage(), type);
						worldObj.spawnEntityInWorld(bulletEntity);
						
						if(type.shootSound(secondary) != null)
							PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.shootSound(secondary), false);					
						if(seats[0].riddenByEntity instanceof EntityPlayer && !((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode)
						{
							bulletStack.setItemDamage(bulletStack.getItemDamage() + 1);
							if(bulletStack.getItemDamage() == bulletStack.getMaxDamage())
							{
								bulletStack.setItemDamage(0);
								bulletStack.stackSize--;
								if(bulletStack.stackSize == 0)
									bulletStack = null;
							}
							driveableData.setInventorySlotContents(slot, bulletStack);
						}
						setShootDelay(type.shootDelay(secondary), secondary);
					}
				}
				break;
			}				
			case GUN: //Handled above
				break;
			case MINE:
				break;
			case NONE:
				break;
			}
		}
	}
	
	public Vector3f getOrigin(DriveablePosition dp)
	{
		//Rotate the gun vector to global axes
		Vector3f localGunVec = new Vector3f(dp.position);
				
		if(dp.part == EnumDriveablePart.turret)
		{
			//Untranslate by the turret origin, to get the rotation about the right point
			Vector3f.sub(localGunVec, getDriveableType().turretOrigin, localGunVec);
			//Rotate by the turret angles
			localGunVec = seats[0].looking.findLocalVectorGlobally(localGunVec);
			//Translate by the turret origin
			Vector3f.add(localGunVec, getDriveableType().turretOrigin, localGunVec);
		}
		
		return rotate(localGunVec);
	}
	
	public Vector3f getLookVector(DriveablePosition dp)
	{
		return axes.getXAxis();
	}
		
	@Override
    public void onUpdate()
    {
        super.onUpdate();
        
        DriveableType type = getDriveableType();
        DriveableData data = getDriveableData();
        
        if(!worldObj.isRemote)
        {
        	for(int i = 0; i < getDriveableType().numPassengers + 1; i++)
        	{
        		if(seats[i] == null || !seats[i].addedToChunk)
        		{
        			seats[i] = new EntitySeat(worldObj, this, i);
    				worldObj.spawnEntityInWorld(seats[i]);
        		}
        	}
        	for(int i = 0; i < type.wheelPositions.length; i++)
        	{
        		if(wheels[i] == null || !wheels[i].addedToChunk)
        		{
        			wheels[i] = new EntityWheel(worldObj, this, i);
    				worldObj.spawnEntityInWorld(wheels[i]);
        		}
        	}
        }

		boolean driverIsCreative = seats != null && seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode;
		
		//Harvest stuff
		//Aesthetics
		if(hasEnoughFuel())
		{
			harvesterAngle += throttle / 5F;	
		}
		//Actual harvesting
		if(type.harvestBlocks && type.health.get(EnumDriveablePart.harvester) != null)
		{
			CollisionBox box = type.health.get(EnumDriveablePart.harvester);
			for(float x = box.x; x <= box.x + box.w; x++)
			{
				for(float y = box.y; y <= box.y + box.h; y++)
				{
					for(float z = box.z; z <= box.z + box.d; z++)
					{
						Vector3f v = axes.findLocalVectorGlobally(new Vector3f(x, y, z));
						
						int blockX = (int)Math.round(posX + v.x);
						int blockY = (int)Math.round(posY + v.y);
						int blockZ = (int)Math.round(posZ + v.z);
						Block block = worldObj.getBlock(blockX, blockY, blockZ);
						
						if(type.materialsHarvested.contains(block.getMaterial()) && block.getBlockHardness(worldObj, blockX, blockY, blockZ) >= 0F)
						{
							//Add the itemstack to mecha inventory
							ArrayList<ItemStack> stacks = block.getDrops(worldObj, blockX, blockY, blockZ, worldObj.getBlockMetadata(blockX, blockY, blockZ), 0);
							for(int i = 0; i < stacks.size(); i++)
							{
								ItemStack stack = stacks.get(i);
								FlansMod.log("");
								if(!InventoryHelper.addItemStackToInventory(driveableData, stack, driverIsCreative) && !worldObj.isRemote && worldObj.getGameRules().getGameRuleBooleanValue("doTileDrops"))
								{
									worldObj.spawnEntityInWorld(new EntityItem(worldObj, blockX + 0.5F, blockY + 0.5F, blockZ + 0.5F, stack));
								}
							}
							//Destroy block
							worldObj.func_147480_a(blockX, blockY, blockZ, false);
						}
					}
				}
			}
		}
        
        for(DriveablePart part : getDriveableData().parts.values())
        {
        	if(part.box != null)
        	{
        		
	        	part.update(this);
	        	//Client side particles
	        	if(worldObj.isRemote)
	        	{
	           		if(part.onFire)
	        		{
	        			//Pick a random position within the bounding box and spawn a flame there
		        		Vector3f pos = axes.findLocalVectorGlobally(new Vector3f(part.box.x + rand.nextFloat() * part.box.w, part.box.y + rand.nextFloat() * part.box.h, part.box.z + rand.nextFloat() * part.box.d));
		        		worldObj.spawnParticle("flame", posX + pos.x, posY + pos.y, posZ + pos.z, 0, 0, 0);
	        		}
	           		if(part.health > 0 && part.health < part.maxHealth / 2)
	        		{
	        			//Pick a random position within the bounding box and spawn a flame there
		        		Vector3f pos = axes.findLocalVectorGlobally(new Vector3f(part.box.x + rand.nextFloat() * part.box.w, part.box.y + rand.nextFloat() * part.box.h, part.box.z + rand.nextFloat() * part.box.d));
		        		worldObj.spawnParticle(part.health < part.maxHealth / 4 ? "largesmoke" : "smoke", posX + pos.x, posY + pos.y, posZ + pos.z, 0, 0, 0);
	        		}
	        	}
	        	//Server side fire handling
	        	if(part.onFire)
	        	{
	        		//Rain can put out fire
	        		if(worldObj.isRaining() && rand.nextInt(40) == 0)
	        			part.onFire = false;
	        		//Also water blocks
	        		//Get the centre point of the part
	        		Vector3f pos = axes.findLocalVectorGlobally(new Vector3f(part.box.x + part.box.w / 2F, part.box.y + part.box.h / 2F, part.box.z + part.box.d / 2F));
	        		if(worldObj.getBlock(MathHelper.floor_double(posX + pos.x), MathHelper.floor_double(posY + pos.y), MathHelper.floor_double(posZ + pos.z)).getMaterial() == Material.water)
	        		{
	        			part.onFire = false;
	        		}
	        	}
	        	else
	        	{
	        		Vector3f pos = axes.findLocalVectorGlobally(new Vector3f(part.box.x / 16F + part.box.w / 32F, part.box.y / 16F + part.box.h / 32F, part.box.z / 16F + part.box.d / 32F));
	        		if(worldObj.getBlock(MathHelper.floor_double(posX + pos.x), MathHelper.floor_double(posY + pos.y), MathHelper.floor_double(posZ + pos.z)).getMaterial() == Material.lava)
	        		{
	        			part.onFire = true;
	        		}
	        	}
        	}
        }
        
        checkParts();
        
		prevRotationYaw = axes.getYaw();
		prevRotationPitch = axes.getPitch();
		prevRotationRoll = axes.getRoll();		
		prevAxes = axes.clone();
		
        if(riddenByEntity != null && riddenByEntity.isDead)
        {
            riddenByEntity = null;
        }
		if(riddenByEntity != null && isDead)
		{
			riddenByEntity.mountEntity(null);
		}
		if(riddenByEntity != null)
			riddenByEntity.fallDistance = 0F;
		
		boolean canThrust = (seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode) || driveableData.fuelInTank > 0;

		//If the player jumps out or dies, smoothly return the throttle to 0 so the plane might actually come down again */
		if((seats[0] != null && seats[0].riddenByEntity == null) || !canThrust)
		{
			throttle *= 0.98F;
			rightMouseHeld = leftMouseHeld = false;
		}
		
		//Check if shooting
		if(shootDelayPrimary > 0)
			shootDelayPrimary--;
		if(shootDelaySecondary > 0)
			shootDelaySecondary--;
		if(!worldObj.isRemote)
		{
			if(leftMouseHeld && getDriveableType().modePrimary == EnumFireMode.FULLAUTO)
				shoot(false);
			if(rightMouseHeld && getDriveableType().modeSecondary == EnumFireMode.FULLAUTO)
				shoot(true);
			minigunSpeedPrimary *= 0.9F;
			minigunSpeedSecondary *= 0.9F;
			if(leftMouseHeld && getDriveableType().modePrimary == EnumFireMode.MINIGUN)
			{
				minigunSpeedPrimary += 0.1F;
				if(minigunSpeedPrimary > 1F)
					shoot(false);
			}
			if(rightMouseHeld && getDriveableType().modeSecondary == EnumFireMode.MINIGUN)
			{
				minigunSpeedSecondary += 0.1F;
				if(minigunSpeedSecondary > 1F)
					shoot(true);
			}
		}

		//Handle fuel
			
		int fuelMultiplier = 2;
		
		//The tank is currently full, so do nothing
		if(data.fuelInTank >= type.fuelTankSize)
			return;
		
		//Look through the entire inventory for fuel cans, buildcraft fuel buckets and RedstoneFlux power sources
		for(int i = 0; i < data.getSizeInventory(); i++)
		{
			ItemStack stack = data.getStackInSlot(i);
			if(stack == null || stack.stackSize <= 0)
				continue;
			Item item = stack.getItem();
			//If we have an electric engine, look for RedstoneFlux power source items, such as power cubes
			if(data.engine.useRFPower)
			{
				if(item instanceof IEnergyContainerItem)
				{
					IEnergyContainerItem energy = (IEnergyContainerItem)item;
					data.fuelInTank += (fuelMultiplier * energy.extractEnergy(stack, data.engine.RFDrawRate, false)) / data.engine.RFDrawRate;
				}
			}
			else
			{
				//Check for Flan's Mod fuel items
				if(item instanceof ItemPart)
				{
					PartType part = ((ItemPart)item).type;
					//Check it is a fuel item
					if(part.category == 9)
					{
						//Put 2 points of fuel 
						data.fuelInTank += fuelMultiplier;
						
						//Damage the fuel item to indicate being used up
						int damage = stack.getItemDamage();
						stack.setItemDamage(damage + 1);
		
						//If we have finished this fuel item
						if(damage >= stack.getMaxDamage())
						{
							//Reset the damage to 0
							stack.setItemDamage(0);
							//Consume one item
							stack.stackSize--;
							//If we consumed the last one, destroy the stack
							if(stack.stackSize <= 0)
								data.setInventorySlotContents(i, null);
						}
						
						//We found a fuel item and consumed some, so we are done
						break;
					}
				}
				//Check for Buildcraft oil and fuel buckets
				else if(FlansMod.hooks.BuildCraftLoaded && stack.isItemEqual(FlansMod.hooks.BuildCraftOilBucket) && data.fuelInTank + 1000 * fuelMultiplier <= type.fuelTankSize)
				{
					data.fuelInTank += 1000 * fuelMultiplier;
					data.setInventorySlotContents(i, new ItemStack(Items.bucket));
				}
				else if(FlansMod.hooks.BuildCraftLoaded && stack.isItemEqual(FlansMod.hooks.BuildCraftFuelBucket) && data.fuelInTank + 2000 * fuelMultiplier <= type.fuelTankSize)
				{
					data.fuelInTank += 2000 * fuelMultiplier;
					data.setInventorySlotContents(i, new ItemStack(Items.bucket));
				}
			}
		}
	}
		
	public void checkForCollisions()
	{
		boolean crashInWater = false;
		double speed = getSpeedXYZ();
		for(DriveablePosition p : getDriveableType().collisionPoints)
		{
			if(driveableData.parts.get(p.part).dead)
				continue;
			Vector3f lastRelPos = prevAxes.findLocalVectorGlobally(p.position);
			Vec3 lastPos = Vec3.createVectorHelper(prevPosX + lastRelPos.x, prevPosY + lastRelPos.y, prevPosZ + lastRelPos.z);
			
			Vector3f currentRelPos = axes.findLocalVectorGlobally(p.position);
			Vec3 currentPos = Vec3.createVectorHelper(posX + currentRelPos.x, posY + currentRelPos.y, posZ + currentRelPos.z);
			
			if(FlansMod.DEBUG && worldObj.isRemote)
			{
				worldObj.spawnEntityInWorld(new EntityDebugVector(worldObj, new Vector3f(lastPos), Vector3f.sub(currentRelPos, lastRelPos, null), 10, 1F, 0F, 0F));
			}
			
			MovingObjectPosition hit = worldObj.rayTraceBlocks(lastPos, currentPos, crashInWater);
			if(hit != null && hit.typeOfHit == MovingObjectType.BLOCK)
			{
				int x = hit.blockX;
				int y = hit.blockY;
				int z = hit.blockZ;
				Block blockHit = worldObj.getBlock(x, y, z);
				int meta = worldObj.getBlockMetadata(x, y, z);
				
				float blockHardness = blockHit.getBlockHardness(worldObj, x, y, z);
				
				//Attack the part
				if(!attackPart(p.part, DamageSource.inWall, blockHardness * blockHardness * (float)speed) && TeamsManager.driveablesBreakBlocks)
				{
					//And if it didn't die from the attack, break the block
					worldObj.playAuxSFXAtEntity(null, 2001, x, y, z, Block.getIdFromBlock(blockHit) + (meta << 12));					
					
					if(!worldObj.isRemote)
					{	
						blockHit.dropBlockAsItem(worldObj, x, y, z, meta, 1);		
						worldObj.setBlockToAir(x, y, z);
					}
				}
				else
				{
					//The part died!
					worldObj.createExplosion(this, currentPos.xCoord, currentPos.yCoord, currentPos.zCoord, 1F, false);
				}
			}
			
		}
	}
	
	@Override
    protected void fall(float k)
    {
        if (k <= 0) 
        	return;
        //super.fall(k);
        int i = MathHelper.ceiling_float_int(k - 10F);

        if(i > 0)
        	attackPart(EnumDriveablePart.core, DamageSource.fall, i / 5);
    }
	
	/** Attack a certain part of a driveable and return whether it broke or not */
	public boolean attackPart(EnumDriveablePart ep, DamageSource source, float damage)
	{
		DriveablePart part = driveableData.parts.get(ep);
		return part.attack(damage, source.isFireDamage());
	}
		
	/** Takes a vector (such as the origin of a seat / gun) and translates it from local coordinates to global coordinates */
	public Vector3f rotate(Vector3f inVec)
	{
		return axes.findLocalVectorGlobally(inVec);
	}
		
	/** Takes a vector (such as the origin of a seat / gun) and translates it from local coordinates to global coordinates */
	public Vector3f rotate(Vec3 inVec)
	{
		return rotate(inVec.xCoord, inVec.yCoord, inVec.zCoord);
	}

	/** Takes a vector (such as the origin of a seat / gun) and translates it from local coordinates to global coordinates */
	public Vector3f rotate(double x, double y, double z)
	{	
		return rotate(new Vector3f((float)x, (float)y, (float)z));
	}
	
	//Rotate the plane locally by some angle about the yaw axis
	public void rotateYaw(float rotateBy)
	{
		if(Math.abs(rotateBy) < 0.01F)
			return;
		axes.rotateLocalYaw(rotateBy);
		updatePrevAngles();
	}
	
	//Rotate the plane locally by some angle about the pitch axis
	public void rotatePitch(float rotateBy)
	{
		if(Math.abs(rotateBy) < 0.01F)
			return;
		axes.rotateLocalPitch(rotateBy);
		updatePrevAngles();
	}
	
	//Rotate the plane locally by some angle about the roll axis
	public void rotateRoll(float rotateBy)
	{
		if(Math.abs(rotateBy) < 0.01F)
			return;
		axes.rotateLocalRoll(rotateBy);
		updatePrevAngles();
	}
		
	public void updatePrevAngles()
	{		
		//Correct angles that crossed the +/- 180 line, so that rendering doesnt make them swing 360 degrees in one tick.
		double dYaw = axes.getYaw() - prevRotationYaw;
		if(dYaw > 180)
			prevRotationYaw += 360F;
		if(dYaw < -180)
			prevRotationYaw -= 360F;
		
		double dPitch = axes.getPitch() - prevRotationPitch;
		if(dPitch > 180)
			prevRotationPitch += 360F;
		if(dPitch < -180)
			prevRotationPitch -= 360F;
		
		double dRoll = axes.getRoll() - prevRotationRoll;
		if(dRoll > 180)
			prevRotationRoll += 360F;
		if(dRoll < -180)
			prevRotationRoll -= 360F;
	}
			
	public void setRotation(float rotYaw, float rotPitch, float rotRoll)
	{
		axes.setAngles(rotYaw, rotPitch, rotRoll);
	}
	
	//Used to stop self collision
	public boolean isPartOfThis(Entity ent)
	{
		for(EntitySeat seat : seats)
		{
			if(seat == null)
				continue;
			if(ent == seat)
				return true;
			if(seat.riddenByEntity == ent)
				return true;
		}
		return ent == this;	
	}

	@Override
    public float getShadowSize()
    {
        return 0.0F;
    }
    
    public DriveableType getDriveableType()
    {
    	return DriveableType.getDriveable(driveableType);
    }
    
    public DriveableData getDriveableData()
    {
    	return driveableData;
    }
	
	@Override
	public boolean isDead()
	{
		return isDead;
	}
	
	@Override
	public Entity getControllingEntity()
	{
		return seats[0].getControllingEntity();
	}
	
	@Override
    public ItemStack getPickedResult(MovingObjectPosition target)
    {
		ItemStack stack = new ItemStack(getDriveableType().item, 1, 0);
		stack.stackTagCompound = new NBTTagCompound();
		driveableData.writeToNBT(stack.stackTagCompound);
		return stack;
    }
	
    
    public boolean hasFuel() {
		if (seats == null || seats[0] == null || seats[0].riddenByEntity == null)
			return false;
		return seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer) seats[0].riddenByEntity).capabilities.isCreativeMode || driveableData.fuelInTank > 0;
	}
    
    public boolean hasEnoughFuel() {
		if (seats == null || seats[0] == null || seats[0].riddenByEntity == null)
			return false;
		return seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer) seats[0].riddenByEntity).capabilities.isCreativeMode || driveableData.fuelInTank > driveableData.engine.fuelConsumption * throttle;

	}
	
	//Physics time! Oooh yeah
	
	public double getSpeedXYZ()
	{
		return Math.sqrt(motionX * motionX + motionY * motionY + motionZ * motionZ);
	}
	
	public double getSpeedXZ()
	{
		return Math.sqrt(motionX * motionX + motionZ * motionZ);
	}
	
	/** To be overriden by vehicles to get alternate collision system */
	public boolean landVehicle()
	{
		return false;
	}
	
	/** Overriden by planes for wheel parts */
	public boolean gearDown()
	{
		return true;
	}
	
	/** Whether or not the plane is on the ground 
	 * TODO : Replace with proper check based on wheels
	 * */
	public boolean onGround()
	{
		return onGround;
	}
		
	/** Attack method called by bullets hitting the plane. Does advanced raytracing to detect which part of the plane is hit */
	public ArrayList<BulletHit> attackFromBullet(Vector3f origin, Vector3f motion)
	{
		//Make an array to contain the hits
		ArrayList<BulletHit> hits = new ArrayList<BulletHit>();
		//Get the position of the bullet origin, relative to the centre of the plane, and then rotate the vectors onto local co-ordinates
		Vector3f relativePosVector = Vector3f.sub(origin, new Vector3f((float)posX, (float)posY, (float)posZ), null);
		Vector3f rotatedPosVector = axes.findGlobalVectorLocally(relativePosVector);
		Vector3f rotatedMotVector = axes.findGlobalVectorLocally(motion);
		//Check each part
		for(DriveablePart part : getDriveableData().parts.values())
		{
			//Ray trace the bullet
			DriveableHit hit = part.rayTrace(this, rotatedPosVector, rotatedMotVector);
			if(hit != null)
				hits.add(hit);
		}
		return hits;
	}
	
	/** Called if the bullet actually hit the part returned by the raytrace 
	 * @param penetratingPower */
	public float bulletHit(EntityBullet bullet, DriveableHit hit, float penetratingPower)
	{
		DriveablePart part = getDriveableData().parts.get(hit.part);
		part.hitByBullet(bullet);
		
		//This is server side bsns
		if(!worldObj.isRemote)
		{
			checkParts();
			//If it hit, send a damage update packet
			FlansMod.getPacketHandler().sendToAllAround(new PacketDriveableDamage(this), posX, posY, posZ, 100, dimension);
		}
		
		return penetratingPower - 5F;
	}
	
	/** A simple raytracer for the driveable. Called by tools */
	public DriveablePart raytraceParts(Vector3f origin, Vector3f motion)
	{
		//Get the position of the bullet origin, relative to the centre of the plane, and then rotate the vectors onto local co-ordinates
		Vector3f relativePosVector = Vector3f.sub(origin, new Vector3f((float)posX, (float)posY, (float)posZ), null);
		Vector3f rotatedPosVector = axes.findGlobalVectorLocally(relativePosVector);
		Vector3f rotatedMotVector = axes.findGlobalVectorLocally(motion);
		//Check each part
		for(DriveablePart part : getDriveableData().parts.values())
		{
			//Ray trace the bullet
			if(part.rayTrace(this, rotatedPosVector, rotatedMotVector) != null)
			{
				return part;
			}
		}
		return null;
	}
	
	/** For overriding for toggles such as gear up / down on planes */
	public boolean canHitPart(EnumDriveablePart part)
	{
		return true;
	}
	
	/** Internal method for checking that all parts are ok, destroying broken ones, dropping items and making sure that child parts are destroyed when their parents are */
	public void checkParts()
	{
		for(DriveablePart part : getDriveableData().parts.values())
		{
			if(part != null && !part.dead && part.health <= 0 && part.maxHealth > 0)
			{
				killPart(part);
			}
		}
		
		
		for(EntitySeat seat : seats)
		{
			
		}
		
		//If the core was destroyed, kill the driveable
		if(getDriveableData().parts.get(EnumDriveablePart.core).dead)
		{
			if(!worldObj.isRemote)
			{
				for(DriveablePart part : driveableData.parts.values())
				{
					if(part.health > 0 && !part.dead)
						killPart(part);
				}
			}
			setDead();
		}
			
	}
	
	/** Internal method for killing driveable parts */
	private void killPart(DriveablePart part)
	{
		if(part.dead)
			return;
		part.health = 0;
		part.dead = true;
		
		//Drop items
		DriveableType type = getDriveableType();
		if(!worldObj.isRemote)
		{
			Vector3f pos = new Vector3f(0, 0, 0);
					
			//Get the midpoint of the part
			if(part.box != null)
	    		pos = axes.findLocalVectorGlobally(new Vector3f(part.box.x / 16F + part.box.w / 32F, part.box.y / 16F + part.box.h / 32F, part.box.z / 16F + part.box.d / 32F));
	    		
			ArrayList<ItemStack> drops = type.getItemsRequired(part, getDriveableData().engine);
    		if(drops != null)
			{
				//Drop each itemstack 
        		for(ItemStack stack : drops)
				{
					worldObj.spawnEntityInWorld(new EntityItem(worldObj, posX + pos.x, posY + pos.y, posZ + pos.z, stack.copy()));
				}
			}
			dropItemsOnPartDeath(pos, part);
			
			//Inventory is in the core, so drop it if the core is broken
			if(part.type == EnumDriveablePart.core)
			{
				for(int i = 0; i < getDriveableData().getSizeInventory(); i++)
				{
					ItemStack stack = getDriveableData().getStackInSlot(i);
					if(stack != null)
					{
						worldObj.spawnEntityInWorld(new EntityItem(worldObj, posX + rand.nextGaussian(), posY + rand.nextGaussian(), posZ + rand.nextGaussian(), stack));
					}
				}
			}
		}
		
		//Kill all child parts to stop things floating unconnected
		for(EnumDriveablePart child : part.type.getChildren())
		{
			killPart(getDriveableData().parts.get(child));
		}
	}
	
	/** Method for planes, vehicles and whatnot to drop their own specific items if they wish */
	protected abstract void dropItemsOnPartDeath(Vector3f midpoint, DriveablePart part);
	
	@Override
	public float getPlayerRoll() 
	{
		return axes.getRoll();
	}

	@Override
	public void explode() 
	{
		
	}
	
	@Override
	public float getCameraDistance()
	{
		return getDriveableType().cameraDistance;
	}
	
	public boolean isPartIntact(EnumDriveablePart part)
	{
		DriveablePart thisPart = getDriveableData().parts.get(part);
		return thisPart.maxHealth == 0 || thisPart.health > 0;
	}
	
	public abstract boolean hasMouseControlMode();
	
	public abstract String getBombInventoryName();
	
	public abstract String getMissileInventoryName();
	
	public boolean rotateWithTurret(Seat seat)
	{
		return seat.part == EnumDriveablePart.turret;
	}
	
	@Override
	public String getCommandSenderName()
	{
		return getDriveableType().name;
	}
	
	@SideOnly(Side.CLIENT)
	public boolean showInventory(int seat)
	{
		return seat != 0 || !FlansModClient.controlModeMouse;
	}

	//-------------------------------------
	// Getters and setters for dual fields
	//-------------------------------------
	
	public int getShootDelay(boolean secondary)
	{
		return secondary ? shootDelaySecondary : shootDelayPrimary;
	}
	
	public float getMinigunSpeed(boolean secondary)
	{
		return secondary ? minigunSpeedSecondary : minigunSpeedPrimary;
	}
	
	public int getCurrentGun(boolean secondary)
	{
		return secondary ? currentGunSecondary : currentGunPrimary;
	}
	
	public void setShootDelay(int i, boolean secondary)
	{
		if(secondary)
			shootDelaySecondary = i;
		else shootDelayPrimary = i;
	}
	
	public void setMinigunSpeed(float f, boolean secondary)
	{
		if(secondary)
			minigunSpeedSecondary = f;
		else minigunSpeedPrimary = f;
	}
	
	public void setCurrentGun(int i, boolean secondary)
	{
		if(secondary)
			currentGunSecondary = i;
		else currentGunPrimary = i;
	}
	
	
	
}
