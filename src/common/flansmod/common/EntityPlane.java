package flansmod.common;

import java.util.List;
import java.util.Random;
import org.lwjgl.input.Keyboard;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;

import cpw.mods.fml.client.FMLClientHandler;

import flansmod.minecraft.GuiPlaneController;
import flansmod.minecraft.GuiPlaneMenu;
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

public class EntityPlane extends EntityDriveable
{
    public EntityPlane(World world)
    {
        super(world);
    }
	
	public EntityPlane(World world, double x, double y, double z, EntityPlayer placer, PlaneType type1, PlaneData data1)
	{
		super(world, type1, data1);
		setPosition(x, y, z);
		rotateYaw(placer.rotationYaw);
		data = data1;
		try
		{
			dataID = Integer.parseInt(data.mapName.split("_")[1]);
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to retrieve plane data ID from plane data. " + data.mapName);
		}
		type = type1;
		initType();
	}
	
	private void initType()
	{
		health = type.health;
		rightWingHealth = leftWingHealth = tailHealth = health;
		seats = new EntityPassengerSeat[type.numPassengers];
		for(int i = 0; i < type.numPassengers; i++)
		{
			seats[i] = new EntityPassengerSeat(worldObj, this, i, type.seatsX[i], type.seatsY[i], type.seatsZ[i], type.gunner[i]);
			worldObj.spawnEntityInWorld(seats[i]);
		}
		yOffset = type.yOffset;
		propBlown = new boolean[type.numProps];
		if(type.model == null)
		{
			FlansMod.logLoudly("TurboModelThingy not installed");
			return;
		}
		boxes = new EntityCollisionBox[type.model.collisionBoxes.length];
		for(int i = 0; i < boxes.length; i++)
		{
			boxes[i] = type.model.collisionBoxes[i].makeEntity(this);
		}
	}
	
	private void destroyBrokenParts()
	{
		for(EntityCollisionBox box : boxes)
		{
			if((box.part == 1 && leftWingHealth <= 0)
			|| (box.part == 2 && rightWingHealth <= 0)
			|| (box.part == 3 && tailHealth <= 0))
			{
				box.die();
			}
		}
	}
	
	public boolean attackEntityFromPart(EntityCollisionBox box, DamageSource damagesource, int i)
    {
		if(worldObj.isRemote || isDead)
        {
            return true;
        }
		if((box.part != 0 || health <= 0) && (box.part != 1 || leftWingHealth <= 0) && (box.part != 2 || rightWingHealth <= 0) && (box.part != 3 || tailHealth <= 0))
			return false;
		switch(box.part)
		{
			case 0 : //Body
				return attackEntityFrom(damagesource, i, true);
			case 1 : //Left Wing
			{
				if(leftWingHealth > 0)
				{	
					leftWingHealth -= i;
					if(leftWingHealth <= 0)
					{
						if(type.wings != null)
							entityDropItem(new ItemStack(type.wings.getItem(), type.bigTable ? 2 : 1), 1.0F);
						int numProps = 0;
						if(type.propSetup > 0)
						{
							numProps++;
							propBlown[1] = true;
						}
						if(type.propSetup == 3)
						{
							numProps++;
							propBlown[3] = true;
						}
						if(type.propeller != null && numProps > 0)
							entityDropItem(new ItemStack(type.propeller.getItem(), numProps), 1.0F);
						if(numProps > 0)
							entityDropItem(new ItemStack(data.engine.getItem(), numProps), 1.0F);
						if(data.guns[2] != null)
						{
							entityDropItem(new ItemStack(data.guns[2].getItem(), 1), 1.0F);
							data.guns[2] = null;
							if(data.ammo[2] != null)
							{
								entityDropItem(data.ammo[2], 1.0F);
								data.ammo[2] = null;
							}
						}
					}		
				}
				
				break;
			}
			case 2 : //Right Wing
			{
				if(rightWingHealth > 0)
				{	
					rightWingHealth -= i;
					if(rightWingHealth <= 0)
					{
						if(type.wings != null)
							entityDropItem(new ItemStack(type.wings.getItem(), type.bigTable ? 2 : 1), 1.0F);
						int numProps = 0;
						if(type.propSetup > 0)
						{
							numProps++;
							propBlown[0] = true;
						}
						if(type.propSetup == 3)
						{
							numProps++;
							propBlown[2] = true;
						}
						if(type.propeller != null && numProps > 0)
							entityDropItem(new ItemStack(type.propeller.getItem(), numProps), 1.0F);
						if(numProps > 0)
							entityDropItem(new ItemStack(data.engine.getItem(), numProps), 1.0F);
						if(data.guns[3] != null)
						{
							entityDropItem(new ItemStack(data.guns[3].getItem(), 1), 1.0F);
							data.guns[3] = null;
							if(data.ammo[3] != null)
							{
								entityDropItem(data.ammo[3], 1.0F);
								data.ammo[3] = null;
							}
						}
					}	
				}
				break;
			}
			case 3 : //Tail Wing
			{
				if(tailHealth > 0)
				{	
					tailHealth -= i;
					if(tailHealth <= 0)
					{
						if(type.tail != null)
							entityDropItem(new ItemStack(type.tail.getItem(), 1), 1.0F);
						if(data.guns[4] != null)
						{
							entityDropItem(new ItemStack(data.guns[4].getItem(), 1), 1.0F);
							data.guns[4] = null;
							if(data.ammo[4] != null)
							{
								entityDropItem(data.ammo[4], 1.0F);
								data.ammo[4] = null;
							}
						}
					}	
				}
				break;
			}
		}
		destroyBrokenParts();
		return attackEntityFrom(damagesource, i, false);
	}
	
