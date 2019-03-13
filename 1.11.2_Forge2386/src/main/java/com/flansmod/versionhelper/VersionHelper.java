package com.flansmod.versionhelper;

import java.util.ArrayList;
import java.util.Random;

import com.flansmod.client.debug.EntityDebugDot;
import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.common.EntityItemCustomRender;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.EntityWheel;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.guns.EntityAAGun;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.EntityMG;
import com.flansmod.common.teams.EntityFlag;
import com.flansmod.common.teams.EntityFlagpole;
import com.flansmod.common.teams.EntityGunItem;
import com.flansmod.common.teams.EntityTeamItem;
import com.flansmod.common.tools.EntityParachute;
import com.flansmod.common.types.InfoType;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
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
	
	public static void RegisterTileEntity(Class<? extends TileEntity> tileEntityClass, String id) { GameRegistry.registerTileEntity(tileEntityClass, id); }
	public static ItemStack GetItem(EntityItem entity) { return entity.getEntityItem(); }
	public static void SetItem(EntityItem entity, ItemStack item) { entity.setEntityItemStack(item); }
	public static void FirePlayerItemPickupEvent(EntityPlayer player, EntityItem entity, ItemStack copyStack) { FMLCommonHandler.instance().firePlayerItemPickupEvent(player, entity); }
	public static double GetX(Vec3d v) { return v.xCoord; }
	public static double GetY(Vec3d v) { return v.yCoord; }
	public static double GetZ(Vec3d v) { return v.zCoord; }
	public static float GetSlipperiness(net.minecraft.block.Block block, IBlockState state, World world, BlockPos pos, Entity entity)
	{
        return world.getBlockState(pos).getBlock().slipperiness;
	}
	public static FontRenderer GetFontRenderer() { return Minecraft.getMinecraft().fontRendererObj; }
	public static int GetBrightnessForRender(Entity entity, float partialTicks) { return entity.getBrightnessForRender(partialTicks); } 
	public static Entity GetImmediateDamageSource(DamageSource source) { return source.getEntity(); }
	public static Entity GetTrueDamageSource(DamageSource source) { return source.getSourceOfDamage(); }
	public static void ModPreInit() {}
	public static void ModInit() 
	{
		// Recipes
		ArrayList<RecipeData> recipes = new ArrayList<RecipeData>();
		for(InfoType type : InfoType.infoTypes.values())
		{
			type.GetRecipes(recipes);
			//type.addDungeonLoot();
		}
		for(RecipeData data : recipes)
		{
			AddRecipe(data);
		}
		if(FlansMod.addGunpowderRecipe)
		{
			ItemStack charcoal = new ItemStack(Items.COAL, 1, 1);
			GameRegistry.addShapelessRecipe(new ItemStack(Items.GUNPOWDER), charcoal, charcoal, charcoal, new ItemStack(Items.GLOWSTONE_DUST));
		}
		FlansMod.log.info("Loaded recipes.");
	}
	public static void ModPostInit() {}
	
	public static void AddRecipe(RecipeData data)
	{
		try
		{
			if (!data.shapeless)
			{
				// Fix oversized recipes
				data.Shrink();
				
				int numRows = data.recipeGrid[0].length;
				
				Object[] recipe = new Object[numRows + data.ingredients.length + 2];

				// Add the grid data - "IDI" "III" "ICI" business
				for(int j = 0; j < numRows; j++)
				{
					String row = "";
					for(int i = 0; i < data.recipeGrid.length; i++)
					{
						row += data.recipeGrid[i][j];
					}
					recipe[j] = row;
				}
				
				// Add the lookup
				for (int i = 0; i < (data.ingredients.length - 1) / 2; i++)
				{
					recipe[numRows + i * 2] = data.ingredients[i * 2 + 1].charAt(0);
					recipe[numRows + i * 2 + 1] = InfoType.getRecipeElement(data.ingredients[i * 2 + 2]);
				}
				GameRegistry.addRecipe(data.ret, recipe);
			} 
			else
			{
				Object[] recipe = new Object[data.ingredients.length - 1];
				for (int i = 0; i < (data.ingredients.length - 1); i++)
				{
					recipe[i] = InfoType.getRecipeElement(data.ingredients[i + 1]);
				}
				GameRegistry.addShapelessRecipe(data.ret, recipe);
			}
		} catch (Exception e)
		{
			FlansMod.log.error("Failed to add recipe for : " + data.registryName);
			e.printStackTrace();
		}
	}
	
	/*
	 * We went too far back. I reckon this is for 1.8ish
	public void AddDungeonLoot(InfoType type) 
	{
		if(type.dungeonChance > 0)
		{
			ItemStack stack = new ItemStack(type.item);
			type.AddToRandomChest(stack, (float)(FlansMod.dungeonLootChance * type.dungeonChance) / (float)type.totalDungeonChance);
		}
	}	
	
	private static Random random = new Random();
	
	protected void AddToRandomChest(ItemStack stack, float rawChance)
	{
		if(rawChance >= 1 || random.nextFloat() < rawChance)
		{
			int chance = MathHelper.ceiling_float_int(rawChance);
			switch(random.nextInt(10))
			{
			case 0 : ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new WeightedRandomChestContent(new ItemStack(this.item), 1, 1, chance)); break;
			case 1 : ChestGenHooks.addItem(ChestGenHooks.MINESHAFT_CORRIDOR, new WeightedRandomChestContent(new ItemStack(this.item), 1, 1, chance)); break;
			case 2 : ChestGenHooks.addItem(ChestGenHooks.PYRAMID_DESERT_CHEST, new WeightedRandomChestContent(new ItemStack(this.item), 1, 1, chance)); break;
			case 3 : ChestGenHooks.addItem(ChestGenHooks.PYRAMID_JUNGLE_CHEST, new WeightedRandomChestContent(new ItemStack(this.item), 1, 1, chance)); break;
			case 4 : ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_CORRIDOR, new WeightedRandomChestContent(new ItemStack(this.item), 1, 1, chance)); break;
			case 5 : ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_LIBRARY, new WeightedRandomChestContent(new ItemStack(this.item), 1, 1, chance)); break;
			case 6 : ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_CROSSING, new WeightedRandomChestContent(new ItemStack(this.item), 1, 1, chance)); break;
			case 7 : ChestGenHooks.addItem(ChestGenHooks.VILLAGE_BLACKSMITH, new WeightedRandomChestContent(new ItemStack(this.item), 1, 1, chance)); break;
			case 8 : ChestGenHooks.addItem(ChestGenHooks.BONUS_CHEST, new WeightedRandomChestContent(new ItemStack(this.item), 1, 1, chance)); break;
			case 9 : ChestGenHooks.addItem(ChestGenHooks.NETHER_FORTRESS, new WeightedRandomChestContent(new ItemStack(this.item), 1, 1, chance)); break;
			}
		}
	}
	*/
}
