package com.flansmod.common.teams;

import java.util.List;

import com.flansmod.common.teams.TeamsManager.TeamsMap;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;

/**
 * Interface for objects that act as team bases, places that teams are given or can capture, dependent on game mode.
 * @author James
 *
 */
public interface ITeamBase {
	
	//Called when a new round is started
	public void startRound();	
		
	//Return the team that currently owns or controls this base
	public Team getOwner();
	
	//Return the map that this base is a part of
	public TeamsMap getMap();
	
	//Set the map that this base is a part of
	public void setMap(TeamsMap newMap);
	
	//Return the base name
	public String getName();
	
	//Set the name of this base
	public void setName(String newName);
	
	//Return the objects that belong to this base
	public List<ITeamObject> getObjects();
	
	//Called when an op adds an object to this base
	public void addObject(ITeamObject object);

	//Called when the owner of a base is set by an op
	public void setBase(Team newOwners);
	
	//Called when a base is captured, but not when set by an op
	public void captureBase(Team newOwners);
	
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
	
	//Sets the ID of this base
	public void setID(int i);
	
	//Returns the ID of this base
	public int getID();
	
	//Returns the flag object for CTF like gametypes. May return null, but then this base may not be used in CTF like gametypes
	public ITeamObject getFlag();
}
