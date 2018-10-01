package com.flansmod.common.teams;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;

import com.flansmod.common.EntityItemCustomRender;
import com.flansmod.common.PlayerHandler;

public class EntityTeamItem extends EntityItemCustomRender implements IEntityAdditionalSpawnData
{
	
	public TileEntitySpawner spawner;
	public double angle;
	public int xCoord, yCoord, zCoord;
	private int age;
	
	public EntityTeamItem(TileEntitySpawner te, int i)
	{
		super(te.getWorld(), te.getPos().getX() + 0.5F, te.getPos().getY() + 0.5F, te.getPos().getZ() + 0.5F, te.stacksToSpawn.get(i).copy());
		te.itemEntities.add(this);
		angle = i * Math.PI * 2 / te.stacksToSpawn.size();
		motionX = motionY = motionZ = 0D;
		lifespan = 1000000000;
		spawner = te;
	}
	
	public EntityTeamItem(World world)
	{
		super(world);
	}
	
	@Override
	public void setPositionAndRotationDirect(double x, double y, double z, float yaw, float pitch, int i, boolean b)
	{
		
	}
	
	@Override
	public void onUpdate()
	{
		++ticksExisted;
		prevPosX = posX;
		prevPosY = posY;
		prevPosZ = posZ;
		prevRotationYaw = rotationYaw;
		++age;
		if(world.isRemote)
		{
			angle += 0.05D;
			setPosition(xCoord + 0.5F + Math.cos(angle) * 0.3F, yCoord + 0.5F, zCoord + 0.5F + Math.sin(angle) * 0.3F);
		}
		
		//Temporary fire glitch fix
		if(world.isRemote)
			extinguish();
	}
	
	public boolean attackEntityFrom(DamageSource par1DamageSource, int par2)
	{
		return false;
	}
	
	@Override
	public void onCollideWithPlayer(EntityPlayer player)
	{
		if(!world.isRemote)
		{
			EntityItemPickupEvent event = new EntityItemPickupEvent(player, this);
			
			if(MinecraftForge.EVENT_BUS.post(event))
			{
				return;
			}
			
			int spawnerTeamID = spawner.getTeamID();
			Team spawnerTeam = TeamsManager.getInstance().getTeam(spawnerTeamID);
			Team playerTeam = PlayerHandler.getPlayerData(player).team;
			if(spawnerTeam != null)
			{
				if(playerTeam != spawnerTeam)
					return;
			}
			
			//Getter of EntityItem
			int var2 = getItem().getCount();
			
			if((event.getResult() == Result.ALLOW || var2 <= 0 || player.inventory.addItemStackToInventory(getItem())))
			{
				FMLCommonHandler.instance().firePlayerItemPickupEvent(player, this, getItem().copy());
				
				playSound(SoundEvents.ENTITY_ITEM_PICKUP, 0.2F, ((rand.nextFloat() - rand.nextFloat()) * 0.7F + 1.0F) * 2.0F);
				player.onItemPickup(this, var2);
				
				//Getter of EntityItem
				if(getItem().getCount() <= 0)
				{
					spawner.itemEntities.remove(this);
					setDead();
				}
			}
		}
	}
	
	@Override
	public void writeSpawnData(ByteBuf data)
	{
		if(spawner == null)
		{
			data.writeInt(0);
			data.writeInt(0);
			data.writeInt(0);
		}
		else
		{
			data.writeInt(spawner.getPos().getX());
			data.writeInt(spawner.getPos().getY());
			data.writeInt(spawner.getPos().getZ());
		}
		data.writeDouble(angle);
		NBTTagCompound tags = new NBTTagCompound();
		//Getter of EntityItem
		getItem().writeToNBT(tags);
		ByteBufUtils.writeTag(data, tags);
	}
	
	@Override
	public void readSpawnData(ByteBuf data)
	{
		xCoord = data.readInt();
		yCoord = data.readInt();
		zCoord = data.readInt();
		angle = data.readDouble();
		setItem(new ItemStack(ByteBufUtils.readTag(data)));
	}
	
	@Override
	public void readEntityFromNBT(NBTTagCompound tags)
	{
		setDead();
	}
	
	@Override
	public boolean isBurning()
	{
		return false;
	}
}
