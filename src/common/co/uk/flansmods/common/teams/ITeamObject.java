package co.uk.flansmods.common.teams;

/**
 * Team Objects are things connected to a team's base such as spawn points, weapon spawners and banners.
 * @author James
 *
 */
public interface ITeamObject {
	
	//Return the base that this object is a part of
	public ITeamBase getBase();
	
	//Called when the owner of a base is set by an op
	public void onBaseSet(Team newOwners);
	
	//Called when a base is captured, but not when set by an op
	public void onBaseCapture(Team newOwners);
	
	//Tick hook for this object. You may use hooks inherited from super classes or this hook interchangeably
	public void tick();
}
