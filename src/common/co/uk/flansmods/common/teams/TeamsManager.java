package co.uk.flansmods.common.teams;

import java.util.ArrayList;
import java.util.List;

import co.uk.flansmods.common.FlansMod;
import net.minecraft.client.Minecraft;
import net.minecraft.server.MinecraftServer;
import net.minecraft.src.EntityPlayerMP;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CommandEvent;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.IEventListener;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.EntityInteractEvent;

public class TeamsManager
{
	public Gametype currentGametype;
	public Team[] teams;
	public Team spectators;
	public static TeamsManager instance;
	public List<ITeamBase> bases;
	public List<ITeamObject> objects;
	//TODO : Save this variable per world to avoid bases recieving the same ID
	private int nextBaseID = 0;
	
	public TeamsManager()
	{
		instance = this;
		MinecraftForge.EVENT_BUS.register(this);
		spectators = new Team("spectators", "Spectators", 0xffffff, '7');
		
		bases = new ArrayList<ITeamBase>();
		objects = new ArrayList<ITeamObject>();
		//Testing stuff. TODO : Replace with automatic Gametype loader
		new GametypeTDM();
		//-----
	}
	
	public static TeamsManager getInstance()
	{
		return instance;
	}
	
	public void tick()
	{
		currentGametype.tick();
		for(ITeamBase base : bases)
		{
			base.tick();
		}
		for(ITeamObject object : objects)
		{
			object.tick();
		}
	}
	
	public static void log(String s)
	{
		FlansMod.log("Teams Info : " + s);
	}	
	
	public static void messagePlayer(EntityPlayerMP player, String s)
	{
		player.addChatMessage(s);
	}
	
	public static void messageAll(String s)
	{
		FlansMod.log("Teams Announcement : " + s);
		for(EntityPlayerMP player : (List<EntityPlayerMP>)MinecraftServer.getServer().getConfigurationManager().playerEntityList)
		{
			player.sendChatToPlayer(s);
		}
	}
	
	@ForgeSubscribe
	public void onPlayerUpdate(EntityInteractEvent event)
	{
		if(event.entityPlayer.inventory.getCurrentItem().getItem() instanceof ItemOpStick)
			((ItemOpStick)event.entityPlayer.inventory.getCurrentItem().getItem()).clickedEntity(event.entityPlayer.worldObj, event.entityPlayer, event.target);
	}	
	
	@ForgeSubscribe
	public void entityJoinedWorld(EntityJoinWorldEvent event)
	{
		if(event.entity instanceof ITeamBase)
		{
			((ITeamBase)event.entity).setID(nextBaseID++);
			bases.add((ITeamBase)event.entity);
		}
		if(event.entity instanceof ITeamObject)
			objects.add((ITeamObject)event.entity);
	}
	
	public ITeamBase getBase(int ID)
	{
		for(ITeamBase base : bases)
		{
			if(base.getID() == ID)
				return base;
		}
		return null;
	}
}
