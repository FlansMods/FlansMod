package co.uk.flansmods.common;

import co.uk.flansmods.common.teams.Team;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.StatCollector;

public class EntityDamageSourceGun extends EntityDamageSourceIndirect {

	public InfoType weapon;
	public EntityPlayer shooter;
	
	public EntityDamageSourceGun(String s, Entity entity, EntityPlayer player, InfoType wep) 
	{
		super(s, entity, player);
		weapon = wep;
		shooter = player;
	}

    public String getDeathMessage(EntityPlayer par1EntityPlayer)
    {
    	Team killedTeam = FlansModPlayerHandler.getPlayerData(par1EntityPlayer).team;
    	Team killerTeam = FlansModPlayerHandler.getPlayerData(shooter).team;
    	
        return "flanDeath." + weapon.shortName + "." + (killedTeam == null ? "f" : killedTeam.textColour) + par1EntityPlayer.username + "." + (killerTeam == null ? "f" : killerTeam.textColour) + shooter.getEntityName();
    }
}
