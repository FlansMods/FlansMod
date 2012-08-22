package net.minecraft.src;

import java.io.File;

public class FlansModHandler {
	
	public static File getSaveDirectory(World world)
	{
		return ((SaveHandler)world.getSaveHandler()).getSaveDirectory();
	}

}
