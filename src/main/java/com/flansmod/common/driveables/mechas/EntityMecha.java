package com.flansmod.common.driveables.mechas;

import java.util.ArrayList;
import java.util.Optional;

import io.netty.buffer.ByteBuf;
import io.vavr.Tuple;
import io.vavr.Tuple3;
import io.vavr.collection.List;
import io.vavr.control.Option;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MoverType;
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
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.RayTraceResult.Type;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.client.debug.EntityDebugVector;
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
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.EnumFireMode;
import com.flansmod.common.guns.FireableGun;
import com.flansmod.common.guns.FiredShot;
import com.flansmod.common.guns.GrenadeType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.InventoryHelper;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemGrenade;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ItemShootable;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.guns.ShotHandler;
import com.flansmod.common.network.PacketDriveableDamage;
import com.flansmod.common.network.PacketDriveableGUI;
import com.flansmod.common.network.PacketMechaControl;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.tools.ItemTool;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.vector.Vector3i;

import static com.flansmod.common.util.BlockUtil.destroyBlock;

public class EntityMecha extends EntityDriveable
{
	private int ticksSinceUsed;
	public int toggleTimer = 0;
	protected float moveX = 0;
	protected float moveZ = 0;
	public RotatedAxes legAxes;
	public float prevLegsYaw = 0F;
	private int jumpDelay = 0;
	public MechaInventory inventory;
	public float legSwing = 0;
	/**
	 * Used for shooting guns
	 */
	public float shootDelayLeft = 0, shootDelayRight = 0;
	/**
	 * Used for gun sounds
	 */
	public int soundDelayLeft = 0, soundDelayRight = 0;
	/**
	 * The coords of the blocks being destroyed
	 */
	public Vector3i breakingBlock = null;
	/**
	 * Progress made towards breaking each block
	 */
	public float breakingProgress = 0F;
	/**
	 * Timer for the RocketPack Sound
	 */
	private float rocketTimer = 0F;
	private int diamondTimer = 0;
	
	/**
	 * Gun animations
	 */
	public GunAnimations leftAnimations = new GunAnimations(), rightAnimations = new GunAnimations();
	boolean couldNotFindFuel;
	
	public EntityPlayer placer;
	
