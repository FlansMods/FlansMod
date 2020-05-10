package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.ParticleDigging;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.vector.Vector3f;

public class PacketBlockHitEffect extends PacketBase
{
	private Float x;
	private Float y;
	private Float z;
	
	private Float directionX;
	private Float directionY;
	private Float directionZ;
	
	private Integer blockX;
	private Integer blockY;
	private Integer blockZ;
	
	private EnumFacing facing;
	
	public PacketBlockHitEffect() {
		//default constructor
	}
	
	public PacketBlockHitEffect(Vector3f hit, Vector3f direction, BlockPos position, EnumFacing facing)
	{
		this(hit.x, hit.y, hit.z, direction.x, direction.y, direction.z, position.getX(), position.getY(), position.getZ(), facing);
	}
	
	public PacketBlockHitEffect(Float x, Float y, Float z, Float directionX, Float directionY, Float directionZ, Integer blockX, Integer blockY, Integer blockZ, EnumFacing facing)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		
		this.directionX = directionX;
		this.directionY = directionY;
		this.directionZ = directionZ;
		
		this.blockX = blockX;
		this.blockY = blockY;
		this.blockZ = blockZ;
		
		this.facing = facing;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		data.writeFloat(x);
		data.writeFloat(y);
		data.writeFloat(z);
		
		data.writeFloat(directionX);
		data.writeFloat(directionY);
		data.writeFloat(directionZ);
		
		data.writeInt(blockX);
		data.writeInt(blockY);
		data.writeInt(blockZ);
		
		data.writeInt(facing.getIndex());
	}
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		x = data.readFloat();
		y = data.readFloat();
		z = data.readFloat();
		
		directionX = data.readFloat();
		directionY = data.readFloat();
		directionZ = data.readFloat();
		
		blockX = data.readInt();
		blockY = data.readInt();
		blockZ = data.readInt();
		
		facing = EnumFacing.byIndex(data.readInt());
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity)
	{
		FlansMod.log.warn("Received Packet packet on client. Skipping.");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		World world = clientPlayer.getEntityWorld();
		BlockPos pos = new BlockPos(blockX, blockY, blockZ);
		IBlockState state = world.getBlockState(pos).getActualState(world, pos);
		Vec3i facingDir = facing.getDirectionVec();
		
		for(int i = 0; i < 2; i++)
		{
			// TODO: [1.12] Check why this isn't moving right
			float scale = (float)world.rand.nextGaussian() * 0.1f + 0.5f;
			
			double motionX = (double)facingDir.getX() * scale + world.rand.nextGaussian() * 0.025d;
			double motionY = (double)facingDir.getY() * scale + world.rand.nextGaussian() * 0.025d;
			double motionZ = (double)facingDir.getZ() * scale + world.rand.nextGaussian() * 0.025d;
			
			motionX += directionX;
			motionY += directionY;
			motionZ += directionZ;
			
			ParticleDigging fx = (ParticleDigging)Minecraft.getMinecraft().effectRenderer.spawnEffectParticle(
					EnumParticleTypes.BLOCK_CRACK.getParticleID(),
					x, y, z, motionX, motionY, motionZ,
					Block.getIdFromBlock(state.getBlock()));
			
			if(fx != null)
			{
				fx.setParticleTexture(Minecraft.getMinecraft().getBlockRendererDispatcher()
						.getModelForState(state).getParticleTexture());
			}
		}
		
		double scale = world.rand.nextGaussian() * 0.05d + 0.05d;
		double motionX = (double)facingDir.getX() * scale + world.rand.nextGaussian() * 0.025d;
		double motionY = (double)facingDir.getY() * scale + world.rand.nextGaussian() * 0.025d;
		double motionZ = (double)facingDir.getZ() * scale + world.rand.nextGaussian() * 0.025d;

		Minecraft.getMinecraft().effectRenderer.spawnEffectParticle(EnumParticleTypes.CLOUD.getParticleID(), x, y, z, motionX, motionY, motionZ);
		
	}
}
