package co.uk.flansmods.common.teams;

import co.uk.flansmods.client.debug.EntityDebugAABB;
import co.uk.flansmods.common.FlansModPlayerData;
import co.uk.flansmods.common.FlansModPlayerHandler;
import co.uk.flansmods.common.teams.TeamsManager.TeamsMap;
import co.uk.flansmods.common.vector.Vector3f;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemOpStick extends Item
{
	public static final String[] stickNames = new String[] {"opStick_ownership", "opStick_connecting", "opStick_mapping", "opStick_destruction", "opStick_redCorner", "opStick_blueCorner"};
    @SideOnly(Side.CLIENT)
    private Icon[] icons;
    
	public ItemOpStick(int i)
	{
		super(i - 256);
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
	
	/** Super secret WorldEdit functionality */
	@Override
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
		int n = itemstack.getItemDamage();
		if(n != 4 && n != 5)
			return itemstack;
				
    	//Raytracing
        float cosYaw = MathHelper.cos(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
        float sinYaw = MathHelper.sin(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
        float cosPitch = -MathHelper.cos(-entityplayer.rotationPitch * 0.01745329F);
        float sinPitch = MathHelper.sin(-entityplayer.rotationPitch * 0.01745329F);
        double length = 100D;
        Vec3 posVec = Vec3.createVectorHelper(entityplayer.posX, entityplayer.posY + 1.62D - entityplayer.yOffset, entityplayer.posZ);        
        Vec3 lookVec = posVec.addVector(sinYaw * cosPitch * length, sinPitch * length, cosYaw * cosPitch * length);
        MovingObjectPosition movingobjectposition = world.clip(posVec, lookVec, true);
        
        //Result check
        if(movingobjectposition == null)
        {
            return itemstack;
        }
        if(movingobjectposition.typeOfHit == EnumMovingObjectType.TILE)
        {
            int i = movingobjectposition.blockX;
            int j = movingobjectposition.blockY;
            int k = movingobjectposition.blockZ;
            if(world.isRemote)
            {
            	world.spawnEntityInWorld(new EntityDebugAABB(world, new Vector3f(i - 0.1F, j - 0.1F, k - 0.1F), new Vector3f(1.2F, 1.2F, 1.2F), 20, n == 4 ? 1 : 0, 0, n == 5 ? 1 : 0));
            }
            else
            {
        		FlansModPlayerData data = FlansModPlayerHandler.getPlayerData(entityplayer, Side.SERVER);
        		if(n == 4)
        		{
	        		data.x1 = i;
	        		data.y1 = j;
	        		data.z1 = k;
        		}
        		else
        		{
	        		data.x2 = i;
	        		data.y2 = j;
	        		data.z2 = k;
        		}
            }
        }
        return itemstack;
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register)
    {
    	icons = new Icon[stickNames.length];

        for(int i = 0; i < stickNames.length; ++i)
        {
        	icons[i] = register.registerIcon("FlansMod:" + stickNames[i]);
        	itemIcon = icons[i];
        }
    }
	
	@Override
    public Icon getIconFromDamage(int damage)
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
