package com.flansmod.common.guns;

import java.util.HashMap;
import java.util.List;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.network.PacketGunFire;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.network.PacketReload;
import com.flansmod.common.types.InfoType;
import com.google.common.collect.Multimap;

public class ItemGun extends Item
{
	public GunType type;
	private static boolean rightMouseHeld;
	private static boolean lastRightMouseHeld;
	private static boolean leftMouseHeld;
	private static boolean lastLeftMouseHeld;
	public int soundDelay;
	
	public HashMap<String, IIcon> icons = new HashMap<String, IIcon>();

	public ItemGun(GunType gun)
	{
		maxStackSize = 1;
		type = gun;
		type.item = this;
		setMaxDamage(type.numAmmoItemsInGun);
		setCreativeTab(FlansMod.tabFlanGuns);
		GameRegistry.registerItem(this, type.shortName, FlansMod.MODID);
	}
	
	@Override
	/** Make sure client and server side NBTtags update */
	public boolean getShareTag()
	{
		return true;
	}
		
	/** Get the bullet item stack stored in the gun's NBT data (the loaded magazine / bullets) */
	public ItemStack getBulletItemStack(ItemStack gun, int id)
	{
		//If the gun has no tags, give it some
		if(!gun.hasTagCompound())
		{
			gun.stackTagCompound = new NBTTagCompound();
			return null;
		}
		//If the gun has no ammo tags, give it some
		if(!gun.stackTagCompound.hasKey("ammo"))
		{
			NBTTagList ammoTagsList = new NBTTagList();
			for(int i = 0; i < type.numAmmoItemsInGun; i++)
			{
				ammoTagsList.appendTag(new NBTTagCompound());
			}
			gun.stackTagCompound.setTag("ammo", ammoTagsList);
			return null;
		}
		//Take the list of ammo tags
		NBTTagList ammoTagsList = gun.stackTagCompound.getTagList("ammo", Constants.NBT.TAG_COMPOUND);
		//Get the specific ammo tags required
		NBTTagCompound ammoTags = (NBTTagCompound)ammoTagsList.getCompoundTagAt(id);
		return ItemStack.loadItemStackFromNBT(ammoTags);
	}
	
	/** Set the bullet item stack stored in the gun's NBT data (the loaded magazine / bullets) */
	public void setBulletItemStack(ItemStack gun, ItemStack bullet, int id)
	{
		//If the gun has no tags, give it some
		if(!gun.hasTagCompound())
		{
			gun.stackTagCompound = new NBTTagCompound();
		}
		//If the gun has no ammo tags, give it some
		if(!gun.stackTagCompound.hasKey("ammo"))
		{
			NBTTagList ammoTagsList = new NBTTagList();
			for(int i = 0; i < type.numAmmoItemsInGun; i++)
			{
				ammoTagsList.appendTag(new NBTTagCompound());
			}
			gun.stackTagCompound.setTag("ammo", ammoTagsList);
		}
		//Take the list of ammo tags
		NBTTagList ammoTagsList = gun.stackTagCompound.getTagList("ammo", Constants.NBT.TAG_COMPOUND);
		//Get the specific ammo tags required
		NBTTagCompound ammoTags = (NBTTagCompound)ammoTagsList.getCompoundTagAt(id);
		//Represent empty slots by nulltypes
		if(bullet == null)
		{
			ammoTags = new NBTTagCompound();
		}
		//Set the tags to match the bullet stack
		bullet.writeToNBT(ammoTags);
	}

