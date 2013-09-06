package co.uk.flansmods.common.guns;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;
import co.uk.flansmods.client.model.ModelMG;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.InfoType;
import co.uk.flansmods.common.ItemBullet;
import co.uk.flansmods.common.TypeFile;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GunType extends InfoType
{
	public List<BulletType> ammo = new ArrayList<BulletType>();
	public boolean canForceReload = true;
	public int reloadTime;
	public int recoil;
	public int accuracy;
	public int damage;
	public int meleeDamage = 1;
	public float speed = 3.0F;
	public int numBullets = 1;
	public int shootDelay;
	public String shootSound;
	public int shootSoundLength;
	public boolean distortSound = true;
	public String reloadSound;
	/** Number of ammo items that the gun may hold. Most guns will hold one magazine.
	 * Some may hold more, such as Nerf pistols, revolvers or shotguns */
	public int numAmmoItemsInGun = 1;
	public boolean deployable;
	public int mode; // 0 = SemiAuto, 1 = FullAuto
	public String scope;
	public boolean hasScope;
	public float zoomLevel = 8.0F;
	
	@SideOnly(Side.CLIENT)
	public ModelMG model;
	
	public float standBackDist = 1.5F;
	public float topViewLimit = -60F;
	public float bottomViewLimit = 30F;
	public float sideViewLimit = 45F;
	public float pivotHeight = 0.375F;
	public boolean canShootUnderwater;
	public static List<GunType> guns = new ArrayList<GunType>();

	public GunType(TypeFile file)
	{
		super(file);
		guns.add(this);
	}
	
	@Override
	protected void read(String[] arg0, TypeFile file)
	{
		super.read(arg0, file);
		try
		{
			if (arg0[0].equals("Damage"))
				damage = Integer.parseInt(arg0[1]);
			if (arg0[0].equals("MeleeDamage"))
				meleeDamage = Integer.parseInt(arg0[1]);
			if (arg0[0].equals("CanForceReload"))
				canForceReload = Boolean.parseBoolean(arg0[1].toLowerCase());
			if (arg0[0].equals("ReloadTime"))
				reloadTime = Integer.parseInt(arg0[1]);
			if (arg0[0].equals("Recoil"))
				recoil = Integer.parseInt(arg0[1]);
			if (arg0[0].equals("Accuracy"))
				accuracy = Integer.parseInt(arg0[1]);
			if (arg0[0].equals("NumBullets"))
				numBullets = Integer.parseInt(arg0[1]);
			if (arg0[0].equals("ShootDelay"))
				shootDelay = Integer.parseInt(arg0[1]);
			if (arg0[0].equals("SoundLength"))
				shootSoundLength = Integer.parseInt(arg0[1]);
			if (arg0[0].equals("DistortSound"))
				distortSound = arg0[1].equals("True");
			if (arg0[0].equals("ShootSound"))
			{
				shootSound = arg0[1];
				FlansMod.proxy.loadSound(contentPack, "guns", arg0[1]);
			}
			if (arg0[0].equals("ReloadSound"))
			{
				reloadSound = arg0[1];
				FlansMod.proxy.loadSound(contentPack, "guns", arg0[1]);
			}
			if (arg0[0].equals("Mode"))
				mode = arg0[1].equals("FullAuto") ? 1 : 0;
			if (arg0[0].equals("Scope"))
			{
				hasScope = true;
				if (arg0[1].equals("None"))
					hasScope = false;
				scope = arg0[1];
			}
			if (arg0[0].equals("ZoomLevel"))
				zoomLevel = Float.parseFloat(arg0[1]);
			if (arg0[0].equals("Deployable"))
				deployable = arg0[1].equals("True");
			if (FMLCommonHandler.instance().getSide().isClient() && arg0[0].equals("DeployedModel") && deployable)
			{
				model = FlansMod.proxy.loadModel(arg0, shortName, ModelMG.class);
			}
			if (arg0[0].equals("DeployedTexture"))
				texture = arg0[1];
			if (arg0[0].equals("StandBackDistance"))
				standBackDist = Float.parseFloat(arg0[1]);
			if (arg0[0].equals("TopViewLimit"))
				topViewLimit = -Float.parseFloat(arg0[1]);
			if (arg0[0].equals("BottomViewLimit"))
				bottomViewLimit = Float.parseFloat(arg0[1]);
			if (arg0[0].equals("SideViewLimit"))
				sideViewLimit = Float.parseFloat(arg0[1]);
			if (arg0[0].equals("PivotHeight"))
				pivotHeight = Float.parseFloat(arg0[1]);
			if (arg0[0].equals("Ammo"))
			{
				BulletType type = BulletType.getBullet(arg0[1]);
				if(type != null)
					ammo.add(type);
			}
			if (arg0[0].equals("NumAmmoSlots") || arg0[0].equals("NumAmmoItemsInGun") || arg0[0].equals("LoadIntoGun"))
				numAmmoItemsInGun = Integer.parseInt(arg0[1]);
			if (arg0[0].equals("BulletSpeed"))
				speed = Float.parseFloat(arg0[1]);
			if (arg0[0].equals("CanShootUnderwater"))
				canShootUnderwater = Boolean.parseBoolean(arg0[1]);
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
}