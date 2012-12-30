package co.uk.flansmods.common.teams;

import java.util.List;

import co.uk.flansmods.common.GunType;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityGunItem extends Entity {
	
	public GunType gun;
	public List<ItemStack> ammoStacks;

	public EntityGunItem(World w) 
	{
		super(w);
	}

	@Override
	protected void entityInit() 
	{

	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound var1) 
	{
		
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound var1) 
	{
		
	}

}
