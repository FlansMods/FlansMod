package co.uk.flansmods.common;

import co.uk.flansmods.client.FlansModClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SlotPlanes extends Slot
{

    public SlotPlanes(ContainerPlaneCrafting cont, IInventory iinventory, int i, int j, int k, boolean res)
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
	
	private void putGun(PlaneData data, int gunID, int col, int row)
	{
		ItemStack gun = container.getStack(col, row);
		if(gun != null && gun.getItem() instanceof ItemGun)
			data.guns[gunID] = ((ItemGun)gun.getItem()).type;
		container.decrStack(col, row);
	}
	
	public void onPickupFromSlot(EntityPlayer player, ItemStack stack)
	{
		if(!result)
			return;
		if(stack == null || !(stack.getItem() instanceof ItemPlane))
			return;
		PlaneType type = ((ItemPlane)stack.getItem()).type;
		//Make a new PlaneData
		int dataID = container.world.getUniqueDataId("plane");
		//Avoid dataID 0 as it is default of TMI and creative spawned vehicles.
		if(dataID == 0)
			dataID = container.world.getUniqueDataId("plane");
		PlaneData data = new PlaneData("plane_" + dataID, type);
		stack.setItemDamage(dataID);
		//Take items from the crafting table and store them in the data
		int row = container.big ? 0 : 1;
		putGun(data, 0, 3, row); //Left nose
		putGun(data, 1, 3, 6 - row); //Right nose
		putGun(data, 2, 2, row); //Left wing
		putGun(data, 3, 2, 6 - row); //Right wing
		if(container.big)
		{
			putGun(data, 4, 0, 4); //Tail
			putGun(data, 5, 1, 2); //Left bay
			putGun(data, 6, 1, 4); //Right bay
			putGun(data, 7, 0, 2); //Dorsal
		}
		//Load engines into data
		if(type.propeller != null)
		{
			switch(type.propSetup)
			{
				case 0 : //Nose prop
				{
					data.engine = ((ItemPart)container.getStack(3, 3).getItem()).type;
					container.decrStack(3, 3);
					container.decrStack(4, 3);
					break;
				}
				case 1 : //Inner wing propellers
				{
					data.engine = ((ItemPart)container.getStack(3, 2).getItem()).type;
					container.decrStack(3, 2);
					container.decrStack(3, 4);
					container.decrStack(4, 2);
					container.decrStack(4, 4);
					break;
				}
				case 2 : //Outer wing propellers
				{
					data.engine = ((ItemPart)container.getStack(3, 1).getItem()).type;
					container.decrStack(3, 1);
					container.decrStack(3, 5);
					container.decrStack(4, 1);
					container.decrStack(4, 5);
					break;
				}
				case 3 : //Inner and outer wing propellers
				{
					data.engine = ((ItemPart)container.getStack(3, 1).getItem()).type;
					container.decrStack(3, 1);
					container.decrStack(3, 5);
					container.decrStack(4, 1);
					container.decrStack(4, 5);
					container.decrStack(3, 2);
					container.decrStack(3, 4);
					container.decrStack(4, 2);
					container.decrStack(4, 4);
					break;
				}
			}
		}
		//Remove items from the crafting table
		if(type.tail != null)
			container.decrStack(0, 3);
		if(type.bay != null)
			container.decrStack(1, 3);
		if(type.cockpit != null)
			container.decrStack(2, 3);
		if(type.wings != null)
		{
			if(container.big)
			{
				container.decrStack(2, 1);
				container.decrStack(2, 5);
			}
			container.decrStack(2, 2);
			container.decrStack(2, 4);
		}
		if(type.dyes)
		{
			if(container.big)
			{
				container.decrStack(0, 0);
				container.decrStack(0, 1);
				container.decrStack(1, 0);
				container.decrStack(1, 1);
				container.decrStack(0, 5);
				container.decrStack(0, 6);
				container.decrStack(1, 5);
				container.decrStack(1, 6);
				container.decrStack(4, 0);
				container.decrStack(4, 6);				
			}
			else
			{
				container.decrStack(0, 2);
				container.decrStack(1, 2);
				container.decrStack(0, 4);	
				container.decrStack(1, 4);
				container.decrStack(4, 1);
				container.decrStack(4, 5);	
			}
		}
		//Add the plane to the list of blueprints
		if(!FlansModClient.blueprintsUnlocked.contains(type))
			FlansModClient.blueprintsUnlocked.add(type);
		//Register the data
		container.world.setItemData("plane_" + dataID, data);
        data.markDirty();	
	}
	
	private ContainerPlaneCrafting container;
	public boolean result;
}