	@Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean advancedTooltips) 
	{
		for(AttachmentType attachment : type.getCurrentAttachments(stack))
		{
			String line = attachment.name;
			lines.add(line);
		}
		for(int i = 0; i < type.numAmmoItemsInGun; i++)
		{
			ItemStack bulletStack = getBulletItemStack(stack, i);
			if(bulletStack != null && bulletStack.getItem() instanceof ItemBullet)
			{
				BulletType bulletType = ((ItemBullet)bulletStack.getItem()).type;					
				//String line = bulletType.name + (bulletStack.getMaxDamage() == 1 ? "" : " " + (bulletStack.getMaxDamage() - bulletStack.getItemDamage()) + "/" + bulletStack.getMaxDamage());
				String line = bulletType.name + " " + (bulletStack.getMaxDamage() - bulletStack.getItemDamage()) + "/" + bulletStack.getMaxDamage();
				lines.add(line);
			}
		}
	}
	
	@SideOnly(Side.CLIENT)
	public void onUpdateClient(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
	{
		if(entity instanceof EntityPlayer && ((EntityPlayer)entity).inventory.getCurrentItem() == itemstack)
		{			
			//Get useful objects
			Minecraft mc = Minecraft.getMinecraft();
			EntityPlayer player = (EntityPlayer)entity;
			PlayerData data = PlayerHandler.getPlayerData(player, Side.CLIENT);
			
			//Play idle sounds
			if (soundDelay <= 0 && type.idleSound != null)
			{
				PacketPlaySound.sendSoundPacket(entity.posX, entity.posY, entity.posZ, FlansMod.soundRange, entity.dimension, type.idleSound, false);
				soundDelay = type.idleSoundLength;
			}
			
			//This code is not for deployables
			if (type.deployable)
				return;
			
			GameSettings gameSettings = FMLClientHandler.instance().getClient().gameSettings;
			//If in a GUI
			if(FMLClientHandler.instance().getClient().currentScreen != null)
			{
				if(FlansModClient.currentScope != null)
				{
					FlansModClient.currentScope = null;
					gameSettings.mouseSensitivity = FlansModClient.originalMouseSensitivity;
					gameSettings.thirdPersonView = FlansModClient.originalThirdPerson;
					gameSettings.fovSetting = FlansModClient.originalFOV;
				}	
			}
			//Else do shoot code
			else 
			{
				//Get whether mice are held
				lastRightMouseHeld = rightMouseHeld;
				lastLeftMouseHeld = leftMouseHeld;
				rightMouseHeld = Mouse.isButtonDown(1);
				leftMouseHeld = Mouse.isButtonDown(0);
				
				boolean offHandFull = false;
				
				//Off hand item
				if(type.oneHanded) 
				{
					if(data.offHandGunSlot == player.inventory.currentItem + 1)
						data.offHandGunSlot = 0;
					//Cycle selection
					int dWheel = Mouse.getDWheel();
					if(Keyboard.isKeyDown(mc.gameSettings.keyBindSneak.getKeyCode()) && dWheel != 0)
					{
						data.cycleOffHandItem(player, dWheel);
					}
					
					if(data.offHandGunSlot != 0)
					{
						offHandFull = true;
						ItemStack offHandGunStack = player.inventory.getStackInSlot(data.offHandGunSlot - 1);
						GunType offHandGunType = ((ItemGun)offHandGunStack.getItem()).type;
						
						//Send packet when firing a semi or starting to fire a full
						if(leftMouseHeld && !lastLeftMouseHeld) 
						{
							FlansMod.getPacketHandler().sendToServer(new PacketGunFire(true, true));
							clientSideShoot((EntityPlayer)entity, offHandGunStack, offHandGunType, true);
						}
						if((offHandGunType.mode == EnumFireMode.FULLAUTO || offHandGunType.mode == EnumFireMode.MINIGUN) && !leftMouseHeld && lastLeftMouseHeld) //Full auto. Send released mouse packet
						{
							FlansMod.getPacketHandler().sendToServer(new PacketGunFire(true, false));
						}
						if((offHandGunType.mode == EnumFireMode.FULLAUTO || offHandGunType.mode == EnumFireMode.MINIGUN) && leftMouseHeld)
						{
							clientSideShoot((EntityPlayer)entity, offHandGunStack, offHandGunType, true);
						}
					}
				}
				
				//Send packet when firing a semi or starting to fire a full
				if(rightMouseHeld && !lastRightMouseHeld) 
				{
					FlansMod.getPacketHandler().sendToServer(new PacketGunFire(false, true));
					clientSideShoot((EntityPlayer)entity, itemstack, type, false);
				}
				if((type.mode == EnumFireMode.FULLAUTO || type.mode == EnumFireMode.MINIGUN) && !rightMouseHeld && lastRightMouseHeld) //Full auto. Send released mouse packet
				{
					FlansMod.getPacketHandler().sendToServer(new PacketGunFire(false, false));
				}
				if((type.mode == EnumFireMode.FULLAUTO || type.mode == EnumFireMode.MINIGUN) && rightMouseHeld)
				{
					clientSideShoot((EntityPlayer)entity, itemstack, type, false);
				}
				
				IScope currentScope = type.getCurrentScope(itemstack);
				if(!offHandFull && (type.secondaryFunction == EnumSecondaryFunction.ADS_ZOOM || type.secondaryFunction == EnumSecondaryFunction.ZOOM) && Mouse.isButtonDown(0) && FlansModClient.scopeTime <= 0 && FMLClientHandler.instance().getClient().currentScreen == null)
				{
					if(FlansModClient.currentScope == null)
					{
						FlansModClient.currentScope = currentScope;
						FlansModClient.lastZoomLevel = currentScope.getZoomFactor();
						FlansModClient.lastFOVZoomLevel = currentScope.getFOVFactor();
						float f = FlansModClient.originalMouseSensitivity = gameSettings.mouseSensitivity;
						gameSettings.mouseSensitivity = f / (float) Math.sqrt(currentScope.getZoomFactor());
						FlansModClient.originalThirdPerson = gameSettings.thirdPersonView;
						gameSettings.thirdPersonView = 0;
						FlansModClient.originalFOV = gameSettings.fovSetting;
					}
					else
					{
						FlansModClient.currentScope = null;
						gameSettings.mouseSensitivity = FlansModClient.originalMouseSensitivity;
						gameSettings.thirdPersonView = FlansModClient.originalThirdPerson;
						gameSettings.fovSetting = FlansModClient.originalFOV;
					}
					FlansModClient.scopeTime = 10;
				}
			}
		}
		if (soundDelay > 0)
		{
			soundDelay--;
		}
	}
	
	public void clientSideShoot(EntityPlayer player, ItemStack stack, GunType gunType, boolean left)
	{
		if(FlansModClient.shootTime <= 0)
		{
			boolean hasAmmo = false;
			for(int i = 0; i < gunType.numAmmoItemsInGun; i++)
			{
				ItemStack bulletStack = getBulletItemStack(stack, i);
				if(bulletStack != null && bulletStack.getItem() != null && bulletStack.getItemDamage() < bulletStack.getMaxDamage())
				{
					hasAmmo = true;
					break;
				}
			}
			if(hasAmmo)
			{
				GunAnimations animations = null;
				if(left)
				{
					if(FlansModClient.gunAnimationsLeft.containsKey(player))
						animations = FlansModClient.gunAnimationsLeft.get(player);
					else 
					{
						animations = new GunAnimations();
						FlansModClient.gunAnimationsLeft.put((EntityLivingBase)player, animations);
					}
				}
				else
				{
					if(FlansModClient.gunAnimationsRight.containsKey(player))
						animations = FlansModClient.gunAnimationsRight.get(player);
					else 
					{
						animations = new GunAnimations();
						FlansModClient.gunAnimationsRight.put((EntityLivingBase)player, animations);
					}
				}
				int pumpDelay = gunType.model == null ? 0 : gunType.model.pumpDelay;
				int pumpTime = gunType.model == null ? 1 : gunType.model.pumpTime;
				animations.doShoot(pumpDelay, pumpTime);
				FlansModClient.playerRecoil += gunType.getRecoil(stack);
				FlansModClient.shootTime = gunType.shootDelay;
			}
		}
	}
	
	public void onUpdateServer(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
	{
		if(entity instanceof EntityPlayerMP)
		{
			EntityPlayerMP player = (EntityPlayerMP)entity;
			PlayerData data = PlayerHandler.getPlayerData(player);
			if(data == null)
				return;
			if(player.inventory.getCurrentItem() != itemstack)
			{
				//If the player is no longer holding a gun, emulate a release of the shoot button
				if(player.inventory.getCurrentItem() == null || player.inventory.getCurrentItem().getItem() == null || !(player.inventory.getCurrentItem().getItem() instanceof ItemGun))
				{
					data.isShootingRight = data.isShootingLeft = false;
				}
				return;
			}
			
			//Right hand gun
			if(data.isShootingRight)
			{
				//Shoot full auto weapons
				if(type.mode == EnumFireMode.FULLAUTO)
				{
					tryToShoot(itemstack, type, world, player, false);
				}
				//Play looping sounds for minigun
				if(type.useLoopingSounds && data.loopedSoundDelay <= 0 && data.minigunSpeed > 0.1F && !data.reloadingRight)
				{
					data.loopedSoundDelay = type.loopedSoundLength;
					PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, FlansMod.soundRange, player.dimension, data.shouldPlayWarmupSound ? type.warmupSound : type.loopedSound, false);
					data.shouldPlayWarmupSound = false;
				}
				//Minigun is sufficiently fast to shoot
				if(type.mode == EnumFireMode.MINIGUN && data.minigunSpeed > 15F)
					tryToShoot(itemstack, type, world, player, false);
			}
			else
			{
				if(type.useLoopingSounds && data.shouldPlayCooldownSound)
				{
					PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, FlansMod.soundRange, player.dimension, type.cooldownSound, false);
					data.shouldPlayCooldownSound = false;
				}
			}
			
			//Left hand gun
			if(type.oneHanded && data.offHandGunSlot != 0)
			{
				ItemStack offHandGunStack = player.inventory.getStackInSlot(data.offHandGunSlot - 1);
				if(offHandGunStack != null && offHandGunStack.getItem() instanceof ItemGun)
				{
					GunType offHandGunType = ((ItemGun)offHandGunStack.getItem()).type;
					
					if(data.isShootingLeft)
					{
						//Shoot full auto weapons
						if(offHandGunType.mode == EnumFireMode.FULLAUTO)
						{
							tryToShoot(offHandGunStack, offHandGunType, world, player, true);
						}
						//Play looping sounds for minigun
						if(offHandGunType.useLoopingSounds && data.loopedSoundDelay <= 0 && data.minigunSpeed > 0.1F && !data.reloadingLeft)
						{
							data.loopedSoundDelay = offHandGunType.loopedSoundLength;
							PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, FlansMod.soundRange, player.dimension, data.shouldPlayWarmupSound ? offHandGunType.warmupSound : offHandGunType.loopedSound, false);
							data.shouldPlayWarmupSound = false;
						}
						//Minigun is sufficiently fast to shoot
						if(offHandGunType.mode == EnumFireMode.MINIGUN && data.minigunSpeed > 15F)
							tryToShoot(offHandGunStack, offHandGunType, world, player, true);
					}
					else
					{
						if(offHandGunType.useLoopingSounds && data.shouldPlayCooldownSound)
						{
							PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, FlansMod.soundRange, player.dimension, offHandGunType.cooldownSound, false);
							data.shouldPlayCooldownSound = false;
						}
					}
				}
			}
		}
	}
	
	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
	{
		if(world.isRemote)
			onUpdateClient(itemstack, world, entity, i, flag);
		else onUpdateServer(itemstack, world, entity, i, flag);
	}
	 
	
	public ItemStack onMouseHeld(ItemStack stack, World world, EntityPlayerMP player, boolean left, boolean isShooting)
	{
		PlayerData data = PlayerHandler.getPlayerData(player);
		if(data != null && data.shootClickDelay == 0)
		{
			//Drivers can't shoot
			if(player.ridingEntity instanceof EntitySeat && ((EntitySeat)player.ridingEntity).seatInfo.id == 0)
				return stack;
			if(left)
			{
				ItemStack offHandGunStack = player.inventory.getStackInSlot(data.offHandGunSlot - 1);
				GunType gunType = ((ItemGun)offHandGunStack.getItem()).type;
				data.isShootingLeft = isShooting;
				if(gunType.mode == EnumFireMode.SEMIAUTO && isShooting)
				{
					data.isShootingLeft = false;
					return tryToShoot(offHandGunStack, gunType, world, player, true);
				}
			}
			else
			{
				data.isShootingRight = isShooting;
				if(type.mode == EnumFireMode.SEMIAUTO && isShooting)
				{
					data.isShootingRight = false;
					return tryToShoot(stack, type, world, player, false);
				}
			}
			//Play the warmup sound for miniguns immediately
			if(type.useLoopingSounds && isShooting)
			{
				data.shouldPlayWarmupSound = true;
			}
		}
		return stack;
	}
		
	public ItemStack tryToShoot(ItemStack gunStack, GunType gunType, World world, EntityPlayerMP entityplayer, boolean left)
	{
		if(type.deployable)
			return gunStack;
		PlayerData data = PlayerHandler.getPlayerData(entityplayer);
		//Shoot delay ticker is at (or below) 0. Try and shoot the next bullet
		if((left && data.shootTimeLeft <= 0) || (!left && data.shootTimeRight <= 0))
		{
			//Go through the bullet stacks in the gun and see if any of them are not null
			int bulletID = 0;
			ItemStack bulletStack = null;
			for(; bulletID < gunType.numAmmoItemsInGun; bulletID++)
			{
				ItemStack checkingStack = getBulletItemStack(gunStack, bulletID);
				if(checkingStack != null && checkingStack.getItem() != null && checkingStack.getItemDamage() < checkingStack.getMaxDamage())
				{
					bulletStack = checkingStack;
					break;
				}
			}
			
			//If no bullet stack was found, reload
			if(bulletStack == null)
			{
				if(reload(gunStack, gunType, world, entityplayer, false, left))
				{
					//Set player shoot delay to be the reload delay
					//Set both gun delays to avoid reloading two guns at once
					data.shootTimeRight = data.shootTimeLeft = (int)gunType.getReloadTime(gunStack);
					if(left)
						data.reloadingLeft = true;
					else data.reloadingRight = true;
					//Send reload packet to induce reload effects client side
					FlansMod.getPacketHandler().sendTo(new PacketReload(left), entityplayer);
					//Play reload sound
					if(gunType.reloadSound != null)
						PacketPlaySound.sendSoundPacket(entityplayer.posX, entityplayer.posY, entityplayer.posZ, FlansMod.soundRange, entityplayer.dimension, gunType.reloadSound, true);
				}
			}
			//A bullet stack was found, so try shooting with it
			else if(bulletStack.getItem() instanceof ItemBullet)
			{
				//Shoot
				shoot(gunStack, gunType, world, bulletStack, entityplayer, left);
				//Damage the bullet item
				bulletStack.setItemDamage(bulletStack.getItemDamage() + 1);
				
				//Update the stack in the gun
				setBulletItemStack(gunStack, bulletStack, bulletID);
			}
		}
		return gunStack;
	}
	
	/** Reload method. Called automatically when firing with an empty clip */
	public boolean reload(ItemStack gunStack, GunType gunType, World world, EntityPlayer player, boolean forceReload, boolean left)
	{
		return reload(gunStack, gunType, world, player, player.inventory, player.capabilities.isCreativeMode, forceReload);
	}
	
	/** Reload method. Called automatically when firing with an empty clip */
	public boolean reload(ItemStack gunStack, GunType gunType, World world, Entity entity, IInventory inventory, boolean creative, boolean forceReload)
	{
		//Deployable guns cannot be reloaded in the inventory
		if(gunType.deployable)
			return false;
		//If you cannot reload half way through a clip, reject the player for trying to do so
		if(forceReload && !gunType.canForceReload)
			return false;
		//For playing sounds afterwards
		boolean reloadedSomething = false;
		//Check each ammo slot, one at a time
		for(int i = 0; i < gunType.numAmmoItemsInGun; i++)
		{
			//Get the stack in the slot
			ItemStack bulletStack = getBulletItemStack(gunStack, i);
			
			//If there is no magazine, if the magazine is empty or if this is a forced reload
			if(bulletStack == null || bulletStack.getItemDamage() == bulletStack.getMaxDamage() || forceReload)
			{		
				//Iterate over all inventory slots and find the magazine / bullet item with the most bullets
				int bestSlot = -1;
				int bulletsInBestSlot = 0;
				for (int j = 0; j < inventory.getSizeInventory(); j++)
				{
					ItemStack item = inventory.getStackInSlot(j);
					if (item != null && item.getItem() instanceof ItemBullet && gunType.isAmmo(((ItemBullet)(item.getItem())).type))
					{
						int bulletsInThisSlot = item.getMaxDamage() - item.getItemDamage();
						if(bulletsInThisSlot > bulletsInBestSlot)
						{
							bestSlot = j;
							bulletsInBestSlot = bulletsInThisSlot;
						}
					}
				}
				//If there was a valid non-empty magazine / bullet item somewhere in the inventory, load it
				if(bestSlot != -1)
				{
					ItemStack newBulletStack = inventory.getStackInSlot(bestSlot);
					BulletType newBulletType = ((ItemBullet)newBulletStack.getItem()).type;
					//Unload the old magazine (Drop an item if it is required and the player is not in creative mode)
					if(bulletStack != null && bulletStack.getItem() instanceof ItemBullet && ((ItemBullet)bulletStack.getItem()).type.dropItemOnReload != null && !creative)
						dropItem(world, entity, ((ItemBullet)bulletStack.getItem()).type.dropItemOnReload);
					//The magazine was not finished, pull it out and give it back to the player or, failing that, drop it
					if(bulletStack != null && bulletStack.getItemDamage() < bulletStack.getMaxDamage())
						if(!InventoryHelper.addItemStackToInventory(inventory, bulletStack, creative))
							entity.entityDropItem(bulletStack, 0.5F);
					
					//Load the new magazine
					ItemStack stackToLoad = newBulletStack.copy();
					stackToLoad.stackSize = 1;
					setBulletItemStack(gunStack, stackToLoad, i);					
					
					//Remove the magazine from the inventory
					if(!creative)
						newBulletStack.stackSize--;
					if(newBulletStack.stackSize <= 0)
						newBulletStack = null;
					inventory.setInventorySlotContents(bestSlot, newBulletStack);
								
					
					//Tell the sound player that we reloaded something
					reloadedSomething = true;
				}
			}
		}
		return reloadedSomething;
	}

	/** Method for dropping items on reload and on shoot */
	public static void dropItem(World world, Entity entity, String itemName)
	{
		if (itemName != null)
		{
			int damage = 0;
			if (itemName.contains("."))
			{
				damage = Integer.parseInt(itemName.split("\\.")[1]);
				itemName = itemName.split("\\.")[0];
			}
			ItemStack dropStack = InfoType.getRecipeElement(itemName, damage);
			entity.entityDropItem(dropStack, 0.5F);
		}
	}
	
	/** Method for shooting to avoid repeated code */
	private void shoot(ItemStack stack, GunType gunType, World world, ItemStack bulletStack, EntityPlayer entityplayer, boolean left)
	{
		BulletType bullet = ((ItemBullet)bulletStack.getItem()).type;
		// Play a sound if the previous sound has finished
		if (soundDelay <= 0 && gunType.shootSound != null)
		{
			AttachmentType barrel = gunType.getBarrel(stack);
			boolean silenced = barrel != null && barrel.silencer;
			//world.playSoundAtEntity(entityplayer, type.shootSound, 10F, type.distortSound ? 1.0F / (world.rand.nextFloat() * 0.4F + 0.8F) : 1.0F);
			PacketPlaySound.sendSoundPacket(entityplayer.posX, entityplayer.posY, entityplayer.posZ, FlansMod.soundRange, entityplayer.dimension, gunType.shootSound, gunType.distortSound, silenced);
			soundDelay = gunType.shootSoundLength;
		}
		if (!world.isRemote)
		{
			// Spawn the bullet entities
			
			for (int k = 0; k < gunType.numBullets; k++)
			{
				world.spawnEntityInWorld(((ItemBullet)bulletStack.getItem()).getEntity(world, entityplayer, (entityplayer.isSneaking() ? 0.7F : 1F) * gunType.getSpread(stack), gunType.getDamage(stack), gunType.getBulletSpeed(stack), gunType.numBullets > 1,bulletStack.getItemDamage(), gunType));
			}
			// Drop item on shooting if bullet requires it
			if(bullet.dropItemOnShoot != null && !entityplayer.capabilities.isCreativeMode)
				dropItem(world, entityplayer, bullet.dropItemOnShoot);
		}
		if(left)
			PlayerHandler.getPlayerData(entityplayer).shootTimeLeft = gunType.shootDelay;
		else PlayerHandler.getPlayerData(entityplayer).shootTimeRight = gunType.shootDelay;
		if(gunType.knockback > 0)
		{
			//TODO : Apply knockback		
		}	
	}

	/** Deployable guns only */
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
	{
		if (type.deployable)
		{
	    	//Raytracing
	        float cosYaw = MathHelper.cos(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
	        float sinYaw = MathHelper.sin(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
	        float cosPitch = -MathHelper.cos(-entityplayer.rotationPitch * 0.01745329F);
	        float sinPitch = MathHelper.sin(-entityplayer.rotationPitch * 0.01745329F);
	        double length = 5D;
	        Vec3 posVec = Vec3.createVectorHelper(entityplayer.posX, entityplayer.posY + 1.62D - entityplayer.yOffset, entityplayer.posZ);        
	        Vec3 lookVec = posVec.addVector(sinYaw * cosPitch * length, sinPitch * length, cosYaw * cosPitch * length);
	        MovingObjectPosition look = world.rayTraceBlocks(posVec, lookVec, true);
	        
	        //Result check
			if (look != null && look.typeOfHit == MovingObjectType.BLOCK)
			{
				if (look.sideHit == 1)
				{
					int playerDir = MathHelper.floor_double(((entityplayer.rotationYaw * 4F) / 360F) + 0.5D) & 3;
					int i = look.blockX;
					int j = look.blockY;
					int k = look.blockZ;
					if (!world.isRemote)
					{
						if (world.getBlock(i, j, k) == Blocks.snow)
						{
							j--;
						}
						if (isSolid(world, i, j, k) && (world.getBlock(i, j + 1, k) == Blocks.air || world.getBlock(i, j + 1, k) == Blocks.snow) && (world.getBlock(i + (playerDir == 1 ? 1 : 0) - (playerDir == 3 ? 1 : 0), j + 1, k - (playerDir == 0 ? 1 : 0) + (playerDir == 2 ? 1 : 0)) == Blocks.air) && (world.getBlock(i + (playerDir == 1 ? 1 : 0) - (playerDir == 3 ? 1 : 0), j, k - (playerDir == 0 ? 1 : 0) + (playerDir == 2 ? 1 : 0)) == Blocks.air || world.getBlock(i + (playerDir == 1 ? 1 : 0) - (playerDir == 3 ? 1 : 0), j, k - (playerDir == 0 ? 1 : 0) + (playerDir == 2 ? 1 : 0)) == Blocks.snow))
						{
							for (EntityMG mg : EntityMG.mgs)
							{
								if (mg.blockX == i && mg.blockY == j + 1 && mg.blockZ == k && !mg.isDead)
									return itemstack;
							}
							if(!world.isRemote)
							{
								world.spawnEntityInWorld(new EntityMG(world, i, j + 1, k, playerDir, type));
							}
							if (!entityplayer.capabilities.isCreativeMode)
								itemstack.stackSize = 0;
						}
					}
				}
			}
		}
		//Stop the gun bobbing up and down when holding shoot and looking at a block
		if(world.isRemote)
		{
			for(int i = 0; i < 3; i++)
				Minecraft.getMinecraft().entityRenderer.itemRenderer.updateEquippedItem();
		}
		return itemstack;
	}

	private boolean isSolid(World world, int i, int j, int k)
	{
		Block block = world.getBlock(i, j, k);
		if (block == null)
			return false;
		return block.getMaterial().isSolid() && block.isOpaqueCube();
	}

	@Override
    public Multimap getAttributeModifiers(ItemStack stack)
    {
        Multimap multimap = super.getAttributeModifiers(stack);
        if(type.secondaryFunction == EnumSecondaryFunction.MELEE)
        	multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", type.meleeDamage, 0));
        return multimap;
    }

	@Override
	public boolean isFull3D()
	{
		return true;
	}
	
	@Override
	public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack)
	{
		if (type.meleeSound != null)
			PacketPlaySound.sendSoundPacket(entityLiving.posX, entityLiving.posY, entityLiving.posZ, FlansMod.soundRange, entityLiving.dimension, type.meleeSound, true);
		return type.secondaryFunction != EnumSecondaryFunction.MELEE;
	}
	
	@Override
    public boolean onBlockStartBreak(ItemStack itemstack, int X, int Y, int Z, EntityPlayer player)
    {
        return true;
    }

	@Override
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	return type.colour;
    }

	public boolean isItemStackDamageable()
	{
		return true;
	}
	
    @Override
    public void getSubItems(Item item, CreativeTabs tabs, List list)
    {
    	ItemStack gunStack = new ItemStack(item, 1, 0);
    	GunType type = ((ItemGun)item).type;
    	NBTTagCompound tags = new NBTTagCompound();
    	tags.setString("Paint", type.defaultPaintjob.iconName);
    	gunStack.stackTagCompound = tags;
        list.add(gunStack);
    }
	
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon) 
    {
        itemIcon = icon.registerIcon("FlansMod:" + type.iconPath);
    	for(Paintjob paintjob : type.paintjobs)
    	{
    		icons.put(paintjob.iconName, icon.registerIcon("FlansMod:" + paintjob.iconName));
    		//itemIcon = icon.registerIcon("FlansMod:" + type.iconPath);
    	}
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconIndex(ItemStack stack)
    {
    	//For backwards compatibility, give old guns the default paint job
    	if(stack.stackTagCompound == null)
    		stack.stackTagCompound = new NBTTagCompound();
    	if(!stack.stackTagCompound.hasKey("Paint"))
    		stack.stackTagCompound.setString("Paint", type.defaultPaintjob.iconName);

        return icons.get(stack.stackTagCompound.getString("Paint"));
    }
    
    @Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 100;
    }
    
    @Override
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.bow;
    }
}