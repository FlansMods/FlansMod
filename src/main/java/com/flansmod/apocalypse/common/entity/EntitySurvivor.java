package com.flansmod.apocalypse.common.entity;

import java.util.ArrayList;

import com.flansmod.apocalypse.common.FlansModApocalypse;
import com.flansmod.common.guns.EnumFireMode;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ShootableType;

import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntitySurvivor extends EntityFlansModShooter 
{	
	public static ArrayList<GunType> validGuns;
	
	public EntitySurvivor(World world) 
	{
		super(world);
		if(!world.isRemote)
		{
			if(validGuns == null)
				initGunList();
			
			//Pick a random gun for this survivor
			GunType gun = validGuns.get(world.rand.nextInt(validGuns.size()));
			ItemStack gunStack = FlansModApocalypse.getLootGenerator().loadAndPaintGun(gun, world.rand);
			this.setCurrentItemOrArmor(0, gunStack);
			//Add random armour
			FlansModApocalypse.getLootGenerator().dressMeUp(this, world.rand);
			
			ammoStacks = new ItemStack[5];
			int numAmmo = world.rand.nextInt(4) + 2;
			for(int i = 0; i < numAmmo; i++)
			{
				ShootableType type = gun.ammo.get(world.rand.nextInt(gun.ammo.size()));
				ammoStacks[i] = new ItemStack(type.item);
			}
		}
	    targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityFlansModShooter.class, true));
        //tasks.addTask(5, new EntityAIGoSomewhere(this, 1.0D, world.rand.nextDouble() * 10D, world.rand.nextDouble() * 10D));
	    
        for(int i = 0; i < equipmentDropChances.length; ++i)
        {
            equipmentDropChances[i] = 0.5F;
        }
        equipmentDropChances[0] = 1F;
        
        experienceValue = 20;
	}
	
	/** Grab the list of guns valid for survivors from the complete gun list */
	private void initGunList()
	{
		validGuns = new ArrayList<GunType>();
		for(GunType gun : GunType.gunList)
		{
			if(gun.mode == EnumFireMode.SEMIAUTO && !gun.deployable && gun.ammo.size() > 0 && !gun.shield && gun.usableByPlayers && gun.dungeonChance != 0)
				validGuns.add(gun);
		}
	}

    protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
    	int numFoods = rand.nextInt(5);
    	
    	for(int i = 0; i < numFoods; i++)
    	{
    		switch(rand.nextInt(5))
    		{
    		case 0 : dropItem(Items.cooked_beef, 1); break;
    		case 1 : dropItem(Items.bread, 1); break;
    		case 2 : dropItem(Items.mushroom_stew, 1); break;
    		case 3 : dropItem(Items.cooked_rabbit, 1); break;
    		case 4 : dropItem(Items.cooked_chicken, 1); break;   		
    		} 		
    	}
    	
    	for(int i = 0; i < 5; i++)
    	{
    		if(ammoStacks[i] != null)
    		{
    			worldObj.spawnEntity(new EntityItem(worldObj, posX, posY, posZ, ammoStacks[i]));
    		}
    	}
    	
    	if(rand.nextInt(5) == 0)
    		dropItem(Item.getItemFromBlock(Blocks.log), rand.nextInt(10) + 5);
    	if(rand.nextInt(12) == 0)
    		dropItem(Items.book, 1);
    	if(rand.nextInt(12) == 0)
    		dropItem(Items.flint_and_steel, 1);
    	if(rand.nextInt(40) == 0)
    		dropItem(Items.iron_axe, 1);
    	if(rand.nextInt(40) == 0)
    		dropItem(Items.iron_pickaxe, 1);
    	if(rand.nextInt(40) == 0)
    		dropItem(Items.iron_shovel, 1);
    	if(rand.nextInt(4) == 0)
    		dropItem(Item.getItemFromBlock(Blocks.torch), rand.nextInt(5) + 1);
    	
    	if(rand.nextBoolean())
    	{
    		worldObj.spawnEntity(new EntityItem(worldObj, posX, posY, posZ, FlansModApocalypse.getLootGenerator().getSurvivorJournal(rand)));
    	}
    }
}
