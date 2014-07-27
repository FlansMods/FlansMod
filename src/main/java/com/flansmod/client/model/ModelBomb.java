package com.flansmod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelBomb extends ModelBase
{
    public ModelBomb()
    {
        bombModel = new ModelRendererTurbo[4];	
		
	    bombModel[0] = new ModelRendererTurbo(this, 104, 0, 128, 64);
        bombModel[1] = new ModelRendererTurbo(this, 104, 0, 128, 64);
		
        bombModel[2] = new ModelRendererTurbo(this, 56, 8, 128, 64);
        bombModel[3] = new ModelRendererTurbo(this, 56, 8, 128, 64);
	
		bombModel[0].addTrapezoid(-2F, 0F, -2F, 4, 1, 4, 0.0F, 1.0F, ModelRendererTurbo.MR_TOP);
		bombModel[1].addBox(-2F, 1F , -2F, 4, 6, 4, 0.0F);	
        bombModel[2].addTrapezoid(-2F, 7F, -2F, 4, 1, 4, 0.0F, 1.0F, ModelRendererTurbo.MR_BOTTOM);
        bombModel[3].addBox(-2F, 8F, -2F, 4, 2, 4, 0.0F);		
    }

    @Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 4; i++)
        {
            bombModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo bombModel[];
}
