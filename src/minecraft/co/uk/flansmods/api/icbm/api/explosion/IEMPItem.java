package icbm.api.explosion;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import universalelectricity.core.item.IItemElectric;

/**
 * Applied to all items that can be protected from EMP somehow.
 * 
 * @author Calclavia
 * 
 */
public interface IEMPItem extends IItemElectric
{
	/**
	 * Called when this item is being EMPed
	 * 
	 * @param itemStack - The itemstack attacked by EMP
	 * @param entity - The entity holding the item
	 * @param empExplosives - The IExplosive object
	 */
	public void onEMP(ItemStack itemStack, Entity entity, IExplosion empExplosive);
}
