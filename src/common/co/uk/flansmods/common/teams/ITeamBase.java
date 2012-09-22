package co.uk.flansmods.common.teams;

import java.util.List;

/**
 * Interface for objects that act as team bases, places that teams are given or can capture, dependent on game mode.
 * @author James
 *
 */
public interface ITeamBase {
		
	//Return the team that currently owns or controls this base
	public Team getOwner();
	
	//Return the objects that belong to this base
	public List<ITeamObject> getObjects();

	//Called when the owner of a base is set by an op
	public void onBaseSet(Team newOwners);
	
	//Called when a base is captured, but not when set by an op
	public void onBaseCapture(Team newOwners);
	
	//Tick hook for this base. You may use hooks inherited from super classes or this hook interchangeably
	public void tick();
}
