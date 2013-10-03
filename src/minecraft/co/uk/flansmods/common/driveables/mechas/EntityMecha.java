package co.uk.flansmods.common.driveables.mechas;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.world.World;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.ItemTool;
import co.uk.flansmods.common.driveables.DriveableData;
import co.uk.flansmods.common.driveables.DriveablePart;
import co.uk.flansmods.common.driveables.DriveableType;
import co.uk.flansmods.common.driveables.EntityDriveable;
import co.uk.flansmods.common.driveables.VehicleType;
import co.uk.flansmods.common.network.PacketVehicleKey;
import co.uk.flansmods.common.vector.Vector3f;
import cpw.mods.fml.common.network.PacketDispatcher;

public class EntityMecha extends EntityDriveable
{
	public int fMotion = 0;
	public int sMotion = 0;
	private int ticksSinceUsed;

	public EntityMecha(World world) {
		super(world);
	}
	
	public EntityMecha(World world, double x, double y, double z, MechaType type, DriveableData data) {
		super(world, type, data);
		setPosition(x, y, z);
		initType(type, false);
	}
	
	public EntityMecha(World world, double x, double y, double z, EntityPlayer placer, MechaType type, DriveableData data) {
		this(world, x, y, z, type, data);
		rotateYaw(placer.rotationYaw + 90F);
	}

	@Override
	public void writeUpdateData(DataOutputStream out)
	{
	}

	@Override
	public void readUpdateData(DataInputStream in)
	{
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