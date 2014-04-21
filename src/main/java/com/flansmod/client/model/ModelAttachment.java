package com.flansmod.client.model;

import com.flansmod.client.tmt.ModelRendererTurbo;

import net.minecraft.client.model.ModelBase;

public class ModelAttachment extends ModelBase 
{
	public ModelRendererTurbo[] attachmentModel = new ModelRendererTurbo[0];
	
	/** For big scopes, so that the player actually looks through them properly */
	public float renderOffset = 0F;
	
	public void renderAttachment(float f)
	{
		for(ModelRendererTurbo model : attachmentModel)
			if(model != null)
				model.render(f);
	}

	public void flipAll()
	{
		for(int i = 0; i < attachmentModel.length; i++)
		{
			attachmentModel[i].doMirror(false, true, true);
			attachmentModel[i].setRotationPoint(attachmentModel[i].rotationPointX, - attachmentModel[i].rotationPointY, - attachmentModel[i].rotationPointZ);
		}
	}
}
