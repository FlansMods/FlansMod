package com.flansmod.client;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.flansmod.common.FlansMod;
import com.flansmod.common.teams.BlockSpawner;

public class TileEntitySpawnerRenderer extends TileEntitySpecialRenderer 
{
	/*
	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y,
			double z, float f) 
	{
		
		BlockSpawner.colouredPass = true;
		
		Tessellator var10 = Tessellator.instance;

		bindTexture(TextureMap.locationBlocksTexture);
		
        RenderHelper.disableStandardItemLighting();
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glDisable(GL11.GL_CULL_FACE);

        if (Minecraft.isAmbientOcclusionEnabled())
        {
            GL11.glShadeModel(GL11.GL_SMOOTH);
        }
        else
        {
            GL11.glShadeModel(GL11.GL_FLAT);
        }

        //ForgeHooksClient.beforeBlockRender(FlansMod.spawner, blockRenderer);
        var10.startDrawingQuads();
        var10.setTranslation(((float)x - te.xCoord), ((float)y - te.yCoord), ((float)z - te.zCoord));
        var10.setColorOpaque(1, 1, 1);
  
        GL11.glColor4f(1, 1, 0, 0.5F);
        blockRenderer.renderBlockAllFaces(FlansMod.spawner, te.xCoord, te.yCoord, te.zCoord);        
        var10.setTranslation(0.0D, 0.0D, 0.0D);
        var10.draw();
        //ForgeHooksClient.afterBlockRender(FlansMod.spawner, blockRenderer);
        RenderHelper.enableStandardItemLighting();
		
		
		BlockSpawner.colouredPass = false;
		
	}
	*/

	@Override
	public void renderTileEntityAt(TileEntity p_180535_1_, double posX,
			double posZ, double p_180535_6_, float p_180535_8_, int p_180535_9_) {
		// TODO Auto-generated method stub
		
	}
}
