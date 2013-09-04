package co.uk.flansmods.common.guns;

import com.google.common.collect.Multimap;

import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.FlansModPlayerData;
import co.uk.flansmods.common.FlansModPlayerHandler;
import co.uk.flansmods.common.InfoType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemGrenade extends Item {

	public GrenadeType type;
	
	public ItemGrenade(int i, GrenadeType t) 
	{
		super(i);
		type = t;
		maxStackSize = type.maxStackSize;
		type.item = this;
		setCreativeTab(FlansMod.tabFlanGuns);
	}

	@Override
	public float getDamageVsEntity(Entity par1Entity, ItemStack itemStack)
	{
		return type.meleeDamage;
	}
	
	@Override
    public Multimap func_111205_h()
    {
        Multimap multimap = super.func_111205_h();
        multimap.put(SharedMonsterAttributes.field_111264_e.func_111108_a(), new AttributeModifier(field_111210_e, "Weapon modifier", type.meleeDamage, 0));
        return multimap;
    }
	
	@Override
	public boolean isFull3D()
	{
		return true;
	}
	
	@Override
	public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack)
	{
		return type.meleeDamage == 0;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	{
		FlansModPlayerData data = FlansModPlayerHandler.getPlayerData(player, world.isRemote ? Side.CLIENT : Side.SERVER);
		//If can throw grenade
		if(data.shootTime <= 0)
		{
			//Delay the next throw / weapon fire / whatnot
			data.shootTime = type.throwDelay;
			//Create a new grenade entity
			EntityGrenade grenade = new EntityGrenade(world, type, player);
			//Spawn the entity server side
			if(!world.isRemote)
				world.spawnEntityInWorld(grenade);
			//If this can be remotely detonated, add it to the players detonate list
			if(type.remote)
				data.remoteExplosives.add(grenade);
			//Consume an item
			if(!player.capabilities.isCreativeMode)
				stack.stackSize--;
			//Drop an item upon throwing if necessary
			if(type.dropItemOnThrow != null)
			{
				String itemName = type.dropItemOnDetonate;
				int damage = 0;
				if (itemName.contains("."))
				{
					damage = Integer.parseInt(itemName.split("\\.")[1]);
					itemName = itemName.split("\\.")[0];
				}
				ItemStack dropStack = InfoType.getRecipeElement(itemName, damage);
				world.spawnEntityInWorld(new EntityItem(world, player.posX, player.posY, player.posZ, dropStack));
			}
		}
		return stack;
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	return type.colour;
    }
	
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) 
    {
    	itemIcon = icon.registerIcon("FlansMod:" + type.iconPath);
    }
}
