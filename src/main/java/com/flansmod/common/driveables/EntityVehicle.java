package com.flansmod.common.driveables;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.api.IExplodeable;
import com.flansmod.common.FlansMod;
import com.flansmod.common.network.PacketDriveableKey;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.network.PacketVehicleControl;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.tools.ItemTool;
import com.flansmod.common.vector.Vector3f;


public class EntityVehicle extends EntityDriveable implements IExplodeable
{
	/**
	 * Weapon delays
	 */
	public int shellDelay, gunDelay;
	/**
	 * Position of looping sounds
	 */
	public int soundPosition;
	/**
	 * Front wheel yaw, used to control the vehicle steering
	 */
	public float wheelsYaw;
	/**
	 * Despawn time
	 */
	private int ticksSinceUsed = 0;
	/**
	 * Aesthetic door switch
	 */
	public boolean varDoor;
	/**
	 * Wheel rotation angle. Only applies to vehicles that set a rotating wheels flag
	 */
	public float wheelsAngle;
	/**
	 * Delayer for door button
	 */
	public int toggleTimer = 0;
	
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
		initType(type, true, false);
	}
	
	//This one allows you to deal with spawning from items
	public EntityVehicle(World world, double x, double y, double z, EntityPlayer placer, VehicleType type, DriveableData data)
	{
		super(world, type, data);
		stepHeight = 1.0F;
		setPosition(x, y, z);
		rotateYaw(placer.rotationYaw + 90F);
		initType(type, true, false);
	}
	
	@Override
	protected void initType(DriveableType type, boolean firstSpawn, boolean clientSide)
	{
		super.initType(type, firstSpawn, clientSide);
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
	 *
	 * @param deltaY
	 * @param deltaX
	 */
	@Override
	public void onMouseMoved(int deltaX, int deltaY)
	{
	}
	
	@Override
	public void setPositionRotationAndMotion(double x, double y, double z, float yaw, float pitch, float roll, double motX, double motY, double motZ, float velYaw, float velPitch, float velRoll, float throt, float steeringYaw)
	{
		super.setPositionRotationAndMotion(x, y, z, yaw, pitch, roll, motX, motY, motZ, velYaw, velPitch, velRoll, throt, steeringYaw);
		wheelsYaw = steeringYaw;
	}
	
	@Override
	public boolean processInitialInteract(EntityPlayer entityplayer, EnumHand hand)
	{
		if(isDead)
			return false;
		if(world.isRemote)
			return false;
		
		//If they are using a repair tool, don't put them in
		ItemStack currentItem = entityplayer.getHeldItemMainhand();
		if(currentItem != null && currentItem.getItem() instanceof ItemTool && ((ItemTool)currentItem.getItem()).type.healDriveables)
			return true;
		
		VehicleType type = getVehicleType();
		//Check each seat in order to see if the player can sit in it
		for(int i = 0; i <= type.numPassengers; i++)
		{
			if(getSeat(i).processInitialInteract(entityplayer, hand))
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
		if(world.isRemote && (key == 6 || key == 8 || key == 9))
		{
			FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
			return true;
		}
		switch(key)
		{
			case 0: //Accelerate : Increase the throttle, up to 1.
			{
				throttle += 0.01F;
				if(throttle > 1F)
					throttle = 1F;
				return true;
			}
			case 1: //Decelerate : Decrease the throttle, down to -1, or 0 if the vehicle cannot reverse
			{
				throttle -= 0.01F;
				if(throttle < -1F)
					throttle = -1F;
				if(throttle < 0F && type.maxNegativeThrottle == 0F)
					throttle = 0F;
				return true;
			}
			case 2: //Left : Yaw the wheels left
			{
				wheelsYaw -= 1F;
				return true;
			}
			case 3: //Right : Yaw the wheels right
			{
				wheelsYaw += 1F;
				return true;
			}
			case 4: //Up : Brake
			{
				throttle *= 0.8F;
				if(onGround)
				{
					motionX *= 0.8F;
					motionZ *= 0.8F;
				}
				return true;
			}
			case 5: //Down : Do nothing
			{
				return true;
			}
			case 6: //Exit : Get out
			{
				getSeat(0).removePassengers();
				return true;
			}
			case 7: //Inventory
			{
				if(world.isRemote)
				{
					FlansMod.proxy.openDriveableMenu((EntityPlayer)getSeat(0).getControllingPassenger(), world, this);
				}
				return true;
			}
			case 8: //Shoot shell
			case 9: //Shoot bullet
			{
				return super.pressKey(key, player);
			}
			case 10: //Change control mode : Do nothing
			{
				return true;
			}
			case 11: //Roll left : Do nothing
			{
				return true;
			}
			case 12: //Roll right : Do nothing
			{
				return true;
			}
			case 13: // Gear : Do nothing
			{
				return true;
			}
			case 14: // Door
			{
				if(toggleTimer <= 0)
				{
					varDoor = !varDoor;
					if(type.hasDoor)
						player.sendMessage(new TextComponentString("Doors " + (varDoor ? "open" : "closed")));
					toggleTimer = 10;
					FlansMod.getPacketHandler().sendToServer(new PacketVehicleControl(this));
				}
				return true;
			}
			case 15: // Wing : Do nothing
			{
				return true;
			}
			case 16: // Trim Button
			{
				//applyTorque(new Vector3f(axes.getRoll() / 10, 0F, 0F));
				return true;
			}
			case 17: //Park
			{
				break;
			}
		}
		return false;
	}
	
	@Override
	public Vector3f getLookVector(DriveablePosition dp)
	{
		return rotate(getSeat(0).looking.getXAxis());
	}
	
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		
		if(!readyForUpdates)
		{
			return;
		}
		
		//Get vehicle type
		VehicleType type = this.getVehicleType();
		DriveableData data = getDriveableData();
		if(type == null)
		{
			FlansMod.log.warn("Vehicle type null. Not ticking vehicle");
			return;
		}
		
		//Work out if this is the client side and the player is driving
		boolean thePlayerIsDrivingThis = world.isRemote && getSeat(0) != null && getSeat(0).getControllingPassenger() instanceof EntityPlayer
				&& FlansMod.proxy.isThePlayer((EntityPlayer)getSeat(0).getControllingPassenger());
		
		//Despawning
		ticksSinceUsed++;
		if(!world.isRemote && getSeat(0).getControllingPassenger() != null)
			ticksSinceUsed = 0;
		if(!world.isRemote && TeamsManager.vehicleLife > 0 && ticksSinceUsed > TeamsManager.vehicleLife * 20)
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
			wheelsAngle += throttle * 0.2F;
		}
		
		//Return the wheels to their resting position
		wheelsYaw *= 0.9F;
		
		//Limit wheel angles
		if(wheelsYaw > 20)
			wheelsYaw = 20;
		if(wheelsYaw < -20)
			wheelsYaw = -20;
		
		//Player is not driving this. Update its position from server update packets 
		if(world.isRemote && !thePlayerIsDrivingThis)
		{
			//The driveable is currently moving towards its server position. Continue doing so.
			if(serverPositionTransitionTicker > 0)
			{
				double x = posX + (serverPosX - posX) / serverPositionTransitionTicker;
				double y = posY + (serverPosY - posY) / serverPositionTransitionTicker;
				double z = posZ + (serverPosZ - posZ) / serverPositionTransitionTicker;
				double dYaw = MathHelper.wrapDegrees(serverYaw - axes.getYaw());
				double dPitch = MathHelper.wrapDegrees(serverPitch - axes.getPitch());
				double dRoll = MathHelper.wrapDegrees(serverRoll - axes.getRoll());
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
			if(wheel != null && world != null)
			{
				wheel.prevPosX = wheel.posX;
				wheel.prevPosY = wheel.posY;
				wheel.prevPosZ = wheel.posZ;
			}
		}
		
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
			if(!type.tank && (wheel.getExpectedWheelID() == 2 || wheel.getExpectedWheelID() == 3))
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
			boolean canThrustCreatively = !TeamsManager.vehiclesNeedFuel || (getSeat(0) != null
					&& getSeat(0).getControllingPassenger() instanceof EntityPlayer && ((EntityPlayer)getSeat(0).getControllingPassenger()).capabilities.isCreativeMode);
			//Otherwise, check the fuel tanks!
			if(canThrustCreatively || data.fuelInTank > data.engine.fuelConsumption * throttle)
			{
				if(getVehicleType().tank)
				{
					boolean left = wheel.getExpectedWheelID() == 0 || wheel.getExpectedWheelID() == 3;
					
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
					if(wheel.getExpectedWheelID() == 2 || wheel.getExpectedWheelID() == 3)
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
			
			if(type.floatOnWater && world.containsAnyLiquid(wheel.getEntityBoundingBox()))
			{
				wheel.motionY += type.buoyancy;
			}
			
			wheel.move(MoverType.PLAYER, wheel.motionX, wheel.motionY, wheel.motionZ);
			
			//Pull wheels towards car
			Vector3f targetWheelPos = axes.findLocalVectorGlobally(getVehicleType().wheelPositions[wheel.getExpectedWheelID()].position);
			Vector3f currentWheelPos = new Vector3f(wheel.posX - posX, wheel.posY - posY, wheel.posZ - posZ);
			
			Vector3f dPos = ((Vector3f)Vector3f.sub(targetWheelPos, currentWheelPos, null).scale(getVehicleType().wheelSpringStrength));
			
			if(dPos.length() > 0.001F)
			{
				wheel.move(MoverType.PLAYER, dPos.x, dPos.y, dPos.z);
				dPos.scale(0.5F);
				Vector3f.sub(amountToMoveCar, dPos, amountToMoveCar);
			}
		}
		
		move(MoverType.PLAYER, amountToMoveCar.x, amountToMoveCar.y, amountToMoveCar.z);
		
		if(wheels[0] != null && wheels[1] != null && wheels[2] != null && wheels[3] != null)
		{
			Vector3f frontAxleCentre = new Vector3f((wheels[2].posX + wheels[3].posX) / 2F, (wheels[2].posY + wheels[3].posY) / 2F, (wheels[2].posZ + wheels[3].posZ) / 2F);
			Vector3f backAxleCentre = new Vector3f((wheels[0].posX + wheels[1].posX) / 2F, (wheels[0].posY + wheels[1].posY) / 2F, (wheels[0].posZ + wheels[1].posZ) / 2F);
			Vector3f leftSideCentre = new Vector3f((wheels[0].posX + wheels[3].posX) / 2F, (wheels[0].posY + wheels[3].posY) / 2F, (wheels[0].posZ + wheels[3].posZ) / 2F);
			Vector3f rightSideCentre = new Vector3f((wheels[1].posX + wheels[2].posX) / 2F, (wheels[1].posY + wheels[2].posY) / 2F, (wheels[1].posZ + wheels[2].posZ) / 2F);
			
			float dx = frontAxleCentre.x - backAxleCentre.x;
			float dy = frontAxleCentre.y - backAxleCentre.y;
			float dz = frontAxleCentre.z - backAxleCentre.z;
			float drx = leftSideCentre.x - rightSideCentre.x;
			float dry = leftSideCentre.y - rightSideCentre.y;
			float drz = leftSideCentre.z - rightSideCentre.z;
			
			
			float dxz = (float)Math.sqrt(dx * dx + dz * dz);
			float drxz = (float)Math.sqrt(drx * drx + drz * drz);
			
			float yaw = (float)Math.atan2(dz, dx);
			float pitch = -(float)Math.atan2(dy, dxz);
			float roll = 0F;
			if(type.canRoll)
			{
				roll = -(float)Math.atan2(dry, drxz);
			}
			
			if(type.tank)
			{
				yaw = (float)Math.atan2(wheels[3].posZ - wheels[2].posZ, wheels[3].posX - wheels[2].posX) + (float)Math.PI / 2F;
			}
			
			axes.setAngles(yaw * 180F / 3.14159F, pitch * 180F / 3.14159F, roll * 180F / 3.14159F);
		}
		
		checkForCollisions();
		
		//Sounds
		//Starting sound
		if(throttle > 0.01F && throttle < 0.2F && soundPosition == 0 && hasEnoughFuel())
		{
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, 50, dimension, type.startSound, false);
			soundPosition = type.startSoundLength;
		}
		//Flying sound
		if(throttle > 0.2F && soundPosition == 0 && hasEnoughFuel())
		{
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, 50, dimension, type.engineSound, false);
			soundPosition = type.engineSoundLength;
		}
		
		for(EntitySeat seat : getSeats())
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
		if(!world.isRemote && ticksExisted % 5 == 0)
		{
			FlansMod.getPacketHandler().sendToAllAround(new PacketVehicleControl(this), posX, posY, posZ, FlansMod.driveableUpdateRange, dimension);
		}
		
		int animSpeed = 4;
		//Change animation speed based on our current throttle
		if((throttle > 0.05 && throttle <= 0.33) || (throttle < -0.05 && throttle >= -0.33))
		{
			animSpeed = 3;
		}
		else if((throttle > 0.33 && throttle <= 0.66) || (throttle < -0.33 && throttle >= -0.66))
		{
			animSpeed = 2;
		}
		else if((throttle > 0.66 && throttle <= 0.9) || (throttle < -0.66 && throttle >= -0.9))
		{
			animSpeed = 1;
		}
		else if((throttle > 0.9 && throttle <= 1) || (throttle < -0.9 && throttle >= -1))
		{
			animSpeed = 0;
		}
		
		if(throttle > 0.05)
		{
			animCount--;
		}
		else if(throttle < -0.05)
		{
			animCount++;
		}
		
		if(animCount <= 0)
		{
			animCount = animSpeed;
			animFrame++;
		}
		
		if(throttle < 0)
		{
			if(animCount >= animSpeed)
			{
				animCount = 0;
				animFrame--;
			}
		}
		//Cycle the animation frame, but only if we have anything to cycle
		if(type.animFrames != 0)
		{
			if(animFrame > type.animFrames)
			{
				animFrame = 0;
			}
			if(animFrame < 0)
			{
				animFrame = type.animFrames;
			}
		}
	}
	
	private float averageAngles(float a, float b)
	{
		FlansMod.log.debug("Pre  " + a + " " + b);
		
		float pi = (float)Math.PI;
		for(; a > b + pi; a -= 2 * pi) ;
		for(; a < b - pi; a += 2 * pi) ;
		
		float avg = (a + b) / 2F;
		
		for(; avg > pi; avg -= 2 * pi) ;
		for(; avg < -pi; avg += 2 * pi) ;
		
		FlansMod.log.debug("Post " + a + " " + b + " " + avg);
		
		return avg;
	}
	
	private Vec3d subtract(Vec3d a, Vec3d b)
	{
		return new Vec3d(a.x - b.x, a.y - b.y, a.z - b.z);
	}
	
	private Vec3d crossProduct(Vec3d a, Vec3d b)
	{
		return new Vec3d(a.y * b.z - a.z * b.y, a.z * b.x - a.x * b.z, a.x * b.y - a.y * b.x);
	}
	
	@Override
	public boolean landVehicle()
	{
		return true;
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource damagesource, float i)
	{
		if(world.isRemote || isDead)
			return true;
		
		VehicleType type = getVehicleType();
		
		if(damagesource.damageType.equals("player") && damagesource.getTrueSource().onGround && (getSeat(0) == null || getSeat(0).getControllingPassenger() == null))
		{
			ItemStack vehicleStack = new ItemStack(type.item, 1, driveableData.paintjobID);
			NBTTagCompound tags = new NBTTagCompound();
			vehicleStack.setTagCompound(tags);
			driveableData.writeToNBT(tags);
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
	@SideOnly(Side.CLIENT)
	public EntityLivingBase getCamera()
	{
		return null;
	}
	
	@Override
	public void setDead()
	{
		super.setDead();
	}
}
