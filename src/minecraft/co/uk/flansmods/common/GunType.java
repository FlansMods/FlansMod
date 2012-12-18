package co.uk.flansmods.common;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;
import co.uk.flansmods.client.model.ModelMG;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;


public class GunType extends InfoType
{
	public List<BulletType> ammo = new ArrayList<BulletType>();
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
	// When greater than 0, the ammo is placed in the gun item as the gun's
	// damage value and then fired from there.
	// This only works when the gun has only one ammo type
	public int loadIntoGun = 0;
	public int mode; // 0 = SemiAuto, 1 = FullAuto
	public String scope;
	public boolean hasScope;
	public float zoomLevel = 8.0F;
	
	@SideOnly(Side.CLIENT)
	public ModelMG model;
	
	public String texture;
	public boolean deployable;
	public float standBackDist = 1.5F;
	public float topViewLimit = -60F;
	public float bottomViewLimit = 30F;
	public float sideViewLimit = 45F;
	public float pivotHeight = 0.375F;
	private static int lastIconIndex = 0;
	public boolean canShootUnderwater;
	public static List<GunType> guns = new ArrayList<GunType>();

	public GunType(BufferedReader file, String pack)
	{
		super(pack);
		do
		{
			String line = null;
			try
			{
				line = file.readLine();
			} catch (Exception e)
			{
				break;
			}
			if (line == null)
			{
				break;
			}
			if (line.startsWith("//"))
				continue;
			String[] split = line.split(" ");
			if (split.length < 2)
				continue;
			read(split, file);
		} while (true);
		guns.add(this);
		iconIndex = lastIconIndex++;
	}

	protected void read(String[] arg0, BufferedReader file)
	{
		super.read(arg0, file);
		try
		{
			if (arg0[0].equals("Damage"))
				damage = Integer.parseInt(arg0[1]);
			if (arg0[0].equals("MeleeDamage"))
				meleeDamage = Integer.parseInt(arg0[1]);
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
				shootSound = "guns." + arg0[1];
				FMLClientHandler.instance().getClient().installResource("sound3/guns/" + arg0[1] + ".ogg", new File(FMLClientHandler.instance().getClient().mcDataDir, "/Flan/" + contentPack + "/sounds/" + arg0[1] + ".ogg"));
			}
			if (arg0[0].equals("ReloadSound"))
			{
				reloadSound = "guns." + arg0[1];
				FMLClientHandler.instance().getClient().installResource("sound3/guns/" + arg0[1] + ".ogg", new File(FMLClientHandler.instance().getClient().mcDataDir, "/Flan/" + contentPack + "/sounds/" + arg0[1] + ".ogg"));
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
			if (arg0[0].equals("DeployedModel") && deployable)
			{
				model = (ModelMG)FlansMod.proxy.loadMGModel(arg0, shortName);
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
				if (type != null)
					ammo.add(type);
			}
			if (arg0[0].equals("LoadIntoGun"))
				loadIntoGun = Integer.parseInt(arg0[1]);
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