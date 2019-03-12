package com.flansmod.common.guns;

public interface IScope
{
	float getFOVFactor();
	
	float getZoomFactor();
	
	boolean hasZoomOverlay();
	
	String getZoomOverlay();
}
