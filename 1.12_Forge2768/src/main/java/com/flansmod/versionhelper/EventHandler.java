package com.flansmod.versionhelper;

import java.util.ArrayList;
import java.util.HashMap;

import com.flansmod.common.FlansMod;
import com.flansmod.common.tools.ToolType;
import com.flansmod.common.types.InfoType;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.util.NonNullList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class EventHandler
{
	@SubscribeEvent
	public void registerRecipes(RegistryEvent.Register<IRecipe> event)
	{
		FlansMod.log.info("Registering Recipes.");
		
		// Recipes
		ArrayList<RecipeData> recipes = new ArrayList<RecipeData>();
		for(InfoType type : InfoType.infoTypes.values())
		{
			type.GetRecipes(recipes);
		}
		for(RecipeData data : recipes)
		{
			AddRecipe(event.getRegistry(), data);
		}
		
		
		if(FlansMod.addGunpowderRecipe)
		{
			NonNullList<Ingredient> ingredients = NonNullList.create();
			ingredients.add(Ingredient.fromStacks(new ItemStack(Items.GLOWSTONE_DUST)));
			ingredients.add(Ingredient.fromStacks(new ItemStack(Items.COAL, 1, 1)));
			ingredients.add(Ingredient.fromStacks(new ItemStack(Items.COAL, 1, 1)));
			ingredients.add(Ingredient.fromStacks(new ItemStack(Items.COAL, 1, 1)));
			
			event.getRegistry().register(new ShapelessRecipes("FlansMod", new ItemStack(Items.GUNPOWDER), ingredients).setRegistryName("FM_Gunpowder"));
		}
		
		// Add the two workbench recipes
		{
			// ICI C = Cauldron
			// III I = Iron ingot
			NonNullList<Ingredient> ingredients = NonNullList.create();
			ingredients.add(Ingredient.fromStacks(new ItemStack(Items.IRON_INGOT)));
			ingredients.add(Ingredient.fromStacks(new ItemStack(Items.CAULDRON)));
			for(int i = 0; i < 4; i++)
				ingredients.add(Ingredient.fromStacks(new ItemStack(Items.IRON_INGOT)));
			
			event.getRegistry().register(new ShapedRecipes("FlansMod", 3, 2, ingredients, new ItemStack(FlansMod.workbench, 1, 1)).setRegistryName("FM_Workbench"));
		}
		{
			// BBB B = Bowl
			// III I = Iron ingot
			// III
			NonNullList<Ingredient> ingredients = NonNullList.create();
			for(int i = 0; i < 3; i++)
				ingredients.add(Ingredient.fromStacks(new ItemStack(Items.BOWL)));
			for(int i = 0; i < 6; i++)
				ingredients.add(Ingredient.fromStacks(new ItemStack(Items.IRON_INGOT)));
			
			event.getRegistry().register(new ShapedRecipes("FlansMod", 3, 3, ingredients, new ItemStack(FlansMod.workbench, 1, 0)).setRegistryName("FM_Workbench2"));
		}
	}
	
	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event)
	{
		FlansMod.log.info("Registering Items");
		
		ArrayList<Item> itemsToRegister = new ArrayList<Item>();
		for(InfoType type : InfoType.infoTypes.values())
		{
			type.GetItemsForRegistration(itemsToRegister);
		}
		for(Item item : itemsToRegister)
		{
			event.getRegistry().register(item);
		}
		
		event.getRegistry().register(FlansMod.rainbowPaintcan); //, "rainbowPaintcan", MODID);
		event.getRegistry().register(FlansMod.opStick); //, "opStick", MODID);
		event.getRegistry().register(FlansMod.flag); //, "flagpole", MODID);
		
		event.getRegistry().register(FlansMod.workbenchItem);
		event.getRegistry().register(FlansMod.spawnerItem);
	}
	
	@SubscribeEvent
	public void registerBlocks(RegistryEvent.Register<Block> event)
	{
		FlansMod.log.info("Registering Blocks");
		
		ArrayList<Block> blocksToRegister = new ArrayList<Block>();
		for(InfoType type : InfoType.infoTypes.values())
		{
			type.GetBlocksForRegistration(blocksToRegister);
		}
		for(Block block : blocksToRegister)
		{
			event.getRegistry().register(block);
		}
		
		
		event.getRegistry().register(FlansMod.workbench);//, ItemBlockManyNames.class, "flansWorkbench");
		event.getRegistry().register(FlansMod.spawner); // ItemBlockManyNames.class, "teamsSpawner");
		event.getRegistry().register(FlansMod.paintjobTable); //, "paintjobTable");
	}
	
	private void AddRecipe(IForgeRegistry<IRecipe> registry, RecipeData data)
	{		
		try
		{
			if(!data.shapeless)
			{
				// Find the smallest bounding grid
				int minX = 3, minY = 3, maxX = -1, maxY = -1;
				
				for(int i = 0; i < 3; i++)
				{
					for(int j = 0; j < 3; j++)
					{
						if(data.recipeGrid[i][j] != ' ')
						{
							// This is a valid element. Adjust bounds accordingly
							if(i < minX)
								minX = i;
							if(i > maxX)
								maxX = i;
							if(j < minY)
								minY = j;
							if(j > maxY)
								maxY = j;
						}
					}
				}
				
				// Make the recipe square
				if(maxX != maxY)
				{
					maxX = maxY = Math.max(maxX, maxY);
				}
				if(minX != minY)
				{
					minX = minY = Math.min(minX, minY);
				}
				
				if((minX == 3 && maxX == -1) || (minY == 3 && maxY == -1))
				{
					FlansMod.log.warn("Invalid recipe grid in " + data.registryName);
					return;
				}
				
				int width = maxX - minX + 1;
				int height = maxY - minY + 1;
				
				// Make a menu of ingredients from the main recipe line
				HashMap<Character, ItemStack> menu = new HashMap<Character, ItemStack>();
				for(int i = 0; i < (data.ingredients.length - 1) / 2; i++)
				{
					char c = data.ingredients[i * 2 + 1].charAt(0);
					ItemStack stack = InfoType.getRecipeElement(data.ingredients[i * 2 + 2]);
					
					menu.put(c, stack);
				}
				
				// Now pick off the menu and fill out the list
				NonNullList<Ingredient> ingredients = NonNullList.create();
				for(int i = 0; i < width; i++)
				{
					for(int j = 0; j < height; j++)
					{
						char c = data.recipeGrid[minX + i][minY + j];
						if(c == ' ')
						{
							ingredients.add(Ingredient.fromStacks(ItemStack.EMPTY.copy()));
						}
						else
						{
							ItemStack stack = menu.get(c);
							if(stack == null || stack.isEmpty())
							{
								FlansMod.log.warn("Failed to find " + c + " in recipe for " + data.registryName);
								// This recipe is BORK. Kill it
								return;
							}
							ingredients.add(Ingredient.fromStacks(stack.copy()));
						}
					}
				}
				// And finally hand all that over to the registry
				registry.register(new ShapedRecipes("FlansMod", width, height, ingredients, data.ret).setRegistryName(data.registryName));
			}
			else
			{
				NonNullList<Ingredient> ingredients = NonNullList.create();
				for(int i = 0; i < (data.ingredients.length - 1); i++)
				{
					ingredients.add(Ingredient.fromStacks(InfoType.getRecipeElement(data.ingredients[i + 1])));
				}
				
				registry.register(new ShapelessRecipes("FlansMod", data.ret, ingredients).setRegistryName(data.registryName));
			}
		}
		catch(Exception e)
		{
			FlansMod.log.error("Failed to add recipe for : " + data.registryName);
			FlansMod.log.throwing(e);
		}
	}
}
