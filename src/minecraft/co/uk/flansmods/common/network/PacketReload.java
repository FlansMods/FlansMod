package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import co.uk.flansmods.client.FlansModClient;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.ItemBullet;
import co.uk.flansmods.common.guns.BulletType;
import co.uk.flansmods.common.guns.GunType;
import co.uk.flansmods.common.guns.ItemGun;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

//An incredibly simple packet. When the client recieves one it "reloads". Basically to stop recoil
public class PacketReload extends FlanPacketCommon 
{
	public static final byte packetID = 19;
	
	public static Packet buildReloadPacket()
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID);
        	
        	packet.data = bytes.toByteArray();
        	packet.length = packet.data.length;
        	
        	data.close();
        	bytes.close();
        }
        catch(Exception e)
        {
                e.printStackTrace();
        }
        
        return packet;
	}

	@Override
	public void interpret(DataInputStream stream, Object[] extradata, Side side)
	{
		if (side.equals(Side.CLIENT))
			interpretClient(stream, extradata);	
		else interpretServer(stream, extradata);
	}
	
	/** The player pressed the reload key */
	private void interpretServer(DataInputStream stream, Object[] extradata)
	{
    	EntityPlayer player = (EntityPlayer)extradata[0];
    	ItemStack stack = player.getCurrentEquippedItem();
    	if(stack != null && stack.getItem() instanceof ItemGun)
    	{
    		GunType type = ((ItemGun)stack.getItem()).type;
    		((ItemGun)stack.getItem()).reload(stack, player.worldObj, player, true, false);
    	}
	}
	
	/** The player's gun was reloaded server side. Apply reload delay timers and whatnot */
	@SideOnly(value = Side.CLIENT)
	private void interpretClient(DataInputStream stream, Object[] extradata)
	{
        try
        {
        	EntityPlayer player = (EntityPlayer)extradata[0];
        	ItemStack stack = player.getCurrentEquippedItem();
        	if(stack != null && stack.getItem() instanceof ItemGun)
        	{
        		GunType type = ((ItemGun)stack.getItem()).type;
        		FlansModClient.shootTime = type.reloadTime;
        		
				//Iterate over all inventory slots and find the magazine / bullet item with the most bullets
				int bestSlot = -1;
				int bulletsInBestSlot = 0;
				for (int j = 0; j < player.inventory.getSizeInventory(); j++)
				{
					ItemStack item = player.inventory.getStackInSlot(j);
					if (item != null && item.getItem() instanceof ItemBullet && type.isAmmo(((ItemBullet)(item.getItem())).type))
					{
						int bulletsInThisSlot = item.getMaxDamage() - item.getItemDamage();
						if(bulletsInThisSlot > bulletsInBestSlot)
						{
							bestSlot = j;
							bulletsInBestSlot = bulletsInThisSlot;
						}
					}
				}
				//If there was a valid non-empty magazine / bullet item somewhere in the inventory, take one to put in the gun
				if(bestSlot != -1)
				{
					ItemStack newBulletStack = player.inventory.getStackInSlot(bestSlot);
					BulletType newBulletType = ((ItemBullet)newBulletStack.getItem()).type;
					//Remove the magazine from the inventory
					if(!player.capabilities.isCreativeMode)
						newBulletStack.stackSize--;
					if(newBulletStack.stackSize <= 0)
						newBulletStack = null;
					player.inventory.setInventorySlotContents(bestSlot, newBulletStack);
				}
        	}
        }
        catch(Exception e)
        {
        	FlansMod.log("Error \"reload\"ing from reload packet");
        	e.printStackTrace();
        }
	}

	@Override
	public byte getPacketID()
	{
		return packetID;
	}
}
