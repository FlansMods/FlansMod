package co.uk.flansmods.common.teams;

import java.util.List;

import co.uk.flansmods.common.FlansMod;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.event.CommandEvent;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.IEventListener;

public class TeamsManager implements IEventListener 
{
	public Gametype currentGametype;
	public Team[] teams;
	public static TeamsManager instance;
	public List<ITeamBase> bases;
	public List<ITeamObject> objects;
	
	public TeamsManager()
	{
		instance = this;
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
		//TODO : Send message to ops
	}	
	
	public static void messageAll(String s)
	{
		FlansMod.log("Teams Announcement : " + s);
		//TODO : Send message to ops
	}

	@Override
	public void invoke(Event event) 
	{
		
	}
}
