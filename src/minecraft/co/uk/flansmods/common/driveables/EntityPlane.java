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
import co.uk.flansmods.common.BulletType;
import co.uk.flansmods.common.EntityBullet;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.GunType;
import co.uk.flansmods.common.ItemBullet;
import co.uk.flansmods.common.ItemPart;
import co.uk.flansmods.common.RotatedAxes;
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
    
	public EntityPlane(World world, double x, double y, double z, EntityPlayer placer, PlaneType type, PlaneData data)
	{
		this(world, x, y, z, type, data);
		rotateYaw(placer.rotationYaw + 90F);
        //rotatePitch(-type.posPark);
	}
    
	public EntityPlane(World world, double x, double y, double z, PlaneType type, PlaneData data)
	{
		super(world, type, data);
		setPosition(x, y, z);
		driveableData = data;
		try
		{
			dataID = Integer.parseInt(getPlaneData().mapName.split("_")[1]);
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to retrieve plane data ID from plane data. " + getPlaneData().mapName);
		}
		driveableType = type.shortName;
		initType(type, false);
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

		flapsPitchLeft -= 1F * deltaY;
		flapsPitchRight -= 1F * deltaY;
		
		flapsPitchLeft -= 1F * deltaX;
		flapsPitchRight += 1F * deltaX;
	}

	private boolean canSit(int seat)
	{
		return getPlaneType().numPassengers >= seat && seats[seat].riddenByEntity == null;
	}
	
	@Override
	protected DriveableData getData(int dataID)
	{
		return new PlaneData("plane_" + dataID, getPlaneType());
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
				flapsYaw -= 5F;
				return true;
			}
			case 3 : //Right : Yaw the flaps right
			{
				flapsYaw += 5F;
				return true;
			}
			case 4 : //Up : Pitch the flaps up
			{
				flapsPitchLeft += 5F;
				flapsPitchRight += 5F;
				return true;
			}
			case 5 : //Down : Pitch the flaps down
			{
				flapsPitchLeft -= 5F;
				flapsPitchRight -= 5F;
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
					for(int i = getPlaneData().getBombInventoryStart(); i < getPlaneData().getBombInventoryStart() + type.numBombSlots; i++)
					{
						ItemStack bomb = getPlaneData().getStackInSlot(i);
						if(bomb != null && bomb.getItem() instanceof ItemBullet && ((ItemBullet)bomb.getItem()).type.isBomb)
						{
							slot = i;
						}
					}
					
					if(slot != -1)
					{
						Vec3 bombVec = rotate(type.bombPosition).toVec3();
						worldObj.spawnEntityInWorld(new EntityBullet(worldObj, bombVec.addVector(posX, posY, posZ), axes.getYaw(), axes.getPitch(), motionX, motionY, motionZ, (EntityLiving)riddenByEntity, 1, ((ItemBullet)getPlaneData().getStackInSlot(slot).getItem()).type, type));
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
							getPlaneData().decrStackSize(slot, 1);
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
						ItemStack bulletItemStack = getPlaneData().ammo[getDriveableType().numPassengerGunners + gun.gunID];
						//Check that neither is null and that the bullet item is actually a bullet
						if(gunType != null && bulletItemStack != null && bulletItemStack.getItem() instanceof ItemBullet)
						{
							BulletType bullet = ((ItemBullet)bulletItemStack.getItem()).type;
							if(gunType.isAmmo(bullet))
							{
								//Rotate the gun vector to global axes
								Vec3 gunVec = rotate(gun.position).toVec3();
								//Spawn a new bullet item
								worldObj.spawnEntityInWorld(new EntityBullet(worldObj, gunVec.addVector(posX, posY, posZ), axes.getYaw(), axes.getPitch(), (EntityLiving)riddenByEntity, gunType.accuracy, gunType.damage, bullet, 3.0F, type));
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
									if(!((EntityPlayer)riddenByEntity).capabilities.isCreativeMode)
										getPlaneData().decrStackSize(getDriveableType().numPassengerGunners + gun.gunID, 1);
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
				flapsPitchLeft -= 5F;
				flapsPitchRight += 5F;
				return true;
			}
			case 12 : //Roll right
			{
				flapsPitchLeft += 5F;
				flapsPitchRight -= 5F;
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
				velocityRoll += axes.getRoll() / 10;
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
		if(riddenByEntity != null)
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
		flapsYaw *= 0.8F;
		flapsPitchLeft *= 0.8F;
		flapsPitchRight *= 0.8F;
		
		//Limit flap angles
		if(flapsYaw > 10)
			flapsYaw = 10;
		if(flapsYaw < -10)
			flapsYaw = -10;
		if(flapsPitchRight > 10)
			flapsPitchRight = 10;
		if(flapsPitchRight < -10)
			flapsPitchRight = -10;
		if(flapsPitchLeft > 10)
			flapsPitchLeft = 10;
		if(flapsPitchLeft < -10)
			flapsPitchLeft = -10;
		
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
			//Yaw according to the flapsYaw
			float yaw = flapsYaw * (flapsYaw > 0 ? type.turnLeftModifier : type.turnRightModifier) * 0.1F;
			//applyRotationalForce(axes.getZAxis(), (Vector3f)axes.getXAxis().scale(yaw));
			
			//Pitch according to the sum of flapsPitchLeft and flapsPitchRight / 2
			float flapsPitch = (flapsPitchLeft + flapsPitchRight) / 2F;
			float pitch = flapsPitch * (flapsPitch > 0 ? type.lookUpModifier : type.lookDownModifier) * 0.1F;
			//applyRotationalForce(axes.getZAxis(), (Vector3f)axes.getYAxis().scale(pitch));
			
			//Roll according to the difference between flapsPitchLeft and flapsPitchRight / 2
			float flapsRoll = (flapsPitchRight - flapsPitchLeft) / 2F;
			float roll = flapsRoll * (flapsRoll > 0 ? type.rollLeftModifier : type.rollRightModifier) * 0.1F;
			//applyRotationalForce(axes.getXAxis(), (Vector3f)axes.getYAxis().scale(roll));
			
			applyTorque(new Vector3f(yaw, pitch, roll));
		}
		
		//Co-efficients of formulae
		float thrustFormulaCoefficient = 1F;
		float dragFormulaCoefficient = 10F;
		float gravity = 9.81F / 20F;
		float liftFormulaCoefficient = 1F * (dragFormulaCoefficient * type.drag * type.mass * gravity) / (type.lift * thrustFormulaCoefficient * type.maxThrottle * type.propellers.size());
				
		//Apply thrust
		for(Propeller propeller : type.propellers)
		{
			//TODO : Factor in engine type
			float thrust = thrustFormulaCoefficient * throttle * (throttle > 0 ? type.maxThrottle : type.maxNegativeThrottle);
			applyForce(rotate(propeller.getPosition()), (Vector3f)axes.getXAxis().scale(thrust));
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
		velocityYaw *= 0.9F;
		velocityPitch *= 0.9F;
		velocityRoll *= 0.9F;

		//Apply motion to position and rotation
		moveEntity(motionX, motionY, motionZ);
		rotateYaw(velocityYaw);
		rotatePitch(velocityPitch);
		rotateRoll(-velocityRoll);
		
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
		
		//Damage plane
		if(health < type.health / 4)
		{
			if(health > 0 && rand.nextInt(20 * health) == 0)
			{
				//Blow up a propeller!
				int propNum = rand.nextInt(type.numProps);
				if(!propBlown[propNum])
				{
					propBlown[propNum] = true;
					Vec3 propVec = rotate((double)(type.propellerX[propNum]) / 16D, (double)(type.propellerY[propNum]) / 16D, (double)(type.propellerZ[propNum]) / 16D);
					if(FlansMod.explosions)
						worldObj.createExplosion(this, posX + propVec.xCoord, posY + propVec.yCoord, posZ + propVec.zCoord, 1F, false);
				}
			}
			for(int i = 0; i < type.numProps; i++)
			{
				if(propBlown[i])
				{
					for(int j = 0; j < 3; j++)
					{				
						Vec3 propVec = rotate((double)(type.propellerX[i]) / 16D, (double)(type.propellerY[i]) / 16D, (double)(type.propellerZ[i]) / 16D);
						FlansMod.proxy.spawnParticle("smoke", posX + propVec.xCoord + rand.nextGaussian(), posY + propVec.yCoord + rand.nextGaussian(), posZ + propVec.zCoord + rand.nextGaussian(), 0D, 0D, 0D, 1);
					}
				}
			}
			FlansMod.proxy.spawnParticle("smoke", posX + rand.nextGaussian() / 4D, posY + rand.nextGaussian() / 4D, posZ + rand.nextGaussian() / 4D, 0D, 0D, 0D, 10);
			if(health < type.health / 8)
					FlansMod.proxy.spawnParticle("flame", posX + rand.nextGaussian() / 4D, posY + rand.nextGaussian() / 4D, posZ + rand.nextGaussian() / 4D, 0D, 0D, 0D, 10);
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
					velocityYaw += rand.nextFloat() * 1F - 0.5F;
					velocityPitch += rand.nextFloat() * 1F - 0.5F;
					velocityRoll += rand.nextFloat() * 1F - 0.5F;
				}
			}
		}
	}

	/*
	@Override
	public void updateCollisionBox(EntityCollisionBox box)
	{
		if(tailHealth <= 0 && box.part == 3)
			box.setDead();
		if(rightWingHealth <= 0 && box.part == 2)
			box.setDead();
		if(leftWingHealth <= 0 && box.part == 1)
			box.setDead();
		
		PlaneType type = this.getPlaneType();
		
		//Particles!
		if((tailHealth < type.health / 4 && box.part == 3)
		|| (rightWingHealth < type.health / 4 && box.part == 2)
		|| (leftWingHealth < type.health / 4 && box.part == 1))
		{
			FlansMod.proxy.spawnParticle("smoke", box.posX + rand.nextGaussian() / 4D, box.posY + rand.nextGaussian() / 4D, box.posZ + rand.nextGaussian() / 4D, 0D, 0D, 0D, (byte) 5);
		}
		
		
		Vec3 vec = rotate(box.x / 16D, box.y / 16D, box.z / 16D);
		box.setPosition(posX + vec.xCoord, posY + vec.yCoord, posZ + vec.zCoord);
		box.motionX = box.posX - box.prevPosX;
		box.motionY = box.posY - box.prevPosY;
		box.motionZ = box.posZ - box.prevPosZ;
		
		
		//Collision for takeoff
		int tileX = MathHelper.floor_double(box.posX + 0.5D);
		int tileY = MathHelper.floor_double(box.posY + 0.5D);
		int tileZ = MathHelper.floor_double(box.posZ + 0.5D);	
		if((box.part == 0 || box.part == 3) && Math.abs(motionY) < 0.2D && propSpeed > 1F)
		{
			Block block = Block.blocksList[worldObj.getBlockId(tileX, MathHelper.floor_double(box.boundingBox.minY), tileZ)];
			if(block != null && block.blockMaterial.isSolid())
				motionY += 0.1D;
			block = Block.blocksList[worldObj.getBlockId(tileX, MathHelper.floor_double(box.boundingBox.maxY), tileZ)];
			if(block != null && block.blockMaterial.isSolid())
				motionY -= 0.1D;		
		}
		
		
		//Hurtful collision
		else
		{
			box.inBlock = worldObj.getBlockId(tileX, tileY, tileZ) != 0;
			
			smashIntoBlock(tileX, tileY, tileZ);
			
			if(box.motionX * box.motionX + box.motionY * box.motionY + box.motionZ * box.motionZ > 0.25D)
			{
				if(box.motionX > box.motionZ && box.motionX > -box.motionZ && box.motionX > box.motionY && box.motionX > -box.motionY) //Moving in +x
				{
					int i = tileX + 1;
					for(int j = tileY - 1; j < tileY + 2; j++)
					{
						for(int k = tileZ - 1; k < tileZ + 2; k++)
						{
							box.smashIntoBlock(i, j, k);
						}
					}
				}
				if(-box.motionX > box.motionZ && -box.motionX > -box.motionZ && -box.motionX > box.motionY && -box.motionX > -box.motionY) //Moving in -x
				{
					int i = tileX - 1;
					for(int j = tileY - 1; j < tileY + 2; j++)
					{
						for(int k = tileZ - 1; k < tileZ + 2; k++)
						{
							box.smashIntoBlock(i, j, k);
						}
					}
				}
				if(box.motionZ > box.motionX && box.motionZ > -box.motionX && box.motionZ > box.motionY && box.motionZ > -box.motionY) //Moving in +z
				{
					int k = tileZ + 1;
					for(int i = tileX - 1; i < tileX + 2; i++)
					{
						for(int j = tileY - 1; j < tileY + 2; j++)
						{
							box.smashIntoBlock(i, j, k);
						}
					}
				}
				if(-box.motionZ > box.motionX && -box.motionZ > -box.motionX && -box.motionZ > box.motionY && -box.motionZ > -box.motionY) //Moving in -z
				{
					int k = tileZ - 1;
					for(int i = tileX - 1; i < tileX + 2; i++)
					{
						for(int j = tileY - 1; j < tileY + 2; j++)
						{
							box.smashIntoBlock(i, j, k);
						}
					}
				}
				if(box.motionY > box.motionX && box.motionY > -box.motionX && box.motionY > box.motionZ && box.motionY > -box.motionZ) //Moving in +y
				{
					int j = tileY + 1;
					for(int i = tileX - 1; i < tileX + 2; i++)
					{
						for(int k = tileZ - 1; k < tileZ + 2; k++)
						{
							box.smashIntoBlock(i, j, k);
						}
					}
				}
				if(-box.motionY > box.motionX && -box.motionY > -box.motionX && -box.motionY > box.motionZ && -box.motionY > -box.motionZ) //Moving in -y
				{
					int j = tileY - 1;
					for(int i = tileX - 1; i < tileX + 2; i++)
					{
						for(int k = tileZ - 1; k < tileZ + 2; k++)
						{
							box.smashIntoBlock(i, j, k);
						}
					}
				}
			}
			//Entity Collision
			List list = worldObj.getEntitiesWithinAABBExcludingEntity(box, box.boundingBox);
			if(list != null && list.size() > 0)
			{
				for(int j1 = 0; j1 < list.size(); j1++)
				{
					Entity entity = (Entity)list.get(j1);
					if(!isPartOfThis(entity) && entity.canBePushed())
					{
						int damage = (int)((box.motionX * box.motionX + box.motionY * box.motionY + box.motionZ * box.motionZ) * 10D);
						if(damage > 1)
						{
							entity.attackEntityFrom(new EntityDamageSource("plane", box), damage);
							box.attackEntityFrom(new EntityDamageSource("entity", box), damage);
						}
					}
				}
			}
		}
	}
	*/
	
    public boolean attackEntityFrom(DamageSource damagesource, float i, boolean doDamage)
    {
        if(worldObj.isRemote || isDead)
            return true;
        
        PlaneType type = PlaneType.getPlane(driveableType);
        
		if(damagesource.damageType.equals("player") && ((EntityDamageSource)damagesource).getEntity().onGround)
		{
			
			entityDropItem(new ItemStack(type.itemID, 1, dataID), 0.5F);
			getPlaneData().markDirty();
			/*
			} else
			{
				if(type.cockpit != null)
					entityDropItem(new ItemStack(type.cockpit.getItem(), 1), 1.0F);
				if(type.bay != null)
					entityDropItem(new ItemStack(type.bay.getItem(), 1), 1.0F);
				if(type.tail != null && tailHealth > 0)
					entityDropItem(new ItemStack(type.tail.getItem(), 1), 1.0F);
				if(type.dyes)
					entityDropItem(new ItemStack(Item.dyePowder, (type.bigTable ? 10 : 6), type.dyeColour), 1.0F);
				if(leftWingHealth > 0)
					entityDropItem(new ItemStack(type.wings.getItem(), (type.bigTable ? 2 : 1)), 1.0F);
				if(rightWingHealth > 0)
					entityDropItem(new ItemStack(type.wings.getItem(), (type.bigTable ? 4 : 2)), 1.0F);
				for(int j = 0; j < type.numProps; j++)
				{
					if(!propBlown[j] && ((type.propSetup == 0) || (j % 2 == 0 && leftWingHealth > 0) || (j % 2 == 1 && rightWingHealth > 0)))
					{
						entityDropItem(new ItemStack(type.propeller.getItem(), 1), 1.0F);
						entityDropItem(new ItemStack(getPlaneData().engine.getItem(), 1), 1.0F);
					}
				}
				
				//Guns
				for(int j = 0; j < 8; j++)
				{
					if(j == 2 && leftWingHealth <= 0)
						continue;
					if(j == 3 && rightWingHealth <= 0)
						continue;
					if(j == 4 && tailHealth <= 0)
						continue;
					if(getPlaneData().guns[j] != null)
						entityDropItem(new ItemStack(getPlaneData().guns[j].getItem()), 1.0F);
					if(getPlaneData().ammo[j] != null)
						entityDropItem(getPlaneData().ammo[j], 1.0F);
				}
				//Inventory
				for(int j = 0; j < getPlaneData().getFuelSlot() + 1; j++)
				{
					ItemStack stack = getPlaneData().getStackInSlot(j);
					if(stack != null)
						entityDropItem(stack, 1.0F);
				}
			}*/
	 		setDead();
			return true;
		}
		//if(health < 0)
		{
			//Dont explode too much, dont want to cause out of memory errors
			float amountExploded = 0F;
			//Detonate all bombs and fuel
			for(int j = 0; j < type.numBombSlots; j++)
			{
				ItemStack bomb = getPlaneData().getStackInSlot(getPlaneData().getBombInventoryStart() + j);
				if(bomb != null && bomb.getItem() instanceof ItemBullet)
				{
					BulletType bombType = ((ItemBullet)bomb.getItem()).type;
					if(FlansMod.explosions && (bombType.explodeOnImpact || bombType.fuse > 0) && rand.nextBoolean() && amountExploded < 10F)
					{
						worldObj.createExplosion(this, posX + (double)rand.nextGaussian() * 2D, posY + (double)rand.nextGaussian() * 2D, posZ + (double)rand.nextGaussian() * 2D, bombType.explosion, false);
						amountExploded += bombType.explosion;
					}
					else
						entityDropItem(bomb, 1.0F);
				}
				else if(bomb != null)
					entityDropItem(bomb, 1.0F);
			}
			for(int j = type.numBombSlots; j < getPlaneData().getFuelSlot() + 1; j++)
			{
				ItemStack stack = getPlaneData().getStackInSlot(j);
				if(stack != null)
					entityDropItem(stack, 1.0F);
			}
			if(FlansMod.explosions && getPlaneData().fuelInTank > 0 && rand.nextBoolean() && amountExploded < 10F)
			{
				worldObj.createExplosion(this, posX + (double)rand.nextGaussian() * 2D, posY + (double)rand.nextGaussian() * 2D, posZ + (double)rand.nextGaussian() * 2D, (float)getPlaneData().fuelInTank / 200F, false);
			}
			
			//setDead();
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

	public PlaneData getPlaneData() 
	{
		return (PlaneData)driveableData;
	}

	@Override
	protected void dropItemsOnPartDeath(Vector3f midpoint, DriveablePart part) 
	{
		for(Propeller propeller : getPlaneType().propellers)
		{
			//If the propeller is connected to this part, drop it
			if(propeller.planePart == part.type)
			{
				worldObj.spawnEntityInWorld(new EntityItem(worldObj, posX + midpoint.x, posY + midpoint.y, posZ + midpoint.z, new ItemStack(propeller.itemType.item)));
				worldObj.spawnEntityInWorld(new EntityItem(worldObj, posX + midpoint.x, posY + midpoint.y, posZ + midpoint.z, new ItemStack(getDriveableData().engine.item)));
			}
		}
	}
}
