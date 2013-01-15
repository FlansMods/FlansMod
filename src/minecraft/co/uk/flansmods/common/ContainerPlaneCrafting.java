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
import co.uk.flansmods.common.network.PacketBlueprint;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ContainerPlaneCrafting extends Container
{
	
    public ContainerPlaneCrafting(InventoryPlayer inventoryplayer, World worldy, int i, int j, int k, boolean bigger)
    {
		big = bigger;
		inventory = inventoryplayer;
        craftMatrix = new InventoryCrafting(this, 5, 7);
        craftResult = new InventoryCraftResult();
        world = worldy;
        xTile = i;
        yTile = j;
        zTile = k;
		//Output slot
        addSlotToContainer(new SlotPlanes(this, craftResult, 0, 127, 54 + (big ? 18 : 0), true));
		//Crafting slots
        for(int row = 0; row < (big ? 7 : 5); row++)
        {
            for(int col = 0; col < 5; col++)
            {
            	addSlotToContainer(new SlotPlanes(this, craftMatrix, col + row * 5 + (big ? 0 : 5), 8 + col * 18, 18 + row * 18, false));
            }
        }
		//Main inventory slots
        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 9; col++)
            {
            	addSlotToContainer(new Slot(inventoryplayer, col + row * 9 + 9, 8 + col * 18, 120 + (big ? 36 : 0) + row * 18));
            }

        }
		//Quickbar slots
        for(int col = 0; col < 9; col++)
        {
        	addSlotToContainer(new Slot(inventoryplayer, col, 8 + col * 18, 178 + (big ? 36 : 0)));
        }
		//Update the output slot
        onCraftMatrixChanged(craftMatrix);
    }
			
    @Override
    public void onCraftMatrixChanged(IInventory iinventory)
    {
		//Reset output slot
		craftResult.setInventorySlotContents(0, null);
		//Check each plane type's recipe to see if it matches
		for(PlaneType type : PlaneType.types.values())
		{
			if(matches(type))
			{
				//This stack is a dummy plane that has no data attached to it. Data is added when the plane is removed from the slot to avoid massive usage of PlaneDatas
				ItemStack plane = new ItemStack(type.itemID, 1, 1);
				craftResult.setInventorySlotContents(0, plane);
			}
		}
    }
	
	private boolean bigMatches(PlaneType plane)
	{
		//Testing a small plane on a big table. Fail
		if(!plane.bigTable)
			return false;
		if(plane.bay != null)
		{
			ItemStack bay = getStack(1, 3);
			if(bay == null || plane.bay.itemID != bay.itemID)
				return false;
		}
		if(plane.propeller != null)
		{
			switch(plane.propSetup)
			{
				case 0 : //Nose prop
				{	
					ItemStack noseProp = getStack(4, 3);
					if(noseProp == null || noseProp.itemID != plane.propeller.itemID)
						return false;
					ItemStack noseEngine = getStack(3, 3);
					if(noseEngine == null || !(noseEngine.getItem() instanceof ItemPart) || ((ItemPart)noseEngine.getItem()).type.category != 2)
						return false;
					break;
				}
				case 1 : //Inner Wing Propellers
				{
					ItemStack leftWingProp = getStack(4, 2);
					if(leftWingProp == null || leftWingProp.itemID != plane.propeller.itemID)
						return false;
					ItemStack leftWingEngine = getStack(3, 2);
					if(leftWingEngine == null || !(leftWingEngine.getItem() instanceof ItemPart) || ((ItemPart)leftWingEngine.getItem()).type.category != 2)
						return false;
					ItemStack rightWingProp = getStack(4, 4);
					if(rightWingProp == null || rightWingProp.itemID != plane.propeller.itemID)
						return false;
					ItemStack rightWingEngine = getStack(3, 4);
					if(rightWingEngine == null || !(rightWingEngine.getItem() instanceof ItemPart) || ((ItemPart)rightWingEngine.getItem()).type.category != 2)
						return false;
					if(rightWingEngine.itemID != leftWingEngine.itemID)
						return false;
					break;
				}
				case 2 : //Outer Wing Propellers
				{
					ItemStack leftWingProp = getStack(4, 1);
					if(leftWingProp == null || leftWingProp.itemID != plane.propeller.itemID)
						return false;
					ItemStack leftWingEngine = getStack(3, 1);
					if(leftWingEngine == null || !(leftWingEngine.getItem() instanceof ItemPart) || ((ItemPart)leftWingEngine.getItem()).type.category != 2)
						return false;
					ItemStack rightWingProp = getStack(4, 5);
					if(rightWingProp == null || rightWingProp.itemID != plane.propeller.itemID)
						return false;
					ItemStack rightWingEngine = getStack(3, 5);
					if(rightWingEngine == null || !(rightWingEngine.getItem() instanceof ItemPart) || ((ItemPart)rightWingEngine.getItem()).type.category != 2)
						return false;
					if(rightWingEngine.itemID != leftWingEngine.itemID)
						return false;
					break;
				}
				case 3 : //Inner and Outer Wing Propellers
				{
					ItemStack innerLeftWingProp = getStack(4, 2);
					if(innerLeftWingProp == null || innerLeftWingProp.itemID != plane.propeller.itemID)
						return false;
					ItemStack innerLeftWingEngine = getStack(3, 2);
					if(innerLeftWingEngine == null || !(innerLeftWingEngine.getItem() instanceof ItemPart) || ((ItemPart)innerLeftWingEngine.getItem()).type.category != 2)
						return false;
					ItemStack innerRightWingProp = getStack(4, 4);
					if(innerRightWingProp == null || innerRightWingProp.itemID != plane.propeller.itemID)
						return false;
					ItemStack innerRightWingEngine = getStack(3, 4);
					if(innerRightWingEngine == null || !(innerRightWingEngine.getItem() instanceof ItemPart) || ((ItemPart)innerRightWingEngine.getItem()).type.category != 2)
						return false;
					ItemStack outerLeftWingProp = getStack(4, 1);
					if(outerLeftWingProp == null || outerLeftWingProp.itemID != plane.propeller.itemID)
						return false;
					ItemStack outerLeftWingEngine = getStack(3, 1);
					if(outerLeftWingEngine == null || !(outerLeftWingEngine.getItem() instanceof ItemPart) || ((ItemPart)outerLeftWingEngine.getItem()).type.category != 2)
						return false;
					ItemStack outerRightWingProp = getStack(4, 5);
					if(outerRightWingProp == null || outerRightWingProp.itemID != plane.propeller.itemID)
						return false;
					ItemStack outerRightWingEngine = getStack(3, 5);
					if(outerRightWingEngine == null || !(outerRightWingEngine.getItem() instanceof ItemPart) || ((ItemPart)outerRightWingEngine.getItem()).type.category != 2)
						return false;
					if(innerRightWingEngine.itemID != innerLeftWingEngine.itemID || innerRightWingEngine.itemID != outerLeftWingEngine.itemID
					|| innerRightWingEngine.itemID != outerRightWingEngine.itemID)
						return false;
					break;
				}
			}
		}
		if(plane.cockpit != null)
		{
			ItemStack cockpit = getStack(2, 3);
			if(cockpit == null || plane.cockpit.itemID != cockpit.itemID)
				return false;
		}
		if(plane.tail != null)
		{
			ItemStack tail = getStack(0, 3);
			if(tail == null || plane.tail.itemID != tail.itemID)
				return false;
		}
		if(plane.wings != null)
		{
			ItemStack innerLeftWing = getStack(2, 2);
			if(innerLeftWing == null || plane.wings.itemID != innerLeftWing.itemID)
				return false;
			ItemStack innerRightWing = getStack(2, 4);
			if(innerRightWing == null || plane.wings.itemID != innerRightWing.itemID)
				return false;
			ItemStack outerLeftWing = getStack(2, 1);
			if(outerLeftWing == null || plane.wings.itemID != outerLeftWing.itemID)
				return false;
			ItemStack outerRightWing = getStack(2, 5);
			if(outerRightWing == null || plane.wings.itemID != outerRightWing.itemID)
				return false;
		}
		ItemStack dyes1 = getStack(0, 0);
		ItemStack dyes2 = getStack(0, 1);		
		ItemStack dyes3 = getStack(0, 5);
		ItemStack dyes4 = getStack(0, 6);
		ItemStack dyes5 = getStack(1, 0);		
		ItemStack dyes6 = getStack(1, 1);
		ItemStack dyes7 = getStack(1, 5);
		ItemStack dyes8 = getStack(1, 6);
		ItemStack dyes9 = getStack(4, 0);		
		ItemStack dyes0 = getStack(4, 6);
		if(plane.dyes)
		{	
			boolean allDyes = dyes1 != null && dyes1.itemID == Item.dyePowder.itemID &&
			dyes2 != null && dyes2.itemID == Item.dyePowder.itemID &&
			dyes3 != null && dyes3.itemID == Item.dyePowder.itemID &&
			dyes4 != null && dyes4.itemID == Item.dyePowder.itemID &&
			dyes5 != null && dyes5.itemID == Item.dyePowder.itemID &&
			dyes6 != null && dyes6.itemID == Item.dyePowder.itemID &&
			dyes7 != null && dyes7.itemID == Item.dyePowder.itemID &&
			dyes8 != null && dyes8.itemID == Item.dyePowder.itemID &&	
			dyes9 != null && dyes9.itemID == Item.dyePowder.itemID &&
			dyes0 != null && dyes0.itemID == Item.dyePowder.itemID;
			if(!(allDyes && dyes1.getItemDamage() == plane.dyeColour
			&& dyes2.getItemDamage() == plane.dyeColour
			&& dyes3.getItemDamage() == plane.dyeColour 
			&& dyes4.getItemDamage() == plane.dyeColour
			&& dyes5.getItemDamage() == plane.dyeColour
			&& dyes6.getItemDamage() == plane.dyeColour
			&& dyes7.getItemDamage() == plane.dyeColour 
			&& dyes8.getItemDamage() == plane.dyeColour
			&& dyes9.getItemDamage() == plane.dyeColour
			&& dyes0.getItemDamage() == plane.dyeColour))
				return false;		
		}
		if(!plane.dyes && (dyes1 != null || dyes2 != null || dyes3 != null || dyes4 != null || dyes5 != null ||  dyes6 != null  || dyes7 != null || dyes8 != null || dyes9 != null ||  dyes0 != null ))
			return false;
		if(!plane.allowWingGuns && (getStack(2, 0) != null || getStack(2, 6) != null))
			return false;
		if(!plane.allowNoseGuns && (getStack(3, 0) != null || getStack(3, 6) != null))
			return false;
		if(!plane.allowSideGuns && (getStack(1, 2) != null || getStack(1, 4) != null))
			return false;
		if(!plane.allowTailGuns && getStack(0, 4) != null)
			return false;
		if(!plane.allowDorsalGun && getStack(0, 2) != null)
			return false;
		return true;
	}
	
	private boolean matches(PlaneType plane)
	{
		//Seperate method for big planes
		if(big)
			return bigMatches(plane);
		//Testing a big plane on a small table. Fail
		if(plane.bigTable)
			return false;
		//Small planes
		if(plane.bay != null)
		{
			ItemStack bay = getStack(1, 3);
			if(bay == null || plane.bay.itemID != bay.itemID)
				return false;
		}
		if(plane.propeller != null)
		{
			switch(plane.propSetup)
			{
				case 0 : //Nose prop
				{	
					ItemStack noseProp = getStack(4, 3);
					if(noseProp == null || noseProp.itemID != plane.propeller.itemID)
						return false;
					ItemStack noseEngine = getStack(3, 3);
					if(noseEngine == null || !(noseEngine.getItem() instanceof ItemPart) || ((ItemPart)noseEngine.getItem()).type.category != 2)
						return false;
					break;
				}
				case 1 : //Inner Wing Propellers
				{
					ItemStack leftWingProp = getStack(4, 2);
					if(leftWingProp == null || leftWingProp.itemID != plane.propeller.itemID)
						return false;
					ItemStack leftWingEngine = getStack(3, 2);
					if(leftWingEngine == null || !(leftWingEngine.getItem() instanceof ItemPart) || ((ItemPart)leftWingEngine.getItem()).type.category != 2)
						return false;
					ItemStack rightWingProp = getStack(4, 4);
					if(rightWingProp == null || rightWingProp.itemID != plane.propeller.itemID)
						return false;
					ItemStack rightWingEngine = getStack(3, 4);
					if(rightWingEngine == null || !(rightWingEngine.getItem() instanceof ItemPart) || ((ItemPart)rightWingEngine.getItem()).type.category != 2)
						return false;
					if(rightWingEngine.itemID != leftWingEngine.itemID)
						return false;
					break;
				}
			}
		}
		if(plane.cockpit != null)
		{
			ItemStack cockpit = getStack(2, 3);
			if(cockpit == null || plane.cockpit.itemID != cockpit.itemID)
				return false;
		}
		if(plane.tail != null)
		{
			ItemStack tail = getStack(0, 3);
			if(tail == null || plane.tail.itemID != tail.itemID)
				return false;
		}
		if(plane.wings != null)
		{
			ItemStack leftWing = getStack(2, 2);
			if(leftWing == null || plane.wings.itemID != leftWing.itemID)
				return false;
			ItemStack rightWing = getStack(2, 4);
			if(rightWing == null || plane.wings.itemID != rightWing.itemID)
				return false;
		}
		ItemStack dyes1 = getStack(0, 2);
		ItemStack dyes2 = getStack(1, 2);		
		ItemStack dyes3 = getStack(4, 1);
		ItemStack dyes4 = getStack(0, 4);
		ItemStack dyes5 = getStack(1, 4);		
		ItemStack dyes6 = getStack(4, 5);
		if(plane.dyes)
		{	
			boolean allDyes = dyes1 != null && dyes1.itemID == Item.dyePowder.itemID &&
			dyes2 != null && dyes2.itemID == Item.dyePowder.itemID &&
			dyes3 != null && dyes3.itemID == Item.dyePowder.itemID &&
			dyes4 != null && dyes4.itemID == Item.dyePowder.itemID &&
			dyes5 != null && dyes5.itemID == Item.dyePowder.itemID &&
			dyes6 != null && dyes6.itemID == Item.dyePowder.itemID;
			if(!(allDyes && dyes1.getItemDamage() == plane.dyeColour
			&& dyes2.getItemDamage() == plane.dyeColour
			&& dyes3.getItemDamage() == plane.dyeColour 
			&& dyes4.getItemDamage() == plane.dyeColour
			&& dyes5.getItemDamage() == plane.dyeColour
			&& dyes6.getItemDamage() == plane.dyeColour))
				return false;		
		}
		if(!plane.dyes && (dyes1 != null || dyes2 != null || dyes3 != null || dyes4 != null || dyes5 != null ||  dyes6 != null))
			return false;
		if(!plane.allowWingGuns && (getStack(2, 1) != null || getStack(2, 5) != null))
			return false;
		if(!plane.allowNoseGuns && (getStack(3, 1) != null || getStack(3, 5) != null))
			return false;
		return true;
	}
				
	public ItemStack getStack(int col, int row)
	{
		return craftMatrix.getStackInSlot(col + row * 5);
	}
	
	public void decrStack(int col, int row)
	{
		craftMatrix.decrStackSize(col + row * 5, 1);
	}
	
	@SideOnly(Side.CLIENT)
	public void clickedBlueprint(int blueprint)
	{
		PacketDispatcher.sendPacketToServer(PacketBlueprint.buildBlueprintPacket(FlansMod.proxy.getBlueprints(true).get(blueprint).shortName));
		//clickedBlueprint(FlansMod.blueprintsUnlocked.get(blueprint));
	}
	
	public void clickedBlueprint(PlaneType type)
	{
		//Fill craft matrix with as much stuff as possible
		//Make sure table is of right size
		//TODO : Seperate into two lists of blueprints
		if((type.bigTable && !big) || (!type.bigTable && big))
			return;
		if(type.tail != null)
			fillSlot(type.tail.itemID, 0, 0, 3);
		if(type.bay != null)
			fillSlot(type.bay.itemID, 0, 1, 3);
		if(type.cockpit != null)
			fillSlot(type.cockpit.itemID, 0, 2, 3);
		if(type.wings != null)
		{
			fillSlot(type.wings.itemID, 0, 2, 2);
			fillSlot(type.wings.itemID, 0, 2, 4);
		}
		switch(type.propSetup)
		{
			case 0 : //Nose prop
			{
				fillSlot(type.propeller.itemID, 0, 4, 3);
				fillEngineSlot(3, 3);
				break;
			}
			case 1 : //Inner wing props
			{
				fillSlot(type.propeller.itemID, 0, 4, 2);
				fillEngineSlot(3, 2);
				fillSlot(type.propeller.itemID, 0, 4, 4);
				fillEngineSlot(3, 4);
				break;
			}
			case 2 : //Outer wing props
			{
				fillSlot(type.propeller.itemID, 0, 4, 1);
				fillEngineSlot(3, 1);
				fillSlot(type.propeller.itemID, 0, 4, 5);
				fillEngineSlot(3, 5);
				break;
			}
			case 3 : //Inner and Outer wing props
			{
				fillSlot(type.propeller.itemID, 0, 4, 2);
				fillEngineSlot(3, 2);
				fillSlot(type.propeller.itemID, 0, 4, 4);
				fillEngineSlot(3, 4);
				fillSlot(type.propeller.itemID, 0, 4, 1);
				fillEngineSlot(3, 1);
				fillSlot(type.propeller.itemID, 0, 4, 5);
				fillEngineSlot(3, 5);
				break;
			}
		}	
		if(type.dyes)
		{
			if(big)
			{
				fillSlot(Item.dyePowder.itemID, type.dyeColour, 0, 0);
				fillSlot(Item.dyePowder.itemID, type.dyeColour, 0, 1);
				fillSlot(Item.dyePowder.itemID, type.dyeColour, 1, 0);
				fillSlot(Item.dyePowder.itemID, type.dyeColour, 1, 1);
				fillSlot(Item.dyePowder.itemID, type.dyeColour, 0, 5);
				fillSlot(Item.dyePowder.itemID, type.dyeColour, 0, 6);
				fillSlot(Item.dyePowder.itemID, type.dyeColour, 1, 5);
				fillSlot(Item.dyePowder.itemID, type.dyeColour, 1, 6);
				fillSlot(Item.dyePowder.itemID, type.dyeColour, 4, 0);
				fillSlot(Item.dyePowder.itemID, type.dyeColour, 4, 6);
			}
			else
			{

				fillSlot(Item.dyePowder.itemID, type.dyeColour, 0, 2);
				fillSlot(Item.dyePowder.itemID, type.dyeColour, 0, 4);
				fillSlot(Item.dyePowder.itemID, type.dyeColour, 1, 2);
				fillSlot(Item.dyePowder.itemID, type.dyeColour, 1, 4);
				fillSlot(Item.dyePowder.itemID, type.dyeColour, 4, 1);
				fillSlot(Item.dyePowder.itemID, type.dyeColour, 4, 5);
			}
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
				craftMatrix.setInventorySlotContents(col + row * 5, new ItemStack(itemID, 1, damage));
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
				craftMatrix.setInventorySlotContents(col + row * 5, new ItemStack(stack.itemID, 1, 0));
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
	public boolean big;
}
