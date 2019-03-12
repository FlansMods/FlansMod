package com.flansmod.apocalypse.common.entity;

import java.util.ArrayList;

import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.flansmod.apocalypse.common.FlansModApocalypse;
import com.flansmod.common.guns.EnumFireMode;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ShootableType;

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
			this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, gunStack);
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

		for(int i = 0; i < inventoryArmorDropChances.length; ++i)
		{
			inventoryArmorDropChances[i] = 0.5F;
		}
		inventoryHandsDropChances[0] = 1F;

		experienceValue = 20;
	}
	
	/**
	 * Grab the list of guns valid for survivors from the complete gun list
	 */
	private void initGunList()
	{
		validGuns = new ArrayList<>();
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
				case 0: dropItem(Items.COOKED_BEEF, 1);
					break;
				case 1: dropItem(Items.BREAD, 1);
					break;
				case 2: dropItem(Items.MUSHROOM_STEW, 1);
					break;
				case 3: dropItem(Items.COOKED_RABBIT, 1);
					break;
				case 4: dropItem(Items.COOKED_CHICKEN, 1);
					break;
			}
		}

		for(int i = 0; i < 5; i++)
		{
			if(ammoStacks[i] != null)
			{
				world.spawnEntity(new EntityItem(world, posX, posY, posZ, ammoStacks[i]));
			}
		}

		if(rand.nextInt(5) == 0)
			dropItem(Item.getItemFromBlock(Blocks.LOG), rand.nextInt(10) + 5);
		if(rand.nextInt(12) == 0)
			dropItem(Items.BOOK, 1);
		if(rand.nextInt(12) == 0)
			dropItem(Items.FLINT_AND_STEEL, 1);
		if(rand.nextInt(40) == 0)
			dropItem(Items.IRON_AXE, 1);
		if(rand.nextInt(40) == 0)
			dropItem(Items.IRON_PICKAXE, 1);
		if(rand.nextInt(40) == 0)
			dropItem(Items.IRON_SHOVEL, 1);
		if(rand.nextInt(4) == 0)
			dropItem(Item.getItemFromBlock(Blocks.TORCH), rand.nextInt(5) + 1);

		if(rand.nextBoolean())
		{
			world.spawnEntity(new EntityItem(world, posX, posY, posZ, FlansModApocalypse.getLootGenerator().getSurvivorJournal(rand)));
		}
	}
}