	public boolean attackEntityFrom(DamageSource damagesource, int i)
    {
		return attackEntityFrom(damagesource, i, true);
	}
	
    public boolean attackEntityFrom(DamageSource damagesource, int i, boolean doDamage)
    {
        if(worldObj.isRemote || isDead)
        {
            return true;
        }
		if(/*onGround &&*/ damagesource.damageType.equals("player") && ((EntityDamageSource)damagesource).getEntity().onGround)
		{
			if(leftWingHealth > 0 && rightWingHealth > 0 && tailHealth > 0)
			{
				entityDropItem(new ItemStack(type.itemID, 1, dataID), 0.5F);
				data.markDirty();
			} else
			{
				if(type.cockpit != null)
					entityDropItem(new ItemStack(type.cockpit.getItem(), 1), 1.0F);
				if(type.bay != null)
					entityDropItem(new ItemStack(type.bay.getItem(), 1), 1.0F);
				if(type.tail != null && tailHealth > 0)
					entityDropItem(new ItemStack(type.tail.getItem(), 1), 1.0F);
				if(type.dyes)
					entityDropItem(new ItemStack(Item.dyePowder, (type.bigTable ? 10 : 6), type.dyeColour), 1.0F);
				if(leftWingHealth > 0)
					entityDropItem(new ItemStack(type.wings.getItem(), (type.bigTable ? 2 : 1)), 1.0F);
				if(rightWingHealth > 0)
					entityDropItem(new ItemStack(type.wings.getItem(), (type.bigTable ? 4 : 2)), 1.0F);
				for(int j = 0; j < type.numProps; j++)
				{
					if(!propBlown[j] && ((type.propSetup == 0) || (j % 2 == 0 && leftWingHealth > 0) || (j % 2 == 1 && rightWingHealth > 0)))
					{
						entityDropItem(new ItemStack(type.propeller.getItem(), 1), 1.0F);
						entityDropItem(new ItemStack(data.engine.getItem(), 1), 1.0F);
					}
				}
				
				//Guns
				for(int j = 0; j < 8; j++)
				{
					if(j == 2 && leftWingHealth <= 0)
						continue;
					if(j == 3 && rightWingHealth <= 0)
						continue;
					if(j == 4 && tailHealth <= 0)
						continue;
					if(data.guns[j] != null)
						entityDropItem(new ItemStack(data.guns[j].getItem()), 1.0F);
					if(data.ammo[j] != null)
						entityDropItem(data.ammo[j], 1.0F);
				}
				//Inventory
				for(int j = 0; j < data.getFuelSlot() + 1; j++)
				{
					ItemStack stack = data.getStackInSlot(j);
					if(stack != null)
						entityDropItem(stack, 1.0F);
				}
			}
	 		setDead();
			return true;
		}
		if(doDamage)
			health -= i;
		if(health < 0)
		{
			//Dont explode too much, dont want to cause out of memory errors
			float amountExploded = 0F;
			//Detonate all bombs and fuel
			for(int j = 0; j < type.numBombSlots; j++)
			{
				ItemStack bomb = data.getStackInSlot(data.getBombInventoryStart() + j);
				if(bomb != null && bomb.getItem() instanceof ItemBullet)
				{
					BulletType bombType = ((ItemBullet)bomb.getItem()).type;
					if(FlansMod.explosions && (bombType.explodeOnImpact || bombType.fuse > 0) && rand.nextBoolean() && amountExploded < 10F)
					{
						worldObj.createExplosion(this, posX + (double)rand.nextGaussian() * 2D, posY + (double)rand.nextGaussian() * 2D, posZ + (double)rand.nextGaussian() * 2D, bombType.explosion);
						amountExploded += bombType.explosion;
					}
					else
						entityDropItem(bomb, 1.0F);
				}
				else if(bomb != null)
					entityDropItem(bomb, 1.0F);
			}
			for(int j = type.numBombSlots; j < data.getFuelSlot() + 1; j++)
			{
				ItemStack stack = data.getStackInSlot(j);
				if(stack != null)
					entityDropItem(stack, 1.0F);
			}
			if(FlansMod.explosions && data.fuelInTank > 0 && rand.nextBoolean() && amountExploded < 10F)
			{
				worldObj.createExplosion(this, posX + (double)rand.nextGaussian() * 2D, posY + (double)rand.nextGaussian() * 2D, posZ + (double)rand.nextGaussian() * 2D, (float)data.fuelInTank / 200F);
			}
			
			setDead();
			if(type.cockpit != null)
				entityDropItem(new ItemStack(type.cockpit.getItem(), 1), 1.0F);
			if(type.bay != null)
				entityDropItem(new ItemStack(type.bay.getItem(), 1), 1.0F);
			if(type.tail != null && tailHealth > 0)
				entityDropItem(new ItemStack(type.tail.getItem(), 1), 1.0F);
			if(type.dyes)
				entityDropItem(new ItemStack(Item.dyePowder, (type.bigTable ? 10 : 6), type.dyeColour), 1.0F);
			if(leftWingHealth > 0)
				entityDropItem(new ItemStack(type.wings.getItem(), (type.bigTable ? 2 : 1)), 1.0F);
			if(rightWingHealth > 0)
				entityDropItem(new ItemStack(type.wings.getItem(), (type.bigTable ? 4 : 2)), 1.0F);
			for(int j = 0; j < type.numProps; j++)
			{
				if(!propBlown[j] && ((type.propSetup == 0) || (j % 2 == 0 && leftWingHealth > 0) || (j % 2 == 1 && rightWingHealth > 0)))
				{
					entityDropItem(new ItemStack(type.propeller.getItem(), 1), 1.0F);
					entityDropItem(new ItemStack(data.engine.getItem(), 1), 1.0F);
				}
			}
			
			//Guns
			for(int j = 0; j < 8; j++)
			{
				if(j == 2 && leftWingHealth <= 0)
					continue;
				if(j == 3 && rightWingHealth <= 0)
					continue;
				if(j == 4 && tailHealth <= 0)
					continue;
				if(data.guns[j] != null)
					entityDropItem(new ItemStack(data.guns[j].getItem()), 1.0F);
				if(data.ammo[j] != null)
					entityDropItem(data.ammo[j], 1.0F);
			}
		}	
        return true;
    }
	
