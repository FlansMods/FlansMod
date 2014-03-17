package com.flansmod.common.teams;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityConnectingLine extends EntityFishHook {
	
	public Object connectedTo;

	public EntityConnectingLine(World world) 
	{
		super(world);
	}

	public EntityConnectingLine(World world, EntityPlayer player, ITeamBase base)
    {
        super(world);
        field_146043_c = this; //TODO : Double check that this is the correct field
        ignoreFrustumCheck = true;
        field_146042_b = player;
        field_146042_b.fishEntity = this;
        setSize(0.25F, 0.25F);
        setPosition(base.getPosX(), base.getPosY(), base.getPosZ());
        yOffset = 0.0F;
        motionX = 0;
        motionZ = 0;
        motionY = 0;
        connectedTo = base;
    }
	   
	public EntityConnectingLine(World world, EntityPlayer player, ITeamObject object)
    {
        super(world);
        field_146043_c = this; 
        ignoreFrustumCheck = true;
        field_146042_b = player;
        field_146042_b.fishEntity = this;
        setSize(0.25F, 0.25F);
        setPosition(object.getPosX(), object.getPosY(), object.getPosZ());
        yOffset = 0.0F;
        motionX = 0;
        motionZ = 0;
        motionY = 0;
        connectedTo = object;
    }
	    
    @Override
	public void onUpdate()
    {          
    	ItemStack currentItemstack = field_146042_b.inventory.getCurrentItem();
    	if(currentItemstack == null || !(currentItemstack.getItem() instanceof ItemOpStick) || currentItemstack.getItemDamage() != 1)
    	{
    		setDead();
    		field_146042_b.fishEntity = null;
    	}
    }

}
