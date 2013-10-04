package co.uk.flansmods.client.network;

import java.io.DataInputStream;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.world.World;
import co.uk.flansmods.common.network.FlanPacketCommon;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.Player;
import cpw.mods.fml.relauncher.Side;

public class FlanPacketClient extends FlanPacketCommon
{
	@Override
	public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player)
	{
		String name = ((EntityPlayer) player).username;
		EntityPlayer playerEntity = FMLClientHandler.instance().getClient().thePlayer;
		if (!packet.channel.equals(channelFlan))
			return;
		
		World world = Minecraft.getMinecraft().theWorld;
		
		receive(packet, playerEntity, manager, Side.CLIENT, world);
	}
		
	/**
	 * MEANT TO BE ONLY EXTENDED
	 * interprets the data and does something with it.
	 * @param stream
	 * @param extradata
	 */
	@Override
	public void interpret(DataInputStream stream, Object[] extradata, Side side)
	{
		
	}
	
	/**
	 * MEAN TO BE ONLY EXTENDED
	 * @return the ID of the packet wrapper
	 */
	@Override
	public byte getPacketID()
	{
		return 0;
	}
}