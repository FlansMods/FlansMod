package co.uk.flansmods.common.driveables.mechas;

import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.PartType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ItemMecha extends Item {
	
	public MechaType type;

	public ItemMecha(int id, MechaType type1)
	{
		super(id);
		maxStackSize = 1;
		type = type1;
		type.item = this;
		setCreativeTab(FlansMod.tabFlanDriveables);
	}
	
	@Override
	/** Make sure client and server side NBTtags update */
	public boolean getShareTag()
	{
		return true;
	}

	private NBTTagCompound getTagCompound(ItemStack stack, World world)
	{
		if(stack.stackTagCompound == null)
		{
			stack.stackTagCompound = new NBTTagCompound();
			stack.stackTagCompound.setString("Type", type.shortName);
		}
		return stack.stackTagCompound;
	}
}
