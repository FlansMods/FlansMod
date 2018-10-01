package com.flansmod.common.teams;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityConnectingLine extends EntityFishHook
{
	
	public Object connectedTo;
	public EntityPlayer player;
	
	public EntityConnectingLine(World world, EntityPlayer player)
	{
		super(world, player);
		this.player = player;
	}
	
	public EntityConnectingLine(World world, EntityPlayer player, ITeamBase base)
	{
		this(world, player);
		caughtEntity = this;
		ignoreFrustumCheck = true;
		setSize(0.25F, 0.25F);
		setPosition(base.getPosX(), base.getPosY(), base.getPosZ());
		motionX = 0;
		motionZ = 0;
		motionY = 0;
		connectedTo = base;
	}
	
	public EntityConnectingLine(World world, EntityPlayer player, ITeamObject object)
	{
		this(world, player);
		caughtEntity = this;
		ignoreFrustumCheck = true;
		setSize(0.25F, 0.25F);
		setPosition(object.getPosX(), object.getPosY(), object.getPosZ());
		motionX = 0;
		motionZ = 0;
		motionY = 0;
		connectedTo = object;
	}
	
	@Override
	public void onUpdate()
	{
		ItemStack currentItemstack = player.inventory.getCurrentItem();
		if(currentItemstack == null || !(currentItemstack.getItem() instanceof ItemOpStick) || currentItemstack.getItemDamage() != 1)
		{
			setDead();
			player.fishEntity = null;
		}
	}
	
}
