package com.flansmod.common.driveables.mechas;

import java.util.ArrayList;

import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;
import net.minecraft.world.WorldSettings.GameType;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.event.world.BlockEvent;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.client.gui.GuiDriveableController;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.FlansMod;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.DriveableData;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.EnumFireMode;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.InventoryHelper;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.network.PacketDriveableDamage;
import com.flansmod.common.network.PacketDriveableGUI;
import com.flansmod.common.network.PacketDriveableKey;
import com.flansmod.common.network.PacketMechaControl;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.tools.ItemTool;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.vector.Vector3i;

public class EntityMecha extends EntityDriveable
{
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
    /** Timer for the RocketPack Sound */
    private float rocketTimer = 0F;
    private int diamondTimer = 0;
    
    /** Gun animations */
    public GunAnimations leftAnimations = new GunAnimations(), rightAnimations = new GunAnimations();
	boolean couldNotFindFuel;
    


	public EntityMecha(World world) 
	{
		super(world);
		setSize(2F, 3F);
		stepHeight = 3;
		legAxes = new RotatedAxes();
		inventory = new MechaInventory(this);
	}
	
	public EntityMecha(World world, double x, double y, double z, MechaType type, DriveableData data, NBTTagCompound tags) 
	{
		super(world, type, data);
		legAxes = new RotatedAxes();
		setSize(2F, 3F);
		stepHeight = 3;
		setPosition(x, y, z);
		initType(type, false);
		inventory = new MechaInventory(this, tags);
	}
	
	public EntityMecha(World world, double x, double y, double z, EntityPlayer placer, MechaType type, DriveableData data, NBTTagCompound tags) 
	{
		this(world, x, y, z, type, data, tags);
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
        tag.setTag("Inventory", inventory.writeToNBT(new NBTTagCompound()));
    }

	@Override
    protected void readEntityFromNBT(NBTTagCompound tag)
    {
        super.readEntityFromNBT(tag);
        legAxes.setAngles(tag.getFloat("LegsYaw"), 0, 0);
        inventory.readFromNBT(tag.getCompoundTag("Inventory"));
    }
	
	@Override
	public void writeSpawnData(ByteBuf data)
	{
		super.writeSpawnData(data);
		ByteBufUtils.writeTag(data, inventory.writeToNBT(new NBTTagCompound()));
	}
	
