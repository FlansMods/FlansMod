package co.uk.flansmods.common;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IInventory;
import net.minecraft.src.ItemStack;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.WorldSavedData;

public class DriveableData extends WorldSavedData implements IInventory
{
	public DriveableData(String s, int n, int o, int p)
	{
		super(s);
		numGuns = n;
		numBombs = o;
		numCargo = p;
		guns = new GunType[n];
		ammo = new ItemStack[n];
	}
	
    public DriveableData(String s, String type1, int n, int o, int p)
    {
        super(s);
		numGuns = n;
		numBombs = o;
		numCargo = p;
		type = type1;
		guns = new GunType[n];
		ammo = new ItemStack[n];
		bombs = new ItemStack[numBombs];
		cargo = new ItemStack[numCargo];
    }

    public void readFromNBT(NBTTagCompound tag)
    {
    	if (!tag.hasKey("Type"))
    		return;
    	
		type = tag.getString("Type");
		DriveableType dType = DriveableType.getDriveable(type);
		numBombs = dType.numBombSlots;
		numCargo = dType.numCargoSlots;
		engine = PartType.getPart(tag.getString("Engine"));
		for(int i = 0; i < numGuns; i++)
		{
			guns[i] = GunType.getGun(tag.getString("Gun " + i));
			ammo[i] = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("Ammo " + i));
		}
		bombs = new ItemStack[numBombs];
		cargo = new ItemStack[numCargo];
		for(int i = 0; i < numBombs; i++)
		{
			bombs[i] = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("Bombs " + i));
		}
 		for(int i = 0; i < numCargo; i++)
		{
			cargo[i] = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("Cargo " + i));
		}
		fuel = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("Fuel"));
		fuelInTank = tag.getInteger("FuelInTank");
    }

    public void writeToNBT(NBTTagCompound tag)
    {
		tag.setString("Type", type);
		tag.setString("Engine", engine.shortName);
		for(int i = 0; i < guns.length; i++)
		{
			if(guns[i] != null)
				tag.setString("Gun " + i, guns[i].shortName);
			if(ammo[i] != null)
				tag.setCompoundTag("Ammo " + i, ammo[i].writeToNBT(new NBTTagCompound()));
		}
		for(int i = 0; i < bombs.length; i++)
		{
			if(bombs[i] != null)
				tag.setCompoundTag("Bombs " + i, bombs[i].writeToNBT(new NBTTagCompound()));
		}
		for(int i = 0; i < cargo.length; i++)
		{
			if(cargo[i] != null)
				tag.setCompoundTag("Cargo " + i, cargo[i].writeToNBT(new NBTTagCompound()));
		}
		if(fuel != null)
			tag.setCompoundTag("Fuel", fuel.writeToNBT(new NBTTagCompound()));
		tag.setInteger("FuelInTank", fuelInTank);
    }
	
	public int getSizeInventory() 
	{ 
		return getFuelSlot() + 1; 
	}

    public ItemStack getStackInSlot(int i) 
	{ 
		//Find the correct inventory
		ItemStack[] inv = ammo;
		if(i >= ammo.length)
		{
			i -= ammo.length;
			inv = bombs;
			if(i >= bombs.length)
			{
				i -= bombs.length;
				inv = cargo;
				if(i >= cargo.length)
				{
					return fuel;
				}
			}	
		}
		//Return the stack in the slot
		return inv[i];
	}

    public ItemStack decrStackSize(int i, int j) 
	{ 
		//Find the correct inventory
		ItemStack[] inv = ammo;
		if(i >= ammo.length)
		{
			i -= ammo.length;
			inv = bombs;
			if(i >= bombs.length)
			{
				i -= bombs.length;
				inv = cargo;
				if(i >= cargo.length)
				{
					//Put the fuel stack in a stack array just to simplify the code
					i -= cargo.length;
					inv = new ItemStack[1];
					inv[0] = fuel;
				}
			}	
		}
		//Decrease the stack size
		if(inv[i] != null)
        {
            if(inv[i].stackSize <= j)
            {
                ItemStack itemstack = inv[i];
                inv[i] = null;
                return itemstack;
            }
            ItemStack itemstack1 = inv[i].splitStack(j);
            if(inv[i].stackSize <= 0)
            {
                inv[i] = null;
            }
            return itemstack1;
        } else
        {
            return null;
        }
	}

    public ItemStack getStackInSlotOnClosing(int i) 
	{ 
		return getStackInSlot(i);	
	}

    public void setInventorySlotContents(int i, ItemStack stack) 
	{ 
		//Find the correct inventory
		ItemStack[] inv = ammo;
		if(i >= ammo.length)
		{
			i -= ammo.length;
			inv = bombs;
			if(i >= bombs.length)
			{
				i -= bombs.length;
				inv = cargo;
				if(i >= cargo.length)
				{
					fuel = stack;
					return;
				}
			}	
		}
		//Set the stack
		inv[i] = stack;
	}

    public String getInvName() 
	{ 
		return "Flan's Secret Data"; 
	}

    public int getInventoryStackLimit() 
	{ 
		return 64; 
	}

    public void onInventoryChanged() {}

    public boolean isUseableByPlayer(EntityPlayer player) 
	{ 
		return true; 
	}

    public void openChest() {}

    public void closeChest() {}
	
	public int getAmmoInventoryStart()
	{
		return 0;
	}
	
	public int getBombInventoryStart()
	{
		return ammo.length;
	}	
	
	public int getCargoInventoryStart()
	{
		return ammo.length + bombs.length;
	}
	
	public int getFuelSlot()
	{
		return ammo.length + bombs.length + cargo.length;
	}
	
	public int numGuns;
	public int numBombs;
	public int numCargo;
	public String type;
	public PartType engine;
	public GunType[] guns;
	public ItemStack[] ammo;
	public ItemStack[] bombs;
	public ItemStack[] cargo;
	public ItemStack fuel;
	public int fuelInTank;
}
