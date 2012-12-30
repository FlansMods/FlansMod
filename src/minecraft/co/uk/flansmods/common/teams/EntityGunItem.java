package co.uk.flansmods.common.teams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import co.uk.flansmods.common.FlansModPlayerHandler;
import co.uk.flansmods.common.GunType;
import co.uk.flansmods.common.ItemBullet;
import co.uk.flansmods.common.ItemGun;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;

public class EntityGunItem extends EntityItem {
	
	public List<ItemStack> ammoStacks;

	public EntityGunItem(World w, double x, double y, double z, ItemStack stack, List<ItemStack> stacks) 
	{
		super(w, x, y, z, stack);
		ammoStacks = new ArrayList<ItemStack>();
		for(ItemStack ammoStack : stacks)
		{
			if(ammoStack != null && ammoStack.getItem() != null && (ammoStack.getItem() instanceof ItemBullet))
				ammoStacks.add(ammoStack);
		}
	}

	@Override
	protected void entityInit() 
	{

	}	
	
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		if(func_92014_d() == null || func_92014_d().getItem() == null || !(func_92014_d().getItem() instanceof ItemGun))
			setDead();
	}
    
    public boolean attackEntityFrom(DamageSource par1DamageSource, int par2)
    {
     	return false;
    }
    
    public void onCollideWithPlayer(EntityPlayer player)
    {
        if (!worldObj.isRemote)
        {
        	for(int i = 0; i < player.inventory.getSizeInventory(); i++)
        	{
        		ItemStack stack = player.inventory.getStackInSlot(i);
        		if(stack != null && stack.getItem() != null && stack.getItem() instanceof ItemGun)
        		{
        			GunType type = ((ItemGun)stack.getItem()).type;
        			Iterator<ItemStack> iterator = ammoStacks.listIterator();
        			do
        			{
        				ItemStack ammoStack = iterator.next();
        				if(type.isAmmo(((ItemBullet)ammoStack.getItem()).type))
        				{
        					if(player.inventory.addItemStackToInventory(ammoStack))
        					{
        						GameRegistry.onPickupNotification(player, this);
        		                func_85030_a("random.pop", 0.2F, ((rand.nextFloat() - rand.nextFloat()) * 0.7F + 1.0F) * 2.0F);
        						ammoStacks.remove(ammoStack);
        					}
        				}
        			}
        			while(iterator.hasNext());     			
        		}
        	}
        }
    }
}
