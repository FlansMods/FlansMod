package co.uk.flansmods.common.guns;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import co.uk.flansmods.client.model.ModelAAGun;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.InfoType;
import co.uk.flansmods.common.ItemBullet;
import co.uk.flansmods.common.TypeFile;
import co.uk.flansmods.common.driveables.PlaneType;

import net.minecraft.client.model.ModelBase;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.FMLCommonHandler;

public class AAGunType extends InfoType
{
	public List<BulletType> ammo = new ArrayList<BulletType>();
	public int reloadTime;
	public int recoil = 5;
	public int accuracy;
	public int damage;
	public int shootDelay;
	public int numBarrels;
	public boolean fireAlternately;
	public int health;
	public int gunnerX;
	public int gunnerY;
	public int gunnerZ;
	public String shootSound;
	public String reloadSound;
	public ModelAAGun model;
	public float topViewLimit = 75F;
	public float bottomViewLimit = 0F;
	public int[] barrelX, barrelY, barrelZ;
	public static List<AAGunType> infoTypes = new ArrayList<AAGunType>();

	public AAGunType(TypeFile file)
	{
		super(file);
		infoTypes.add(this);
	}

	@Override
	protected void read(String[] arg0, TypeFile file)
	{
		super.read(arg0, file);
		try
		{
			if (FMLCommonHandler.instance().getSide().isClient() && arg0[0].equals("Model"))
			{
				model = FlansMod.proxy.loadModel(arg0, shortName, ModelAAGun.class);
			}
			if (arg0[0].equals("Texture"))
			{
				texture = arg0[1];
			}
			if (arg0[0].equals("Damage"))
			{
				damage = Integer.parseInt(arg0[1]);
			}
			if (arg0[0].equals("ReloadTime"))
			{
				reloadTime = Integer.parseInt(arg0[1]);
			}
			if (arg0[0].equals("Recoil"))
			{
				recoil = Integer.parseInt(arg0[1]);
			}
			if (arg0[0].equals("Accuracy"))
			{
				accuracy = Integer.parseInt(arg0[1]);
			}
			if (arg0[0].equals("ShootDelay"))
			{
				shootDelay = Integer.parseInt(arg0[1]);
			}
			if (arg0[0].equals("ShootSound"))
			{
				shootSound = "aaguns." + arg0[1];
				FlansMod.proxy.loadSound(contentPack, "aaguns", arg0[1]);
			}
			if (arg0[0].equals("ReloadSound"))
			{
				reloadSound = "aaguns." + arg0[1];
				FlansMod.proxy.loadSound(contentPack, "aaguns", arg0[1]);
			}
			if (arg0[0].equals("FireAlternately"))
			{
				fireAlternately = arg0[1].equals("True");
			}
			if (arg0[0].equals("NumBarrels"))
			{
				numBarrels = Integer.parseInt(arg0[1]);
				barrelX = new int[numBarrels];
				barrelY = new int[numBarrels];
				barrelZ = new int[numBarrels];
			}
			if(arg0[0].equals("Barrel"))
			{
				int id = Integer.parseInt(arg0[1]);
				barrelX[id] = Integer.parseInt(arg0[2]);
				barrelY[id] = Integer.parseInt(arg0[3]);
				barrelZ[id] = Integer.parseInt(arg0[4]);
			}
			if (arg0[0].equals("Health"))
			{
				health = Integer.parseInt(arg0[1]);
			}
			if (arg0[0].equals("TopViewLimit"))
			{
				topViewLimit = Float.parseFloat(arg0[1]);
			}
			if (arg0[0].equals("BottomViewLimit"))
			{
				bottomViewLimit = Float.parseFloat(arg0[1]);
			}
			if (arg0[0].equals("Ammo"))
			{
				BulletType type = BulletType.getBullet(arg0[1]);
				if (type != null)
				{
					ammo.add(type);
				}
			}
			if (arg0[0].equals("GunnerPos"))
			{
				gunnerX = Integer.parseInt(arg0[1]);
				gunnerY = Integer.parseInt(arg0[2]);
				gunnerZ = Integer.parseInt(arg0[3]);
			}

		} catch (Exception e)
		{
			FlansMod.log("" + e);
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

	public static AAGunType getAAGun(String s)
	{
		for (AAGunType gun : infoTypes)
		{
			if (gun.shortName.equals(s))
				return gun;
		}
		return null;
	}
}
