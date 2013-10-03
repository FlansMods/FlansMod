package co.uk.flansmods.common.driveables.mechas;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.lwjgl.input.Keyboard;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import co.uk.flansmods.client.KeyInputHandler;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.ItemPart;
import co.uk.flansmods.common.ItemTool;
import co.uk.flansmods.common.RotatedAxes;
import co.uk.flansmods.common.driveables.DriveableData;
import co.uk.flansmods.common.driveables.DriveablePart;
import co.uk.flansmods.common.driveables.DriveableType;
import co.uk.flansmods.common.driveables.EntityDriveable;
import co.uk.flansmods.common.driveables.EntitySeat;
import co.uk.flansmods.common.driveables.VehicleType;
import co.uk.flansmods.common.network.PacketVehicleControl;
import co.uk.flansmods.common.network.PacketVehicleKey;
import co.uk.flansmods.common.vector.Vector3f;
import cpw.mods.fml.common.network.PacketDispatcher;

public class EntityMecha extends EntityDriveable
{
	public int fMotion = 0;
	public int sMotion = 0;
	private int ticksSinceUsed;
    public int toggleTimer = 0;
    private int moveX = 0;
    private int moveZ = 0;
    public RotatedAxes legAxes;

	public EntityMecha(World world) {
		super(world);
		legAxes = new RotatedAxes();
	}
	
	public EntityMecha(World world, double x, double y, double z, MechaType type, DriveableData data) {
		super(world, type, data);
		legAxes = new RotatedAxes();
		setPosition(x, y, z);
		initType(type, false);
	}
	
	public EntityMecha(World world, double x, double y, double z, EntityPlayer placer, MechaType type, DriveableData data) {
		this(world, x, y, z, type, data);
		rotateYaw(placer.rotationYaw + 90F);
	}
	
	@Override
    protected void writeEntityToNBT(NBTTagCompound tag)
    {
        super.writeEntityToNBT(tag);
        tag.setFloat("LegsYaw", legAxes.getYaw());
    }

	@Override
    protected void readEntityFromNBT(NBTTagCompound tag)
    {
        super.readEntityFromNBT(tag);
        legAxes.setAngles(tag.getFloat("LegsYaw"), 0, 0);
    }

