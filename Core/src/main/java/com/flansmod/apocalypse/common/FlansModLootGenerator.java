package com.flansmod.apocalypse.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.tileentity.TileEntityBrewingStand;
import net.minecraft.tileentity.TileEntityChest;

import com.flansmod.common.TileEntityItemHolder;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EnumPlaneMode;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.driveables.VehicleType;
import com.flansmod.common.driveables.mechas.MechaItemType;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.guns.AttachmentType;
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
import com.flansmod.common.tools.ToolType;
import com.flansmod.common.types.EnumType;

public class FlansModLootGenerator
{
	private static ArrayList<VehicleType> tanks, cars;
	private static ArrayList<PlaneType> planes, helicopters;
	private static ArrayList<MechaType> mechas, dungeonMechas;
	private static ArrayList<PartType> vehicleEngines, planeEngines, mechaEngines;
	private static ArrayList<GunType> validGuns;
	
	private static int[] potions = new int[]{8193, 8194, 8195, 8197, 8198, 8201, 8203, 8205, 8206};
	
	public FlansModLootGenerator()
	{
		tanks = new ArrayList<>();
		cars = new ArrayList<>();
		planes = new ArrayList<>();
		helicopters = new ArrayList<>();
		mechas = new ArrayList<>();
		dungeonMechas = new ArrayList<>();
		
		
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
		
		vehicleEngines = new ArrayList<>();
		mechaEngines = new ArrayList<>();
		planeEngines = new ArrayList<>();
		
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
		
		validGuns = new ArrayList<>();
		for(GunType type : GunType.gunList)
			if(type.dungeonChance != 0)
				validGuns.add(type);
	}
	
	public ItemStack getRandomLoadedGun(Random rand, boolean explosivesAllowed)
	{
		ItemStack stack = getRandomUnloadedGun(rand);
		
		GunType gunType = ((ItemGun)stack.getItem()).GetType();
		List<ShootableType> ammoList = explosivesAllowed ? gunType.ammo : gunType.nonExplosiveAmmo;
		if(ammoList.size() > 0)
		{
			NBTTagList ammoTagsList = new NBTTagList();
			for(int i = 0; i < gunType.numAmmoItemsInGun; i++)
			{
				NBTTagCompound ammoTag = new NBTTagCompound();
				ShootableType ammoType = ammoList.get(rand.nextInt(ammoList.size()));
				ItemStack ammoStack = new ItemStack(ammoType.item);
				ammoStack.setItemDamage(rand.nextInt(ammoType.roundsPerItem));
				ammoStack.writeToNBT(ammoTag);
				ammoTagsList.appendTag(ammoTag);
			}
			stack.getTagCompound().setTag("ammo", ammoTagsList);
		}
		if(gunType.paintjobs.size() > 1)
			stack.setItemDamage(rand.nextInt(gunType.paintjobs.size()));
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
	
	public void addRandomLoot(TileEntityItemHolder holder, Random rand, boolean gunsOnly)
	{
		//Add a gun, 2/3rds of the time
		if(gunsOnly || rand.nextInt(3) != 0)
			holder.setStack(getRandomLoadedGun(rand, true));
		else if(rand.nextBoolean())
			holder.setStack(getSurvivorJournal(rand));
		else if(rand.nextBoolean())
			holder.setStack(new ItemStack(Items.ROTTEN_FLESH, 1 + rand.nextInt(3)));
	}
	
	public void fillVillageChest(Random rand, TileEntityChest chest)
	{
		int numParts = rand.nextInt(6) + 1;
		int numAmmo = rand.nextInt(6) + 1;
		int numFuel = rand.nextInt(3);
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
			ShootableType type = ShootableType.shootables.get(new ArrayList<>(ShootableType.shootables.keySet()).get(rand.nextInt(ShootableType.shootables.size())));
			if(type != null && type.dungeonChance != 0)
				chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(type.item, 1 + (type.maxStackSize > 1 && rand.nextBoolean() ? 1 : 0)));
		}
		
