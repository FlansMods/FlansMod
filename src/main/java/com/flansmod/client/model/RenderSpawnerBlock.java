package com.flansmod.client.model;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.world.IBlockAccess;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class RenderSpawnerBlock implements ISimpleBlockRenderingHandler
{

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID,
			RenderBlocks renderer) 
	{
		
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z,
			Block block, int modelId, RenderBlocks renderer) 
	{
		renderer.renderBlockAllFaces(block, x, y, z);
		return false;
	}

	@Override
	public boolean shouldRender3DInInventory(int i) 
	{
		return false;
	}

	@Override
	public int getRenderId() 
	{
		return 0;
	}

}
