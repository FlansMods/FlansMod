package com.flansmod.common.guns;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.FMLCommonHandler;

import com.flansmod.client.model.ModelAAGun;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

public class AAGunType extends InfoType
{
	/** The ammo types used by this gun */
	public List<BulletType> ammo = new ArrayList<BulletType>();
	public int reloadTime;
	public int recoil = 5;
	public int accuracy;
	public int damage;
	public int shootDelay;
	public int numBarrels;
	public boolean fireAlternately;
	public int health;
	public int gunnerX, gunnerY, gunnerZ;
	public String shootSound;
	public String reloadSound;
	public ModelAAGun model;
	public float topViewLimit = 75F;
	public float bottomViewLimit = 0F;
	public int[] barrelX, barrelY, barrelZ;
	/** Sentry mode. If target players is true then it either targets everyone on the other team, or everyone other than the owner when not playing with teams */
	public boolean targetMobs = false, targetPlayers = false, targetVehicles = false, targetPlanes = false, targetMechas = false;
	/** Targeting radius */
	public float targetRange = 10F;
	/** If true, then all barrels share the same ammo slot */
	public boolean shareAmmo = false;
	
	public static List<AAGunType> infoTypes = new ArrayList<AAGunType>();

	public AAGunType(TypeFile file)
	{
		super(file);
		infoTypes.add(this);
	}

	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if (FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model"))
			{
				model = FlansMod.proxy.loadModel(split[1], shortName, ModelAAGun.class);
			}
			if (split[0].equals("Texture"))
			{
				texture = split[1];
			}
			if (split[0].equals("Damage"))
			{
				damage = Integer.parseInt(split[1]);
			}
			if (split[0].equals("ReloadTime"))
			{
				reloadTime = Integer.parseInt(split[1]);
			}
			if (split[0].equals("Recoil"))
			{
				recoil = Integer.parseInt(split[1]);
			}
			if (split[0].equals("Accuracy"))
			{
				accuracy = Integer.parseInt(split[1]);
			}
			if (split[0].equals("ShootDelay"))
			{
				shootDelay = Integer.parseInt(split[1]);
			}
			if (split[0].equals("ShootSound"))
			{
				shootSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "aaguns", split[1]);
			}
			if (split[0].equals("ReloadSound"))
			{
				reloadSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "aaguns", split[1]);
			}
			if (split[0].equals("FireAlternately"))
			{
				fireAlternately = split[1].equals("True");
			}
			if (split[0].equals("NumBarrels"))
			{
				numBarrels = Integer.parseInt(split[1]);
				barrelX = new int[numBarrels];
				barrelY = new int[numBarrels];
				barrelZ = new int[numBarrels];
			}
			if(split[0].equals("Barrel"))
			{
				int id = Integer.parseInt(split[1]);
				barrelX[id] = Integer.parseInt(split[2]);
				barrelY[id] = Integer.parseInt(split[3]);
				barrelZ[id] = Integer.parseInt(split[4]);
			}
			if (split[0].equals("Health"))
			{
				health = Integer.parseInt(split[1]);
			}
			if (split[0].equals("TopViewLimit"))
			{
				topViewLimit = Float.parseFloat(split[1]);
			}
			if (split[0].equals("BottomViewLimit"))
			{
				bottomViewLimit = Float.parseFloat(split[1]);
			}
			if (split[0].equals("Ammo"))
			{
				BulletType type = BulletType.getBullet(split[1]);
				if (type != null)
				{
					ammo.add(type);
				}
			}
			if (split[0].equals("GunnerPos"))
			{
				gunnerX = Integer.parseInt(split[1]);
				gunnerY = Integer.parseInt(split[2]);
				gunnerZ = Integer.parseInt(split[3]);
			}
			if(split[0].equals("TargetMobs"))
				targetMobs = Boolean.parseBoolean(split[1]);
			if(split[0].equals("TargetPlayers"))
				targetPlayers = Boolean.parseBoolean(split[1]);
			if(split[0].equals("TargetVehicles"))
				targetVehicles = Boolean.parseBoolean(split[1]);
			if(split[0].equals("TargetPlanes"))
				targetPlanes = Boolean.parseBoolean(split[1]);
			if(split[0].equals("TargetMechas"))
				targetMechas = Boolean.parseBoolean(split[1]);
			if(split[0].equals("TargetDriveables"))
				targetMechas = targetPlanes = targetVehicles = Boolean.parseBoolean(split[1]);
			if(split[0].equals("ShareAmmo"))
				shareAmmo = Boolean.parseBoolean(split[1]);
			if (split[0].equals("TargetRange"))
			{
				targetRange = Float.parseFloat(split[1]);
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

	public boolean isAmmo(ItemStack stack) {
		if (stack == null)
			return false;
		return stack.getItem() instanceof ItemBullet && isAmmo(((ItemBullet) stack.getItem()).type);
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
	
	/** To be overriden by subtypes for model reloading */
	public void reloadModel()
	{
		model = FlansMod.proxy.loadModel(modelString, shortName, ModelAAGun.class);
	}
}
