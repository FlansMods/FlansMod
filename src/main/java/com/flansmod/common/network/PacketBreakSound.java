package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;

public class PacketBreakSound extends PacketBase
{
	public int x, y, z;
	public int blockID;
	
	public PacketBreakSound()
	{
	}
	
	public PacketBreakSound(int x, int y, int z, Block block)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		blockID = Block.getIdFromBlock(block);
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		data.writeInt(x);
		data.writeInt(y);
		data.writeInt(z);
		data.writeInt(blockID);
	}
	
	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		x = data.readInt();
		y = data.readInt();
		z = data.readInt();
		blockID = data.readInt();
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity)
	{
		FlansMod.log.warn("Received block break sound packet on server. Skipping.");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer)
	{
		World world = clientPlayer.world;
		BlockPos pos = new BlockPos(x, y, z);
		IBlockState state = world.getBlockState(new BlockPos(x, y, z));
		Block block = Block.getBlockById(blockID);
		
		FMLClientHandler.instance().getClient().effectRenderer.addBlockDestroyEffects(new BlockPos(x, y, z), block.getDefaultState());
		SoundType sound = block.getSoundType(state, world, pos, clientPlayer);
		SoundEvent event = sound.getBreakSound();
		FMLClientHandler.instance().getClient().getSoundHandler().playSound(
				new PositionedSoundRecord(event, SoundCategory.BLOCKS, (sound.getVolume() + 1.0F) / 2.0F, sound.getPitch() * 0.8F, x + 0.5F, y + 0.5F, z + 0.5F));
	}
}
