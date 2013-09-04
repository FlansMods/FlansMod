package co.uk.flansmods.common;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import co.uk.flansmods.common.driveables.DriveablePart;
import co.uk.flansmods.common.driveables.DriveableType;
import co.uk.flansmods.common.driveables.EntityDriveable;
import co.uk.flansmods.common.driveables.EntitySeat;
import co.uk.flansmods.common.driveables.EnumDriveablePart;
import co.uk.flansmods.common.driveables.PlaneType;
import co.uk.flansmods.common.driveables.VehicleType;
import co.uk.flansmods.common.guns.AAGunType;
import co.uk.flansmods.common.guns.BulletType;
import co.uk.flansmods.common.guns.GrenadeType;
import co.uk.flansmods.common.guns.GunType;
import co.uk.flansmods.common.network.PacketBreakSound;
import co.uk.flansmods.common.network.PacketBuyWeapon;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class CommonProxy
{
	protected static Pattern zipJar = Pattern.compile("(.+).(zip|jar)$");

	/** Returns the list of content pack files, and on the client, adds the content pack resources and models to the classpath */
	public List<File> getContentList(Method method, ClassLoader classloader)
	{
		List<File> contentPacks = new ArrayList<File>();
		for (File file : FlansMod.flanDir.listFiles())
		{
			//Load folders and valid zip files
			if (file.isDirectory() || zipJar.matcher(file.getName()).matches())
			{
				//Add the directory to the content pack list
				FlansMod.log("Loaded content pack : " + file.getName());
				contentPacks.add(file);
			}
		}
		FlansMod.log("Loaded content pack list server side.");
		return contentPacks;
	}
	
	/** A ton of client only methods follow */
	public void load()
	{
	}
	
	public List<File> getContentList()
	{
		return null;
	}	
	
	public void registerTileEntityRenderers() 
	{
	}
	
	public void loadDefaultGraphics()
	{
	}
	
	public void loadKeyBindings()
	{
	}
	
	public void doTutorialStuff(EntityPlayer player, EntityDriveable entityType)
	{
	}
	
	public void changeControlMode(EntityPlayer player)
	{
	}

	public boolean mouseControlEnabled()
	{
		return false;
	}
	
	public void openDriveableMenu(EntityPlayer player, World world, EntityDriveable driveable)
	{
	}
	
	public <T> T loadModel(String[] split, String shortName, Class<T> typeClass)
	{
		return null;
	}
	
	public void loadSound(String contentPack, String type, String sound)
	{
	}
	
	public boolean isThePlayer(EntityPlayer player)
	{
		return false;
	}
	
	public void buyGun(GunBoxType type, int gun)
	{
	}

	public void buyAmmo(GunBoxType box, int ammo, int type)
	{
	}
	
	/** Gets the client GUI element from ClientProxy */
	public Object getClientGui(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		return null;
	}

	/** Gets the container for the specified GUI */
	public Container getServerGui(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		switch(ID) 
		{
			case 3: return new ContainerPlaneMenu(player.inventory, world);
			case 4: return new ContainerPlaneMenu(player.inventory, world, true, ((EntitySeat)player.ridingEntity).driveable);
			
			//Plane inventory screens
			case 6: return new ContainerPlaneInventory(player.inventory, world, ((EntitySeat)player.ridingEntity).driveable, 0);
			case 7: return new ContainerPlaneInventory(player.inventory, world, ((EntitySeat)player.ridingEntity).driveable, 1);
			case 8: return new ContainerPlaneMenu(player.inventory, world, true, ((EntitySeat)player.ridingEntity).driveable);
			case 9: return new ContainerPlaneInventory(player.inventory, world, ((EntitySeat)player.ridingEntity).driveable, 2);
		}
		return null;
	}
	
	/** Play a block break sound here */
	public void playBlockBreakSound(int x, int y, int z, int blockID)
	{
		PacketDispatcher.sendPacketToAllPlayers(PacketBreakSound.buildBreakSoundPacket(x, y, z, blockID));
	}
	
	/** Register the sided tick handler */
	public void doTickStuff()
	{
		TickRegistry.registerTickHandler(new CommonTickHandler(), Side.SERVER);
	}
	
	public void craftDriveable(EntityPlayer player, DriveableType type)
	{
		//Create a temporary copy of the player inventory for backup purposes
		InventoryPlayer temporaryInventory = new InventoryPlayer(null);
		temporaryInventory.copyInventory(player.inventory);
		
		//This becomes false if some recipe element is not found on the player
		boolean canCraft = true;
		//Iterate over rows then columns
		for(ItemStack recipeStack : type.recipe)
		{
			//The total amount of items found that match this recipe stack
			int totalAmountFound = 0;
			//Iterate over the player's inventory
			for(int n = 0; n < player.inventory.getSizeInventory(); n++)
			{
				//Get the stack in each slot
				ItemStack stackInSlot = player.inventory.getStackInSlot(n);
				//If the stack is what we want
				if(stackInSlot != null && stackInSlot.itemID == recipeStack.itemID && stackInSlot.getItemDamage() == recipeStack.getItemDamage())
				{
					//Work out the amount to take from the stack
					int amountFound = Math.min(stackInSlot.stackSize, recipeStack.stackSize - totalAmountFound);
					//Take it
					stackInSlot.stackSize -= amountFound;
					//Check for empty stacks
					if(stackInSlot.stackSize <= 0)
						stackInSlot = null;
					//Put the modified stack back in the inventory
					player.inventory.setInventorySlotContents(n, stackInSlot);
					//Increase the amount found counter
					totalAmountFound += amountFound;
					//If we have enough, stop looking
					if(totalAmountFound == recipeStack.stackSize)
						break;
				}
			}
			//If we didn't find enough, give the stack a red outline
			if(totalAmountFound < recipeStack.stackSize)
			{
				//For some reason, the player sent a craft packet, despite being unable to
				canCraft = false;
				break;
			}
		}
		
		//Some item was missing. Restore inventory and return
		if(!canCraft)
		{
			player.inventory.copyInventory(temporaryInventory);
			return;
		}
		
		//Now we no longer need the temporary inventory backup, so we will use it to find the best stack of engines		
		//Collect up all the engines into neat and tidy stacks so we can find if any of them are big enough and which of those stacks are best
		HashMap<PartType, ItemStack> engines = new HashMap<PartType, ItemStack>();
		
		//Find some suitable engines
		for(int n = 0; n < temporaryInventory.getSizeInventory(); n++)
		{
			//Get the stack in each slot
			ItemStack stackInSlot = temporaryInventory.getStackInSlot(n);
			//Check to see if its a part
			if(stackInSlot != null && stackInSlot.getItem() instanceof ItemPart)
			{
				PartType partType = ((ItemPart)stackInSlot.getItem()).type;
				//Check its an engine
				if(partType.category == 2)
				{
					//If we already have engines of this type, add these ones to the stack
					if(engines.containsKey(partType))
					{
						engines.get(partType).stackSize += stackInSlot.stackSize;
					}
					//Else, make this the first stack
					else engines.put(partType, stackInSlot);
				}
			}
		}
		
		//Find the stack of engines that is fastest but which also has enough for this driveable
		float bestEngineSpeed = -1F;
		ItemStack bestEngineStack = null;
		for(PartType part : engines.keySet())
		{
			//If this engine outperforms the currently selected best one and there are enough of them, swap
			if(part.engineSpeed > bestEngineSpeed && engines.get(part).stackSize >= type.numEngines())
			{
				bestEngineSpeed = part.engineSpeed;
				bestEngineStack = engines.get(part);
			}
		}
		
		//If the player doesn't have any suitable engines, return
		if(bestEngineStack == null)
		{
			return;
		}
		
		//Remove the engines from the inventory
		int numEnginesAcquired = 0;
		for(int n = 0; n < player.inventory.getSizeInventory(); n++)
		{
			//Get the stack in each slot
			ItemStack stackInSlot = player.inventory.getStackInSlot(n);
			//Check to see if its the engine we want
			if(stackInSlot != null && stackInSlot.itemID == bestEngineStack.itemID)
			{
				//Work out the amount to take from the stack
				int amountFound = Math.min(stackInSlot.stackSize, type.numEngines() - numEnginesAcquired);
				//Take it
				stackInSlot.stackSize -= amountFound;
				//Check for empty stacks
				if(stackInSlot.stackSize <= 0)
					stackInSlot = null;
				//Put the modified stack back in the inventory
				player.inventory.setInventorySlotContents(n, stackInSlot);
				//Increase the amount found counter
				numEnginesAcquired += amountFound;
				//If we have enough, stop looking
				if(numEnginesAcquired == type.numEngines())
					break;
			}
		}
		
		//Give them their brand new shiny driveable item :D
		ItemStack driveableStack = new ItemStack(type.item);
		NBTTagCompound tags = new NBTTagCompound();
		tags.setString("Engine", ((ItemPart)bestEngineStack.getItem()).type.shortName);
		tags.setString("Type", type.shortName);
		driveableStack.stackTagCompound = tags;
		if(!player.inventory.addItemStackToInventory(driveableStack))
			player.dropPlayerItem(driveableStack);
	}

	public void repairDriveable(EntityPlayer driver, EntityDriveable driving, DriveablePart part) 
	{
		//If any of this parts parent parts are broken, then it cannot be repaired
		for(EnumDriveablePart parent : part.type.getParents())
		{
			if(!driving.isPartIntact(parent))
				return;
		}
		
		//Create a temporary copy of the player inventory for backup purposes
		InventoryPlayer temporaryInventory = new InventoryPlayer(null);
		temporaryInventory.copyInventory(driver.inventory);
		
		//This becomes false if some recipe element is not found on the player
		boolean canRepair = true;
		
		//Get the array of stacks needed
		ArrayList<ItemStack> stacksNeeded = driving.getDriveableType().getItemsRequired(part, driving.getDriveableData().engine);
		//Draw the stacks that should be in each slot
		for(ItemStack stackNeeded : stacksNeeded)
		{
			//The total amount of items found that match this recipe stack
			int totalAmountFound = 0;
			//Iterate over the temporary inventory
			for(int m = 0; m < temporaryInventory.getSizeInventory(); m++)
			{
				//Get the stack in each slot
				ItemStack stackInSlot = temporaryInventory.getStackInSlot(m);
				//If the stack is what we want
				if(stackInSlot != null && stackInSlot.itemID == stackNeeded.itemID && stackInSlot.getItemDamage() == stackNeeded.getItemDamage())
				{
					//Work out the amount to take from the stack
					int amountFound = Math.min(stackInSlot.stackSize, stackNeeded.stackSize - totalAmountFound);
					//Take it
					stackInSlot.stackSize -= amountFound;
					//Check for empty stacks
					if(stackInSlot.stackSize <= 0)
						stackInSlot = null;
					//Put the modified stack back in the inventory
					temporaryInventory.setInventorySlotContents(m, stackInSlot);
					//Increase the amount found counter
					totalAmountFound += amountFound;
					//If we have enough, stop looking
					if(totalAmountFound == stackNeeded.stackSize)
						break;
				}
			}
			if(totalAmountFound < stackNeeded.stackSize)
				canRepair = false;
		}
		
		if(canRepair)
		{
			driver.inventory.copyInventory(temporaryInventory);
			part.health = Math.max(1, part.maxHealth / 10);
			part.onFire = false;
			part.dead = false;
			driving.checkParts();
		}
	}
}