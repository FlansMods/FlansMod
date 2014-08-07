package com.flansmod.common.teams;

import com.flansmod.common.FlansMod;
import com.flansmod.common.network.PacketBaseEdit;

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

public class ItemOpStick extends Item
{
	public static final String[] teamNames = new String[] {"No Team", "Spectators", "Team 1", "Team 2"};	
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
	
	public static void openBaseEditGUI(ITeamBase base, EntityPlayerMP player)
	{
		String[] maps = new String[TeamsManager.getInstance().maps.values().size()];
		if(maps.length == 0)
		{
			//There are no maps setup. Disaster! Abort.
			TeamsManager.messagePlayer(player, "Maps are not yet set up. Use /teams help");
			return;
		}
		int currentMapID = -1;
		int i = 0;
		for(TeamsMap map : TeamsManager.getInstance().maps.values())
		{
			maps[i] = map.name;
			if(map == base.getMap())
				currentMapID = i;
			i++;
		}	    		
		FlansMod.getPacketHandler().sendTo(new PacketBaseEdit(base.getBaseID(), base.getName(), maps, currentMapID, base.getDefaultOwnerID()), player);

	}
	
	public void clickedBase(World world, EntityPlayerMP player, ITeamBase base)
	{
		int damage = player.inventory.getCurrentItem().getItemDamage(); 
		TeamsManager teamsManager = TeamsManager.getInstance();
		switch(damage)
    	{
	    	case 0 : //Stick of Ownership
	    	{
	    		//Take the existing ownerID, increment it (mod 4 for now - assume all gametypes involve 2 teams)
	    		int currentOwnerID = base.getDefaultOwnerID();
	    		currentOwnerID++;
	    		currentOwnerID = currentOwnerID % 4;
	    		base.setDefaultOwnerID(currentOwnerID);
	    		base.setOwnerID(currentOwnerID);
	    		
	    		for(ITeamObject object : base.getObjects())
	    			object.onBaseSet(currentOwnerID);
	    		
	    		TeamsManager.messagePlayer(player, "Base owner changed to " + teamNames[currentOwnerID]);

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
	    		openBaseEditGUI(base, player);
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
