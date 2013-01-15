package co.uk.flansmods.common.teams;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import co.uk.flansmods.common.FlansModPlayerHandler;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteArrayDataOutput;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;

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

            //Getter of EntityItem
            int var2 = func_92014_d().stackSize;

            if ((event.getResult() == Result.ALLOW || var2 <= 0 || par1EntityPlayer.inventory.addItemStackToInventory(func_92014_d())))
            {
                GameRegistry.onPickupNotification(par1EntityPlayer, this);

                playSound("random.pop", 0.2F, ((rand.nextFloat() - rand.nextFloat()) * 0.7F + 1.0F) * 2.0F);
                par1EntityPlayer.onItemPickup(this, var2);

                //Getter of EntityItem
                if (func_92014_d().stackSize <= 0)
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
			//Getter of EntityItem
			func_92014_d().writeToNBT(tags);
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
			//Flan, as EntityItem's itemstack (previously the field was called 'item') field is now only managed
			//by datawatchers, there are now getters and setters, both currently still unmapped by Forge. This
			//method sets the itemstack.
			func_92013_a(ItemStack.loadItemStackFromNBT((NBTTagCompound)NBTTagCompound.readNamedTag(data)));
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
