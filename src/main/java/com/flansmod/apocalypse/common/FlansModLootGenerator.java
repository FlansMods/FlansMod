package com.flansmod.apocalypse.common;

import java.util.ArrayList;
import java.util.Random;

import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EnumPlaneMode;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.driveables.VehicleType;
import com.flansmod.common.driveables.mechas.MechaItemType;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.guns.boxes.GunBoxType;
import com.flansmod.common.parts.EnumPartCategory;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.teams.ArmourBoxType;
import com.flansmod.common.teams.ArmourType;
import com.flansmod.common.teams.PlayerClass;
import com.flansmod.common.teams.Team;
import com.flansmod.common.types.EnumType;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntityBrewingStand;
import net.minecraft.tileentity.TileEntityChest;

public class FlansModLootGenerator 
{
	private static ArrayList<VehicleType> tanks, cars;
	private static ArrayList<PlaneType> planes, helicopters;
	private static ArrayList<MechaType> mechas, dungeonMechas;
	private static ArrayList<PartType> vehicleEngines, planeEngines, mechaEngines;
	private static ArrayList<GunType> validGuns;
	
	private static int[] potions = new int[] { 8193, 8194, 8195, 8197, 8198, 8201, 8203, 8205, 8206 };
	
	public FlansModLootGenerator()
	{
		tanks = new ArrayList<VehicleType>();
		cars = new ArrayList<VehicleType>();
		planes = new ArrayList<PlaneType>();
		helicopters = new ArrayList<PlaneType>();
		mechas = new ArrayList<MechaType>();
		dungeonMechas = new ArrayList<MechaType>();

		
		for(DriveableType type : DriveableType.types)
		{
			if(type instanceof VehicleType)
			{
				if(((VehicleType)type).tank)
					tanks.add((VehicleType)type);
				else if(!type.floatOnWater)
					cars.add((VehicleType)type);
			}
			else if(type instanceof PlaneType)
			{
				if(((PlaneType)type).mode == EnumPlaneMode.PLANE)
					planes.add((PlaneType)type);
				else helicopters.add((PlaneType)type);
			}
			else if(type instanceof MechaType)
			{
				mechas.add((MechaType)type);
				if(((MechaType)type).height <= 3F)
					dungeonMechas.add((MechaType)type);
			}
		}
		
		vehicleEngines = new ArrayList<PartType>();
		mechaEngines = new ArrayList<PartType>();
		planeEngines = new ArrayList<PartType>();
		
		for(PartType type : PartType.partsByCategory.get(EnumPartCategory.ENGINE))
		{
			if(type.isAIChip)
				continue;
			if(type.worksWith.contains(EnumType.plane))
				planeEngines.add(type);
			if(type.worksWith.contains(EnumType.vehicle))
				vehicleEngines.add(type);
			if(type.worksWith.contains(EnumType.mecha))
				mechaEngines.add(type);
		}
		
		validGuns = new ArrayList<GunType>();
		for(GunType type : GunType.gunList)
			if(type.dungeonChance != 0)
				validGuns.add(type);
	}
	
	public ItemStack getRandomLoadedGun(Random rand) 
	{
		ItemStack stack = getRandomUnloadedGun(rand);
		
		GunType gunType = ((ItemGun)stack.getItem()).type;
		if(gunType.ammo.size() > 0)
		{
			NBTTagList ammoTagsList = new NBTTagList();
			for(int i = 0; i < gunType.numAmmoItemsInGun; i++)
			{
				NBTTagCompound ammoTag = new NBTTagCompound();
				ShootableType ammoType = gunType.ammo.get(rand.nextInt(gunType.ammo.size()));
				ItemStack ammoStack = new ItemStack(ammoType.item);
				ammoStack.setItemDamage(rand.nextInt(ammoType.roundsPerItem));
				ammoStack.writeToNBT(ammoTag);
				ammoTagsList.appendTag(ammoTag);
			}
			stack.getTagCompound().setTag("ammo", ammoTagsList);
		}
		return stack;
	}
	
	public ItemStack getRandomUnloadedGun(Random rand) 
	{
		GunType gun = validGuns.get(rand.nextInt(validGuns.size()));
		ItemStack stack = new ItemStack(gun.item);
		NBTTagCompound tags = new NBTTagCompound();
		tags.setString("Paint", gun.paintjobs.get(rand.nextInt(gun.paintjobs.size())).iconName);
		stack.setTagCompound(tags);
		return stack;
	}

	public void fillVillageChest(Random rand, TileEntityChest chest) 
	{
		int numParts = rand.nextInt(6) + 1;
		int numAmmo = rand.nextInt(6) + 1;
		int numFuel = rand.nextInt(2) + 1;
		int numFood = rand.nextInt(3);
		
		//Add 1~5 random parts
		for(int i = 0; i < numParts; i++)
		{
			PartType part = PartType.parts.get(rand.nextInt(PartType.parts.size()));
			chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(part.item, 1));
		}
		
