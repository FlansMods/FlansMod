package flan.server;

import net.minecraft.src.IInventory;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Slot;

public class SlotVehicles extends Slot
{

    public SlotVehicles(ContainerVehicleCrafting cont, IInventory iinventory, int i, int j, int k, boolean res)
    {
        super(iinventory, i, j, k);
		result = res;
		container = cont;
    }
	
	public boolean isItemValid(ItemStack itemstack)
    {
		if(result)
			return false;
		if(itemstack.getItem() instanceof ItemPart || (itemstack.getItem() instanceof ItemGun && ((ItemGun)(itemstack.getItem())).type.deployable) || itemstack.itemID == Item.dyePowder.shiftedIndex)
			return true;
		return false;
    }
	
	private void putGun(VehicleData data, int gunID, int col, int row)
	{
		ItemStack gun = container.getStack(col, row);
		if(gun != null && gun.getItem() instanceof ItemGun)
			data.guns[gunID] = ((ItemGun)gun.getItem()).type;
		container.decrStack(col, row);
	}
	
	public void onPickupFromSlot(ItemStack stack)
	{
		if(!result)
			return;
		if(stack == null || !(stack.getItem() instanceof ItemVehicle))
			return;
		VehicleType type = ((ItemVehicle)stack.getItem()).type;
		//Make a new VehicleData
		int dataID = container.world.getUniqueDataId("vehicle");
		//Avoid dataID 0 as it is default of TMI and creative spawned vehicles.
		if(dataID == 0)
			dataID = container.world.getUniqueDataId("vehicle");
		VehicleData data = new VehicleData("vehicle_" + dataID, type);
		stack.setItemDamage(dataID);
		//Take items from the crafting table and store them in the data
		putGun(data, 0, 0, 0); //Body
		putGun(data, 1, 2, 0); //Turret
		//Load engines into data
		data.engine = ((ItemPart)container.getStack(0, 1).getItem()).type;
		container.decrStack(0, 1);
		//Remove items from the crafting table
		if(type.chassis != null)
			container.decrStack(1, 1);
		if(type.turret != null)
			container.decrStack(1, 0);
		if(type.frontWheels != null)
		{
			container.decrStack(0, 2);
			container.decrStack(0, 3);
		}
		if(type.tracks != null)
		{
			container.decrStack(1, 2);
			container.decrStack(1, 3);
		}
		if(type.backWheels != null)
		{
			container.decrStack(2, 2);
			container.decrStack(2, 3);
		}
		if(type.dyes)
		{
			container.decrStack(2, 1);
		}
		//Add the vehicle to the list of blueprints
		if(!FlansMod.vehicleBlueprintsUnlocked.contains(type))
			FlansMod.vehicleBlueprintsUnlocked.add(type);
		//Register the data
		container.world.setItemData("vehicle_" + dataID, data);
        data.markDirty();	
	}
	
	private ContainerVehicleCrafting container;
	public boolean result;
}
