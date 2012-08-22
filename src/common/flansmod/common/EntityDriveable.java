package flansmod.common;

import java.util.List;
import java.util.Random;
import org.lwjgl.input.Keyboard;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.DamageSource;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Vec3;
import net.minecraft.src.World;

public abstract class EntityDriveable extends Entity
{
    public EntityDriveable(World world)
    {
        super(world);
		axes = new RotatedAxes();
        preventEntitySpawning = true;
        setSize(1.0F, 1.0F);
        yOffset = 6F / 16F;
		ignoreFrustumCheck = true;
		renderDistanceWeight = 200D;
    }
	
	public EntityDriveable(World world, DriveableType t, DriveableData d)
	{
		this(world);
		superType = t;	
		superData = d;
	}	

    protected boolean canTriggerWalking()
    {
        return false;
    }

    protected void entityInit()
    {
    }

    public AxisAlignedBB getCollisionBox(Entity entity)
    {
        return entity.boundingBox;
    }

    public AxisAlignedBB getBoundingBox()
    {
        return boundingBox;
    }

    public boolean canBePushed()
    {
        return true;
    }

    public double getMountedYOffset()
    {
        return (double)height * 0.0D - 0.30000001192092896D;
    }
	
	public abstract boolean attackEntityFromPart(EntityCollisionBox box, DamageSource damagesource, int i);
	
	public boolean attackEntityFrom(DamageSource damagesource, int i)
    {
	    if(worldObj.isRemote || isDead)
        {
            return true;
        }
		health -= i;
		if(health <= 0)
			setDead();
		return true;
	}
	
	public void onCollideWithPlayer(EntityPlayer par1EntityPlayer) 
	{
		//Do nothing. Like a boss.
	}

    public boolean canBeCollidedWith()
    {
        return !isDead;
    }

    public void setPositionAndRotation2(double d, double d1, double d2, float f, 
            float f1, int i)
    {
        boatX = d;
        boatY = d1;
        boatZ = d2;
        boatYaw = f;
        boatPitch = f1;
        boatPosRotationIncrements = i + 4;
        motionX = velocityX;
        motionY = velocityY;
        motionZ = velocityZ;
    }

    public void setVelocity(double d, double d1, double d2)
    {
        velocityX = motionX = d;
        velocityY = motionY = d1;
        velocityZ = motionZ = d2;
    }
	
	public abstract void pressKey(int key);

    public void onUpdate()
    {
        super.onUpdate();
        prevPosX = posX;
        prevPosY = posY;
        prevPosZ = posZ;
		prevRotationYaw = axes.getYaw();
		prevRotationPitch = axes.getPitch();
		prevRotationRoll = axes.getRoll();		
		
        if(riddenByEntity != null && riddenByEntity.isDead)
        {
            riddenByEntity = null;
        }
		if(riddenByEntity != null && isDead)
		{
			riddenByEntity.mountEntity(this);
		}
		if(riddenByEntity != null)
			riddenByEntity.fallDistance = 0F;
    }
	
	public double getSpeedXYZ()
	{
		return Math.sqrt(motionX * motionX + motionY * motionY + motionZ * motionZ);
	}
	
	public double getSpeedXZ()
	{
		return Math.sqrt(motionX * motionX + motionZ * motionZ);
	}
	
	public Vec3 rotate(Vec3 inVec)
	{
		return rotate(inVec.xCoord, inVec.yCoord, inVec.zCoord);
	}

	public Vec3 rotate(double x, double y, double z)
	{	
		double cosYaw = Math.cos(axes.getYaw() * 3.14159265F / 180F);
		double sinYaw = Math.sin(axes.getYaw() * 3.14159265F / 180F);
		double cosPitch = Math.cos(axes.getPitch() * 3.14159265F / 180F);
		double sinPitch = Math.sin(axes.getPitch() * 3.14159265F / 180F);
		double cosRoll = Math.cos(axes.getRoll() * 3.14159265F / 180F);
		double sinRoll = Math.sin(axes.getRoll() * 3.14159265F / 180F);
		
		double newX = (x * cosRoll - y * sinRoll) * cosYaw + ((x * sinRoll + y * cosRoll) * sinPitch + z * cosPitch) * sinYaw;
		double newY = (x * sinRoll + y * cosRoll) * cosPitch - z * sinPitch;
		double newZ = (y * sinRoll - x * cosRoll) * sinYaw + ((x * sinRoll + y * cosRoll) * sinPitch + z * cosPitch) * cosYaw;
		
		return Vec3.createVectorHelper(newX, newY, newZ);
	}
	
	//Rotate the plane locally by some angle about the yaw axis
	public void rotateYaw(float rotateBy)
	{
		axes.rotateLocalYaw(rotateBy);
		updatePrevAngles();
	}
	
	//Rotate the plane locally by some angle about the pitch axis
	public void rotatePitch(float rotateBy)
	{
		axes.rotateLocalPitch(rotateBy);
		updatePrevAngles();
	}
	
	//Rotate the plane locally by some angle about the roll axis
	public void rotateRoll(float rotateBy)
	{
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
		setRotation(rotYaw, rotPitch);
		//axes.getRoll() = rotRoll;
	}
	
	//Used to stop self collision
	public boolean isPartOfThis(Entity ent)
	{
		for(EntityPassengerSeat seat : seats)
		{
			if(ent == seat)
				return true;
			if(seat.riddenByEntity != null && seat.riddenByEntity == ent)
				return true;
		}
		for(EntityCollisionBox box : boxes)
		{
			if(ent == box)
				return true;
		}
		if(riddenByEntity != null && ent == riddenByEntity)
			return true;
		return ent == this;	
	}
	
	public abstract void useGun(int gunID, EntityPlayer player, EntityPassengerSeat seat);

    public float getShadowSize()
    {
        return 0.0F;
    }
	
	public abstract void updateCollisionBox(EntityCollisionBox box);
	
    private int boatPosRotationIncrements;
    private double boatX;
    private double boatY;
    private double boatZ;
    private double boatYaw;
    private double boatPitch;
    private double velocityX;
    private double velocityY;
    private double velocityZ;
	
	public int dataID;
	public DriveableData superData;
	public DriveableType superType;
	public int health;

	public boolean fuelling;
	public float prevRotationRoll;
	public float velocityYaw;
	public float velocityPitch;
	public float velocityRoll;
	
	public RotatedAxes axes;
	
	public EntityPassengerSeat[] seats;
	public EntityCollisionBox[] boxes;
	
	public static Minecraft mc = FMLClientHandler.instance().getClient();
}
