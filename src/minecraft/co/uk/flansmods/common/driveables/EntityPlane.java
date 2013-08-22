package co.uk.flansmods.common.driveables;

import java.io.IOException;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import co.uk.flansmods.api.IExplodeable;
import co.uk.flansmods.client.FlansModClient;
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
import co.uk.flansmods.common.vector.Matrix3f;
import co.uk.flansmods.common.vector.Vector3f;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteArrayDataOutput;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;

public class EntityPlane extends EntityDriveable
{
	/** The flap positions, used for renderering and for controlling the plane rotations */
	public float flapsYaw, flapsPitchLeft, flapsPitchRight;	
	
	//Aesthetic variables
	public int soundPosition;
	public float propAngle;
	
	//Weaponry
	public int bombDelay;
	public int gunDelay;
	
	public boolean tailOnGround;
	private boolean spawnedEntities;
	public int ticksSinceUsed = 0;
    
    public boolean varGear;
    public boolean varDoor;
    public boolean varWing;
  
	public int trimButton = 1;
	
    public EntityPlane(World world)
    {
        super(world);
    }
    
	public EntityPlane(World world, double x, double y, double z, PlaneType type, DriveableData data)
	{
		super(world, type, data);
		setPosition(x, y, z);
		initType(type, false);
	}
    
	public EntityPlane(World world, double x, double y, double z, EntityPlayer placer, PlaneType type, DriveableData data)
	{
		this(world, x, y, z, type, data);
		rotateYaw(placer.rotationYaw + 90F);
        //rotatePitch(-type.posPark);
	}
	
	@Override
	protected void initType(DriveableType type, boolean clientSide)
	{
		super.initType(type, clientSide);
		PlaneType planeType = (PlaneType)type;
        varGear = true;
        varDoor = true;
        varWing = true;
		
		if(FMLCommonHandler.instance().getSide().isClient() && planeType.model == null)
		{
			FlansMod.proxy.loadPlaneModel(new String[] {"", planeType.shortName}, planeType.shortName, planeType);
			FlansMod.logLoudly("Package Error! Please check the installed content package for problems.");
			return;
		}
	}
	
	@Override
    protected void writeEntityToNBT(NBTTagCompound tag)
    {
		super.writeEntityToNBT(tag);
        tag.setBoolean("VarGear", varGear);
        tag.setBoolean("VarDoor", varDoor);
        tag.setBoolean("VarWing", varWing);
    }

	@Override
    protected void readEntityFromNBT(NBTTagCompound tag)
    {
		super.readEntityFromNBT(tag);
        varGear = tag.getBoolean("VarGear");
        varDoor = tag.getBoolean("VarDoor");
        varWing = tag.getBoolean("VarWing");
    }

	/**
	 * Called with the movement of the mouse. Used in controlling vehicles if need be.
	 * @param deltaY 
	 * @param deltaX 
	 * @return if mouse movement was handled.
	 */
	@Override
	public void onMouseMoved(int deltaX, int deltaY)
	{
		if(!FMLCommonHandler.instance().getSide().isClient())
			return;
		if(!FlansMod.proxy.mouseControlEnabled())
			return;

		float sensitivity = 0.02F;
		
		flapsPitchLeft -= sensitivity * deltaY;
		flapsPitchRight -= sensitivity * deltaY;
		
		flapsPitchLeft -= sensitivity * deltaX;
		flapsPitchRight += sensitivity * deltaX;
	}

	private boolean canSit(int seat)
	{
		return getPlaneType().numPassengers >= seat && seats[seat].riddenByEntity == null;
	}
		