		//Add 1~5 random ammo
		for(int i = 0; i < numAmmo; i++)
		{
			ShootableType type = ShootableType.shootables.get(new ArrayList<String>(ShootableType.shootables.keySet()).get(rand.nextInt(ShootableType.shootables.size())));
			if(type != null && type.dungeonChance != 0)
				chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(type.item, 1 + (type.maxStackSize > 1 && rand.nextBoolean() ? 1 : 0)));
		}
		
		//Add 1~2 fuel items
		ArrayList<PartType> fuelItems = PartType.partsByCategory.get(EnumPartCategory.FUEL);
		
		for(int i = 0; i < numFuel; i++)
		{
			PartType fuel = fuelItems.get(rand.nextInt(fuelItems.size()));
			chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(fuel.item, rand.nextInt(Math.min(fuel.stackSize - 1, 2)) + 1));
		}
		
		//Add 0~2 food items
		for(int i = 0; i < numFood; i++)
		{
			switch(rand.nextInt(4))
			{
			case 0 : chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.chicken, rand.nextInt(2) + 1)); break;
			case 1 : chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.porkchop, rand.nextInt(2) + 1)); break;
			case 2 : chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.beef, rand.nextInt(2) + 1)); break;
			case 3 : chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.baked_potato, rand.nextInt(3) + 1)); break;
			}
		}
		
		//Add 0~1 mecha parts
		if(rand.nextBoolean())
		{
			chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(MechaItemType.types.get(rand.nextInt(MechaItemType.types.size())).item));
		}
	}
	
	public PartType getRandomFuel(Random rand)
	{
		ArrayList<PartType> fuelItems = PartType.partsByCategory.get(EnumPartCategory.FUEL);
		return fuelItems.get(rand.nextInt(fuelItems.size()));
	}

	public ItemStack loadAndPaintGun(GunType gun, Random rand) 
	{
		ItemStack stack = new ItemStack(gun.item);
		NBTTagCompound tags = new NBTTagCompound();
		tags.setString("Paint", gun.paintjobs.get(rand.nextInt(gun.paintjobs.size())).iconName);
		if(gun.ammo.size() > 0)
		{
			NBTTagList ammoTagsList = new NBTTagList();
			for(int i = 0; i < gun.numAmmoItemsInGun; i++)
			{
				NBTTagCompound ammoTag = new NBTTagCompound();
				ShootableType ammoType = gun.ammo.get(rand.nextInt(gun.ammo.size()));
				ItemStack ammoStack = new ItemStack(ammoType.item);
				ammoStack.setItemDamage(rand.nextInt(ammoType.roundsPerItem));
				ammoStack.writeToNBT(ammoTag);
				ammoTagsList.appendTag(ammoTag);
			}
			tags.setTag("ammo", ammoTagsList);
		}
		stack.setTagCompound(tags);
		return stack;
	}

	public void dressMeUp(EntityLivingBase entity, Random rand) 
	{
		if(rand.nextBoolean() && ArmourType.armours.size() > 0)
		{
			//Give a completely random piece of armour
			ArmourType armour = ArmourType.armours.get(rand.nextInt(ArmourType.armours.size()));
			if(armour != null && armour.type != 2)
				entity.setCurrentItemOrArmor(armour.type + 1, new ItemStack(armour.item));
		}
		else if(Team.teams.size() > 0)
		{
			//Give a random set of armour
			Team team = Team.teams.get(rand.nextInt(Team.teams.size()));
			if(team.hat != null)
				entity.setCurrentItemOrArmor(1, team.hat.copy());
			if(team.chest != null)
				entity.setCurrentItemOrArmor(2, team.chest.copy());
			if(team.legs != null)
				entity.setCurrentItemOrArmor(3, team.legs.copy());
			if(team.shoes != null)
				entity.setCurrentItemOrArmor(4, team.shoes.copy());
			
			if(team.classes.size() > 0)
			{
				PlayerClass playerClass = team.classes.get(rand.nextInt(team.classes.size()));
				if(playerClass.hat != null)
					entity.setCurrentItemOrArmor(1, playerClass.hat.copy());
				if(playerClass.chest != null)
					entity.setCurrentItemOrArmor(2, playerClass.chest.copy());
				if(playerClass.legs != null)
					entity.setCurrentItemOrArmor(3, playerClass.legs.copy());
				if(playerClass.shoes != null)
					entity.setCurrentItemOrArmor(4, playerClass.shoes.copy());
			}
		}
	}

	public Block getRandomWeaponBox(Random rand) 
	{
		if(rand.nextInt(4) == 0)
		{
			//Get armour box
			return ArmourBoxType.boxes.get(new ArrayList<String>(ArmourBoxType.boxes.keySet()).get(rand.nextInt(ArmourBoxType.boxes.size()))).block;
		}
		else
		{
			//Get weapon box
			return GunBoxType.gunBoxMap.get(new ArrayList<String>(GunBoxType.gunBoxMap.keySet()).get(rand.nextInt(GunBoxType.gunBoxMap.size()))).block;
		}
	}

	public DriveableType getRandomDriveable(Random rand) 
	{	
		switch(rand.nextInt(5))
		{
		case 0: if(cars.size() > 0) 		return cars.get(rand.nextInt(cars.size()));
		case 1: if(tanks.size() > 0) 		return tanks.get(rand.nextInt(tanks.size()));
		case 2: if(planes.size() > 0) 		return planes.get(rand.nextInt(planes.size()));
		case 3: if(helicopters.size() > 0) 	return helicopters.get(rand.nextInt(helicopters.size()));
		case 4: if(mechas.size() > 0) 		return mechas.get(rand.nextInt(mechas.size()));
		}
		return null;
	}

	public PartType getRandomEngine(DriveableType type, Random rand) 
	{
		switch(EnumType.getFromObject(type))
		{
		case vehicle: return vehicleEngines.size() > 0 ? vehicleEngines.get(rand.nextInt(vehicleEngines.size())) : null;
		case plane: return planeEngines.size() > 0 ? planeEngines.get(rand.nextInt(planeEngines.size())) : null;
		case mecha: return mechaEngines.size() > 0 ? mechaEngines.get(rand.nextInt(mechaEngines.size())) : null;
		}
		return null;
	}

	public PlaneType getRandomPlane(Random rand) 
	{
		if(planes.size() > 0)
			return planes.get(rand.nextInt(planes.size()));
		return null;
	}

	public void fillBrewingStand(Random rand, TileEntityBrewingStand tileentity) 
	{
		for(int i = 0; i < 3; i++)
			if(rand.nextBoolean())
				tileentity.setInventorySlotContents(i, new ItemStack(Items.potionitem, 1, potions[rand.nextInt(9)]));
	}

	public void fillLiquidLabChest(Random rand, TileEntityChest chest) 
	{
		for(int i = 0; i < 3 + rand.nextInt(3); i++)
		{
			switch(rand.nextInt(8))
			{
			case 0 : chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.bowl, rand.nextInt(5) + 1)); break;
			case 1 : chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.water_bucket)); break;
			case 2 : chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.bucket, rand.nextInt(2) + 1)); break;
			case 3 : chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.potionitem)); break;
			case 4 : chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.potionitem)); break;
			case 5 : chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.potionitem)); break;
			case 6 : chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.potionitem, potions[rand.nextInt(9)])); break;
			case 7 : chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(FlansModApocalypse.sulphur, rand.nextInt(12) + 1)); break;
			}
		}
	}

	public void fillWeaponChest(Random rand, TileEntityChest chest) 
	{
		for(int i = 0; i < 3 + rand.nextInt(3); i++)
		{
			chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), getRandomAmmo(rand));
		}
		for(int i = 0; i < 1 + rand.nextInt(1); i++)
		{
			chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), getRandomAttachment(rand));			
		}
		
	}

	private ItemStack getRandomAmmo(Random rand) 
	{
		GunType randomGun = validGuns.get(rand.nextInt(validGuns.size()));
		if(randomGun.ammo.size() <= 0)
			return null;
		ShootableType randomBullet = randomGun.ammo.get(rand.nextInt(randomGun.ammo.size()));
		return new ItemStack(randomBullet.item);
	}
	
	private ItemStack getRandomAttachment(Random rand) 
	{
		AttachmentType type = AttachmentType.attachments.get(rand.nextInt(AttachmentType.attachments.size()));
		return new ItemStack(type.item);
	}

	public MechaType getRandomDungeonMecha(Random rand) 
	{
		if(dungeonMechas.size() > 0)
			return dungeonMechas.get(rand.nextInt(dungeonMechas.size()));
		return null;
	}

	public void fillDyeFactoryChest(TileEntityChest chest, Random rand) 
	{
		int numDyes = rand.nextInt(8);
		int numMisc = rand.nextInt(4);
		
		for(int i = 0; i < numDyes; i++)
		{
			chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.dye, rand.nextInt(8) + 1, rand.nextInt(16)));
		}
		
		for(int i = 0; i < numMisc; i++)
		{
			switch(rand.nextInt(4))
			{
			case 0 : chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.string, rand.nextInt(5) + 1)); break;
			case 1 : chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.feather, rand.nextInt(5) + 1)); break;
			case 2 : chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.leather, rand.nextInt(8) + 1)); break;
			case 3 : chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.clay_ball, rand.nextInt(32) + 1)); break;
			}
		}
		
	}
}
