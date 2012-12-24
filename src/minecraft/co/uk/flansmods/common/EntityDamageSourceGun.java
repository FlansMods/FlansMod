package co.uk.flansmods.common;

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
        return "death." + weapon.shortName + "." + par1EntityPlayer.username + "." + shooter.getEntityName();
    }
}