	public void pressKey(int key)
	{
		if(riddenByEntity == null || riddenByEntity != mc.thePlayer)
			return;
		switch(key)
		{
			case 0 : //Accelerate
			{
				if(worldObj.getWorldInfo().getGameType() == EnumGameType.CREATIVE)
				{
					propSpeed += type.acceleration / 100D;
				}
				else if(data.fuelInTank > 0)
				{
					propSpeed += type.acceleration / 100D;
					data.fuelInTank--;
				}
				if(propSpeed > type.maxPropSpeed + data.engine.engineSpeed)
				{
					propSpeed = type.maxPropSpeed + data.engine.engineSpeed;
				}
				break;
			}
			case 1 : //Deccelerate
			{
				if(worldObj.getWorldInfo().getGameType() == EnumGameType.CREATIVE)
				{
					propSpeed -= type.acceleration / 100D;
				}
				else if(data.fuelInTank > 0)
				{
					propSpeed -= type.acceleration / 100D;
					data.fuelInTank--;
				}
				if(propSpeed < 0)
				{
					propSpeed = 0;
				}
				break;
			}
			case 2 : //Left
			{
				if(tailHealth > 0)
				{
					velocityYaw -= type.turnLeftModifier * (1F + type.maxPropSpeed + data.engine.engineSpeed - propSpeed) * 0.15F;
					flapsYaw -= 5F;
				}
				break;
			}
			case 3 : //Right
			{
				if(tailHealth > 0)
				{
					velocityYaw += type.turnRightModifier * (1F + type.maxPropSpeed + data.engine.engineSpeed  - propSpeed) * 0.15F;
					flapsYaw += 5F;
				}
				break;
			}
			case 4 : //Up
			{
				if(tailHealth > 0 && propSpeed > type.takeOffSpeed && (FlansMod.controlMode == 1 || axes.getPitch() > -75F))
				{
					velocityPitch += type.lookUpModifier * (propSpeed - type.takeOffSpeed) * 0.15F;
					flapsPitchLeft += 5F;
					flapsPitchRight += 5F;
				}
				break;
			}
			case 5 : //Down
			{
				if(tailHealth > 0 && propSpeed > type.takeOffSpeed && (FlansMod.controlMode == 1 || axes.getPitch() < 75F))
				{
					velocityPitch -= type.lookDownModifier * (propSpeed - type.takeOffSpeed) * 0.15F;
					flapsPitchLeft -= 5F;
					flapsPitchRight -= 5F;
				}
				break;
			}
			case 6 : //Exit
			{
				riddenByEntity.mountEntity(this);
				break;
			}
			case 7 : //Inventory
			{
				ModLoader.openGUI((EntityPlayer)riddenByEntity, new GuiPlaneMenu(((EntityPlayer)riddenByEntity).inventory, worldObj, this));
				break;
			}
			case 8 : //Bomb
			{
				if(!worldObj.isRemote && bombDelay <= 0 && FlansMod.bombsEnabled)
				{
					int slot = 0;
					int bombType = 0;
					for(int i = data.getBombInventoryStart(); i < data.getBombInventoryStart() + type.numBombSlots; i++)
					{
						ItemStack bomb = data.getStackInSlot(i);
						if(bomb != null && bomb.getItem() instanceof ItemBullet && ((ItemBullet)bomb.getItem()).type.isBomb)
						{
							slot = i;
						}
					}
					if(slot != 0)
					{
						Vec3 bombVec = rotate(type.bombXOffset / 16D, type.bombYOffset / 16D, type.bombZOffset / 16D);
						worldObj.spawnEntityInWorld(new EntityBullet(worldObj, bombVec.addVector(posX, posY, posZ), axes.getYaw(), axes.getPitch(), motionX, motionY, motionZ, (EntityLiving)riddenByEntity, 1, ((ItemBullet)data.getStackInSlot(slot).getItem()).type));
						if(type.bombSound != null)
						{
							try {
								worldObj.playSoundAtEntity(this, type.bombSound, 1.0F , 1.0F);
							}
							catch(Exception e)
							{
								FlansMod.log("Failed to play sound : " + type.bombSound);
							}						
						}
						data.decrStackSize(slot, 1);
						bombDelay = type.planeBombDelay;
					}
				}
				break;
			}
			case 9 : //Shoot
			{
				if(!worldObj.isRemote && gunDelay <= 0 && FlansMod.bulletsEnabled)
				{
					for(int i = 0; i < 4; i++)
					{
						if(data.guns[i] != null && data.ammo[i] != null && data.ammo[i].getItem() instanceof ItemBullet && data.guns[i].isAmmo(((ItemBullet)data.ammo[i].getItem()).type))
						{
							Vec3 gunVec = rotate(type.barrelX[i] / 16D, type.barrelY[i] / 16D, type.barrelZ[i] / 16D);
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
							gunDelay = type.planeShootDelay;
						}
					}
				}				
				break;
			}
			case 10 : //Change Controls
			{
				FlansMod.setControlMode(1);
				ModLoader.openGUI((EntityPlayer)riddenByEntity, new GuiPlaneController(this));
				break;
			}
		}
	}

