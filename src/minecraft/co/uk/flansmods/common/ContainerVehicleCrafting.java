package co.uk.flansmods.common;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import co.uk.flansmods.client.FlansModClient;
import co.uk.flansmods.common.network.PacketBlueprint;
import cpw.mods.fml.common.network.PacketDispatcher;

public class ContainerVehicleCrafting extends Container
{
    public ContainerVehicleCrafting(InventoryPlayer inventoryplayer, World worldy, int i, int j, int k)
    {
		inventory = inventoryplayer;
        craftMatrix = new InventoryCrafting(this, 5, 7);
        craftResult = new InventoryCraftResult();
        world = worldy;
        xTile = i;
        yTile = j;
        zTile = k;
		//Output slot
        addSlotToContainer(new SlotVehicles(this, craftResult, 0, 127, 54, true));
		//Crafting slots
        for(int row = 0; row < 4; row++)
        {
            for(int col = 0; col < 3; col++)
            {
            	addSlotToContainer(new SlotVehicles(this, craftMatrix, col + row * 3, 32 + col * 18, 18 + row * 18, false));
            }
        }
		//Main inventory slots
        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 9; col++)
            {
            	addSlotToContainer(new Slot(inventoryplayer, col + row * 9 + 9, 8 + col * 18, 102 + row * 18));
            }

        }
		//Quickbar slots
        for(int col = 0; col < 9; col++)
        {
        	addSlotToContainer(new Slot(inventoryplayer, col, 8 + col * 18, 160));
        }
		//Update the output slot
        onCraftMatrixChanged(craftMatrix);
    }
			
    @Override
    public void onCraftMatrixChanged(IInventory iinventory)
    {
		//Reset output slot
		craftResult.setInventorySlotContents(0, null);
		//Check each vehicle type's recipe to see if it matches
		for(VehicleType type : VehicleType.types.values())
		{
			if(matches(type))
			{
				//This stack is a dummy vehicle that has no data attached to it. Data is added when the vehicle is removed from the slot to avoid massive usage of VehicleDatas
				ItemStack vehicle = new ItemStack(type.itemID, 1, 1);
				craftResult.setInventorySlotContents(0, vehicle);
			}
		}
    }
		
	private boolean matches(VehicleType vehicle)
	{
		//Small vehicles
		if(vehicle.chassis != null)
		{
			ItemStack chassis = getStack(1, 1);
			if(chassis == null || vehicle.chassis.itemID != chassis.itemID)
				return false;
		}
		ItemStack engine = getStack(0, 1);
		if(engine == null || !(engine.getItem() instanceof ItemPart) || ((ItemPart)engine.getItem()).type.category != 2)
			return false;
		if(vehicle.frontWheels != null)
		{
			ItemStack frontWheels1 = getStack(0, 2);
			if(frontWheels1 == null || vehicle.frontWheels.itemID != frontWheels1.itemID)
				return false;
			ItemStack frontWheels2 = getStack(0, 3);
			if(frontWheels2 == null || vehicle.frontWheels.itemID != frontWheels2.itemID)
				return false;
		}
		if(vehicle.backWheels != null)
		{
			ItemStack backWheels1 = getStack(2, 2);
			if(backWheels1 == null || vehicle.backWheels.itemID != backWheels1.itemID)
				return false;
			ItemStack backWheels2 = getStack(2, 3);
			if(backWheels2 == null || vehicle.backWheels.itemID != backWheels2.itemID)
				return false;
		}		
		if(vehicle.tracks != null)
		{
			ItemStack tracks1 = getStack(1, 2);
			if(tracks1 == null || vehicle.tracks.itemID != tracks1.itemID)
				return false;
			ItemStack tracks2 = getStack(1, 3);
			if(tracks2 == null || vehicle.tracks.itemID != tracks2.itemID)
				return false;
		}
		if(vehicle.turret != null)
		{
			ItemStack turret = getStack(1, 0);
			if(turret == null || vehicle.turret.itemID != turret.itemID)
				return false;
		}
		ItemStack dyes1 = getStack(2, 1);
		if(vehicle.dyes)
		{	
			boolean allDyes = dyes1 != null && dyes1.itemID == Item.dyePowder.shiftedIndex;
			if(!(allDyes && dyes1.getItemDamage() == vehicle.dyeColour))
				return false;		
		}
		if(!vehicle.dyes && dyes1 != null)
			return false;
		if(!vehicle.allowBodyGuns && getStack(0, 0) != null)
			return false;
		if(!vehicle.allowTurretGuns && getStack(2, 0) != null)
			return false;
		return true;
	}
				
	public ItemStack getStack(int col, int row)
	{
		return craftMatrix.getStackInSlot(col + row * 3);
	}
	
	public void decrStack(int col, int row)
	{
		craftMatrix.decrStackSize(col + row * 3, 1);
	}
	
	public void clickedBlueprint(int blueprint)
	{
		PacketDispatcher.sendPacketToServer(PacketBlueprint.buildBlueprintPacket(FlansModClient.vehicleBlueprintsUnlocked.get(blueprint).shortName));
		//clickedBlueprint(FlansMod.vehicleBlueprintsUnlocked.get(blueprint));
	}
	
	public void clickedBlueprint(VehicleType type)
	{
		//Fill craft matrix with as much stuff as possible
		if(type.chassis != null)
			fillSlot(type.chassis.itemID, 0, 1, 1);
		if(type.turret != null)
			fillSlot(type.turret.itemID, 0, 1, 0);
		if(type.frontWheels != null)
		{
			fillSlot(type.frontWheels.itemID, 0, 0, 2);
			fillSlot(type.frontWheels.itemID, 0, 0, 3);
		}
		if(type.tracks != null)
		{
			fillSlot(type.tracks.itemID, 0, 1, 2);
			fillSlot(type.tracks.itemID, 0, 1, 3);
		}
		if(type.backWheels != null)
		{
			fillSlot(type.backWheels.itemID, 0, 2, 2);
			fillSlot(type.backWheels.itemID, 0, 2, 3);
		}
		fillEngineSlot(0, 1);
		if(type.dyes)
		{
			fillSlot(Item.dyePowder.shiftedIndex, type.dyeColour, 2, 1);
		}
	}
	
	private void fillSlot(int itemID, int damage, int col, int row)
	{
		if(getStack(col, row) != null)
			return;
		for(int i = 0; i < inventory.getSizeInventory(); i++)
		{
			ItemStack stack = inventory.getStackInSlot(i);
			if(stack != null && stack.itemID == itemID && stack.getItemDamage() == damage)
			{
				inventory.decrStackSize(i, 1);
				craftMatrix.setInventorySlotContents(col + row * 3, new ItemStack(itemID, 1, damage));
				return;
			}
		}
	}
	
	private void fillEngineSlot(int col, int row)
	{
		if(getStack(col, row) != null)
			return;
		for(int i = 0; i < inventory.getSizeInventory(); i++)
		{
			ItemStack stack = inventory.getStackInSlot(i);
			if(stack != null && stack.getItem() instanceof ItemPart && ((ItemPart)stack.getItem()).type.category == 2)
			{
				inventory.decrStackSize(i, 1);
				craftMatrix.setInventorySlotContents(col + row * 3, new ItemStack(stack.itemID, 1, 0));
				return;
			}
		}
	}

	@Override
    public void onCraftGuiClosed(EntityPlayer entityplayer)
    {
        super.onCraftGuiClosed(entityplayer);
        for(int i = 0; i < 35; i++)
        {
            ItemStack itemstack = craftMatrix.getStackInSlot(i);
            if(itemstack != null && itemstack.stackSize > 0)
            {
                entityplayer.dropPlayerItem(itemstack);
            }
        }

    }

	@Override
    public boolean canInteractWith(EntityPlayer entityplayer)
    {
        if(world.getBlockId(xTile, yTile, zTile) != FlansMod.craftingTable.blockID)
        {
            return false;
        }
        return entityplayer.getDistanceSq((double)xTile + 0.5D, (double)yTile + 0.5D, (double)zTile + 0.5D) <= 64D;
    }
	
    public ItemStack transferStackInSlot(EntityPlayer player, int i)
    {
        return null;
    }

	public InventoryPlayer inventory;
    public InventoryCrafting craftMatrix;
    public IInventory craftResult;
    public World world;
    private int xTile;
    private int yTile;
    private int zTile;
}
