package co.uk.flansmods.common.guns;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;
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
	public boolean canShootUnderwater;
	
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
	public boolean hasScopeOverlay;
	/** The zoom level of the default scope */
	public float zoomLevel = 1.0F;
	/** The FOV zoom level of the default scope */
	public float FOVFactor = 1.5F;
	
	/** For guns with 3D models */
	@SideOnly(Side.CLIENT)
	public ModelGun model;

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
				defaultScopeTexture = split[1];
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
				canShootUnderwater = Boolean.parseBoolean(split[1]);
		} catch (Exception e)
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

	public static GunType getGun(String s)
	{
		for (GunType gun : guns)
		{
			if (gun.shortName.equals(s))
				return gun;
		}
		return null;
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
}