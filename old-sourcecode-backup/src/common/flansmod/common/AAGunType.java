package flansmod.common;

import net.minecraft.client.Minecraft;
import net.minecraft.src.ItemStack;

import java.io.BufferedReader;
import java.util.List;
import java.util.ArrayList;
import java.io.File;

import cpw.mods.fml.client.FMLClientHandler;

import flansmod.client.ModelAAGun;

public class AAGunType extends TypeType
{
    public AAGunType(BufferedReader file, String pack)
    {
		super(pack);
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
		iconIndex = PlaneType.nextIconIndex++;
		types.add(this);
    }
	
	protected void read(String[] split, BufferedReader file)
	{
		super.read(split, file);
		try
		{
			if(split[0].equals("Model"))
			{
				model = FlansMod.proxy.loadAAGunModel(split, shortName);
			}
			if(split[0].equals("Texture"))
				texture = split[1];
			if(split[0].equals("Damage"))
				damage = Integer.parseInt(split[1]);
			if(split[0].equals("ReloadTime"))
				reloadTime = Integer.parseInt(split[1]);
			if(split[0].equals("Recoil"))
				recoil = Integer.parseInt(split[1]);
			if(split[0].equals("Accuracy"))
				accuracy = Integer.parseInt(split[1]);
			if(split[0].equals("ShootDelay"))
				shootDelay = Integer.parseInt(split[1]);
			if(split[0].equals("ShootSound"))
			{
				shootSound = "aaguns." + split[1];
				FMLClientHandler.instance().getClient().installResource("newSound/aaguns/" + split[1] + ".ogg", new File(FMLClientHandler.instance().getClient().mcDataDir, "/Flan/" + contentPack + "/sounds/" + split[1] + ".ogg"));
			}
			if(split[0].equals("ReloadSound"))
			{
				reloadSound = "aaguns." + split[1];
				FMLClientHandler.instance().getClient().installResource("newSound/aaguns/" + split[1] + ".ogg", new File(FMLClientHandler.instance().getClient().mcDataDir, "/Flan/" + contentPack + "/sounds/" + split[1] + ".ogg"));
			}
			if(split[0].equals("FireAlternately"))
				fireAlternately = split[1].equals("True");
			if(split[0].equals("NumBarrels"))
				numBarrels = Integer.parseInt(split[1]);
			if(split[0].equals("Health"))
				health = Integer.parseInt(split[1]);
			if(split[0].equals("TopViewLimit"))
				topViewLimit = Float.parseFloat(split[1]);
			if(split[0].equals("BottomViewLimit"))
				bottomViewLimit = Float.parseFloat(split[1]);
			if(split[0].equals("Ammo"))
			{
				BulletType type = BulletType.getBullet(split[1]);
				if(type != null)
					ammo.add(type);
			}			
			if(split[0].equals("GunnerPos"))
			{
				gunnerX = Integer.parseInt(split[1]);
				gunnerY = Integer.parseInt(split[2]);
				gunnerZ = Integer.parseInt(split[3]);				
			}			
		}
		catch (Exception e)
		{
		}
	}
		
	public boolean isAmmo(BulletType type)
	{
		return ammo.contains(type);
	}
	
	public boolean isAmmo(ItemStack stack)
	{
		if(stack == null)
			return false;
		if(stack.getItem() instanceof ItemBullet)
		{
			return isAmmo(((ItemBullet)stack.getItem()).type);
		}
		return false;
	}
		
	public static AAGunType getAAGun(String s)
	{
		for(AAGunType gun : types)
		{
			if(gun.shortName.equals(s))
				return gun;
		}
		return null;
	}

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
	public Object model;
	public String texture;
	public float topViewLimit = 75F;
	public float bottomViewLimit = 0F;
	//private static int lastIconIndex = 0; //Use planes sheet instead.
	public static List<AAGunType> types = new ArrayList<AAGunType>();
}