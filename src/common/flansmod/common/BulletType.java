package flansmod.common;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;

public class BulletType extends TypeType
{
	public BulletType(BufferedReader file)
    {
		do
		{
			String line = null;
			try
			{
				line = file.readLine();
			}
			catch(Exception e)
			{
				break;
			}
			if(line == null)
			{
				break;
			}
			if(line.startsWith("//"))
				continue;
			String[] split = line.split(" ");
			if(split.length < 2)
				continue;
			read(split, file);
		}
		while(true);
		bullets.add(this);
		iconIndex = lastIconIndex++;
    }
	
	protected void read(String[] split, BufferedReader file)
	{
		super.read(split, file);
		try
		{
			if(split[0].equals("Model"))
			{
				model = FlansMod.proxy.loadBulletModel(split, shortName);
			}
			if(split[0].equals("Texture"))
				texture = split[1];
			if(split[0].equals("FallSpeed"))
				fallSpeed = Float.parseFloat(split[1]);	
			if(split[0].equals("Damage"))
				damage = Integer.parseInt(split[1]);
			if(split[0].equals("Explosion"))
				explosion = Integer.parseInt(split[1]);
			if(split[0].equals("FlakParticles"))
				flak = Integer.parseInt(split[1]);
			if(split[0].equals("Fire"))
				fire = Integer.parseInt(split[1]);
			if(split[0].equals("ExpodeOnImpact"))
				explodeOnImpact = split[1].equals("True");
			if(split[0].equals("Fuse"))
				fuse = Integer.parseInt(split[1]);
			if(split[0].equals("BreaksGlass"))
				breaksGlass = split[1].equals("True");
			if(split[0].equals("HitBoxSize"))
				hitBoxSize = Float.parseFloat(split[1]);
			if(split[0].equals("HitSound"))
				hitSound = split[1];
			if(split[0].equals("Penetrates"))
				penetrates = split[1].equals("True");
			if(split[0].equals("SmokeTrail"))
				smokeTrail = split[1].equals("True");
			if(split[0].equals("RoundsPerItem"))
				roundsPerItem = Integer.parseInt(split[1]);
			if(split[0].equals("MaxStackSize"))
				maxStackSize = Integer.parseInt(split[1]);
			if(split[0].equals("Bomb"))
				isBomb = split[1].equals("True");
			if(split[0].equals("Shell"))
				isShell = split[1].equals("True");
			if(split[0].equals("DropItemOnShoot"))
				dropItemOnShoot = split[1];
			if(split[0].equals("DropItemOnReload"))
				dropItemOnReload = split[1];
			if(split[0].equals("DropItemOnHit"))
				dropItemOnHit = split[1];
		}
		catch (Exception e)
		{
			System.out.println("Reading bullet file failed.");
			e.printStackTrace();
		}
	}
		
	public static BulletType getBullet(String s)
	{
		for(BulletType bullet : bullets)
		{
			if(bullet.shortName.equals(s))
				return bullet;
		}
		return null;
	}
	
	public static BulletType getBullet(int id)
	{
		for(BulletType bullet : bullets)
		{
			if(bullet.itemID == id)
				return bullet;
		}
		return null;
	}
	
	public Object model;
	public String texture = "bullet";
	public float fallSpeed = 1.0F;
	public int damage = 0;
	public int explosion = 0;
	public boolean explodeOnImpact = false;
	public int fuse = 0;
	public int flak = 0;
	public int fire = 0;
	public String dropItemOnReload = null;
	public String dropItemOnShoot = null;
	public String dropItemOnHit = null;
	public boolean breaksGlass = false;
	public boolean penetrates = false;
	public boolean smokeTrail = false;
	public boolean isBomb = false;
	public boolean isShell = false;
	public float hitBoxSize = 0.5F;
	public String hitSound;
	public int roundsPerItem = 1;
	public int maxStackSize = 1;
	private static int lastIconIndex = 0;
	public static List<BulletType> bullets = new ArrayList<BulletType>();
}