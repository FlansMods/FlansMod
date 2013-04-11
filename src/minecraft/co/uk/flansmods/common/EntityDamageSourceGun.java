package co.uk.flansmods.common;

import co.uk.flansmods.common.teams.Team;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
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

	@Override
    public String getDeathMessage(EntityLiving living)
    {
		if(!(living instanceof EntityPlayer))
		{
			return super.getDeathMessage(living);
		}
		EntityPlayer player = (EntityPlayer)living;
    	Team killedTeam = FlansModPlayerHandler.getPlayerData(player).team;
    	Team killerTeam = FlansModPlayerHandler.getPlayerData(shooter).team;
    	
        return "flanDeath." + weapon.shortName + "." + (killedTeam == null ? "f" : killedTeam.textColour) + player.username + "." + (killerTeam == null ? "f" : killerTeam.textColour) + shooter.getEntityName();
    }
}
