package co.uk.flansmods.common.driveables;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.src.ModLoader;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

import co.uk.flansmods.api.IExplodeable;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.ItemBullet;
import co.uk.flansmods.common.ItemPart;
import co.uk.flansmods.common.RotatedAxes;
import co.uk.flansmods.common.guns.BulletType;
import co.uk.flansmods.common.guns.EntityBullet;
import co.uk.flansmods.common.guns.GunType;
import co.uk.flansmods.common.network.PacketPlaySound;
import co.uk.flansmods.common.network.PacketVehicleControl;
import co.uk.flansmods.common.network.PacketVehicleKey;
import co.uk.flansmods.common.vector.Matrix4f;
import co.uk.flansmods.common.vector.Vector3f;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteArrayDataOutput;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.FMLNetworkHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;

public class EntityVehicle extends EntityDriveable implements IExplodeable
{
	/** Weapon delays */
	public int shellDelay, gunDelay;
	/** Position of looping sounds */
	public int soundPosition;
	/** Front wheel yaw, used to control the vehicle steering */
	public float wheelsYaw;
	/** Despawn time */
	private int ticksSinceUsed = 0;
    /** Aesthetic door switch */
    public boolean varDoor;
    /** Wheel rotation angle. Only applies to vehicles that set a rotating wheels flag */
    public float wheelsAngle;
    /** Delayer for door button */
    public int toggleTimer = 0;
    
    public EntityVehicle(World world)
    {
        super(world);
    }
    
	public EntityVehicle(World world, double x, double y, double z, VehicleType type, DriveableData data)
	{
		super(world, type, data);
		setPosition(x, y, z);
		initType(type, false);
	}
    
	public EntityVehicle(World world, double x, double y, double z, EntityPlayer placer, VehicleType type, DriveableData data)
	{
		this(world, x, y, z, type, data);
		rotateYaw(placer.rotationYaw + 90F);
	}

	@Override
    protected void writeEntityToNBT(NBTTagCompound tag)
    {
        super.writeEntityToNBT(tag);
        tag.setBoolean("VarDoor", varDoor);
    }

	@Override
    protected void readEntityFromNBT(NBTTagCompound tag)
    {
        super.readEntityFromNBT(tag);
        varDoor = tag.getBoolean("VarDoor");
    }
	
