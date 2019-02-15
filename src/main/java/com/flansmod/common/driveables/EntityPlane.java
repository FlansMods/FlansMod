package com.flansmod.common.driveables;

import net.minecraft.entity.MoverType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;

import com.flansmod.common.FlansMod;
import com.flansmod.common.network.PacketDriveableControl;
import com.flansmod.common.network.PacketDriveableKey;
import com.flansmod.common.network.PacketPlaneControl;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.tools.ItemTool;
import com.flansmod.common.vector.Matrix4f;
import com.flansmod.common.vector.Vector3f;

public class EntityPlane extends EntityDriveable
{
	/**
	 * The flap positions, used for renderering and for controlling the plane rotations
	 */
	public float flapsYaw, flapsPitchLeft, flapsPitchRight;
	/**
	 * Position of looping engine sound
	 */
	public int soundPosition;
	/**
	 * The angle of the propeller for the renderer
	 */
	public float propAngle;
	/**
	 * Weapon delays
	 */
	public int bombDelay, gunDelay;
	/**
	 * Despawn timer
	 */
	public int ticksSinceUsed = 0;
	/**
	 * Mostly aesthetic model variables. Gear actually has a variable hitbox
	 */
	public boolean varGear = true, varDoor = false, varWing = false;
	/**
	 * Delayer for gear, door and wing buttons
	 */
	public int toggleTimer = 0;
	/**
	 * Current plane mode
	 */
	public EnumPlaneMode mode;
	
	public EntityPlane(World world)
	{
		super(world);
	}
	
	public EntityPlane(World world, double x, double y, double z, PlaneType type, DriveableData data)
	{
		super(world, type, data);
		setPosition(x, y, z);
		prevPosX = x;
		prevPosY = y;
		prevPosZ = z;
		initType(type, true, false);
	}
	
	public EntityPlane(World world, double x, double y, double z, EntityPlayer placer, PlaneType type, DriveableData data)
	{
		this(world, x, y, z, type, data);
		rotateYaw(placer.rotationYaw + 90F);
		rotatePitch(type.restingPitch);
	}
	
	@Override
	public void initType(DriveableType type, boolean firstSpawn, boolean clientSide)
	{
		super.initType(type, firstSpawn, clientSide);
		mode = (((PlaneType)type).mode == EnumPlaneMode.HELI ? EnumPlaneMode.HELI : EnumPlaneMode.PLANE);
	}
	
