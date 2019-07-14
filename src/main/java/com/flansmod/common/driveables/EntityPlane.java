package com.flansmod.common.driveables;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderPlayerEvent;

import com.flansmod.client.model.animation.AnimationController;
import com.flansmod.common.FlansMod;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.network.PacketDriveableControl;
import com.flansmod.common.network.PacketDriveableKey;
import com.flansmod.common.network.PacketParticle;
import com.flansmod.common.network.PacketPlaneAnimator;
import com.flansmod.common.network.PacketPlaneControl;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.tools.ItemTool;
import com.flansmod.common.vector.Matrix4f;
import com.flansmod.common.vector.Vector3f;
import com.jcraft.jorbis.Block;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;

public class EntityPlane extends EntityDriveable
{
	/** The flap positions, used for renderering and for controlling the plane rotations */
	public float flapsYaw, flapsPitchLeft, flapsPitchRight;
	/** Position of looping engine sound */
	public int soundPosition;

	/** Weapon delays */
	public int bombDelay, gunDelay;
	/** Despawn timer */
	public int ticksSinceUsed = 0;
	/** Mostly aesthetic model variables. Gear actually has a variable hitbox */
	public boolean varGear = true, varDoor = false, varWing = false;
	public boolean doorsHaveShut = false;
	/** Delayer for gear, door and wing buttons */
	public int toggleTimer = 0;
	/** Current plane mode */
	public EnumPlaneMode mode;

	//Animation positions
	public Vector3f wingPos = new Vector3f(0,0,0);
	public Vector3f wingRot = new Vector3f(0,0,0);
	public Vector3f wingWheelPos = new Vector3f(0,0,0);
	public Vector3f wingWheelRot = new Vector3f(0,0,0);
	public Vector3f coreWheelPos = new Vector3f(0,0,0);
	public Vector3f coreWheelRot = new Vector3f(0,0,0);
	public Vector3f tailWheelPos = new Vector3f(0,0,0);
	public Vector3f tailWheelRot = new Vector3f(0,0,0);
	public Vector3f doorPos = new Vector3f(0,0,0);
	public Vector3f doorRot = new Vector3f(0,0,0);



