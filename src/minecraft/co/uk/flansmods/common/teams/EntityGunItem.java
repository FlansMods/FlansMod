package co.uk.flansmods.common.teams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import co.uk.flansmods.common.BulletType;
import co.uk.flansmods.common.FlansModPlayerHandler;
import co.uk.flansmods.common.GunType;
import co.uk.flansmods.common.ItemBullet;
import co.uk.flansmods.common.ItemGun;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.entity.item.ItemExpireEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;

public class EntityGunItem extends EntityItem {
	
	public List<ItemStack> ammoStacks;
	
	public EntityGunItem(World w)
	{
		super(w);
	}
	
	public EntityGunItem(EntityItem entity)
	{
		super(entity.worldObj, entity.posX, entity.posY, entity.posZ, entity.getEntityItem().copy());
		setSize(1F, 1F);
		ammoStacks = new ArrayList<ItemStack>();
	}

	public EntityGunItem(World w, double x, double y, double z, ItemStack stack, List<ItemStack> stacks) 
	{
		super(w, x, y, z, stack);
		setSize(1F, 1F);
		ammoStacks = new ArrayList<ItemStack>();
		for(ItemStack ammoStack : stacks)
		{
			if(ammoStack != null && ammoStack.getItem() != null && (ammoStack.getItem() instanceof ItemBullet))
				ammoStacks.add(ammoStack);
		}
	}	
	
	public EntityGunItem(World w, double x, double y, double z)
	{
		super(w, x, y, z);
	}
	
	@Override
    public boolean canBeCollidedWith()
    {
        return true;
    }
	
	@Override
    protected boolean canTriggerWalking()
    {
        return true;
    }
	
	@Override
    public AxisAlignedBB getBoundingBox()
    {
    	return null;
    }
	
	@Override
    public boolean canAttackWithItem()
    {
        return true;
    }
	
	@Override
	public void onUpdate()
	{
		onEntityUpdate();
		if(getEntityItem() == null || getEntityItem().getItem() == null || !(getEntityItem().getItem() instanceof ItemGun))
			setDead();
		
		if(!worldObj.isRemote && ammoStacks == null)
			setDead();

        prevPosX = posX;
        prevPosY = posY;
        prevPosZ = posZ;
        motionY -= 0.03999999910593033D;
        pushOutOfBlocks(posX, (boundingBox.minY + boundingBox.maxY) / 2.0D, posZ);
        moveEntity(motionX, motionY, motionZ);

        float var2 = 0.98F;

        if (onGround)
        {
            var2 = 0.58800006F;
            int var3 = worldObj.getBlockId(MathHelper.floor_double(posX), MathHelper.floor_double(boundingBox.minY) - 1, MathHelper.floor_double(posZ));

            if (var3 > 0)
            {
                var2 = Block.blocksList[var3].slipperiness * 0.98F;
            }
        }

        motionX *= (double)var2;
        motionY *= 0.9800000190734863D;
        motionZ *= (double)var2;

        if (onGround)
        {
            motionY *= -0.5D;
        }

        ++age;

        ItemStack item = getDataWatcher().getWatchableObjectItemStack(10);

        if (!worldObj.isRemote && age >= lifespan)
        {
            if (item != null)
            {   
                ItemExpireEvent event = new ItemExpireEvent(this, (item.getItem() == null ? 6000 : item.getItem().getEntityLifespan(item, worldObj)));
                if (MinecraftForge.EVENT_BUS.post(event))
                {
                    lifespan += event.extraLife;
                }
                else
                {
                    setDead();
                }
            }
            else
            {
                setDead();
            }
        }

        if (item != null && item.stackSize <= 0)
        {
            setDead();
        }
	}
	
	@Override
    public boolean attackEntityFrom(DamageSource par1DamageSource, float par2)
    {
     	return false;
    }
    
    @Override
    public void onCollideWithPlayer(EntityPlayer player)
    {
        if (!worldObj.isRemote)
        {
        	if(ammoStacks != null && ammoStacks.size() > 0)
        	{
	        	for(int i = 0; i < player.inventory.getSizeInventory(); i++)
	        	{
	        		ItemStack stack = player.inventory.getStackInSlot(i);
	        		if(stack != null && stack.getItem() != null && stack.getItem() instanceof ItemGun)
	        		{
	        			GunType type = ((ItemGun)stack.getItem()).type;
	        			for(int j = ammoStacks.size() - 1; j >= 0; j--)
	        			{
	        				ItemStack ammoStack = ammoStacks.get(j);
	        				if(type.isAmmo(((ItemBullet)ammoStack.getItem()).type))
	        				{
	        					if(player.inventory.addItemStackToInventory(ammoStack))
	        					{
	        						GameRegistry.onPickupNotification(player, this);
	        		                playSound("random.pop", 0.2F, ((rand.nextFloat() - rand.nextFloat()) * 0.7F + 1.0F) * 2.0F);
	        						ammoStacks.remove(j);
	        					}
	        				}
	        			}
	        			if(ammoStacks.size() == 0)
	        				setDead();
	        		}
	        	}
        	}
        }
    }
    
    @Override
    public boolean interact(EntityPlayer player)
    {
		if(worldObj.isRemote)
			return true;
    	ItemStack currentItem = player.getCurrentEquippedItem();
    	if(currentItem != null && currentItem.getItem() instanceof ItemGun)
    	{
    		GunType gunType = ((ItemGun)currentItem.getItem()).type;
    		List<ItemStack> newAmmoStacks = new ArrayList<ItemStack>();
    		for(int i = 0; i < player.inventory.getSizeInventory(); i++)
    		{
    			ItemStack stack = player.inventory.getStackInSlot(i);
    			if(stack != null && stack.getItem() instanceof ItemBullet)
    			{
    				BulletType bulletType = ((ItemBullet)stack.getItem()).type;
    				if(gunType.isAmmo(bulletType))
    				{
    					newAmmoStacks.add(stack.copy());
    					player.inventory.setInventorySlotContents(i, null);
    				}
    			}
    		}
    		EntityGunItem newGunItem = new EntityGunItem(worldObj, posX, posY, posZ, currentItem.copy(), newAmmoStacks); 
    		worldObj.spawnEntityInWorld(newGunItem);
    		player.inventory.setInventorySlotContents(player.inventory.currentItem, getEntityItem());
    		for(ItemStack stack : ammoStacks)
    		{
    			player.inventory.addItemStackToInventory(stack);
    		}
    		setDead();
    		FlansModPlayerHandler.getPlayerData(player).shootClickDelay = 10;
    		FlansModPlayerHandler.getPlayerData(player).isShooting = false;
    		return true;
    	}
    	return false;
    }
}
