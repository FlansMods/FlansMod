package com.flansmod.common.teams;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;

import com.flansmod.common.PlayerHandler;

public class EntityTeamItem extends EntityItem implements IEntityAdditionalSpawnData {

	public TileEntitySpawner spawner;
	public double angle;
	public int xCoord, yCoord, zCoord;
	
	public EntityTeamItem(TileEntitySpawner te, int i) 
	{
		super(te.getWorldObj(), te.xCoord + 0.5F, te.yCoord + 0.5F, te.zCoord + 0.5F, te.stacksToSpawn.get(i).copy());
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
	public void setPositionAndRotation2(double x, double y, double z, float yaw, float pitch, int i)
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
        if(worldObj.isRemote)
        {
	        angle += 0.05D;
	        setPosition(xCoord + 0.5F + Math.cos(angle) * 0.3F, yCoord + 0.5F, zCoord + 0.5F + Math.sin(angle) * 0.3F);
        }
        
		//Temporary fire glitch fix
		if(worldObj.isRemote)
			extinguish();
    }
    
    public boolean attackEntityFrom(DamageSource par1DamageSource, int par2)
    {
     	return false;
    }
    
    @Override
	public void onCollideWithPlayer(EntityPlayer player)
    {
        if (!worldObj.isRemote)
        {
            EntityItemPickupEvent event = new EntityItemPickupEvent(player, this);

            if (MinecraftForge.EVENT_BUS.post(event))
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
            int var2 = getEntityItem().stackSize;

            if ((event.getResult() == Result.ALLOW || var2 <= 0 || player.inventory.addItemStackToInventory(getEntityItem())))
            {
            	FMLCommonHandler.instance().firePlayerItemPickupEvent(player, this);

                playSound("random.pop", 0.2F, ((rand.nextFloat() - rand.nextFloat()) * 0.7F + 1.0F) * 2.0F);
                player.onItemPickup(this, var2);

                //Getter of EntityItem
                if (getEntityItem().stackSize <= 0)
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
			data.writeInt(spawner.xCoord);
			data.writeInt(spawner.yCoord);
			data.writeInt(spawner.zCoord);
		}
		data.writeDouble(angle);
		NBTTagCompound tags = new NBTTagCompound();
		//Getter of EntityItem
		getEntityItem().writeToNBT(tags);
		ByteBufUtils.writeTag(data, tags);
	}

	@Override
	public void readSpawnData(ByteBuf data) 
	{
		xCoord = data.readInt();
		yCoord = data.readInt();
		zCoord = data.readInt();
		angle = data.readDouble();
		setEntityItemStack(ItemStack.loadItemStackFromNBT(ByteBufUtils.readTag(data)));
	}
	
	@Override
	public void readEntityFromNBT(NBTTagCompound tags)
	{
		setDead();
	}
	
    @Override
    public boolean canAttackWithItem()
    {
        return false;
    }
    
	@Override
    public boolean isBurning()
    {
    	return false;
    }
}