	@Override
	public void writeUpdateData(DataOutputStream out)
	{
		try
		{
			out.writeBoolean(varDoor);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public void readUpdateData(DataInputStream in)
	{
		try
		{
			varDoor = in.readBoolean();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Called with the movement of the mouse. Used in controlling vehicles if need be.
	 * @param deltaY 
	 * @param deltaX 
	 */
	@Override
	public void onMouseMoved(int deltaX, int deltaY)
	{
	}
		
	@Override
	public boolean func_130002_c(EntityPlayer entityplayer)
    {
		if(isDead)
			return true;
		if(worldObj.isRemote)
			return true;
		
		VehicleType type = getVehicleType();
		//Check each seat in order to see if the player can sit in it
		for(int i = 0; i <= type.numPassengers; i++)
		{
			if(canSit(i))
			{
				entityplayer.mountEntity(seats[i]);	
				if(i == 0)
				{
					shellDelay = type.vehicleShellDelay;
					FlansMod.proxy.doTutorialStuff(entityplayer, this);
				}
				return true;
			}
		}
        return true;
    }
	
    @Override
	public boolean pressKey(int key, EntityPlayer player)
	{
    	VehicleType type = getVehicleType();
    	//Send keys which require server side updates to the server
    	if(worldObj.isRemote && (key == 6 || key == 8 || key == 9))
    	{
    		PacketDispatcher.sendPacketToServer(PacketVehicleKey.buildKeyPacket(key));
    		return true;
    	}
		switch(key)
		{
			case 0 : //Accelerate : Increase the throttle, up to 1.
			{
				throttle += 0.01F;
				if(throttle > 1F)
					throttle = 1F;
				return true;
			}
			case 1 : //Decelerate : Decrease the throttle, down to -1, or 0 if the vehicle cannot reverse
			{
				throttle -= 0.01F;
				if(throttle < -1F)
					throttle = -1F;
				if(throttle < 0F && type.maxNegativeThrottle == 0F)
					throttle = 0F;
				return true;
			}
			case 2 : //Left : Yaw the wheels left
			{
				wheelsYaw -= 1F;
				return true;
			}
			case 3 : //Right : Yaw the wheels right
			{
				wheelsYaw += 1F;
				return true;
			}
			case 4 : //Up : Do nothing
			{
				return true;
			}
			case 5 : //Down : Do nothing
			{
				return true;
			}
			case 6 : //Exit : Get out
			{
				seats[0].riddenByEntity.mountEntity(null);
          		return true;
			}
			case 7 : //Inventory
			{
				if(worldObj.isRemote)
                {
					FlansMod.proxy.openDriveableMenu((EntityPlayer)seats[0].riddenByEntity, worldObj, this);
                }
				return true;
			}
			case 8 : //Drop bomb
			{
				/*
				if(!worldObj.isRemote && bombDelay <= 0 && FlansMod.bombsEnabled)
				{
					int slot = -1;
					int bombType = 0;
					for(int i = driveableData.getBombInventoryStart(); i < driveableData.getBombInventoryStart() + type.numBombSlots; i++)
					{
						ItemStack bomb = driveableData.getStackInSlot(i);
						if(bomb != null && bomb.getItem() instanceof ItemBullet && ((ItemBullet)bomb.getItem()).type.isBomb)
						{
							slot = i;
						}
					}
					
					if(slot != -1)
					{
						Vec3 bombVec = rotate(type.bombPosition).toVec3();
						worldObj.spawnEntityInWorld(new EntityBullet(worldObj, bombVec.addVector(posX, posY, posZ), axes.getYaw(), axes.getPitch(), motionX, motionY, motionZ, (EntityLiving)riddenByEntity, 1, ((ItemBullet)driveableData.getStackInSlot(slot).getItem()).type, type));
						if(type.shootSecondarySound != null)
							PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 50, dimension, PacketPlaySound.buildSoundPacket(posX, posY, posZ, type.shootSecondarySound, false));					
						if(!((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode)
							driveableData.decrStackSize(slot, 1);
						bombDelay = type.planeBombDelay;
					}
					return true;
				}
				*/
				return false;
			}
			case 9 : //Shoot bullet
			{
				/*
				if(!worldObj.isRemote && gunDelay <= 0 && FlansMod.bulletsEnabled)
				{
					for(PilotGun gun : getDriveableType().guns)
					{
						//Get the gun from the plane type and the ammo from the data
						GunType gunType = gun.type;
						ItemStack bulletItemStack = driveableData.ammo[getDriveableType().numPassengerGunners + gun.gunID];
						//Check that neither is null and that the bullet item is actually a bullet
						if(gunType != null && bulletItemStack != null && bulletItemStack.getItem() instanceof ItemBullet)
						{
							BulletType bullet = ((ItemBullet)bulletItemStack.getItem()).type;
							if(gunType.isAmmo(bullet))
							{
								//Rotate the gun vector to global axes
								Vector3f gunVec = rotate(gun.position);
								//Spawn a new bullet item
								worldObj.spawnEntityInWorld(new EntityBullet(worldObj, Vector3f.add(gunVec, new Vector3f((float)posX, (float)posY, (float)posZ), null), axes.getXAxis(), (EntityLiving)riddenByEntity, gunType.accuracy / 2, gunType.damage, bullet, 2.0F, type));
								//Play the shoot sound
								PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 50, dimension, PacketPlaySound.buildSoundPacket(posX, posY, posZ, type.shootMainSound, false));
								//Get the bullet item damage and increment it
								int damage = bulletItemStack.getItemDamage();
								bulletItemStack.setItemDamage(damage + 1);	
								//If the bullet item is completely damaged (empty)
								if(damage + 1 == bulletItemStack.getMaxDamage())
								{
									//Set the damage to 0 and consume one ammo item (unless in creative)
									bulletItemStack.setItemDamage(0);
									if(!((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode)
									{
										bulletItemStack.stackSize--;
										if(bulletItemStack.stackSize <= 0)
											bulletItemStack = null;
										driveableData.setInventorySlotContents(getDriveableType().numPassengerGunners + gun.gunID, bulletItemStack);
									}
								}
								//Reset the shoot delay
								gunDelay = type.planeShootDelay;
							}
						}
					}
					return true;
				}
				*/
				return false;
			}
			case 10 : //Change control mode : Do nothing
			{
				return true;
			}
			case 11 : //Roll left : Do nothing
			{
				return true;
			}
			case 12 : //Roll right : Do nothing
			{
				return true;
			}
			case 13 : // Gear : Do nothing
			{
				return true;
			}
			case 14 : // Door
			{
				if(toggleTimer <= 0)
				{
					varDoor = !varDoor;
					if(type.hasDoor)
						player.addChatMessage("Doors " + (varDoor ? "open" : "closed"));
					toggleTimer = 10;
					PacketDispatcher.sendPacketToServer(PacketVehicleControl.buildUpdatePacket(this));
				}
				return true;
			}
			case 15 : // Wing : Do nothing
			{
				return true;
			}
            case 16 : // Trim Button
            {
				applyTorque(new Vector3f(axes.getRoll() / 10, 0F, 0F));
				return true;
            }
            case 17 : //Park
            {
                break;
            }
		}
		return false;
	}
	
    public void onUpdate()
    {
        super.onUpdate();
        
		//Get vehicle type
        VehicleType type = this.getVehicleType();
        if(type == null)
        {
        	FlansMod.log("Vehicle type null. Not ticking vehicle");
        	return;
        }
        
        //Work out if this is the client side and the player is driving
        boolean thePlayerIsDrivingThis = worldObj.isRemote && seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && FlansMod.proxy.isThePlayer((EntityPlayer)seats[0].riddenByEntity);
                
        //Despawning
		ticksSinceUsed++;
		if(!worldObj.isRemote && FlansMod.vehicleLife > 0 && ticksSinceUsed > FlansMod.vehicleLife * 20)
		{
			setDead();
		}
		if(!worldObj.isRemote && seats[0].riddenByEntity != null)
			ticksSinceUsed = 0;
		
		//Shooting, inventories, etc.
		//Decrement shell and gun timers
		if(shellDelay > 0)
			shellDelay--;
		if(gunDelay > 0)
			gunDelay--;
		if(toggleTimer > 0)
			toggleTimer--;
		
		//Aesthetics
		//Rotate the wheels
		wheelsAngle += throttle / 7F;	
		
		//Return the wheels to their resting position
		wheelsYaw *= 0.9F;
		
		//Limit wheel angles
		if(wheelsYaw > 20)
			wheelsYaw = 20;
		if(wheelsYaw < -20)
			wheelsYaw = -20;
		
		//Player is not driving this. Update its position from server update packets 
		if(worldObj.isRemote && !thePlayerIsDrivingThis)
		{
			//The driveable is currently moving towards its server position. Continue doing so.
            if (serverPositionTransitionTicker > 0)
            {
                double x = posX + (serverPosX - posX) / (double)serverPositionTransitionTicker;
                double y = posY + (serverPosY - posY) / (double)serverPositionTransitionTicker;
                double z = posZ + (serverPosZ - posZ) / (double)serverPositionTransitionTicker;
                double dYaw = MathHelper.wrapAngleTo180_double(serverYaw - (double)axes.getYaw());
                double dPitch = MathHelper.wrapAngleTo180_double(serverPitch - (double)axes.getPitch());
                double dRoll = MathHelper.wrapAngleTo180_double(serverRoll - (double)axes.getRoll());
                rotationYaw = (float)((double)axes.getYaw() + dYaw / (double)serverPositionTransitionTicker);
                rotationPitch = (float)((double)axes.getPitch() + dPitch / (double)serverPositionTransitionTicker);
                float rotationRoll = (float)((double)axes.getRoll() + dRoll / (double)serverPositionTransitionTicker);
                --serverPositionTransitionTicker;
                setPosition(x, y, z);
                setRotation(rotationYaw, rotationPitch, rotationRoll);
                //return;
            }
            //If the driveable is at its server position and does not have the next update, it should just simulate itself as a server side driveable would, so continue
		}
		
		//Movement

		//Apply turning forces
		{
			float sensitivityAdjust = 1F * type.mass / (float)Math.max(1D, 5D * Math.sqrt(motionX * motionX + motionY * motionY + motionZ * motionZ));
			
			//Yaw according to the wheelsYaw
			float yaw = wheelsYaw * (wheelsYaw > 0 ? type.turnLeftModifier : type.turnRightModifier) * sensitivityAdjust;	
			
			applyTorque(axes.findLocalVectorGlobally(new Vector3f(0F, yaw, 0F)));
		}
		
		//Co-efficients of formulae
		float thrustFormulaCoefficient = 0.1F;
		float dragFormulaCoefficient = 1F;
		float gravity = 9.81F / 20F;
				
		//Apply thrust
		{
			float thrust = thrustFormulaCoefficient * throttle * (throttle > 0 ? type.maxThrottle : type.maxNegativeThrottle) * getDriveableData().engine.engineSpeed;
			
			if(type.tank)
			{
				
			}
			else
			{
				applyThrust(parts.get(EnumDriveablePart.backLeftWheel), thrust);
				applyThrust(parts.get(EnumDriveablePart.backRightWheel), thrust);
				applyThrust(parts.get(EnumDriveablePart.backWheel), thrust);
				if(type.fourWheelDrive)
				{
					applyThrust(parts.get(EnumDriveablePart.frontLeftWheel), thrust);
					applyThrust(parts.get(EnumDriveablePart.frontRightWheel), thrust);
					applyThrust(parts.get(EnumDriveablePart.frontWheel), thrust);
				}
			}
		}
		
		//Apply drag
		{
			Vector3f velocityVector = new Vector3f((float)motionX, (float)motionY, (float)motionZ);
			//Avoid zero errors by not applying drag when going too slow
			if(velocityVector.lengthSquared() > 0.0000001F)
			{
				//Drag formula is 1/2 * v^2 * dragCoefficient
				float drag = dragFormulaCoefficient * type.drag * velocityVector.lengthSquared();
				//Apply in the direction opposite to the motion of the plane
				applyForce(new Vector3f(), (Vector3f)velocityVector.normalise().negate().scale(drag));
			}
		}
		
		//Apply gravity
		{
			//Work out mg
			float gravitationalForce = type.mass * gravity;
			//Apply it downwards
			applyForce(new Vector3f(), new Vector3f(0F, -gravitationalForce, 0F));
		}
		
		//Smooth off rotational motion
		angularVelocity.scale(0.95F);
		
		//Call the movement method in EntityDriveable to move the driveable according to the forces we just applied
		moveDriveable();
		
		
		//Fuel Handling
		DriveableData data = getDriveableData();
		
		//If the fuel item has stack size <= 0, delete it
		if(data.fuel != null && data.fuel.stackSize <= 0)
			data.fuel = null;
		
		//Work out if we are fuelling (from a Flan's Mod fuel item)
		fuelling = data.fuel != null && data.fuelInTank < type.fuelTankSize && data.fuel.stackSize > 0 && data.fuel.getItem() instanceof ItemPart && ((ItemPart)data.fuel.getItem()).type.category == 9;
		
		//If we are fuelling
		if(fuelling)
		{
			int damage = data.fuel.getItemDamage();
			//Consume 10 points of fuel (1 damage)
			data.fuel.setItemDamage(damage + 1);
			//Put 10 points of fuel 
			data.fuelInTank += 10;
			//If we have finished this fuel item
			if(damage >= data.fuel.getMaxDamage())
			{
				//Reset the damage to 0
				data.fuel.setItemDamage(0);
				//Consume one item
				data.fuel.stackSize--;
				//If we consumed the last one, destroy the stack
				if(data.fuel.stackSize <= 0)
					data.fuel = null;
			}	
		}
		//Check fuel slot for builcraft buckets and if found, take fuel from them
		if(FlansMod.hooks.BuildCraftLoaded && !fuelling && data.fuel != null && data.fuel.stackSize > 0)
		{
			if(data.fuel.isItemEqual(FlansMod.hooks.BuildCraftOilBucket) && data.fuelInTank + 500 <= type.fuelTankSize)
			{
				data.fuelInTank += 500;
				data.fuel = new ItemStack(Item.bucketEmpty);
			}
			else if(data.fuel.isItemEqual(FlansMod.hooks.BuildCraftFuelBucket) && data.fuelInTank + 1000 <= type.fuelTankSize)
			{
				data.fuelInTank += 1000;
				data.fuel = new ItemStack(Item.bucketEmpty);
			}
		}

		//Sounds
		//Starting sound
		if (throttle > 0.01F && throttle < 0.2F && soundPosition == 0)
		{
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, 50, dimension, type.startSound, false);
			soundPosition = type.startSoundLength;
		}
		//Flying sound
		if (throttle > 0.2F && soundPosition == 0)
		{
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, 50, dimension, type.engineSound, false);
			soundPosition = type.engineSoundLength;
		}
		
		//Calculate movement on the client and then send position, rotation etc to the server
		if(thePlayerIsDrivingThis)
		{
			PacketDispatcher.sendPacketToServer(PacketVehicleControl.buildUpdatePacket(this));
		}
		
		//If this is the server, send position updates to everyone, having recieved them from the driver
		if(!worldObj.isRemote && ticksExisted % 5 == 0)
		{
			PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 200, dimension, PacketVehicleControl.buildUpdatePacket(this));
		}
    }
    
    private void applyThrust(DriveablePart part, float thrust)
    {
    	if(part.maxHealth > 0 && part.health <= 0)
    		return;
    	if(part.box == null)
    		return;
    	
    	DriveableData data = getDriveableData();
    	
		//If the player driving this is in creative, then we can thrust, no matter what
		boolean canThrustCreatively = seats != null && seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode;
		//Otherwise, check the fuel tanks!
		if(canThrustCreatively || data.fuelInTank > data.engine.fuelConsumption * throttle)
		{
			//Find the block we are resting on
			Vector3f midPoint = part.box.getCentre();
	    	Vector3f globalMidPoint = axes.findLocalVectorGlobally(midPoint);
	    	
	    	int x = MathHelper.floor_double(posX + globalMidPoint.x);
	    	int y = MathHelper.floor_double(posY + globalMidPoint.y - getVehicleType().wheelRadius);
	    	int z = MathHelper.floor_double(posZ + globalMidPoint.z);
	    	
	    	//If its solid on top
	    	if(worldObj.isBlockSolidOnSide(x, y, z, ForgeDirection.UP))
	    	{
	    		//Apply the thrust
	    		Vector3f xAxis = axes.getXAxis();
	    		applyForce(globalMidPoint, (Vector3f)new Vector3f(xAxis.x, 0F, xAxis.z).scale(thrust));				
	    	}
	    	
			//If we can't thrust creatively, we must thrust using fuel. Nom.
			if(!canThrustCreatively)
				data.fuelInTank -= data.engine.fuelConsumption * throttle;
		}
    }

    public boolean attackEntityFrom(DamageSource damagesource, float i, boolean doDamage)
    {
        if(worldObj.isRemote || isDead)
            return true;
        
        VehicleType type = getVehicleType();
        
		if(damagesource.damageType.equals("player") && ((EntityDamageSource)damagesource).getEntity().onGround)
		{
			ItemStack vehicleStack = new ItemStack(type.itemID, 1, 0);
			vehicleStack.stackTagCompound = new NBTTagCompound();
			driveableData.writeToNBT(vehicleStack.stackTagCompound);
			entityDropItem(vehicleStack, 0.5F);
	 		setDead();
		}
        return true;
    }
        
	@Override
	public boolean attackEntityFrom(DamageSource damagesource, float i)
    {
		return attackEntityFrom(damagesource, i, true);
	}
		
	public VehicleType getVehicleType()
	{
		return VehicleType.getVehicle(driveableType);
	}
    
	@Override
	public float getPlayerRoll() 
	{
		return axes.getRoll();
	}

	@Override
	protected void dropItemsOnPartDeath(Vector3f midpoint, DriveablePart part) 
	{		
	}

	@Override
	public String getBombInventoryName() 
	{
		return null;
	}
	
	public boolean hasMouseControlMode()
	{
		return false;
	}
}