	@Override
	public boolean func_130002_c(EntityPlayer entityplayer) //interact : change back when Forge updates
    {
		if(isDead)
			return true;
		if(worldObj.isRemote)
			return true;
		
		PlaneType type = this.getPlaneType();
		//Check each seat in order to see if the player can sit in it
		for(int i = 0; i <= type.numPassengers; i++)
		{
			if(canSit(i))
			{
				entityplayer.mountEntity(seats[i]);	
				if(i == 0)
				{
					bombDelay = type.planeBombDelay;
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
    	PlaneType type = this.getPlaneType();
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
			case 1 : //Decelerate : Decrease the throttle, down to -1, or 0 if the plane cannot reverse
			{
				throttle -= 0.01F;
				if(throttle < -1F)
					throttle = -1F;
				if(throttle < 0F && type.maxNegativeThrottle == 0F)
					throttle = 0F;
				return true;
			}
			case 2 : //Left : Yaw the flaps left
			{
				flapsYaw -= 1F;
				return true;
			}
			case 3 : //Right : Yaw the flaps right
			{
				flapsYaw += 1F;
				return true;
			}
			case 4 : //Up : Pitch the flaps up
			{
				flapsPitchLeft += 1F;
				flapsPitchRight += 1F;
				return true;
			}
			case 5 : //Down : Pitch the flaps down
			{
				flapsPitchLeft -= 1F;
				flapsPitchRight -= 1F;
				return true;
			}
			case 6 : //Exit : Get out
			{
				seats[0].riddenByEntity.mountEntity(null);
          		return true;
			}
			case 7 : //Inventory : Check to see if this plane allows in-flight inventory editing or if the plane is on the ground
			{
				if(worldObj.isRemote && (type.invInflight || (Math.abs(throttle) < 0.1F && onGround)))
                {
					FlansMod.proxy.openDriveableMenu((EntityPlayer)seats[0].riddenByEntity, worldObj, this);
                }
				return true;
			}
			case 8 : //Drop bomb
			{
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
						if(type.bombSound != null)
						{
							try 
							{
								PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 50, dimension, PacketPlaySound.buildSoundPacket(posX, posY, posZ, type.bombSound, false));
							}
							catch(Exception e)
							{
								FlansMod.log("Failed to play sound : " + type.bombSound);
							}						
						}
						if(!((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode)
							driveableData.decrStackSize(slot, 1);
						bombDelay = type.planeBombDelay;
					}
					return true;
				}
				return false;
			}
			case 9 : //Shoot bullet
			{
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
								PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 50, dimension, PacketPlaySound.buildSoundPacket(posX, posY, posZ, type.shootSound, false));
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
				return false;
			}
			case 10 : //Change control mode
			{
				FlansMod.proxy.changeControlMode((EntityPlayer)seats[0].riddenByEntity);
				return true;
			}
			case 11 : //Roll left
			{
				flapsPitchLeft -= 1F;
				flapsPitchRight += 1F;
				return true;
			}
			case 12 : //Roll right
			{
				flapsPitchLeft += 1F;
				flapsPitchRight -= 1F;
				return true;
			}
			case 13 : // Gear
			{
				varGear = !varGear;
				if(type.hasGear)
					player.addChatMessage("Landing gear " + (varGear ? "up" : "down"));
				return true;
			}
			case 14 : // Door
			{
				varDoor = !varDoor;
				if(type.hasDoor)
					player.addChatMessage("Doors " + (varDoor ? "open" : "closed"));
				return true;
			}
			case 15 : // Wing
			{
				varWing = !varWing;
				if(type.hasWing)
					player.addChatMessage("Toggling wings");
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
        
		//Get plane type
        PlaneType type = this.getPlaneType();
        if(type == null)
        {
        	FlansMod.log("Plane type null. Not ticking plane");
        	return;
        }
        
        //Work out if this is the client side and the player is driving
        boolean thePlayerIsDrivingThis = worldObj.isRemote && seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && FlansMod.proxy.isThePlayer((EntityPlayer)seats[0].riddenByEntity);
                
        //Despawning
		ticksSinceUsed++;
		if(!worldObj.isRemote && FlansMod.planeLife > 0 && ticksSinceUsed > FlansMod.planeLife * 20)
		{
			setDead();
		}
		if(!worldObj.isRemote && seats[0].riddenByEntity != null)
			ticksSinceUsed = 0;
		
		//Shooting, inventories, etc.
		//Decrement bomb and gun timers
		if(bombDelay > 0)
			bombDelay--;
		if(gunDelay > 0)
			gunDelay--;
		
		//Aesthetics
		//Rotate the propellers
		propAngle += throttle / 7F;	
		
		//Return the flaps to their resting position
		flapsYaw *= 0.9F;
		flapsPitchLeft *= 0.9F;
		flapsPitchRight *= 0.9F;
		
		//Limit flap angles
		if(flapsYaw > 20)
			flapsYaw = 20;
		if(flapsYaw < -20)
			flapsYaw = -20;
		if(flapsPitchRight > 20)
			flapsPitchRight = 20;
		if(flapsPitchRight < -20)
			flapsPitchRight = -20;
		if(flapsPitchLeft > 20)
			flapsPitchLeft = 20;
		if(flapsPitchLeft < -20)
			flapsPitchLeft = -20;
		
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
            //If the driveable is at its server position and does not have the next update, it should just simulate itself as a server side plane would, so continue
		}
		
		//Movement

		//Apply turning forces
		{
			float sensitivityAdjust = 10F * type.mass;
			
			//Yaw according to the flapsYaw
			float yaw = flapsYaw * (flapsYaw > 0 ? type.turnLeftModifier : type.turnRightModifier) * sensitivityAdjust;
			//applyRotationalForce(axes.getZAxis(), (Vector3f)axes.getXAxis().scale(yaw));
			
			//Pitch according to the sum of flapsPitchLeft and flapsPitchRight / 2
			float flapsPitch = (flapsPitchLeft + flapsPitchRight) / 2F;
			float pitch = flapsPitch * (flapsPitch > 0 ? type.lookUpModifier : type.lookDownModifier) * sensitivityAdjust;
			//applyRotationalForce(axes.getZAxis(), (Vector3f)axes.getYAxis().scale(pitch));
			
			//Roll according to the difference between flapsPitchLeft and flapsPitchRight / 2
			float flapsRoll = (flapsPitchRight - flapsPitchLeft) / 2F;
			float roll = flapsRoll * (flapsRoll > 0 ? type.rollLeftModifier : type.rollRightModifier) * sensitivityAdjust;
			//applyRotationalForce(axes.getXAxis(), (Vector3f)axes.getYAxis().scale(roll));
			
			applyTorque(axes.findLocalVectorGlobally(new Vector3f(-roll, yaw, -pitch)));
		}
		
		//Co-efficients of formulae
		float thrustFormulaCoefficient = 2F;
		float dragFormulaCoefficient = 10F;
		float gravity = 9.81F / 20F;
		float liftFormulaCoefficient = 1.2F * (dragFormulaCoefficient * type.drag * type.mass * gravity) / (type.lift * thrustFormulaCoefficient * type.maxThrottle * type.propellers.size());
				
		//Apply thrust
		for(Propeller propeller : type.propellers)
		{
			//TODO : Factor in engine type
			//Check the propeller is still around
			if(!parts.get(propeller.planePart).dead)
			{
				float thrust = thrustFormulaCoefficient * throttle * (throttle > 0 ? type.maxThrottle : type.maxNegativeThrottle);
				applyForce(axes.findLocalVectorGlobally(propeller.getPosition()), (Vector3f)axes.getXAxis().scale(thrust));
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
		
		//Apply lift
		{
			Vector3f velocityVector = new Vector3f((float)motionX, (float)motionY, (float)motionZ);
			//Get the velocity in the local XZ plane (the plane the wings lie on)
			float xVelocity = Vector3f.dot(velocityVector, axes.getXAxis());
			float zVelocity = Vector3f.dot(velocityVector, axes.getZAxis());
			float perpendicularVelocity = xVelocity * xVelocity + zVelocity * zVelocity;
			//Avoid zero errors by not applying lift when going too slow
			if(velocityVector.lengthSquared() > 0.0000001F)
			{
				//Lift formula is 1/2 * v^2 * liftCoefficient
				float lift = liftFormulaCoefficient * type.lift * perpendicularVelocity;
				//Apply to the yAxis of the plane
				applyForce(new Vector3f(), (Vector3f)axes.getYAxis().scale(lift));
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
		
		//Call the movement method in EntityDriveable to move the plane according to the forces we just applied
		moveDriveable();
		
		
        /*
		//Fuel Handling
		if(getPlaneData().fuel != null && getPlaneData().fuel.stackSize <= 0)
			getPlaneData().fuel = null;
		if(!fuelling && getPlaneData().fuel != null && getPlaneData().fuel.stackSize > 0 && getPlaneData().fuel.getItem() instanceof ItemPart && ((ItemPart)getPlaneData().fuel.getItem()).type.category == 9)// && onGround && getSpeedXYZ() < 0.1D)
		{
			fuelling = true;
		}
		if(fuelling)
		{
			if(getPlaneData().fuel == null || getPlaneData().fuel.stackSize <= 0 || getPlaneData().fuelInTank >= type.tankSize)// || !onGround || getSpeedXYZ() > 0.1D)
			{
				fuelling = false;
			}
			else
			{
				int damage = getPlaneData().fuel.getItemDamage();
				getPlaneData().fuel.setItemDamage(damage + 1);
				getPlaneData().fuelInTank += 5;
				if(damage >= ((ItemPart)getPlaneData().fuel.getItem()).type.fuel)
				{
					getPlaneData().fuel.setItemDamage(0);
					getPlaneData().fuel.stackSize--;
					if(getPlaneData().fuel.stackSize <= 0)
						getPlaneData().setInventorySlotContents(getPlaneData().getFuelSlot(), null);
					fuelling = false;
				}	
			}
		}
		if(FlansMod.hooks.BuildCraftLoaded && !fuelling && getPlaneData().fuel != null && getPlaneData().fuel.stackSize > 0)
		{
			if(getPlaneData().fuel.isItemEqual(FlansMod.hooks.BuildCraftOilBucket) && getPlaneData().fuelInTank+500 <= type.tankSize)
			{
				getPlaneData().fuelInTank += 500;
				getPlaneData().fuel = new ItemStack(Item.bucketEmpty);
			}
			else if(getPlaneData().fuel.isItemEqual(FlansMod.hooks.BuildCraftFuelBucket) && getPlaneData().fuelInTank+1000 <= type.tankSize)
			{
				getPlaneData().fuelInTank += 1000;
				getPlaneData().fuel = new ItemStack(Item.bucketEmpty);
			}
		}

		//Sounds
		if(worldObj.isRemote)
		{
			if (propSpeed > 0.2D && propSpeed < 1 && soundPosition == 0)
			{
				PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 50, dimension, PacketPlaySound.buildSoundPacket(posX, posY, posZ, type.startSound, false));
				soundPosition = type.startSoundLength;
			}
			if (propSpeed > 1 && soundPosition == 0)
			{
				PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 50, dimension, PacketPlaySound.buildSoundPacket(posX, posY, posZ, type.propSound, false));
				soundPosition = type.propSoundLength;
			}
	
			if(soundPosition > 0)
				soundPosition--;
		}
		*/
		
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
	
	private void smashIntoBlock(int i, int j, int k)
	{
		if(worldObj.isRemote || !FlansMod.explosions)
			return;
		int blockID = worldObj.getBlockId(i, j, k);
		if(blockID != 0)
		{
			int meta = worldObj.getBlockMetadata(i, j, k);
			Block block = Block.blocksList[blockID];
			if(block.blockMaterial.isSolid())
			{
				float damage = block.getBlockHardness(worldObj, i, j, k) * 20F;
				attackEntityFrom(DamageSource.inWall, (int)damage);
				if(damage <= 20F && damage > 0F)
				{
					worldObj.setBlock(i, j, k, 0, 0, 5);
					block.dropBlockAsItem(worldObj, i, j, k, meta, 1);
					FlansMod.proxy.playBlockBreakSound(i, j, k, blockID);
				}
			}
		}
	}
	
    public boolean attackEntityFrom(DamageSource damagesource, float i, boolean doDamage)
    {
        if(worldObj.isRemote || isDead)
            return true;
        
        PlaneType type = PlaneType.getPlane(driveableType);
        
		if(damagesource.damageType.equals("player") && ((EntityDamageSource)damagesource).getEntity().onGround)
		{
			ItemStack planeStack = new ItemStack(type.itemID, 1, 0);
			planeStack.stackTagCompound = new NBTTagCompound();
			driveableData.writeToNBT(planeStack.stackTagCompound);
			entityDropItem(planeStack, 0.5F);
	 		setDead();
		}
        return true;
    }
    
    @Override
    public void applyEntityCollision(Entity entity)
    {
    	if(!isPartOfThis(entity))
    		super.applyEntityCollision(entity);
    }
  
	
	@Override
	public boolean attackEntityFrom(DamageSource damagesource, float i)
    {
		return attackEntityFrom(damagesource, i, true);
	}
		
	public PlaneType getPlaneType()
	{
		return PlaneType.getPlane(driveableType);
	}

	@Override
	protected void dropItemsOnPartDeath(Vector3f midpoint, DriveablePart part) 
	{
	}

	@Override
	public String getBombInventoryName() 
	{
		return "Bombs";
	}
}
