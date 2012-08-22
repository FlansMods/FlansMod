package flansmod.common;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumGameType;
import net.minecraft.src.EnumMovingObjectType;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MathHelper;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.World;

import org.lwjgl.input.Mouse;


public class ItemGun extends Item
{

    public ItemGun(int i, GunType gun)
    {
        super(i);
		setIconIndex(gun.iconIndex);
        maxStackSize = 1;
		type = gun;
		type.item = this;
		if(type.loadIntoGun > 0)
			setMaxDamage(type.loadIntoGun);
		setTabToDisplayOn(CreativeTabs.tabCombat);
    }
	
	public String getTextureFile()
    {
        return "/spriteSheets/guns.png";
    }
	
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
    {
		if(entity instanceof EntityPlayer && ((EntityPlayer)entity).inventory.getCurrentItem() == itemstack)
		{
			lastMouseHeld = mouseHeld;
			mouseHeld = Mouse.isButtonDown(1);
			if(type.deployable)
				return;
			if(type.mode == 1 && mouseHeld) //FullAuto
			{
				itemstack = onItemRightClick2(itemstack, world, (EntityPlayer)entity);
			}
			if(type.mode == 0 && mouseHeld && !lastMouseHeld) //SemiAuto
			{
				itemstack = onItemRightClick2(itemstack, world, (EntityPlayer)entity);				
			}
			if(type.hasScope && Mouse.isButtonDown(0) && FlansMod.shootTime <= 0)
			{
				if(FlansMod.zoomOverlay == null)
				{
					FlansMod.zoomOverlay = type.scope;
					FlansMod.newZoom = type.zoomLevel;
					float f = FlansMod.originalMouseSensitivity = FMLClientHandler.instance().getClient().gameSettings.mouseSensitivity;
					FMLClientHandler.instance().getClient().gameSettings.mouseSensitivity = f / (float)Math.sqrt(type.zoomLevel);
					FlansMod.originalHideGUI = FMLClientHandler.instance().getClient().gameSettings.hideGUI;
					FMLClientHandler.instance().getClient().gameSettings.hideGUI = true;
				}
				else
				{
					//mod_Flan.zoomOverlay = null;
					FlansMod.newZoom = 1.0F;	
					FMLClientHandler.instance().getClient().gameSettings.mouseSensitivity = FlansMod.originalMouseSensitivity;	
					FMLClientHandler.instance().getClient().gameSettings.hideGUI = FlansMod.originalHideGUI;	
				}
				FlansMod.shootTime = 10;
			}
		}
		if(soundDelay > 0)
			soundDelay--;
    }

