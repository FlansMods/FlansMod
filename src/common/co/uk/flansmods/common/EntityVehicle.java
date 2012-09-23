package co.uk.flansmods.common;

import java.util.List;
import java.util.Random;
import org.lwjgl.input.Keyboard;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;

import co.uk.flansmods.client.GuiPlaneMenu;
import co.uk.flansmods.client.model.ModelVehicle;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteArrayDataOutput;

import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;

import net.minecraft.client.Minecraft;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.DamageSource;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityDamageSource;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumGameType;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModLoader;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.Vec3;
import net.minecraft.src.World;

public class EntityVehicle extends EntityDriveable implements IEntityAdditionalSpawnData
{
    public EntityVehicle(World world)
    {
        super(world);
    }
	
	public EntityVehicle(World world, double x, double y, double z, EntityPlayer placer, VehicleType type1, VehicleData data1)
	{
		super(world, type1, data1);
		setPosition(x, y, z);
		prevPosX = x;
		prevPosY = y;
		prevPosZ = z;
		rotateYaw(180F + placer.rotationYaw);
		data = data1;
		try
		{
			dataID = Integer.parseInt(data.mapName.split("_")[1]);
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to retrieve vehicle data ID from vehicle data. " + data.mapName);
		}
		type = type1;
		initType();
	}
	
	private void initType()
	{
		health = type.health;
		seats = new EntityPassengerSeat[type.numPassengers];
		for(int i = 0; i < type.numPassengers; i++)
		{
			seats[i] = new EntityPassengerSeat(worldObj, this, i, type.seatsX[i], type.seatsY[i], type.seatsZ[i], type.gunner[i]);
			worldObj.spawnEntityInWorld(seats[i]);
		}
		
		boxes = new EntityCollisionBox[type.boxes.length];
		for(int i = 0; i < boxes.length; i++)
		{
			boxes[i] = type.boxes[i].makeEntity(this);
		}
		yOffset = type.yOffset;
	}
	
	public boolean attackEntityFromPart(EntityCollisionBox box, DamageSource damagesource, int i)
    {
		//Simple method. Might add destructible wheels later...
		
		// TODO THIS ELSEWHERE
		/*
		if(box.part == 4)
			pressKey(8);
		*/
		return attackEntityFrom(damagesource, i);
	}
	
	public boolean attackEntityFrom(DamageSource damagesource, int i)
    {
        if(worldObj.isRemote || isDead)
        {
            return true;
        }
		if(/*onGround &&*/ damagesource.damageType.equals("player") && ((EntityDamageSource)damagesource).getEntity().onGround)
		{
			entityDropItem(new ItemStack(type.itemID, 1, dataID), 0.5F);
			data.markDirty();
	 		setDead();
			return true;
		}
		health -= i;
		if(health < 0)
		{
			//Detonate all shells and fuel
			for(int j = 0; j < type.numBombSlots; j++)
			{
				ItemStack shell = data.getStackInSlot(data.getBombInventoryStart() + j);
				if(shell != null && shell.getItem() instanceof ItemBullet)
				{
					BulletType shellType = ((ItemBullet)shell.getItem()).type;
					if(FlansMod.explosions && (shellType.explodeOnImpact || shellType.fuse > 0) && rand.nextBoolean())
					{
						worldObj.createExplosion(this, posX + (double)rand.nextGaussian() * 2D, posY + (double)rand.nextGaussian() * 2D, posZ + (double)rand.nextGaussian() * 2D, shellType.explosion);
					}
					else
						entityDropItem(shell, 1.0F);
				}
				else if(shell != null)
					entityDropItem(shell, 1.0F);
			}
			for(int j = type.numBombSlots; j < data.getFuelSlot() + 1; j++)
			{
				ItemStack stack = data.getStackInSlot(j);
				if(stack != null)
					entityDropItem(stack, 1.0F);
			}
			if(FlansMod.explosions && data.fuelInTank > 0 && rand.nextBoolean())
			{
				worldObj.createExplosion(this, posX + (double)rand.nextGaussian() * 2D, posY + (double)rand.nextGaussian() * 2D, posZ + (double)rand.nextGaussian() * 2D, (float)data.fuelInTank / 200F);
			}
			
			setDead();
			if(type.frontWheels != null)
				entityDropItem(new ItemStack(type.frontWheels.getItem(), 2), 1.0F);
			if(type.backWheels != null)
				entityDropItem(new ItemStack(type.backWheels.getItem(), 2), 1.0F);
			if(type.tracks != null)
				entityDropItem(new ItemStack(type.tracks.getItem(), 2), 1.0F);
			if(type.dyes)
				entityDropItem(new ItemStack(Item.dyePowder, 2, type.dyeColour), 1.0F);
			if(type.chassis != null)
				entityDropItem(new ItemStack(type.chassis.getItem(), 1), 1.0F);
			if(type.turret != null)
				entityDropItem(new ItemStack(type.turret.getItem(), 1), 1.0F);
			
			//Guns
			for(int j = 0; j < 2; j++)
			{
				if(data.guns[j] != null)
					entityDropItem(new ItemStack(data.guns[j].getItem()), 1.0F);
				if(data.ammo[j] != null)
					entityDropItem(data.ammo[j], 1.0F);
			}
		}	
        return true;
    }
	
