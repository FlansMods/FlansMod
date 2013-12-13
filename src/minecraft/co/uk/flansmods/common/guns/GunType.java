package co.uk.flansmods.common.guns;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import co.uk.flansmods.client.model.ModelGun;
import co.uk.flansmods.client.model.ModelMG;
import co.uk.flansmods.client.model.ModelMecha;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.InfoType;
import co.uk.flansmods.common.TypeFile;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GunType extends InfoType implements IScope
{
	//Gun Behaviour Variables
	/** The list of bullet types that can be used in this gun */
	public List<BulletType> ammo = new ArrayList<BulletType>();
	/** Whether the player can press the reload key (default R) to reload this gun */
	public boolean canForceReload = true;
	/** The time (in ticks) it takes to reload this gun */
	public int reloadTime;
	/** The amount to recoil the player's view by when firing a single shot from this gun */
	public int recoil;
	/** The amount that bullets spread out when fired from this gun */
	public float bulletSpread;
	/** Damage inflicted by this gun. Multiplied by the bullet damage. */
	public float damage = 0;
	/** The damage inflicted upon punching someone with this gun */
	public float meleeDamage = 1;
	/** The speed of bullets upon leaving this gun */
	public float bulletSpeed = 3.0F;
	/** The number of bullet entities created by each shot */
	public int numBullets = 1;
	/** The delay between shots in ticks (1/20ths of seconds) */
	public int shootDelay = 0;
	/** Number of ammo items that the gun may hold. Most guns will hold one magazine.
	 * Some may hold more, such as Nerf pistols, revolvers or shotguns */
	public int numAmmoItemsInGun = 1;
	/** The firing mode of the gun. Currently semi auto or full auto. Burst coming soon maybe */
	public EnumFireMode mode = EnumFireMode.FULLAUTO;
	/** Whether this gun can be used underwater */
	public boolean canShootUnderwater = true;
	
	//Sounds
	/** The sound played upon shooting */
	public String shootSound;
	/** The length of the sound for looping sounds */
	public int shootSoundLength;
	/** Whether to distort the sound or not. Generally only set to false for looping sounds */
	public boolean distortSound = true;
	/** The sound to play upon reloading */
	public String reloadSound;
	
	//Deployable Settings
	/** If true, then the bullet does not shoot when right clicked, but must instead be placed on the ground */
	public boolean deployable = false;
	/** The deployable model */
	@SideOnly(Side.CLIENT)
	public ModelMG deployableModel;
	/** The deployable model's texture*/
	public String deployableTexture;
	/** Various deployable settings controlling the player view limits and standing position */
	public float standBackDist = 1.5F, topViewLimit = -60F, bottomViewLimit = 30F, sideViewLimit = 45F, pivotHeight = 0.375F;
	
	//Default Scope Settings. Overriden by scope attachments
	//In many cases, this will simply be iron sights
	/** Default scope overlay texture */
	public String defaultScopeTexture;
	/** Whether the default scope has an overlay */
	public boolean hasScopeOverlay = false;
	/** The zoom level of the default scope */
	public float zoomLevel = 1.0F;
	/** The FOV zoom level of the default scope */
	public float FOVFactor = 1.5F;
	
	/** For guns with 3D models */
	@SideOnly(Side.CLIENT)
	public ModelGun model;
	/** For making detailed models and scaling down */
	public float modelScale = 1F;
	
	//Attachment settings
	/** If this is true, then all attachments are allowed. Otherwise the list is checked */
	public boolean allowAllAttachments = false;
	/** The list of allowed attachments for this gun */
	public ArrayList<AttachmentType> allowedAttachments = new ArrayList<AttachmentType>();
	/** Whether each attachment slot is available */
	public boolean allowBarrelAttachments = false, allowScopeAttachments = false, 
			allowStockAttachments = false, allowGripAttachments = false;
	/** The number of generic attachment slots there are on this gun */
	public int numGenericAttachmentSlots = 0;
	
	/** The static list of all guns */
	public static List<GunType> guns = new ArrayList<GunType>();

	public GunType(TypeFile file)
	{
		super(file);
		guns.add(this);
	}
	
	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if (split[0].equals("Damage"))
				damage = Float.parseFloat(split[1]);
			if (split[0].equals("MeleeDamage"))
				meleeDamage = Float.parseFloat(split[1]);
			if (split[0].equals("CanForceReload"))
				canForceReload = Boolean.parseBoolean(split[1].toLowerCase());
			if (split[0].equals("ReloadTime"))
				reloadTime = Integer.parseInt(split[1]);
			if (split[0].equals("Recoil"))
				recoil = Integer.parseInt(split[1]);
			if (split[0].equals("Accuracy") || split[0].equals("Spread"))
				bulletSpread = Float.parseFloat(split[1]);
			if (split[0].equals("NumBullets"))
				numBullets = Integer.parseInt(split[1]);
			if (split[0].equals("ShootDelay"))
				shootDelay = Integer.parseInt(split[1]);
			if (split[0].equals("SoundLength"))
				shootSoundLength = Integer.parseInt(split[1]);
			if (split[0].equals("DistortSound"))
				distortSound = split[1].equals("True");
			if (split[0].equals("ShootSound"))
			{
				shootSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
			}
			if (split[0].equals("ReloadSound"))
			{
				reloadSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
			}
			if (split[0].equals("Mode"))
				mode = split[1].equals("FullAuto") ? EnumFireMode.FULLAUTO : EnumFireMode.SEMIAUTO;
			if (split[0].equals("Scope"))
			{
				hasScopeOverlay = true;
				if (split[1].equals("None"))
					hasScopeOverlay = false;
				else defaultScopeTexture = split[1];
			}
			if (split[0].equals("ZoomLevel"))
				zoomLevel = Float.parseFloat(split[1]);
			if (split[0].equals("FOVZoomLevel"))
				FOVFactor = Float.parseFloat(split[1]);
			if (split[0].equals("Deployable"))
				deployable = split[1].equals("True");
			if (FMLCommonHandler.instance().getSide().isClient() && deployable && split[0].equals("DeployedModel"))
			{
				deployableModel = FlansMod.proxy.loadModel(split[1], shortName, ModelMG.class);
			}
			if (FMLCommonHandler.instance().getSide().isClient() && (split[0].equals("Model")))
			{
				model = FlansMod.proxy.loadModel(split[1], shortName, ModelGun.class);
			}
			if(split[0].equals("ModelScale"))
				modelScale = Float.parseFloat(split[1]);
			if (split[0].equals("Texture"))
				texture = split[1];
			if (split[0].equals("DeployedTexture"))
				deployableTexture = split[1];
			if (split[0].equals("StandBackDistance"))
				standBackDist = Float.parseFloat(split[1]);
			if (split[0].equals("TopViewLimit"))
				topViewLimit = -Float.parseFloat(split[1]);
			if (split[0].equals("BottomViewLimit"))
				bottomViewLimit = Float.parseFloat(split[1]);
			if (split[0].equals("SideViewLimit"))
				sideViewLimit = Float.parseFloat(split[1]);
			if (split[0].equals("PivotHeight"))
				pivotHeight = Float.parseFloat(split[1]);
			if (split[0].equals("Ammo"))
			{
				BulletType type = BulletType.getBullet(split[1]);
				if(type != null)
					ammo.add(type);
			}
			if (split[0].equals("NumAmmoSlots") || split[0].equals("NumAmmoItemsInGun") || split[0].equals("LoadIntoGun"))
				numAmmoItemsInGun = Integer.parseInt(split[1]);
			if (split[0].equals("BulletSpeed"))
				bulletSpeed = Float.parseFloat(split[1]);
			if (split[0].equals("CanShootUnderwater"))
				canShootUnderwater = Boolean.parseBoolean(split[1].toLowerCase());
			
			//Attachment settings
			if(split[0].equals("AllowAllAttachments"))
				allowAllAttachments = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("AllowAttachments"))
			{
				for(int i = 1; i < split.length; i++)
				{
					allowedAttachments.add(AttachmentType.getAttachment(split[i]));
				}
			}
			if(split[0].equals("AllowBarrelAttachments"))
				allowBarrelAttachments = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("AllowScopeAttachments"))
				allowScopeAttachments = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("AllowStockAttachments"))
				allowStockAttachments = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("AllowGripAttachments"))
				allowGripAttachments = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("NumGenericAttachmentSlots"))
				numGenericAttachmentSlots = Integer.parseInt(split[1]);
		} 
		catch (Exception e)
		{
			System.out.println("Reading gun file failed.");
			e.printStackTrace();
		}
	}
	
	public boolean isAmmo(BulletType type)
	{
		return ammo.contains(type);
	}

	public boolean isAmmo(ItemStack stack)
	{
		if (stack == null)
			return false;
		if (stack.getItem() instanceof ItemBullet)
		{
			return isAmmo(((ItemBullet) stack.getItem()).type);
		}
		return false;
	}
	
	/** To be overriden by subtypes for model reloading */
	public void reloadModel()
	{
		model = FlansMod.proxy.loadModel(modelString, shortName, ModelGun.class);
	}

	@Override
	public float getZoomFactor() 
	{
		return zoomLevel;
	}

	@Override
	public boolean hasZoomOverlay() 
	{
		return hasScopeOverlay;
	}

	@Override
	public String getZoomOverlay() 
	{
		return defaultScopeTexture;
	}

	@Override
	public float getFOVFactor()
	{
		return FOVFactor;
	}
	
	//ItemStack specific methods
	
	/** Return the currently active scope on this gun. Search attachments, and by default, simply give the gun */
	public IScope getCurrentScope(ItemStack gunStack)
	{
		IScope attachedScope = getScope(gunStack);
		return attachedScope == null ? this : attachedScope;
	}
	
	/** Returns all attachments currently attached to the specified gun */
	public ArrayList<AttachmentType> getCurrentAttachments(ItemStack gun)
	{
		checkForTags(gun);
		ArrayList<AttachmentType> attachments = new ArrayList<AttachmentType>();
		NBTTagCompound attachmentTags = gun.stackTagCompound.getCompoundTag("attachments");
		NBTTagList genericsList = attachmentTags.getTagList("generics");
		for(int i = 0; i < numGenericAttachmentSlots; i++)
		{
			appendToList(gun, "generic_" + i, attachments);
		}
		appendToList(gun, "barrel", attachments);
		appendToList(gun, "scope", attachments);
		appendToList(gun, "stock", attachments);
		appendToList(gun, "grip", attachments);
		return attachments;
	}
	
	/** Private method for attaching attachments to a list of attachments with a nullcheck */
	private void appendToList(ItemStack gun, String name, ArrayList<AttachmentType> attachments)
	{
		AttachmentType type = getAttachment(gun, name);
		if(type != null) attachments.add(type);
	}
	
	//Attachment getter methods
	public AttachmentType getBarrel(ItemStack gun) { return getAttachment(gun, "barrel"); }
	public AttachmentType getScope(ItemStack gun) { return getAttachment(gun, "scope"); }
	public AttachmentType getStock(ItemStack gun) { return getAttachment(gun, "stock"); }
	public AttachmentType getGrip(ItemStack gun) { return getAttachment(gun, "grip"); }
	public AttachmentType getGeneric(ItemStack gun, int i) { return getAttachment(gun, "generic_" + i); }
	
	/** Generalised attachment getter method */
	public AttachmentType getAttachment(ItemStack gun, String name)
	{
		checkForTags(gun);
		return AttachmentType.getFromNBT(gun.stackTagCompound.getCompoundTag("attachments").getCompoundTag(name));	
	}
	
	/** Method to check for null tags and assign default empty tags in that case */
	private void checkForTags(ItemStack gun)
	{
		//If the gun has no tags, give it some
		if(!gun.hasTagCompound())
		{
			gun.stackTagCompound = new NBTTagCompound("tag");
		}
		//If the gun has no attachment tags, give it some
		if(!gun.stackTagCompound.hasKey("attachments"))
		{
			NBTTagCompound attachmentTags = new NBTTagCompound("attachments");
			for(int i = 0; i < numGenericAttachmentSlots; i++)
				attachmentTags.setCompoundTag("generic_" + i, new NBTTagCompound());
			attachmentTags.setCompoundTag("barrel", new NBTTagCompound());
			attachmentTags.setCompoundTag("scope", new NBTTagCompound());
			attachmentTags.setCompoundTag("stock", new NBTTagCompound());
			attachmentTags.setCompoundTag("grip", new NBTTagCompound());
			
			gun.stackTagCompound.setCompoundTag("attachments", attachmentTags);
		}
	}
	
	/** Get the melee damage of a specific gun, taking into account attachments */
	public float getMeleeDamage(ItemStack stack)
	{
		float stackMeleeDamage = meleeDamage;
		for(AttachmentType attachment : getCurrentAttachments(stack))
		{
			stackMeleeDamage *= attachment.meleeDamageMultiplier;
		}
		return stackMeleeDamage;
	}
	
	/** Get the damage of a specific gun, taking into account attachments */
	public float getDamage(ItemStack stack)
	{
		float stackDamage = damage;
		for(AttachmentType attachment : getCurrentAttachments(stack))
		{
			stackDamage *= attachment.damageMultiplier;
		}
		return stackDamage;
	}

	/** Get the bullet spread of a specific gun, taking into account attachments */
	public float getSpread(ItemStack stack)
	{
		float stackSpread = bulletSpread;
		for(AttachmentType attachment : getCurrentAttachments(stack))
		{
			stackSpread *= attachment.spreadMultiplier;
		}
		return stackSpread;
	}
	
	/** Get the recoil of a specific gun, taking into account attachments */
	public float getRecoil(ItemStack stack)
	{
		float stackRecoil = recoil;
		for(AttachmentType attachment : getCurrentAttachments(stack))
		{
			stackRecoil *= attachment.recoilMultiplier;
		}
		return stackRecoil;
	}
	
	/** Get the bullet speed of a specific gun, taking into account attachments */
	public float getBulletSpeed(ItemStack stack)
	{
		float stackBulletSpeed = bulletSpeed;
		for(AttachmentType attachment : getCurrentAttachments(stack))
		{
			stackBulletSpeed *= attachment.bulletSpeedMultiplier;
		}
		return stackBulletSpeed;
	}
	
	/** Get the reload time of a specific gun, taking into account attachments */
	public float getReloadTime(ItemStack stack)
	{
		float stackReloadTime = reloadTime;
		for(AttachmentType attachment : getCurrentAttachments(stack))
		{
			stackReloadTime *= attachment.reloadTimeMultiplier;
		}
		return stackReloadTime;
	}

	/** Static String to GunType method */
	public static GunType getGun(String s)
	{
		for (GunType gun : guns)
		{
			if (gun.shortName.equals(s))
				return gun;
		}
		return null;
	}
}