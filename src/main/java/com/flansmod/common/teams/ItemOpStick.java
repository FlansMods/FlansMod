package com.flansmod.common.teams;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.common.teams.TeamsManager.TeamsMap;

public class ItemOpStick extends Item
{
	public static final String[] stickNames = new String[] {"opStick_ownership", "opStick_connecting", "opStick_mapping", "opStick_destruction"};
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;
    
	public ItemOpStick()
	{
		super();
		setUnlocalizedName("opStick");
		setHasSubtypes(true);
	}
		
    @Override
	public boolean shouldRotateAroundWhenRendering()
    {
        return true;
    }
	
	@Override
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
	    			TeamsManager.messagePlayer(player, "Please set up teams before editing this base");
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
	    		TeamsManager.messagePlayer(player, "Base owner changed to " + (newOwner == null ? "none" : newOwner.shortName));
	    		if(currentOwner != null)
	    			currentOwner.bases.remove(base);
	    		base.setBase(newOwner);
	    		if(newOwner != null)
	    			newOwner.bases.add(base);
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
	    					TeamsManager.messagePlayer(player, "Successfully connected.");
	    				}
	    				else
	    				{
	    					TeamsManager.messagePlayer(player, "Cannot connect bases to bases.");
	    				}
	    			}
	    		}
	    		break;
	    	}
	    	case 2 : //Stick of Mapping
	    	{
	    		TeamsMap currentMap = base.getMap();
	    		int mapID = teamsManager.maps.indexOf(currentMap);
	    		TeamsMap newMap = teamsManager.maps.get((mapID + 1) % teamsManager.maps.size());
	    		base.setMap(newMap);
	    		TeamsManager.messagePlayer(player, "Set map for this base to " + newMap.name + ".");
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
	    					//line.setDead();
	    					//player.fishEntity = null;
	    					TeamsManager.messagePlayer(player, "Successfully connected.");
	    				}
	    				else
	    				{
	    					TeamsManager.messagePlayer(player, "Cannot connect objects to objects.");
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
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register)
    {
    	icons = new IIcon[stickNames.length];

        for(int i = 0; i < stickNames.length; ++i)
        {
        	icons[i] = register.registerIcon("FlansMod:" + stickNames[i]);
        	itemIcon = icons[i];
        }
    }
	
	@Override
    public IIcon getIconFromDamage(int damage)
    {
        int j = MathHelper.clamp_int(damage, 0, 15);
        return icons[j];
    }
	
	@Override
    public String getUnlocalizedName(ItemStack stack)
    {
        return super.getUnlocalizedName() + "." + stack.getItemDamage();
    }
}
