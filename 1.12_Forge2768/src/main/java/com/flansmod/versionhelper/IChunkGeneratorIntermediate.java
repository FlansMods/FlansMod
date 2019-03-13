package com.flansmod.versionhelper;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.IChunkGenerator;

public interface IChunkGeneratorIntermediate extends IChunkGenerator
{
	public abstract Chunk provideChunk(int x, int z) ; // Shortcut to generateChunk
	public abstract BlockPos getStrongholdGen(World worldIn, String structureName, BlockPos position, boolean p_180513_4_);  // Shortcut to getNearestStructurePos
}
