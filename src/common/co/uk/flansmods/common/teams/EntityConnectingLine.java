package co.uk.flansmods.common.teams;

import java.util.Iterator;
import java.util.List;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.DamageSource;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityFishHook;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.Vec3;
import net.minecraft.src.World;

public class EntityConnectingLine extends EntityFishHook {
	
	public Object connectedTo;

	public EntityConnectingLine(World world) 
	{
		super(world);
	}

	public EntityConnectingLine(World world, EntityPlayer player, ITeamBase base)
    {
        super(world);
        bobber = this;
        ignoreFrustumCheck = true;
        angler = player;
        angler.fishEntity = this;
        setSize(0.25F, 0.25F);
        setPosition(base.getPosX(), base.getPosY(), base.getPosZ());
        yOffset = 0.0F;
        motionX = 0;
        motionZ = 0;
        motionY = 0;
        connectedTo = base;
    }
	   
	public EntityConnectingLine(World world, EntityPlayer player, ITeamObject object)
    {
        super(world);
        bobber = this;
        ignoreFrustumCheck = true;
        angler = player;
        angler.fishEntity = this;
        setSize(0.25F, 0.25F);
        setPosition(object.getPosX(), object.getPosY(), object.getPosZ());
        yOffset = 0.0F;
        motionX = 0;
        motionZ = 0;
        motionY = 0;
        connectedTo = object;
    }
	    
    public void onUpdate()
    {          
    	ItemStack currentItemstack = angler.inventory.getCurrentItem();
    	if(!(currentItemstack.getItem() instanceof ItemOpStick) || currentItemstack.getItemDamage() != 1)
    	{
    		setDead();
    		angler.fishEntity = null;
    	}
    }

}
