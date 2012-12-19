package co.uk.flansmods.common;

import net.minecraft.entity.player.EntityPlayer;
import co.uk.flansmods.common.teams.PlayerClass;
import co.uk.flansmods.common.teams.Team;

public class FlansModPlayerData 
{
	public EntityMG mountingGun;
	public Team team;
	public PlayerClass playerClass;
	public boolean isShooting;
	public int shootTime;
	
	//TODO Unknown purpose!
	public FlansModPlayerData(EntityPlayer player) {}
	
	public void tick()
	{
		if(shootTime > 0)
			shootTime--;
	}
}
