package co.uk.flansmods.common;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import co.uk.flansmods.common.teams.TeamsManager;
import cpw.mods.fml.common.IPlayerTracker;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;

public class FlansModPlayerHandler implements IPlayerTracker
{
	public static Map<String, FlansModPlayerData> serverSideData = new HashMap<String, FlansModPlayerData>();
	public static Map<String, FlansModPlayerData> clientSideData = new HashMap<String, FlansModPlayerData>();
	
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
	
	@ForgeSubscribe
	public void onEntityKilled(LivingDeathEvent event) 
	{
		EntityLiving entity = event.entityLiving;
		if(entity instanceof EntityPlayer)
		{
			getPlayerData((EntityPlayer)entity).isShooting = false;
		}
	}
	
	public void tick()
	{
		for(FlansModPlayerData d : serverSideData.values())
			d.tick();
		for(FlansModPlayerData d : clientSideData.values())
			d.tick();
	}
	
	public static FlansModPlayerData getPlayerData(EntityPlayer player)
	{
		return getPlayerData(player, Side.SERVER);
	}

	
	public static FlansModPlayerData getPlayerData(EntityPlayer player, Side side)
	{
		if(side.isClient())
		{
			if(!clientSideData.containsKey(player))
				clientSideData.put(player.username, new FlansModPlayerData(player));
		}
		return side.isClient() ? clientSideData.get(player.username) : serverSideData.get(player.username);
	}

	@Override
	public void onPlayerLogin(EntityPlayer player) 
	{
		if(!serverSideData.containsKey(player.username))
			serverSideData.put(player.username, new FlansModPlayerData(player));
		if(TeamsManager.getInstance().currentGametype != null && TeamsManager.getInstance().areTeamsValid())
			TeamsManager.getInstance().currentGametype.sendTeamsMenuToPlayer((EntityPlayerMP)player);
	}

	@Override
	public void onPlayerLogout(EntityPlayer player) 
	{
		serverSideData.remove(player.username);
	}

	@Override
	public void onPlayerChangedDimension(EntityPlayer player) {}

	@Override
	public void onPlayerRespawn(EntityPlayer player) {}
}
