package flan.server;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.IEventListener;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class FlansModPlayerHandler implements IEventListener
{
	public static Map<EntityPlayer, FlansModPlayerData> data = new HashMap<EntityPlayer, FlansModPlayerData>();
	
	public FlansModPlayerHandler()
	{
		MinecraftForge.EVENT_BUS.register(this);
	}

	public void invoke(Event event) 
	{
		if(event instanceof LivingEvent)
		{
			LivingEvent livingEvent = (LivingEvent)event;
			EntityLiving entity = livingEvent.entityLiving;
			if(event instanceof LivingHurtEvent && (entity.ridingEntity instanceof EntityDriveable || entity.ridingEntity instanceof EntityPassengerSeat))
			{
				((LivingHurtEvent)livingEvent).ammount = 0;
			}
		}
	}
	
	public static FlansModPlayerData getPlayerData(EntityPlayer player)
	{
		return data.get(player);
	}
}
