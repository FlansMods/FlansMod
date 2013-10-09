package co.uk.flansmods.common.driveables.mechas;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.lwjgl.input.Mouse;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteArrayDataOutput;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import co.uk.flansmods.client.FlansModClient;
import co.uk.flansmods.client.GuiDriveableController;
import co.uk.flansmods.client.debug.EntityDebugVector;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.FlansModPlayerHandler;
import co.uk.flansmods.common.InfoType;
import co.uk.flansmods.common.ItemBullet;
import co.uk.flansmods.common.ItemPart;
import co.uk.flansmods.common.ItemTool;
import co.uk.flansmods.common.RotatedAxes;
import co.uk.flansmods.common.driveables.DriveableData;
import co.uk.flansmods.common.driveables.DriveablePart;
import co.uk.flansmods.common.driveables.DriveableType;
import co.uk.flansmods.common.driveables.EntityDriveable;
import co.uk.flansmods.common.driveables.EntitySeat;
import co.uk.flansmods.common.driveables.EnumDriveablePart;
import co.uk.flansmods.common.driveables.VehicleType;
import co.uk.flansmods.common.guns.BulletType;
import co.uk.flansmods.common.guns.EntityBullet;
import co.uk.flansmods.common.guns.GunType;
import co.uk.flansmods.common.guns.ItemGun;
import co.uk.flansmods.common.network.PacketDriveableDamage;
import co.uk.flansmods.common.network.PacketPlaySound;
import co.uk.flansmods.common.network.PacketVehicleControl;
import co.uk.flansmods.common.network.PacketVehicleGUI;
import co.uk.flansmods.common.network.PacketVehicleKey;
import co.uk.flansmods.common.vector.Vector3f;
import co.uk.flansmods.common.vector.Vector3i;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityMecha extends EntityDriveable
{
	public int fMotion = 0;
	public int sMotion = 0;
	private int ticksSinceUsed;
    public int toggleTimer = 0;
    private float moveX = 0, moveZ = 0;
    public RotatedAxes legAxes;
    public float prevLegsYaw = 0F;
    private int jumpDelay = 0;
    public MechaInventory inventory;
    public float legSwing = 0;
    /** Used for shooting guns */
    public int shootDelayLeft = 0, shootDelayRight = 0;
    /** Used for gun sounds */
    public int soundDelayLeft = 0, soundDelayRight = 0;
    /** The coords of the blocks being destroyed */
    public Vector3i breakingBlock = null;
    /** Progress made towards breaking each block */
    public float breakingProgress = 0F;
    
    /** The ID of the slot that we are pulling fuel from. -1 means we have not found one */
    private int foundFuel = -1;
    /** True if we need fuel but could not find any in the inventory. Reset when the inventory updated */
    public boolean couldNotFindFuel = false;

	public EntityMecha(World world) 
	{
		super(world);
		setSize(2F, 3F);
		stepHeight = 3;
		legAxes = new RotatedAxes();
		inventory = new MechaInventory(this);
	}
	
	public EntityMecha(World world, double x, double y, double z, MechaType type, DriveableData data) 
	{
		super(world, type, data);
		legAxes = new RotatedAxes();
		setSize(2F, 3F);
		stepHeight = 3;
		setPosition(x, y, z);
		initType(type, false);
		inventory = new MechaInventory(this);
	}
	
	public EntityMecha(World world, double x, double y, double z, EntityPlayer placer, MechaType type, DriveableData data) 
	{
		this(world, x, y, z, type, data);
		rotateYaw(placer.rotationYaw + 90F);
		legAxes.rotateGlobalYaw(placer.rotationYaw + 90F);
		prevLegsYaw = legAxes.getYaw();
	}
	
    @Override
    protected void initType(DriveableType type, boolean clientSide)
    {
    	super.initType(type, clientSide);
    	setSize(((MechaType)type).width, ((MechaType)type).height);
    	stepHeight = ((MechaType)type).stepHeight;
    }
	
	@Override
    protected void writeEntityToNBT(NBTTagCompound tag)
    {
        super.writeEntityToNBT(tag);
        tag.setFloat("LegsYaw", legAxes.getYaw());
        tag.setCompoundTag("Inventory", inventory.writeToNBT(new NBTTagCompound()));
    }

	@Override
    protected void readEntityFromNBT(NBTTagCompound tag)
    {
        super.readEntityFromNBT(tag);
        legAxes.setAngles(tag.getFloat("LegsYaw"), 0, 0);
        inventory.readFromNBT(tag.getCompoundTag("Inventory"));
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
	public void writeSpawnData(ByteArrayDataOutput outputData)
	{
		super.writeSpawnData(outputData);
		
		try
		{
			NBTBase.writeNamedTag(inventory.writeToNBT(new NBTTagCompound()), outputData);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public void readSpawnData(ByteArrayDataInput inputData)
	{
		super.readSpawnData(inputData);
		legAxes.rotateGlobalYaw(axes.getYaw());
		prevLegsYaw = legAxes.getYaw();
		
		try
		{
			inventory.readFromNBT((NBTTagCompound)NBTBase.readNamedTag(inputData));
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
			if(seats[i].interactFirst(entityplayer))
				return true;
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
    	DriveableData data = getDriveableData();
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
			case 4 : //Jump
			{
				boolean canThrustCreatively = seats != null && seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode;
				if(onGround && (jumpDelay == 0) && (canThrustCreatively || data.fuelInTank > data.engine.fuelConsumption) && isPartIntact(EnumDriveablePart.hips))
				{
					jumpDelay = 10;
					motionY += type.jumpVelocity;
					if(!canThrustCreatively)
						data.fuelInTank -= data.engine.fuelConsumption;
				}
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
				PacketDispatcher.sendPacketToServer(PacketVehicleGUI.buildGUIPacket(4));
				((EntityPlayer)seats[0].riddenByEntity).openGui(FlansMod.instance, 10, worldObj, chunkCoordX, chunkCoordY, chunkCoordZ);
				return true;
			}
			case 8 : //UseR
			{
				return true; //useItem(false);
			}
			case 9 : //UseL
			{
				return true; //useItem(true);
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
	
	private boolean useItem(boolean left)
	{
		boolean creative = seats[0].riddenByEntity instanceof EntityPlayer ? ((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode : true;
		ItemStack heldStack = left ? inventory.getStackInSlot(EnumMechaSlotType.leftTool) : inventory.getStackInSlot(EnumMechaSlotType.rightTool);
		if(heldStack == null)
			return false;
		
		Item heldItem = heldStack.getItem();
		
		MechaType mechaType = getMechaType();
		
		if(heldItem instanceof ItemMechaAddon)
		{
			MechaItemType toolType = ((ItemMechaAddon)heldItem).type;
			
			float reach = 100F; //toolType.reach * mechaType.reach;
			
			Vector3f lookOrigin = new Vector3f((float)mechaType.seats[0].x / 16F, (float)mechaType.seats[0].y / 16F + seats[0].riddenByEntity.getMountedYOffset(), (float)mechaType.seats[0].z / 16F);
			lookOrigin = axes.findLocalVectorGlobally(lookOrigin);
			Vector3f.add(lookOrigin, new Vector3f(posX, posY, posZ), lookOrigin);
	
			Vector3f lookVector = axes.findLocalVectorGlobally(seats[0].looking.findLocalVectorGlobally(new Vector3f(reach, 0F, 0F)));
			
			worldObj.spawnEntityInWorld(new EntityDebugVector(worldObj, lookOrigin, lookVector, 20));
			
			Vector3f lookTarget = Vector3f.add(lookVector, new Vector3f(posX, posY, posZ), null);
			
			MovingObjectPosition hit = worldObj.clip(lookOrigin.toVec3(), lookTarget.toVec3());
			if(hit != null && hit.typeOfHit == EnumMovingObjectType.TILE)
			{
				if(breakingBlock == null || breakingBlock.x != hit.blockX || breakingBlock.y != hit.blockY || breakingBlock.z != hit.blockZ)
					breakingProgress = 0F;
				breakingBlock = new Vector3i(hit.blockX, hit.blockY, hit.blockZ);
			}
		}
		
		else if(heldItem instanceof ItemGun)
		{
			ItemGun gunItem = (ItemGun)heldItem;
			GunType gunType = gunItem.type;
			
			//Get the correct shoot delay
			int delay = left ? shootDelayLeft : shootDelayRight;
			
			//If we can shoot
			if(delay <= 0)
			{
				//Go through the bullet stacks in the gun and see if any of them are not null
				int bulletID = 0;
				ItemStack bulletStack = null;
				for(; bulletID < gunType.numAmmoItemsInGun; bulletID++)
				{
					ItemStack checkingStack = gunItem.getBulletItemStack(heldStack, bulletID);
					if(checkingStack != null && checkingStack.getItem() != null && checkingStack.getItemDamage() < checkingStack.getMaxDamage())
					{
						bulletStack = checkingStack;
						break;
					}
				}
				
				//If no bullet stack was found, reload
				if(bulletStack == null)
				{
					gunItem.reload(heldStack, worldObj, this, driveableData, creative, false);				
				}
				//A bullet stack was found, so try shooting with it
				else if(bulletStack.getItem() instanceof ItemBullet)
				{
					//Shoot
					BulletType bulletType = ((ItemBullet)bulletStack.getItem()).type;
					shoot(gunType, bulletType, creative, left);
					//Damage the bullet item
					bulletStack.setItemDamage(bulletStack.getItemDamage() + 1);
					
					//Update the stack in the gun
					gunItem.setBulletItemStack(heldStack, bulletStack, bulletID);
				}
			}
		}
		
		return true;
	}
	
	private void shoot(GunType gunType, BulletType bulletType, boolean creative, boolean left)
	{
		MechaType mechaType = getMechaType();
		
		RotatedAxes a = new RotatedAxes();
		
		Vector3f armVector = new Vector3f(mechaType.armLength, 0F, 0F);
		Vector3f gunVector = new Vector3f(mechaType.armLength + 1.2F * mechaType.heldItemScale, 0.5F * mechaType.heldItemScale, 0F);
		Vector3f armOrigin = left ?  mechaType.leftArmOrigin : mechaType.rightArmOrigin;
		
		a.rotateGlobalYaw(axes.getYaw());
		armOrigin = a.findLocalVectorGlobally(armOrigin);
		
		a.rotateLocalPitch(-seats[0].looking.getPitch());
		gunVector = a.findLocalVectorGlobally(gunVector);
		armVector = a.findLocalVectorGlobally(armVector);
		
		Vector3f bulletOrigin = Vector3f.add(armOrigin, gunVector, null);
		
		bulletOrigin  = Vector3f.add(new Vector3f(posX, posY, posZ), bulletOrigin, null);
				
		if(!worldObj.isRemote)
			for (int k = 0; k < gunType.numBullets; k++)
				worldObj.spawnEntityInWorld(new EntityBullet(worldObj, bulletOrigin, armVector, (EntityLivingBase)(seats[0].riddenByEntity), (float)gunType.accuracy / 2, gunType.damage, bulletType, gunType.speed, mechaType));
		
		if(left)
			shootDelayLeft = gunType.mode == 0 ? Math.max(gunType.shootDelay, 5) : gunType.shootDelay;
		else shootDelayRight = gunType.mode == 0 ? Math.max(gunType.shootDelay, 5) : gunType.shootDelay;
		
		if(bulletType.dropItemOnShoot != null && !creative)
			ItemGun.dropItem(worldObj, this, bulletType.dropItemOnShoot);
		
		// Play a sound if the previous sound has finished
		if((left ? soundDelayLeft : soundDelayRight) <= 0 && gunType.shootSound != null)
		{
			PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 50, dimension, PacketPlaySound.buildSoundPacket(posX, posY, posZ, gunType.shootSound, gunType.distortSound));
			if(left)
				soundDelayLeft = gunType.shootSoundLength;
			else soundDelayRight = gunType.shootSoundLength;
		}		
	}
	

	
	@Override
    public boolean attackEntityFrom(DamageSource damagesource, float i)
    {
        if(worldObj.isRemote || isDead)
            return true;
        
        MechaType type = getMechaType();
        
        if(damagesource.getDamageType().equals("fall"))
        {
        	float damageToInflict = i * type.fallDamageMultiplier;
        	float blockDamageFromFalling = i * type.blockDamageFromFalling / 10F;
        	driveableData.parts.get(EnumDriveablePart.hips).attack(damageToInflict, false);
        	checkParts();
			PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 100, dimension, PacketDriveableDamage.buildUpdatePacket(this));
        	if(blockDamageFromFalling > 1)
        	{
        		worldObj.createExplosion(this, posX, posY, posZ, blockDamageFromFalling, FlansMod.explosions);
        	}
        }
        
		if(damagesource.damageType.equals("player") && ((EntityDamageSource)damagesource).getEntity().onGround && (seats[0] == null || seats[0].riddenByEntity == null))
		{
			ItemStack mechaStack = new ItemStack(type.itemID, 1, 0);
			mechaStack.stackTagCompound = new NBTTagCompound();
			driveableData.writeToNBT(mechaStack.stackTagCompound);
			entityDropItem(mechaStack, 0.5F);
	 		setDead();
		}
        return true;
    }
	
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		
		//Decrement delay variables
		if(jumpDelay > 0) jumpDelay--;
		if(shootDelayLeft > 0)  shootDelayLeft--;
		if(shootDelayRight > 0) shootDelayRight--;
		if(soundDelayLeft > 0)  soundDelayLeft--;
		if(soundDelayRight > 0) soundDelayRight--;
		
		//Get Mecha Type
		MechaType type = this.getMechaType();
		DriveableData data = getDriveableData();
		if (type == null)
		{
			FlansMod.log("Mecha type null. Not ticking mecha");
			return;
		}
		
		prevLegsYaw = legAxes.getYaw();
		
		//TODO better implement this
		if(isPartIntact(EnumDriveablePart.hips))
		{
			setSize(type.width, type.height);
			yOffset = type.yOffset;
		}
		else
		{
			setSize(type.width, type.height - type.chassisHeight);
			yOffset = type.yOffset - type.chassisHeight;
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
		
		if(seats[0] != null)
		{
			if(seats[0].riddenByEntity instanceof EntityLivingBase && !(seats[0].riddenByEntity instanceof EntityPlayer))
				axes.setAngles(((EntityLivingBase)seats[0].riddenByEntity).renderYawOffset + 90F, 0F, 0F);
			else
			{
				float yaw = seats[0].looking.getYaw() - seats[0].prevLooking.getYaw();
				axes.rotateGlobalYaw(yaw);
				seats[0].looking.rotateGlobalYaw(-yaw);
			}
		}
		
		moveX = 0;
		moveZ = 0;
		
		Vector3f actualMotion = new Vector3f(0F, motionY - 9.81F / 400F, 0F);
		
		if(driverIsLiving)
		{
			EntityLivingBase entity = (EntityLivingBase)seats[0].riddenByEntity;
			if(thePlayerIsDrivingThis && Minecraft.getMinecraft().currentScreen instanceof GuiDriveableController)
			{
				if(FlansMod.proxy.isKeyDown(0)) moveX = 1;
				if(FlansMod.proxy.isKeyDown(1)) moveX = -1;
				if(FlansMod.proxy.isKeyDown(2)) moveZ = -1;
				if(FlansMod.proxy.isKeyDown(3)) moveZ = 1;				
			}
			else if(seats[0].riddenByEntity instanceof EntityLiving && !(seats[0].riddenByEntity instanceof EntityPlayer))
			{

				moveZ = 1;
				/*
				EntityLiving ent = (EntityLiving)seats[0].riddenByEntity;
				//System.out.println(ent.moveForward);
				Vec3 target = Vec3.createVectorHelper(0D, 0D, 0D);
				if(ent.getNavigator().getPath() != null)
					target = ent.getNavigator().getPath().getPosition(ent);
				moveX = (float) target.xCoord;
				moveZ = (float) target.zCoord;
				*/
			}
			
			Vector3f intent = new Vector3f(moveX, 0, moveZ);
			
			if(Math.abs(intent.lengthSquared()) > 0.1) 
			{
				intent.normalise();
				
				++legSwing;
			
				intent = axes.findLocalVectorGlobally(intent);
							
				Vector3f intentOnLegAxes = legAxes.findGlobalVectorLocally(intent);
				float intentAngle = (float)Math.atan2(intent.z, intent.x) * 180F / 3.14159265F;
				float angleBetween = intentAngle - legAxes.getYaw();
				if(angleBetween > 180F) angleBetween -= 360F;
				if(angleBetween < -180F) angleBetween += 360F;
									
				float signBetween = Math.signum(angleBetween);
				angleBetween = Math.abs(angleBetween);
				
				if(angleBetween > 0.1)
				{
					legAxes.rotateGlobalYaw(Math.min(angleBetween, type.rotateSpeed)*signBetween);
				}
				
				Vector3f motion = legAxes.getXAxis();
				
				motion.scale((type.moveSpeed)*(4.3F/20F)*(intent.lengthSquared()));
				
				boolean canThrustCreatively = seats != null && seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode;
	
				if((canThrustCreatively || data.fuelInTank > data.engine.fuelConsumption) && isPartIntact(EnumDriveablePart.hips))
				{
			    	//Move!
					Vector3f.add(actualMotion, motion, actualMotion);

					//If we can't thrust creatively, we must thrust using fuel. Nom.
					if(!canThrustCreatively)
						data.fuelInTank -= data.engine.fuelConsumption;
				}
			}
			
			//Block breaking
			if(!worldObj.isRemote)
			{
				//Use left and right items on the server side
				if(leftMouseHeld)
					useItem(true);
				if(rightMouseHeld)
					useItem(false);
				
				//Check the left block being mined
				if(breakingBlock != null)
				{
					//Get block and material
					Block blockHit = Block.blocksList[worldObj.getBlockId(breakingBlock.x, breakingBlock.y, breakingBlock.z)];
					Material material = worldObj.getBlockMaterial(breakingBlock.x, breakingBlock.y, breakingBlock.z);
					
					//Get the itemstacks in each hand
					ItemStack leftStack = inventory.getStackInSlot(EnumMechaSlotType.leftTool);
					ItemStack rightStack = inventory.getStackInSlot(EnumMechaSlotType.rightTool);
					
					//Work out if we are actually breaking blocks
					boolean leftStackIsTool = leftStack != null && leftStack.getItem() instanceof ItemMechaAddon;
					boolean rightStackIsTool = rightStack != null && rightStack.getItem() instanceof ItemMechaAddon;
					boolean breakingBlocks = (leftMouseHeld && leftStackIsTool) || (rightMouseHeld && rightStackIsTool);
					
					//If we are not breaking blocks, reset everything
					if(blockHit == null || !breakingBlocks)
					{
						Minecraft.getMinecraft().renderGlobal.destroyBlockPartially(entityId, breakingBlock.x, breakingBlock.y, breakingBlock.z, -1);
						breakingBlock = null;
					}
					else
					{
						//Get the block hardness
						float blockHardness = blockHit.getBlockHardness(worldObj, breakingBlock.x, breakingBlock.y, breakingBlock.z);
						
						//Calculate the mine speed
						float mineSpeed = 1F;
						if(leftStackIsTool)
						{
							MechaItemType leftType = ((ItemMechaAddon)leftStack.getItem()).type;
							if(leftType.function.effectiveAgainst(material) && leftType.toolHardness > blockHardness)
								mineSpeed *= leftType.speed;
						}
						if(rightStackIsTool)
						{
							MechaItemType rightType = ((ItemMechaAddon)rightStack.getItem()).type;
							if(rightType.function.effectiveAgainst(material) && rightType.toolHardness > blockHardness)
								mineSpeed *= rightType.speed;
						}
						
						//If this block is immortal, do not break it
						if(blockHardness < -0.01F)
							mineSpeed = 0F;
						//If this block's hardness is zero-ish, then the tool's power is OVER 9000!!!!
						else if(Math.abs(blockHardness) < 0.01F)
							mineSpeed = 9001F;
						else
						{
							mineSpeed /= blockHit.getBlockHardness(worldObj, breakingBlock.x, breakingBlock.y, breakingBlock.z);
						}
						
						//Add block digging overlay
						Minecraft.getMinecraft().renderGlobal.destroyBlockPartially(entityId, breakingBlock.x, breakingBlock.y, breakingBlock.z, (int)(breakingProgress * 10));
						breakingProgress += 0.1F * mineSpeed;
						if(breakingProgress >= 1F)
						{
			        		//blockHit.dropBlockAsItem(worldObj, breakingBlock.x, breakingBlock.y, breakingBlock.z, worldObj.getBlockMetadata(breakingBlock.x, breakingBlock.y, breakingBlock.z), 1);
							//FlansMod.proxy.playBlockBreakSound(breakingBlock.x, breakingBlock.y, breakingBlock.z, worldObj.getBlockId(breakingBlock.x, breakingBlock.y, breakingBlock.z));
							//worldObj.setBlockToAir(breakingBlock.x, breakingBlock.y, breakingBlock.z);
							worldObj.destroyBlock(breakingBlock.x, breakingBlock.y, breakingBlock.z, true);
						}
					}
				}
			}
			
		}
		motionY = actualMotion.y;	
		moveEntity(actualMotion.x, actualMotion.y, actualMotion.z);
		
    	setPosition(posX, posY, posZ);
		
		//Fuel Handling
		if(!couldNotFindFuel)
		{
			ItemStack fuelStack = foundFuel == -1 ? null : driveableData.getStackInSlot(foundFuel);
			
			//If the fuel item has stack size <= 0, delete it
			if(fuelStack != null && fuelStack.stackSize <= 0)
			{
				driveableData.setInventorySlotContents(foundFuel, null);
				fuelStack = null;
			}
			
			//Find the next fuelling slot
			if(fuelStack == null || !(fuelStack.getItem() instanceof ItemPart && ((ItemPart)fuelStack.getItem()).type.category == 9))
			{
				foundFuel = -1;
				couldNotFindFuel = true;
				for(int i = driveableData.getCargoInventoryStart(); i < driveableData.getCargoInventoryStart() + type.numCargoSlots; i++)
				{
					ItemStack tempStack = driveableData.getStackInSlot(i);
					if(tempStack != null && tempStack.getItem() instanceof ItemPart && ((ItemPart)tempStack.getItem()).type.category == 9)
					{
						foundFuel = i;
						fuelStack = tempStack;
						couldNotFindFuel = false;
						break;
					}
				}
			}
			
			//Work out if we are fuelling (from a Flan's Mod fuel item)
			fuelling = foundFuel != -1 && fuelStack != null && data.fuelInTank < type.fuelTankSize && fuelStack.stackSize > 0 && fuelStack.getItem() instanceof ItemPart && ((ItemPart)fuelStack.getItem()).type.category == 9;
			
			//If we are fuelling
			if(fuelling)
			{
				int damage = fuelStack.getItemDamage();
				//Consume 100 points of fuel (1 damage)
				fuelStack.setItemDamage(damage + 1);
				//Put 100 points of fuel 
				data.fuelInTank += 100;
				//If we have finished this fuel item
				if(damage >= fuelStack.getMaxDamage())
				{
					//Reset the damage to 0
					fuelStack.setItemDamage(0);
					//Consume one item
					fuelStack.stackSize--;
					//If we consumed the last one, destroy the stack
					if(fuelStack.stackSize <= 0)
						data.fuel = null;
				}	
			}
			
			//Check inventory slots for buildcraft buckets and if found, take fuel from them
			if(FlansMod.hooks.BuildCraftLoaded && !fuelling)
			{
				for(int i = data.getCargoInventoryStart(); i < data.numCargo + type.numCargoSlots; i++)
				{
					ItemStack stack = data.getStackInSlot(i);
					if(stack != null && stack.isItemEqual(FlansMod.hooks.BuildCraftOilBucket) && data.fuelInTank + 5000 <= type.fuelTankSize)
					{
						data.fuelInTank += 5000;
						data.setInventorySlotContents(i, new ItemStack(Item.bucketEmpty));
						couldNotFindFuel = false;
					}
					else if(stack != null && stack.isItemEqual(FlansMod.hooks.BuildCraftFuelBucket) && data.fuelInTank + 10000 <= type.fuelTankSize)
					{
						data.fuelInTank += 10000;
						data.setInventorySlotContents(i, new ItemStack(Item.bucketEmpty));
						couldNotFindFuel = false;
					}
				}
			}
		}
		

		
		//Calculate movement on the client and then send position, rotation etc to the server
		if(thePlayerIsDrivingThis)
		{
			PacketDispatcher.sendPacketToServer(PacketVehicleControl.buildUpdatePacket(this));
			serverPosX = posX;
			serverPosY = posY;
			serverPosZ = posZ;
			serverYaw = axes.getYaw();
		}
		
		//If this is the server, send position updates to everyone, having received them from the driver
		if(!worldObj.isRemote && ticksExisted % 5 == 0)
		{
			PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 200, dimension, PacketVehicleControl.buildUpdatePacket(this));
		}
		
		for(EntitySeat seat : seats)
		{
			if(seat != null)
				seat.updatePosition();
		}
		
		legSwing = legSwing / 2F;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public boolean showInventory(int seat)
	{
		return seat != 0;
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