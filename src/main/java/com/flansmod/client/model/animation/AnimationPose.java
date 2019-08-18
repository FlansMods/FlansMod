package com.flansmod.client.model.animation;

import java.util.ArrayList;

import com.flansmod.client.model.animation.AnimationPart;
import com.flansmod.common.vector.Vector3f;

import net.minecraft.item.ItemStack;

public class AnimationPose {
	
	ArrayList<PoseComponent> parts = new ArrayList<PoseComponent>();;
	
	
	public PoseComponent getComponentWithName(String name)
	{
		PoseComponent part = new PoseComponent("nope", null, null, 0, 0, false);
		for(PoseComponent p : parts){
			if(p.name.equals(name)) part = p;
		}
		return part;
	}
}
