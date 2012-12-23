package co.uk.flansmods.common;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import org.lwjgl.input.Mouse;

import co.uk.flansmods.client.FlansModClient;
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
		setIconIndex(gun.iconIndex);
		maxStackSize = 1;
		type = gun;
		type.item = this;
		if (type.loadIntoGun > 0)
		{
			setMaxDamage(type.loadIntoGun);
		}
		setCreativeTab(FlansMod.tabFlanGuns);
	}

	@Override
	public String getTextureFile()
	{
		return "/spriteSheets/guns.png";
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
				clientSideShoot();
			}
			if(type.mode == 1 && !mouseHeld && lastMouseHeld) //Full auto. Send released mouse packet
			{
				PacketDispatcher.sendPacketToServer(PacketGunFire.buildGunFirePacket(false));
			}
			if(type.mode == 1 && mouseHeld)
			{
				clientSideShoot();
			}
			/*
			if (type.mode == 1 && mouseHeld) // FullAuto
			{
				EntityPlayerMP player = (EntityPlayerMP) entity;
				if(!player.isInsideOfMaterial(Material.water) || type.canShootUnderwater)
					itemstack = onItemRightClick2(itemstack, world, player);
			}
			if (type.mode == 0 && mouseHeld && !lastMouseHeld) // SemiAuto
			{
				EntityPlayerMP player = (EntityPlayerMP) entity;
				if(!player.isInsideOfMaterial(Material.water) || type.canShootUnderwater) 
					itemstack = onItemRightClick2(itemstack, world, player);
			}
			*/
			if (type.hasScope && Mouse.isButtonDown(0) && FlansModClient.shootTime <= 0 && FMLClientHandler.instance().getClient().currentScreen == null)
			{
				if (FlansModClient.zoomOverlay == null)
				{
					FlansModClient.zoomOverlay = type.scope;
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
				FlansModClient.shootTime = 10;
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
	
	public void clientSideShoot()
	{
		if(FlansModClient.shootTime <= 0)
		{
			boolean hasAmmo = false;
			for(int i = 0; i < type.ammo.size(); i++)
			{
				if(FlansModClient.minecraft.thePlayer.inventory.hasItem(type.ammo.get(i).itemID))
				{
					hasAmmo = true;
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
		data.isShooting = isShooting;
		if(type.mode == 0 && isShooting)
		{
			data.isShooting = false;
			return tryToShoot(stack, world, player);
		}
		return stack;
	}
		
	public ItemStack tryToShoot(ItemStack itemstack, World world, EntityPlayerMP entityplayer)
	{
		if(type.deployable)
			return itemstack;
		FlansModPlayerData data = FlansModPlayerHandler.getPlayerData(entityplayer);
		if(data.shootTime <= 0)
		{
			if (type.loadIntoGun > 0)
			{
				BulletType bullet = type.ammo.get(0);
				int i = itemstack.getItemDamage();
				// Make sure the gun has bullets in
				if (i < type.loadIntoGun)
				{
					// Shoot
					shoot(world, bullet, entityplayer);
					if (!world.isRemote)
					{
						// Use up one bullet
						itemstack.setItemDamage(i + 1);
					}
				} else
				{
					// Reload
					// Creative mode
					if (entityplayer.capabilities.isCreativeMode)
					{
						// Reset the stack for infinite ammo
						itemstack.setItemDamage(0);
					} else
					{
						for (int j = 0; j < entityplayer.inventory.getSizeInventory(); j++)
						{
							ItemStack item = entityplayer.inventory.getStackInSlot(j);
							if (item != null && item.getItem() instanceof ItemBullet && ((ItemBullet) (item.getItem())).type == bullet)
							{
								ItemStack consumed = entityplayer.inventory.decrStackSize(j, i);
								i -= consumed.stackSize;
							}
						}
						itemstack.setItemDamage(i);
						// Drop item on reload if bullet requires it
						if(bullet.dropItemOnReload != null && !entityplayer.capabilities.isCreativeMode)
							dropItem(world, entityplayer, bullet.dropItemOnReload);
					}
					// Play the reload sound by this method so that it stays
					// with the player as they move around
					if (type.reloadSound != null)
					{
						PacketDispatcher.sendPacketToAllAround(entityplayer.posX, entityplayer.posY, entityplayer.posZ, 50, entityplayer.dimension, PacketPlaySound.buildSoundPacket(entityplayer.posX, entityplayer.posY, entityplayer.posZ, type.reloadSound, true));
					}
					PacketDispatcher.sendPacketToPlayer(PacketReload.buildReloadPacket(), (Player)entityplayer);
					// Reset the shoot delay timer to the reload time of this
					// gun
					data.shootTime = type.reloadTime;
				}
				return itemstack;
			}
			for (int j = 0; j < entityplayer.inventory.getSizeInventory(); j++)
			{
				ItemStack item = entityplayer.inventory.getStackInSlot(j);
				if (item != null && item.getItem() instanceof ItemBullet && type.isAmmo(((ItemBullet) (item.getItem())).type))
				{
					// Get the bullet type
					BulletType bullet = BulletType.getBullet(item.itemID);
					int i = item.getItemDamage();
					if (i >= item.getMaxDamage())
						continue;
					// Shoot
					shoot(world, bullet, entityplayer);
					if (!world.isRemote)
					{
						// Use up one bullet
						item.setItemDamage(i + 1);
						entityplayer.inventory.setInventorySlotContents(j, item);
						// Check if the clip has run out of ammo
						if (i + 1 == item.getMaxDamage())
						{
							if (entityplayer.capabilities.isCreativeMode)
							{
								// Reset the stack for infinite ammo
								item.setItemDamage(0);
								entityplayer.inventory.setInventorySlotContents(j, item);
							} else
							{
								// Decrease the stack size and reset damage to 0
								item.setItemDamage(0);
								item.stackSize--;
								// Check for empty stacks
								if (item.stackSize == 0)
									item = null;
								entityplayer.inventory.setInventorySlotContents(j, item);
								// Drop item on reload if bullet requires it
								if(bullet.dropItemOnReload != null && !entityplayer.capabilities.isCreativeMode)
									dropItem(world, entityplayer, bullet.dropItemOnReload);
							}
							
							// Drop item on reload if bullet requires it
							if(bullet.dropItemOnReload != null && !entityplayer.capabilities.isCreativeMode)
								dropItem(world, entityplayer, bullet.dropItemOnReload);
							if (type.reloadSound != null)
							{
								PacketDispatcher.sendPacketToAllAround(entityplayer.posX, entityplayer.posY, entityplayer.posZ, 50, entityplayer.dimension, PacketPlaySound.buildSoundPacket(entityplayer.posX, entityplayer.posY, entityplayer.posZ, type.reloadSound, true));
							}
							// Reset the shoot delay timer to the reload time of
							// this gun
							PacketDispatcher.sendPacketToPlayer(PacketReload.buildReloadPacket(), (Player)entityplayer);

							data.shootTime = type.reloadTime;
							return itemstack;
						}
					}
					return itemstack;
				}
			}
		}
		return itemstack;
	}

	/** Method for dropping the gun */
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
			PacketDispatcher.sendPacketToAllAround(entityplayer.posX, entityplayer.posY, entityplayer.posZ, 50, entityplayer.dimension, PacketPlaySound.buildSoundPacket(entityplayer.posX, entityplayer.posY, entityplayer.posZ, type.shootSound, type.distortSound));
			soundDelay = type.shootSoundLength;
		}
		if (!world.isRemote)
		{
			// Spawn the bullet entities
			for (int k = 0; k < type.numBullets; k++)
			{
				world.spawnEntityInWorld(new EntityBullet(world, entityplayer, (entityplayer.isSneaking() ? 0.7F : 1F) * type.accuracy, type.damage, bullet, type.speed, type.numBullets > 1));
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
			MovingObjectPosition look = FMLClientHandler.instance().getClient().objectMouseOver;
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
	public int getDamageVsEntity(Entity par1Entity)
	{
		return type.meleeDamage;
	}

	@Override
	public boolean isFull3D()
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
}