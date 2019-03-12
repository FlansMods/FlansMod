package com.flansmod.versionhelper;

import com.flansmod.common.FlansMod;

import net.minecraft.item.ItemStack;

public class RecipeData 
{
	public ItemStack ret;
	public boolean shapeless;
	public char[][] recipeGrid;
	public String[] ingredients;
	public String registryName;
	
	public void Shrink()
	{
		int firstX = 3;
		int lastX = -1;
		int firstY = 3;
		int lastY = -1;
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				if(recipeGrid[i][j] != ' ')
				{
					// This cell is filled
					if(i < firstX) firstX = i;
					if(i > lastX) lastX = i;
					if(j < firstY) firstY = j;
					if(j > lastY) lastY = j;
				}
			}
		}
		
		if(firstX == 3 || lastX == -1 || firstY == 3 || lastY == -1)
		{
			FlansMod.log.error("Empty recipe with registry name " + registryName);
			return;
		}
		
		int width = lastX - firstX + 1;
		int height = lastY - firstY + 1;
		
		char[][] newGrid = new char[width][height];
		for(int i = 0; i < width; i++)
		{
			for(int j = 0; j < height; j++)
			{
				newGrid[i][j] = recipeGrid[firstX + i][firstY + j];
			}
		}
		
		recipeGrid = newGrid;
	}
	

}
