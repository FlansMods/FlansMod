package co.uk.flansmods.common.driveables;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteArrayDataOutput;

import co.uk.flansmods.api.IControllable;
import co.uk.flansmods.client.FlansModClient;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.ItemBullet;
import co.uk.flansmods.common.ItemTool;
import co.uk.flansmods.common.RotatedAxes;
import co.uk.flansmods.common.guns.BulletType;
import co.uk.flansmods.common.guns.EntityBullet;
import co.uk.flansmods.common.guns.GunType;
import co.uk.flansmods.common.network.PacketPlaySound;
import co.uk.flansmods.common.network.PacketSeatUpdates;
import co.uk.flansmods.common.network.PacketVehicleKey;
import co.uk.flansmods.common.vector.Vector3f;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntitySeat extends Entity implements IControllable, IEntityAdditionalSpawnData
{
	/** Set this to true when the client has found the parent driveable and connected them */
	@SideOnly(Side.CLIENT)
	public boolean foundDriveable;
	private int driveableID;
	private int seatID;
	public EntityDriveable driveable;
	
	@SideOnly(Side.CLIENT)
	public float playerRoll;
	
	public Seat seatInfo;
	public boolean driver;
	
	/** A set of axes used to calculate where the player is looking, x axis is the direction of looking, y is up */
	public RotatedAxes looking;
	/** For smooth renderering */
	public RotatedAxes prevLooking;
	/** Delay ticker for shooting guns */
	public int gunDelay;
	/** Sound delay ticker for looping sounds */
	public int soundDelay;
	
	
	private double playerPosX, playerPosY, playerPosZ;
	private float playerYaw, playerPitch;
	/** For smoothness */
	private double prevPlayerPosX, prevPlayerPosY, prevPlayerPosZ;
	private float prevPlayerYaw, prevPlayerPitch;
	
	
	/** Default constructor for spawning client side 
	 * Should not be called server side EVER */
	public EntitySeat(World world) 
	{
		super(world);
		setSize(1F, 1F);
		prevLooking = looking = new RotatedAxes();
	}
		
	/** Server side seat constructor */
	public EntitySeat(World world, EntityDriveable d, int id) 
	{
		this(world);
		driveable = d;
		driveableID = d.entityId;
		seatInfo = driveable.getDriveableType().seats[id];
		driver = id == 0;
		setPosition(d.posX, d.posY, d.posZ);
		playerPosX = prevPlayerPosX = posX;
		playerPosY = prevPlayerPosY = posY;
		playerPosZ = prevPlayerPosZ = posZ;
		looking.setAngles((seatInfo.minYaw + seatInfo.maxYaw) / 2, 0F, 0F);
		//updatePosition();
	}
	
	@Override
	public void setPositionAndRotation2(double x, double y, double z, float yaw, float pitch, int i)
	{
		//setPosition(x, y, z);
	}
	
	@Override
	public void onUpdate()
	{
		prevPosX = posX;
		prevPosY = posY;
		prevPosZ = posZ;

		//If on the client and the driveable parent has yet to be found, search for it
		if(worldObj.isRemote && !foundDriveable)
		{
			driveable = (EntityDriveable)worldObj.getEntityByID(driveableID);
			if(driveable == null)
				return;
			foundDriveable = true;
			driveable.seats[seatID] = this;
			seatInfo = driveable.getDriveableType().seats[seatID];
			looking.setAngles((seatInfo.minYaw + seatInfo.maxYaw) / 2, 0F, 0F);
			playerPosX = prevPlayerPosX = posX = driveable.posX;
			playerPosY = prevPlayerPosY = posY = driveable.posY;
			playerPosZ = prevPlayerPosZ = posZ = driveable.posZ;
			setPosition(posX, posY, posZ);
		}
		
		//Update gun delay ticker
		if(gunDelay > 0)
			gunDelay--;
		//Update sound delay ticker
		if(soundDelay > 0)
			soundDelay--;
		
		//updatePosition();
		
		//If on the client
		if(worldObj.isRemote)
		{
			if(driver && riddenByEntity == Minecraft.getMinecraft().thePlayer && FlansModClient.controlModeMouse && driveable.hasMouseControlMode())
			{
				looking = new RotatedAxes();
			}
			//DEBUG : Spawn particles along axes
			
			Vector3f xAxis = driveable.axes.findLocalAxesGlobally(looking).getXAxis();
			Vector3f yAxis = driveable.axes.findLocalAxesGlobally(looking).getYAxis();
			Vector3f zAxis = driveable.axes.findLocalAxesGlobally(looking).getZAxis();
			Vector3f yOffset = driveable.axes.findLocalVectorGlobally(new Vector3f(0F, riddenByEntity == null ? 0F : (float)riddenByEntity.getYOffset(), 0F));
			for(int i = 0; i < 10; i++)
			{
				//worldObj.spawnParticle("enchantmenttable", 	posX + xAxis.x * i * 0.3D + yOffset.x, posY + xAxis.y * i * 0.3D + yOffset.y, posZ + xAxis.z * i * 0.3D + yOffset.z, 0, 0, 0);
				//worldObj.spawnParticle("smoke", 			posX + yAxis.x * i * 0.3D + yOffset.x, posY + yAxis.y * i * 0.3D + yOffset.y, posZ + yAxis.z * i * 0.3D + yOffset.z, 0, 0, 0);
				//worldObj.spawnParticle("reddust", 			posX + zAxis.x * i * 0.3D + yOffset.x, posY + zAxis.y * i * 0.3D + yOffset.y, posZ + zAxis.z * i * 0.3D + yOffset.z, 0, 0, 0);
			}
		}
	}
	
	/** Set the position to be that of the driveable plus the local position, rotated */
	public void updatePosition()
	{
		//If we haven't found our driveable, give up
		if(worldObj.isRemote && !foundDriveable)
			return;
		
		prevPlayerPosX = playerPosX;
		prevPlayerPosY = playerPosY;
		prevPlayerPosZ = playerPosZ;
		
		prevPlayerYaw = playerYaw;
		prevPlayerPitch = playerPitch;

		//Get the position of this seat on the driveable axes
		Vector3f localPosition = new Vector3f(seatInfo.x / 16F, seatInfo.y / 16F, seatInfo.z / 16F);
		//If this is the drivers seat, add the offset vector
		if(driver)
		{
			RotatedAxes yawOnlyLooking = new RotatedAxes(looking.getYaw(), 0F, 0F);
			Vector3f rotatedOffset = yawOnlyLooking.findLocalVectorGlobally(driveable.getDriveableType().rotatedDriverOffset);
			Vector3f.add(localPosition, new Vector3f(rotatedOffset.x, 0F, rotatedOffset.z), localPosition);
		}
		//If this seat is connected to the turret, then its position vector on the driveable axes needs an extra rotation in it
		//if(driveable.rotateWithTurret(seatInfo) && driveable.seats[0] != null)
			//localPosition = driveable.seats[0].looking.findLocalVectorGlobally(localPosition);
		//Get the position of this seat globally, but positionally relative to the driveable
		Vector3f relativePosition = driveable.axes.findLocalVectorGlobally(localPosition);
		//Set the absol
		setPosition(driveable.posX + relativePosition.x, driveable.posY + relativePosition.y, driveable.posZ + relativePosition.z);
		
		if(riddenByEntity != null)
		{
	    	DriveableType type = driveable.getDriveableType();
			Vec3 yOffset = driveable.rotate(0, riddenByEntity.getYOffset(), 0).toVec3();
			
			playerPosX = posX + yOffset.xCoord;
			playerPosY = posY + yOffset.yCoord;
			playerPosZ = posZ + yOffset.zCoord;
			
			riddenByEntity.prevPosX = prevPlayerPosX;
			riddenByEntity.prevPosY = prevPlayerPosY;
			riddenByEntity.prevPosZ = prevPlayerPosZ;
            riddenByEntity.setPosition(playerPosX, playerPosY, playerPosZ);  
            
            //Calculate the local look axes globally
			RotatedAxes globalLookAxes = driveable.axes.findLocalAxesGlobally(looking);
			//Set the player's rotation based on this
			playerYaw = -90F + globalLookAxes.getYaw();
			playerPitch = globalLookAxes.getPitch();
			
			riddenByEntity.prevRotationYaw = prevPlayerYaw;
			riddenByEntity.prevRotationPitch = prevPlayerPitch;
			
			riddenByEntity.rotationYaw = playerYaw;
			riddenByEntity.rotationPitch = playerPitch;
			

	
			//If the entity is a player, roll its view accordingly
			if(worldObj.isRemote)
				playerRoll = -globalLookAxes.getRoll();
			
			double dYaw = riddenByEntity.rotationYaw - riddenByEntity.prevRotationYaw;
			if(dYaw > 180)
				riddenByEntity.prevRotationYaw += 360F;
			if(dYaw < -180)
				riddenByEntity.prevRotationYaw -= 360F;
		}
	}

	@Override
    public boolean canBeCollidedWith()
    {
        return !isDead;
    }
	
	@Override
    protected void entityInit()
    {
    }
	
	@Override
    public float getShadowSize()
    {
        return 4.0F;
    }

	@Override
	protected void readEntityFromNBT(NBTTagCompound tags) 
	{
		//Do not read. Spawn with driveable
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound tags) 
	{
		//Do not write. Spawn with driveable
	}
	
	@Override
    public boolean writeToNBTOptional(NBTTagCompound tags)
    {
        return false;
    }
	
	@Override
    public boolean writeMountToNBT(NBTTagCompound tags)
    {
        return false;
    }

	@Override
	public void onMouseMoved(int deltaX, int deltaY) 
	{
		if(!foundDriveable)
			return;
		
		
		prevLooking = looking.clone();
				
		//Driver seat should pass input to driveable
		if(driver)
		{
			driveable.onMouseMoved(deltaX, deltaY);
		}
		//Other seats should look around, but also the driver seat if mouse control mode is disabled
		if(!driver || !FlansModClient.controlModeMouse || !driveable.hasMouseControlMode())
		{
			float lookSpeed = 4F;
			
			//Calculate the new pitch and consider pitch limiters
			float newPitch = looking.getPitch() - deltaY / lookSpeed * Minecraft.getMinecraft().gameSettings.mouseSensitivity;
			if(newPitch > -seatInfo.minPitch)
				newPitch = -seatInfo.minPitch;
			if(newPitch < -seatInfo.maxPitch)
				newPitch = -seatInfo.maxPitch;
			
			//Calculate new yaw and consider yaw limiters
			float newYaw = looking.getYaw() + deltaX / lookSpeed * Minecraft.getMinecraft().gameSettings.mouseSensitivity;
			//Since the yaw limiters go from -360 to 360, we need to find a pair of yaw values and check them both
			float otherNewYaw = newYaw - 360F; 
			if(newYaw < 0)
				otherNewYaw = newYaw + 360F;
			if((newYaw >= seatInfo.minYaw && newYaw <= seatInfo.maxYaw) || (otherNewYaw >= seatInfo.minYaw && otherNewYaw <= seatInfo.maxYaw))
			{
				//All is well
			}
			else
			{
				float newYawDistFromRange = Math.min(Math.abs(newYaw - seatInfo.minYaw), Math.abs(newYaw - seatInfo.maxYaw));
				float otherNewYawDistFromRange = Math.min(Math.abs(otherNewYaw - seatInfo.minYaw), Math.abs(otherNewYaw - seatInfo.maxYaw));
				//If the newYaw is closer to the range than the otherNewYaw, move newYaw into the range
				if(newYawDistFromRange <= otherNewYawDistFromRange)
				{
					if(newYaw > seatInfo.maxYaw)
						newYaw = seatInfo.maxYaw;
					if(newYaw < seatInfo.minYaw)
						newYaw = seatInfo.minYaw;
				}
				//Else, the otherNewYaw is closer, so move it in
				else
				{
					if(otherNewYaw > seatInfo.maxYaw)
						otherNewYaw = seatInfo.maxYaw;
					if(otherNewYaw < seatInfo.minYaw)
						otherNewYaw = seatInfo.minYaw;
					//Then match up the newYaw with the otherNewYaw
					if(newYaw < 0)
						newYaw = otherNewYaw - 360F;
					else newYaw = otherNewYaw + 360F;
				}
			}
			//Now set the new angles
			looking.setAngles(newYaw, newPitch, 0F);
			
			PacketDispatcher.sendPacketToServer(PacketSeatUpdates.buildUpdatePacket(this));
		}
	}

	@Override
	public boolean pressKey(int key, EntityPlayer player) 
	{
		if(worldObj.isRemote && !foundDriveable)
			return false;
		
		//Driver seat should pass input to driveable
		if(driver)
		{
			return driveable.pressKey(key, player);
		}
		
		if(key == 6)
		{		
			if(worldObj.isRemote)
				PacketDispatcher.sendPacketToServer(PacketVehicleKey.buildKeyPacket(key));
			else
			{	
				riddenByEntity.mountEntity(null);
			}
			return true;
		}
		
		if(key == 9) //Shoot
		{
			
			if(worldObj.isRemote)
			{
				PacketDispatcher.sendPacketToServer(PacketVehicleKey.buildKeyPacket(key));
				//DEBUG
				Vector3f shootVec = driveable.axes.findLocalVectorGlobally(looking.getXAxis());
				Vector3f yOffset = driveable.axes.findLocalVectorGlobally(new Vector3f(0F, (float)player.getYOffset(), 0F));
				for(int i = 0; i < 10; i++)
				{
					//worldObj.spawnParticle("reddust", 	posX + shootVec.x * i * 0.3D + yOffset.x, posY + shootVec.y * i * 0.3D + yOffset.y, posZ + shootVec.z * i * 0.3D + yOffset.z, 0, 0, 0);
				}
				//
			}
			else if(gunDelay <= 0 && FlansMod.bulletsEnabled)
			{
				//Get the gun from the plane type and the ammo from the data
				GunType gun = seatInfo.gunType;
				ItemStack bulletItemStack = driveable.getDriveableData().ammo[seatInfo.gunnerID];
				//Check that neither is null and that the bullet item is actually a bullet
				if(gun != null && bulletItemStack != null && bulletItemStack.getItem() instanceof ItemBullet)
				{
					BulletType bullet = ((ItemBullet)bulletItemStack.getItem()).type;
					if(gun.isAmmo(bullet))
					{
						//Calculate the look axes globally
						RotatedAxes globalLookAxes = driveable.axes.findLocalAxesGlobally(looking);
						Vector3f shootVec = driveable.axes.findLocalVectorGlobally(looking.getXAxis());
						//Calculate the origin of the bullets
						Vector3f yOffset = driveable.axes.findLocalVectorGlobally(new Vector3f(0F, (float)player.getMountedYOffset(), 0F));						
						//Spawn a new bullet item
						worldObj.spawnEntityInWorld(new EntityBullet(worldObj, Vector3f.add(yOffset, new Vector3f((float)posX, (float)posY, (float)posZ), null), shootVec, (EntityLivingBase)riddenByEntity, gun.accuracy, gun.damage, bullet, 1.0F, driveable.getDriveableType()));
						//Play the shoot sound
						if(soundDelay <= 0)
						{
							PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 50, dimension, PacketPlaySound.buildSoundPacket(posX, posY, posZ, gun.shootSound, false));
							soundDelay = gun.shootSoundLength;
						}
						//Get the bullet item damage and increment it
						int damage = bulletItemStack.getItemDamage();
						bulletItemStack.setItemDamage(damage + 1);	
						//If the bullet item is completely damaged (empty)
						if(damage + 1 == bulletItemStack.getMaxDamage())
						{
							//Set the damage to 0 and consume one ammo item (unless in creative)
							bulletItemStack.setItemDamage(0);
							if(!((EntityPlayer)riddenByEntity).capabilities.isCreativeMode)
								driveable.getDriveableData().decrStackSize(3 + seatID, 1);
						}
						//Reset the shoot delay
						gunDelay = gun.shootDelay;
					}
				}
			}
		}
		return false;
	}
	
	@Override
	public boolean interactFirst(EntityPlayer entityplayer) //interact : change back when Forge updates
    {
		if(isDead)
			return true;
		if(worldObj.isRemote)
			return true;
		//If they are using a repair tool, don't put them in
		ItemStack currentItem = entityplayer.getCurrentEquippedItem();
		if(currentItem != null && currentItem.getItem() instanceof ItemTool && ((ItemTool)currentItem.getItem()).type.healDriveables)
			return true;
		//Put them in the seat
		if(riddenByEntity == null)
			entityplayer.mountEntity(this);
        return true;
    }
	
	@Override
	public Entity getControllingEntity() 
	{
		return riddenByEntity;
	}

	@Override
	public boolean isDead() 
	{
		return isDead;
	}

	@Override
	public void setDead()
	{
		super.setDead();
	}
	
	@Override
	public void writeSpawnData(ByteArrayDataOutput data) 
	{
		data.writeInt(driveableID);
		data.writeInt(seatInfo.id);
	}

	@Override
	public void readSpawnData(ByteArrayDataInput data) 
	{
		driveableID = data.readInt();
		driveable = (EntityDriveable)worldObj.getEntityByID(driveableID);
		seatID = data.readInt();
		driver = seatID == 0;
		if(driveable != null)
		{
			seatInfo = driveable.getDriveableType().seats[seatID];
			looking.setAngles((seatInfo.minYaw + seatInfo.maxYaw) / 2, 0F, 0F);
			playerPosX = prevPlayerPosX = posX = driveable.posX;
			playerPosY = prevPlayerPosY = posY = driveable.posY;
			playerPosZ = prevPlayerPosZ = posZ = driveable.posZ;
			setPosition(posX, posY, posZ);
		}
	}
	
	@Override
    public void updateRiderPosition()
    {
		if(riddenByEntity == null || (worldObj.isRemote && !foundDriveable))
        {
            return;
        } else
        {
        	DriveableType type = driveable.getDriveableType();
			Vec3 yOffset = driveable.rotate(0, riddenByEntity.getYOffset(), 0).toVec3();
        
            

			return;
        }
    }
	
	
	
	@Override
    public ItemStack getPickedResult(MovingObjectPosition target)
    {
		if(worldObj.isRemote && !foundDriveable)
			return null;
		return driveable.getPickedResult(target);
    }
	
	@Override
	public float getPlayerRoll() 
	{
		return playerRoll;
	}
	
	@Override
	public float getCameraDistance()
	{
		return foundDriveable && seatID == 0 ? driveable.getDriveableType().cameraDistance : 5F;
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource source, float f)
	{
		if(worldObj.isRemote && !foundDriveable)
			return false;
		return driveable.attackEntityFrom(source, f);
	}
}
