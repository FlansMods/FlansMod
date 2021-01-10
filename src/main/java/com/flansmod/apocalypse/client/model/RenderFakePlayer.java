package com.flansmod.apocalypse.client.model;

import com.flansmod.apocalypse.common.entity.EntityFakePlayer;
import com.flansmod.apocalypse.common.entity.EntityTeleporter;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderFakePlayer extends RenderBiped<EntityFakePlayer>
{
	private static final ResourceLocation SURVIVOR_SKIN = new ResourceLocation("flansmodapocalypse", "textures/entity/Survivor.png");
	
	public RenderFakePlayer(RenderManager man, ModelBiped model, float f)
	{
		super(man, model, f);
		
		this.addLayer(new LayerBipedArmor(this));
	}
	
	protected ResourceLocation getEntityTexture(EntityFakePlayer entity)
	{
		return SURVIVOR_SKIN;
	}
	
	public static class Factory implements IRenderFactory<EntityFakePlayer>
	{
		@Override
		public Render<EntityFakePlayer> createRenderFor(RenderManager manager)
		{
			return new RenderFakePlayer(manager, new ModelBiped(), 0);
		}
	}
}
