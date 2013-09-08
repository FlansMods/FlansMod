package icbm.api;

import net.minecraft.item.ItemStack;

/**
 * Applied to all items that has a frequency.
 * 
 * @author Calclavia
 */

public interface IItemFrequency
{
	/**
	 * @param data - Pass an ItemStack if dealing with items with frequencies.
	 * @return The frequency of this object.
	 */
	public int getFrequency(ItemStack itemStack);

	/**
	 * Sets the frequency
	 * 
	 * @param frequency - The frequency of this object.
	 * @param data - Pass an ItemStack if dealing with items with frequencies.
	 */
	public void setFrequency(int frequency, ItemStack itemStack);
}