		//Add 0~2 fuel items
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
				case 0: chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.CHICKEN, rand.nextInt(2) + 1));
					break;
				case 1: chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.PORKCHOP, rand.nextInt(2) + 1));
					break;
				case 2: chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.BEEF, rand.nextInt(2) + 1));
					break;
				case 3: chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.BAKED_POTATO, rand.nextInt(3) + 1));
					break;
			}
		}
		
		//Add 0~1 mecha parts
		if(rand.nextBoolean() && rand.nextBoolean())
		{
			chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(MechaItemType.types.get(rand.nextInt(MechaItemType.types.size())).item));
		}
		
		//Add 0~1 tools
		if(rand.nextBoolean())
		{
			chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(ToolType.tools.get(new ArrayList<>(ToolType.tools.keySet()).get(rand.nextInt(ToolType.tools.size()))).item));
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
				entity.setItemStackToSlot(EntityEquipmentSlot.values()[armour.type + 2], new ItemStack(armour.item));
		}
		else if(Team.teams.size() > 0)
		{
			//Give a random set of armour
			Team team = Team.teams.get(rand.nextInt(Team.teams.size()));
			if(team.hat != null)
				entity.setItemStackToSlot(EntityEquipmentSlot.HEAD, team.hat.copy());
			if(team.chest != null)
				entity.setItemStackToSlot(EntityEquipmentSlot.CHEST, team.chest.copy());
			if(team.legs != null)
				entity.setItemStackToSlot(EntityEquipmentSlot.LEGS, team.legs.copy());
			if(team.shoes != null)
				entity.setItemStackToSlot(EntityEquipmentSlot.FEET, team.shoes.copy());
			
			if(team.classes.size() > 0)
			{
				PlayerClass playerClass = team.classes.get(rand.nextInt(team.classes.size()));
				if(playerClass.hat != null)
					entity.setItemStackToSlot(EntityEquipmentSlot.HEAD, playerClass.hat.copy());
				if(playerClass.chest != null)
					entity.setItemStackToSlot(EntityEquipmentSlot.CHEST, playerClass.chest.copy());
				if(playerClass.legs != null)
					entity.setItemStackToSlot(EntityEquipmentSlot.LEGS, playerClass.legs.copy());
				if(playerClass.shoes != null)
					entity.setItemStackToSlot(EntityEquipmentSlot.FEET, playerClass.shoes.copy());
			}
		}
	}
	
	public Block getRandomWeaponBox(Random rand)
	{
		if(rand.nextInt(4) == 0)
		{
			//Get armour box
			if(ArmourBoxType.boxes.size() > 0)
			{
				return ArmourBoxType.boxes.get(new ArrayList<>(ArmourBoxType.boxes.keySet()).get(rand.nextInt(ArmourBoxType.boxes.size()))).block;
			}
		}
		else
		{
			//Get weapon box
			if(GunBoxType.gunBoxMap.size() > 0)
			{
				return GunBoxType.gunBoxMap.get(new ArrayList<>(GunBoxType.gunBoxMap.keySet()).get(rand.nextInt(GunBoxType.gunBoxMap.size()))).block;
			}
		}
		
		return Blocks.AIR;
	}
	
	public DriveableType getRandomDriveable(Random rand)
	{
		switch(rand.nextInt(5))
		{
			case 0: if(cars.size() > 0) return cars.get(rand.nextInt(cars.size()));
			case 1: if(tanks.size() > 0) return tanks.get(rand.nextInt(tanks.size()));
			case 2: if(planes.size() > 0) return planes.get(rand.nextInt(planes.size()));
			case 3: if(helicopters.size() > 0) return helicopters.get(rand.nextInt(helicopters.size()));
			case 4: if(mechas.size() > 0) return mechas.get(rand.nextInt(mechas.size()));
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
			default: return null;
		}
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
				tileentity.setInventorySlotContents(i, new ItemStack(Items.POTIONITEM, 1, potions[rand.nextInt(9)]));
	}
	
	public void fillLiquidLabChest(Random rand, TileEntityChest chest)
	{
		int numItems = 3 + rand.nextInt(4);
		for(int i = 0; i < numItems; i++)
		{
			switch(rand.nextInt(10))
			{
				case 0: chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.BOWL, rand.nextInt(5) + 1));
					break;
				case 1: chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.WATER_BUCKET));
					break;
				case 2: chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.BUCKET, rand.nextInt(2) + 1));
					break;
				case 3: chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.POTIONITEM));
					break;
				case 4: chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.POTIONITEM));
					break;
				case 5: chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.POTIONITEM));
					break;
				case 6: chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.POTIONITEM, 1, potions[rand.nextInt(9)]));
					break;
				case 7: chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(FlansModApocalypse.sulphur, rand.nextInt(12) + 1));
					break;
				case 8: chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), getScientistJournal(rand));
					break;
				case 9: chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), getScientistJournal(rand));
					break;
			}
		}
	}
	
	public void fillWeaponChest(Random rand, TileEntityChest chest)
	{
		for(int i = 0; i < 3 + rand.nextInt(3); i++)
		{
			ItemStack stack = getRandomAmmo(rand);
			if(stack != null)
			{
				chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), stack);
			}
		}
		for(int i = 0; i < 1 + rand.nextInt(1); i++)
		{
			ItemStack stack = getRandomAttachment(rand);
			if(stack != null)
			{
				chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), stack);
			}
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
		int numDyes = rand.nextInt(4);
		int numMisc = rand.nextInt(2);
		
		for(int i = 0; i < numDyes; i++)
		{
			chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.DYE, rand.nextInt(8) + 1, rand.nextInt(16)));
		}
		
		for(int i = 0; i < numMisc; i++)
		{
			switch(rand.nextInt(4))
			{
				case 0: chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.STRING, rand.nextInt(5) + 1));
					break;
				case 1: chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.FEATHER, rand.nextInt(5) + 1));
					break;
				case 2: chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.LEATHER, rand.nextInt(8) + 1));
					break;
				case 3: chest.setInventorySlotContents(rand.nextInt(chest.getSizeInventory()), new ItemStack(Items.CLAY_BALL, rand.nextInt(32) + 1));
					break;
			}
		}
	}
	
	public ItemStack getScientistJournal(Random rand)
	{
		ItemStack stack = new ItemStack(Items.WRITTEN_BOOK);
		
		//Give the book an author
		stack.setTagInfo("author", new NBTTagString("Dr. Brazier"));
		NBTTagList pages = new NBTTagList();
		
		//Write in a random journal entry
		switch(rand.nextInt(8))
		{
			case 0:
				stack.setTagInfo("title", new NBTTagString("Research Journal: Entry 1"));
				pages.appendTag(new NBTTagString("We are trying to find ways to disable the AI mechas. Unfortunately, this involves bringing specimens into our lab for testing. I protested to management, but they wouldn't listen, as ever. This will be the death of us, I know it."));
				break;
			case 1:
				stack.setTagInfo("title", new NBTTagString("Research Journal: Entry 2"));
				pages.appendTag(new NBTTagString("The Mechas are almost... evolving... We try something new (today it was EMPs), boot them back up for another test and they've become resistant. Just like that. And I fear that the mechas we have here may be contacting others on the outside."));
				break;
			case 2:
				stack.setTagInfo("title", new NBTTagString("Research Journal: Entry 3"));
				pages.appendTag(new NBTTagString("I lose hope with every passing day. There is no clever way to destroy these Mechas or shut them down. Their programming forms a vast, global, interconnected web. You shut down one and already every other Mecha knows what you did and how to become immune to it"));
				break;
			case 3:
				stack.setTagInfo("title", new NBTTagString("Research Journal: Entry 4"));
				pages.appendTag(new NBTTagString("Finally, we are looking into other approaches, though I must say, I am quite surprised. Management must have gone a bit mad, they've got us looking for a way to travel back in time... back in time! To destroy the first AI Mecha! How absurd!"));
				break;
			case 4:
				stack.setTagInfo("title", new NBTTagString("Research Journal: Entry 5"));
				pages.appendTag(new NBTTagString("The time travel research is slow, but having heard some of the ideas from the others, I think we may actually have a shot. Not that this helps, though. I've been trying to explain stable time loops to management, but they either don't understand, or are just too desperate."));
				break;
			case 5:
				stack.setTagInfo("title", new NBTTagString("Research Journal: Entry 6"));
				pages.appendTag(new NBTTagString("We actually did it! I cannot believe it, but we sent someone back in time! Admittedly, they ended up walking with Creepersauruses, but nonetheless, we did it!"));
				break;
			case 6:
				stack.setTagInfo("title", new NBTTagString("Research Journal: Entry 7"));
				pages.appendTag(new NBTTagString("They're here! The mechas are here! If you read this, please, go back in time, destroy the creator, stop th..."));
				break;
			case 7:
				stack.setTagInfo("title", new NBTTagString("Time Portal: Instruction Manual"));
				pages.appendTag(new NBTTagString("The Time Portal uses the portal properties of obsidian combined with our state-of-the-art power cubes. Place one in each corner of the obsidian grid to activate the portal."));
				break;
		}
		
		stack.setTagInfo("pages", pages);
		
		return stack;
	}
	
	public ItemStack getSurvivorJournal(Random rand)
	{
		ItemStack stack = new ItemStack(Items.WRITTEN_BOOK);
		
		//Give the book an author
		switch(rand.nextInt(1))
		{
			case 0: stack.setTagInfo("author", new NBTTagString("Flan"));
				break;
		}
		NBTTagList pages = new NBTTagList();
		
		//Write in a random journal entry
		switch(rand.nextInt(8))
		{
			case 0:
				stack.setTagInfo("title", new NBTTagString("Help me!"));
				pages.appendTag(new NBTTagString("I have no food. My child has no food. We are going to die. Why did this have to happen?"));
				break;
			case 1:
				stack.setTagInfo("title", new NBTTagString("The Endtimes"));
				pages.appendTag(new NBTTagString("It's amazing how fast your world can be torn down around you. Just three days ago, I was happily trading emeralds at the village market. Now all that is gone. I am left to wander this wasteland alone. I don't know how long I'll last, or how long I'll stay sane..."));
				break;
			case 2:
				stack.setTagInfo("title", new NBTTagString("Day 5"));
				pages.appendTag(new NBTTagString("We found water today! At the bottom of a village well. We drank and bathed and filled our bottles and left. But for reference, the village was at- *bloodstains*"));
				break;
			case 3:
				stack.setTagInfo("title", new NBTTagString("Day 7"));
				pages.appendTag(new NBTTagString("They got my brother! Just after we left the village, he was snatched by some sort of... robot... Also, I think the water may have been contaminated. I've been sweating an awful lot, and it's not just the heat."));
				break;
			case 4:
				stack.setTagInfo("title", new NBTTagString("Day 10"));
				pages.appendTag(new NBTTagString("I have been violently ill, but have not found a new water source yet. I may have to drink more contaminated water to stay alive. I couldn't get worse, could I?"));
				break;
			case 5:
				stack.setTagInfo("title", new NBTTagString("The Wasteland"));
				pages.appendTag(new NBTTagString("This world is harsh and unforgiving. I've had to make difficult choices, but they are necessary in order to survive. If I hadn't pulled the trigger, they would have done so instead. I'm sure of it."));
				break;
			case 6:
				stack.setTagInfo("title", new NBTTagString(""));
				pages.appendTag(new NBTTagString("We spotted an airstrip in the distance! We're going to head over there under cover of darkness and see if we can acquire ourselves a plane. Let's get out of this terrible place."));
				break;
			case 7:
				stack.setTagInfo("title", new NBTTagString("Time Portal: Instruction Manual"));
				stack.setTagInfo("generation", new NBTTagInt(3));
				pages.appendTag(new NBTTagString("The Time Portal uses the portal properties of obsidian combined with-"));
				pages.appendTag(new NBTTagString("Beware! The mechas are coming! The time portal is of great importance! You must-"));
				break;
		}
		
		stack.setTagInfo("pages", pages);
		
		return stack;
	}
}
