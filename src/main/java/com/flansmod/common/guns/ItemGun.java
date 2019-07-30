package com.flansmod.common.guns;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import org.lwjgl.input.Mouse;

import com.google.common.collect.Multimap;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.RayTraceResult.Type;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.handlers.FlansModResourceHandler;
import com.flansmod.client.debug.EntityDebugDot;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.EntityItemCustomRender;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.raytracing.FlansModRaytracer;
import com.flansmod.common.network.PacketGunFire;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.network.PacketReload;
import com.flansmod.common.teams.EntityFlag;
import com.flansmod.common.teams.EntityFlagpole;
import com.flansmod.common.teams.EntityGunItem;
import com.flansmod.common.types.IPaintableItem;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.PaintableType;
import com.flansmod.common.vector.Vector3f;

public class ItemGun extends Item implements IPaintableItem
{
	
	private GunType type;
	
	public GunType GetType()
	{
		return type;
	}
	
	@Override
	public InfoType getInfoType()
	{
		return type;
	}
	
	@Override
	public PaintableType GetPaintableType()
	{
		return type;
	}
	
	private int soundDelay = 0;
	
	private static boolean rightMouseHeld;
	private static boolean lastRightMouseHeld;
	private static boolean leftMouseHeld;
	private static boolean lastLeftMouseHeld;
	
	private static boolean GetMouseHeld(EnumHand hand)
	{
		if(FlansMod.shootOnRightClick)
			return hand == EnumHand.MAIN_HAND ? rightMouseHeld : leftMouseHeld;
		else
			return hand == EnumHand.MAIN_HAND ? leftMouseHeld : rightMouseHeld;
	}
	
	private static boolean GetLastMouseHeld(EnumHand hand)
	{
		if(FlansMod.shootOnRightClick)
			return hand == EnumHand.MAIN_HAND ? lastRightMouseHeld : lastLeftMouseHeld;
		else
			return hand == EnumHand.MAIN_HAND ? lastLeftMouseHeld : lastRightMouseHeld;
	}
	
	public ItemGun(GunType type)
	{
		maxStackSize = 1;
		this.type = type;
		type.item = this;
		setMaxDamage(0);
		setRegistryName(type.shortName);
		setCreativeTab(FlansMod.tabFlanGuns);
	}
	
	/**
	 * Get the bullet item stack stored in the gun's NBT data (the loaded magazine / bullets)
	 */
	public ItemStack getBulletItemStack(ItemStack gun, int id)
	{
		//If the gun has no tags, give it some
		if(!gun.hasTagCompound())
		{
			gun.setTagCompound(new NBTTagCompound());
			return ItemStack.EMPTY.copy();
		}
		//If the gun has no ammo tags, give it some
		if(!gun.getTagCompound().hasKey("ammo"))
		{
			NBTTagList ammoTagsList = new NBTTagList();
			for(int i = 0; i < type.numAmmoItemsInGun; i++)
			{
				ammoTagsList.appendTag(new NBTTagCompound());
			}
			gun.getTagCompound().setTag("ammo", ammoTagsList);
			return ItemStack.EMPTY.copy();
		}
		//Take the list of ammo tags
		NBTTagList ammoTagsList = gun.getTagCompound().getTagList("ammo", Constants.NBT.TAG_COMPOUND);
		//Get the specific ammo tags required
		NBTTagCompound ammoTags = ammoTagsList.getCompoundTagAt(id);
		return new ItemStack(ammoTags);
	}
	
	/**
	 * Set the bullet item stack stored in the gun's NBT data (the loaded magazine / bullets)
	 */
	public void setBulletItemStack(ItemStack gun, ItemStack bullet, int id)
	{
		//If the gun has no tags, give it some
		if(!gun.hasTagCompound())
		{
			gun.setTagCompound(new NBTTagCompound());
		}
		//If the gun has no ammo tags, give it some
		if(!gun.getTagCompound().hasKey("ammo"))
		{
			NBTTagList ammoTagsList = new NBTTagList();
			for(int i = 0; i < type.numAmmoItemsInGun; i++)
			{
				ammoTagsList.appendTag(new NBTTagCompound());
			}
			gun.getTagCompound().setTag("ammo", ammoTagsList);
		}
		//Take the list of ammo tags
		NBTTagList ammoTagsList = gun.getTagCompound().getTagList("ammo", Constants.NBT.TAG_COMPOUND);
		//Get the specific ammo tags required
		NBTTagCompound ammoTags = ammoTagsList.getCompoundTagAt(id);
		//Represent empty slots by nulltypes
		if(bullet == null)
		{
			ammoTags = new NBTTagCompound();
		}
		//Set the tags to match the bullet stack
		bullet.writeToNBT(ammoTags);
	}
	
	/**
	 * Method for dropping items on reload and on shoot
	 */
	public static void dropItem(World world, Entity entity, String itemName)
	{
		if(itemName != null)
		{
			int damage = 0;
			if(itemName.contains("."))
			{
				damage = Integer.parseInt(itemName.split("\\.")[1]);
				itemName = itemName.split("\\.")[0];
			}
			ItemStack dropStack = InfoType.getRecipeElement(itemName, damage);
			entity.entityDropItem(dropStack, 0.5F);
		}
	}
	
