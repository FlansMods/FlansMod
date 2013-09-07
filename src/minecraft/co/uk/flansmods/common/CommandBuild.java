package co.uk.flansmods.common;

import cpw.mods.fml.relauncher.Side;
import net.minecraft.block.Block;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

public class CommandBuild extends CommandBase 
{


	@Override
	public String getCommandName() 
	{
		return "b";
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) 
	{
		return "";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] split) 
	{
		if(split.length == 0)
			return;
		
		//Get player
		EntityPlayerMP player = MinecraftServer.getServer().getConfigurationManager().getPlayerForUsername(sender.getCommandSenderName());
		if(player == null)
			return;
		FlansModPlayerData data = FlansModPlayerHandler.getPlayerData(player, Side.SERVER);
		
		//Get block ID
		int blockID = Integer.parseInt(split[0]);
		if(blockID == -1)
		{
			player.inventory.addItemStackToInventory(new ItemStack(FlansMod.opStick, 1, 4));
			player.inventory.addItemStackToInventory(new ItemStack(FlansMod.opStick, 1, 5));
		}
		if(blockID < 0 || blockID > 4096 || (Block.blocksList[blockID] == null && blockID != 0))
			return;
			
		//Get damage
		int damage = 0;
		if(split.length == 2)
			damage = Integer.parseInt(split[1]);
		
		//Check world
		World world = sender.getEntityWorld();
		if(world == null)
			return;
		
		for(int i = Math.min(data.x1, data.x2); i <= Math.max(data.x1, data.x2); i++)
		{
			for(int j = Math.min(data.y1, data.y2); j <= Math.max(data.y1, data.y2); j++)
			{
				for(int k = Math.min(data.z1, data.z2); k <= Math.max(data.z1, data.z2); k++)
				{
					world.setBlock(i, j, k, blockID, damage, 2);
				}
			}
		}
	}

}
