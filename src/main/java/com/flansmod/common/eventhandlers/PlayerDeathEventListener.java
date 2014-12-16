package com.flansmod.common.eventhandlers;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.network.PacketKillMessage;
import com.flansmod.common.teams.Team;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class PlayerDeathEventListener {

    public PlayerDeathEventListener() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @EventHandler
    @SubscribeEvent
    public void PlayerDied(LivingDeathEvent DamageEvent) {
        if ((DamageEvent.source.getDamageType().equalsIgnoreCase("explosion") && ((DamageEvent.source.getSourceOfDamage() instanceof EntityGrenade) || (DamageEvent.source.getSourceOfDamage() instanceof EntityBullet))) && DamageEvent.entityLiving instanceof EntityPlayer) {
            boolean isGrenade;
            if (DamageEvent.source.getSourceOfDamage() instanceof EntityGrenade) {
                isGrenade = true;
                EntityGrenade Grenade = (EntityGrenade) DamageEvent.source.getSourceOfDamage();
            } else {
                isGrenade = false;
                EntityBullet Grenade = (EntityBullet) DamageEvent.source.getSourceOfDamage();
            }
            EntityPlayer killer = null;
            EntityPlayer killed = (EntityPlayer) DamageEvent.entityLiving;
            Team killerTeam = null;
            Team killedTeam = null;
            if (isGrenade) {
                killer = (EntityPlayer) ((EntityGrenade) DamageEvent.source.getSourceOfDamage()).thrower;
            } else {
                killer = (EntityPlayer) ((EntityBullet) DamageEvent.source.getSourceOfDamage()).owner;
            }
            killerTeam = PlayerHandler.getPlayerData(killer).team;
            killedTeam = PlayerHandler.getPlayerData(killed).team;
            if (DamageEvent.entityLiving instanceof EntityPlayer && !isGrenade) {
                FlansMod.getPacketHandler().sendToDimension(new PacketKillMessage(false, ((EntityBullet) DamageEvent.source.getSourceOfDamage()).type, (killedTeam == null ? "f" : killedTeam.textColour) + ((EntityPlayer) DamageEvent.entity).getDisplayName(), (killerTeam == null ? "f" : killedTeam.textColour) + ((EntityPlayer) DamageEvent.source.getSourceOfDamage()).getDisplayName()), DamageEvent.entityLiving.dimension);
            }
            if (DamageEvent.entityLiving instanceof EntityPlayer && isGrenade) {
                FlansMod.getPacketHandler().sendToDimension(new PacketKillMessage(false, ((EntityGrenade) DamageEvent.source.getSourceOfDamage()).type, (killedTeam == null ? "f" : killedTeam.textColour) + ((EntityPlayer) DamageEvent.entity).getDisplayName(), (killerTeam == null ? "f" : killedTeam.textColour) + ((EntityPlayer) DamageEvent.source.getSourceOfDamage()).getDisplayName()), DamageEvent.entityLiving.dimension);
            }
        }
    }
}
