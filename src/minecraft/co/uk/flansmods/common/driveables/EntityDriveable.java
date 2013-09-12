package co.uk.flansmods.common.driveables;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteArrayDataOutput;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import co.uk.flansmods.api.IControllable;
import co.uk.flansmods.api.IExplodeable;
import co.uk.flansmods.client.debug.EntityDebugAABB;
import co.uk.flansmods.client.debug.EntityDebugVector;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.RotatedAxes;
import co.uk.flansmods.common.guns.EntityBullet;
import co.uk.flansmods.common.network.PacketDriveableDamage;
import co.uk.flansmods.common.vector.Vector3f;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;

import icbm.api.RadarRegistry;
import icbm.api.sentry.IAATarget;

public abstract class EntityDriveable extends Entity implements IControllable, IExplodeable, IEntityAdditionalSpawnData, IAATarget
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

	public boolean fuelling;
	/** Extra prevRoation field for smoothness in all 3 rotational axes */
	public float prevRotationRoll;
	/** Angular velocity */
	public Vector3f angularVelocity = new Vector3f(0F, 0F, 0F);
	
	public RotatedAxes prevAxes;
	public RotatedAxes axes;
	
	public EntitySeat[] seats;
	
    public EntityDriveable(World world)
    {
        super(world);
		axes = new RotatedAxes();
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
		yOffset = type.yOffset;
		
		//Register Plane to Radar on Spawning
		if(type.onRadar == true)
			RadarRegistry.register(this);
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
	public void writeSpawnData(ByteArrayDataOutput data)
	{
		try
		{
			data.writeUTF(driveableType);
			
			NBTTagCompound tag = new NBTTagCompound();
			driveableData.writeToNBT(tag);
			tag.writeNamedTag(tag, data);
			
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
		catch (IOException e)
		{
			e.printStackTrace();
		}		
	}

	@Override
	public void readSpawnData(ByteArrayDataInput inputData)
	{
		try
		{
			driveableType = inputData.readUTF();
			driveableData = new DriveableData((NBTTagCompound)NBTBase.readNamedTag(inputData));
			initType(getDriveableType(), true);
			
			axes.setAngles(inputData.readFloat(), inputData.readFloat(), inputData.readFloat());
			prevRotationYaw = axes.getYaw();
			prevRotationPitch = axes.getPitch();
			prevRotationRoll = axes.getRoll();
			
			//Read damage
        	for(EnumDriveablePart ep : EnumDriveablePart.values())
        	{
        		DriveablePart part = getDriveableData().parts.get(ep);
        		part.health = inputData.readShort();
        		part.onFire = inputData.readBoolean();
        	}

		}
		catch(Exception e)
		{
			FlansMod.log("Failed to retreive plane type from server.");
			super.setDead();
			e.printStackTrace();
		}
	}
	
	public abstract void writeUpdateData(DataOutputStream out);
	
	public abstract void readUpdateData(DataInputStream in);
	
	/**
	 * Called with the movement of the mouse. Used in controlling vehicles if need be.
	 * @param deltaY 
	 * @param deltaX 
	 * @return if mouse movement was handled.
	 */
	@Override
	public abstract void onMouseMoved(int deltaX, int deltaY);

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
        return entity.boundingBox;
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
	/** Do nothing when attacked by standard methods. It'll take more than that to break a genuine Flan's Mod Driveable (TM) */
	public boolean attackEntityFrom(DamageSource damagesource, float i)
    {
	    if(worldObj.isRemote || isDead)
        {
            return true;
        }
		return true;
	}
	
	@Override
	public void setDead()
	{
		super.setDead();
		
		//Unregister to Radar
		RadarRegistry.unregister(this);
		
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
	        serverYaw = (double)f;
	        serverPitch = (double)f1;
		}
    }
	
	public void setPositionRotationAndMotion(double x, double y, double z, float yaw, float pitch, float roll, double motX, double motY, double motZ, float velYaw, float velPitch, float velRoll, float throt)
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
	
	public abstract boolean pressKey(int key, EntityPlayer player);

	@Override
    public void onUpdate()
    {
        super.onUpdate();
        
        //System.out.println(((int)posX) + " " + ((int)posY) + " " + ((int)posZ) + " " + worldObj.isRemote);
        
        DriveableType type = getDriveableType();
        
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
		        		Vector3f pos = axes.findLocalVectorGlobally(new Vector3f((float)part.box.x / 16F + rand.nextFloat() * (float)part.box.w / 16F, (float)part.box.y / 16F + rand.nextFloat() * (float)part.box.h / 16F, (float)part.box.z / 16F + rand.nextFloat() * (float)part.box.d / 16F));
		        		worldObj.spawnParticle("flame", posX + pos.x, posY + pos.y, posZ + pos.z, 0, 0, 0);
	        		}
	           		if(part.health > 0 && part.health < part.maxHealth / 2)
	        		{
	        			//Pick a random position within the bounding box and spawn a flame there
		        		Vector3f pos = axes.findLocalVectorGlobally(new Vector3f((float)part.box.x / 16F + rand.nextFloat() * (float)part.box.w / 16F, (float)part.box.y / 16F + rand.nextFloat() * (float)part.box.h / 16F, (float)part.box.z / 16F + rand.nextFloat() * (float)part.box.d / 16F));
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
	        		Vector3f pos = axes.findLocalVectorGlobally(new Vector3f((float)part.box.x / 16F + (float)part.box.w / 32F, (float)part.box.y / 16F + (float)part.box.h / 32F, (float)part.box.z / 16F + (float)part.box.d / 32F));
	        		if(worldObj.getBlockMaterial(MathHelper.floor_double(posX + pos.x), MathHelper.floor_double(posY + pos.y), MathHelper.floor_double(posZ + pos.z)) == Material.water)
	        		{
	        			part.onFire = false;
	        		}
	        	}
	        	else
	        	{
	        		Vector3f pos = axes.findLocalVectorGlobally(new Vector3f((float)part.box.x / 16F + (float)part.box.w / 32F, (float)part.box.y / 16F + (float)part.box.h / 32F, (float)part.box.z / 16F + (float)part.box.d / 32F));
	        		if(worldObj.getBlockMaterial(MathHelper.floor_double(posX + pos.x), MathHelper.floor_double(posY + pos.y), MathHelper.floor_double(posZ + pos.z)) == Material.lava)
	        		{
	        			part.onFire = true;
	        		}
	        	}
        	}
        }
        
        checkParts();
        
        if(Math.abs(prevPosX - posX) > 0.001F)
        	prevPosX = posX;
        if(Math.abs(prevPosY - posY) > 0.001F)
        	prevPosY = posY;
        if(Math.abs(prevPosZ - posZ) > 0.001F)
        	prevPosZ = posZ;
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
		
		//If the player jumps out or dies, smoothly return the throttle to 0 so the plane might actually come down again */
		if(!worldObj.isRemote && seats[0].riddenByEntity == null)
		{
			throttle *= 0.9F;
		}
		
		/*if(worldObj.isRemote && FlansMod.DEBUG)
		{
			Vector3f xAxis = axes.getXAxis();
			Vector3f yAxis = axes.getYAxis();
			Vector3f zAxis = axes.getZAxis();
			for(int i = 0; i < 10; i++)
			{
				worldObj.spawnParticle("enchantmenttable", 	posX + xAxis.x * i * 0.3D, posY + xAxis.y * i * 0.3D, posZ + xAxis.z * i * 0.3D, 0, 0, 0);
				worldObj.spawnParticle("smoke", 			posX + yAxis.x * i * 0.3D, posY + yAxis.y * i * 0.3D, posZ + yAxis.z * i * 0.3D, 0, 0, 0);
				worldObj.spawnParticle("reddust", 			posX + zAxis.x * i * 0.3D, posY + zAxis.y * i * 0.3D, posZ + zAxis.z * i * 0.3D , 0, 0, 0);
			}
		}*/
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
		ItemStack stack = new ItemStack(getDriveableType().itemID, 1, 0);
		stack.stackTagCompound = new NBTTagCompound();
		driveableData.writeToNBT(stack.stackTagCompound);
		return stack;
    }
	
    
    public boolean hasFuel()
    {
    	if(seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode)
    		return true;
    	return driveableData.fuelInTank > 0;
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
	
	/** Returns the kinetic energy of the driveable */
	public double getKineticEnergy()
	{
		return 0.5D * getDriveableType().mass * getSpeedXYZ();
	}
		
	/** Applies both a translational and rotational force at forceOrigin along forceVector with magnitude that of forceVector for the duration of the tick in which it is called */
	public void applyForce(Vector3f forceOrigin, Vector3f forceVector)
	{
		//Apply the translational force
		applyTranslationalForce(forceOrigin, forceVector);
		//And then the rotational force
		applyRotationalForce(forceOrigin, forceVector);
	}
	
	/** Applies a rotational force at forceOrigin along forceVector with magnitude that of forceVector for the duration of the tick in which it is called */
	public void applyRotationalForce(Vector3f forceOrigin, Vector3f forceVector)
	{
		Vector3f torqueVector = Vector3f.cross((Vector3f)forceVector.scale(1), forceOrigin, null);
		applyTorque(torqueVector);
	}
	
	/** Applies a rotational torque */
	public void applyTorque(Vector3f torqueVector)
	{
		float deltaTime = 1F / 20F;
		float momentOfInertia = getDriveableType().momentOfInertia / 1000;
		Vector3f.add(angularVelocity, (Vector3f)torqueVector.scale(deltaTime * 1F / momentOfInertia), angularVelocity);
	}
	
	/** Applies a translational force at forceOrigin along forceVector with magnitude that of forceVector for the duration of the tick in which it is called */
	public void applyTranslationalForce(Vector3f forceOrigin, Vector3f forceVector)
	{
		float deltaTime = 1F / 20F;
		Vector3f accelerationVector = (Vector3f)forceVector.scale(1F / getDriveableType().mass);
		//Apply v=u+at
		motionX += accelerationVector.x * deltaTime;
		motionY += accelerationVector.y * deltaTime;
		motionZ += accelerationVector.z * deltaTime;
	}
	
	public void moveDriveable()
	{		
        float deltaTime = 1F / 20F;

		DriveableType type = getDriveableType();
        
		Vector3f position = new Vector3f((float)posX, (float)posY, (float)posZ);
        Vector3f motion = new Vector3f((float)motionX, (float)motionY, (float)motionZ);
        
        if(worldObj.isRemote && FlansMod.DEBUG)
        {
	        worldObj.spawnEntityInWorld(new EntityDebugVector(worldObj, position, motion, 2, 0F, 0F, 1F));
	        worldObj.spawnEntityInWorld(new EntityDebugVector(worldObj, position, (Vector3f)new Vector3f(angularVelocity).scale(1F / 10F), 2, 1F, 0F, 1F));
        }
        
      	RotatedAxes newAxes = axes.clone();
      	if(Math.abs(angularVelocity.lengthSquared()) > 0.00000001D)
      		newAxes.rotateLocal(angularVelocity.length() * deltaTime, (Vector3f)new Vector3f(angularVelocity).normalise());

      	int numHits = 0;
        
		for(CollisionPoint point : type.points)
		{
      		if(!isPartIntact(point.part))
      			continue;
			if(EnumDriveablePart.isWheel(point.part) && !gearDown())
				continue;
			Vector3f pointVec = axes.findLocalVectorGlobally(point.getLocalVector());
			Vector3f newPointVec = newAxes.findLocalVectorGlobally(point.getLocalVector());
			Vector3f origin = Vector3f.add(position, pointVec, null);
			Vector3f newOrigin = Vector3f.add(position, newPointVec, null);
			Vector3f rayOrigin = Vector3f.sub(newOrigin, motion, null);
			Vector3f ray = Vector3f.add(newOrigin, motion, null);

	        if(worldObj.isRemote && FlansMod.DEBUG)
	        {
	        	worldObj.spawnEntityInWorld(new EntityDebugVector(worldObj, origin, (Vector3f)Vector3f.sub(ray, origin, null).scale(1F), 2, 1F, 0F, 0F));
	        }

			MovingObjectPosition hit = worldObj.clip(rayOrigin.toVec3(), ray.toVec3());

			if(hit != null)
			{
				numHits++;
			}
		}
        
		if(numHits > 0)
		{
			for(CollisionPoint point : type.points)
			{
	      		if(!isPartIntact(point.part))
	      			continue;
				if(EnumDriveablePart.isWheel(point.part) && !gearDown())
					continue;
				Vector3f pointVec = axes.findLocalVectorGlobally(point.getLocalVector());
				Vector3f newPointVec = newAxes.findLocalVectorGlobally(point.getLocalVector());
				Vector3f origin = Vector3f.add(position, pointVec, null);
				Vector3f newOrigin = Vector3f.add(position, newPointVec, null);
				Vector3f ray = Vector3f.add(newOrigin, motion, null);

				MovingObjectPosition hit = worldObj.clip(newOrigin.toVec3(), ray.toVec3());

				if(hit != null && hit.typeOfHit == EnumMovingObjectType.TILE)
				{
					Vector3f hitVec = new Vector3f(hit.hitVec);

					Vector3f normal = null;
					int x = 0, y = 0, z = 0;
					switch(hit.sideHit)
					{
					case 0 : normal = new Vector3f(0F, -1F, 0F); y = -1; break;
					case 1 : normal = new Vector3f(0F, 1F, 0F); y = 1; break;
					case 2 : normal = new Vector3f(0F, 0F, -1F); z = 1; break;
					case 3 : normal = new Vector3f(0F, 0F, 1F); z = -1; break;
					case 4 : normal = new Vector3f(-1F, 0F, 0F); x = 1; break;
					case 5 : normal = new Vector3f(1F, 0F, 0F); x = -1; break;
					}

					if(worldObj.isBlockSolidOnSide(hit.blockX + x, hit.blockY + y, hit.blockZ + z, ForgeDirection.getOrientation(hit.sideHit).getOpposite()))
					{
						continue;
					}

			        if(worldObj.isRemote && FlansMod.DEBUG)
			        {
			        	worldObj.spawnEntityInWorld(new EntityDebugVector(worldObj, hitVec, normal, 2, 0F, 1F, 0F));
			        }

			        float normalReactionMagnitude = Vector3f.dot(normal.negate(null), Vector3f.sub(ray, hitVec, null));
			        float forceMagnitude = type.mass * normalReactionMagnitude / (numHits * deltaTime);

			        applyForce(pointVec, (Vector3f)normal.scale(forceMagnitude));	   

			        //After taking this much force, the plane will take damage (scales with mass)
			        float damagePoint = 2F;
			        float damageModifier = 20F;

			        if(forceMagnitude > damagePoint * type.mass)
			        {
			        	float smashyForce = forceMagnitude - damagePoint * type.mass;
			        	DriveablePart part = getDriveableData().parts.get(point.part);
			        	float smashyForceVsBlock = part.smashIntoGround(this, damageModifier * smashyForce);
			        	int blockIDHit = worldObj.getBlockId(hit.blockX, hit.blockY, hit.blockZ);
			        	Block blockHit = Block.blocksList[blockIDHit];
			        	float blockHardness = blockHit.getBlockHardness(worldObj, hit.blockX, hit.blockY, hit.blockZ);
			        	if(FlansMod.driveablesBreakBlocks && smashyForceVsBlock > blockHardness && blockHardness >= 0)
			        	{
			        		blockHit.dropBlockAsItem(worldObj, hit.blockX, hit.blockY, hit.blockZ, worldObj.getBlockMetadata(hit.blockX, hit.blockY, hit.blockZ), 1);
							FlansMod.proxy.playBlockBreakSound(hit.blockX, hit.blockY, hit.blockZ, blockIDHit);
							worldObj.setBlockToAir(hit.blockX, hit.blockY, hit.blockZ);
			        	}
			        }
				}
			}
		}
		
		//Apply motion to position
		posX += motionX;
		posY += motionY;
		posZ += motionZ;
		
		//Apply motion to rotation
      	if(Math.abs(angularVelocity.lengthSquared()) > 0.00000001D)
			axes.rotateGlobal(angularVelocity.length() * deltaTime, (Vector3f)new Vector3f(angularVelocity).normalise());

      	numHits = 0;
      	
      	for(CollisionPoint point : type.points)
      	{
      		if(!isPartIntact(point.part))
      			continue;
			if(EnumDriveablePart.isWheel(point.part) && !gearDown())
				continue;

      		Vector3f pointVec = axes.findLocalVectorGlobally(point.getLocalVector());
      		int blockX = MathHelper.floor_double(posX + pointVec.x);
      		int blockY = MathHelper.floor_double(posY + pointVec.y);
      		int blockZ = MathHelper.floor_double(posZ + pointVec.z);
      		int blockID = worldObj.getBlockId(blockX, blockY, blockZ);
      		if(blockID > 0)
      		{
      			Block block = Block.blocksList[blockID];
      			ArrayList<AxisAlignedBB> aabbs = new ArrayList<AxisAlignedBB>();
      			block.addCollisionBoxesToList(worldObj, blockX, blockY, blockZ, AxisAlignedBB.getBoundingBox(posX + pointVec.x, posY + pointVec.y, posZ + pointVec.z, posX + pointVec.x, posY + pointVec.y, posZ + pointVec.z), aabbs, this);
      			if(aabbs.size() > 0)
      			{
      				numHits++;  
      			}
      		}
      	}
      	
      	for(CollisionPoint point : type.points)
      	{
      		if(!isPartIntact(point.part))
      			continue;
			if(EnumDriveablePart.isWheel(point.part) && !gearDown())
				continue;

      		Vector3f pointVec = axes.findLocalVectorGlobally(point.getLocalVector());
      		int blockX = MathHelper.floor_double(posX + pointVec.x);
      		int blockY = MathHelper.floor_double(posY + pointVec.y);
      		int blockZ = MathHelper.floor_double(posZ + pointVec.z);
      		int blockID = worldObj.getBlockId(blockX, blockY, blockZ);
      		if(blockID > 0)
      		{
      			Block block = Block.blocksList[blockID];
      			ArrayList<AxisAlignedBB> aabbs = new ArrayList<AxisAlignedBB>();
      			block.addCollisionBoxesToList(worldObj, blockX, blockY, blockZ, AxisAlignedBB.getBoundingBox(posX + pointVec.x, posY + pointVec.y, posZ + pointVec.z, posX + pointVec.x, posY + pointVec.y, posZ + pointVec.z), aabbs, this);
      			if(aabbs.size() > 0)
      			{
      				AxisAlignedBB aabb = aabbs.get(0);
      				double dminX = Math.abs(posX + pointVec.x - aabb.minX);
      				double dmaxX = Math.abs(posX + pointVec.x - aabb.maxX);
      				double dminY = Math.abs(posY + pointVec.y - aabb.minY);
      				double dmaxY = Math.abs(posY + pointVec.y - aabb.maxY);
      				double dminZ = Math.abs(posZ + pointVec.z - aabb.minZ);
      				double dmaxZ = Math.abs(posZ + pointVec.z - aabb.maxZ);
      				
      				double min = Math.min(Math.min(Math.min(dminX, dmaxX), Math.min(dminY, dmaxY)), Math.min(dminZ, dmaxZ));
      				      		
      				float pushiness = 1F;
      				float bounciness = type.bounciness;
      				
      				if(landVehicle())
      				{
      					if(!worldObj.isBlockOpaqueCube(blockX, blockY + 1, blockZ))
      						posY += (float)dmaxY * type.mass / (deltaTime * numHits) * bounciness;
      					else
      					{
      						min = Math.min(Math.min(dminX, dmaxX), Math.min(dminZ, dmaxZ));
      						if(Math.abs(dminX - min) < 0.00001F && !worldObj.isBlockOpaqueCube(blockX - 1, blockY, blockZ))
      						{
      							if(motionX > 0)
      								motionX = 0;
      							posX -= (float)dminX * type.mass / (deltaTime * numHits) * pushiness;
      						}
		      				else if(Math.abs(dmaxX - min) < 0.00001F && !worldObj.isBlockOpaqueCube(blockX + 1, blockY, blockZ))
      						{
      							if(motionX < 0)
      								motionX = 0;
		      					posX += (float)dmaxX * type.mass / (deltaTime * numHits) * pushiness;
      						}
		      				else if(Math.abs(dminZ - min) < 0.00001F && !worldObj.isBlockOpaqueCube(blockX, blockY, blockZ - 1))
      						{
      							if(motionZ > 0)
      								motionZ = 0;
		      					posZ -= (float)dminZ * type.mass / (deltaTime * numHits) * pushiness;
      						}
		      				else if(Math.abs(dmaxZ - min) < 0.00001F && !worldObj.isBlockOpaqueCube(blockX, blockY, blockZ + 1))
      						{
      							if(motionZ < 0)
      								motionZ = 0;
		      					posZ += (float)dmaxZ * type.mass / (deltaTime * numHits) * pushiness;
      						}
      					}
      				}
      				else
      				{
	      				if(Math.abs(dminX - min) < 0.00001F)
	      					posX -= (float)dminX * type.mass / (deltaTime * numHits) * type.bounciness;
	      				else if(Math.abs(dmaxX - min) < 0.00001F)
	      					posX += (float)dmaxX * type.mass / (deltaTime * numHits) * type.bounciness;
	      				else if(Math.abs(dmaxY - min) < 0.00001F)
	      					posY += (float)dmaxY * type.mass / (deltaTime * numHits) * type.bounciness;
	      				else if(Math.abs(dminZ - min) < 0.00001F)
	      					posZ -= (float)dminZ * type.mass / (deltaTime * numHits) * type.bounciness;
	      				else if(Math.abs(dmaxZ - min) < 0.00001F)
	      					posZ += (float)dmaxZ * type.mass / (deltaTime * numHits) * type.bounciness;
      				}
      			}
      		}
      	}
      	
		checkParts();
		
		setPosition(posX, posY, posZ);
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
	
	public boolean attackPoint(CollisionPoint point, DamageSource damagesource, float i)
	{
		return false;
	}
	
	/** Attack method called by bullets hitting the plane. Does advanced raytracing to detect which part of the plane is hit */
	public boolean attackFromBullet(EntityBullet bullet, Vector3f origin, Vector3f motion)
	{
		//Get the position of the bullet origin, relative to the centre of the plane, and then rotate the vectors onto local co-ordinates
		Vector3f relativePosVector = Vector3f.sub(origin, new Vector3f((float)posX, (float)posY, (float)posZ), null);
		Vector3f rotatedPosVector = axes.findGlobalVectorLocally(relativePosVector);
		Vector3f rotatedMotVector = axes.findGlobalVectorLocally(motion);
		//Check each part
		for(DriveablePart part : getDriveableData().parts.values())
		{
			//Ray trace the bullet
			if(part.rayTrace(this, bullet, rotatedPosVector, rotatedMotVector))
			{
				//This is server side bsns
				if(worldObj.isRemote)
					return true;
				checkParts();

				//If it hit, send a damage update packet
				PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 100, dimension, PacketDriveableDamage.buildUpdatePacket(this));
				return true;
			}
		}
		return false;
	}
	
	/** A simple raytracer for the driveable */
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
			if(part.rayTrace(this, null, rotatedPosVector, rotatedMotVector))
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
			setDead();
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
	    		pos = axes.findLocalVectorGlobally(new Vector3f((float)part.box.x / 16F + (float)part.box.w / 32F, (float)part.box.y / 16F + (float)part.box.h / 32F, (float)part.box.z / 16F + (float)part.box.d / 32F));
	    		
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
		return getDriveableData().parts.get(part).maxHealth == 0 || getDriveableData().parts.get(part).health > 0; 
	}
	
	public abstract boolean hasMouseControlMode();
	
	public abstract String getBombInventoryName();
	
	public boolean rotateWithTurret(Seat seat)
	{
		return seat.part == EnumDriveablePart.turret;
	}
	
	@Override
	public String getEntityName()
	{
		return getDriveableType().name;
	}
	
	
	// Destroys the target with a boom. This is a forced way for the sentry too kill the target if
	// it doesn't take damage
	// Not needed in Flan due to plane is detroyed when HP = 0
	public void destroyCraft()
	{
	
	}
	
	// Applies damage to the the target
	// 
	// @param damage - damage in half HP
	// @return the amount of HP left. Return -1 if this target can't take damage, and will be chance
	// killed. Return 0 if this target is dead and destroyCraft() will be called.
	
	public int doDamage(int damage)
	{
		DriveablePart core = getDriveableData().parts.get(EnumDriveablePart.core);
		core.health -= damage;
		checkParts();
		return core.health;
	}
	
	// Can this be targeted by automated targeting systems or AIs. Used to implement radar jammers,
	// cloaking devices, and other addons for the Entity being targeted
	//
	// @param entity - entity that is targeting this, can be an Entity, EntityLiving, or TileEntity
	// @return true if it can
	public boolean canBeTargeted(Object entity)
	{
		//Check config for option to show plane on radar
		DriveableType type = getDriveableType();
		if(type.onRadar == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