	@Override
	protected void writeEntityToNBT(NBTTagCompound tag)
	{
		super.writeEntityToNBT(tag);
		tag.setTag("Pos", this.newDoubleNBTList(this.posX, this.posY + 1D, this.posZ));
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
	 *
	 * @param deltaY
	 * @param deltaX
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
	
	@Override
	public void setPositionRotationAndMotion(double x, double y, double z, float yaw, float pitch, float roll, double motX, double motY, double motZ, float velYaw, float velPitch, float velRoll, float throttle, float steeringYaw)
	{
		super.setPositionRotationAndMotion(x, y, z, yaw, pitch, roll, motX, motY, motZ, velYaw, velPitch, velRoll,
				throttle, steeringYaw);
		flapsYaw = steeringYaw;
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
		
		PlaneType type = this.getPlaneType();
		//Check each seat in order to see if the player can sit in it
		for(int i = 0; i <= type.numPassengers; i++)
		{
			if(getSeat(i).processInitialInteract(entityplayer, hand))
			{
				if(i == 0)
				{
					bombDelay = type.planeBombDelay;
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
		PlaneType type = this.getPlaneType();
		//Send keys which require server side updates to the server
		if(world.isRemote && (key == 6 || key == 8 || key == 9))
		{
			FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
			return true;
		}
		boolean canThrust = ((getSeat(0) != null && getSeat(0).getControllingPassenger() instanceof EntityPlayer
				&& ((EntityPlayer)getSeat(0).getControllingPassenger()).capabilities.isCreativeMode) || getDriveableData().fuelInTank > 0) && hasWorkingProp();
		switch(key)
		{
			case 0: //Accelerate : Increase the throttle, up to 1.
			{
				if(canThrust || throttle < 0F)
				{
					throttle += 0.002F;
					if(throttle > 1F)
						throttle = 1F;
				}
				return true;
			}
			case 1: //Decelerate : Decrease the throttle, down to -1, or 0 if the plane cannot reverse
			{
				if(canThrust || throttle > 0F)
				{
					throttle -= 0.005F;
					if(throttle < -1F)
						throttle = -1F;
					if(throttle < 0F && type.maxNegativeThrottle == 0F)
						throttle = 0F;
				}
				return true;
			}
			case 2: //Left : Yaw the flaps left
			{
				flapsYaw -= 1F;
				return true;
			}
			case 3: //Right : Yaw the flaps right
			{
				flapsYaw += 1F;
				return true;
			}
			case 4: //Up : Pitch the flaps up
			{
				flapsPitchLeft += 1F;
				flapsPitchRight += 1F;
				return true;
			}
			case 5: //Down : Pitch the flaps down
			{
				flapsPitchLeft -= 1F;
				flapsPitchRight -= 1F;
				return true;
			}
			case 6: //Exit : Get out
			{
				if(getSeat(0).getControllingPassenger() != null)
					getSeat(0).removePassengers();
				return true;
			}
			case 7: //Inventory : Check to see if this plane allows in-flight inventory editing or if the plane is on the ground
			{
				if(world.isRemote && (type.invInflight || (Math.abs(throttle) < 0.1F && onGround)))
				{
					FlansMod.proxy.openDriveableMenu((EntityPlayer)getSeat(0).getControllingPassenger(), world, this);
				}
				return true;
			}
			case 8: //Drop bomb
			case 9: //Shoot bullet
			{
				return super.pressKey(key, player);
			}
			case 10: //Change control mode
			{
				FlansMod.proxy.changeControlMode((EntityPlayer)getSeat(0).getControllingPassenger());
				return true;
			}
			case 11: //Roll left
			{
				flapsPitchLeft += 1F;
				flapsPitchRight -= 1F;
				return true;
			}
			case 12: //Roll right
			{
				flapsPitchLeft -= 1F;
				flapsPitchRight += 1F;
				return true;
			}
			case 13: // Gear
			{
				if(toggleTimer <= 0)
				{
					varGear = !varGear;
					player.sendMessage(new TextComponentString("Landing gear " + (varGear ? "down" : "up")));
					toggleTimer = 10;
					FlansMod.getPacketHandler().sendToServer(new PacketDriveableControl(this));
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
					FlansMod.getPacketHandler().sendToServer(new PacketDriveableControl(this));
				}
				return true;
			}
			case 15: // Wing
			{
				if(toggleTimer <= 0)
				{
					if(type.hasWing)
					{
						varWing = !varWing;
						player.sendMessage(new TextComponentString("Switching mode"));
					}
					if(type.mode == EnumPlaneMode.VTOL)
					{
						if(mode == EnumPlaneMode.HELI)
							mode = EnumPlaneMode.PLANE;
						else mode = EnumPlaneMode.HELI;
						player.sendMessage(new TextComponentString(mode == EnumPlaneMode.HELI ? "Entering hover mode" : "Entering plane mode"));
					}
					toggleTimer = 10;
					FlansMod.getPacketHandler().sendToServer(new PacketDriveableControl(this));
				}
				return true;
			}
			case 16: // Trim Button
			{
				axes.setAngles(axes.getYaw(), 0, 0);
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
	public void updateKeyHeldState(int key, boolean held)
	{
		super.updateKeyHeldState(key, held);
		//On the server. For semi-auto weapons, shoot!
		if(!world.isRemote)
		{
			switch(key)
			{
				case 9: //Left Mouse
				case 8: //Right Mouse
			}
		}
	}
	
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		
		if(!readyForUpdates)
		{
			return;
		}
		
		//Get plane type
		PlaneType type = getPlaneType();
		DriveableData data = getDriveableData();
		if(type == null)
		{
			FlansMod.log.warn("Plane type null. Not ticking plane");
			return;
		}
		
		//Work out if this is the client side and the player is driving
		boolean thePlayerIsDrivingThis = world.isRemote && getSeat(0) != null && getSeat(0).getControllingPassenger() instanceof EntityPlayer
				&& FlansMod.proxy.isThePlayer((EntityPlayer)getSeat(0).getControllingPassenger());
		
		//Despawning
		ticksSinceUsed++;
		if(!world.isRemote && getSeat(0).getControllingPassenger() != null)
			ticksSinceUsed = 0;
		if(!world.isRemote && TeamsManager.planeLife > 0 && ticksSinceUsed > TeamsManager.planeLife * 20)
		{
			setDead();
		}
		
		//Shooting, inventories, etc.
		//Decrement bomb and gun timers
		if(bombDelay > 0)
			bombDelay--;
		if(gunDelay > 0)
			gunDelay--;
		if(toggleTimer > 0)
			toggleTimer--;
		
		//Aesthetics
		//Rotate the propellers
		if(hasEnoughFuel())
		{
			propAngle += (Math.pow(throttle, 0.4)) * 1.5;
		}
		
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
		if(world.isRemote && !thePlayerIsDrivingThis)
		{
			//The driveable is currently moving towards its server position. Continue doing so.
			if(serverPositionTransitionTicker > 0)
			{
				moveTowardServerPosition();
			}
			//If the driveable is at its server position and does not have the next update, it should just simulate itself as a server side plane would, so continue
		}
		
		//Movement
		
		//Throttle handling
		//Without a player, default to 0
		//With a player default to 0.5 for helicopters (hover speed)
		//And default to the range 0.25 ~ 0.5 for planes (taxi speed ~ take off speed)
		float throttlePull = 0.99F;
		if(getSeat(0) != null && getSeat(0).getControllingPassenger() != null && mode == EnumPlaneMode.HELI && canThrust())
			throttle = (throttle - 0.5F) * throttlePull + 0.5F;
		
		//Get the speed of the plane
		float lastTickSpeed = (float)getSpeedXYZ();
		
		//Alter angles
		//Sensitivity function
		float sensitivityAdjust = 2.00677104758f - (float)Math.exp(-2.0f * throttle) / (4.5f * (throttle + 0.1f));
		sensitivityAdjust = MathHelper.clamp(sensitivityAdjust, 0.0f, 1.0f);
		//Scalar
		sensitivityAdjust *= 0.125F;
		
		float yaw = flapsYaw * (flapsYaw > 0 ? type.turnLeftModifier : type.turnRightModifier) * sensitivityAdjust;
		
		//if(throttle < 0.2F)
		//	sensitivityAdjust = throttle * 2.5F;
		//Pitch according to the sum of flapsPitchLeft and flapsPitchRight / 2
		float flapsPitch = (flapsPitchLeft + flapsPitchRight) / 2F;
		float pitch = flapsPitch * (flapsPitch > 0 ? type.lookUpModifier : type.lookDownModifier) * sensitivityAdjust;
		
		//Roll according to the difference between flapsPitchLeft and flapsPitchRight / 2
		float flapsRoll = (flapsPitchRight - flapsPitchLeft) / 2F;
		float roll = flapsRoll * (flapsRoll > 0 ? type.rollLeftModifier : type.rollRightModifier) * sensitivityAdjust;
		
		//Damage modifiers
		if(mode == EnumPlaneMode.PLANE)
		{
			if(!isPartIntact(EnumDriveablePart.tail))
			{
				yaw = 0;
				pitch = 0;
				roll = 0;
			}
			if(!isPartIntact(EnumDriveablePart.leftWing))
				roll -= 7F * getSpeedXZ();
			if(!isPartIntact(EnumDriveablePart.rightWing))
				roll += 7F * getSpeedXZ();
		}
		
		axes.rotateLocalYaw(yaw);
		axes.rotateLocalPitch(pitch);
		axes.rotateLocalRoll(-roll);
		
		if(world.isRemote && !FlansMod.proxy.mouseControlEnabled())
		{
			//axes.rotateGlobalRoll(-axes.getRoll() * 0.1F);
		}
		
		//Some constants
		float g = 0.98F / 10F;
		float drag = 1F - (0.05F * type.drag);
		float wobbleFactor = 0F;//.005F;
		
		float throttleScaled = 0.01F * (type.maxThrottle + (data.engine == null ? 0 : data.engine.engineSpeed));
		
		if(!canThrust())
			throttleScaled = 0;
		
		int numPropsWorking = 0;
		int numProps = 0;
		
		float fuelConsumptionMultiplier = 2F;
		
		switch(mode)
		{
			case HELI:
				
				//Count the number of working propellers
				for(Propeller prop : type.heliPropellers)
					if(isPartIntact(prop.planePart))
						numPropsWorking++;
				numProps = type.heliPropellers.size();
				
				Vector3f up = axes.getYAxis();
				
				throttleScaled *= numProps == 0 ? 0 : (float)numPropsWorking / numProps * 2F;
				
				float upwardsForce = throttle * throttleScaled + (g - throttleScaled / 2F);
				if(throttle < 0.5F)
					upwardsForce = g * throttle * 2F;
				
				if(!isPartIntact(EnumDriveablePart.blades))
				{
					upwardsForce = 0F;
				}
				
				//Move up
				//Throttle - 0.5 means that the positive throttle scales from -0.5 to +0.5. Thus it accounts for gravity-ish
				motionX += upwardsForce * up.x * 0.5F;
				motionY += upwardsForce * up.y;
				motionZ += upwardsForce * up.z * 0.5F;
				//Apply gravity
				motionY -= g;
				
				//Apply wobble
				//motionX += rand.nextGaussian() * wobbleFactor;
				//motionY += rand.nextGaussian() * wobbleFactor;
				//motionZ += rand.nextGaussian() * wobbleFactor;
				
				//Apply drag
				motionX *= drag;
				motionY *= drag;
				motionZ *= drag;
				
				data.fuelInTank -= upwardsForce * fuelConsumptionMultiplier * data.engine.fuelConsumption;
				
				break;
			
			case PLANE:
				//Count the number of working propellers
				for(Propeller prop : type.propellers)
					if(isPartIntact(prop.planePart))
						numPropsWorking++;
				numProps = type.propellers.size();
				
				float throttleTemp = throttle * (numProps == 0 ? 0 : (float)numPropsWorking / numProps * 2F);
				
				//Apply forces
				Vector3f forwards = (Vector3f)axes.getXAxis().normalise();
				
				//Sanity limiter
				if(lastTickSpeed > 2F)
					lastTickSpeed = 2F;
				
				float newSpeed = lastTickSpeed + throttleScaled * 2F;
				
				//Calculate the amount to alter motion by
				float proportionOfMotionToCorrect = 2F * throttleTemp - 0.5F;
				if(proportionOfMotionToCorrect < throttle * 0.25f)
					proportionOfMotionToCorrect = throttle * 0.25f;
				if(proportionOfMotionToCorrect > 0.6F)
					proportionOfMotionToCorrect = 0.6F;
				
				//Apply gravity
				g = 0.98F / 20F;
				motionY -= g;
				
				//Apply lift
				int numWingsIntact = 0;
				if(isPartIntact(EnumDriveablePart.rightWing)) numWingsIntact++;
				if(isPartIntact(EnumDriveablePart.leftWing)) numWingsIntact++;
				
				float amountOfLift = 2F * g * throttleTemp * numWingsIntact / 2F;
				if(amountOfLift > g)
					amountOfLift = g;
				
				if(!isPartIntact(EnumDriveablePart.tail))
					amountOfLift *= 0.75F;
				
				motionY += amountOfLift;
				
				//Cut out some motion for correction
				motionX *= 1F - proportionOfMotionToCorrect;
				motionY *= 1F - proportionOfMotionToCorrect;
				motionZ *= 1F - proportionOfMotionToCorrect;
				
				//Add the corrected motion
				motionX += proportionOfMotionToCorrect * newSpeed * forwards.x;
				motionY += proportionOfMotionToCorrect * newSpeed * forwards.y;
				motionZ += proportionOfMotionToCorrect * newSpeed * forwards.z;
				
				//Apply drag
				motionX *= drag;
				motionY *= drag;
				motionZ *= drag;
				
				data.fuelInTank -= throttleScaled * fuelConsumptionMultiplier * data.engine.fuelConsumption;
				break;
			default:
				break;
		}
		
		double motion = Math.sqrt(motionX * motionX + motionY * motionY + motionZ * motionZ);
		if(motion > 10)
		{
			motionX *= 10 / motion;
			motionY *= 10 / motion;
			motionZ *= 10 / motion;
		}
		
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
			if(wheel != null && world != null)
				if(type.floatOnWater && world.containsAnyLiquid(wheel.getEntityBoundingBox()))
				{
					motionY += type.buoyancy;
				}
		}
		
		//Move the wheels first
		for(EntityWheel wheel : wheels)
		{
			if(wheel != null)
			{
				wheel.prevPosY = wheel.posY;
				wheel.move(MoverType.SELF, motionX, motionY, motionZ);
			}
		}
		
		//Update wheels
		for(int i = 0; i < 2; i++)
		{
			Vector3f amountToMoveCar = new Vector3f(motionX / 2F, motionY / 2F, motionZ / 2F);
			
			for(EntityWheel wheel : wheels)
			{
				if(wheel == null)
					continue;
				
				//Hacky way of forcing the car to step up blocks
				onGround = true;
				wheel.onGround = true;
				
				//Update angles
				wheel.rotationYaw = axes.getYaw();
				
				//Pull wheels towards car
				Vector3f targetWheelPos = axes.findLocalVectorGlobally(getPlaneType().wheelPositions[wheel.getExpectedWheelID()].position);
				Vector3f currentWheelPos = new Vector3f(wheel.posX - posX, wheel.posY - posY, wheel.posZ - posZ);
				
				float targetWheelLength = targetWheelPos.length();
				float currentWheelLength = currentWheelPos.length();
				
				float dLength = targetWheelLength - currentWheelLength;
				float dAngle = Vector3f.angle(targetWheelPos, currentWheelPos);
				
				{
					//Now Lerp by wheelSpringStrength and work out the new positions		
					float newLength = currentWheelLength + dLength * type.wheelSpringStrength;
					Vector3f rotateAround = Vector3f.cross(targetWheelPos, currentWheelPos, null);
					
					Matrix4f mat = new Matrix4f();
					mat.m00 = currentWheelPos.x;
					mat.m10 = currentWheelPos.y;
					mat.m20 = currentWheelPos.z;
					mat.rotate(dAngle * type.wheelSpringStrength, rotateAround);
					
					axes.rotateGlobal(-dAngle * type.wheelSpringStrength, rotateAround);
					
					Vector3f newWheelPos = new Vector3f(mat.m00, mat.m10, mat.m20);
					newWheelPos.normalise().scale(newLength);
					
					//The proportion of the spring adjustment that is applied to the wheel. 1 - this is applied to the plane
					float wheelProportion = 0.75F;
					
					//wheel.motionX = (newWheelPos.x - currentWheelPos.x) * wheelProportion;
					//wheel.motionY = (newWheelPos.y - currentWheelPos.y) * wheelProportion;
					//wheel.motionZ = (newWheelPos.z - currentWheelPos.z) * wheelProportion;
					
					Vector3f amountToMoveWheel = new Vector3f();
					
					amountToMoveWheel.x = (newWheelPos.x - currentWheelPos.x) * (1F - wheelProportion);
					amountToMoveWheel.y = (newWheelPos.y - currentWheelPos.y) * (1F - wheelProportion);
					amountToMoveWheel.z = (newWheelPos.z - currentWheelPos.z) * (1F - wheelProportion);
					
					amountToMoveCar.x -= (newWheelPos.x - currentWheelPos.x) * (1F - wheelProportion);
					amountToMoveCar.y -= (newWheelPos.y - currentWheelPos.y) * (1F - wheelProportion);
					amountToMoveCar.z -= (newWheelPos.z - currentWheelPos.z) * (1F - wheelProportion);
					
					//The difference between how much the wheel moved and how much it was meant to move. i.e. the reaction force from the block
					//amountToMoveCar.x += ((wheel.posX - wheel.prevPosX) - (motionX)) * 0.616F / wheels.length;
					amountToMoveCar.y += ((wheel.posY - wheel.prevPosY) - (motionY)) * 0.5F / wheels.length;
					//amountToMoveCar.z += ((wheel.posZ - wheel.prevPosZ) - (motionZ)) * 0.0616F / wheels.length;
					
					wheel.move(MoverType.SELF, amountToMoveWheel.x, amountToMoveWheel.y, amountToMoveWheel.z);
				}
			}
			
			move(MoverType.SELF, amountToMoveCar.x, amountToMoveCar.y, amountToMoveCar.z);
			
		}
		
		checkForCollisions();
		
		//Sounds
		//Starting sound
		if(throttle > 0.01F && throttle < 0.2F && soundPosition == 0 && hasEnoughFuel())
		{
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.startSound, false);
			soundPosition = type.startSoundLength;
		}
		//Flying sound
		if(throttle > 0.2F && soundPosition == 0 && hasEnoughFuel())
		{
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.engineSound, false);
			soundPosition = type.engineSoundLength;
		}
		
		//Sound decrementer
		if(soundPosition > 0)
			soundPosition--;
		
		for(EntitySeat seat : getSeats())
		{
			if(seat != null)
				seat.updatePosition();
		}
		
		//Calculate movement on the client and then send position, rotation etc to the server
		if(thePlayerIsDrivingThis)
		{
			FlansMod.getPacketHandler().sendToServer(new PacketPlaneControl(this));
			serverPosX = posX;
			serverPosY = posY;
			serverPosZ = posZ;
			serverYaw = axes.getYaw();
		}
		
		//If this is the server, send position updates to everyone, having received them from the driver
		float updateSpeed = 0.01F;
		if(!world.isRemote)// && (Math.abs(posX - prevPosX) > updateSpeed || Math.abs(posY - prevPosY) > updateSpeed || Math.abs(posZ - prevPosZ) > updateSpeed))
		{
			FlansMod.getPacketHandler().sendToAllAround(new PacketPlaneControl(this), posX, posY, posZ, FlansMod.driveableUpdateRange, dimension);
		}
	}
	
	public boolean canThrust()
	{
		return (getSeat(0) != null && getSeat(0).getControllingPassenger() instanceof EntityPlayer
				&& ((EntityPlayer)getSeat(0).getControllingPassenger()).capabilities.isCreativeMode) || driveableData.fuelInTank > 0;
	}
	
	@Override
	public void setDead()
	{
		super.setDead();
	}
	
	@Override
	public boolean gearDown()
	{
		return varGear;
	}
	
	private boolean hasWorkingProp()
	{
		PlaneType type = getPlaneType();
		if(type.mode == EnumPlaneMode.HELI || type.mode == EnumPlaneMode.VTOL)
			for(Propeller prop : type.heliPropellers)
				if(isPartIntact(prop.planePart))
					return true;
		if(type.mode == EnumPlaneMode.PLANE || type.mode == EnumPlaneMode.VTOL)
			for(Propeller prop : type.propellers)
				if(isPartIntact(prop.planePart))
					return true;
		return false;
	}
	
	public boolean attackEntityFrom(DamageSource damagesource, float i, boolean doDamage)
	{
		if(world.isRemote || isDead)
			return true;
		
		PlaneType type = PlaneType.getPlane(driveableType);
		
		if(damagesource.damageType.equals("player") && damagesource.getTrueSource().onGround
				&& (getSeat(0) == null || getSeat(0).getControllingPassenger() == null))
		{
			ItemStack planeStack = new ItemStack(type.item, 1, driveableData.paintjobID);
			NBTTagCompound tags = new NBTTagCompound();
			planeStack.setTagCompound(tags);
			driveableData.writeToNBT(tags);
			entityDropItem(planeStack, 0.5F);
			setDead();
		}
		return true;
	}
	
	@Override
	public boolean canHitPart(EnumDriveablePart part)
	{
		return varGear || (part != EnumDriveablePart.coreWheel && part != EnumDriveablePart.leftWingWheel && part != EnumDriveablePart.rightWingWheel && part != EnumDriveablePart.tailWheel);
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
	
	@Override
	public String getMissileInventoryName()
	{
		return "Missiles";
	}
	
	@Override
	public boolean hasMouseControlMode()
	{
		return true;
	}
}
