package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.GunBoxType;
import cpw.mods.fml.relauncher.Side;

public class PacketBuyWeapon extends FlanPacketCommon
{
	public static final byte packetID = 5;
	
	//type is 0 for gun, 1 for ammo, 2 for altAmmo
	public static Packet buildBuyWeaponPacket(GunBoxType box, int type, int weaponID)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID); // this is the packet ID. identifies it as a BreakSoundPacket
        	data.writeUTF(box.shortName);
        	data.writeInt(type);
        	data.writeInt(weaponID);

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
	public void interpret(DataInputStream stream, Object[] extradata, Side side)
	{
		if(side.equals(Side.SERVER)) 
			interpretServer(stream, extradata);
		else FlansMod.logLoudly("Recieved Weapon packet on Client. Skipped interpretation");
		
		//TODO : Route this to the block, but first combine the boxes into one ID with a tileEntity
	}
	
	public void interpretServer(DataInputStream stream, Object[] extradata) 
	{
		try 
		{
			String shortName = stream.readUTF();
			int type = stream.readInt();
			int weaponID = stream.readInt();
			
			GunBoxType box = GunBoxType.getBox(shortName);
			
			EntityPlayer player = (EntityPlayer) extradata[1];
			FlansMod.gunBoxBlock.purchaseItem(type, weaponID, player.inventory, box);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public byte getPacketID()
	{
		return packetID;
	}
}
