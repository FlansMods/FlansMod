package com.overminddl1.minecraft.libs.NMT;

import java.util.HashMap;

public final class NMTGlobal
{
	public static final int NMT_DIR_FRONT = 0;
	public static final int NMT_DIR_BACK = 1;
	public static final int NMT_DIR_LEFT = 2;
	public static final int NMT_DIR_RIGHT = 3;
	public static final int NMT_DIR_TOP = 4;
	public static final int NMT_DIR_BOTTOM = 5;
	
	public static final int NMT_SPHERE_LINEAR = 0;
	public static final int NMT_SPHERE_CUBIC = 1;
	public static final int NMT_SPHERE_CYLINDRICAL = 2;
	public static final int NMT_SPHERE_SINUSOIDAL = 3;
	
	public static final float textureMargin = 1/64F;

    public static final String[] NMT_RESOURCE_FOLDER = new String[] {
		"minecraft/resources/models/",
		"minecraft/resources/mod/models/"
};
    
    public static HashMap<String, HashMap<String, NMTModelBase>> NMT_MODEL_DATA = new HashMap<String, HashMap<String, NMTModelBase>>(); 
}
