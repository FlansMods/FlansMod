package com.flansmod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.driveables.mechas.EntityMecha;

public class ModelMechaTool extends ModelBase
{
	/**
	 * This is the base, common across all Mecha Tools
	 */
	public ModelRendererTurbo[] baseModel = new ModelRendererTurbo[0];
	/**
	 * This bit spins
	 */
	public ModelRendererTurbo[] drillModel = new ModelRendererTurbo[0];
	/**
	 * This bit spins on a different axis
	 */
	public ModelRendererTurbo[] sawModel = new ModelRendererTurbo[0];
	
	public void render(EntityMecha mecha, float f1)
	{
		float f5 = 1F / 16F;
		
		for(ModelRendererTurbo model : baseModel)
			model.render(f5);
	}
	
	public void renderDrill(EntityMecha mecha, float f1)
	{
		float f5 = 1F / 16F;
		
		for(ModelRendererTurbo model : drillModel)
			model.render(f5);
	}
	
	public void renderSaw(EntityMecha mecha, float f1, boolean spin)
	{
		float f5 = 1F / 16F;
		
		for(ModelRendererTurbo model : sawModel)
		{
			GlStateManager.pushMatrix();
			if(spin)
			{
				GlStateManager.translate(model.rotationPointX / 16F, model.rotationPointY / 16F, model.rotationPointZ / 16F);
				GlStateManager.rotate(25F * (float)mecha.ticksExisted, 0F, 1F, 0F);
				GlStateManager.translate(-model.rotationPointX / 16F, -model.rotationPointY / 16F, -model.rotationPointZ / 16F);
			}
			model.render(f5);
			GlStateManager.popMatrix();
		}
		
	}
}
