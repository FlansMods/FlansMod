package co.uk.flansmods.common.teams;

import co.uk.flansmods.common.driveables.mechas.EnumMechaItemType;
import co.uk.flansmods.common.driveables.mechas.EnumMechaSlotType;
import co.uk.flansmods.common.driveables.mechas.ItemMechaAddon;
import co.uk.flansmods.common.guns.ItemGun;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SlotMecha extends Slot 
{
	private EnumMechaSlotType slotType;
	
	public SlotMecha(IInventory inv, EnumMechaSlotType e, int x, int y) 
	{
		super(inv, e.ordinal(), x, y);
		slotType = e;
	}
	
	@Override
    public boolean isItemValid(ItemStack stack)
    {
    	if(stack == null || stack.getItem() == null)
    		return true;
    	
    	EnumMechaItemType itemType = null;
    	Item item = stack.getItem();
    	if(item instanceof ItemGun)
    		itemType = EnumMechaItemType.tool;
    	else if(item instanceof ItemMechaAddon)
    		itemType = ((ItemMechaAddon)item).type.type;
    	else return false;
    	
    	return slotType.accepts(itemType);
    }
	
	@Override
    public void putStack(ItemStack stack)
    {
		if(!isItemValid(stack))
			return;
        inventory.setInventorySlotContents(slotType.ordinal(), stack);
        onSlotChanged();
    }

}