	@Override
	public void writeUpdateData(DataOutputStream out)
	{
		try
		{
			out.writeFloat(legAxes.getYaw());
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
			legAxes.setAngles(in.readFloat(), 0, 0);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

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
		
		MechaType type = getMechaType();
		//Check each seat in order to see if the player can sit in it
		for(int i = 0; i <= type.numPassengers; i++)
		{
			if(canSit(i))
			{
				entityplayer.mountEntity(seats[i]);
				return true;
			}
		}
        return false;
    }
	
	public MechaType getMechaType()
	{
		return MechaType.getMecha(driveableType);
	}
	
	@Override
	public boolean pressKey(int key, EntityPlayer player)
	{
		MechaType type = getMechaType();
		//send keys which require server side updates to the server
    	if(worldObj.isRemote && (key == 6 || key == 8 || key == 9))
    	{
    		PacketDispatcher.sendPacketToServer(PacketVehicleKey.buildKeyPacket(key));
    		return true;
    	}
    	switch(key)
    	{
    		case 0 : //Forwards (these movement cases are redundant, as Mechas need to stop when the key is released)
    		{
    			return true;
    		}
    		case 1 : //Backwards
    		{
    			return true;
    		}
    		case 2 : //Left
    		{
    			return true;
    		}
    		case 3 : //Right
    		{
    			return true;
    		}
			case 4 : //Up : Will jump, later
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
				return true;
			}
			case 8 : //UseR
			{
				return true;
			}
			case 9 : //UseL
			{
				return true;
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
			case 13 : //Gear : Do nothing
			{
				return true;
			}
			case 14 : //Door : Do nothing
			{
				return true;
			}
			case 15 : //???
			{
				return true;
			}
			case 16 : //???
			{
				return true;
			}
			case 17 : //???
			{
				return true;
			}
			
    	}
		return false;
	}

	@Override
    public boolean attackEntityFrom(DamageSource damagesource, float i)
    {
        if(worldObj.isRemote || isDead)
            return true;
        
        MechaType type = getMechaType();
        
		if(damagesource.damageType.equals("player") && ((EntityDamageSource)damagesource).getEntity().onGround)
		{
			ItemStack mechaStack = new ItemStack(type.itemID, 1, 0);
			mechaStack.stackTagCompound = new NBTTagCompound();
			driveableData.writeToNBT(mechaStack.stackTagCompound);
			entityDropItem(mechaStack, 0.5F);
	 		setDead();
		}
        return true;
    }
	
	public void onUpdate()
	{
		super.onUpdate();
		
		//Get Mecha Type
		MechaType type = this.getMechaType();
		if (type == null)
		{
			FlansMod.log("Mecha type null. Not ticking mecha");
			return;
		}
		
		//Work out of this is client side and the player is driving
		boolean thePlayerIsDrivingThis = worldObj.isRemote && seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && FlansMod.proxy.isThePlayer((EntityPlayer)seats[0].riddenByEntity);
		boolean driverIsLiving = seats[0] != null && seats[0].riddenByEntity instanceof EntityLivingBase;
		
		//Despawning
		ticksSinceUsed++;
		if(!worldObj.isRemote && seats[0].riddenByEntity != null)
			ticksSinceUsed = 0;
		if(!worldObj.isRemote && FlansMod.mechaLove > 0 && ticksSinceUsed > FlansMod.mechaLove * 20)
		{
			setDead();
		}
		
		//Timer, for general use
		if(toggleTimer > 0)
			toggleTimer--;
		
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
		
		if(seats[0] != null)
		{
			float yaw = seats[0].looking.getYaw() - seats[0].prevLooking.getYaw();
			axes.rotateGlobalYaw(yaw);
			seats[0].looking.rotateGlobalYaw(-yaw);
		}
		
		moveX = 0;
		moveZ = 0;
		
		if(driverIsLiving)
		{
			EntityLivingBase entity = (EntityLivingBase)seats[0].riddenByEntity;
			if(thePlayerIsDrivingThis)
			{
				if(FlansMod.proxy.isKeyDown(0)) moveX = 1;
				if(FlansMod.proxy.isKeyDown(1)) moveX = -1;
				if(FlansMod.proxy.isKeyDown(2)) moveZ = -1;
				if(FlansMod.proxy.isKeyDown(3)) moveZ = 1;
			}
			else
			{
				if(entity.moveForward > 0.2) moveX = -1;
				if(entity.moveForward < 0.2) moveX = 1;
				if(entity.moveStrafing > 0.2) moveZ = 1;
				if(entity.moveStrafing < 0.2) moveZ = -1;
			}
			
			Vector3f intent = new Vector3f(moveX, 0, moveZ);
			
			if(Math.abs(intent.lengthSquared()) > 0.1) intent.normalise();
			
			intent = axes.findLocalVectorGlobally(intent);
			
			Vector3f motion = legAxes.getXAxis();
			
			motion.scale((type.moveSpeed)*(4.3F/20F)*(intent.lengthSquared()));
			
	    	DriveableData data = getDriveableData();
			
			boolean canThrustCreatively = seats != null && seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode;

			if(canThrustCreatively || data.fuelInTank > data.engine.fuelConsumption * throttle)
			{
		    	//Move!
		    	posX += motion.x;
		    	posY += motion.y;
		    	posZ += motion.z;
		    	
		    	setPosition(posX, posY, posZ);
				
				//If we can't thrust creatively, we must thrust using fuel. Nom.
				if(!canThrustCreatively)
					data.fuelInTank -= data.engine.fuelConsumption * throttle;
			}
		}
		
		//Gravity
		{
			float gravitationalAcceleration = (9.81F/20F);
		}
		
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
			//Consume 100 points of fuel (1 damage)
			data.fuel.setItemDamage(damage + 1);
			//Put 100 points of fuel 
			data.fuelInTank += 100;
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
		//Check fuel slot for buildcraft buckets and if found, take fuel from them
		if(FlansMod.hooks.BuildCraftLoaded && !fuelling && data.fuel != null && data.fuel.stackSize > 0)
		{
			if(data.fuel.isItemEqual(FlansMod.hooks.BuildCraftOilBucket) && data.fuelInTank + 500 <= type.fuelTankSize)
			{
				data.fuelInTank += 5000;
				data.fuel = new ItemStack(Item.bucketEmpty);
			}
			else if(data.fuel.isItemEqual(FlansMod.hooks.BuildCraftFuelBucket) && data.fuelInTank + 1000 <= type.fuelTankSize)
			{
				data.fuelInTank += 10000;
				data.fuel = new ItemStack(Item.bucketEmpty);
			}
		}
		
		for(EntitySeat seat : seats)
		{
			if(seat != null)
				seat.updatePosition();
		}
		
		//Calculate movement on the client and then send position, rotation etc to the server
		if(thePlayerIsDrivingThis)
		{
			PacketDispatcher.sendPacketToServer(PacketVehicleControl.buildUpdatePacket(this));
		}
		
		//If this is the server, send position updates to everyone, having received them from the driver
		if(!worldObj.isRemote && ticksExisted % 5 == 0)
		{
			PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 200, dimension, PacketVehicleControl.buildUpdatePacket(this));
		}
		
	}
	
	@Override
	protected void dropItemsOnPartDeath(Vector3f midpoint, DriveablePart part) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hasMouseControlMode() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getBombInventoryName() {
		// TODO Auto-generated method stub
		return null;
	}

}