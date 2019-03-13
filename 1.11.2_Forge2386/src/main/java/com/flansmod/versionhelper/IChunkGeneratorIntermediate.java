package com.flansmod.versionhelper;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkGenerator;

public interface IChunkGeneratorIntermediate extends IChunkGenerator
{
	public Chunk generateChunk(int x, int z); // Shortcut to provideChunk
	public boolean isInsideStructure(World worldIn, String structureName, BlockPos pos);
}
