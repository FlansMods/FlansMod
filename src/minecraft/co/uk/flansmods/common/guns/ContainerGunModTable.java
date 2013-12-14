package co.uk.flansmods.common.guns;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.world.World;

public class ContainerGunModTable extends Container 
{
	private InventoryGunModTable inventory;
	public InventoryPlayer playerInv;
	public World world;
	
	public ContainerGunModTable(InventoryPlayer i, World w)
	{
		playerInv = i;
		inventory = new InventoryGunModTable();
		world = w;
		
		//Gun slot
		SlotGun gunSlot = new SlotGun(inventory, 0, 80, 110, null);
		addSlotToContainer(gunSlot);
		
		//Attachment Slots
		addSlotToContainer(new SlotGun(inventory, 1, 54, 110, gunSlot));
		addSlotToContainer(new SlotGun(inventory, 2, 80, 84, gunSlot));
		addSlotToContainer(new SlotGun(inventory, 3, 106, 110, gunSlot));
		addSlotToContainer(new SlotGun(inventory, 4, 80, 136, gunSlot));
		
		for(int row = 0; row < 4; row++)
		{
			for(int col = 0; col < 2; col++)
			{
				addSlotToContainer(new SlotGun(inventory, 5 + row * 2 + col, 10 + col * 18, 83 + row * 18, gunSlot));
			}
		}
		
		//Main inventory slots
        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 9; col++)
            {
            	addSlotToContainer(new Slot(playerInv, col + row * 9 + 9, 8 + col * 18, 176 + row * 18));
            }

        }
		//Quickbar slots
        for(int col = 0; col < 9; col++)
        {
        	addSlotToContainer(new Slot(playerInv, col, 8 + col * 18, 234));
        }
	}
	
	@Override
    public void onContainerClosed(EntityPlayer player)
    {
		if(inventory.getStackInSlot(0) != null)
			player.dropPlayerItem(inventory.getStackInSlot(0));
    }
		
	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) 
	{
		return true;
	}

	public void pressButton(boolean paint, boolean left)
	{
		//Nope.
	}
}
