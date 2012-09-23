package co.uk.flansmods.common;

import net.minecraft.src.Container;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.InventoryPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Slot;
import net.minecraft.src.World;

public class ContainerPlaneMenu extends Container
{
	//Fuel Container is combined with this because they are so similar
	public ContainerPlaneMenu(InventoryPlayer inventoryplayer, World worldy)
	{
		this(inventoryplayer, worldy, false, null);
	}
	
    public ContainerPlaneMenu(InventoryPlayer inventoryplayer, World worldy, boolean fuel, EntityDriveable planey)
    {
		inventory = inventoryplayer;
        world = worldy;
		plane = planey;
		isFuel = fuel;
		//Fuel slot
		if(isFuel)
		{
			addSlotToContainer(new Slot(plane.superData, plane.superData.getFuelSlot(), 35, 44));
		}
		
		//Main inventory slots
        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 9; col++)
            {
            	addSlotToContainer(new Slot(inventoryplayer, col + row * 9 + 9, 8 + col * 18, 79 + (isFuel ? 0 : 19) + row * 18));
            }

        }
		//Quickbar slots
        for(int col = 0; col < 9; col++)
        {
        	addSlotToContainer(new Slot(inventoryplayer, col, 8 + col * 18, 137 + (isFuel ? 0 : 19)));
        }
    }
	
    @Override
	public ItemStack transferStackInSlot(int i)
    {
        return null;
    }
    
    @Override
    public boolean canInteractWith(EntityPlayer entityplayer)
    {
        return entityplayer.ridingEntity != null && entityplayer.ridingEntity instanceof EntityDriveable;
    }

	public EntityDriveable plane;
	public boolean isFuel;
	public InventoryPlayer inventory;
    public World world;
}
