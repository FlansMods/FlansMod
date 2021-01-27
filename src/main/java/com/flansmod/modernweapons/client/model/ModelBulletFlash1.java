package com.flansmod.modernweapons.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBulletFlash1 extends ModelBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelBulletFlash1()
	{
		bulletflash1Model = new ModelRendererTurbo[3];
		bulletflash1Model[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Import
		bulletflash1Model[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Import
		bulletflash1Model[2] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Import

		bulletflash1Model[0].addBox(-1.5F, 0F, -1.5F, 34, 1, 34, 0F); // Import Import
		bulletflash1Model[0].setRotationPoint(-16F, -22F, -17F);

		bulletflash1Model[1].addTrapezoid(-2F, 1F, -2F, 4, 22, 4, 0F, -1F, ModelRendererTurbo.MR_TOP); // Import Import
		bulletflash1Model[1].setRotationPoint(0F, -22F, -2F);

		bulletflash1Model[2].addTrapezoid(-2F, 4F, -2F, 4, 16, 4, 0F, -1F, ModelRendererTurbo.MR_BOTTOM); // Import Import
		bulletflash1Model[2].setRotationPoint(0F, -3F, -2F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 3; i++)
		{
			bulletflash1Model[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo bulletflash1Model[];
}