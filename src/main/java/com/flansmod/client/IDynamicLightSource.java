package com.flansmod.client;

import net.minecraft.entity.Entity;

/**
 *
 * @author AtomicStryker
 *
 * Usage of this class:
 * You can use this Interface to create your own Dynamic Light Sources to use with Dynamic Lights.
 * Implement this interface, write code as you see fit, and then use the method:
 *
 * DynamicLights.addLightSource(IDynamicLightSource yourLightObjectHere) to get Dynamic Lights to use it.
 *
 * When you want your Light to turn off, simply call
 *
 * DynamicLights.removeLightSource(IDynamicLightSource yourLightObjectHere)
 *
 *
 * You could also just return a Light Level <1, but that would leave your Light in the aggressively iterated List -
 * please do not do that.
 *
 */
public interface IDynamicLightSource
{
    /**
     * Entity the Dynamic Light Source is associated with.
     * The Light will always be centered on this Entity and move with it.
     * Any Entity can only be associated with a single Light!
     * If the Entity is dead (eg. Entity.isDead() returns true), the Light will be removed aswell.
     */
    public Entity getAttachmentEntity();

    /**
     * Values above 15 will not be considered, 15 is the MC max level. Values below 1 are considered disabled.
     * Values can be changed on the fly.
     * @return int value of Minecraft Light level at the Dynamic Light Source
     */
    public int getLightLevel();
}
