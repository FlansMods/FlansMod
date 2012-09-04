package flan.server;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import net.minecraft.src.CompressedStreamTools;
import net.minecraft.src.DamageSource;
import net.minecraft.src.FlansModHandler;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.NBTTagList;
import net.minecraft.src.NBTTagString;
import net.minecraft.src.SaveHandler;

public class PlayerBaseFlan extends PlayerBase
{
	public PlayerBaseFlan(HexAPI hexapi)
	{
		super(hexapi);
		FlansMod.hapi = hexapi;
	}

	public void beforeReadEntityFromNBT(NBTTagCompound tags)
	{
		if (player.worldObj.isRemote)
			return;
		NBTTagCompound customData = new NBTTagCompound();
		try
		{
			// Load the data
			File file = new File(FlansModHandler.getSaveDirectory(player.worldObj), "Flan.dat");
			customData = CompressedStreamTools.readCompressed(new FileInputStream(file));
			// Fill the unlocks list
			NBTTagList unlocks = customData.getTagList("Unlocks");
			FlansMod.doneTutorial = customData.getBoolean("DoneTutorial");
		} catch (IOException ioexception)
		{
			System.out.println("Failed to read data for Flan's mod. Using defaults.");
		}
	}

	public void afterWriteEntityToNBT(NBTTagCompound tags)
	{
		if (player.worldObj.isRemote)
			return;
		NBTTagCompound customData = new NBTTagCompound();
		NBTTagList unlocks = new NBTTagList();
		customData.setBoolean("DoneTutorial", FlansMod.doneTutorial);

		// Store the data
		try
		{
			File file = new File(FlansModHandler.getSaveDirectory(player.worldObj), "Flan.dat");
			CompressedStreamTools.writeCompressed(customData, new FileOutputStream(file));
		} catch (IOException ioexception)
		{
			ioexception.printStackTrace();
			throw new RuntimeException("Failed to create data for Flan's mod.");
		}
	}

	// To stop players in tanks from taking damage
	public boolean attackEntityFrom(DamageSource var1, int var2)
	{
		return false;
	}

	public EntityMG mountingGun;
}