	@Override
	public void pressKey(int key)
	{
		switch(key)
		{
			case 0 : //Accelerate
			{
				if(worldObj.getWorldInfo().getGameType() == EnumGameType.CREATIVE)
				{
					acceleration += type.acceleration / 20D;
				}
				else if(data.fuelInTank > 0)
				{
					acceleration += type.acceleration / 20D;
					data.fuelInTank--;
				}
				if(acceleration > type.maxSpeed + data.engine.engineSpeed)
				{
					acceleration = type.maxSpeed + data.engine.engineSpeed;
				}
				break;
			}
			case 1 : //Deccelerate
			{
				if(worldObj.getWorldInfo().getGameType() == EnumGameType.CREATIVE)
				{
					acceleration -= type.acceleration / 20D;
				}
				else if(data.fuelInTank > 0)
				{
					acceleration -= type.acceleration / 20D;
					data.fuelInTank--;
				}
				if(acceleration < -(type.maxSpeed + data.engine.engineSpeed) / 2)
				{
					acceleration = -(type.maxSpeed + data.engine.engineSpeed) / 2;
				}
				break;
			}
			case 2 : //Left
			{
				//velocityYaw -= type.turnLeftModifier * (1F + type.maxPropSpeed + data.engine.engineSpeed - acceleration) * 0.15F;
				wheelsYaw -= 0.5F * type.turnLeftModifier;
				break;
			}
			case 3 : //Right
			{
				//velocityYaw += type.turnRightModifier * (1F + type.maxPropSpeed + data.engine.engineSpeed  - acceleration) * 0.15F;
				wheelsYaw += 0.5F * type.turnLeftModifier;
				break;
			}
			case 4 : //Up, also handbrake
			{
				if(onGround)
				{
					motionX *= 0.75D;
					motionY *= 0.75D;
					motionZ *= 0.75D;
				}
				break;
			}
			case 5 : //Down
			{
				break;
			}
			case 6 : //Exit
			{
				riddenByEntity.mountEntity(this);
				break;
			}
			case 7 : //Inventory
			{
				// send packet for this.
				ModLoader.openGUI((EntityPlayer)riddenByEntity, new GuiPlaneMenu(((EntityPlayer)riddenByEntity).inventory, worldObj, this));
				break;
			}
			case 8 : //Shell
			{
				if(!worldObj.isRemote && shellDelay <= 0 && FlansMod.bombsEnabled)
				{
					int slot = 0;
					for(int i = data.getBombInventoryStart(); i < data.getBombInventoryStart() + type.numBombSlots; i++)
					{
						ItemStack shell = data.getStackInSlot(i);
						if(shell != null && shell.getItem() instanceof ItemBullet && ((ItemBullet)shell.getItem()).type.isShell)
						{
							slot = i;
						}
					}
					if(slot != 0)
					{
						Vec3 shellVec = rotate(type.barrelX / 16D, type.barrelY / 16D, type.barrelZ / 16D);
						float globalGunPitch = (float)Math.asin(barrelVector.y) * 180F / 3.14159265F;
						float globalGunYaw = -(float)Math.atan2(barrelVector.x, barrelVector.z) * 180F / 3.14159265F;
						worldObj.spawnEntityInWorld(new EntityBullet(worldObj, shellVec.addVector(posX, posY, posZ).addVector(barrelVector.x * 2D, barrelVector.y * 2D, barrelVector.z * 2D), globalGunYaw, globalGunPitch, barrelVector.x * 4D, barrelVector.y * 4D, barrelVector.z * 4D, (EntityLiving)riddenByEntity, 1, ((ItemBullet)data.getStackInSlot(slot).getItem()).type));
						worldObj.playSoundAtEntity(this, type.shellSound, 1.0F , 1.0F);
						data.decrStackSize(slot, 1);
						shellDelay = type.vehicleShellDelay;
					}
				}
				break;
			}
			case 9 : //Shoot
			{
				if(!worldObj.isRemote && gunDelay <= 0 && FlansMod.bulletsEnabled)
				{
					int i = 0;
					if(data.guns[i] != null && data.ammo[i] != null && data.ammo[i].getItem() instanceof ItemBullet && data.guns[i].isAmmo(((ItemBullet)data.ammo[i].getItem()).type))
					{
						Vec3 gunVec = rotate(type.barrelX / 16D, type.barrelY / 16D, type.barrelZ / 16D);
						worldObj.spawnEntityInWorld(new EntityBullet(worldObj, gunVec.addVector(posX, posY, posZ), -axes.getYaw(), axes.getPitch(), (EntityLiving)riddenByEntity, data.guns[i].accuracy, data.guns[i].damage, ((ItemBullet)data.ammo[i].getItem()).type, 3.0F));
						worldObj.playSoundAtEntity(this, type.shootSound, 1.0F , 1.0F);
						int damage = data.ammo[i].getItemDamage();
						data.ammo[i].setItemDamage(damage + 1);	
						if(damage + 1 == data.ammo[i].getMaxDamage())
						{
							if(worldObj.getWorldInfo().getGameType() == EnumGameType.CREATIVE)
								data.ammo[i].setItemDamage(0);
							else data.setInventorySlotContents(i, null);
						}
						gunDelay = type.vehicleShootDelay;
					}
				}				
				break;
			}
			case 10 : //Change Controls
			{
				break;
			}
		}
	}
	
