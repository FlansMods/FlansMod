package co.uk.flansmods.common.guns;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.ReportedException;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import org.lwjgl.input.Mouse;

import com.google.common.collect.Multimap;

import co.uk.flansmods.client.FlansModClient;
import co.uk.flansmods.client.model.GunAnimations;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.FlansModPlayerData;
import co.uk.flansmods.common.FlansModPlayerHandler;
import co.uk.flansmods.common.InfoType;
import co.uk.flansmods.common.driveables.EntitySeat;
import co.uk.flansmods.common.network.PacketGunFire;
import co.uk.flansmods.common.network.PacketPlaySound;
import co.uk.flansmods.common.network.PacketReload;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.network.Player;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemGun extends Item
{
	public GunType type;
	private static boolean mouseHeld;
	private static boolean lastMouseHeld;
	public int soundDelay;

	public ItemGun(int i, GunType gun)
	{
		super(i);
		maxStackSize = 1;
		type = gun;
		type.item = this;
		setMaxDamage(type.numAmmoItemsInGun);
		setCreativeTab(FlansMod.tabFlanGuns);
	}
	
	@Override
	/** Make sure client and server side NBTtags update */
	public boolean getShareTag()
	{
		return true;
	}
	
	/** Return the currently active scope on this gun. Search attachments, and by default, simply give the gun */
	public IScope getCurrentScope(ItemStack gunStack)
	{
		return type;
	}
	
	/** Get the bullet item stack stored in the gun's NBT data (the loaded magazine / bullets) */
	public ItemStack getBulletItemStack(ItemStack gun, int id)
	{
		//If the gun has no tags, give it some
		if(!gun.hasTagCompound())
		{
			gun.stackTagCompound = new NBTTagCompound("tag");
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
		NBTTagList ammoTagsList = gun.stackTagCompound.getTagList("ammo");
		//Get the specific ammo tags required
		NBTTagCompound ammoTags = (NBTTagCompound)ammoTagsList.tagAt(id);
		//If the ammo tags have no id key, then there is no ammo stack
		if(!ammoTags.hasKey("id"))
			return null;
		//If all is well, get the stack from the tags
		return new ItemStack(ammoTags.getShort("id"), ammoTags.getShort("num"), ammoTags.getShort("dam"));
	}
	
	/** Set the bullet item stack stored in the gun's NBT data (the loaded magazine / bullets) */
	public void setBulletItemStack(ItemStack gun, ItemStack bullet, int id)
	{
		//If the gun has no tags, give it some
		if(!gun.hasTagCompound())
		{
			gun.stackTagCompound = new NBTTagCompound("tag");
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
		NBTTagList ammoTagsList = gun.stackTagCompound.getTagList("ammo");
		//Get the specific ammo tags required
		NBTTagCompound ammoTags = (NBTTagCompound)ammoTagsList.tagAt(id);
		//Represent empty slots by nulltypes
		if(bullet == null)
		{
			ammoTags.removeTag("id");
			ammoTags.removeTag("num");
			ammoTags.removeTag("dam");
		}
		//Set the tags to match the bullet stack
		ammoTags.setShort("id", (short)bullet.itemID);
		ammoTags.setShort("num", (short)bullet.stackSize);
		ammoTags.setShort("dam", (short)bullet.getItemDamage());
	}

	@Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean advancedTooltips) 
	{
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
			lastMouseHeld = mouseHeld;
			mouseHeld = Mouse.isButtonDown(1);
			if (type.deployable)
			{
				return;
			}
			if(mouseHeld && !lastMouseHeld) //Send packet when firing a semi or starting to fire a full
			{
				PacketDispatcher.sendPacketToServer(PacketGunFire.buildGunFirePacket(true));
				clientSideShoot((EntityPlayer)entity, itemstack);
			}
			if(type.mode == EnumFireMode.FULLAUTO && !mouseHeld && lastMouseHeld) //Full auto. Send released mouse packet
			{
				PacketDispatcher.sendPacketToServer(PacketGunFire.buildGunFirePacket(false));
			}
			if(type.mode == EnumFireMode.FULLAUTO && mouseHeld)
			{
				clientSideShoot((EntityPlayer)entity, itemstack);
			}
			GameSettings gameSettings = FMLClientHandler.instance().getClient().gameSettings;
			IScope currentScope = getCurrentScope(itemstack);
			if(Mouse.isButtonDown(0) && FlansModClient.scopeTime <= 0 && FMLClientHandler.instance().getClient().currentScreen == null)
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
			
			if(FMLClientHandler.instance().getClient().currentScreen != null && FlansModClient.currentScope != null)
			{
				FlansModClient.currentScope = null;
				gameSettings.mouseSensitivity = FlansModClient.originalMouseSensitivity;
				gameSettings.thirdPersonView = FlansModClient.originalThirdPerson;
				gameSettings.fovSetting = FlansModClient.originalFOV;
			}
		}
		if (soundDelay > 0)
		{
			soundDelay--;
		}
	}
	
	public void clientSideShoot(EntityPlayer player, ItemStack stack)
	{
		if(FlansModClient.shootTime <= 0)
		{
			boolean hasAmmo = false;
			for(int i = 0; i < type.numAmmoItemsInGun; i++)
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
				if(FlansModClient.gunAnimations.containsKey(player))
					animations = FlansModClient.gunAnimations.get(player);
				else 
				{
					animations = new GunAnimations();
					FlansModClient.gunAnimations.put((EntityLivingBase)player, animations);
				}
				animations.lastGunSlide = animations.gunSlide = 1F;
				FlansModClient.playerRecoil += type.recoil;
				FlansModClient.shootTime = type.shootDelay;
			}
		}
	}
	
	public void onUpdateServer(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
	{
		if(entity instanceof EntityPlayerMP)
		{
			EntityPlayerMP player = (EntityPlayerMP)entity;
			FlansModPlayerData data = FlansModPlayerHandler.getPlayerData(player);
			if(player.inventory.getCurrentItem() != itemstack)
			{
				//If the player is no longer holding a gun, emulate a release of the shoot button
				if(player.inventory.getCurrentItem() == null || player.inventory.getCurrentItem().getItem() == null || !(player.inventory.getCurrentItem().getItem() instanceof ItemGun))
				{
					data.isShooting = false;
				}
				return;
			}
			if(type.mode == EnumFireMode.FULLAUTO && data.isShooting)
			{
				tryToShoot(itemstack, world, player);
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
	 
	
	public ItemStack onMouseHeld(ItemStack stack, World world, EntityPlayerMP player, boolean isShooting)
	{
		FlansModPlayerData data = FlansModPlayerHandler.getPlayerData(player);
		if(data.shootClickDelay == 0)
		{
			//Drivers can't shoot
			if(player.ridingEntity instanceof EntitySeat && ((EntitySeat)player.ridingEntity).seatInfo.id == 0)
				return stack;
			data.isShooting = isShooting;
			if(type.mode == EnumFireMode.SEMIAUTO && isShooting)
			{
				data.isShooting = false;
				return tryToShoot(stack, world, player);
			}
		}
		return stack;
	}
		
	public ItemStack tryToShoot(ItemStack gunStack, World world, EntityPlayerMP entityplayer)
	{
		if(type.deployable)
			return gunStack;
		FlansModPlayerData data = FlansModPlayerHandler.getPlayerData(entityplayer);
		//Shoot delay ticker is at (or below) 0. Try and shoot the next bullet
		if(data.shootTime <= 0)
		{
			//Go through the bullet stacks in the gun and see if any of them are not null
			int bulletID = 0;
			ItemStack bulletStack = null;
			for(; bulletID < type.numAmmoItemsInGun; bulletID++)
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
				if(reload(gunStack, world, entityplayer, false))
				{
					//Set player shoot delay to be the reload delay
					data.shootTime = type.reloadTime;
					//Send reload packet to induce reload effects client side
					PacketDispatcher.sendPacketToPlayer(PacketReload.buildReloadPacket(), (Player)entityplayer);
					//Play reload sound
					if(type.reloadSound != null)
						PacketDispatcher.sendPacketToAllAround(entityplayer.posX, entityplayer.posY, entityplayer.posZ, 50, entityplayer.dimension, PacketPlaySound.buildSoundPacket(entityplayer.posX, entityplayer.posY, entityplayer.posZ, type.reloadSound, true));
				}
			}
			//A bullet stack was found, so try shooting with it
			else if(bulletStack.getItem() instanceof ItemBullet)
			{
				//Shoot
				BulletType bulletType = ((ItemBullet)bulletStack.getItem()).type;
				shoot(gunStack, world, bulletType, entityplayer);
				//Damage the bullet item
				bulletStack.setItemDamage(bulletStack.getItemDamage() + 1);
				
				//Update the stack in the gun
				setBulletItemStack(gunStack, bulletStack, bulletID);
			}
		}
		return gunStack;
	}
	
	/** Reload method. Called automatically when firing with an empty clip */
	public boolean reload(ItemStack gunStack, World world, EntityPlayer player, boolean forceReload)
	{
		return reload(gunStack, world, player, player.inventory, player.capabilities.isCreativeMode, forceReload);
	}
	
	/** Reload method. Called automatically when firing with an empty clip */
	public boolean reload(ItemStack gunStack, World world, Entity entity, IInventory inventory, boolean creative, boolean forceReload)
	{
		//Deployable guns cannot be reloaded in the inventory
		if(type.deployable)
			return false;
		//If you cannot reload half way through a clip, reject the player for trying to do so
		if(forceReload && !type.canForceReload)
			return false;
		//For playing sounds afterwards
		boolean reloadedSomething = false;
		//Check each ammo slot, one at a time
		for(int i = 0; i < type.numAmmoItemsInGun; i++)
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
					if (item != null && item.getItem() instanceof ItemBullet && type.isAmmo(((ItemBullet)(item.getItem())).type))
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
	private void shoot(ItemStack stack, World world, BulletType bullet, EntityPlayer entityplayer)
	{
		// Play a sound if the previous sound has finished
		if (soundDelay <= 0 && type.shootSound != null)
		{
			//world.playSoundAtEntity(entityplayer, type.shootSound, 10F, type.distortSound ? 1.0F / (world.rand.nextFloat() * 0.4F + 0.8F) : 1.0F);
			PacketDispatcher.sendPacketToAllAround(entityplayer.posX, entityplayer.posY, entityplayer.posZ, 50, entityplayer.dimension, PacketPlaySound.buildSoundPacket(entityplayer.posX, entityplayer.posY, entityplayer.posZ, type.shootSound, type.distortSound));
			soundDelay = type.shootSoundLength;
		}
		if (!world.isRemote)
		{
			// Spawn the bullet entities
			for (int k = 0; k < type.numBullets; k++)
			{
				world.spawnEntityInWorld(new EntityBullet(world, entityplayer, (entityplayer.isSneaking() ? 0.7F : 1F) * type.bulletSpread, type.damage, bullet, type.bulletSpeed, type.numBullets > 1, type));
			}
			// Drop item on shooting if bullet requires it
			if(bullet.dropItemOnShoot != null && !entityplayer.capabilities.isCreativeMode)
				dropItem(world, entityplayer, bullet.dropItemOnShoot);
		}
		FlansModPlayerHandler.getPlayerData(entityplayer).shootTime = type.shootDelay;
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
	        MovingObjectPosition look = world.clip(posVec, lookVec, true);
	        
	        //Result check
			if (look != null && look.typeOfHit == EnumMovingObjectType.TILE)
			{
				if (look.sideHit == 1)
				{
					int playerDir = MathHelper.floor_double(((entityplayer.rotationYaw * 4F) / 360F) + 0.5D) & 3;
					int i = look.blockX;
					int j = look.blockY;
					int k = look.blockZ;
					if (!world.isRemote)
					{
						if (world.getBlockId(i, j, k) == Block.snow.blockID)
						{
							j--;
						}
						if (isSolid(world, i, j, k) && (world.getBlockId(i, j + 1, k) == 0 || world.getBlockId(i, j + 1, k) == Block.snow.blockID) && (world.getBlockId(i + (playerDir == 1 ? 1 : 0) - (playerDir == 3 ? 1 : 0), j + 1, k - (playerDir == 0 ? 1 : 0) + (playerDir == 2 ? 1 : 0)) == 0) && (world.getBlockId(i + (playerDir == 1 ? 1 : 0) - (playerDir == 3 ? 1 : 0), j, k - (playerDir == 0 ? 1 : 0) + (playerDir == 2 ? 1 : 0)) == 0 || world.getBlockId(i + (playerDir == 1 ? 1 : 0) - (playerDir == 3 ? 1 : 0), j, k - (playerDir == 0 ? 1 : 0) + (playerDir == 2 ? 1 : 0)) == Block.snow.blockID))
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
		return itemstack;
	}

	private boolean isSolid(World world, int i, int j, int k)
	{
		int blockID = world.getBlockId(i, j, k);
		if (blockID == 0)
			return false;
		return Block.blocksList[blockID].blockMaterial.isSolid() && Block.blocksList[blockID].isOpaqueCube();
	}

	@Override
	public float getDamageVsEntity(Entity par1Entity, ItemStack itemStack)
	{
		return type.meleeDamage;
	}
	
	@Override
    public Multimap getItemAttributeModifiers()
    {
        Multimap multimap = super.getItemAttributeModifiers();
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
		return true;//type.meleeDamage == 0 || type.hasScopeOverlay;
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
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) 
    {
    	itemIcon = icon.registerIcon("FlansMod:" + type.iconPath);
    }
    
    
}