	/**
	 * Deployable guns only
	 */
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entityplayer, EnumHand hand)
	{
		ItemStack itemstack = entityplayer.getHeldItem(hand);
		
		if(type.deployable)
		{
			//Raytracing
			float cosYaw = MathHelper.cos(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
			float sinYaw = MathHelper.sin(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
			float cosPitch = -MathHelper.cos(-entityplayer.rotationPitch * 0.01745329F);
			float sinPitch = MathHelper.sin(-entityplayer.rotationPitch * 0.01745329F);
			double length = 5D;
			Vec3d posVec = new Vec3d(entityplayer.posX, entityplayer.posY + 1.62D - entityplayer.getYOffset(), entityplayer.posZ);
			Vec3d lookVec = posVec.add(sinYaw * cosPitch * length, sinPitch * length, cosYaw * cosPitch * length);
			RayTraceResult look = world.rayTraceBlocks(posVec, lookVec, true);
			
			//Result check
			if(look != null && look.typeOfHit == Type.BLOCK)
			{
				if(look.sideHit == EnumFacing.UP)
				{
					int playerDir = MathHelper.floor(((entityplayer.rotationYaw * 4F) / 360F) + 0.5D) & 3;
					int i = look.getBlockPos().getX();
					int j = look.getBlockPos().getY();
					int k = look.getBlockPos().getZ();
					if(!world.isRemote)
					{
						if(world.getBlockState(new BlockPos(i, j, k)).getBlock() == Blocks.SNOW)
						{
							j--;
						}
						if(isSolid(world, i, j, k) &&
								(world.getBlockState(new BlockPos(i, j + 1, k)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(i, j + 1, k)).getBlock() == Blocks.SNOW)
								&&
								(world.getBlockState(new BlockPos(i + (playerDir == 1 ? 1 : 0) - (playerDir == 3 ? 1 : 0), j + 1, k - (playerDir == 0 ? 1 : 0) + (playerDir == 2 ? 1 : 0))).getBlock() == Blocks.AIR)
								&&
								(world.getBlockState(new BlockPos(i + (playerDir == 1 ? 1 : 0) - (playerDir == 3 ? 1 : 0), j, k - (playerDir == 0 ? 1 : 0) + (playerDir == 2 ? 1 : 0))).getBlock() == Blocks.AIR
										|| world.getBlockState(new BlockPos(i + (playerDir == 1 ? 1 : 0) - (playerDir == 3 ? 1 : 0), j, k - (playerDir == 0 ? 1 : 0) + (playerDir == 2 ? 1 : 0))).getBlock() == Blocks.SNOW))
						{
							for(EntityMG mg : EntityMG.mgs)
							{
								if(mg.blockX == i && mg.blockY == j + 1 && mg.blockZ == k && !mg.isDead)
									return new ActionResult<>(EnumActionResult.SUCCESS, itemstack);
							}
							EntityMG mg = new EntityMG(world, i, j + 1, k, playerDir, type);
							
							if(getBulletItemStack(itemstack, 0) != null)
							{
								mg.ammo = getBulletItemStack(itemstack, 0);
							}
							world.spawnEntity(mg);
							
							if(!entityplayer.capabilities.isCreativeMode)
								itemstack.setCount(0);
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
		return new ActionResult<>(EnumActionResult.PASS, itemstack);
	}
	
	// _____________________________________________________________________________
	//
	// Shooting code
	// _____________________________________________________________________________
	
	@SideOnly(Side.CLIENT)
	public void onUpdateClient(ItemStack gunstack, int gunSlot, World world, Entity entity, EnumHand hand, boolean hasOffHand)
	{
		if(!(entity instanceof EntityPlayer))
		{
			//This code is for players only
			return;
		}
		
		// This code is not for deployables
		if(type.deployable)
			return;
		
		//Scope Handling
		IScope currentScope = type.getCurrentScope(gunstack);
		if(!hasOffHand)
		{
			switch(hand)
			{
				case MAIN_HAND:
				{
					if(GetMouseHeld(EnumHand.OFF_HAND) && !GetLastMouseHeld(EnumHand.OFF_HAND)
							&& (type.secondaryFunction == EnumSecondaryFunction.ADS_ZOOM || type.secondaryFunction == EnumSecondaryFunction.ZOOM))
					{
						FlansModClient.setScope(currentScope);
					}
					break;
				}
				case OFF_HAND:
				{
					if(GetMouseHeld(EnumHand.MAIN_HAND) && !GetLastMouseHeld(EnumHand.MAIN_HAND)
							&& (type.secondaryFunction == EnumSecondaryFunction.ADS_ZOOM || type.secondaryFunction == EnumSecondaryFunction.ZOOM))
					{
						FlansModClient.setScope(currentScope);
					}
					break;
				}
			}
		}
		
		// Get useful objects
		Minecraft mc = Minecraft.getMinecraft();
		EntityPlayer player = (EntityPlayer) entity;
		PlayerData data = PlayerHandler.getPlayerData(player);
		//Slow down minigun
		data.minigunSpeed *= 0.9f;
		Boolean hold = GetMouseHeld(hand);
		Boolean held = GetLastMouseHeld(hand);
		
		// Do not shoot ammo bags, flags or dropped gun items
		if(mc.objectMouseOver != null && (mc.objectMouseOver.entityHit instanceof EntityFlagpole || mc.objectMouseOver.entityHit instanceof EntityFlag || mc.objectMouseOver.entityHit instanceof EntityGunItem || (mc.objectMouseOver.entityHit instanceof EntityGrenade && ((EntityGrenade)mc.objectMouseOver.entityHit).type.isDeployableBag)))
			hold = false;
		
		//TODO idle sound should be done on the server side
		// Play idle sounds
		if(soundDelay <= 0 && type.idleSound != null)
		{
			PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, FlansMod.soundRange, player.dimension, type.idleSound, false);
			soundDelay = type.idleSoundLength;
		}
		
		if (gunCantBeHandeled(type, player))
			return;
		
		if(type.usableByPlayers)
		{
			GunAnimations animations = FlansModClient.getGunAnimations(player, hand);
			
			boolean needsToReload = needsToReload(gunstack);
			boolean shouldShootThisTick = false;
			switch(type.getFireMode(gunstack))
			{
				case BURST:
				{
					//PlayerData burst rounds handled on client
					if(data.GetBurstRoundsRemaining(hand) > 0)
					{
						shouldShootThisTick = true;
					}
					// Fallthrough to semi auto
				}
				case SEMIAUTO:
				{
					if(hold && !held)
					{
						shouldShootThisTick = true;
					}
					else needsToReload = false;
					break;
				}
				case MINIGUN:
				{
					if(needsToReload)
					{
						needsToReload = hold;
						break;
					}
					if(hold)
					{
						//PlayerData minigunspeed used on client side
						if (data.minigunSpeed < type.minigunMaxSpeed)
						{
							data.minigunSpeed += 2.0f;
							animations.addMinigunBarrelRotationSpeed(2.0f);
						}
						// TODO : Re-add looping sounds
						if(data.minigunSpeed < type.minigunStartSpeed)
						{
							if(type.useLoopingSounds)
							{
								data.shouldPlayWarmupSound = true;
							}
							break;
						}
					}
					
					//else fallthrough to full auto
				}
				case FULLAUTO:
				{
					shouldShootThisTick = hold;
					if(!shouldShootThisTick)
					{
						needsToReload = false;
					}
					break;
				}
				default:
					needsToReload = false;
					break;
			}
			
			// Do reload if we pressed fire.
			if(needsToReload)
			{
				FlansMod.getPacketHandler().sendToServer(new PacketReload(hand, false));
			}
			// Fire!
			else if(shouldShootThisTick)
			{
				shoot(hand, player, gunstack, data, world, animations);
			}
		}
	}
	
	/**
	 * Used to determine if for example an player is holding a two handed gun but the other hand (the one without a gun) is holding something else
	 * For example a player is holding two miniguns, a gun requiring both hands, so this method returns true
	 * 
	 * @param type   The GunType of the gun
	 * @param player The player who is handling the gun
	 * @return if the player can handle the gun based on the contents of the main and off hand and the GunType
	 */
	public Boolean gunCantBeHandeled(GunType type, EntityPlayer player)
	{
		ItemStack main = player.getHeldItemMainhand();
		ItemStack off = player.getHeldItemOffhand();
		Boolean hasItemInBothHands = !main.isEmpty() && !off.isEmpty();
		if(hasItemInBothHands && !type.oneHanded)
			return true;
		
		return false;
	}
	
	public void shoot(EnumHand hand, EntityPlayer player, ItemStack gunstack, PlayerData data, World world, @Nullable GunAnimations animations)
	{
		if(type.usableByPlayers)
		{
			float shootTime = data.GetShootTime(hand);
			
			if (!world.isRemote && shootTime > 0f)
			{
				//data.addToQueue(hand);
				//Hacky code
				//This essentially skips ticks for a smoother client experience
				if (shootTime < 4)
				{
					while (shootTime > 0)
					{
						shootTime--;
					}
				}
			}
			
			if (world.isRemote && shootTime <= 0)
				//Send the server the instruction to shoot
				FlansMod.getPacketHandler().sendToServer(new PacketGunFire(hand));
			
			// For each 
			while(shootTime <= 0.0f)
			{
				
				// Add the delay for this shot and shoot it!
				shootTime += type.GetShootDelay(gunstack);
				
				int bulletID = 0;
				ItemStack bulletStack = ItemStack.EMPTY.copy();
				for(; bulletID < type.numAmmoItemsInGun; bulletID++)
				{
					ItemStack checkingStack = getBulletItemStack(gunstack, bulletID);
					if(checkingStack != null && checkingStack.getItemDamage() < checkingStack.getMaxDamage())
					{
						bulletStack = checkingStack;
						break;
					}
				}
				
				if(bulletStack.isEmpty())
				{
					continue;
				}
				
				final ItemStack bullet = bulletStack;
				final Integer bulletid = bulletID;
				
				ItemShootable shootableItem = (ItemShootable)bulletStack.getItem();
				ShootableType shootableType = shootableItem.type;
				Vector3f rayTraceOrigin = new Vector3f(player.getPositionEyes(0.0f));
				
					ShootBulletHandler handler = (Boolean isExtraBullet) ->
					{
						if(!isExtraBullet)
						{
							// Drop item on shooting if bullet requires it
							if(shootableType.dropItemOnShoot != null && !player.capabilities.isCreativeMode)
								dropItem(world, player, shootableType.dropItemOnShoot);
							// Drop item on shooting if gun requires it
							if(type.dropItemOnShoot != null)// && !entityplayer.capabilities.isCreativeMode)
								dropItem(world, player, type.dropItemOnShoot);
							
							if(type.knockback > 0)
							{
							//TODO : Apply knockback		
							}
							
							//Damage the bullet item
							bullet.setItemDamage(bullet.getItemDamage() + 1);
							
							//Update the stack in the gun
							setBulletItemStack(gunstack, bullet, bulletid);
							
							if(type.consumeGunUponUse)
							{
								player.setHeldItem(hand, ItemStack.EMPTY.copy());
							}
						}
					};
					
					if (world.isRemote)
					{	
						
						Integer bulletAmount = type.numBullets*shootableType.numBullets;
						for(int i = 0; i < bulletAmount; i++)
						{
							//Smooth effects, no need to wait for the server response
							handler.shooting(i < bulletAmount - 1);
						}
						
						animations.doShoot(type.getPumpDelay(), type.getPumpTime());
						Float recoil = type.getRecoil(gunstack);
						FlansModClient.playerRecoil += recoil;
						animations.recoil += recoil;
						
					} else
					{
						Vector3f rayTraceDirection = new Vector3f(player.getLookVec());
						
						if (shootableType instanceof BulletType)
						{
							//Fire gun
							FireableGun fireableGun = new FireableGun(type,type.getDamage(gunstack),type.getSpread(gunstack), type.bulletSpeed);
							FiredShot shot = new FiredShot(fireableGun, (BulletType)shootableType, (EntityPlayerMP)player);
							//TODO gunOrigin? & animation origin
							ShotHandler.fireGun(world, shot, type.numBullets*shootableType.numBullets, rayTraceOrigin, rayTraceDirection, handler);
						}
						else if (shootableType instanceof GrenadeType)
						{
							//throw grenade
							ItemGrenade grenade = (ItemGrenade) shootableItem;
							grenade.throwGrenade(world, player);
							handler.shooting(false);
						}
						
						boolean silenced = type.getBarrel(gunstack) != null && type.getBarrel(gunstack).silencer;
						playShotSound(world, rayTraceOrigin, silenced);
					}
				int gunSlot = player.inventory.currentItem;
				if(type.consumeGunUponUse)
					player.inventory.setInventorySlotContents(gunSlot, ItemStack.EMPTY.copy());
			}
			data.SetShootTime(hand, shootTime);
		}
	}
	
	public void shootServer(EnumHand hand, EntityPlayerMP player, ItemStack gunstack)
		{

			// Get useful objects
			PlayerData data = PlayerHandler.getPlayerData(player, Side.SERVER);
			World world = player.getServerWorld();
			
			// This code is not for deployables
			if(type.deployable)
				return;
			
			if (gunCantBeHandeled(type, player))
				return;
			
			shoot(hand, player, gunstack, data, world, null);
			
			if(FlansMod.DEBUG)
			{
				Vector3f gunOrigin = FlansModRaytracer.GetPlayerMuzzlePosition(player, hand);
				world.spawnEntity(new EntityDebugDot(world, gunOrigin, 100, 1.0f, 1.0f, 1.0f));
			}
	}
	
	public void playShotSound(World world, Vector3f position, Boolean silenced) {
		// Play shot sounds
		if(soundDelay <= 0 && type.shootSound != null)
		{
			PacketPlaySound.sendSoundPacket(position.x, position.y, position.z, FlansMod.soundRange, world.provider.getDimension(), type.shootSound, silenced);
			soundDelay = type.idleSoundLength;
		}
	}

	@SideOnly(Side.CLIENT)
	private void PlayShotSound(World world, boolean silenced, float x, float y, float z)
	{
		FMLClientHandler.instance().getClient().getSoundHandler().playSound(
				new PositionedSoundRecord(FlansModResourceHandler.getSoundEvent(type.shootSound),
						SoundCategory.PLAYERS,
						silenced ? 5F : 10F,
						(type.distortSound ? 1.0F / (world.rand.nextFloat() * 0.4F + 0.8F) : 1.0F) * (silenced ? 2F : 1F),
						x, y, z));
	}
	
	public void onUpdateServer(ItemStack itemstack, int gunSlot, World world, Entity entity, EnumHand hand, boolean hasOffHand)
	{
		if(!(entity instanceof EntityPlayerMP))
		{
			return;
		}
		EntityPlayerMP player = (EntityPlayerMP)entity;
		PlayerData data = PlayerHandler.getPlayerData(player);
		
		if(player.inventory.getCurrentItem() != itemstack)
		{
			//If the player is no longer holding a gun, emulate a release of the shoot button
			if(player.inventory.getCurrentItem().isEmpty() || !(player.inventory.getCurrentItem().getItem() instanceof ItemGun))
			{
				data.isShootingRight = data.isShootingLeft = false;
			}
			return;
		}
		
		// And finally do sounds
		if(soundDelay > 0)
		{
			soundDelay--;
		}
	}
	
	/**
	 * Generic update method. If we have an off hand weapon, it will also make calls for that
	 * Passes on to onUpdateEach
	 */
	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
	{
		if(entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)entity;
			EnumHand hand;
			if(itemstack == player.getHeldItemMainhand())
			{
				hand = EnumHand.MAIN_HAND;
			}
			else if(itemstack == player.getHeldItemOffhand())
			{
				hand = EnumHand.OFF_HAND;
			}
			else
			{
				return;
			}
			
			if(world.isRemote && Minecraft.getMinecraft().currentScreen == null)
			{
				// Get button presses. Do this before splitting into each hand. Prevents second pass wiping the data
				lastRightMouseHeld = rightMouseHeld;
				lastLeftMouseHeld = leftMouseHeld;
				rightMouseHeld = Mouse.isButtonDown(1);
				leftMouseHeld = Mouse.isButtonDown(0);
			}
			
			ItemStack main = player.getHeldItemMainhand();
			ItemStack off = player.getHeldItemOffhand();
			boolean hasOffHand = !main.isEmpty() && !off.isEmpty();
			
			onUpdateEach(itemstack, i, world, entity, hand, hasOffHand);
		}
	}
	
	/**
	 * Called once for each weapon we are weilding
	 */
	private void onUpdateEach(ItemStack itemstack, int gunSlot, World world, Entity entity, EnumHand hand, boolean hasOffHand)
	{
		if(world.isRemote)
			onUpdateClient(itemstack, gunSlot, world, entity, hand, hasOffHand);
		else onUpdateServer(itemstack, gunSlot, world, entity, hand, hasOffHand);
	}
	
	public boolean Reload(ItemStack gunstack, World world, Entity entity, IInventory inventory, EnumHand hand, boolean hasOffHand, boolean forceReload, boolean isCreative)
	{
		//Deployable guns cannot be reloaded in the inventory
		
		//TODO investigate if this code can can actually be called by an deployable
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
			ItemStack bulletStack = getBulletItemStack(gunstack, i);
			
			//If there is no magazine, if the magazine is empty or if this is a forced reload
			if(bulletStack == null || bulletStack.isEmpty() || bulletStack.getItemDamage() == bulletStack.getMaxDamage() || forceReload)
			{
				//Iterate over all inventory slots and find the magazine / bullet item with the most bullets
				int bestSlot = -1;
				int bulletsInBestSlot = 0;
				for(int j = 0; j < inventory.getSizeInventory(); j++)
				{
					ItemStack item = inventory.getStackInSlot(j);
					if(item.getItem() instanceof ItemShootable && type.isAmmo(((ItemShootable)(item.getItem())).type))
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
					ShootableType newBulletType = ((ItemShootable)newBulletStack.getItem()).type;
					
					//Unload the old magazine (Drop an item if it is required and the player is not in creative mode)
					if(bulletStack != null && bulletStack.getItem() instanceof ItemShootable && ((ItemShootable)bulletStack.getItem()).type.dropItemOnReload != null && !isCreative && bulletStack.getItemDamage() == bulletStack.getMaxDamage())
					{
						if(!world.isRemote)
							dropItem(world, entity, ((ItemShootable)bulletStack.getItem()).type.dropItemOnReload);
					}
					
					//The magazine was not finished, pull it out and give it back to the player or, failing that, drop it
					if(bulletStack != null && !bulletStack.isEmpty() && bulletStack.getItemDamage() < bulletStack.getMaxDamage())
					{
						if(!InventoryHelper.addItemStackToInventory(inventory, bulletStack, isCreative))
						{
							if(!world.isRemote)
								entity.entityDropItem(bulletStack, 0.5F);
						}
					}
					
					//Load the new magazine
					ItemStack stackToLoad = newBulletStack.copy();
					stackToLoad.setCount(1);
					setBulletItemStack(gunstack, stackToLoad, i);
					
					//Remove the magazine from the inventory
					if(!isCreative)
						newBulletStack.setCount(newBulletStack.getCount() - 1);
					if(newBulletStack.getCount() <= 0)
						newBulletStack = ItemStack.EMPTY.copy();
					inventory.setInventorySlotContents(bestSlot, newBulletStack);
					
					
					//Tell the sound player that we reloaded something
					reloadedSomething = true;
				}
			}
		}
		return reloadedSomething;
	}
	
	// TODO : All this bunk
		
	/* Melee MESS
	 * 	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity pEnt, int i, boolean flag)
	{
		if(world.isRemote)
			onUpdateClient(itemstack, world, pEnt, i, flag);
		else onUpdateServer(itemstack, world, pEnt, i, flag);
		
		if(pEnt instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)pEnt;
			PlayerData data = PlayerHandler.getPlayerData(player);
			if(data == null)
				return;
			//if(data.lastMeleePositions == null || data.lastMeleePositions.length != type.meleeDamagePoints.size())
			//{
			//	data.lastMeleePositions = new Vector3f[type.meleeDamagePoints.size()];
			//	for(int j = 0; j < type.meleeDamagePoints.size(); j++)
			//		data.lastMeleePositions[j] = new Vector3f(player.posX, player.posY, player.posZ);
			//}
			//Melee weapon
			if(data.meleeLength > 0 && type.meleePath.size() > 0 && player.inventory.getCurrentItem() == itemstack)
			{
				for(int k = 0; k < type.meleeDamagePoints.size(); k++)
				{
					Vector3f meleeDamagePoint = type.meleeDamagePoints.get(k);
					//Do a raytrace from the prev pos to the current pos and attack anything in the way
					Vector3f nextPos = type.meleePath.get((data.meleeProgress + 1) % type.meleePath.size());
					Vector3f nextAngles = type.meleePathAngles.get((data.meleeProgress + 1) % type.meleePathAngles.size());
					RotatedAxes nextAxes = new RotatedAxes().rotateGlobalRoll(-nextAngles.x).rotateGlobalPitch(-nextAngles.z).rotateGlobalYaw(-nextAngles.y);
					
					Vector3f nextPosInGunCoords = nextAxes.findLocalVectorGlobally(meleeDamagePoint);
					Vector3f.add(nextPos, nextPosInGunCoords, nextPosInGunCoords);
					Vector3f.add(new Vector3f(0F, 0F, 0F), nextPosInGunCoords, nextPosInGunCoords);
					Vector3f nextPosInPlayerCoords = new RotatedAxes(player.rotationYaw + 90F, player.rotationPitch, 0F).findLocalVectorGlobally(nextPosInGunCoords);
					
					
					if(!FlansMod.proxy.isThePlayer(player))
						nextPosInPlayerCoords.y += 1.6F;
					
					Vector3f nextPosInWorldCoords = new Vector3f(player.posX + nextPosInPlayerCoords.x, player.posY + nextPosInPlayerCoords.y, player.posZ + nextPosInPlayerCoords.z);
					
					Vector3f dPos = data.lastMeleePositions[k] == null ? new Vector3f() : Vector3f.sub(nextPosInWorldCoords, data.lastMeleePositions[k], null);
					
					if(player.world.isRemote && FlansMod.DEBUG)
						player.world.spawnEntity(new EntityDebugVector(player.world, data.lastMeleePositions[k], dPos, 200, 1F, 0F, 0F));
					
					//Do the raytrace
					{
						//Create a list for all bullet hits
						ArrayList<BulletHit> hits = new ArrayList<BulletHit>();
										
						//Iterate over all entities
						for(int j = 0; j < world.loadedEntityList.size(); j++)
						{
							Object obj = world.loadedEntityList.get(j);
							//Get players
							if(obj instanceof EntityPlayer)
							{
								EntityPlayer otherPlayer = (EntityPlayer)obj;
								PlayerData otherData = PlayerHandler.getPlayerData(otherPlayer);
								boolean shouldDoNormalHitDetect = false;
								if(otherPlayer == player)
									continue;
								if(otherData != null)
								{
									if(otherPlayer.isDead || otherData.team == Team.spectators)
									{
										continue;
									}
									int snapshotToTry = player instanceof EntityPlayerMP ? ((EntityPlayerMP)player).ping / 50 : 0;
									if(snapshotToTry >= otherData.snapshots.length)
										snapshotToTry = otherData.snapshots.length - 1;
									
									PlayerSnapshot snapshot = otherData.snapshots[snapshotToTry];
									if(snapshot == null)
										snapshot = otherData.snapshots[0];
									
									//DEBUG
									//snapshot = new PlayerSnapshot(player);
									
									//Check one last time for a null snapshot. If this is the case, fall back to normal hit detection
									if(snapshot == null)
										shouldDoNormalHitDetect = true;
									else
									{
										//Raytrace
										ArrayList<BulletHit> playerHits = snapshot.raytrace(data.lastMeleePositions[k] == null ? nextPosInWorldCoords : data.lastMeleePositions[k], dPos);
										hits.addAll(playerHits);
									}
								}
								
								//If we couldn't get a snapshot, use normal entity hitbox calculations
								if(otherData == null || shouldDoNormalHitDetect)
								{
									RayTraceResult mop = data.lastMeleePositions[k] == null ? player.getEntityBoundingBox().calculateIntercept(nextPosInWorldCoords.toVec3(), new Vec3d(0F, 0F, 0F)) : player.getBoundingBox().calculateIntercept(data.lastMeleePositions[k].toVec3(), nextPosInWorldCoords.toVec3());
									if(mop != null)
									{
										Vector3f hitPoint = new Vector3f(mop.hitVec.x - data.lastMeleePositions[k].x, mop.hitVec.y - data.lastMeleePositions[k].y, mop.hitVec.z - data.lastMeleePositions[k].z);
										float hitLambda = 1F;
										if(dPos.x != 0F)
											hitLambda = hitPoint.x / dPos.x;
										else if(dPos.y != 0F)
											hitLambda = hitPoint.y / dPos.y;
										else if(dPos.z != 0F)
											hitLambda = hitPoint.z / dPos.z;
										if(hitLambda < 0)
											hitLambda = -hitLambda;
										
										hits.add(new PlayerBulletHit(new PlayerHitbox(otherPlayer, new RotatedAxes(), new Vector3f(), new Vector3f(), new Vector3f(), EnumHitboxType.BODY), hitLambda));
									}
								}
							}
							else
							{
								Entity entity = (Entity)obj;
								if(entity != player && !entity.isDead && (entity instanceof EntityLivingBase || entity instanceof EntityAAGun))
								{
									RayTraceResult mop = entity.getEntityBoundingBox().calculateIntercept(data.lastMeleePositions[k].toVec3(), nextPosInWorldCoords.toVec3());
									if(mop != null)
									{
										Vector3f hitPoint = new Vector3f(mop.hitVec.x - data.lastMeleePositions[k].x, mop.hitVec.y - data.lastMeleePositions[k].y, mop.hitVec.z - data.lastMeleePositions[k].z);
										float hitLambda = 1F;
										if(dPos.x != 0F)
											hitLambda = hitPoint.x / dPos.x;
										else if(dPos.y != 0F)
											hitLambda = hitPoint.y / dPos.y;
										else if(dPos.z != 0F)
											hitLambda = hitPoint.z / dPos.z;
										if(hitLambda < 0)
											hitLambda = -hitLambda;
										
										hits.add(new EntityHit(entity, hitLambda));
									}
								}
							}
						}
						
						//We hit something
						if(!hits.isEmpty())
						{
							//Sort the hits according to the intercept position
							Collections.sort(hits);
							
							float swingDistance = dPos.length();
							
							for(BulletHit bulletHit : hits)
							{
								if(bulletHit instanceof PlayerBulletHit)
								{
									PlayerBulletHit playerHit = (PlayerBulletHit)bulletHit;
									float damageMultiplier = 1F;
									switch(playerHit.hitbox.type)
									{
									case LEFTITEM : case RIGHTITEM : //Hit a shield. Stop the swing. 
									{
										data.meleeProgress = data.meleeLength = 0;
										return;
									}
									case HEAD : damageMultiplier = 2F; break;
									case RIGHTARM : case LEFTARM : damageMultiplier = 0.6F; break;
									default :
									}
									
									if(playerHit.hitbox.player.attackEntityFrom(getMeleeDamage(player), swingDistance * type.meleeDamage))
									{
										//If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
										playerHit.hitbox.player.arrowHitTimer++;
										playerHit.hitbox.player.hurtResistantTime = playerHit.hitbox.player.maxHurtResistantTime / 2;
									}
									
									if(FlansMod.DEBUG)
										world.spawnEntity(new EntityDebugDot(world, new Vector3f(data.lastMeleePositions[k].x + dPos.x * playerHit.intersectTime, data.lastMeleePositions[k].y + dPos.y * playerHit.intersectTime, data.lastMeleePositions[k].z + dPos.z * playerHit.intersectTime), 1000, 1F, 0F, 0F));
								}
								else if(bulletHit instanceof EntityHit)
								{
									EntityHit entityHit = (EntityHit)bulletHit;
									if(entityHit.entity.attackEntityFrom(DamageSource.causePlayerDamage(player), swingDistance * type.meleeDamage) && entityHit.entity instanceof EntityLivingBase)
									{
										EntityLivingBase living = (EntityLivingBase)entityHit.entity;
										//If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
										living.arrowHitTimer++;
										living.hurtResistantTime = living.maxHurtResistantTime / 2;
									}
									
									if(FlansMod.DEBUG)
										world.spawnEntity(new EntityDebugDot(world, new Vector3f(data.lastMeleePositions[k].x + dPos.x * entityHit.intersectTime, data.lastMeleePositions[k].y + dPos.y * entityHit.intersectTime, data.lastMeleePositions[k].z + dPos.z * entityHit.intersectTime), 1000, 1F, 0F, 0F));
								}
							}	
						}
					}
					//End raytrace
					
					data.lastMeleePositions[k] = nextPosInWorldCoords;
				}
				
				//Increment the progress meter
				data.meleeProgress++;
				//If we are done, reset the counters
				if(data.meleeProgress == data.meleeLength)
					data.meleeProgress = data.meleeLength = 0;
			}
		}
	}
	 
	 * 
	 */
	
	private boolean needsToReload(ItemStack stack)
	{
		for(int i = 0; i < type.numAmmoItemsInGun; i++)
		{
			ItemStack bulletStack = getBulletItemStack(stack, i);
			if(bulletStack != null && !bulletStack.isEmpty() && bulletStack.getItemDamage() < bulletStack.getMaxDamage())
			{
				return false;
			}
		}
		return true;
	}
	
	public boolean CanReload(ItemStack gunstack, IInventory inventory)
	{
		for(int i = 0; i < inventory.getSizeInventory(); i++)
		{
			ItemStack stack = inventory.getStackInSlot(i);
			if(type.isAmmo(stack))
			{
				return true;
			}
		}
		return false;
	}
	
	private ItemStack getBestNonEmptyShootableStack(ItemStack stack)
	{
		for(int i = 0; i < type.numAmmoItemsInGun; i++)
		{
			ItemStack shootableStack = getBulletItemStack(stack, i);
			if(shootableStack != null && !shootableStack.isEmpty() && shootableStack.getItemDamage() < shootableStack.getMaxDamage())
			{
				return shootableStack;
			}
		}
		return null;
	}
	
	
	// _____________________________________________________________________________
	//
	// Minecraft base item overrides
	// _____________________________________________________________________________
	
	@Override
	public void addInformation(ItemStack stack, World world, List<String> lines, ITooltipFlag b)
	{
		if(type.description != null)
		{
			Collections.addAll(lines, type.description.split("_"));
		}
		if(type.showDamage)
			lines.add("\u00a79Damage" + "\u00a77: " + type.getDamage(stack));
		if(type.showRecoil)
			lines.add("\u00a79Recoil" + "\u00a77: " + type.getRecoil(stack));
		if(type.showSpread)
			lines.add("\u00a79Accuracy" + "\u00a77: " + type.getSpread(stack));
		if(type.showReloadTime)
			lines.add("\u00a79Reload Time" + "\u00a77: " + type.getReloadTime(stack) / 20 + "s");
		for(AttachmentType attachment : type.getCurrentAttachments(stack))
		{
			if(type.showAttachments)
			{
				String line = attachment.name;
				lines.add(line);
			}
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
	
	@Override
	/** Make sure client and server side NBTtags update */
	public boolean getShareTag()
	{
		return true;
	}
	
	public DamageSource getMeleeDamage(EntityPlayer attacker)
	{
		return new EntityDamageSourceGun(type.shortName, attacker, attacker, type, false);
	}
	
	private boolean isSolid(World world, int i, int j, int k)
	{
		IBlockState state = world.getBlockState(new BlockPos(i, j, k));
		return state.getMaterial().isSolid() && state.isOpaqueCube();
	}
	
	//Stop damage being done to entities when scoping etc.
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
	{
		return type.secondaryFunction != EnumSecondaryFunction.MELEE;
	}
	
	@Override
	public boolean hasCustomEntity(ItemStack stack)
	{
		return true;
	}
	
	@Nullable
	@Override
	public Entity createEntity(World world, Entity location, ItemStack itemstack)
	{
		return new EntityItemCustomRender(location, itemstack);
	}
	
	@Override
	public boolean isFull3D()
	{
		return true;
	}
	
	@Override
	public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack)
	{
		if(type.meleeSound != null)
			PacketPlaySound.sendSoundPacket(entityLiving.posX, entityLiving.posY, entityLiving.posZ, FlansMod.soundRange, entityLiving.dimension, type.meleeSound, true);
		//Do custom melee code here
		if(type.secondaryFunction == EnumSecondaryFunction.CUSTOM_MELEE)
		{
			//Do animation
			if(entityLiving.world.isRemote)
			{
				GunAnimations animations = FlansModClient.getGunAnimations(entityLiving, EnumHand.MAIN_HAND);
				animations.doMelee(type.meleeTime);
			}
			//Do custom melee hit detection
			if(entityLiving instanceof EntityPlayer)
			{
				PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)entityLiving);
				data.doMelee((EntityPlayer)entityLiving, type.meleeTime, type);
			}
		}
		return type.secondaryFunction != EnumSecondaryFunction.MELEE;
	}
	
	@Override
	public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, EntityPlayer player)
	{
		World world = player.world;
		if(!world.isRemote)
		{
			// Client will still render block break if player is in creative so update block state
			IBlockState state = world.getBlockState(pos);
			world.notifyBlockUpdate(pos, state, state, 3);
		}
		return true;
	}
	
	@Override
	public boolean canHarvestBlock(IBlockState state, ItemStack stack)
	{
		return false;
	}
	
	public boolean isItemStackDamageable()
	{
		return true;
	}
	
	// ----------------- Paintjobs -----------------
	
	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		if(tab != FlansMod.tabFlanGuns && tab != CreativeTabs.SEARCH)
			return;
		
		PaintableType type = ((IPaintableItem)this).GetPaintableType();
		if(FlansMod.addAllPaintjobsToCreative)
		{
			for(Paintjob paintjob : type.paintjobs)
				addPaintjobToList(this, type, paintjob, items);
		}
		else addPaintjobToList(this, type, type.defaultPaintjob, items);
	}
	
	private void addPaintjobToList(Item item, PaintableType type, Paintjob paintjob, List<ItemStack> list)
	{
		ItemStack paintableStack = new ItemStack(item, 1, paintjob.ID);
		NBTTagCompound tags = new NBTTagCompound();
		paintableStack.setTagCompound(tags);
		list.add(paintableStack);
	}
	
	// ---------------------------------------------
	
	@Override
	public int getMaxItemUseDuration(ItemStack par1ItemStack)
	{
		return 100;
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
		return EnumAction.BOW;
	}
	
	protected static final UUID KNOCKBACK_RESIST_MODIFIER = UUID.fromString("77777777-645C-4F38-A497-9C13A33DB5CF");
	protected static final UUID MOVEMENT_SPEED_MODIFIER = UUID.fromString("99999999-4180-4865-B01B-BCCE9785ACA3");
	
	@Override
	public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot, ItemStack stack)
	{
		Multimap<String, AttributeModifier> multimap = super.getAttributeModifiers(slot, stack);
		if(slot == EntityEquipmentSlot.MAINHAND)
		{
			multimap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName(), new AttributeModifier(KNOCKBACK_RESIST_MODIFIER, "KnockbackResist", type.knockbackModifier, 0));
			multimap.put(SharedMonsterAttributes.MOVEMENT_SPEED.getName(), new AttributeModifier(MOVEMENT_SPEED_MODIFIER, "MovementSpeed", type.moveSpeedModifier - 1.0f, 2));
			multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", type.meleeDamage, 0));
		}
		return multimap;
	}
	
	@Override
	public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged)
	{
		return slotChanged;
	}
	
	// For when we have custom paintjob names
	//@Override
	//public String getTranslationKey(ItemStack stack)
	//{
	//    return getTranslationKey();//stack.getTagCompound().getString("Paint");
	//}
	
	@Override
	public boolean canItemEditBlocks()
	{
		return false;
	}
}