	@Override
	public void useGun(int gunID, EntityPlayer player, EntityPassengerSeat seat)
	{
		if(!worldObj.isRemote && seat.gunDelay <= 0 && FlansMod.bulletsEnabled)
		{
			FlansMod.proxy.spawnVehicle(worldObj, posX, posY, posZ, type, data, seat, this, axes, player);
		}
	}

	@Override
    public void onUpdate()
    {
		double actualMotionX = motionX;//posX - prevPosX;
		double actualMotionY = motionY;//posY - prevPosY;
		double actualMotionZ = motionZ;//posZ - prevPosZ;
        super.onUpdate();
		
		//Key Input  TOD: packets with controls
        /*
		if(Keyboard.isKeyDown(FlansMod.accelerateKey))
			pressKey(0);
		if(Keyboard.isKeyDown(FlansMod.decelerateKey))
			pressKey(1);
		if(Keyboard.isKeyDown(FlansMod.leftKey))
			pressKey(2);
		if(Keyboard.isKeyDown(FlansMod.rightKey))
			pressKey(3);
		if(Keyboard.isKeyDown(FlansMod.upKey))
			pressKey(4);
		if(Keyboard.isKeyDown(FlansMod.downKey))
			pressKey(5);
		if(Keyboard.isKeyDown(FlansMod.exitKey))
			pressKey(6);
		if(Keyboard.isKeyDown(FlansMod.inventoryKey))
			pressKey(7);
		if(Keyboard.isKeyDown(FlansMod.bombKey))
			pressKey(8);
		if(Keyboard.isKeyDown(FlansMod.gunKey))
			pressKey(9);
		if(Keyboard.isKeyDown(FlansMod.controlSwitchKey))
			pressKey(10);
			*/
		
		//Vehicle movement		
		if(riddenByEntity == null)
			acceleration *= 0.8D;
				
		double oldSpeed = Math.sqrt(actualMotionX * actualMotionX + actualMotionY * actualMotionY + actualMotionZ * actualMotionZ);
		double lastMotionX = motionX;
		double lastMotionY = motionY;
		double lastMotionZ = motionZ;
		double newSpeed = oldSpeed * 0.5D + acceleration / 50D;
		double split = Math.abs(acceleration) / (type.maxSpeed + data.engine.engineSpeed);
		if(newSpeed > (type.maxSpeed + data.engine.engineSpeed) / 5D)
			newSpeed = (type.maxSpeed + data.engine.engineSpeed) / 5D;
		Vector3f zAxis = axes.getZAxis();
		
		motionX = newSpeed * -zAxis.x * split + actualMotionX * (1D - split); //X component of local Z axis
		motionY = newSpeed * -zAxis.y * split + actualMotionY * (1D - split); //X component of local Z axis
		motionZ = newSpeed * -zAxis.z * split + actualMotionZ * (1D - split); //Z component of local Z axis

		//Steer
		velocityYaw += wheelsYaw / 4F * (acceleration >= 0 ? 1F : -1F);
		
		velocityYaw *= 0.8F;
		velocityPitch *= 0.8F;
		velocityRoll *= 0.8F;
		
		
		//Return the wheels to their resting position
		wheelsYaw *= 0.8F;
		
		//Limit wheel angles
		if(wheelsYaw > 10)
			wheelsYaw = 10;
		if(wheelsYaw < -10)
			wheelsYaw = -10;

		//Decrement shell and gun timers
		if(shellDelay > 0)
			shellDelay--;
		if(gunDelay > 0)
			gunDelay--;
		
		//Rise in water and fall by gravity
		double motionG = 0D;
		int wetness = 0;
        for(int j = 0; j < 5; j++)
        {
            double d2 = (boundingBox.minY + ((boundingBox.maxY - boundingBox.minY) * (double)j / 5D)) + 1D;
            double d8 = (boundingBox.minY + ((boundingBox.maxY - boundingBox.minY) * (double)(j + 1)) / 5D) + 1D;
            AxisAlignedBB axisalignedbb = AxisAlignedBB.getBoundingBox(boundingBox.minX, d2, boundingBox.minZ, boundingBox.maxX, d8, boundingBox.maxZ);
            if(worldObj.isAABBInMaterial(axisalignedbb, Material.water))
            {
                motionG += 0.05D;
				wetness++;
            }
        }		
		if(!onGround)
			motionG -= (9.81D / 400D);
		motionY += motionG;
		
		if(onGround && acceleration < 0.1D)
		{
			motionX *= 0.9D;
			motionZ *= 0.9D;
		}
						
		//Collision Handling
		int tileX = MathHelper.floor_double(posX + 0.5D);
		int tileY = MathHelper.floor_double(posY + 0.5D);
		int tileZ = MathHelper.floor_double(posZ + 0.5D);
		Vec3[] wheelVectors = new Vec3[4];
		//The vectors defining the average of all 4 points and those diagonally opposite
		Vec3 averageVector = Vec3.createVectorHelper(0D, 0D, 0D);
		Vec3 averageVectorAC = Vec3.createVectorHelper(0D, 0D, 0D);
		Vec3 averageVectorBD = Vec3.createVectorHelper(0D, 0D, 0D);
		double pushX = 0D;
		double pushY = 0D;
		double pushZ = 0D;
		//Check if wheel is in block and if so try to raise it, otherwise push the vehicle out of blocks
		for(int i = 0; i < 4; i++)
		{
			wheelVectors[i] = rotate(type.wheelsX[i] / 16D, type.wheelsY[i] / 16D, type.wheelsZ[i] / 16D);
			tileX = MathHelper.floor_double(posX + wheelVectors[i].xCoord);
			tileY = MathHelper.floor_double(posY + wheelVectors[i].yCoord);
			tileZ = MathHelper.floor_double(posZ + wheelVectors[i].zCoord);
			int blockID = worldObj.getBlockId(tileX, tileY, tileZ);
			if(blockID != 0 && Block.blocksList[blockID].blockMaterial.isSolid())
			{
				//The wheel is in a block. See if block above is solid
				blockID = worldObj.getBlockId(tileX, tileY + 1, tileZ);
				if(blockID != 0 && Block.blocksList[blockID].blockMaterial.isSolid())
				{
					//Solid above too. Push the vehicle back.
					pushX -= wheelVectors[i].xCoord;
					pushZ -= wheelVectors[i].zCoord;
				}
				else
				{
					//Not solid above, push wheel up.
					wheelVectors[i].yCoord += 0.5D;
					pushY += 50D;
				}
			}
			else
			{
				//The wheel isn't in a block. See if block below is solid
				blockID = worldObj.getBlockId(tileX, tileY - 1, tileZ);
				if(blockID == 0 || !Block.blocksList[blockID].blockMaterial.isSolid())
				{
					wheelVectors[i].yCoord -= 0.2D;
					pushY -= 5D;
					//acceleration *= 0.9D;
					//motionX *= 0.9D;
					//motionZ *= 0.9D;
				}
			}
			averageVector = averageVector.addVector(wheelVectors[i].xCoord / 4D, wheelVectors[i].yCoord / 4D, wheelVectors[i].zCoord / 4D);
			if(i % 2 == 0)
				averageVectorAC = averageVectorAC.addVector(wheelVectors[i].xCoord / 2D, wheelVectors[i].yCoord / 2D, wheelVectors[i].zCoord / 2D);
			else averageVectorBD = averageVectorAC.addVector(wheelVectors[i].xCoord / 2D, wheelVectors[i].yCoord / 2D, wheelVectors[i].zCoord / 2D);
		}
		//Now recalculate the yaw pitch and roll based on how the wheels moved.
		//First, make the points coplanar
		//DON'T do this. It gives the car equilibrium points at roll = +/- 90. ew.
		//double dY = averageVectorAC.yCoord - averageVector.yCoord;
		//wheelVectors[0].yCoord -= dY;
		//wheelVectors[2].yCoord -= dY;
		//dY = averageVectorBD.yCoord - averageVector.yCoord;
		//wheelVectors[1].yCoord -= dY;
		//wheelVectors[3].yCoord -= dY;

		//Now calculate the rotation matrix based on these points
		Vec3 zAxis2 = wheelVectors[0].subtract(wheelVectors[1]).normalize();
		Vec3 xAxis = wheelVectors[0].subtract(wheelVectors[3]).normalize();
		Vec3 yAxis = zAxis2.crossProduct(xAxis);
		Matrix4f rotationMatrix = new Matrix4f();
		rotationMatrix.m00 = (float)xAxis.xCoord;
		rotationMatrix.m10 = (float)xAxis.yCoord;
		rotationMatrix.m20 = (float)xAxis.zCoord;
		rotationMatrix.m01 = (float)yAxis.xCoord;
		rotationMatrix.m11 = (float)yAxis.yCoord;
		rotationMatrix.m21 = (float)yAxis.zCoord;
		rotationMatrix.m02 = (float)zAxis2.xCoord;
		rotationMatrix.m12 = (float)zAxis2.yCoord;
		rotationMatrix.m22 = (float)zAxis2.zCoord;
		axes = new RotatedAxes(rotationMatrix);
		motionJ *= 0.8D;
		motionX += pushX / 10D;
		motionJ += pushY / 10D;
		motionZ += pushZ / 10D;		
		
		moveEntity(motionX, motionY + motionJ, motionZ);
		
		//More movement
		rotateYaw(velocityYaw);
		rotatePitch(velocityPitch);
		rotateRoll(velocityRoll);
		
		if(riddenByEntity != null)
		{
			//riddenByEntity.rotationYaw += 2D * velocityYaw;
			//riddenByEntity.prevRotationYaw += 2D * velocityYaw;			
		}
					
		rotationYaw = axes.getYaw();
		rotationPitch = axes.getPitch();
				
		//Turret aiming
		if(riddenByEntity != null && riddenByEntity instanceof EntityPlayer)
		{
			//Barrel Angles
			double cosYaw = Math.cos(riddenByEntity.rotationYaw * 3.14159265F / 180F);
			double sinYaw = Math.sin(riddenByEntity.rotationYaw * 3.14159265F / 180F);
			double cosPitch = Math.cos(riddenByEntity.rotationPitch * 3.14159265F / 180F);
			double sinPitch = Math.sin(riddenByEntity.rotationPitch * 3.14159265F / 180F);
			Vector3f playerLookVector = new Vector3f((float)cosPitch * (float)sinYaw, (float)sinPitch, (float)cosPitch * (float)cosYaw);
			Vector3f localLookVector = axes.findGlobalVectorLocally(playerLookVector);
			gunPitch = (float)Math.asin(localLookVector.y) * 180F / 3.14159265F;
			gunYaw = -(float)Math.atan2(localLookVector.x, localLookVector.z) * 180F / 3.14159265F;
			if(gunYaw > type.turretYawMax)
				gunYaw = type.turretYawMax;
			if(gunYaw < type.turretYawMin)
				gunYaw = type.turretYawMin;
			if(gunPitch < type.turretPitchMax)
				gunPitch = type.turretPitchMax;
			if(gunPitch > type.turretPitchMin)
				gunPitch = type.turretPitchMin;
			
			//Barrel Vector
			playerLookVector = new Vector3f(-(float)cosPitch * (float)sinYaw, -(float)sinPitch, (float)cosPitch * (float)cosYaw);
			localLookVector = axes.findGlobalVectorLocally(playerLookVector);
			float gunPitch2 = -(float)Math.asin(localLookVector.y) * 180F / 3.14159265F;
			float gunYaw2 = (float)Math.atan2(localLookVector.x, localLookVector.z) * 180F / 3.14159265F;
			if(gunYaw2 > type.turretYawMax)
				gunYaw2 = type.turretYawMax;
			if(gunYaw2 < type.turretYawMin)
				gunYaw2 = type.turretYawMin;
			if(gunPitch2 < type.turretPitchMax)
				gunPitch2 = type.turretPitchMax;
			if(gunPitch2 > type.turretPitchMin)
				gunPitch2 = type.turretPitchMin;
			cosYaw = Math.cos(gunYaw2 * 3.14159265F / 180F);
			sinYaw = Math.sin(gunYaw2 * 3.14159265F / 180F);
			cosPitch = Math.cos(gunPitch2 * 3.14159265F / 180F);
			sinPitch = Math.sin(gunPitch2 * 3.14159265F / 180F);
			Vector3f localBarrelVector = new Vector3f((float)cosPitch * (float)sinYaw, -(float)sinPitch, (float)cosPitch * (float)cosYaw);
			barrelVector = axes.findLocalVectorGlobally(localBarrelVector);
		}
					
		//Sounds
		// TODO: Do Sound Stuff
		/*
		if (acceleration > 0.2D && acceleration < 1 && soundPosition == 0)
		{
			if(riddenByEntity != null && riddenByEntity == mc.thePlayer)
			{
				try {
					// SOUND PACKETS
					//mc.sndManager.playSoundFX(type.startSound, 1.0F, 1.0F);
				}
				catch(Exception e)
				{
					FlansMod.log("Failed to play sound : " + type.startSound);
				}
			}
			else worldObj.playSoundAtEntity(this, type.startSound, 1.0F , 1.0F);
			soundPosition = type.startSoundLength;
		}
			
		if (acceleration > 1 && soundPosition == 0)
		{
			if(riddenByEntity != null && riddenByEntity == mc.thePlayer)
			{
				try {
					// TODO: sound packets
					//mc.sndManager.playSoundFX(type.engineSound, 1.0F, 1.0F);
				}
				catch(Exception e)
				{
					FlansMod.log("Failed to play sound : " + type.engineSound);
				}
			}
			else worldObj.playSoundAtEntity(this, type.engineSound, 1.0F , 1.0F);
			soundPosition = type.engineSoundLength;
		}
		*/
		
		if(soundPosition > 0)
			soundPosition--;
		
		//Fuel Handling
		if(data.fuel != null && data.fuel.stackSize <= 0)
			data.fuel = null;
		if(!fuelling && data.fuel != null && data.fuel.stackSize > 0 && data.fuel.getItem() instanceof ItemPart && ((ItemPart)data.fuel.getItem()).type.category == 9)// && onGround && getSpeedXYZ() < 0.1D)
		{
			fuelling = true;
		}
		if(fuelling)
		{
			if(data.fuel == null || data.fuel.stackSize <= 0 || !(data.fuel.getItem() instanceof ItemPart) || ((ItemPart)data.fuel.getItem()).type.category != 9 || data.fuelInTank >= type.tankSize)// || !onGround || getSpeedXYZ() > 0.1D)
			{
				fuelling = false;
			}
			else
			{
				int damage = data.fuel.getItemDamage();
				data.fuel.setItemDamage(damage + 1);
				data.fuelInTank += 5;
				if(damage >= ((ItemPart)data.fuel.getItem()).type.fuel)
				{
					data.fuel.setItemDamage(0);
					data.fuel.stackSize--;
					if(data.fuel.stackSize <= 0)
						data.setInventorySlotContents(data.getFuelSlot(), null);
					fuelling = false;
				}	
			}
		}
				
		//Damage Vehicle
		if(health < type.health / 4)
		{
			for(int j = 0; j < 10; j++)
			{				
				worldObj.spawnParticle("smoke", posX + rand.nextGaussian() / 4D, posY + rand.nextGaussian() / 4D, posZ + rand.nextGaussian() / 4D, 0D, 0D, 0D);
			}
			if(health < type.health / 8)
			{
				for(int j = 0; j < 10; j++)
				{				
					worldObj.spawnParticle("flame", posX + rand.nextGaussian() / 4D, posY + rand.nextGaussian() / 4D, posZ + rand.nextGaussian() / 4D, 0D, 0D, 0D);
				}
			}
		}
		//Fix non-spawning sub-entities
		if(!spawnedEntities)
		{
			for(int i = 0; i < seats.length; i++)
			{
				if(!worldObj.loadedEntityList.contains(seats[i]))
					worldObj.spawnEntityInWorld(seats[i]);
			}
			for(int i = 0; i < boxes.length; i++)
			{
				if(!worldObj.loadedEntityList.contains(boxes[i]))
					worldObj.spawnEntityInWorld(boxes[i]);
			}
			spawnedEntities = true;
		}
    }
	
