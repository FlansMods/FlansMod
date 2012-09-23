package co.uk.flansmods.common;

import java.util.*;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.IPlayerTracker;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.server.MinecraftServer;
import net.minecraft.src.*;
import net.minecraftforge.common.*;
import net.minecraftforge.event.*;
import net.minecraftforge.event.entity.*;
import net.minecraftforge.event.entity.living.*;

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
	
	public static FlansModPlayerData getPlayerData(EntityPlayer player)
	{
		return data.get(player);
	}

	@Override
	public void onPlayerLogin(EntityPlayer player) 
	{
		data.put(player, new FlansModPlayerData(player));
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