    public void onUpdate()
    {
        super.onUpdate();
		if(riddenByEntity != null && riddenByEntity instanceof EntityPlayer && FlansMod.controlMode == 1 && FMLClientHandler.instance().getClient().currentScreen == null)
			ModLoader.openGUI((EntityPlayer)riddenByEntity, new GuiPlaneController(this));
		
		//Key Input
		if(FlansMod.controlMode == 0)
		{
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
		}
		
		//Plane movement
		int numPropsWorking = 0;
		for(int j = 0; j < type.numProps; j++)
		{
			if(!propBlown[j])
				numPropsWorking++;
		}
		
		if(riddenByEntity == null)
			propSpeed *= 0.8D;
		
		double acceleration = propSpeed * numPropsWorking * 0.01D;
		double oldSpeed = getSpeedXYZ();
		double lastMotionX = motionX;
		double lastMotionY = motionY;
		double lastMotionZ = motionZ;
		double newSpeed = oldSpeed * 0.9D + acceleration;
		double split = propSpeed / (type.maxPropSpeed + data.engine.engineSpeed);
		double yComponent = propSpeed - type.takeOffSpeed;
		if(leftWingHealth <= 0 && rightWingHealth <= 0)
			yComponent = 0D;
		if(yComponent < 0D)
			yComponent = 0D;
		if(yComponent > 1D)
			yComponent = 1D;
		Vector3f zAxis = axes.getZAxis();
		
		motionX = newSpeed * zAxis.x * split + lastMotionX * (1D - split); //X component of local Z axis
		motionY = yComponent * newSpeed * zAxis.y * split + lastMotionY * (1D - split); //Y component of local Z axis
		motionZ = newSpeed * zAxis.z * split + lastMotionZ * (1D - split); //Z component of local Z axis
		
		velocityYaw *= 0.8F;
		velocityPitch *= 0.8F;
		velocityRoll *= 0.8F;
		
		//Rotate the propeller
		propAngle += propSpeed / 10F;
		
		//Return the flaps to their resting position
		flapsYaw *= 0.8F;
		flapsPitchLeft *= 0.8F;
		flapsPitchRight *= 0.8F;
		//Limit flap angles
		if(flapsYaw > 10)
			flapsYaw = 10;
		if(flapsYaw < -10)
			flapsYaw = -10;
		if(flapsPitchRight > 10)
			flapsPitchRight = 10;
		if(flapsPitchRight < -10)
			flapsPitchRight = -10;
		if(flapsPitchLeft > 10)
			flapsPitchLeft = 10;
		if(flapsPitchLeft < -10)
			flapsPitchLeft = -10;
			
		//Decrement bomb and gun timers
		if(bombDelay > 0)
			bombDelay--;
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
		if(numPropsWorking > 0 && (leftWingHealth > 0 || rightWingHealth > 0))
			motionG *= (1D - getSpeedXYZ() > 0D ? 1D - getSpeedXYZ() : 0D);
		motionY += motionG;
		
		if(onGround && propSpeed < 0.1D)
		{
			motionX *= 0.9D;
			motionZ *= 0.9D;
		}
				
		//Turning moment caused by blown propellers
		int turn = 0;
		switch(type.propSetup)
		{
			case 0 : break; //Single propeller
			case 3 : //4 propellers
			{
				if(propBlown[2]) turn++;
				if(propBlown[3]) turn--;
			}
			case 1 : //2 propellers
			case 2 :
			{
				if(propBlown[0]) turn++;
				if(propBlown[1]) turn--;
				break;
			}		
		}
		if(leftWingHealth <= 0)
			turn++;
		if(rightWingHealth <= 0)
			turn--;
		if(!onGround)
			velocityYaw += turn * getSpeedXYZ();
				
		//Collision Handling
		int tileX = MathHelper.floor_double(posX + 0.5D);
		int tileY= MathHelper.floor_double(posY + 0.5D);
		int tileZ = MathHelper.floor_double(posZ + 0.5D);
		smashIntoBlock(tileX, tileY, tileZ);
		if(getSpeedXYZ() > 0.2D)
        {
			if(motionX > motionZ && motionX > -motionZ && motionX > motionY && motionX > -motionY) //Moving in +x
			{
				int i = tileX + 1;
				for(int j = tileY - 1; j < tileY + 2; j++)
				{
					for(int k = tileZ - 1; k < tileZ + 2; k++)
					{
						smashIntoBlock(i, j, k);
					}
				}
			}
			if(-motionX > motionZ && -motionX > -motionZ && -motionX > motionY && -motionX > -motionY) //Moving in -x
			{
				int i = tileX - 1;
				for(int j = tileY - 1; j < tileY + 2; j++)
				{
					for(int k = tileZ - 1; k < tileZ + 2; k++)
					{
						smashIntoBlock(i, j, k);
					}
				}
			}
			if(motionZ > motionX && motionZ > -motionX && motionZ > motionY && motionZ > -motionY) //Moving in +z
			{
				int k = tileZ + 1;
				for(int i = tileX - 1; i < tileX + 2; i++)
				{
					for(int j = tileY - 1; j < tileY + 2; j++)
					{
						smashIntoBlock(i, j, k);
					}
				}
			}
			if(-motionZ > motionX && -motionZ > -motionX && -motionZ > motionY && -motionZ > -motionY) //Moving in -z
			{
				int k = tileZ - 1;
				for(int i = tileX - 1; i < tileX + 2; i++)
				{
					for(int j = tileY - 1; j < tileY + 2; j++)
					{
						smashIntoBlock(i, j, k);
					}
				}
			}
			if(motionY > motionX && motionY > -motionX && motionY > motionZ && motionY > -motionZ) //Moving in +y
			{
				int j = tileY + 1;
				for(int i = tileX - 1; i < tileX + 2; i++)
				{
					for(int k = tileZ - 1; k < tileZ + 2; k++)
					{
						smashIntoBlock(i, j, k);
					}
				}
			}
			if(-motionY > motionX && -motionY > -motionX && -motionY > motionZ && -motionY > -motionZ) //Moving in -y
			{
				int j = tileY - 1;
				for(int i = tileX - 1; i < tileX + 2; i++)
				{
					for(int k = tileZ - 1; k < tileZ + 2; k++)
					{
						smashIntoBlock(i, j, k);
					}
				}
			}
        }
		
		if(FlansMod.controlMode == 0 && Math.abs(axes.getRoll()) > 10F)
		{
			velocityRoll += axes.getRoll() / 10F;
		}
		
		//More movement
		
		rotateYaw(velocityYaw);
		rotatePitch(velocityPitch);
		rotateRoll(velocityRoll);
		
		moveEntity(motionX, motionY, motionZ);
		
		rotationYaw = axes.getYaw();
		rotationPitch = axes.getPitch();
		
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
		
		//Sounds
		
		if (propSpeed > 0.2D && propSpeed < 1 && soundPosition == 0)
		{
			if(riddenByEntity != null && riddenByEntity == mc.thePlayer)
			{
				try {
					mc.sndManager.playSoundFX(type.startSound, 1.0F, 1.0F);
				}
				catch(Exception e)
				{
					FlansMod.log("Failed to play sound : " + type.startSound);
				}
			}
			else worldObj.playSoundAtEntity(this, type.startSound, 1.0F , 1.0F);
			soundPosition = type.startSoundLength;
		}
			
		if (propSpeed > 1 && soundPosition == 0)
		{
			if(riddenByEntity != null && riddenByEntity == mc.thePlayer)
			{
				try {
					mc.sndManager.playSoundFX(type.propSound, 1.0F, 1.0F);
				}
				catch(Exception e)
				{
					FlansMod.log("Failed to play sound : " + type.propSound);
				}
			}
			else worldObj.playSoundAtEntity(this, type.propSound, 1.0F , 1.0F);
			soundPosition = type.propSoundLength;
		}
		
		if(soundPosition > 0)
			soundPosition--;
		
		//Damage plane
		if(health < type.health / 4)
		{
			if(health > 0 && rand.nextInt(20 * health) == 0)
			{
				//Blow up a propeller!
				int propNum = rand.nextInt(type.numProps);
				if(!propBlown[propNum])
				{
					propBlown[propNum] = true;
					Vec3 propVec = rotate((double)(type.propellerX[propNum]) / 16D, (double)(type.propellerY[propNum]) / 16D, (double)(type.propellerZ[propNum]) / 16D);
					if(FlansMod.explosions)
						worldObj.createExplosion(this, posX + propVec.xCoord, posY + propVec.yCoord, posZ + propVec.zCoord, 1F);
				}
			}
			for(int i = 0; i < type.numProps; i++)
			{
				if(propBlown[i])
				{
					for(int j = 0; j < 3; j++)
					{				
						Vec3 propVec = rotate((double)(type.propellerX[i]) / 16D, (double)(type.propellerY[i]) / 16D, (double)(type.propellerZ[i]) / 16D);
						worldObj.spawnParticle("smoke", posX + propVec.xCoord + rand.nextGaussian(), posY + propVec.yCoord + rand.nextGaussian(), posZ + propVec.zCoord + rand.nextGaussian(), 0D, 0D, 0D);
					}
				}
			}
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
	
	public void useGun(int gunID, EntityPlayer player, EntityPassengerSeat seat)
	{
	}
	
	public void updateCollisionBox(EntityCollisionBox box)
	{
		if(tailHealth <= 0 && box.part == 3)
			box.setDead();
		if(rightWingHealth <= 0 && box.part == 2)
			box.setDead();
		if(leftWingHealth <= 0 && box.part == 1)
			box.setDead();
		//Particles!
		if((tailHealth < type.health / 4 && box.part == 3)
		|| (rightWingHealth < type.health / 4 && box.part == 2)
		|| (leftWingHealth < type.health / 4 && box.part == 1))
		{
			for(int j = 0; j < 5; j++)
			{				
				worldObj.spawnParticle("smoke", box.posX + rand.nextGaussian() / 4D, box.posY + rand.nextGaussian() / 4D, box.posZ + rand.nextGaussian() / 4D, 0D, 0D, 0D);
			}
		}
		Vec3 vec = rotate(box.x / 16D, box.y / 16D, box.z / 16D);
		box.setPosition(posX + vec.xCoord, posY + vec.yCoord, posZ + vec.zCoord);
		box.motionX = box.posX - box.prevPosX;
		box.motionY = box.posY - box.prevPosY;
		box.motionZ = box.posZ - box.prevPosZ;
		//Collision for takeoff
		int tileX = MathHelper.floor_double(box.posX + 0.5D);
		int tileY = MathHelper.floor_double(box.posY + 0.5D);
		int tileZ = MathHelper.floor_double(box.posZ + 0.5D);	
		if((box.part == 0 || box.part == 3) && Math.abs(motionY) < 0.2D && propSpeed > 1F)
		{
			Block block = Block.blocksList[worldObj.getBlockId(tileX, MathHelper.floor_double(box.boundingBox.minY), tileZ)];
			if(block != null && block.blockMaterial.isSolid())
				motionY += 0.1D;
			block = Block.blocksList[worldObj.getBlockId(tileX, MathHelper.floor_double(box.boundingBox.maxY), tileZ)];
			if(block != null && block.blockMaterial.isSolid())
				motionY -= 0.1D;		
		}
		//Hurtful collision
		else
		{
			box.inBlock = worldObj.getBlockId(tileX, tileY, tileZ) != 0;
			smashIntoBlock(tileX, tileY, tileZ);
			if(box.motionX * box.motionX + box.motionY * box.motionY + box.motionZ * box.motionZ > 0.25D)
			{
				if(box.motionX > box.motionZ && box.motionX > -box.motionZ && box.motionX > box.motionY && box.motionX > -box.motionY) //Moving in +x
				{
					int i = tileX + 1;
					for(int j = tileY - 1; j < tileY + 2; j++)
					{
						for(int k = tileZ - 1; k < tileZ + 2; k++)
						{
							box.smashIntoBlock(i, j, k);
						}
					}
				}
				if(-box.motionX > box.motionZ && -box.motionX > -box.motionZ && -box.motionX > box.motionY && -box.motionX > -box.motionY) //Moving in -x
				{
					int i = tileX - 1;
					for(int j = tileY - 1; j < tileY + 2; j++)
					{
						for(int k = tileZ - 1; k < tileZ + 2; k++)
						{
							box.smashIntoBlock(i, j, k);
						}
					}
				}
				if(box.motionZ > box.motionX && box.motionZ > -box.motionX && box.motionZ > box.motionY && box.motionZ > -box.motionY) //Moving in +z
				{
					int k = tileZ + 1;
					for(int i = tileX - 1; i < tileX + 2; i++)
					{
						for(int j = tileY - 1; j < tileY + 2; j++)
						{
							box.smashIntoBlock(i, j, k);
						}
					}
				}
				if(-box.motionZ > box.motionX && -box.motionZ > -box.motionX && -box.motionZ > box.motionY && -box.motionZ > -box.motionY) //Moving in -z
				{
					int k = tileZ - 1;
					for(int i = tileX - 1; i < tileX + 2; i++)
					{
						for(int j = tileY - 1; j < tileY + 2; j++)
						{
							box.smashIntoBlock(i, j, k);
						}
					}
				}
				if(box.motionY > box.motionX && box.motionY > -box.motionX && box.motionY > box.motionZ && box.motionY > -box.motionZ) //Moving in +y
				{
					int j = tileY + 1;
					for(int i = tileX - 1; i < tileX + 2; i++)
					{
						for(int k = tileZ - 1; k < tileZ + 2; k++)
						{
							box.smashIntoBlock(i, j, k);
						}
					}
				}
				if(-box.motionY > box.motionX && -box.motionY > -box.motionX && -box.motionY > box.motionZ && -box.motionY > -box.motionZ) //Moving in -y
				{
					int j = tileY - 1;
					for(int i = tileX - 1; i < tileX + 2; i++)
					{
						for(int k = tileZ - 1; k < tileZ + 2; k++)
						{
							box.smashIntoBlock(i, j, k);
						}
					}
				}
			}
			//Entity Collision
			List list = worldObj.getEntitiesWithinAABBExcludingEntity(box, box.boundingBox);
			if(list != null && list.size() > 0)
			{
				for(int j1 = 0; j1 < list.size(); j1++)
				{
					Entity entity = (Entity)list.get(j1);
					if(!isPartOfThis(entity) && entity.canBePushed())
					{
						int damage = (int)((box.motionX * box.motionX + box.motionY * box.motionY + box.motionZ * box.motionZ) * 10D);
						if(damage > 1 && entity != mc.thePlayer) //Player check only for single player
						{
							entity.attackEntityFrom(new EntityDamageSource("plane", box), damage);
							box.attackEntityFrom(new EntityDamageSource("entity", box), damage);
						}
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
			Vec3 vec = rotate(type.pilotX / 16D, getMountedYOffset() + riddenByEntity.getYOffset() + type.pilotY / 16D, type.pilotZ / 16D);
            riddenByEntity.setPosition(posX + vec.xCoord, posY + vec.yCoord, posZ + vec.zCoord);
			if(FlansMod.controlMode == 1)
			{
				riddenByEntity.prevRotationYaw = riddenByEntity.rotationYaw;
				riddenByEntity.prevRotationPitch = riddenByEntity.rotationPitch;
				riddenByEntity.rotationYaw = -axes.getYaw();
				riddenByEntity.rotationPitch = axes.getPitch();
				double dYaw = riddenByEntity.rotationYaw - riddenByEntity.prevRotationYaw;
				if(dYaw > 180)
					riddenByEntity.prevRotationYaw += 360F;
				if(dYaw < -180)
					riddenByEntity.prevRotationYaw -= 360F;
			}
			else
			{
				riddenByEntity.rotationYaw -= 2F * (axes.getYaw() - prevRotationYaw);
			}
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
					mc.effectRenderer.addBlockHitEffects(i, j, k, 1);
					block.dropBlockAsItem(worldObj, i, j, k, meta, 1);
					mc.sndManager.playSound(block.stepSound.getBreakSound(), (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, (block.stepSound.getVolume() + 1.0F) / 2.0F, block.stepSound.getPitch() * 0.8F);
					velocityYaw += rand.nextFloat() * 1F - 0.5F;
					velocityPitch += rand.nextFloat() * 1F - 0.5F;
					velocityRoll += rand.nextFloat() * 1F - 0.5F;
				}
			}
		}
	}

    protected void writeEntityToNBT(NBTTagCompound tag)
    {
		tag.setInteger("DataID", dataID);
		data.writeToNBT(tag);
		tag.setString("Type", type.shortName);
		tag.setFloat("RotationYaw2", -axes.getYaw());
		tag.setFloat("RotationPitch2", axes.getPitch());
		tag.setFloat("RotationRoll2", axes.getRoll());
		tag.setInteger("Health", health);
 		tag.setInteger("LeftWingHealth", leftWingHealth);
 		tag.setInteger("RightWingHealth", rightWingHealth);
 		tag.setInteger("TailHealth", tailHealth);
		for(int i = 0; i < propBlown.length; i++)
		{
			tag.setBoolean("PropBlown " + i, propBlown[i]);
		}
    }

    protected void readEntityFromNBT(NBTTagCompound tag)
    {
		type = PlaneType.getPlane(tag.getString("Type"));
		initType();
		//TODO : Should be obtained through world?
		dataID = tag.getInteger("DataID");
		data = new PlaneData("plane_" + dataID, type);
		data.readFromNBT(tag);
		superData = data;
		superType = type;
		prevRotationYaw = tag.getFloat("RotationYaw2");
		prevRotationPitch = tag.getFloat("RotationPitch2");
		prevRotationRoll = tag.getFloat("RotationRoll2");
		axes = new RotatedAxes(prevRotationYaw, prevRotationPitch, prevRotationRoll);
		health = tag.getInteger("Health");
		leftWingHealth = tag.getInteger("LeftWingHealth");
		rightWingHealth = tag.getInteger("RightWingHealth");
		tailHealth = tag.getInteger("TailHealth");
		for(int i = 0; i < propBlown.length; i++)
		{
			propBlown[i] = tag.getBoolean("PropBlown " + i);
		}
    }

    public boolean interact(EntityPlayer entityplayer)
    {
		if(worldObj.isRemote || isDead)
			return true;
		if(entityplayer == riddenByEntity)
		{
			//entityplayer.mountEntity(this);
			return false;
		}
		if(canSit(0))
		{
			entityplayer.mountEntity(this);
			bombDelay = type.planeBombDelay;
			if(!FlansMod.doneTutorial)
			{
				FlansMod.doneTutorial = true;
				//mc.ingameGUI.addChatMessage("Press " + Keyboard.getKeyName(mod_Flan.inventoryKey) + " to open the menu");
				//mc.ingameGUI.addChatMessage("Press " + Keyboard.getKeyName(mod_Flan.exitKey) + " to get out");
				//mc.ingameGUI.addChatMessage("Press " + Keyboard.getKeyName(mod_Flan.controlSwitchKey) + " to switch controls");				
			}
			return false;
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
	
	public PlaneType type;
	public PlaneData data;
	
	//Damage handling
	public boolean[] propBlown;
	public int tailHealth;
	public int leftWingHealth;
	public int rightWingHealth;
	
	//Weaponry
	public int bombDelay;
	public int gunDelay;
	
	public int soundPosition;
	public float flapsYaw;
	public float flapsPitchLeft;
	public float flapsPitchRight;
	public float propAngle;
	public double propSpeed;
	public boolean tailOnGround;
	private boolean spawnedEntities;
}
