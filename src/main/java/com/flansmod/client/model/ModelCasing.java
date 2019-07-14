package com.flansmod.client.model;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelCasing extends ModelBase
{
    public ModelRendererTurbo[] casingModel = new ModelRendererTurbo[0];


    public void renderCasing(float f)
    {
        for(ModelRendererTurbo model : casingModel)
            if(model != null)
                model.render(f);
    }

    protected void flipAll()
    {
        for (ModelRendererTurbo casing : casingModel)
        {
            casing.doMirror(false, true, true);
            casing.setRotationPoint(casing.rotationPointX, -casing.rotationPointY, -casing.rotationPointZ);
        }
    }
}
