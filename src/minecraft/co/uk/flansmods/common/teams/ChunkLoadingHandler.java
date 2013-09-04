package co.uk.flansmods.common.teams;

import java.util.List;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeChunkManager.LoadingCallback;
import net.minecraftforge.common.ForgeChunkManager.Ticket;

public class ChunkLoadingHandler implements LoadingCallback 
{
	@Override
	public void ticketsLoaded(List<Ticket> tickets, World world) 
	{
		for(Ticket ticket : tickets) 
		{
			int x = ticket.getModData().getInteger("xCoord");
			int y = ticket.getModData().getInteger("yCoord");
			int z = ticket.getModData().getInteger("zCoord");
			TileEntity te = world.getBlockTileEntity(x, y, z);
			if(te instanceof TileEntitySpawner) 
			{
				((TileEntitySpawner)te).forceChunkLoading(ticket);
			}
		}
	}

}
