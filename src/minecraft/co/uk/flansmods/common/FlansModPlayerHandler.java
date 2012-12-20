package co.uk.flansmods.common;

import java.util.HashMap;
import java.util.Map;

import co.uk.flansmods.common.teams.TeamsManager;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import cpw.mods.fml.common.IPlayerTracker;
import cpw.mods.fml.common.registry.GameRegistry;

public class FlansModPlayerHandler implements IPlayerTracker
{
	public static Map<EntityPlayer, FlansModPlayerData> data = new HashMap<EntityPlayer, FlansModPlayerData>();
	
	public FlansModPlayerHandler()
	{
		MinecraftForge.EVENT_BUS.register(this);
		GameRegistry.registerPlayerTracker(this);
	}

	@ForgeSubscribe
	public void onEntityHurt(LivingHurtEvent event) 
	{
		EntityLiving entity = event.entityLiving;
		if(event instanceof LivingHurtEvent && (entity.ridingEntity instanceof EntityDriveable || entity.ridingEntity instanceof EntityPassengerSeat))
		{
			event.ammount = 0;
		}
	}
	
	public void tick()
	{
		for(FlansModPlayerData d : data.values())
			d.tick();
	}
	
	public static FlansModPlayerData getPlayerData(EntityPlayer player)
	{
		return data.get(player);
	}

	@Override
	public void onPlayerLogin(EntityPlayer player) 
	{
		data.put(player, new FlansModPlayerData(player));
		if(TeamsManager.getInstance().currentGametype != null && TeamsManager.getInstance().areTeamsValid())
			TeamsManager.getInstance().currentGametype.sendTeamsMenuToPlayer((EntityPlayerMP)player);
	}

	@Override
	public void onPlayerLogout(EntityPlayer player) 
	{
		data.remove(player);
	}

	@Override
	public void onPlayerChangedDimension(EntityPlayer player) {}

	@Override
	public void onPlayerRespawn(EntityPlayer player) {}
}