	public void updateCollisionBox(EntityCollisionBox box)
	{
		Vec3 vec = rotate(box.x / 16D, box.y / 16D, box.z / 16D);
		box.setPosition(posX + vec.xCoord, posY + vec.yCoord, posZ + vec.zCoord);
		box.motionX = box.posX - box.prevPosX;
		box.motionY = box.posY - box.prevPosY;
		box.motionZ = box.posZ - box.prevPosZ;
		List list = worldObj.getEntitiesWithinAABBExcludingEntity(box, box.boundingBox);
		if(list != null && list.size() > 0)
		{
			for(int i = 0; i < list.size(); ++i)
			{
				Entity entity = (Entity)list.get(i);
				if(!isPartOfThis(entity) && entity.canBePushed())
				{
					entity.applyEntityCollision(box);
					if(entity instanceof EntityLiving && type.squashMobs && riddenByEntity != null)
					{
						entity.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)riddenByEntity), 10);
					}
				}
			}
		}
	}
	
    public void updateRiderPosition()
    {
        if(riddenByEntity == null)
        {
            return;
        } else if(riddenByEntity instanceof EntityLiving)
        {				
			Vec3 vec = rotate(type.driverX / 16D, getMountedYOffset() + riddenByEntity.getYOffset() + type.driverY / 16D, type.driverZ / 16D);
            riddenByEntity.setPosition(posX + vec.xCoord, posY + vec.yCoord, posZ + vec.zCoord);
			riddenByEntity.rotationYaw -= 2F * (axes.getYaw() - prevRotationYaw);
			//riddenByEntity.rotationPitch -= (axes.getPitch() - prevRotationPitch);
			return;
        }
		else { return; }
    }
	
	private void smashIntoBlock(int i, int j, int k)
	{
		int blockID = worldObj.getBlockId(i, j, k);
		if(blockID != 0)
		{
			int meta = worldObj.getBlockMetadata(i, j, k);
			Block block = Block.blocksList[blockID];
			if(block.blockMaterial.isSolid())
			{
				float damage = block.getBlockHardness(worldObj, i, j, k) * 20F;
				attackEntityFrom(DamageSource.inWall, (int)damage);
				if(damage <= 20F && damage > 0F)
				{
					worldObj.setBlockWithNotify(i, j, k, 0);
					// TODO: breakBlock effects.
					//mc.effectRenderer.addBlockHitEffects(i, j, k, 1);
					block.dropBlockAsItem(worldObj, i, j, k, meta, 1);
					velocityYaw += rand.nextFloat() * 1F - 0.5F;
					velocityPitch += rand.nextFloat() * 1F - 0.5F;
					velocityRoll += rand.nextFloat() * 1F - 0.5F;
				}
			}
		}
	}
	
	public void applyEntityCollision(Entity entity)
    {
	}

	@Override
    protected void writeEntityToNBT(NBTTagCompound tag)
    {
		tag.setInteger("DataID", dataID);
		data.writeToNBT(tag);
		tag.setString("Type", type.shortName);
		tag.setFloat("RotationYaw", axes.getYaw());
		tag.setFloat("RotationPitch", axes.getPitch());
		tag.setFloat("RotationRoll", axes.getRoll());
		tag.setInteger("Health", health);
    }

	@Override
    protected void readEntityFromNBT(NBTTagCompound tag)
    {
		type = VehicleType.getVehicle(tag.getString("Type"));
		initType();
		//TODO : Should be obtained through world?
		dataID = tag.getInteger("DataID");
		data = new VehicleData("Vehicle_" + dataID, type);
		data.readFromNBT(tag);
		superType = type;
		superData = data;
		prevRotationYaw = tag.getFloat("RotationYaw");
		prevRotationPitch = tag.getFloat("RotationPitch");
		prevRotationRoll = tag.getFloat("RotationRoll");
		axes = new RotatedAxes(prevRotationYaw, prevRotationPitch, prevRotationRoll);
		health = tag.getInteger("Health");
    }

	@Override
    public boolean interact(EntityPlayer entityplayer)
    {
		if(worldObj.isRemote)
			return true;
		if(entityplayer == riddenByEntity)
		{
			//entityplayer.mountEntity(this);
			return true;
		}
		if(canSit(0))
		{
			entityplayer.mountEntity(this);
			shellDelay = type.vehicleShellDelay;
			FlansMod.proxy.doTutorialStuff(entityplayer, this);
		}
		for(int i = 0; i < type.numPassengers; i++)
		{
			if(canSit(i + 1))
			{
				entityplayer.mountEntity(seats[i]);	
				return true;
			}
		}
        return true;
    }
	
	private boolean canSit(int seat)
	{
		if(seat == 0 && riddenByEntity == null)
			return true;
		if(seat > 0 && type.numPassengers >= seat && seats[seat - 1].riddenByEntity == null)
			return true;
		return false;
	}
	
	@Override
	public void writeSpawnData(ByteArrayDataOutput data) {
		// TODO Auto-generated method stub
		data.writeUTF(type.shortName);
	}

	@Override
	public void readSpawnData(ByteArrayDataInput data) {
		// TODO Auto-generated method stub
		try
		{
			type = VehicleType.getVehicle(data.readUTF());
			initType();
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to retreive vehicle type from server.");
			super.setDead();
			e.printStackTrace();
		}
	}
		
	public VehicleType type;
	public VehicleData data;
		
	//Weaponry
	public int shellDelay;
	public int gunDelay;
	
	public float gunYaw;
	public float gunPitch;
	
	//Jumping motion caused by driving over a block. Independent of motionY to stop speedhacking on edges
	public double motionJ;
	
	public int soundPosition;
	public float wheelsYaw;
	public double acceleration;
	
	private boolean spawnedEntities;
	private Vector3f barrelVector;
}