	//Duplicate positions for smoothness
	public Vector3f prevWingPos = new Vector3f(0,0,0);
	public Vector3f prevWingRot = new Vector3f(0,0,0);
	public Vector3f prevWingWheelPos = new Vector3f(0,0,0);
	public Vector3f prevWingWheelRot = new Vector3f(0,0,0);
	public Vector3f prevCoreWheelPos = new Vector3f(0,0,0);
	public Vector3f prevCoreWheelRot = new Vector3f(0,0,0);
	public Vector3f prevTailWheelPos = new Vector3f(0,0,0);
	public Vector3f prevTailWheelRot = new Vector3f(0,0,0);
	public Vector3f prevDoorPos = new Vector3f(0,0,0);
	public Vector3f prevDoorRot = new Vector3f(0,0,0);
	public float xSpeed = 0;
	public float ySpeed = 0;
	public float zSpeed = 0;
	public float rollSpeed = 0;
	public FlightController control = new FlightController();
	public AnimationController anim = new AnimationController();
	public boolean initiatedAnim = false;


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
		initType(type, false);
	}

	public EntityPlane(World world, double x, double y, double z, EntityPlayer placer, PlaneType type, DriveableData data)
	{
		this(world, x, y + 90/16F, z, type, data);
		rotateYaw(placer.rotationYaw + 90F);
		rotatePitch(type.restingPitch);
	}

	@Override
	public void initType(DriveableType type, boolean clientSide)
	{
		super.initType(type, clientSide);
		mode = (((PlaneType)type).mode == EnumPlaneMode.HELI ? EnumPlaneMode.HELI : EnumPlaneMode.PLANE);
		if((((PlaneType)type).mode == EnumPlaneMode.VTOL)){
			mode = EnumPlaneMode.HELI;
		}
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

		if(mode != EnumPlaneMode.SIXDOF){
			flapsPitchLeft -= sensitivity * deltaX;
			flapsPitchRight += sensitivity * deltaX;
		} else {
			flapsPitchLeft -= sensitivity * deltaX;
			flapsPitchRight += sensitivity * deltaX;
			//flapsYaw += sensitivity * deltaX;
		}
	}

	@Override
	public void setPositionRotationAndMotion(double x, double y, double z, float yaw, float pitch, float roll, double motX, double motY, double motZ, float velYaw, float velPitch, float velRoll, float throt, float steeringYaw)
	{
		super.setPositionRotationAndMotion(x, y, z, yaw, pitch, roll, motX, motY, motZ, velYaw, velPitch, velRoll, throt, steeringYaw);
		flapsYaw = steeringYaw;
	}

	public void setRotorPosition(float current, float previous)
	{
		rotorAngle = current;
		prevRotorAngle = previous;
	}

	public void setPropPosition(float current, float previous)
	{
		propAngle = current;
		prevPropAngle = previous;
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

		PlaneType type = this.getPlaneType();
		//Check each seat in order to see if the player can sit in it
		for(int i = 0; i <= type.numPassengers; i++)
		{
			if(seats[i].interactFirst(entityplayer))
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
		if(worldObj.isRemote && (key == 6 || key == 8 || key == 9))
		{
			FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
			return true;
		}
		boolean canThrust = (seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode) || getDriveableData().fuelInTank > 0;
		switch(key)
		{
		case 0 : //Accelerate : Increase the throttle, up to 1.
		{
			if(canThrust || throttle < 0F)
			{
				throttle += 0.002F;
				if(throttle > 1F)
					throttle = 1F;
				xSpeed += 0.5F;
			}
			return true;
		}
		case 1 : //Decelerate : Decrease the throttle, down to -1, or 0 if the plane cannot reverse
		{
			if(canThrust || throttle > 0F)
			{
				throttle -= 0.005F;
				if(throttle < -1F)
					throttle = -1F;
				if(throttle < 0F && type.maxNegativeThrottle == 0F)
					throttle = 0F;
				xSpeed -=0.5F;
			}
			return true;
		}
		case 2 : //Left : Yaw the flaps left
		{
			if(mode != EnumPlaneMode.SIXDOF)
				flapsYaw -= 1F;
			zSpeed -= 1F;
			return true;
		}
		case 3 : //Right : Yaw the flaps right
		{
			if(mode != EnumPlaneMode.SIXDOF)
				flapsYaw += 1F;
			zSpeed += 1F;
			return true;
		}
		case 4 : //Up : Pitch the flaps up
		{
			if(mode != EnumPlaneMode.SIXDOF){
				flapsPitchLeft += 1F;
				flapsPitchRight += 1F;
			}
			ySpeed += 1F;
			return true;
		}
		case 5 : //Down : Pitch the flaps down
		{
			if(mode != EnumPlaneMode.SIXDOF){
				flapsPitchLeft -= 1F;
				flapsPitchRight -= 1F;
			}
			ySpeed -= 1F;
			return true;
		}
		case 6 : //Exit : Get out
		{
			if(seats[0].riddenByEntity != null)
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
		case 9 : //Shoot bullet
		{
			return super.pressKey(key, player);
		}
		case 10 : //Change control mode
		{
			FlansMod.proxy.changeControlMode((EntityPlayer)seats[0].riddenByEntity);
			seats[0].playerLooking = new RotatedAxes(0,0,0);
			return true;
		}
		case 11 : //Roll left
		{
			if(mode != EnumPlaneMode.SIXDOF){
				flapsPitchLeft += 1F;
				flapsPitchRight -= 1F;
			} else {
				flapsYaw -=0.25F;
			}

			return true;
		}
		case 12 : //Roll right
		{
			if(mode != EnumPlaneMode.SIXDOF){
				flapsPitchLeft -= 1F;
				flapsPitchRight += 1F;
			} else {
				flapsYaw +=0.25F;
			}
			return true;
		}
		case 13 : // Gear
		{
			if(toggleTimer <= 0)
			{
				if(worldObj.isAirBlock((int)posX, (int)(posY-3), (int)posZ)){
					varGear = !varGear;
					player.addChatMessage(new ChatComponentText("Landing gear " + (varGear ? "down" : "up")));
					toggleTimer = 10;
					FlansMod.getPacketHandler().sendToServer(new PacketDriveableControl(this));
				}
			}
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
				FlansMod.getPacketHandler().sendToServer(new PacketDriveableControl(this));
			}
			return true;
		}
		case 15 : // Wing
		{
			if(toggleTimer <= 0)
			{
				if(type.hasWing)
				{
					varWing = !varWing;
					player.addChatMessage(new ChatComponentText("Switching mode"));
				}
				if(type.mode == EnumPlaneMode.VTOL)
				{
					if(mode == EnumPlaneMode.HELI)
						mode = EnumPlaneMode.PLANE;
					else mode = EnumPlaneMode.HELI;
					player.addChatMessage(new ChatComponentText(mode == EnumPlaneMode.HELI ? "Entering hover mode" : "Entering plane mode"));
				}
				anim.changeState(varWing?0:1);
				toggleTimer = 10;
				FlansMod.getPacketHandler().sendToServer(new PacketDriveableControl(this));
			}
			return true;
		}
		case 16 : // Trim Button
		{
			axes.setAngles(axes.getYaw(), 0, 0);
			return true;
		}
		case 17 : //Park
		{
			break;
		}
		case 18 : //Flare
		{
			if(type.hasFlare && this.ticksFlareUsing <= 0 && this.flareDelay <= 0)
			{
				this.ticksFlareUsing = type.timeFlareUsing * 20;
				this.flareDelay = type.flareDelay;
				if(worldObj.isRemote)
				{
					FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
				}
				else
				{
					if(!type.flareSound.isEmpty())
					{
						PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.flareSound, false);
					}
				}
				return true;
			}
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
		if(!worldObj.isRemote)
		{
			switch(key)
			{
			case 9 : //Left Mouse
			case 8 : //Right Mouse
			}
		}
	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();
		//Set previous positions
		prevWingPos = wingPos;
		prevWingRot = wingRot;
		prevWingWheelPos = wingWheelPos;
		prevWingWheelRot = wingWheelRot;
		prevCoreWheelPos = coreWheelPos;
		prevCoreWheelRot = coreWheelRot;
		prevTailWheelPos = tailWheelPos;
		prevTailWheelRot = tailWheelRot;
		prevDoorPos = doorPos;
		prevDoorRot = doorRot;
		if(getPlaneType().valkyrie){
			if(!initiatedAnim){ 
				anim.initPoses();
				anim.initAnim();
				initiatedAnim = true;
				anim.changeState(varWing?0:1);
			}
			
			if(initiatedAnim)
			{ 
				int i = varWing?0:1;
				anim.UpdateAnim(i);
			}
		}
		
		if(initiatedAnim && throttle > 0.2F)
		{
			Vector3f v = anim.getFullPosition(new Vector3f(151, -25, -24), anim.parts.get(5));
			v = axes.findLocalVectorGlobally(new Vector3f(-v.x, -v.y, v.z));
			Vector3f v2 = anim.getFullPosition(new Vector3f(151, -25, 24), anim.parts.get(8));
			
			v2 = axes.findLocalVectorGlobally(new Vector3f(-v2.x, -v2.y, v2.z));
			for(int i = 0; i < 4; i++){
				if(!(Float.isNaN(v.x))){
					//FlansMod.proxy.spawnParticle("flansmod.afterburn", posX+v2.x/16F, posY+(v2.y/16F), posZ+(v2.z/16F), 0, 0F, 0);
					FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.afterburn",posX + v2.x/16F, posY + v2.y/16F, posZ + v2.z/16F, 0,0,0),posX + v2.x/16F, posY + v2.y/16F, posZ + v2.z/16F, 150, dimension);
				}
				if(!(Float.isNaN(v.x)))
				{
					//FlansMod.proxy.spawnParticle("flansmod.afterburn", posX+v.x/16F, posY+(v.y/16F), posZ+(v.z/16F), 0, 0F, 0);
					FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.afterburn",posX + v.x/16F, posY + v.y/16F, posZ + v.z/16F, 0,0,0),posX + v.x/16F, posY + v.y/16F, posZ + v.z/16F, 150, dimension);
				}
			}

		}
		


		//Get plane type
		PlaneType type = getPlaneType();
		DriveableData data = getDriveableData();
		if(type == null)
		{
			FlansMod.log("Plane type null. Not ticking plane");
			return;
		}

		//Work out if this is the client side and the player is driving
		boolean thePlayerIsDrivingThis = worldObj.isRemote && seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && FlansMod.proxy.isThePlayer((EntityPlayer)seats[0].riddenByEntity);

		//Despawning
		ticksSinceUsed++;
		if(!worldObj.isRemote && seats[0].riddenByEntity != null)
			ticksSinceUsed = 0;
		if(!worldObj.isRemote && TeamsManager.planeLife > 0 && ticksSinceUsed > TeamsManager.planeLife * 20)
		{
			setDead();
		}

		if(this.worldObj.isRemote && (this.varFlare || this.ticksFlareUsing > 0))
		{
			if(this.ticksExisted % 5 ==0)
			{
				Vector3f dir = axes.findLocalVectorGlobally(new Vector3f(0,-0.5F,0));
				FlansMod.proxy.spawnParticle("flansmod.flare", this.posX, this.posY, this.posZ,
						dir.x,
						dir.y,
						dir.z);
			}
		}
		if(this.ticksFlareUsing > 0)
			this.ticksFlareUsing--;
		if(this.flareDelay > 0)
			this.flareDelay--;

		//Shooting, inventories, etc.
		//Decrement bomb and gun timers
		if(bombDelay > 0)
			bombDelay--;
		if(gunDelay > 0)
			gunDelay--;
		if(toggleTimer > 0)
			toggleTimer--;


		if(!varWing){
			wingPos = transformPart(wingPos, type.wingPos1, type.wingRate);
			wingRot = transformPart(wingRot, type.wingRot1, type.wingRotRate);
		} else {
			wingPos = transformPart(wingPos, type.wingPos2, type.wingRate);	
			wingRot = transformPart(wingRot, type.wingRot2, type.wingRotRate);
		}

		if(varGear){
			wingWheelPos = transformPart(wingWheelPos, type.wingWheelPos1, type.wingWheelRate);
			wingWheelRot = transformPart(wingWheelRot, type.wingWheelRot1, type.wingWheelRotRate);			
			coreWheelPos = transformPart(coreWheelPos, type.bodyWheelPos1, type.bodyWheelRate);
			coreWheelRot = transformPart(coreWheelRot, type.bodyWheelRot1, type.bodyWheelRotRate);
			tailWheelPos = transformPart(tailWheelPos, type.tailWheelPos1, type.tailWheelRate);
			tailWheelRot = transformPart(tailWheelRot, type.tailWheelRot1, type.tailWheelRotRate);

		} else {
			wingWheelPos = transformPart(wingWheelPos, type.wingWheelPos2, type.wingWheelRate);
			wingWheelRot = transformPart(wingWheelRot, type.wingWheelRot2, type.wingWheelRotRate);			
			coreWheelPos = transformPart(coreWheelPos, type.bodyWheelPos2, type.bodyWheelRate);
			coreWheelRot = transformPart(coreWheelRot, type.bodyWheelRot2, type.bodyWheelRotRate);
			tailWheelPos = transformPart(tailWheelPos, type.tailWheelPos2, type.tailWheelRate);
			tailWheelRot = transformPart(tailWheelRot, type.tailWheelRot2, type.tailWheelRotRate);
		}

		if(!varDoor){
			doorPos = transformPart(doorPos, type.doorPos1, type.doorRate);
			doorRot = transformPart(doorRot, type.doorRot1, type.doorRotRate);
		} else {
			doorPos = transformPart(doorPos, type.doorPos2, type.doorRate);
			doorRot = transformPart(doorRot, type.doorRot2, type.doorRotRate);
		}

		if(!worldObj.isAirBlock((int)posX, (int)(posY-10), (int)posZ) && throttle <= 0.4){
			if(!varGear && (EntityPlayer)seats[0].riddenByEntity != null){
				((EntityPlayer)seats[0].riddenByEntity).addChatMessage(new ChatComponentText("Deploying landing gear"));
			}
			varGear = true;
			if(type.foldWingForLand){
				if(varWing && (EntityPlayer)seats[0].riddenByEntity != null){
					((EntityPlayer)seats[0].riddenByEntity).addChatMessage(new ChatComponentText("Extending wings"));
				}
				varWing = false;
			}
		}

		if(!worldObj.isAirBlock((int)posX, (int)(posY-3), (int)posZ) && throttle <= 0.05){
			if(!doorsHaveShut){
				varDoor = true;
			}
			doorsHaveShut = true;
		} else if(!type.flyWithOpenDoor){
			varDoor = false;
			doorsHaveShut = false;
		}

		if(locked){
			varDoor = false;
			doorsHaveShut = false;
		}

		if(!isPartIntact(EnumDriveablePart.tail) && type.spinWithoutTail) flapsYaw = 15;

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
			//If the driveable is at its server position and does not have the next update, it should just simulate itself as a server side plane would, so continue
		}

		//Movement

		boolean canThrust = (seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode) || data.fuelInTank > 0;

		//Throttle handling
		//Without a player, default to 0
		//With a player default to 0.5 for helicopters (hover speed)
		//And default to the range 0.25 ~ 0.5 for planes (taxi speed ~ take off speed)
		float throttlePull = 0.99F;
		if(seats[0] != null && seats[0].riddenByEntity != null && mode == EnumPlaneMode.HELI && canThrust)
			throttle = (throttle - 0.5F) * throttlePull + 0.5F;

		control.fly(this);

		double motion = Math.sqrt(motionX * motionX + motionY * motionY + motionZ * motionZ);
		if(motion > 10)
		{
			motionX *= 10 / motion;
			motionY *= 10 / motion;
			motionZ *= 10 / motion;
		}

		for(EntityWheel wheel : wheels)
		{
			if(wheel != null && worldObj != null)
				if(type.floatOnWater && worldObj.isAnyLiquid(wheel.boundingBox))
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
				wheel.moveEntity(motionX, (onDeck)?0:motionY, motionZ);
			}
		}

		correctWheelPos();

		//Update wheels
		for(int i = 0; i < 2; i++)
		{
			Vector3f amountToMoveCar = new Vector3f(motionX / 2F, (onDeck)?0:motionY / 2F, motionZ / 2F);

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
				Vector3f wPos = getPlaneType().wheelPositions[wheel.ID].position;
				if(type.valkyrie && varWing) wPos = new Vector3f(wPos.x, wPos.y + 90/16F, wPos.z);
				Vector3f targetWheelPos = axes.findLocalVectorGlobally(wPos);
				Vector3f currentWheelPos = new Vector3f(wheel.posX - posX, wheel.posY - posY, wheel.posZ - posZ);

				float targetWheelLength = targetWheelPos.length();
				float currentWheelLength = currentWheelPos.length();

				float dLength = targetWheelLength - currentWheelLength;
				float dAngle = Vector3f.angle(targetWheelPos, currentWheelPos);

				//if(dLength > 0.01F || dAngle > 1F)
				{
					//Now Lerp by wheelSpringStrength and work out the new positions
					float newLength = currentWheelLength + dLength * type.wheelSpringStrength;
					Vector3f rotateAround = Vector3f.cross(targetWheelPos, currentWheelPos, null);

					Matrix4f mat = new Matrix4f();
					mat.m00 = currentWheelPos.x;
					mat.m10 = currentWheelPos.y;
					mat.m20 = currentWheelPos.z;
					mat.rotate(dAngle * type.wheelSpringStrength, rotateAround);

					if(this.ticksExisted > 5)
					{
						if(!(type.valkyrie && anim.timeSinceSwitch < 10))
						axes.rotateGlobal(-dAngle * type.wheelSpringStrength, rotateAround);
					}

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
					amountToMoveCar.y += ((wheel.posY - wheel.prevPosY) - ((onDeck)?0:motionY)) * 0.5F / wheels.length;
					//amountToMoveCar.z += ((wheel.posZ - wheel.prevPosZ) - (motionZ)) * 0.0616F / wheels.length;

					wheel.moveEntity(amountToMoveWheel.x, amountToMoveWheel.y, amountToMoveWheel.z);
				}
			}

			moveEntity(amountToMoveCar.x, amountToMoveCar.y, amountToMoveCar.z);

		}

		if(this.ridingEntity != null)
		{
			if(this.ridingEntity.getClass().toString().indexOf("mcheli.aircraft.MCH_EntitySeat") > 0)
			{
				axes.setAngles(this.ridingEntity.rotationYaw+90, 0, 0);
			}
		}

		checkForCollisions();

		//Sounds
		//Starting sound
		if (throttle > 0.01F && throttle < 0.2F && soundPosition == 0)
		{
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.startSound, false);
			soundPosition = type.startSoundLength;
		}
		//Flying sound
		if (throttle > 0.2F && soundPosition == 0)
		{
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.engineSound, false);
			soundPosition = type.engineSoundLength;
		}

		//Sound decrementer
		if(soundPosition > 0)
			soundPosition--;

		for(EntitySeat seat : seats)
		{
			if(seat != null)
				seat.updatePosition();
		}

		//Calculate movement on the client and then send position, rotation etc to the server
		if(thePlayerIsDrivingThis)
		{
			FlansMod.getPacketHandler().sendToServer(new PacketPlaneControl(this));
			FlansMod.getPacketHandler().sendToServer(new PacketPlaneAnimator(this));

			serverPosX = posX;
			serverPosY = posY;
			serverPosZ = posZ;
			serverYaw = axes.getYaw();
		}

		//If this is the server, send position updates to everyone, having received them from the driver
		float updateSpeed = 0.01F;
		if(!worldObj.isRemote)// && (Math.abs(posX - prevPosX) > updateSpeed || Math.abs(posY - prevPosY) > updateSpeed || Math.abs(posZ - prevPosZ) > updateSpeed))
		{
			FlansMod.getPacketHandler().sendToAllAround(new PacketPlaneControl(this), posX, posY, posZ, FlansMod.driveableUpdateRange, dimension);
			FlansMod.getPacketHandler().sendToAllAround(new PacketPlaneAnimator(this), posX, posY, posZ, FlansMod.driveableUpdateRange, dimension);

		}
		
	}

	@Override
	public void setDead()
	{
		super.setDead();
		for(EntityWheel wheel : wheels)
			if(wheel != null)
				wheel.setDead();
	}

	@Override
	public boolean gearDown()
	{
		return varGear;
	}

	public boolean attackEntityFrom(DamageSource damagesource, float i, boolean doDamage)
	{
		if(worldObj.isRemote || isDead)
			return true;

		PlaneType type = PlaneType.getPlane(driveableType);

		if(damagesource.damageType.equals("player") && damagesource.getEntity().onGround && (seats[0] == null || seats[0].riddenByEntity == null) && !locked)
		{
			ItemStack planeStack = new ItemStack(type.item, 1, driveableData.paintjobID);
			planeStack.stackTagCompound = new NBTTagCompound();
			driveableData.writeToNBT(planeStack.stackTagCompound);
			entityDropItem(planeStack, 0.5F);
			setDead();
		}
		return super.attackEntityFrom(damagesource, i);
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

	public Vector3f transformPart(Vector3f current, Vector3f target, Vector3f rate){
		Vector3f newPos = current;

		if(Math.sqrt((current.x - target.x)*(current.x - target.x)) > rate.x/2){
			if(current.x > target.x){
				current.x = current.x - rate.x;
			} else if (current.x < target.x){
				current.x = current.x + rate.x;
			}
		} else {
			current.x = target.x;
		}

		if(Math.sqrt((current.y - target.y)*(current.y - target.y)) > rate.y/2){
			if(current.y > target.y){
				current.y = current.y - rate.y;
			} else if (current.y < target.y){
				current.y = current.y + rate.y;
			}
		} else {
			current.y = target.y;
		}

		if(Math.sqrt((current.z - target.z)*(current.z - target.z)) > rate.z/2){
			if(current.z > target.z){
				current.z = current.z - rate.z;
			} else if (current.z < target.z){
				current.z = current.z + rate.z;
			}
		} else {
			current.z = target.z;
		}

		return newPos;
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
