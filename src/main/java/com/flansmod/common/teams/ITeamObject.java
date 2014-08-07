package com.flansmod.common.teams;

/**
 * Team Objects are things connected to a team's base such as spawn points, weapon spawners and banners.
 * @author James
 *
 */
public interface ITeamObject {
	
	//Return the base that this object is a part of
	public ITeamBase getBase();
	
	//Called when the owner of a base is set by an op
	//The object should remember the base ID for saving / loading
	public void onBaseSet(int newTeamID);
	
	//Called when a base is captured, but not when set by an op
	//The object should remember the base ID for saving / loading
	public void onBaseCapture(int newTeamID);
	
	//Called when an op connects this object to a new base
	public void setBase(ITeamBase base);
	
	//Tick hook for this object. You may use hooks inherited from super classes or this hook interchangeably
	public void tick();
	
	//Called when this object is clicked with a Stick of Destruction
	public void destroy();
	
	//Returns the position of this object
	public double getPosX();
	public double getPosY();
	public double getPosZ();
	
	//Return true if players can spawn here
	public boolean isSpawnPoint();

	//Return true if this object should force the chunk it is in to remain loaded
	public boolean forceChunkLoading();
}
