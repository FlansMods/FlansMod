package co.uk.flansmods.common.teams;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteArrayDataOutput;

import co.uk.flansmods.common.FlansModPlayerHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.AchievementList;
import net.minecraft.util.DamageSource;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;

public class EntityTeamItem extends EntityItem implements IEntityAdditionalSpawnData {

	public TileEntitySpawner spawner;
	public double angle;
	public int xCoord, yCoord, zCoord;
	
	public EntityTeamItem(TileEntitySpawner te, int i) 
	{
		super(te.worldObj, te.xCoord + 0.5F, te.yCoord + 0.5F, te.zCoord + 0.5F, te.stacksToSpawn.get(i).copy());
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
    }
    
    public boolean attackEntityFrom(DamageSource par1DamageSource, int par2)
    {
     	return false;
    }
    
    public void onCollideWithPlayer(EntityPlayer par1EntityPlayer)
    {
        if (!worldObj.isRemote)
        {
            EntityItemPickupEvent event = new EntityItemPickupEvent(par1EntityPlayer, this);

            if (MinecraftForge.EVENT_BUS.post(event))
            {
                return;
            }
            
            Team spawnerTeam = spawner.getTeam();
            Team playerTeam = FlansModPlayerHandler.getPlayerData(par1EntityPlayer).team;
            if(spawnerTeam != null)
            {
            	if(playerTeam != spawnerTeam)
            		return;
            }

            int var2 = item.stackSize;

            if ((event.getResult() == Result.ALLOW || var2 <= 0 || par1EntityPlayer.inventory.addItemStackToInventory(item)))
            {
                GameRegistry.onPickupNotification(par1EntityPlayer, this);

                func_85030_a("random.pop", 0.2F, ((rand.nextFloat() - rand.nextFloat()) * 0.7F + 1.0F) * 2.0F);
                par1EntityPlayer.onItemPickup(this, var2);

                if (item.stackSize <= 0)
                {
                	spawner.itemEntities.remove(this);
                    setDead();
                }
            }
        }
    }

	@Override
	public void writeSpawnData(ByteArrayDataOutput data) 
	{
		try
		{
			data.writeInt(spawner.xCoord);
			data.writeInt(spawner.yCoord);
			data.writeInt(spawner.zCoord);
			data.writeDouble(angle);
			NBTTagCompound tags = new NBTTagCompound();
			item.writeToNBT(tags);
			NBTTagCompound.writeNamedTag(tags, data);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			setDead();
		}
	}

	@Override
	public void readSpawnData(ByteArrayDataInput data) 
	{
		try
		{
			xCoord = data.readInt();
			yCoord = data.readInt();
			zCoord = data.readInt();
			angle = data.readDouble();
			item = ItemStack.loadItemStackFromNBT((NBTTagCompound)NBTTagCompound.readNamedTag(data));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public void readEntityFromNBT(NBTTagCompound tags)
	{
		setDead();
	}
}
