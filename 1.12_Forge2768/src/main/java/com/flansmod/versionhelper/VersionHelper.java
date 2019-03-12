package com.flansmod.versionhelper;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VersionHelper
{	
	public Version GetVersion() { return Version.MC_1_11; }
	
	public static Object eventHandler = null;
	public static Object EVENT_HANDLER() {
		if(eventHandler == null)
			eventHandler = new EventHandler();
		return eventHandler;
	}
	public static FontRenderer GetFontRenderer() { return Minecraft.getMinecraft().fontRenderer; }
	
	public static void RegisterTileEntity(Class<? extends TileEntity> tileEntityClass, String id) { GameRegistry.registerTileEntity(tileEntityClass, new ResourceLocation(id)); }
	public static ItemStack GetItem(EntityItem entity) { return entity.getItem(); }
	public static double GetX(Vec3d v) { return v.x; }
	public static double GetY(Vec3d v) { return v.y; }
	public static double GetZ(Vec3d v) { return v.z; }
	public static float GetSlipperiness(net.minecraft.block.Block block, IBlockState state, World world, BlockPos pos, Entity entity)
	{
		return block.getSlipperiness(state, world, pos, entity);
 	}
	
	public static void ModPreInit() {}
	public static void ModInit() {}
	public static void ModPostInit() {}
}
