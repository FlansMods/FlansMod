package com.flansmod.common.teams;

/**
 * Team Objects are things connected to a team's base such as spawn points, weapon spawners and banners.
 *
 * @author James
 */
public interface ITeamObject
{
	
	//Return the base that this object is a part of
	ITeamBase getBase();
	
	//Called when the owner of a base is set by an op
	//The object should remember the base ID for saving / loading
	void onBaseSet(int newTeamID);
	
	//Called when a base is captured, but not when set by an op
	//The object should remember the base ID for saving / loading
	void onBaseCapture(int newTeamID);
	
	//Called when an op connects this object to a new base
	void setBase(ITeamBase base);
	
	//Tick hook for this object. You may use hooks inherited from super classes or this hook interchangeably
	void tick();
	
	//Called when this object is clicked with a Stick of Destruction
	void destroy();
	
	//Returns the position of this object
	double getPosX();
	
	double getPosY();
	
	double getPosZ();
	
	//Return true if players can spawn here
	boolean isSpawnPoint();
	
	//Return true if this object should force the chunk it is in to remain loaded
	boolean forceChunkLoading();
}
