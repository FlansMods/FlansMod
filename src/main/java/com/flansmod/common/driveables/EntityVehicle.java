package com.flansmod.common.driveables;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.api.IExplodeable;
import com.flansmod.client.model.AnimTankTrack;
import com.flansmod.client.model.AnimTrackLink;
import com.flansmod.common.FlansMod;
import com.flansmod.common.RotatedAxes;
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
	
	public AnimTankTrack rightTrack;
	public AnimTankTrack leftTrack;
	
	public AnimTrackLink[] trackLinksLeft = new AnimTrackLink[0];
	public AnimTrackLink[] trackLinksRight = new AnimTrackLink[0];
	
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
	public EntityVehicle(World world, double x, double y, double z, EntityPlayer placer, VehicleType type,
						 DriveableData data)
	{
		super(world, type, data);
		stepHeight = 1.0F;
		setPosition(x, y, z);
		rotateYaw(placer.rotationYaw + 90F);
		initType(type, true, false);
	}
	
	public void setupTracks(DriveableType type)
	{
		rightTrack = new AnimTankTrack(type.rightTrackPoints, type.trackLinkLength);
		leftTrack = new AnimTankTrack(type.leftTrackPoints, type.trackLinkLength);
		int numLinks = Math.round(rightTrack.getTrackLength() / type.trackLinkLength);
		trackLinksLeft = new AnimTrackLink[numLinks];
		trackLinksRight = new AnimTrackLink[numLinks];
		for(int i = 0; i < numLinks; i++)
		{
			float progress = 0.01F + (type.trackLinkLength * i);
			int trackPart = leftTrack.getTrackPart(progress);
			trackLinksLeft[i] = new AnimTrackLink(progress);
			trackLinksRight[i] = new AnimTrackLink(progress);
			trackLinksLeft[i].position = leftTrack.getPositionOnTrack(progress);
			trackLinksRight[i].position = rightTrack.getPositionOnTrack(progress);
			trackLinksLeft[i].rot = new RotatedAxes(0,
				0,
				rotateTowards(leftTrack.points.get((trackPart == 0) ? leftTrack.points.size() - 1 : trackPart - 1),
					trackLinksLeft[i].position));
			trackLinksRight[i].rot = new RotatedAxes(0,
				0,
				rotateTowards(rightTrack.points.get((trackPart == 0) ? rightTrack.points.size() - 1 : trackPart - 1),
					trackLinksRight[i].position));
			trackLinksLeft[i].zRot = rotateTowards(leftTrack.points
				.get((trackPart == 0) ? leftTrack.points.size() - 1 : trackPart - 1), trackLinksLeft[i].position);
			trackLinksRight[i].zRot = rotateTowards(rightTrack.points
				.get((trackPart == 0) ? rightTrack.points.size() - 1 : trackPart - 1), trackLinksRight[i].position);
		}
	}
	
	@Override
	protected void initType(DriveableType type, boolean firstSpawn, boolean clientSide)
	{
		setupTracks(type);
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
	public void setPositionRotationAndMotion(double x, double y, double z, float yaw, float pitch, float roll,
											 double motX, double motY, double motZ, float velYaw, float velPitch,
											 float velRoll, float throttle, float steeringYaw)
	{
		super.setPositionRotationAndMotion(x, y, z, yaw, pitch, roll, motX, motY, motZ, velYaw, velPitch, velRoll,
			throttle, steeringYaw);
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
		if(currentItem.getItem() instanceof ItemTool && ((ItemTool)currentItem.getItem()).type.healDriveables)
			return true;
		
		VehicleType type = getVehicleType();
		//Check each seat in order to see if the player can sit in it
		for(int i = 0; i <= type.numPassengers; i++)
		{
			if(getSeat(i).processInitialInteract(entityplayer, hand))
			{
				if(i == 0)
				{
					shellDelay = type.shootDelayPrimary;
					FlansMod.proxy.doTutorialStuff(entityplayer, this);
				}
				return true;
			}
		}
		return false;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean pressKey(int key, EntityPlayer player, boolean isOnEvent)
	{
		VehicleType type = getVehicleType();
		switch(key)
		{
			case 0: // Accelerate : Increase the throttle, up to 1.
			{
				throttle += 0.01F;
				if(throttle > 1F)
					throttle = 1F;
				return true;
			}
			case 1: // Decelerate : Decrease the throttle, down to -1, or 0 if the vehicle cannot reverse
			{
				throttle -= 0.01F;
				if(throttle < -1F)
					throttle = -1F;
				if(throttle < 0F && type.maxNegativeThrottle == 0F)
					throttle = 0F;
				return true;
			}
			case 2: // Left : Yaw the wheels left
			{
				wheelsYaw -= 1F;
				return true;
			}
			case 3: // Right : Yaw the wheels right
			{
				wheelsYaw += 1F;
				return true;
			}
			case 4: // Up : Brake
			{
				throttle *= 0.8F;
				if(onGround)
				{
					motionX *= 0.8F;
					motionZ *= 0.8F;
				}
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
			case 25:
			{
				EntitySeat[] vehicleSeats = getSeats();
				EntitySeat playerSeat = getSeat(player);
				EnumHand hand = player.getActiveHand();
				if(vehicleSeats.length > (playerSeat.getExpectedSeatID() + 1))
				{
					int newSeatID = playerSeat.getExpectedSeatID() + 1;
					EntitySeat newSeat = getSeat(newSeatID);
					newSeat.processInitialInteract(player, hand);
				}
				else
				{
					EntitySeat newSeat = getSeat(0);
					newSeat.processInitialInteract(player, hand);
				}
				return true;
			}
			default:
			{
				return super.pressKey(key, player, isOnEvent);
			}
		}
	}
	
	@Override
	public Vector3f getLookVector(ShootPoint shootPoint)
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
		
		animateFancyTracks();
		
		//Work out if this is the client side and the player is driving
		boolean thePlayerIsDrivingThis =
			world.isRemote && getSeat(0) != null && getSeat(0).getControllingPassenger() instanceof EntityPlayer
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
				moveTowardServerPosition();
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
			EntityPlayer driver = getDriver();
			if(canThrust(data, driver))
			{
				if (!driverIsCreative())
				{
					data.fuelInTank -= data.engine.fuelConsumption * throttle;
				}

				if(getVehicleType().tank)
				{
					boolean left = wheel.getExpectedWheelID() == 0 || wheel.getExpectedWheelID() == 3;
					
					float turningDrag = 0.02F;
					wheel.motionX *= 1F - (Math.abs(wheelsYaw) * turningDrag);
					wheel.motionZ *= 1F - (Math.abs(wheelsYaw) * turningDrag);
					
					float velocityScale = 0.04F * (throttle > 0 ? type.maxThrottle : type.maxNegativeThrottle) *
						data.engine.engineSpeed;
					float steeringScale = 0.1F * (wheelsYaw > 0 ? type.turnLeftModifier : type.turnRightModifier);
					float effectiveWheelSpeed =
						(throttle + (wheelsYaw * (left ? 1 : -1) * steeringScale)) * velocityScale;
					wheel.motionX += effectiveWheelSpeed * Math.cos(wheel.rotationYaw * 3.14159265F / 180F);
					wheel.motionZ += effectiveWheelSpeed * Math.sin(wheel.rotationYaw * 3.14159265F / 180F);
					
					
				}
				else
				{
					//if(getVehicleType().fourWheelDrive || wheel.ID == 0 || wheel.ID == 1)
					{
						float velocityScale =
							0.1F * throttle * (throttle > 0 ? type.maxThrottle : type.maxNegativeThrottle) *
								data.engine.engineSpeed;
						wheel.motionX += Math.cos(wheel.rotationYaw * 3.14159265F / 180F) * velocityScale;
						wheel.motionZ += Math.sin(wheel.rotationYaw * 3.14159265F / 180F) * velocityScale;
					}
					
					//Apply steering
					if(wheel.getExpectedWheelID() == 2 || wheel.getExpectedWheelID() == 3)
					{
						float velocityScale = 0.01F * (wheelsYaw > 0 ? type.turnLeftModifier : type.turnRightModifier) *
							(throttle > 0 ? 1 : -1);
						
						wheel.motionX -=
							wheel.getSpeedXZ() * Math.sin(wheel.rotationYaw * 3.14159265F / 180F) * velocityScale *
								wheelsYaw;
						wheel.motionZ +=
							wheel.getSpeedXZ() * Math.cos(wheel.rotationYaw * 3.14159265F / 180F) * velocityScale *
								wheelsYaw;
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
			Vector3f targetWheelPos = axes
				.findLocalVectorGlobally(getVehicleType().wheelPositions[wheel.getExpectedWheelID()].position);
			Vector3f currentWheelPos = new Vector3f(wheel.posX - posX, wheel.posY - posY, wheel.posZ - posZ);
			
			Vector3f dPos = ((Vector3f)Vector3f.sub(targetWheelPos, currentWheelPos, null)
				.scale(getVehicleType().wheelSpringStrength));
			
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
			Vector3f frontAxleCentre = new Vector3f((wheels[2].posX + wheels[3].posX) / 2F,
				(wheels[2].posY + wheels[3].posY) / 2F,
				(wheels[2].posZ + wheels[3].posZ) / 2F);
			Vector3f backAxleCentre = new Vector3f((wheels[0].posX + wheels[1].posX) / 2F,
				(wheels[0].posY + wheels[1].posY) / 2F,
				(wheels[0].posZ + wheels[1].posZ) / 2F);
			Vector3f leftSideCentre = new Vector3f((wheels[0].posX + wheels[3].posX) / 2F,
				(wheels[0].posY + wheels[3].posY) / 2F,
				(wheels[0].posZ + wheels[3].posZ) / 2F);
			Vector3f rightSideCentre = new Vector3f((wheels[1].posX + wheels[2].posX) / 2F,
				(wheels[1].posY + wheels[2].posY) / 2F,
				(wheels[1].posZ + wheels[2].posZ) / 2F);
			
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
				yaw = (float)Math.atan2(wheels[3].posZ - wheels[2].posZ, wheels[3].posX - wheels[2].posX) +
					(float)Math.PI / 2F;
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
		
		if(serverPosX != posX || serverPosY != posY || serverPosZ != posZ || serverYaw != axes.getYaw())
		{
			//Calculate movement on the client and then send position, rotation etc to the server
			if(thePlayerIsDrivingThis)
			{
				FlansMod.getPacketHandler().sendToServer(new PacketVehicleControl(this));
				serverPosX = posX;
				serverPosY = posY;
				serverPosZ = posZ;
				serverYaw = axes.getYaw();
			}
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
		
		PostUpdate();
	}

	private boolean canThrust(DriveableData data, EntityPlayer driver) {
		return !TeamsManager.vehiclesNeedFuel
				|| driverIsCreative()
				|| (data.engine != null && data.fuelInTank > data.engine.fuelConsumption * throttle);
	}

	public void animateFancyTracks()
	{
		float funkypart = getVehicleType().trackLinkFix;
		boolean funk = getVehicleType().flipLinkFix;
		float funk2 = 0;
		for(int i = 0; i < trackLinksLeft.length; i++)
		{
			trackLinksLeft[i].prevPosition = trackLinksLeft[i].position;
			trackLinksLeft[i].prevZRot = trackLinksLeft[i].zRot;
			float speed = throttle * 1.5F - (wheelsYaw / 12);
			trackLinksLeft[i].progress += speed;
			if(trackLinksLeft[i].progress > leftTrack.getTrackLength())
				trackLinksLeft[i].progress -= leftTrack.getTrackLength();
			if(trackLinksLeft[i].progress < 0) trackLinksLeft[i].progress += leftTrack.getTrackLength();
			trackLinksLeft[i].position = leftTrack.getPositionOnTrack(trackLinksLeft[i].progress);
			for(; trackLinksLeft[i].zRot > 180F; trackLinksLeft[i].zRot -= 360F)
			{
			}
			for(; trackLinksLeft[i].zRot <= -180F; trackLinksLeft[i].zRot += 360F)
			{
			}
			float newAngle = rotateTowards(leftTrack.points.get(leftTrack.getTrackPart(trackLinksLeft[i].progress)),
				trackLinksLeft[i].position);
			int part = leftTrack.getTrackPart(trackLinksLeft[i].progress);
			if(funk) funk2 = (speed < 0) ? 0 : 1;
			else funk2 = (speed < 0) ? -1 : 0;
			trackLinksLeft[i].zRot = Lerp(trackLinksLeft[i].zRot, newAngle, (part != (funkypart + funk2)) ? 0.5F : 1);
			
		}
		
		for(int i = 0; i < trackLinksRight.length; i++)
		{
			trackLinksRight[i].prevPosition = trackLinksRight[i].position;
			trackLinksRight[i].prevZRot = trackLinksRight[i].zRot;
			float speed = throttle * 1.5F + (wheelsYaw / 12);
			trackLinksRight[i].progress += speed;
			if(trackLinksRight[i].progress > rightTrack.getTrackLength())
				trackLinksRight[i].progress -= leftTrack.getTrackLength();
			if(trackLinksRight[i].progress < 0) trackLinksRight[i].progress += rightTrack.getTrackLength();
			trackLinksRight[i].position = rightTrack.getPositionOnTrack(trackLinksRight[i].progress);
			float newAngle = rotateTowards(rightTrack.points.get(rightTrack.getTrackPart(trackLinksRight[i].progress)),
				trackLinksRight[i].position);
			int part = rightTrack.getTrackPart(trackLinksRight[i].progress);
			if(funk) funk2 = (speed < 0) ? 0 : 1;
			else funk2 = (speed < 0) ? -1 : 0;
			trackLinksRight[i].zRot = Lerp(trackLinksRight[i].zRot, newAngle, (part != (funkypart + funk2)) ? 0.5F : 1);
		}
	}
	
	public float rotateTowards(Vector3f point, Vector3f original)
	{
		
		float angle = (float)Math.atan2(point.y - original.y, point.x - original.x);
		return angle;
	}
	
	public float Lerp(float start, float end, float percent)
	{
		float result = (start + percent * (end - start));
		
		return result;
	}
	
	public static float Clamp(float val, float min, float max)
	{
		return Math.max(min, Math.min(max, val));
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
		
		if(damagesource.damageType.equals("player") && damagesource.getTrueSource().onGround
			&& (getSeat(0) == null || getSeat(0).getControllingPassenger() == null))
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
