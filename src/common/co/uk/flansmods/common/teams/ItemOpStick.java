package co.uk.flansmods.common.teams;

import co.uk.flansmods.common.EntityPlane;
import net.minecraft.src.Block;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityFishHook;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EntityPlayerMP;
import net.minecraft.src.EnumGameType;
import net.minecraft.src.EnumMovingObjectType;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MathHelper;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.Vec3;
import net.minecraft.src.World;

public class ItemOpStick extends Item
{
	public ItemOpStick(int i)
	{
		super(i - 256);
		setItemName("opStick");
		setHasSubtypes(true);
	}
	
	public String getItemNameIS(ItemStack stack)
	{
		return getItemName() + stack.getItemDamage();
	}
	
	public int getIconFromDamage(int damage)
    {
        return 8 + damage;
    }

	public String getTextureFile()
	{
		return "/spriteSheets/armour.png";
	}
	
    public boolean shouldRotateAroundWhenRendering()
    {
        return true;
    }
	
	public boolean isFull3D()
	{
		return true;
	}
	
	public void clickedEntity(World world, EntityPlayer player, Entity clicked)
	{
		if(!(player instanceof EntityPlayerMP))
			return;
		if(clicked instanceof ITeamBase)
			clickedBase(world, (EntityPlayerMP)player, (ITeamBase)clicked);
		if(clicked instanceof ITeamObject)
			clickedObject(world, (EntityPlayerMP)player, (ITeamObject)clicked);
	}
	
	public void clickedBase(World world, EntityPlayerMP player, ITeamBase base)
	{
		int damage = player.inventory.getCurrentItem().getItemDamage(); 
		TeamsManager teamsManager = TeamsManager.getInstance();
		switch(damage)
    	{
	    	case 0 : //Stick of Ownership
	    	{
	    		if(teamsManager.teams == null)
	    		{
	    			teamsManager.messagePlayer(player, "Please set up teams before editing this base");
	    			return;
	    		}
	    		Team currentOwner = base.getOwner();
	    		Team newOwner = null;
	    		if(currentOwner == null)
	    		{
	    			if(teamsManager.teams != null)
	    				newOwner = teamsManager.teams[0];
	    			else newOwner = Team.spectators;
	    		}
	    		else if(currentOwner == Team.spectators)
	    			newOwner = null;
	    		else
	    		{
	    			for(int i = 0; i < teamsManager.teams.length; i++)
	    			{
	    				if(currentOwner == teamsManager.teams[i])
	    				{
	    					if(i == teamsManager.teams.length - 1)
	    						newOwner = Team.spectators;
	    					else newOwner = teamsManager.teams[i + 1];
	    				}
	    			}
	    		}
	    		teamsManager.messagePlayer(player, "Base owner changed to " + (newOwner == null ? "none" : newOwner.shortName));
	    		base.setBase(newOwner);
	    		for(ITeamObject object : base.getObjects())
	    		{
	    			object.onBaseSet(newOwner);
	    		}
	    		break;
	    	}
	    	case 1 : //Stick of Connecting
	    	{
	    		if(player.fishEntity == null)
	    		{
	    			EntityConnectingLine hook = new EntityConnectingLine(world, player, base);
	    			world.spawnEntityInWorld(hook);
	    		}
	    		else
	    		{
	    			if(player.fishEntity instanceof EntityConnectingLine)
	    			{
	    				EntityConnectingLine line = (EntityConnectingLine)player.fishEntity;
	    				if(line.connectedTo instanceof ITeamObject)
	    				{
	    					ITeamObject object = (ITeamObject)line.connectedTo;
	    					object.setBase(base);
	    					base.addObject(object);
	    					line.setDead();
	    					player.fishEntity = null;
	    					teamsManager.messagePlayer(player, "Successfully connected.");
	    				}
	    				else
	    				{
	    					teamsManager.messagePlayer(player, "Cannot connect bases to bases.");
	    				}
	    			}
	    		}
	    		break;
	    	}
	    	case 2 : //Stick of Mapping
	    	{
	    		
	    		break;
	    	}
	    	case 3 : //Stick of Destruction
	    	{
	    		base.destroy();
	    		break;
	    	}
    	}
	}
	
	public void clickedObject(World world, EntityPlayerMP player, ITeamObject object)
	{
		int damage = player.inventory.getCurrentItem().getItemDamage(); 
		TeamsManager teamsManager = TeamsManager.getInstance();
		switch(damage)
    	{
	    	case 0 : //Stick of Ownership
	    	{
	    		//Do nothing. Ownership is a property of bases.
	    		break;
	    	}
	    	case 1 : //Stick of Connecting
	    	{
	    		if(player.fishEntity == null)
	    		{
	    			EntityConnectingLine hook = new EntityConnectingLine(world, player, object);
	    			world.spawnEntityInWorld(hook);
	    		}
	    		else
	    		{
	    			if(player.fishEntity instanceof EntityConnectingLine)
	    			{
	    				EntityConnectingLine line = (EntityConnectingLine)player.fishEntity;
	    				if(line.connectedTo instanceof ITeamBase)
	    				{
	    					ITeamBase base = (ITeamBase)line.connectedTo;
	    					object.setBase(base);
	    					base.addObject(object);
	    					line.setDead();
	    					player.fishEntity = null;
	    					teamsManager.messagePlayer(player, "Successfully connected.");
	    				}
	    				else
	    				{
	    					teamsManager.messagePlayer(player, "Cannot connect objects to objects.");
	    				}
	    			}
	    		}
	    		break;
	    	}
	    	case 2 : //Stick of Mapping
	    	{
	    		//Again, this is a property of bases. Objects will follow their parent base in regards to which map they are a part of
	    		break;
	    	}
	    	case 3 : //Stick of Destruction
	    	{
	    		object.destroy();
	    		break;
	    	}
    	}
	}
}
