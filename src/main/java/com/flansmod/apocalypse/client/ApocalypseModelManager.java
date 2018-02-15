package com.flansmod.apocalypse.client;

import com.flansmod.apocalypse.common.FlansModApocalypse;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ApocalypseModelManager 
{
	public static void registerVariants()
	{
		ModelLoader.setCustomStateMapper(FlansModApocalypse.blockSulphuricAcid, (new StateMap.Builder()).addPropertiesToIgnore(BlockFluidBase.LEVEL).build());
	}
	
	@SubscribeEvent
	public void onModelBakeEvent(ModelBakeEvent event)
	{
		event.modelRegistry.putObject(new ModelResourceLocation("flansmodapocalypse:blockSulphuricAcid", "normal"), new FluidBlockModel());
		
		TextureMap textureMap = Minecraft.getMinecraft().getTextureMapBlocks();
		FlansModApocalypse.sulphuricAcid.setIcons(textureMap.getAtlasSprite("flansmodapocalypse:blocks/SulphuricAcidStill"), textureMap.getAtlasSprite("flansmodapocalypse:blocks/SulphuricAcidFlowing"));
	}
}
