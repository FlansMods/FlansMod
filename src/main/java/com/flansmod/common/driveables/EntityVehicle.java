package com.flansmod.common.driveables;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import com.flansmod.api.IExplodeable;
import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.common.FlansMod;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.network.PacketDriveableKey;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.network.PacketVehicleControl;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.tools.ItemTool;
import com.flansmod.common.vector.Matrix4f;
import com.flansmod.common.vector.Vector3f;


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
    /** Wheel entities for collision and motion calculation */
    public EntityWheel[] wheels;
    
    public EntityVehicle(World world)
    {
        super(world);
        stepHeight = 1.0F;
    }
    
    //This one deals with spawning from a vehicle spawner
	public EntityVehicle(World world, double x, double y, double z, VehicleType type, DriveableData data)
	{
		super(world, type, data);
		stepHeight = 1.0F;
		setPosition(x, y, z);
		initType(type, false);
	}
    
	//This one allows you to deal with spawning from items
	public EntityVehicle(World world, double x, double y, double z, EntityPlayer placer, VehicleType type, DriveableData data)
	{
		super(world, type, data);
		stepHeight = 1.0F;
		setPosition(x, y, z);
		rotateYaw(placer.rotationYaw + 90F);
		initType(type, false);
	}
	
	@Override
	protected void initType(DriveableType type, boolean clientSide)
	{
		super.initType(type, clientSide);
		wheels = new EntityWheel[4];
		for(int i = 0; i < 4; i++)
		{
			if(!clientSide)
			{
				wheels[i] = new EntityWheel(worldObj, this, i);
				worldObj.spawnEntityInWorld(wheels[i]);
			}
		}
		stepHeight = ((VehicleType)type).wheelStepHeight;
	}
	
	@Override
	public void readSpawnData(ByteBuf data)
	{
		super.readSpawnData(data);
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
	public boolean interactFirst(EntityPlayer entityplayer)
    {
		if(isDead)
			return false;
		if(worldObj.isRemote)
			return false;
		
		//If they are using a repair tool, don't put them in
		ItemStack currentItem = entityplayer.getCurrentEquippedItem();
		if(currentItem != null && currentItem.getItem() instanceof ItemTool && ((ItemTool)currentItem.getItem()).type.healDriveables)
			return true;
		
		VehicleType type = getVehicleType();
		//Check each seat in order to see if the player can sit in it
		for(int i = 0; i <= type.numPassengers; i++)
		{
			if(seats[i].interactFirst(entityplayer))
			{
				if(i == 0)
				{
					shellDelay = type.vehicleShellDelay;
					FlansMod.proxy.doTutorialStuff(entityplayer, this);
				}
				return true;
			}
		}
        return false;
    }
	
    @Override
	public boolean pressKey(int key, EntityPlayer player)
	{
    	VehicleType type = getVehicleType();
    	//Send keys which require server side updates to the server
    	if(worldObj.isRemote && (key == 6 || key == 8 || key == 9))
    	{
    		FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
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
			case 8 : //Shoot shell
			case 9 : //Shoot bullet
			{
				return super.pressKey(key, player);
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
						player.addChatMessage(new ChatComponentText("Doors " + (varDoor ? "open" : "closed")));
					toggleTimer = 10;
					FlansMod.getPacketHandler().sendToServer(new PacketVehicleControl(this));
				}
				return true;
			}
			case 15 : // Wing : Do nothing
			{
				return true;
			}
            case 16 : // Trim Button
            {
				//applyTorque(new Vector3f(axes.getRoll() / 10, 0F, 0F));
				return true;
            }
            case 17 : //Park
            {
                break;
            }
		}
		return false;
	}
    
    @Override
	public Vector3f getLookVector(DriveablePosition dp)
    {
		return rotate(seats[0].looking.getXAxis());
    }
	
    @Override
	public void onUpdate()
    {
        super.onUpdate();
        
		//Get vehicle type
        VehicleType type = this.getVehicleType();
        DriveableData data = getDriveableData();
        if(type == null)
        {
        	FlansMod.log("Vehicle type null. Not ticking vehicle");
        	return;
        }
        
        if(!worldObj.isRemote)
        {
        	for(int i = 0; i < 4; i++)
        	{
        		if(wheels[i] == null || !wheels[i].addedToChunk)
        		{
        			wheels[i] = new EntityWheel(worldObj, this, i);
    				worldObj.spawnEntityInWorld(wheels[i]);
        		}
        	}
        }
        
        //Work out if this is the client side and the player is driving
        boolean thePlayerIsDrivingThis = worldObj.isRemote && seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && FlansMod.proxy.isThePlayer((EntityPlayer)seats[0].riddenByEntity);
                
        //Despawning
		ticksSinceUsed++;
		if(!worldObj.isRemote && seats[0].riddenByEntity != null)
			ticksSinceUsed = 0;
		if(!worldObj.isRemote && TeamsManager.vehicleLife > 0 && ticksSinceUsed > TeamsManager.vehicleLife * 20)
		{
			setDead();
		}
		
		//Shooting, inventories, etc.
		//Decrement shell and gun timers
		if(shellDelay > 0)
			shellDelay--;
		if(gunDelay > 0)
			gunDelay--;
		if(toggleTimer > 0)
			toggleTimer--;
		if(soundPosition > 0)
			soundPosition--;
		
		//Aesthetics
		//Rotate the wheels
		if(hasEnoughFuel())
		{
			wheelsAngle += throttle / 7F;	
		}
		
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
                double x = posX + (serverPosX - posX) / serverPositionTransitionTicker;
                double y = posY + (serverPosY - posY) / serverPositionTransitionTicker;
                double z = posZ + (serverPosZ - posZ) / serverPositionTransitionTicker;
                double dYaw = MathHelper.wrapAngleTo180_double(serverYaw - axes.getYaw());
                double dPitch = MathHelper.wrapAngleTo180_double(serverPitch - axes.getPitch());
                double dRoll = MathHelper.wrapAngleTo180_double(serverRoll - axes.getRoll());
                rotationYaw = (float)(axes.getYaw() + dYaw / serverPositionTransitionTicker);
                rotationPitch = (float)(axes.getPitch() + dPitch / serverPositionTransitionTicker);
                float rotationRoll = (float)(axes.getRoll() + dRoll / serverPositionTransitionTicker);
                --serverPositionTransitionTicker;
                setPosition(x, y, z);
                setRotation(rotationYaw, rotationPitch, rotationRoll);
                //return;
            }
            //If the driveable is at its server position and does not have the next update, it should just simulate itself as a server side driveable would, so continue
		}
		
		//Movement

		Vector3f amountToMoveCar = new Vector3f();
		
		for(EntityWheel wheel : wheels)
		{
			if(wheel == null)
				continue;
			
			//Hacky way of forcing the car to step up blocks
			onGround = true;
			wheel.onGround = true;
			
			//Update angles
			wheel.rotationYaw = axes.getYaw();
			//Front wheels
			if(!type.tank && (wheel.ID == 2 || wheel.ID == 3))
			{
				wheel.rotationYaw += wheelsYaw;
			}
			
			wheel.motionX *= 0.9F;
			wheel.motionY *= 0.9F;
			wheel.motionZ *= 0.9F;
			
			//Apply gravity
			wheel.motionY -= 0.98F / 20F;
			
			//Apply velocity
			//If the player driving this is in creative, then we can thrust, no matter what
			boolean canThrustCreatively = !TeamsManager.vehiclesNeedFuel || (seats != null && seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode);
			//Otherwise, check the fuel tanks!
			if(canThrustCreatively || data.fuelInTank > data.engine.fuelConsumption * throttle)
			{
				if(getVehicleType().tank)
				{
					boolean left = wheel.ID == 0 || wheel.ID == 3;
					
					float turningDrag = 0.02F;
					wheel.motionX *= 1F - (Math.abs(wheelsYaw) * turningDrag);
					wheel.motionZ *= 1F - (Math.abs(wheelsYaw) * turningDrag);
					
					float velocityScale = 0.04F * (throttle > 0 ? type.maxThrottle : type.maxNegativeThrottle) * data.engine.engineSpeed;
					float steeringScale = 0.1F * (wheelsYaw > 0 ? type.turnLeftModifier : type.turnRightModifier);
					float effectiveWheelSpeed = (throttle + (wheelsYaw * (left ? 1 : -1) * steeringScale)) * velocityScale;
					wheel.motionX += effectiveWheelSpeed * Math.cos(wheel.rotationYaw * 3.14159265F / 180F);
					wheel.motionZ += effectiveWheelSpeed * Math.sin(wheel.rotationYaw * 3.14159265F / 180F);
					
	
				}
				else
				{
					//if(getVehicleType().fourWheelDrive || wheel.ID == 0 || wheel.ID == 1)
					{
						float velocityScale = 0.1F * throttle * (throttle > 0 ? type.maxThrottle : type.maxNegativeThrottle) * data.engine.engineSpeed;
						wheel.motionX += Math.cos(wheel.rotationYaw * 3.14159265F / 180F) * velocityScale;
						wheel.motionZ += Math.sin(wheel.rotationYaw * 3.14159265F / 180F) * velocityScale;
					}
					
					//Apply steering
					if(wheel.ID == 2 || wheel.ID == 3)
					{
						float velocityScale = 0.01F * (wheelsYaw > 0 ? type.turnLeftModifier : type.turnRightModifier) * (throttle > 0 ? 1 : -1);
		
						wheel.motionX -= wheel.getSpeedXZ() * Math.sin(wheel.rotationYaw * 3.14159265F / 180F) * velocityScale * wheelsYaw;
						wheel.motionZ += wheel.getSpeedXZ() * Math.cos(wheel.rotationYaw * 3.14159265F / 180F) * velocityScale * wheelsYaw;
					}
					else
					{
						wheel.motionX *= 0.9F;
						wheel.motionZ *= 0.9F;
					}
				}
			}

			wheel.moveEntity(wheel.motionX, wheel.motionY, wheel.motionZ);
			
			//Pull wheels towards car
			Vector3f targetWheelPos = axes.findLocalVectorGlobally(getVehicleType().wheelPositions[wheel.ID]);
			Vector3f currentWheelPos = new Vector3f(wheel.posX - posX, wheel.posY - posY, wheel.posZ - posZ);
			
			Vector3f dPos = ((Vector3f)Vector3f.sub(targetWheelPos, currentWheelPos, null).scale(getVehicleType().wheelSpringStrength));
				
			if(dPos.length() > 0.001F)
			{
				wheel.moveEntity(dPos.x, dPos.y, dPos.z);
				dPos.scale(0.5F);
				Vector3f.sub(amountToMoveCar, dPos, amountToMoveCar);
			}
		}
		
		moveEntity(amountToMoveCar.x, amountToMoveCar.y, amountToMoveCar.z);
		
		if(wheels[0] != null && wheels[1] != null && wheels[2] != null && wheels[3] != null)
		{
			Vector3f frontAxleCentre = new Vector3f((wheels[2].posX + wheels[3].posX) / 2F, (wheels[2].posY + wheels[3].posY) / 2F, (wheels[2].posZ + wheels[3].posZ) / 2F); 
			Vector3f backAxleCentre = new Vector3f((wheels[0].posX + wheels[1].posX) / 2F, (wheels[0].posY + wheels[1].posY) / 2F, (wheels[0].posZ + wheels[1].posZ) / 2F); 
			
			float dx = frontAxleCentre.x - backAxleCentre.x;
			float dy = frontAxleCentre.y - backAxleCentre.y;
			float dz = frontAxleCentre.z - backAxleCentre.z;
			
			float dxz = (float)Math.sqrt(dx * dx + dz * dz);
			
			float yaw = (float)Math.atan2(dz, dx);
			float pitch = -(float)Math.atan2(dy, dxz);
			float roll = 0;
			
			if(type.tank)
			{
				yaw = (float)Math.atan2(wheels[3].posZ - wheels[2].posZ, wheels[3].posX - wheels[2].posX) + (float)Math.PI / 2F;
				//yaw = averageAngles((float)Math.atan2(wheels[3].posZ - wheels[2].posZ, wheels[3].posX - wheels[2].posX),(float)Math.atan2(wheels[1].posZ - wheels[0].posZ, wheels[1].posX - wheels[0].posX));
			}
			
			axes.setAngles(yaw * 180F / 3.14159F, pitch * 180F / 3.14159F, roll * 180F / 3.14159F);
		}
		
		/*
		Vec3 zAxis2 = subtract(wheelVectors[1], wheelVectors[0]).normalize();
		Vec3 xAxis = subtract(wheelVectors[3], wheelVectors[0]).normalize();
		Vec3 yAxis = crossProduct(zAxis2, xAxis);
		Matrix4f rotationMatrix = new Matrix4f();
		rotationMatrix.m00 = (float)xAxis.xCoord;
		rotationMatrix.m10 = (float)xAxis.yCoord;
		rotationMatrix.m20 = (float)xAxis.zCoord;
		rotationMatrix.m01 = (float)yAxis.xCoord;
		rotationMatrix.m11 = (float)yAxis.yCoord;
		rotationMatrix.m21 = (float)yAxis.zCoord;
		rotationMatrix.m02 = (float)zAxis2.xCoord;
		rotationMatrix.m12 = (float)zAxis2.yCoord;
		rotationMatrix.m22 = (float)zAxis2.zCoord;
		axes = new RotatedAxes(rotationMatrix);
*/
		
		//Fuel Handling
		
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
				data.fuelInTank += 5000;
				data.fuel = new ItemStack(Items.bucket);
			}
			else if(data.fuel.isItemEqual(FlansMod.hooks.BuildCraftFuelBucket) && data.fuelInTank + 1000 <= type.fuelTankSize)
			{
				data.fuelInTank += 10000;
				data.fuel = new ItemStack(Items.bucket);
			}
		}

		//Sounds
		//Starting sound
		if (throttle > 0.01F && throttle < 0.2F && soundPosition == 0 && hasEnoughFuel())
		{
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, 50, dimension, type.startSound, false);
			soundPosition = type.startSoundLength;
		}
		//Flying sound
		if (throttle > 0.2F && soundPosition == 0 && hasEnoughFuel())
		{
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, 50, dimension, type.engineSound, false);
			soundPosition = type.engineSoundLength;
		}
		
		for(EntitySeat seat : seats)
		{
			if(seat != null)
				seat.updatePosition();
		}
		
		//Calculate movement on the client and then send position, rotation etc to the server
		if(thePlayerIsDrivingThis)
		{
			FlansMod.getPacketHandler().sendToServer(new PacketVehicleControl(this));
			serverPosX = posX;
			serverPosY = posY;
			serverPosZ = posZ;
			serverYaw = axes.getYaw();
		}
		
		//If this is the server, send position updates to everyone, having received them from the driver
		if(!worldObj.isRemote && ticksExisted % 5 == 0)
		{
			FlansMod.getPacketHandler().sendToAllAround(new PacketVehicleControl(this), posX, posY, posZ, FlansMod.driveableUpdateRange, dimension);
		}
    }
    
    private float averageAngles(float a, float b)
    {
    	FlansMod.log("Pre  " + a + " " + b);
    	
    	float pi = (float)Math.PI;
    	for(; a > b + pi; a -= 2 * pi) ;
    	for(; a < b - pi; a += 2 * pi) ;
    	
    	float avg = (a + b) / 2F;
    		
    	for(; avg > pi; avg -= 2 * pi) ;
    	for(; avg < -pi; avg += 2 * pi) ;
    	
    	FlansMod.log("Post " + a + " " + b + " " + avg);
    	
    	return avg;
    }
    
	private Vec3 subtract(Vec3 a, Vec3 b)
	{
		return Vec3.createVectorHelper(a.xCoord - b.xCoord, a.yCoord - b.yCoord, a.zCoord - b.zCoord);
	}
	
	private Vec3 crossProduct(Vec3 a, Vec3 b)
	{
        return Vec3.createVectorHelper(a.yCoord * b.zCoord - a.zCoord * b.yCoord, a.zCoord * b.xCoord - a.xCoord * b.zCoord, a.xCoord * b.yCoord - a.yCoord * b.xCoord);
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
	    	int y = MathHelper.floor_double(posY + globalMidPoint.y - getVehicleType().wheelStepHeight);
	    	int z = MathHelper.floor_double(posZ + globalMidPoint.z);
	    	
	    	//If its solid on top
	    	if(!worldObj.isAirBlock(x, y, z))
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
    
    @Override
    public boolean landVehicle()
    {
    	return true;
    }

    @Override
    public boolean attackEntityFrom(DamageSource damagesource, float i)
    {
        if(worldObj.isRemote || isDead)
            return true;
        
        VehicleType type = getVehicleType();
        
		if(damagesource.damageType.equals("player") && ((EntityDamageSource)damagesource).getEntity().onGround && (seats[0] == null || seats[0].riddenByEntity == null))
		{
			ItemStack vehicleStack = new ItemStack(type.item, 1, 0);
			vehicleStack.stackTagCompound = new NBTTagCompound();
			driveableData.writeToNBT(vehicleStack.stackTagCompound);
			entityDropItem(vehicleStack, 0.5F);
	 		setDead();
		}
        return true;
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
		return "Mines";
	}
	
	@Override
	public String getMissileInventoryName() 
	{
		return "Shells";
	}
	
	@Override
	public boolean hasMouseControlMode()
	{
		return false;
	}
	
	@Override
	public void setDead()
	{
		super.setDead();
		for(EntityWheel wheel : wheels)
			if(wheel != null)
				wheel.setDead();
	}
}