	public float yOffset;
	
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
		initType(type, true, false);
		inventory = new MechaInventory(this, tags);
	}
	
	public EntityMecha(World world, double x, double y, double z, EntityPlayer placer, MechaType type, DriveableData data, NBTTagCompound tags)
	{
		this(world, x, y, z, type, data, tags);
		rotateYaw(placer.rotationYaw + 90F);
		legAxes.rotateGlobalYaw(placer.rotationYaw + 90F);
		prevLegsYaw = legAxes.getYaw();
		this.placer = placer;
	}
	
	@Override
	protected void initType(DriveableType type, boolean firstTime, boolean clientSide)
	{
		super.initType(type, firstTime, clientSide);
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
	public double getYOffset()
	{
		return yOffset;
	}
	
	@Override
	public void onMouseMoved(int deltaX, int deltaY)
	{
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
		
		MechaType type = getMechaType();
		//Check each seat in order to see if the player can sit in it
		for(int i = 0; i <= type.numPassengers; i++)
		{
			if(getSeat(i) != null && getSeat(i).processInitialInteract(entityplayer, hand))
				return true;
		}
		return false;
	}
	
	public MechaType getMechaType()
	{
		return MechaType.getMecha(driveableType);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean pressKey(int key, EntityPlayer player, boolean isOnEvent)
	{
		MechaType type = getMechaType();
		DriveableData data = getDriveableData();
		//send keys which require server side updates to the server
		switch(key)
		{
			case 4: //Jump
			{
				boolean canThrustCreatively = getSeat(0) != null && getSeat(0).getControllingPassenger() instanceof EntityPlayer
						&& ((EntityPlayer)getSeat(0).getControllingPassenger()).capabilities.isCreativeMode;
				if(onGround && (jumpDelay == 0) && (canThrustCreatively || data.fuelInTank > data.engine.fuelConsumption) && isPartIntact(EnumDriveablePart.hips))
				{
					jumpDelay = 20;
					motionY += type.jumpVelocity;
					if(!canThrustCreatively)
						data.fuelInTank -= data.engine.fuelConsumption;
				}
				return true;
			}
			case 7: //Inventory
			{
				FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(4));
				((EntityPlayer)getSeat(0).getControllingPassenger()).openGui(FlansMod.INSTANCE, 10, world, chunkCoordX, chunkCoordY, chunkCoordZ);
				return true;
			}
			default:
			{
				return super.pressKey(key, player, isOnEvent);
			}
		}
	}
	
	protected boolean creative()
	{
		return !(getSeat(0).getControllingPassenger() instanceof EntityPlayer) || ((EntityPlayer)getSeat(0).getControllingPassenger()).capabilities.isCreativeMode;
	}
	
	protected boolean useItem(boolean left)
	{
		if(left ? isPartIntact(EnumDriveablePart.leftArm) : isPartIntact(EnumDriveablePart.rightArm))
		{
			ItemStack heldStack = left ? inventory.getStackInSlot(EnumMechaSlotType.leftTool) : inventory.getStackInSlot(EnumMechaSlotType.rightTool);
			if(heldStack == null || heldStack.isEmpty())
				return false;
			
			Item heldItem = heldStack.getItem();
			
			MechaType mechaType = getMechaType();
			
			if(heldItem instanceof ItemMechaAddon)
			{
				MechaItemType toolType = ((ItemMechaAddon)heldItem).type;
				
				float reach = toolType.reach * mechaType.reach;
				
				Vector3f lookOrigin = new Vector3f(
						(float)mechaType.seats[0].x / 16F,
						(float)mechaType.seats[0].y / 16F + getSeat(0).getControllingPassenger().getMountedYOffset(),
						(float)mechaType.seats[0].z / 16F);
				lookOrigin = axes.findLocalVectorGlobally(lookOrigin);
				Vector3f.add(lookOrigin, new Vector3f(posX, posY, posZ), lookOrigin);
				
				Vector3f lookVector = axes.findLocalVectorGlobally(getSeat(0).looking.findLocalVectorGlobally(new Vector3f(reach, 0F, 0F)));
				
				if(FlansMod.DEBUG && world.isRemote)
					world.spawnEntity(new EntityDebugVector(world, lookOrigin, lookVector, 20));
				
				Vector3f lookTarget = Vector3f.add(lookVector, lookOrigin, null);
				
				RayTraceResult hit = world.rayTraceBlocks(lookOrigin.toVec3(), lookTarget.toVec3());
				
				//RayTraceResult hit = ((EntityLivingBase)seats[0].riddenByEntity).rayTrace(reach, 1F);
				if(hit != null && hit.typeOfHit == Type.BLOCK)
				{
					BlockPos pos = hit.getBlockPos();
					if(breakingBlock == null || breakingBlock.x != pos.getX() || breakingBlock.y != pos.getY() || breakingBlock.z != pos.getZ())
						breakingProgress = 0F;
					breakingBlock = new Vector3i(pos.getX(), pos.getY(), pos.getZ());
				}
			}
			
			else if(heldItem instanceof ItemGun)
			{
				ItemGun gunItem = (ItemGun)heldItem;
				GunType gunType = gunItem.GetType();
				
				//Get the correct shoot delay
				float delay = left ? shootDelayLeft : shootDelayRight;
				
				//If we can shoot
				if(delay <= 0)
				{
					//Go through the bullet stacks in the gun and see if any of them are not null
					int bulletID = 0;
					ItemStack bulletStack = null;
					for(; bulletID < gunType.numAmmoItemsInGun; bulletID++)
					{
						ItemStack checkingStack = gunItem.getBulletItemStack(heldStack, bulletID);
						if(checkingStack != null && !checkingStack.isEmpty() && checkingStack.getItemDamage() < checkingStack.getMaxDamage())
						{
							bulletStack = checkingStack;
							break;
						}
					}
					
					//If no bullet stack was found, reload
					if(bulletStack == null || bulletStack.isEmpty())
					{
						gunItem.Reload(heldStack, world, this, driveableData, left ? EnumHand.MAIN_HAND : EnumHand.OFF_HAND, true, true, (infiniteAmmo() || creative()));
					}
					//A bullet stack was found, so try shooting with it
					else if(bulletStack.getItem() instanceof ItemBullet || bulletStack.getItem() instanceof ItemGrenade)
					{
						//Shoot
						shoot(heldStack, gunType, bulletStack, creative(), left);
						
						//Apply animations to 3D modelled guns
						
						//TODO this doesn't work
						
							if(left)
							{
								leftAnimations.doShoot(gunType.getPumpDelay(), gunType.getPumpTime());
							}
							else
							{
								rightAnimations.doShoot(gunType.getPumpDelay(), gunType.getPumpTime());
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
		ShootableType bulletType = ((ItemShootable)bulletStack.getItem()).type;
		RotatedAxes a = new RotatedAxes();
		
		Vector3f armVector = new Vector3f(mechaType.armLength, 0F, 0F);
		Vector3f gunVector = new Vector3f(mechaType.armLength + 1.2F * mechaType.heldItemScale, 0.5F * mechaType.heldItemScale, 0F);
		Vector3f armOrigin = left ? mechaType.leftArmOrigin : mechaType.rightArmOrigin;
		
		a.rotateGlobalYaw(axes.getYaw());
		armOrigin = a.findLocalVectorGlobally(armOrigin);
		
		a.rotateLocalPitch(-getSeat(0).looking.getPitch());
		gunVector = a.findLocalVectorGlobally(gunVector);
		armVector = a.findLocalVectorGlobally(armVector);
		
		Vector3f bulletOrigin = Vector3f.add(armOrigin, gunVector, null);
		
		bulletOrigin = Vector3f.add(new Vector3f(posX, posY, posZ), bulletOrigin, null);
		
		if(!world.isRemote)
		{
			ShootableType shootableType = ((ItemShootable)bulletStack.getItem()).type;
			if (shootableType instanceof BulletType)
			{
				FireableGun fireableGun = new FireableGun(gunType, gunType.getDamage(stack), gunType.getSpread(stack), gunType.getBulletSpeed(stack));
				FiredShot shot = new FiredShot(fireableGun, (BulletType)shootableType, this, (EntityPlayerMP) getDriver());
				ShotHandler.fireGun(world, shot, gunType.numBullets*bulletType.numBullets, bulletOrigin, armVector);
			}
			else if (shootableType instanceof GrenadeType)
			{
				double yaw = Math.atan2(armVector.z, armVector.x);
				double pitch = Math.atan2(Math.sqrt(armVector.z * armVector.z + armVector.x * armVector.x), armVector.y) - Math.PI/2;
				Optional<Entity> ent = Optional.of(this);
				Optional<EntityPlayer> player = Optional.ofNullable(getDriver());
				
				EntityGrenade grenade = new EntityGrenade(world, bulletOrigin, (GrenadeType) shootableType, (float)Math.toDegrees(pitch), (float)Math.toDegrees(yaw + Math.PI*1.5), player, ent);
				world.spawnEntity(grenade);
			}
		}
		
		if(left)
			shootDelayLeft = gunType.mode == EnumFireMode.SEMIAUTO ? Math.max(gunType.GetShootDelay(stack), 5) : gunType.GetShootDelay(stack);
		else
			shootDelayRight = gunType.mode == EnumFireMode.SEMIAUTO ? Math.max(gunType.GetShootDelay(stack), 5) : gunType.GetShootDelay(stack);
		
		if(bulletType.dropItemOnShoot != null && !creative)
			ItemGun.dropItem(world, this, bulletType.dropItemOnShoot);
		
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
	public void fall(float f, float l)
	{
		attackEntityFrom(DamageSource.FALL, f);
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource damagesource, float i)
	{
		if(world.isRemote || isDead)
			return true;
		
		MechaType type = getMechaType();
		
		if(damagesource.getDamageType().equals("fall"))
		{
			boolean takeFallDamage = type.takeFallDamage && !stopFallDamage();
			boolean damageBlocksFromFalling = type.damageBlocksFromFalling || breakBlocksUponFalling();
			
			byte wouldBeNegativeDamage;
			if(((i * type.fallDamageMultiplier * vulnerability()) - 2) < 0)
			{
				wouldBeNegativeDamage = 0;
			}
			else
			{
				wouldBeNegativeDamage = 1;
			}
			
			float damageToInflict = takeFallDamage ? i * ((type.fallDamageMultiplier * vulnerability())) * wouldBeNegativeDamage : 0;
			float blockDamageFromFalling = damageBlocksFromFalling ? i * (type.blockDamageFromFalling) / 10F : 0;
			
			driveableData.parts.get(EnumDriveablePart.hips).attack(damageToInflict, false);
			checkParts();
			FlansMod.getPacketHandler().sendToAllAround(new PacketDriveableDamage(this), posX, posY, posZ, FlansMod.driveableUpdateRange, dimension);
			if(blockDamageFromFalling > 1)
			{
				world.createExplosion(this, posX, posY, posZ, blockDamageFromFalling, TeamsManager.explosions);
			}
		}
		
		else if(damagesource.damageType.equals("player") && damagesource.getTrueSource().onGround && (getSeat(0) == null || getSeat(0).getControllingPassenger() == null))
		{
			ItemStack mechaStack = new ItemStack(type.item, 1, driveableData.paintjobID);
			NBTTagCompound tags = new NBTTagCompound();
			mechaStack.setTagCompound(tags);
			driveableData.writeToNBT(tags);
			inventory.writeToNBT(tags);
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
		
		if(!readyForUpdates)
			return;
		
		EntitySeat driverSeat = getSeat(0);
		Entity driver = driverSeat == null ? null : driverSeat.getControllingPassenger();
		EntityLivingBase livingDriver = driver instanceof EntityLivingBase ? (EntityLivingBase)driver : null;
		EntityPlayer playerDriver = driver instanceof EntityPlayer ? (EntityPlayer)driver : null;
		boolean isCreative = playerDriver != null && playerDriver.isCreative();
		
		//Decrement delay variables
		updateDelays();

		//If the player left the driver's seat, stop digging / whatever
		if(!world.isRemote && (driverSeat == null || driver == null))
			primaryShootHeld = secondaryShootHeld = false;
		
		//Update gun animations
		leftAnimations.update();
		rightAnimations.update();
		
		//Get Mecha Type
		MechaType type = this.getMechaType();
		DriveableData data = getDriveableData();
		if(type == null)
		{
			FlansMod.log.warn("Mecha type null. Not ticking mecha");
			return;
		}
		
		prevLegsYaw = legAxes.getYaw();

		// Abilities
		autoRepair(playerDriver, isCreative, data);
		detectDiamonds(playerDriver);

		updateHeight(type);
		updateDespawn(driver);

		//Work out of this is client side and the player is driving
		boolean thePlayerIsDrivingThis = world.isRemote && FlansMod.proxy.isThePlayer(playerDriver);
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
		updateHeadPosition(driverSeat, livingDriver, playerDriver, type);

		moveX = 0;
		moveZ = 0;

		float jetPackPower = jetPackPower();
		if(!onGround
				&& thePlayerIsDrivingThis
				&& FlansMod.proxy.isKeyDown(4)
				&& shouldFly()
				&& (isCreative || data.fuelInTank >= (10F * jetPackPower)))
		{
			motionY *= 0.95;
			motionY += (0.07 * jetPackPower);
			fallDistance = 0;
			if(!isCreative)
			{
				data.fuelInTank -= (10F * jetPackPower);
			}
			if(rocketTimer <= 0 && rocketPack().soundEffect != null)
			{
				PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, rocketPack().soundEffect, false);
				rocketTimer = rocketPack().soundTime;
			}
		}

		if(isInWater() && shouldFloat())
		{
			motionY *= 0.89;
			motionY += 0.1;
		}



		Vector3f actualMotion = new Vector3f(0F, motionY - (16F / 400F), 0F);

		if(livingDriver != null)
		{
			if(thePlayerIsDrivingThis)
			{
				if(FlansMod.proxy.isKeyDown(0)) moveX = 1;
				if(FlansMod.proxy.isKeyDown(1)) moveX = -1;
				if(FlansMod.proxy.isKeyDown(2)) moveZ = -1;
				if(FlansMod.proxy.isKeyDown(3)) moveZ = 1;
			}
			else if(playerDriver == null)
			{
				moveZ = 1;
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
					legAxes.rotateGlobalYaw(Math.min(angleBetween, type.rotateSpeed) * signBetween);
				}

				intent.scale((type.moveSpeed * data.engine.engineSpeed * speedMultiplier()) * (4.3F / 20F));

				if((isCreative || data.fuelInTank > data.engine.fuelConsumption) && isPartIntact(EnumDriveablePart.hips))
				{
					if(!onGround && shouldFly() && (isCreative || data.fuelInTank > 10F * jetPackPower + data.engine.fuelConsumption))
					{
						intent.scale(jetPackPower);
						if(!isCreative)
							data.fuelInTank -= 10F * jetPackPower;
					}

					//Move!
					Vector3f.add(actualMotion, intent, actualMotion);

					//If we can't thrust creatively, we must thrust using fuel. Nom.
					if(!isCreative)
						data.fuelInTank -= data.engine.fuelConsumption;
				}
			}

			//Block breaking
			if(!world.isRemote)
			{
				//Use left and right items on the server side
				if(primaryShootHeld)
					useItem(true);
				if(secondaryShootHeld)
					useItem(false);
				
				//Check the left block being mined
				mineBlock(driver, playerDriver, isCreative, type, data);
			}
		}
		else moveAI(actualMotion);
		
		motionY = actualMotion.y;
		move(MoverType.SELF, actualMotion.x, actualMotion.y, actualMotion.z);
		setPosition(posX, posY, posZ);
		
		//Calculate movement on the client and then send position, rotation etc to the server
		if(serverPosX != posX || serverPosY != posY || serverPosZ != posZ || serverYaw != axes.getYaw())
		{
			if(thePlayerIsDrivingThis)
			{
				FlansMod.getPacketHandler().sendToServer(new PacketMechaControl(this));
				serverPosX = posX;
				serverPosY = posY;
				serverPosZ = posZ;
				serverYaw = axes.getYaw();
			}
		}
		
		for(EntitySeat seat : getSeats())
		{
			if(seat != null)
				seat.updatePosition();
		}
		
		if(livingDriver == null || thePlayerIsDrivingThis)
			legSwing = legSwing / type.legSwingLimit;
	}
	
	private void mineBlock(Entity driver, EntityPlayer playerDriver, boolean isCreative, MechaType type,
						   DriveableData data)
	{
		if(breakingBlock != null)
		{
			//Get block and material
			IBlockState state = world.getBlockState(new BlockPos(breakingBlock.x, breakingBlock.y, breakingBlock.z));
			Block blockHit = state.getBlock();
			Material material = state.getMaterial();
			
			//Get the itemstacks in each hand
			ItemStack leftStack = inventory.getStackInSlot(EnumMechaSlotType.leftTool);
			ItemStack rightStack = inventory.getStackInSlot(EnumMechaSlotType.rightTool);
			
			//Work out if we are actually breaking blocks
			boolean leftStackIsTool = leftStack != null && leftStack.getItem() instanceof ItemMechaAddon;
			boolean rightStackIsTool = rightStack != null && rightStack.getItem() instanceof ItemMechaAddon;
			boolean breakingBlocks = (primaryShootHeld && leftStackIsTool) || (secondaryShootHeld && rightStackIsTool);
			
			//If we are not breaking blocks, reset everything
			if(!breakingBlocks)
			{
				breakingBlock = null;
			}
			else
			{
				//Get the block hardness
				float blockHardness = state.getBlockHardness(world, new BlockPos(breakingBlock.x, breakingBlock.y, breakingBlock.z));
				
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
					mineSpeed /= state.getBlockHardness(world, new BlockPos(breakingBlock.x, breakingBlock.y, breakingBlock.z));
				}
				
				//Add block digging overlay
				breakingProgress += 0.1F * mineSpeed;
				if(breakingProgress >= 1F)
				{
					boolean cancelled = false;
					if(playerDriver instanceof EntityPlayerMP)
					{
						int eventOutcome = ForgeHooks
								.onBlockBreakEvent(world, isCreative ? GameType.CREATIVE : playerDriver.capabilities.allowEdit ? GameType.SURVIVAL : GameType.ADVENTURE, (EntityPlayerMP)playerDriver, new BlockPos(breakingBlock.x, breakingBlock.y, breakingBlock.z));
						cancelled = eventOutcome == -1;
					}
					if(!cancelled)
					{
						if(canVacuumItems())
						{
							vacuumItems(isCreative, type, data, state, blockHit);
						}
						//Destroy block
						if(!world.isRemote)
						{
							WorldServer worldServer = (WorldServer)world;
							BlockPos pos = new BlockPos(breakingBlock.x, breakingBlock.y, breakingBlock.z);
							boolean dropBlocks = atLeastOneEffectiveTool && !canVacuumItems();
							destroyBlock(worldServer, pos, driver, dropBlocks);
						}
					}
				}
			}
		}
	}
	
	private void vacuumItems(boolean isCreative, MechaType type, DriveableData data, IBlockState state, Block blockHit)
	{
		NonNullList<ItemStack> drops = NonNullList.create();
		blockHit.getDrops(drops, world, new BlockPos(breakingBlock.x, breakingBlock.y,
				breakingBlock.z), state, 0);
		for(ItemStack stack : drops)
		{
			//Check for iron regarding refining
			boolean fuelCheck = (data.fuelInTank >= 5F || isCreative);
			if(fuelCheck
					&& refineIron()
					&& stack.getItem() instanceof ItemBlock
					&& ((ItemBlock)stack.getItem()).getBlock() == Blocks.IRON_ORE)
			{
				stack = (new ItemStack(Items.IRON_INGOT, 1, 0));
				if(!isCreative)
					data.fuelInTank -= 5F;
			}
			
			//Check for waste to be compacted
			fuelCheck = (data.fuelInTank >= 0.1F || isCreative);
			if(fuelCheck && wasteCompact() && stack.getItem() instanceof ItemBlock &&
					(((ItemBlock)stack.getItem()).getBlock() == Blocks.COBBLESTONE
							|| ((ItemBlock)stack.getItem()).getBlock() == Blocks.DIRT
							|| ((ItemBlock)stack.getItem()).getBlock() == Blocks.SAND))
			{
				stack.setCount(0);
				if(!isCreative)
					data.fuelInTank -= 0.1F;
			}
			
			//Check for item multipliers
			List<Tuple3<Item, Float, Float>> itemsToFuelUsageAndMultiplier = List.of(
					Tuple.of(Items.DIAMOND, 3F, diamondMultiplier()),
					Tuple.of(Items.REDSTONE, 2F, redstoneMultiplier()),
					Tuple.of(Items.COAL, 2F, coalMultiplier()),
					Tuple.of(Items.EMERALD, 2F, emeraldMultiplier()),
					Tuple.of(Items.IRON_INGOT, 2F, ironMultiplier()));
			for(Tuple3<Item, Float, Float> itemToFuelUsageAndMultiplier : itemsToFuelUsageAndMultiplier)
			{
				Item item = itemToFuelUsageAndMultiplier._1;
				float fuelUsage = itemToFuelUsageAndMultiplier._2;
				float multiplier = itemToFuelUsageAndMultiplier._3;
				
				fuelCheck = (data.fuelInTank >= fuelUsage * multiplier || isCreative);
				if(fuelCheck && stack.getItem() == item)
				{
					stack.setCount(stack.getCount() * (
							MathHelper.floor(multiplier) + (rand.nextFloat() < tailFloat(multiplier) ? 1 : 0)));
					if(!isCreative)
						data.fuelInTank -= fuelUsage * multiplier;
				}
			}
			
			//Check for auto coal consumption
			if(autoCoal() && (stack.getItem() == Items.COAL) && (data.fuelInTank + 250F < type.fuelTankSize))
			{
				data.fuelInTank = Math.min(data.fuelInTank + 1000F, type.fuelTankSize);
				couldNotFindFuel = false;
				stack.setCount(0);
			}
			
			//Add the itemstack to mecha inventory
			if(!InventoryHelper.addItemStackToInventory(driveableData, stack, isCreative) && !world.isRemote && world.getGameRules().getBoolean("doTileDrops"))
			{
				world.spawnEntity(new EntityItem(world, breakingBlock.x + 0.5F, breakingBlock.y + 0.5F, breakingBlock.z + 0.5F, stack));
			}
		}
	}
	
	private void updateHeadPosition(
			EntitySeat driverSeat,
			EntityLivingBase livingDriver,
			EntityPlayer playerDriver,
			MechaType type) {
		if(driverSeat != null)
		{
			if(livingDriver != null && playerDriver == null)
			{
				axes.setAngles(livingDriver.renderYawOffset + 90F, 0F, 0F);
			}
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

				float yaw = driverSeat.looking.getYaw();
				axes.rotateGlobalYaw(yaw);
				driverSeat.looking.rotateGlobalYaw(-yaw);
				driverSeat.playerLooking.rotateGlobalYaw(-yaw);
			}
		}
	}

	private void updateDespawn(Entity driver) {
		ticksSinceUsed++;
		if(!world.isRemote && driver != null)
			ticksSinceUsed = 0;
		if(!world.isRemote && TeamsManager.mechaLove > 0 && ticksSinceUsed > TeamsManager.mechaLove * 20)
		{
			setDead();
		}
	}

	private void updateHeight(MechaType type) {
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
	}

	private void detectDiamonds(EntityPlayer playerDriver) {
		if(canDetectDiamonds() && diamondTimer == 0 && world.isRemote && FlansMod.proxy.isThePlayer(playerDriver))
		{
			float sqDistance = 901;
			for(float i = -30; i <= 30; i++)
			{
				for(float j = -30; j <= 30; j++)
				{
					for(float k = -30; k <= 30; k++)
					{
						int x = MathHelper.floor(i + posX);
						int y = MathHelper.floor(j + posY);
						int z = MathHelper.floor(k + posZ);
						if(i * i + j * j + k * k < sqDistance && world.getBlockState(new BlockPos(x, y, z)).getBlock() == (Blocks.DIAMOND_ORE))
						{
							sqDistance = i * i + j * j + k * k;
						}
					}
				}
			}
			if(sqDistance < 901)
			{
				MechaItemType detectionItem = getDiamondDetectingUpgrade().get();
				PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, detectionItem.detectSound, false);
				diamondTimer = 1 + 2 * MathHelper.floor(MathHelper.sqrt(sqDistance));
			}
		}
	}

	private void autoRepair(EntityPlayer playerDriver, boolean isCreative, DriveableData data) {
		if(toggleTimer == 0 && canAutoRepair())
		{
			for(EnumDriveablePart part : EnumDriveablePart.values())
			{
				DriveablePart thisPart = data.parts.get(part);
				boolean hasCreativePlayer = playerDriver != null && isCreative;
				if(thisPart != null && thisPart.health != 0 && thisPart.health < thisPart.maxHealth && (hasCreativePlayer || data.fuelInTank >= 10F))
				{
					thisPart.health += 1;
					if(!hasCreativePlayer)
						data.fuelInTank -= 10F;
				}
			}
			toggleTimer = 20;
		}
	}

	private void updateDelays() {
		if(jumpDelay > 0) jumpDelay--;
		if(shootDelayLeft > 0) shootDelayLeft--;
		if(shootDelayRight > 0) shootDelayRight--;
		if(soundDelayLeft > 0) soundDelayLeft--;
		if(soundDelayRight > 0) soundDelayRight--;
		if(diamondTimer > 0) --diamondTimer;
		if(toggleTimer > 0) toggleTimer--;
		if(rocketTimer > 0) rocketTimer--;
	}

	protected void moveAI(Vector3f actualMotion)
	{
	
	}
	
	private float tailFloat(float f)
	{
		return f - MathHelper.floor(f);
	}
	
	/** This is a series of iterators which check all upgrades
	 *  for various triggers and multipliers */
	
	/**
	 * Stop fall damage?
	 */
	public boolean stopFallDamage()
	{
		for(MechaItemType type : getUpgradeTypes())
		{
			if(type.stopMechaFallDamage)
				return true;
		}
		return false;
	}
	
	/**
	 * Force fall to break blocks?
	 */
	public boolean breakBlocksUponFalling()
	{
		for(MechaItemType type : getUpgradeTypes())
		{
			if(type.forceBlockFallDamage)
				return true;
		}
		return false;
	}
	
	/**
	 * Vacuum items?
	 */
	public boolean canVacuumItems()
	{
		for(MechaItemType type : getUpgradeTypes())
		{
			if(type.vacuumItems)
				return true;
		}
		return false;
	}
	
	/**
	 * Refine iron?
	 */
	public boolean refineIron()
	{
		for(MechaItemType type : getUpgradeTypes())
		{
			if(type.refineIron)
				return true;
		}
		return false;
	}
	
	/**
	 * Detect Diamonds?
	 */
	public boolean canDetectDiamonds()
	{
		for(MechaItemType type : getUpgradeTypes())
		{
			if(type.diamondDetect)
				return true;
		}
		return false;
	}
	
	public Option<MechaItemType> getDiamondDetectingUpgrade()
	{
		for(MechaItemType type : getUpgradeTypes())
		{
			if(type.diamondDetect)
				return Option.some(type);
		}
		return Option.none();
	}
	
	/**
	 * Compact Waste?
	 */
	public Boolean wasteCompact()
	{
		for(MechaItemType type : getUpgradeTypes())
		{
			if(type.wasteCompact)
				return true;
		}
		return false;
	}
	
	/**
	 * Diamond yield multiplier
	 */
	public float diamondMultiplier()
	{
		float multiplier = 1F;
		for(MechaItemType type : getUpgradeTypes())
		{
			multiplier *= type.fortuneDiamond;
		}
		return multiplier;
	}
	
	/**
	 * Movement speed multiplier
	 */
	public float speedMultiplier()
	{
		float multiplier = 1F;
		for(MechaItemType type : getUpgradeTypes())
		{
			multiplier *= type.speedMultiplier;
		}
		return multiplier;
	}
	
	/**
	 * Coal yield multiplier
	 */
	public float coalMultiplier()
	{
		float multiplier = 1F;
		for(MechaItemType type : getUpgradeTypes())
		{
			multiplier *= type.fortuneCoal;
		}
		return multiplier;
	}
	
	/**
	 * Redstone yield multiplier
	 */
	public float redstoneMultiplier()
	{
		float multiplier = 1F;
		for(MechaItemType type : getUpgradeTypes())
		{
			multiplier *= type.fortuneRedstone;
		}
		return multiplier;
	}
	
	/**
	 * Vulnerability
	 */
	public float vulnerability()
	{
		float multiplier = 1F;
		for(MechaItemType type : getUpgradeTypes())
		{
			multiplier *= (1 - type.damageResistance);
		}
		return multiplier;
	}
	
	/**
	 * Emerald yield multiplier
	 */
	public float emeraldMultiplier()
	{
		float multiplier = 1F;
		for(MechaItemType type : getUpgradeTypes())
		{
			multiplier *= type.fortuneEmerald;
		}
		return multiplier;
	}
	
	/**
	 * Iron yield multiplier
	 */
	public float ironMultiplier()
	{
		float multiplier = 1F;
		for(MechaItemType type : getUpgradeTypes())
		{
			multiplier *= type.fortuneIron;
		}
		return multiplier;
	}
	
	/**
	 * Light Level
	 */
	public int lightLevel()
	{
		int level = 0;
		for(MechaItemType type : getUpgradeTypes())
		{
			level = Math.max(level, type.lightLevel);
		}
		return level;
	}
	
	/**
	 * Force Darkness
	 */
	public boolean forceDark()
	{
		for(MechaItemType type : getUpgradeTypes())
		{
			if(type.forceDark)
				return true;
		}
		return false;
	}
	
	/**
	 * Convert coal to fuel?
	 */
	public boolean autoCoal()
	{
		for(MechaItemType type : getUpgradeTypes())
		{
			if(type.autoCoal)
				return true;
		}
		return false;
	}
	
	/**
	 * Automatically repair damage?
	 */
	public boolean canAutoRepair()
	{
		for(MechaItemType type : getUpgradeTypes())
		{
			if(type.autoRepair)
				return true;
		}
		return false;
	}
	
	/**
	 * Float in water?
	 */
	public boolean shouldFloat()
	{
		for(MechaItemType type : getUpgradeTypes())
		{
			if(type.floater)
				return true;
		}
		return false;
	}
	
	/**
	 * Have infinite ammo?
	 */
	public boolean infiniteAmmo()
	{
		for(MechaItemType type : getUpgradeTypes())
		{
			if(type.infiniteAmmo)
				return true;
		}
		return false;
	}
	
	/**
	 * Have a Rocket Pack?
	 */
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
	
	/**
	 * Jetpack multiplier
	 */
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
		ArrayList<MechaItemType> types = new ArrayList<>();
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
		if(part.type == EnumDriveablePart.core)
		{
			for(int i = 0; i < inventory.getSizeInventory(); i++)
			{
				if(inventory.getStackInSlot(i) != null)
					world.spawnEntity(new EntityItem(world, posX + midpoint.x, posY + midpoint.y, posZ + midpoint.z, inventory.getStackInSlot(i)));
			}
		}
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
