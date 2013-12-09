package co.uk.flansmods.common.guns;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.model.ModelBase;

import co.uk.flansmods.client.model.ModelMecha;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.InfoType;
import co.uk.flansmods.common.TypeFile;

public class BulletType extends InfoType
{
	public Object model;
	public float fallSpeed = 1.0F;
	public int damageVsLiving = 1;
	public int damageVsDriveable = 1;
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
	public String flakParticles = "largesmoke";
	public boolean smokeTrail = false;
	public boolean isBomb = false;
	public boolean isShell = false;
	public float hitBoxSize = 0.5F;
	public String hitSound;
	public int roundsPerItem = 1;
	public int maxStackSize = 1;
	public static List<BulletType> bullets = new ArrayList<BulletType>();
	public boolean hasLight = false;

	public BulletType(TypeFile file)
	{
		super(file);
		texture = "defaultBullet";
		bullets.add(this);
	}

	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if (split[0].equals("Model"))
			{
				model = FlansMod.proxy.loadModel(split[1], shortName, ModelBase.class);
			}
			if (split[0].equals("Texture"))
				texture = split[1];
			if (split[0].equals("FallSpeed"))
				fallSpeed = Float.parseFloat(split[1]);
			if (split[0].equals("Damage") || split[0].equals("DamageVsLiving") || split[0].equals("DamageVsPlayer"))
				damageVsLiving = Integer.parseInt(split[1]);
			if (split[0].equals("DamageVsVehicles"))
				damageVsDriveable = Integer.parseInt(split[1]);
			if (split[0].equals("Explosion"))
				explosion = Integer.parseInt(split[1]);
			if (split[0].equals("FlakParticles"))
				flak = Integer.parseInt(split[1]);
			if (split[0].equals("Fire"))
				fire = Integer.parseInt(split[1]);
			if (split[0].equals("ExpodeOnImpact"))
				explodeOnImpact = Boolean.parseBoolean(split[1].toLowerCase());
			if (split[0].equals("Fuse"))
				fuse = Integer.parseInt(split[1]);
			if (split[0].equals("BreaksGlass"))
				breaksGlass = Boolean.parseBoolean(split[1].toLowerCase());
			if (split[0].equals("HitBoxSize"))
				hitBoxSize = Float.parseFloat(split[1]);
			if (split[0].equals("HitSound"))
				hitSound = split[1];
			if (split[0].equals("Penetrates"))
				penetratesEntities = Boolean.parseBoolean(split[1].toLowerCase());
			if (split[0].equals("SmokeTrail"))
				smokeTrail = Boolean.parseBoolean(split[1].toLowerCase());
			if (split[0].equals("RoundsPerItem"))
				roundsPerItem = Integer.parseInt(split[1]);
			if (split[0].equals("MaxStackSize"))
				maxStackSize = Integer.parseInt(split[1]);
			if (split[0].equals("Bomb"))
				isBomb = Boolean.parseBoolean(split[1].toLowerCase());
			if (split[0].equals("Shell"))
				isShell = Boolean.parseBoolean(split[1].toLowerCase());
			if (split[0].equals("DropItemOnShoot"))
				dropItemOnShoot = split[1];
			if (split[0].equals("DropItemOnReload"))
				dropItemOnReload = split[1];
			if (split[0].equals("DropItemOnHit"))
				dropItemOnHit = split[1];
			if (split[0].equals("HasLight"))
				hasLight = Boolean.parseBoolean(split[1].toLowerCase());
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
	
	/** To be overriden by subtypes for model reloading */
	public void reloadModel()
	{
		model = FlansMod.proxy.loadModel(modelString, shortName, ModelBase.class);
	}
}
