package com.flansmod.common.teams;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;

public class PermanentBaseData
{
	public int baseID = 0;
	public List<BlockPos> spawnPoints = new ArrayList<>();
	public int teamID = 0;
	
	public void writeBaseToNBT(NBTTagCompound tags)
	{
		tags.setInteger("NumObjects", spawnPoints.size());
		for(int i = 0; i < spawnPoints.size(); i++)
		{
			BlockPos pos = spawnPoints.get(i);
			NBTTagCompound objectTags = new NBTTagCompound();
			objectTags.setDouble("x", pos.getX());
			objectTags.setDouble("y", pos.getY());
			objectTags.setDouble("z", pos.getZ());
			tags.setTag("SP_" + i, objectTags);
		}
	}
	
	public void readBaseFromNBT(NBTTagCompound tags)
	{
		int iNumObj = tags.getInteger("NumObjects");
		for(int i = 0; i < iNumObj; i++)
		{
			NBTTagCompound objectTags = tags.getCompoundTag("SP_" + i);
			spawnPoints.add(new BlockPos(objectTags.getDouble("x"), objectTags.getDouble("y"), objectTags.getDouble("z")));
		}
	}
	
	public void addObject(ITeamObject object)
	{
		BlockPos objPos = new BlockPos(object.getPosX(), object.getPosY(), object.getPosZ());
		for(BlockPos pos : spawnPoints)
		{
			if(pos.equals(objPos))
				return;
		}
		spawnPoints.add(objPos);
	}
	
}