	@Override
	public void readSpawnData(ByteBuf data)
	{
		super.readSpawnData(data);
		legAxes.rotateGlobalYaw(axes.getYaw());
		prevLegsYaw = legAxes.getYaw();

		inventory.readFromNBT(ByteBufUtils.readTag(data));
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
    		FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
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
					jumpDelay = 20;
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
				FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(4));
				((EntityPlayer)seats[0].riddenByEntity).openGui(FlansMod.INSTANCE, 10, worldObj, chunkCoordX, chunkCoordY, chunkCoordZ);
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
        if(left? isPartIntact(EnumDriveablePart.leftArm) : isPartIntact(EnumDriveablePart.rightArm))
	        {
			boolean creative = !(seats[0].riddenByEntity instanceof EntityPlayer) || ((EntityPlayer) seats[0].riddenByEntity).capabilities.isCreativeMode;
			ItemStack heldStack = left ? inventory.getStackInSlot(EnumMechaSlotType.leftTool) : inventory.getStackInSlot(EnumMechaSlotType.rightTool);
			if(heldStack == null)
				return false;
			
			Item heldItem = heldStack.getItem();
			
			MechaType mechaType = getMechaType();
			
			if(heldItem instanceof ItemMechaAddon)
			{
				MechaItemType toolType = ((ItemMechaAddon)heldItem).type;
				
				float reach = toolType.reach * mechaType.reach;
				
				Vector3f lookOrigin = new Vector3f((float)mechaType.seats[0].x / 16F, (float)mechaType.seats[0].y / 16F + seats[0].riddenByEntity.getMountedYOffset(), (float)mechaType.seats[0].z / 16F);
				lookOrigin = axes.findLocalVectorGlobally(lookOrigin);
				Vector3f.add(lookOrigin, new Vector3f(posX, posY, posZ), lookOrigin);
		
				Vector3f lookVector = axes.findLocalVectorGlobally(seats[0].looking.findLocalVectorGlobally(new Vector3f(reach, 0F, 0F)));
				
				worldObj.spawnEntityInWorld(new EntityDebugVector(worldObj, lookOrigin, lookVector, 20));
				
				Vector3f lookTarget = Vector3f.add(lookVector, lookOrigin, null);
				
				MovingObjectPosition hit = worldObj.rayTraceBlocks(lookOrigin.toVec3(), lookTarget.toVec3());
				
				//MovingObjectPosition hit = ((EntityLivingBase)seats[0].riddenByEntity).rayTrace(reach, 1F);
				if(hit != null && hit.typeOfHit == MovingObjectType.BLOCK)
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
						gunItem.reload(heldStack, gunType, worldObj, this, driveableData, (infiniteAmmo() || creative), false);
					}
					//A bullet stack was found, so try shooting with it
					else if(bulletStack.getItem() instanceof ItemBullet)
					{
						//Shoot
						shoot(heldStack, gunType, bulletStack, creative, left);
						
						//Apply animations to 3D modelled guns
						//TODO : Move to client side and sync
						if(worldObj.isRemote)
						{
							int pumpDelay = gunType.model == null ? 0 : gunType.model.pumpDelay;
							int pumpTime = gunType.model == null ? 1 : gunType.model.pumpTime;
							if(left)
							{
								leftAnimations.doShoot(pumpDelay, pumpTime);
							}
							else
							{
								rightAnimations.doShoot(pumpDelay, pumpTime);
							}
						}
						//Damage the bullet item
						bulletStack.setItemDamage(bulletStack.getItemDamage() + 1);
						
						//Update the stack in the gun
						gunItem.setBulletItemStack(heldStack, bulletStack, bulletID);
					}
				}
			}
        }
		return true;
	}

	private void shoot(ItemStack stack, GunType gunType, ItemStack bulletStack, boolean creative, boolean left)
	{
		MechaType mechaType = getMechaType();
		BulletType bulletType = ((ItemBullet)bulletStack.getItem()).type;
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
				worldObj.spawnEntityInWorld(((ItemBullet)bulletStack.getItem()).getEntity(worldObj, bulletOrigin, armVector, (EntityLivingBase)(seats[0].riddenByEntity), gunType.getSpread(stack) / 2F, gunType.getDamage(stack), gunType.getBulletSpeed(stack),bulletStack.getItemDamage(), mechaType));
		
		if(left)
			shootDelayLeft = gunType.mode == EnumFireMode.SEMIAUTO ? Math.max(gunType.shootDelay, 5) : gunType.shootDelay;
		else shootDelayRight = gunType.mode == EnumFireMode.SEMIAUTO ? Math.max(gunType.shootDelay, 5) : gunType.shootDelay;
		
		if(bulletType.dropItemOnShoot != null && !creative)
			ItemGun.dropItem(worldObj, this, bulletType.dropItemOnShoot);
		
		// Play a sound if the previous sound has finished
		if((left ? soundDelayLeft : soundDelayRight) <= 0 && gunType.shootSound != null)
		{
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, gunType.shootSound, gunType.distortSound);
			if(left)
				soundDelayLeft = gunType.shootSoundLength;
			else soundDelayRight = gunType.shootSoundLength;
		}		
	}
	
	@Override
    protected void fall(float f)
    {
		attackEntityFrom(DamageSource.fall, f);
    }
	
	@Override
    public boolean attackEntityFrom(DamageSource damagesource, float i)
    {
        if(worldObj.isRemote || isDead)
            return true;
        
        MechaType type = getMechaType();
        
        if(damagesource.getDamageType().equals("fall"))
        {
        	boolean takeFallDamage = type.takeFallDamage && !stopFallDamage();
        	boolean damageBlocksFromFalling = type.damageBlocksFromFalling || breakBlocksUponFalling();
        	
        	byte wouldBeNegativeDamage;
        	if(((i * type.fallDamageMultiplier * vulnerability())-2)<0){wouldBeNegativeDamage=0;} else {wouldBeNegativeDamage=1;};
        	
        	float damageToInflict = takeFallDamage ? i * ((type.fallDamageMultiplier * vulnerability())) * wouldBeNegativeDamage : 0;
        	float blockDamageFromFalling = damageBlocksFromFalling ? i * (type.blockDamageFromFalling) / 10F : 0;
        	        	
        	driveableData.parts.get(EnumDriveablePart.hips).attack(damageToInflict, false);
        	checkParts();
        	FlansMod.getPacketHandler().sendToAllAround(new PacketDriveableDamage(this), posX, posY, posZ, FlansMod.driveableUpdateRange, dimension);
        	if(blockDamageFromFalling > 1)
        	{
        		worldObj.createExplosion(this, posX, posY, posZ, blockDamageFromFalling, TeamsManager.explosions);
        	}
        }
        
        else if(damagesource.damageType.equals("player") && damagesource.getEntity().onGround && (seats[0] == null || seats[0].riddenByEntity == null))
		{
			ItemStack mechaStack = new ItemStack(type.item, 1, 0);
			mechaStack.stackTagCompound = new NBTTagCompound();
			driveableData.writeToNBT(mechaStack.stackTagCompound);
			inventory.writeToNBT(mechaStack.stackTagCompound);
			entityDropItem(mechaStack, 0.5F);
	 		setDead();
		}
        else
        {
        	driveableData.parts.get(EnumDriveablePart.core).attack(i * vulnerability(), damagesource.isFireDamage());
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
		
		//If the player left the driver's seat, stop digging / whatever
		if(!worldObj.isRemote && (seats[0] == null || seats[0].riddenByEntity == null))
			rightMouseHeld = leftMouseHeld = false;
		
		//Update gun animations
		leftAnimations.update();
		rightAnimations.update();
		
		//Get Mecha Type
		MechaType type = this.getMechaType();
		DriveableData data = getDriveableData();
		if (type == null)
		{
			FlansMod.log("Mecha type null. Not ticking mecha");
			return;
		}
		
		prevLegsYaw = legAxes.getYaw();
		
		//Autorepair. Like a Boss.
		
		if(toggleTimer == 0 && autoRepair())
		{
			for(EnumDriveablePart part: EnumDriveablePart.values())
			{
				DriveablePart thisPart = data.parts.get(part);
				boolean hasCreativePlayer = seats != null && seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode;
				if(thisPart != null && thisPart.health != 0 && thisPart.health < thisPart.maxHealth && (hasCreativePlayer || data.fuelInTank >= 10F))
				{
					thisPart.health += 1;
					if(!hasCreativePlayer)
						data.fuelInTank -= 10F;
				}
			}
			toggleTimer = 20;
		}

		if(diamondDetect() != null && diamondTimer == 0 && worldObj.isRemote && seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && FlansMod.proxy.isThePlayer((EntityPlayer)seats[0].riddenByEntity))
		{
			float sqDistance = 901;
			for(float i = -30; i <= 30; i++)
			{
				for(float j = -30; j <= 30; j++)
				{
					for(float k = -30; k <= 30; k++)
					{
						int x = MathHelper.floor_double(i + posX);
						int y = MathHelper.floor_double(j + posY);
						int z = MathHelper.floor_double(k + posZ);
						if(i * i + j * j + k * k < sqDistance && worldObj.getBlock(x, y, z) == (Blocks.diamond_ore))
						{
							sqDistance = i * i + j * j + k * k;
						}
					}
				}
			}
			if(sqDistance < 901)
			{
				PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, diamondDetect().detectSound, false);
				diamondTimer = 1 + 2 * MathHelper.floor_float(MathHelper.sqrt_float(sqDistance));
			}
		}
		if(diamondTimer > 0) --diamondTimer;
		
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
		if(!worldObj.isRemote && TeamsManager.mechaLove > 0 && ticksSinceUsed > TeamsManager.mechaLove * 20)
		{
			setDead();
		}
		
		//Timer, for general use (only current use is for Auto Repair)
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
				//Function to limit Head Movement Left/Right
				if(type.limitHeadTurn)
				{
					float axesLegs = legAxes.getYaw();
					float axesBody = axes.getYaw();
					
					double dYaw = axesBody - axesLegs;
					if(dYaw > 180)
						axesBody -= 360F;
					if(dYaw < -180)
						axesBody += 360F;
					
					if(axesLegs + type.limitHeadTurnValue < axesBody)
						axes.setAngles(axesLegs + type.limitHeadTurnValue, 0F, 0F);
					
					if(axesLegs - type.limitHeadTurnValue > axesBody)
						axes.setAngles(axesLegs - type.limitHeadTurnValue, 0F, 0F);
				}

				float yaw = seats[0].looking.getYaw() - seats[0].prevLooking.getYaw();
				axes.rotateGlobalYaw(yaw);
				seats[0].looking.rotateGlobalYaw(-yaw);
			}
		}
		
		moveX = 0;
		moveZ = 0;
		
		float jetPack = jetPackPower();
		if(!onGround && thePlayerIsDrivingThis && Minecraft.getMinecraft().currentScreen instanceof GuiDriveableController && FlansMod.proxy.isKeyDown(4) && shouldFly() && (((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode || data.fuelInTank >= (10F*jetPack)))
		{
			motionY *= 0.95;
			motionY += (0.07*jetPack);
			fallDistance = 0;
			if(!((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode)
				data.fuelInTank -= (10F*jetPack);
			if(rocketTimer <= 0 && rocketPack().soundEffect != null)
			{
				PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, rocketPack().soundEffect, false);
				rocketTimer = rocketPack().soundTime;
			}
		}
		else if(isInWater() && shouldFloat())
		{
			motionY *= 0.89;
			motionY += 0.1;
		}
		
		if(rocketTimer != 0) rocketTimer --;
		
		Vector3f actualMotion = new Vector3f(0F, motionY - (16F / 400F), 0F);
		
		if(driverIsLiving)
		{
			EntityLivingBase entity = (EntityLivingBase)seats[0].riddenByEntity;
			boolean driverIsCreative = entity instanceof EntityPlayer && ((EntityPlayer)entity).capabilities.isCreativeMode;
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
				
				intent.scale((type.moveSpeed * data.engine.engineSpeed * speedMultiplier())*(4.3F/20F));
				
				boolean canThrustCreatively = seats != null && seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode;

				if((canThrustCreatively || data.fuelInTank > data.engine.fuelConsumption) && isPartIntact(EnumDriveablePart.hips))
				{
					if(!onGround && shouldFly() && (canThrustCreatively || data.fuelInTank > 10F*jetPack + data.engine.fuelConsumption))
					{
						intent.scale(jetPack);
						if(!canThrustCreatively)
							data.fuelInTank -= 10F*jetPack;
					}
					
					//Move!
					Vector3f.add(actualMotion, intent, actualMotion);

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
					Block blockHit = worldObj.getBlock(breakingBlock.x, breakingBlock.y, breakingBlock.z);
					int metadata = worldObj.getBlockMetadata(breakingBlock.x, breakingBlock.y, breakingBlock.z);
					Material material = blockHit.getMaterial();
					
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
						//if(worldObj.isRemote)
						//	Minecraft.getMinecraft().renderGlobal.destroyBlockPartially(getEntityId(), breakingBlock.x, breakingBlock.y, breakingBlock.z, -1);
						breakingBlock = null;
					}
					else
					{
						//Get the block hardness
						float blockHardness = blockHit.getBlockHardness(worldObj, breakingBlock.x, breakingBlock.y, breakingBlock.z);
						
						//Calculate the mine speed
						float mineSpeed = 1F;
						boolean atLeastOneEffectiveTool = false;
						if(leftStackIsTool)
						{
							MechaItemType leftType = ((ItemMechaAddon)leftStack.getItem()).type;
							if(leftType.function.effectiveAgainst(material) && leftType.toolHardness > blockHardness)
							{
								mineSpeed *= leftType.speed;
								atLeastOneEffectiveTool = true;
							}
						}
						if(rightStackIsTool)
						{
							MechaItemType rightType = ((ItemMechaAddon)rightStack.getItem()).type;
							if(rightType.function.effectiveAgainst(material) && rightType.toolHardness > blockHardness)
							{
								mineSpeed *= rightType.speed;
								atLeastOneEffectiveTool = true;
							}
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
						//if(worldObj.isRemote)
						//	Minecraft.getMinecraft().renderGlobal.destroyBlockPartially(getEntityId(), breakingBlock.x, breakingBlock.y, breakingBlock.z, (int)(breakingProgress * 10));
						breakingProgress += 0.1F * mineSpeed;
						if(breakingProgress >= 1F)
						{
							boolean cancelled = false;
							if(entity instanceof EntityPlayerMP)
							{
								BlockEvent.BreakEvent event = ForgeHooks.onBlockBreakEvent(worldObj, ((EntityPlayerMP)entity).capabilities.isCreativeMode ? GameType.CREATIVE : ((EntityPlayerMP)entity).capabilities.allowEdit ? GameType.SURVIVAL : GameType.ADVENTURE, (EntityPlayerMP)seats[0].riddenByEntity, breakingBlock.x, breakingBlock.y, breakingBlock.z);
								cancelled = event.isCanceled();
							}
					        if(!cancelled)
					        {
				        		//blockHit.dropBlockAsItem(worldObj, breakingBlock.x, breakingBlock.y, breakingBlock.z, worldObj.getBlockMetadata(breakingBlock.x, breakingBlock.y, breakingBlock.z), 1);
								//FlansMod.proxy.playBlockBreakSound(breakingBlock.x, breakingBlock.y, breakingBlock.z, worldObj.getBlockId(breakingBlock.x, breakingBlock.y, breakingBlock.z));
								//worldObj.setBlockToAir(breakingBlock.x, breakingBlock.y, breakingBlock.z);
	
								boolean vacuumItems = vacuumItems();
								if(vacuumItems)
								{
									for(ItemStack stack : blockHit.getDrops(worldObj, breakingBlock.x, breakingBlock.y, breakingBlock.z, metadata, 0))
									{
										//Check for iron regarding refining
										boolean fuelCheck = (data.fuelInTank >= 5F || ((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode);
										if(fuelCheck && refineIron() && stack.getItem() instanceof ItemBlock && ((ItemBlock)stack.getItem()).field_150939_a == Blocks.iron_ore)
										{
											stack = (new ItemStack(Items.iron_ingot, 1, 0));
											if (!((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode)
												data.fuelInTank -= 5F;
										}
										
										//Check for waste to be compacted
										fuelCheck = (data.fuelInTank >= 0.1F || ((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode);
										if(fuelCheck && wasteCompact() && stack.getItem() instanceof ItemBlock && (((ItemBlock)stack.getItem()).field_150939_a == Blocks.cobblestone || ((ItemBlock)stack.getItem()).field_150939_a == Blocks.dirt || ((ItemBlock)stack.getItem()).field_150939_a == Blocks.sand))
										{
											stack.stackSize = 0;
											if (!((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode)
												data.fuelInTank -= 0.1F;
										}
										
										//Check for item multipliers
										fuelCheck = (data.fuelInTank >= 3F*diamondMultiplier() || ((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode);
										if(fuelCheck && stack.getItem() == Items.diamond)
										{
											float multiplier = diamondMultiplier();
											stack.stackSize *= MathHelper.floor_float(multiplier) + (rand.nextFloat() < tailFloat(multiplier) ? 1 : 0);
											if (!((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode)
												data.fuelInTank -= 3F*diamondMultiplier();
										}
										fuelCheck = (data.fuelInTank >= 2F*redstoneMultiplier() || ((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode);
										if(fuelCheck && stack.getItem() == Items.redstone)
										{
											float multiplier = redstoneMultiplier();
											stack.stackSize *= MathHelper.floor_float(multiplier) + (rand.nextFloat() < tailFloat(multiplier) ? 1 : 0);
											if (!((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode)
												data.fuelInTank -= 2F*redstoneMultiplier();
										}
										fuelCheck = (data.fuelInTank >= 2F*coalMultiplier() || ((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode);
										if(fuelCheck && stack.getItem() == Items.coal)
										{
											float multiplier = coalMultiplier();
											stack.stackSize *= MathHelper.floor_float(multiplier) + (rand.nextFloat() < tailFloat(multiplier) ? 1 : 0);
											if (!((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode)
												data.fuelInTank -= 2F*coalMultiplier();
										}
										fuelCheck = (data.fuelInTank >= 2F*emeraldMultiplier() || ((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode);
										if(fuelCheck && stack.getItem() == Items.emerald)
										{
											float multiplier = emeraldMultiplier();
											stack.stackSize *= MathHelper.floor_float(multiplier) + (rand.nextFloat() < tailFloat(multiplier) ? 1 : 0);
											if (!((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode)
												data.fuelInTank -= 2F*emeraldMultiplier();
										}
										fuelCheck = (data.fuelInTank >= 2F*ironMultiplier() || ((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode);
										//check for refineIron OTHERWISE NICE DUPE. think about it and you will get why
										if(fuelCheck && (stack.getItem() == Items.iron_ingot) && refineIron())
										{
											float multiplier = ironMultiplier();
											stack.stackSize *= MathHelper.floor_float(multiplier) + (rand.nextFloat() < tailFloat(multiplier) ? 1 : 0);
											if (!((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode)
												data.fuelInTank -= 2F*ironMultiplier();
										}
										
										//Check for auto coal consumption
										if(autoCoal() && (stack.getItem() == Items.coal) && (data.fuelInTank + 250F < type.fuelTankSize))
										{
											data.fuelInTank = Math.min(data.fuelInTank + 1000F, type.fuelTankSize);
											couldNotFindFuel = false;
											stack.stackSize = 0;
										}
										
										//Add the itemstack to mecha inventory
										if(!InventoryHelper.addItemStackToInventory(driveableData, stack, driverIsCreative) && !worldObj.isRemote && worldObj.getGameRules().getGameRuleBooleanValue("doTileDrops"))
										{
											worldObj.spawnEntityInWorld(new EntityItem(worldObj, breakingBlock.x + 0.5F, breakingBlock.y + 0.5F, breakingBlock.z + 0.5F, stack));
										}
									}
								}
								//Destroy block
								worldObj.func_147480_a(breakingBlock.x, breakingBlock.y, breakingBlock.z, atLeastOneEffectiveTool && !vacuumItems);
					        }
						}
					}
				}
			}
		}
		motionY = actualMotion.y;	
		moveEntity(actualMotion.x, actualMotion.y, actualMotion.z);
		//FlansMod.log("" + fallDistance);
    	setPosition(posX, posY, posZ);
		
		//Calculate movement on the client and then send position, rotation etc to the server
		if(thePlayerIsDrivingThis)
		{
			FlansMod.getPacketHandler().sendToServer(new PacketMechaControl(this));
			serverPosX = posX;
			serverPosY = posY;
			serverPosZ = posZ;
			serverYaw = axes.getYaw();
		}
		
		//If this is the server, send position updates to everyone, having received them from the driver
		if(!worldObj.isRemote && ticksExisted % 5 == 0)
		{
			FlansMod.getPacketHandler().sendToAllAround(new PacketMechaControl(this), posX, posY, posZ, FlansMod.driveableUpdateRange, dimension);
		}
		
		for(EntitySeat seat : seats)
		{
			if(seat != null)
				seat.updatePosition();
		}
		
		if(!driverIsLiving || thePlayerIsDrivingThis)
			legSwing = legSwing / type.legSwingLimit;
	}
	
	private float tailFloat(float f)
	{
		return f - MathHelper.floor_float(f);
	}
	
	/** This is a series of iterators which check all upgrades
	 *  for various triggers and multipliers */
	
	/** Stop fall damage? */
	public boolean stopFallDamage()
	{
		for(MechaItemType type : getUpgradeTypes())
		{
			if(type.stopMechaFallDamage)
				return true;
		}
		return false;
	}
	
	/** Force fall to break blocks? */
	public boolean breakBlocksUponFalling()
	{
		for(MechaItemType type : getUpgradeTypes())
		{
			if(type.forceBlockFallDamage)
				return true;
		}
		return false;
	}
	
	/** Vacuum items? */
	public boolean vacuumItems()
	{
		for(MechaItemType type : getUpgradeTypes())
		{
			if(type.vacuumItems)
				return true;
		}
		return false;
	}
	
	/** Refine iron? */
	public boolean refineIron()
	{
		for(MechaItemType type : getUpgradeTypes())
		{
			if(type.refineIron)
				return true;
		}
		return false;
	}
	
	/** Detect Diamonds? */
	public MechaItemType diamondDetect()
	{
		for(MechaItemType type : getUpgradeTypes())
		{
			if(type.diamondDetect)
				return type;
		}
		return null;
	}
	
	/** Compact Waste? */
	public Boolean wasteCompact()
	{
		for(MechaItemType type : getUpgradeTypes())
		{
			if(type.wasteCompact)
				return true;
		}
		return false;
	}
	
	/** Diamond yield multiplier */
	public float diamondMultiplier()
	{
		float multiplier = 1F;
		for(MechaItemType type : getUpgradeTypes())
		{
			multiplier *= type.fortuneDiamond;
		}
		return multiplier;
	}
	
	/** Movement speed multiplier */
	public float speedMultiplier()
	{
		float multiplier = 1F;
		for(MechaItemType type : getUpgradeTypes())
		{
			multiplier *= type.speedMultiplier;
		}
		return multiplier;
	}
	
	/** Coal yield multiplier */
	public float coalMultiplier()
	{
		float multiplier = 1F;
		for(MechaItemType type : getUpgradeTypes())
		{
			multiplier *= type.fortuneCoal;
		}
		return multiplier;
	}
	
	/** Redstone yield multiplier */
	public float redstoneMultiplier()
	{
		float multiplier = 1F;
		for(MechaItemType type : getUpgradeTypes())
		{
			multiplier *= type.fortuneRedstone;
		}
		return multiplier;
	}
	
	/** Vulnerability */
	public float vulnerability()
	{
		float multiplier = 1F;
		for(MechaItemType type : getUpgradeTypes())
		{
			multiplier *= (1 - type.damageResistance);
		}
		return multiplier;
	}
	
	/** Emerald yield multiplier */
	public float emeraldMultiplier()
	{
		float multiplier = 1F;
		for(MechaItemType type : getUpgradeTypes())
		{
			multiplier *= type.fortuneEmerald;
		}
		return multiplier;
	}
	
	/** Iron yield multiplier */
	public float ironMultiplier()
	{
		float multiplier = 1F;
		for(MechaItemType type : getUpgradeTypes())
		{
			multiplier *= type.fortuneIron;
		}
		return multiplier;
	}
	
	/** Light Level */
	public int lightLevel()
	{
		int level = 0;
		for(MechaItemType type : getUpgradeTypes())
		{
			level = Math.max(level, type.lightLevel);
		}
		return level;
	}
	
	/** Force Darkness */
	public boolean forceDark()
	{
		for(MechaItemType type : getUpgradeTypes())
		{
			if(type.forceDark)
				return true;
		}
		return false;
	}

	/** Convert coal to fuel? */
	public boolean autoCoal()
	{
		for(MechaItemType type : getUpgradeTypes())
		{
			if(type.autoCoal)
				return true;
		}
		return false;
	}
	
	/** Automatically repair damage? */
	public boolean autoRepair()
	{
		for(MechaItemType type : getUpgradeTypes())
		{
			if(type.autoRepair)
				return true;
		}
		return false;
	}
	
	/** Float in water? */
	public boolean shouldFloat()
	{
		for(MechaItemType type : getUpgradeTypes())
		{
			if(type.floater)
				return true;
		}
		return false;
	}
	
	/** Have infinite ammo? */
	public boolean infiniteAmmo()
	{
		for(MechaItemType type : getUpgradeTypes())
		{
			if(type.infiniteAmmo)
				return true;
		}
		return false;
	}
	
	/** Have a Rocket Pack? */
	public MechaItemType rocketPack()
	{
		for(MechaItemType type : getUpgradeTypes())
		{
			if(type.rocketPack)
				return type;
		}
		return null;
	}
	
	public boolean shouldFly()
	{
		return rocketPack() != null;
	}
	
	/** Jetpack multiplier */
	public float jetPackPower()
	{
		float multiplier = 1F;
		for(MechaItemType type : getUpgradeTypes())
		{
			multiplier *= type.rocketPower;
		}
		return multiplier;
	}
	
	public ArrayList<MechaItemType> getUpgradeTypes()
	{
		ArrayList<MechaItemType> types = new ArrayList<MechaItemType>();
		for(ItemStack stack : inventory.stacks.values())
		{
			if(stack != null && stack.getItem() instanceof ItemMechaAddon)
			{
				types.add(((ItemMechaAddon)stack.getItem()).type);
			}
		}
		return types;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public boolean showInventory(int seat)
	{
		return seat != 0;
	}
	
	@Override
	protected void dropItemsOnPartDeath(Vector3f midpoint, DriveablePart part) 
	{

	}

	@Override
	public boolean hasMouseControlMode()
	{
		return false;
	}

	@Override
	public String getBombInventoryName()
	{
		return "";
	}
	
	@Override
	public String getMissileInventoryName()
	{
		return "";
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public EntityLivingBase getCamera()
	{
		return null;
	}
}
