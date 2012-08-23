package flansmod.minecraft;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.registry.TickRegistry;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ModelBase;
import net.minecraft.src.World;
import flansmod.common.CommonProxy;
import flansmod.common.FlansMod;

public class ClientProxy extends CommonProxy
{
	public void load() 
	{
		new FlansModClient().load();
		TickRegistry.registerTickHandler(new ClientTickHandler(), Side.CLIENT);
	}
	
	public Object getClientGui(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		return null;
	}
	
	public ModelBase loadBulletModel(String[] split, String shortName)
	{
		String s = FlansMod.inMCP ? "net.minecraft.src.Model" : "Model";
		try 
		{	
			ModelBase model = (ModelBase)Class.forName(s + split[1]).getConstructor().newInstance();
			return model;
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to load bullet model : " + shortName);
			e.printStackTrace();
			return null;
		}
	}
	
	public ModelPlane loadPlaneModel(String[] split, String shortName)
	{
		String s = FlansMod.inMCP ? "net.minecraft.src.Model" : "Model";
		try 
		{	
			ModelPlane model = (ModelPlane)Class.forName(s + split[1]).getConstructor().newInstance();
			return model;
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to load plane model : " + shortName);
			e.printStackTrace();
			return null;
		}
	}
	
	public ModelMG loadMGModel(String[] split, String shortName)
	{
		String s = FlansMod.inMCP ? "net.minecraft.src.Model" : "Model";
		try 
		{	
			ModelMG model = (ModelMG)Class.forName(s + split[1]).getConstructor().newInstance();
			return model;
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to load deployable MG model : " + shortName);
			e.printStackTrace();
			return null;
		}
	}
	
	public ModelAAGun loadAAGunModel(String[] split, String shortName)
	{
		//TODO
		return null;
	}
}
