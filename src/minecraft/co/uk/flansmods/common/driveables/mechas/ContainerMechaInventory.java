package co.uk.flansmods.common.driveables.mechas;

import co.uk.flansmods.common.driveables.EntityDriveable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.world.World;

public class ContainerMechaInventory extends Container 
{
	public InventoryPlayer inventory;
    public World world;
	public EntityMecha mecha;
	
	public ContainerMechaInventory(InventoryPlayer inv, World w, EntityMecha m)
	{
		inventory = inv;
		world = w;
		
		
		
		//Main inventory slots
        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 9; col++)
            {
            	addSlotToContainer(new Slot(inventory, col + row * 9 + 9, 8 + col * 18, 98 + row * 18));
            }

        }
		//Quickbar slots
        for(int col = 0; col < 9; col++)
        {
        	addSlotToContainer(new Slot(inventory, col, 8 + col * 18, 156));
        }
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) 
	{
		return false;
	}

}