    public ItemStack onItemRightClick2(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
		if(FlansMod.shootTime <= 0)
		{
			if(world.isRemote)
			{
				//FlansMod.shoot();
			}
			if(type.loadIntoGun > 0)
			{
				BulletType bullet = type.ammo.get(0);
				int i = itemstack.getItemDamage();
				//Make sure the gun has bullets in
				if(i < type.loadIntoGun)
				{
					//Shoot
					shoot(world, bullet, entityplayer);
					if(!world.isRemote)
					{
						//Use up one bullet
						itemstack.setItemDamage(i + 1);
					}
				}
				else
				{
					//Reload
					//Creative mode
					if(world.getWorldInfo().getGameType() == EnumGameType.CREATIVE)
					{	
						//Reset the stack for infinite ammo
						itemstack.setItemDamage(0);
					}
					else
					{
						for(int j = 0; j < entityplayer.inventory.getSizeInventory(); j++)
						{
							ItemStack item = entityplayer.inventory.getStackInSlot(j);
							if(item != null && item.getItem() instanceof ItemBullet && ((ItemBullet)(item.getItem())).type == bullet)
							{
								ItemStack consumed = entityplayer.inventory.decrStackSize(j, i);
								i -= consumed.stackSize;
							}
						}
						itemstack.setItemDamage(i);
						//Drop item on reload if bullet requires it
						dropItem(world, entityplayer, bullet.dropItemOnReload);
					}
					//Play the reload sound by this method so that it stays with the player as they move around
					if(type.reloadSound != null)
					{
						try {
							FMLClientHandler.instance().getClient().sndManager.playSoundFX(type.reloadSound, 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 0.8F));
						}
						catch(Exception e)
						{
							FlansMod.log("Failed to play sound : " + type.reloadSound);
						}
					}
					//Reset the shoot delay timer to the reload time of this gun
					FlansMod.shootTime = type.reloadTime;
					//Remove any zooming while reloading
					FlansMod.zoomOverlay = null;
					FlansMod.newZoom = 1.0F;	
					FMLClientHandler.instance().getClient().gameSettings.mouseSensitivity = FlansMod.originalMouseSensitivity;						
				}
				return itemstack;
			}
			for(int j = 0; j < entityplayer.inventory.getSizeInventory(); j++)
			{
				ItemStack item = entityplayer.inventory.getStackInSlot(j);
				if(item != null && item.getItem() instanceof ItemBullet && type.isAmmo(((ItemBullet)(item.getItem())).type))
				{
					//Get the bullet type
					BulletType bullet = BulletType.getBullet(item.itemID);
					int i = item.getItemDamage();
					if(i >= item.getMaxDamage())
						continue;
					//Shoot
					shoot(world, bullet, entityplayer);
					if(!world.isRemote)
					{
						//Use up one bullet
						item.setItemDamage(i + 1);	
						entityplayer.inventory.setInventorySlotContents(j, item);
						//Check if the clip has run out of ammo
						if(i + 1 == item.getMaxDamage())
						{
							//Check for creative mode
							if(world.getWorldInfo().getGameType() == EnumGameType.CREATIVE)
							{	
								//Reset the stack for infinite ammo
								item.setItemDamage(0);
								entityplayer.inventory.setInventorySlotContents(j, item);
							}
							else 
							{	
								//Decrease the stack size and reset damage to 0
								item.setItemDamage(0);
								item.stackSize--;
								//Check for empty stacks
								if(item.stackSize == 0)
									item = null;
								entityplayer.inventory.setInventorySlotContents(j, item);
								//Drop item on reload if bullet requires it
								dropItem(world, entityplayer, bullet.dropItemOnReload);
							}
							//Play the reload sound by this method so that it stays with the player as they move around
							if(type.reloadSound != null)
							{
								try {
									FMLClientHandler.instance().getClient().sndManager.playSoundFX(type.reloadSound, 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 0.8F));
								}
								catch(Exception e)
								{
									FlansMod.log("Failed to play sound : " + type.reloadSound);
								}
							}
							//Reset the shoot delay timer to the reload time of this gun
							FlansMod.shootTime = type.reloadTime;
							//Remove any zooming while reloading
							FlansMod.zoomOverlay = null;
							FlansMod.newZoom = 1.0F;	
							FMLClientHandler.instance().getClient().gameSettings.mouseSensitivity = FlansMod.originalMouseSensitivity;		
							FMLClientHandler.instance().getClient().gameSettings.hideGUI = FlansMod.originalHideGUI;
							return itemstack;
						}
					}
					return itemstack;
				}	
			}
		}
        return itemstack;
    }
	
	private void dropItem(World world, EntityPlayer entityplayer, String itemName)
	{
		if(itemName != null)
		{
			int damage = 0;
			if(itemName.contains("."))
			{
				damage = Integer.parseInt(itemName.split("\\.")[1]);
				itemName = itemName.split("\\.")[0];
			}
			ItemStack dropStack = TypeType.getRecipeElement(itemName, damage);
			entityplayer.entityDropItem(dropStack, 0.5F);
		}
	}
	
	//Method for shooting to avoid repeated code
	private void shoot(World world, BulletType bullet, EntityPlayer entityplayer)
	{
		//Play a sound if the previous sound has finished
		if(soundDelay <= 0 && type.shootSound != null)
		{
			float distortion = type.distortSound ?  1.0F / (itemRand.nextFloat() * 0.4F + 0.8F) : 1F;
			world.playSoundAtEntity(entityplayer, type.shootSound, 1.0F, distortion);
			soundDelay = type.shootSoundLength;
		}
		FlansMod.playerRecoil += type.recoil;
		if(!world.isRemote)
		{
			//Spawn the bullet entities
			for(int k = 0; k < type.numBullets; k++)
			{
				world.spawnEntityInWorld(new EntityBullet(world, entityplayer, (entityplayer.isSneaking() ? 0.7F : 1F) * type.accuracy, type.damage, bullet, type.speed, type.numBullets > 1));
			}
			//Drop item on shooting if bullet requires it
			dropItem(world, entityplayer, bullet.dropItemOnShoot);
		}
		FlansMod.shootTime = type.shootDelay;
	}
	
	//Deployable guns only
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
		if(type.deployable)
		{
			MovingObjectPosition look = FMLClientHandler.instance().getClient().objectMouseOver;
			if(look != null && look.typeOfHit == EnumMovingObjectType.TILE)
			{
				if(look.sideHit == 1)
				{
					int playerDir = MathHelper.floor_double((double)((entityplayer.rotationYaw * 4F) / 360F) + 0.5D) & 3;
					int i = look.blockX;
					int j = look.blockY;
					int k = look.blockZ;
					if(!world.isRemote)
					{
						if(world.getBlockId(i, j, k) == Block.snow.blockID)
						{
							j--;
						}
						if(isSolid(world, i, j, k)
						&& (world.getBlockId(i, j + 1, k) == 0 || world.getBlockId(i, j + 1, k) == Block.snow.blockID)
						&& (world.getBlockId(i + (playerDir == 1 ? 1 : 0) - (playerDir == 3 ? 1 : 0), j + 1, k - (playerDir == 0 ? 1 : 0) + (playerDir == 2 ? 1 : 0)) == 0)
						&& (world.getBlockId(i + (playerDir == 1 ? 1 : 0) - (playerDir == 3 ? 1 : 0), j, k - (playerDir == 0 ? 1 : 0) + (playerDir == 2 ? 1 : 0)) == 0 
						|| world.getBlockId(i + (playerDir == 1 ? 1 : 0) - (playerDir == 3 ? 1 : 0), j, k - (playerDir == 0 ? 1 : 0) + (playerDir == 2 ? 1 : 0)) == Block.snow.blockID))
						{
							for(EntityMG mg : EntityMG.mgs)
							{
								if(mg.blockX == i && mg.blockY == j + 1 && mg.blockZ == k && !mg.isDead)
									return itemstack;
							}
							world.spawnEntityInWorld(new EntityMG(world, i, j + 1, k, playerDir, type));
							if(world.getWorldInfo().getGameType() != EnumGameType.CREATIVE)	
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
		if(blockID == 0)
			return false;
		return Block.blocksList[blockID].blockMaterial.isSolid() &&  Block.blocksList[blockID].isOpaqueCube();
	}
	
	public int getDamageVsEntity(Entity par1Entity)
    {
        return type.meleeDamage;
    }
	
	public boolean isFull3D()
	{
		return true;
	}
	
	public int getColorFromDamage(int i)
    {
        return type.colour;
    }
	
	public boolean isItemStackDamageable()
    {
        return true;
    }
	
	public GunType type;
	private static boolean mouseHeld;
	private static boolean lastMouseHeld;
	public int soundDelay;
}
