package com.flansmod.apocalypse.client.model;

import com.flansmod.apocalypse.common.entity.EntitySurvivor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.util.ResourceLocation;

public class RenderSurvivor extends RenderBiped<EntitySurvivor>
{
	private static final ResourceLocation SURVIVOR_SKIN = new ResourceLocation("flansmodapocalypse", "textures/entity/Survivor.png");
	
	public RenderSurvivor(RenderManager man, ModelBiped model, float f)
	{
		super(man, model, f);
		
		this.addLayer(new LayerBipedArmor(this));
	}
	
	protected ResourceLocation getEntityTexture(EntitySurvivor entity)
	{
		return SURVIVOR_SKIN;
	}
}
