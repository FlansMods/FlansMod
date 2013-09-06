package co.uk.flansmods.common.guns;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import org.lwjgl.input.Mouse;

import com.google.common.collect.Multimap;

import co.uk.flansmods.client.FlansModClient;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.FlansModPlayerData;
import co.uk.flansmods.common.FlansModPlayerHandler;
import co.uk.flansmods.common.InfoType;
import co.uk.flansmods.common.ItemBullet;
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
				clientSideShoot(itemstack);
			}
			if(type.mode == 1 && !mouseHeld && lastMouseHeld) //Full auto. Send released mouse packet
			{
				PacketDispatcher.sendPacketToServer(PacketGunFire.buildGunFirePacket(false));
			}
			if(type.mode == 1 && mouseHeld)
			{
				clientSideShoot(itemstack);
			}
			if (type.hasScope && Mouse.isButtonDown(0) && FlansModClient.scopeTime <= 0 && FMLClientHandler.instance().getClient().currentScreen == null)
			{
				if (FlansModClient.zoomOverlay == null)
				{
					FlansModClient.zoomOverlay = type;
					FlansModClient.newZoom = type.zoomLevel;
					float f = FlansModClient.originalMouseSensitivity = FMLClientHandler.instance().getClient().gameSettings.mouseSensitivity;
					FMLClientHandler.instance().getClient().gameSettings.mouseSensitivity = f / (float) Math.sqrt(type.zoomLevel);
					FlansModClient.originalHideGUI = FMLClientHandler.instance().getClient().gameSettings.hideGUI;
					FlansModClient.originalThirdPerson = FMLClientHandler.instance().getClient().gameSettings.thirdPersonView;
					FMLClientHandler.instance().getClient().gameSettings.hideGUI = true;
					FMLClientHandler.instance().getClient().gameSettings.thirdPersonView = 0;
				} else
				{
					FlansModClient.newZoom = 1.0F;
					FMLClientHandler.instance().getClient().gameSettings.mouseSensitivity = FlansModClient.originalMouseSensitivity;
					FMLClientHandler.instance().getClient().gameSettings.hideGUI = FlansModClient.originalHideGUI;
					FMLClientHandler.instance().getClient().gameSettings.thirdPersonView = FlansModClient.originalThirdPerson;
				}
				FlansModClient.scopeTime = 10;
			}
			
			if(FMLClientHandler.instance().getClient().currentScreen != null && FlansModClient.zoomOverlay != null && type.hasScope)
			{
				FlansModClient.newZoom = 1.0F;
				FMLClientHandler.instance().getClient().gameSettings.mouseSensitivity = FlansModClient.originalMouseSensitivity;
				FMLClientHandler.instance().getClient().gameSettings.hideGUI = FlansModClient.originalHideGUI;
				FMLClientHandler.instance().getClient().gameSettings.thirdPersonView = FlansModClient.originalThirdPerson;
			}
		}
		if (soundDelay > 0)
		{
			soundDelay--;
		}
	}
	
	public void clientSideShoot(ItemStack stack)
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
			if(type.mode == 1 && data.isShooting)
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
			data.isShooting = isShooting;
			if(type.mode == 0 && isShooting)
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
				reload(gunStack, world, entityplayer, false, false);				
			}
			//A bullet stack was found, so try shooting with it
			else if(bulletStack.getItem() instanceof ItemBullet)
			{
				//Shoot
				BulletType bulletType = ((ItemBullet)bulletStack.getItem()).type;
				shoot(world, bulletType, entityplayer);
				//Damage the bullet item
				bulletStack.setItemDamage(bulletStack.getItemDamage() + 1);
				
				//Update the stack in the gun
				setBulletItemStack(gunStack, bulletStack, bulletID);
			}
		}
		return gunStack;
	}
	
	/** Reload method. Called automatically when firing with an empty clip */
	public void reload(ItemStack gunStack, World world, EntityPlayer player, boolean forceReload, boolean instant)
	{
		//Deployable guns cannot be reloaded in the inventory
		if(type.deployable)
			return;
		//Keep the Flan's Mod player data handy
		FlansModPlayerData data = FlansModPlayerHandler.getPlayerData(player);
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
				for (int j = 0; j < player.inventory.getSizeInventory(); j++)
				{
					ItemStack item = player.inventory.getStackInSlot(j);
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
					ItemStack newBulletStack = player.inventory.getStackInSlot(bestSlot);
					BulletType newBulletType = ((ItemBullet)newBulletStack.getItem()).type;
					//Unload the old magazine (Drop an item if it is required and the player is not in creative mode)
					if(bulletStack != null && bulletStack.getItem() instanceof ItemBullet && ((ItemBullet)bulletStack.getItem()).type.dropItemOnReload != null && !player.capabilities.isCreativeMode)
						dropItem(world, player, ((ItemBullet)bulletStack.getItem()).type.dropItemOnReload);
					//The magazine was not finished, pull it out and give it back to the player or, failing that, drop it
					if(bulletStack != null && bulletStack.getItemDamage() < bulletStack.getMaxDamage())
						if(!player.inventory.addItemStackToInventory(bulletStack))
							player.entityDropItem(bulletStack, 0.5F);
					
					//Load the new magazine
					ItemStack stackToLoad = newBulletStack.copy();
					stackToLoad.stackSize = 1;
					setBulletItemStack(gunStack, stackToLoad, i);					
					
					//Remove the magazine from the inventory
					if(!player.capabilities.isCreativeMode)
						newBulletStack.stackSize--;
					if(newBulletStack.stackSize <= 0)
						newBulletStack = null;
					player.inventory.setInventorySlotContents(bestSlot, newBulletStack);
										
					//With intant reloads, we don't want to impose a delay or play reload sounds
					if(!instant)
					{
						//Tell the sound player that we reloaded something
						reloadedSomething = true;
						//Set player shoot delay to be the reload delay
						data.shootTime = type.reloadTime;
						//Send reload packet to induce reload effects client side
						PacketDispatcher.sendPacketToPlayer(PacketReload.buildReloadPacket(), (Player)player);
					}
				}
			}
		}
		//Play reload sound
		if (reloadedSomething && type.reloadSound != null)
			PacketDispatcher.sendPacketToAllAround(player.posX, player.posY, player.posZ, 50, player.dimension, PacketPlaySound.buildSoundPacket(player.posX, player.posY, player.posZ, type.reloadSound, true));

	}

	/** Method for dropping items on reload and on shoot */
	private void dropItem(World world, EntityPlayer entityplayer, String itemName)
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
			entityplayer.entityDropItem(dropStack, 0.5F);
		}
	}

	/** Method for shooting to avoid repeated code */
	private void shoot(World world, BulletType bullet, EntityPlayer entityplayer)
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
				world.spawnEntityInWorld(new EntityBullet(world, entityplayer, (entityplayer.isSneaking() ? 0.7F : 1F) * type.accuracy, type.damage, bullet, type.speed, type.numBullets > 1, type));
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
	        Vec3 posVec = Vec3.createVectorHelper(entityplayer.posX, entityplayer.posY + 1.62D - (double)entityplayer.yOffset, entityplayer.posZ);        
	        Vec3 lookVec = posVec.addVector(sinYaw * cosPitch * length, sinPitch * length, cosYaw * cosPitch * length);
	        MovingObjectPosition look = world.clip(posVec, lookVec, true);
	        
	        //Result check
			if (look != null && look.typeOfHit == EnumMovingObjectType.TILE)
			{
				if (look.sideHit == 1)
				{
					int playerDir = MathHelper.floor_double((double) ((entityplayer.rotationYaw * 4F) / 360F) + 0.5D) & 3;
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
		return type.meleeDamage == 0 || type.hasScope;
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