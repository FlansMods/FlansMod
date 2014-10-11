package com.flansmod.common.teams;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;

/**
 * Interface for objects that act as team bases, places that teams are given or can capture, dependent on game mode.
 * @author James
 *
 */
public interface ITeamBase 
{
	//Return the base name
	public String getName();
	//Set the name of this base
	public void setName(String newName);
	
	//Sets the ID of this base for syncing and saving
	public void setBaseID(int i);
	//Returns the ID of this base
	public int getBaseID();
	
	//The team ID of the owner of this base. 0 = No team, 1 = Spectators, 2 = Team 1, 3 = Team 2 and so on
	//Getter and setter for the default owner ID. This is what the base resets to at the start of each round
	public int getDefaultOwnerID();
	public void setDefaultOwnerID(int id);
	
	//Getter and setter for the current owner ID
	public int getOwnerID();
	public void setOwnerID(int id);
	
	//Called when a new round is started
	public void startRound();	
	
	public void roundCleanup(); 
	
	//Return the map that this base is a part of
	public TeamsMap getMap();
	//Set the map that this base is a part of
	public void setMap(TeamsMap newMap);
	//Set the map for the first time. This is when chunk loading should be registered
	public void setMapFirstTime(TeamsMap newMap);
	
	//Return the objects that belong to this base
	public List<ITeamObject> getObjects();
	//Called when an op adds an object to this base
	public void addObject(ITeamObject object);
	
	//Tick hook for this base. You may use hooks inherited from super classes or this hook interchangeably
	public void tick();
	
	//Called when the base is clicked with the stick of destruction
	public void destroy();
	
	//Returns this base as an entity
	public Entity getEntity();
	
	//Returns the position of this base
	public double getPosX();
	public double getPosY();
	public double getPosZ();
	
	//Returns the world this base is in
	public World getWorld();
	
	//Returns the flag object for CTF like gametypes. May return null, but then this base may not be used in CTF like gametypes
	public ITeamObject getFlag();
	

}
