package co.uk.flansmods.common.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityAuraFX;
import net.minecraft.client.particle.EntityBreakingFX;
import net.minecraft.client.particle.EntityBubbleFX;
import net.minecraft.client.particle.EntityCloudFX;
import net.minecraft.client.particle.EntityCritFX;
import net.minecraft.client.particle.EntityDropParticleFX;
import net.minecraft.client.particle.EntityEnchantmentTableParticleFX;
import net.minecraft.client.particle.EntityExplodeFX;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.particle.EntityFireworkSparkFX;
import net.minecraft.client.particle.EntityFlameFX;
import net.minecraft.client.particle.EntityFootStepFX;
import net.minecraft.client.particle.EntityHeartFX;
import net.minecraft.client.particle.EntityHugeExplodeFX;
import net.minecraft.client.particle.EntityLargeExplodeFX;
import net.minecraft.client.particle.EntityLavaFX;
import net.minecraft.client.particle.EntityNoteFX;
import net.minecraft.client.particle.EntityPortalFX;
import net.minecraft.client.particle.EntityReddustFX;
import net.minecraft.client.particle.EntitySmokeFX;
import net.minecraft.client.particle.EntitySnowShovelFX;
import net.minecraft.client.particle.EntitySpellParticleFX;
import net.minecraft.client.particle.EntitySplashFX;
import net.minecraft.client.particle.EntitySuspendFX;
import net.minecraft.item.Item;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.world.World;
import co.uk.flansmods.common.FlansMod;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PacketFlak extends FlanPacketCommon 
{
	public static final byte packetID = 14;
	public static Random rand = new Random();
	
	public static Packet buildFlakPacket(double x, double y, double z, int numParticles, String particleType)
	{
		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = channelFlan;
		
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try
        {
        	data.write(packetID);
        	data.writeDouble(x);
        	data.writeDouble(y);
        	data.writeDouble(z);
        	data.writeInt(numParticles);
        	data.writeUTF(particleType);

        	packet.data = bytes.toByteArray();
        	packet.length = packet.data.length;
        	packet.isChunkDataPacket = true;

        	data.close();
        	bytes.close();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }

        return packet;
	}

	// extradata [0] = world
	@Override
	public void interpret(DataInputStream stream, Object[] extradata, Side side)
	{
		if(side.isClient())
		{
			interpretClient(stream, extradata, side);
		}
		else
		{
			FlansMod.log("Flak packet received on server. Skipping interpretation.");
		}
	}	
	
	@SideOnly(Side.CLIENT)
	public void interpretClient(DataInputStream stream, Object[] extradata, Side side)
	{
		try
		{
			World world = (World)extradata[0];
			double x = stream.readDouble();
			double y = stream.readDouble();
			double z = stream.readDouble();
			int numParticles = stream.readInt();
			String particleType = stream.readUTF();
			for (int i = 0; i < numParticles; i++)
			{
				EntityFX obj = getParticle(particleType, world, x + rand.nextGaussian(), y + rand.nextGaussian(), z + rand.nextGaussian());
				obj.motionX = rand.nextGaussian() / 20;
				obj.motionY = rand.nextGaussian() / 20;
				obj.motionZ = rand.nextGaussian() / 20;
				obj.renderDistanceWeight = 250D;
				FMLClientHandler.instance().getClient().effectRenderer.addEffect(obj);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public byte getPacketID()
	{
		return packetID;
	}
	
	@SideOnly(Side.CLIENT)
	public EntityFX getParticle(String s, World w, double x, double y, double z)
	{
					
		Minecraft mc = Minecraft.getMinecraft();
		if (s.equals("hugeexplosion"))
            return new EntityHugeExplodeFX(w, x, y, z, 0.01D, 0.01D, 0.01D);
        else if(s.equals("largeexplode"))
            return new EntityLargeExplodeFX(mc.renderEngine, w, x, y, z, 0.01D, 0.01D, 0.01D);
        else if(s.equals("fireworksSpark"))
            return new EntityFireworkSparkFX(w, x, y, z, 0.01D, 0.01D, 0.01D, mc.effectRenderer);
        else if (s.equals("bubble"))
        	return new EntityBubbleFX(w, x, y, z, 0.01D, 0.01D, 0.01D);
        else if (s.equals("suspended"))
        	return new EntitySuspendFX(w, x, y, z, 0.01D, 0.01D, 0.01D);
        else if (s.equals("depthsuspend"))
        	return new EntityAuraFX(w, x, y, z, 0.01D, 0.01D, 0.01D);
        else if (s.equals("townaura"))
        	return new EntityAuraFX(w, x, y, z, 0.01D, 0.01D, 0.01D);
        else if (s.equals("crit"))
        	return new EntityCritFX(w, x, y, z, 0.01D, 0.01D, 0.01D);
        else if (s.equals("smoke"))
            return new EntitySmokeFX(w, x, y, z, 0.01D, 0.01D, 0.01D);
        else if (s.equals("mobSpell") || s.equals("mobSpellAmbient"))
        	return new EntitySpellParticleFX(w, x, y, z, 0.01D, 0.01D, 0.01D);
        else if (s.equals("spell"))
        	return new EntitySpellParticleFX(w, x, y, z, 0.01D, 0.01D, 0.01D);
		else if (s.equals("note"))
		    return new EntityNoteFX(w, x, y, z, 0.01D, 0.01D, 0.01D);
		else if (s.equals("portal"))
		    return new EntityPortalFX(w, x, y, z, 0.01D, 0.01D, 0.01D);
		else if (s.equals("enchantmenttable"))
		    return new EntityEnchantmentTableParticleFX(w, x, y, z, 0.01D, 0.01D, 0.01D);
		else if (s.equals("explode"))
		    return new EntityExplodeFX(w, x, y, z, 0.01D, 0.01D, 0.01D);
		else if (s.equals("flame"))
		    return new EntityFlameFX(w, x, y, z, 0.01D, 0.01D, 0.01D);
		else if (s.equals("lava"))
			return new EntityLavaFX(w, x, y, z);
		else if (s.equals("footstep"))
		    return new EntityFootStepFX(mc.renderEngine, w, x, y, z);
		else if (s.equals("splash"))
		    return new EntitySplashFX(w, x, y, z, 0.01D, 0.01D, 0.01D);
		else if (s.equals("largesmoke"))
		    return new EntitySmokeFX(w, x, y, z, 0.01D, 0.01D, 0.01D, 2.5F);
		else if (s.equals("cloud"))
		    return new EntityCloudFX(w, x, y, z, 0.01D, 0.01D, 0.01D);
		else if (s.equals("reddust"))
		    return new EntityReddustFX(w, x, y, z, 0.01F, 0.01F, 0.01F);
		else if (s.equals("snowballpoof"))
		    return new EntityBreakingFX(w, x, y, z, Item.snowball);
		else if (s.equals("dripWater"))
		    return new EntityDropParticleFX(w, x, y, z, Material.water);
		else if (s.equals("dripLava"))
		    return new EntityDropParticleFX(w, x, y, z, Material.lava);
		else if (s.equals("snowshovel"))
		    return new EntitySnowShovelFX(w, x, y, z, 0.01D, 0.01D, 0.01D);
		else if (s.equals("slime"))
		    return new EntityBreakingFX(w, x, y, z, Item.slimeBall);
		else if (s.equals("heart"))
			return new EntityHeartFX(w, x, y, z, 0.01D, 0.01D, 0.01D);
		return null;
	}
}
