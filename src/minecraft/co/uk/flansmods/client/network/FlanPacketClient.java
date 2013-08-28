package co.uk.flansmods.client.network;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.world.World;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.network.FlanPacketCommon;
import co.uk.flansmods.common.network.PacketDriveableCrafting;
import co.uk.flansmods.common.network.PacketBreakSound;
import co.uk.flansmods.common.network.PacketBuyWeapon;
import co.uk.flansmods.common.network.PacketContentPackList;
import co.uk.flansmods.common.network.PacketDriveableDamage;
import co.uk.flansmods.common.network.PacketFlak;
import co.uk.flansmods.common.network.PacketGunBoxTE;
import co.uk.flansmods.common.network.PacketGunFire;
import co.uk.flansmods.common.network.PacketMGFire;
import co.uk.flansmods.common.network.PacketMGMount;
import co.uk.flansmods.common.network.PacketPlaySound;
import co.uk.flansmods.common.network.PacketPlayerSpawn;
import co.uk.flansmods.common.network.PacketReload;
import co.uk.flansmods.common.network.PacketRepairDriveable;
import co.uk.flansmods.common.network.PacketSeatUpdates;
import co.uk.flansmods.common.network.PacketTeamInfo;
import co.uk.flansmods.common.network.PacketTeamSelect;
import co.uk.flansmods.common.network.PacketVehicleControl;
import co.uk.flansmods.common.network.PacketVehicleGUI;
import co.uk.flansmods.common.network.PacketVehicleKey;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.IPacketHandler;
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
	public void interpret(DataInputStream stream, Object[] extradata, Side side)
	{
		
	}
	
	/**
	 * MEAN TO BE ONLY EXTENDED
	 * @return the ID of the packet wrapper
	 */
	public byte getPacketID()
	{
		return 0;
	}
}