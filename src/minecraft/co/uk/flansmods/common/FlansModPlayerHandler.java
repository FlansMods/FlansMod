package co.uk.flansmods.common;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import co.uk.flansmods.common.teams.TeamsManager;
import cpw.mods.fml.common.IPlayerTracker;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;

public class FlansModPlayerHandler implements IPlayerTracker
{
	public static Map<EntityPlayer, FlansModPlayerData> serverSideData = new HashMap<EntityPlayer, FlansModPlayerData>();
	public static Map<EntityPlayer, FlansModPlayerData> clientSideData = new HashMap<EntityPlayer, FlansModPlayerData>();
	
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
				clientSideData.put(player, new FlansModPlayerData(player));
		}
		return side.isClient() ? clientSideData.get(player) : serverSideData.get(player);
	}

	@Override
	public void onPlayerLogin(EntityPlayer player) 
	{
		serverSideData.put(player, new FlansModPlayerData(player));
		if(TeamsManager.getInstance().currentGametype != null && TeamsManager.getInstance().areTeamsValid())
			TeamsManager.getInstance().currentGametype.sendTeamsMenuToPlayer((EntityPlayerMP)player);
	}

	@Override
	public void onPlayerLogout(EntityPlayer player) 
	{
		serverSideData.remove(player);
	}

	@Override
	public void onPlayerChangedDimension(EntityPlayer player) {}

	@Override
	public void onPlayerRespawn(EntityPlayer player) {}
}
