package com.flansmod.common.guns;

public interface IScope 
{
	public float getFOVFactor();
	
	public float getZoomFactor();
	
	public boolean hasZoomOverlay();
	
	public String getZoomOverlay();
}
