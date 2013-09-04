package co.uk.flansmods.common.guns;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.model.ModelBase;

import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.InfoType;
import co.uk.flansmods.common.TypeFile;

public class BulletType extends InfoType
{
	public Object model;
	public float fallSpeed = 1.0F;
	public int damageVsLiving = 0;
	public int damageVsDriveable = 0;
	public int explosion = 0;
	public boolean explodeOnImpact = false;
	public int fuse = 0;
	public int flak = 0;
	public int fire = 0;
	public String dropItemOnReload = null;
	public String dropItemOnShoot = null;
	public String dropItemOnHit = null;
	public boolean breaksGlass = false;
	public boolean penetratesEntities = false;
	public boolean penetratesBlocks = false;
	public String trailParticles = "smoke";
	public String flakParticles = "largeSmoke";
	public boolean smokeTrail = false;
	public boolean isBomb = false;
	public boolean isShell = false;
	public float hitBoxSize = 0.5F;
	public String hitSound;
	public int roundsPerItem = 1;
	public int maxStackSize = 1;
	public static List<BulletType> bullets = new ArrayList<BulletType>();

	public BulletType(TypeFile file)
	{
		super(file);
		texture = "defaultBullet";
		bullets.add(this);
	}

	@Override
	protected void read(String[] arg0, TypeFile file)
	{
		super.read(arg0, file);
		try
		{
			if (arg0[0].equals("Model"))
			{
				model = FlansMod.proxy.loadModel(arg0, shortName, ModelBase.class);
			}
			if (arg0[0].equals("Texture"))
				texture = arg0[1];
			if (arg0[0].equals("FallSpeed"))
				fallSpeed = Float.parseFloat(arg0[1]);
			if (arg0[0].equals("Damage") || arg0[0].equals("DamageVsLiving") || arg0[0].equals("DamageVsPlayer"))
				damageVsLiving = Integer.parseInt(arg0[1]);
			if (arg0[0].equals("DamageVsVehicles"))
				damageVsDriveable = Integer.parseInt(arg0[1]);
			if (arg0[0].equals("Explosion"))
				explosion = Integer.parseInt(arg0[1]);
			if (arg0[0].equals("FlakParticles"))
				flak = Integer.parseInt(arg0[1]);
			if (arg0[0].equals("Fire"))
				fire = Integer.parseInt(arg0[1]);
			if (arg0[0].equals("ExpodeOnImpact"))
				explodeOnImpact = arg0[1].equals("True");
			if (arg0[0].equals("Fuse"))
				fuse = Integer.parseInt(arg0[1]);
			if (arg0[0].equals("BreaksGlass"))
				breaksGlass = arg0[1].equals("True");
			if (arg0[0].equals("HitBoxSize"))
				hitBoxSize = Float.parseFloat(arg0[1]);
			if (arg0[0].equals("HitSound"))
				hitSound = arg0[1];
			if (arg0[0].equals("Penetrates"))
				penetratesEntities = arg0[1].equals("True");
			if (arg0[0].equals("SmokeTrail"))
				smokeTrail = arg0[1].equals("True");
			if (arg0[0].equals("RoundsPerItem"))
				roundsPerItem = Integer.parseInt(arg0[1]);
			if (arg0[0].equals("MaxStackSize"))
				maxStackSize = Integer.parseInt(arg0[1]);
			if (arg0[0].equals("Bomb"))
				isBomb = arg0[1].equals("True");
			if (arg0[0].equals("Shell"))
				isShell = arg0[1].equals("True");
			if (arg0[0].equals("DropItemOnShoot"))
				dropItemOnShoot = arg0[1];
			if (arg0[0].equals("DropItemOnReload"))
				dropItemOnReload = arg0[1];
			if (arg0[0].equals("DropItemOnHit"))
				dropItemOnHit = arg0[1];
		} catch (Exception e)
		{
			System.out.println("Reading bullet file failed.");
			e.printStackTrace();
		}
	}

	public static BulletType getBullet(String s)
	{
		for (BulletType bullet : bullets)
		{
			if (bullet.shortName.equals(s))
				return bullet;
		}
		return null;
	}

	public static BulletType getBullet(int id)
	{
		for (BulletType bullet : bullets)
		{
			if (bullet.itemID == id)
				return bullet;
		}
		return null;
	}
}
