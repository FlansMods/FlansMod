package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.src.Packet;
import net.minecraft.src.Packet250CustomPayload;
import net.minecraft.src.World;
import co.uk.flansmods.common.BlockGunBox;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.GunBoxType;

public class PacketBuyWeapon extends FlanPacketServer
{
	public static final byte packetID = 5;
	
	//type is 0 for gun, 1 for ammo, 2 for altAmmo
	public static Packet buildBuyWeaponPacket(BlockGunBox box, int type, int weaponID)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID); // this is the packet ID. identifies it as a BreakSoundPacket
        	data.writeUTF(box.type.shortName);
        	data.write(type);
        	data.write(weaponID);

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

	/**
	 * ExtraData : [0] = World, [1] = Player
	 */
	@Override
	public void interpret(DataInputStream stream, Object[] extradata)
	{
		//TODO : Route this to the block, but first combine the boxes into one ID with a tileEntity
	}

	@Override
	public byte getPacketID()
	{
		return packetID;
	}
}
