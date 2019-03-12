package com.flansmod.common.teams;

import java.util.ArrayList;
import java.util.HashMap;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.Paintjob;
import com.flansmod.common.types.EnumPaintjobRarity;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.PaintableType;
import com.flansmod.common.types.TypeFile;

public class RewardBox extends InfoType
{
	// -------------------------------------------------------------------------------------------------------------------------------------
	// To anyone planning to add to this file in future, remember that the Minecraft EULA forbids monetization of any non-cosmetic additions
	// -------------------------------------------------------------------------------------------------------------------------------------
	public ArrayList<Paintjob> paintjobs = new ArrayList<>();
	public float[] weightPerRarity = new float[]{1.0f, 1.0f, 1.0f, 1.0f, 1.0f};
	
	private static HashMap<Integer, RewardBox> boxes = new HashMap<>();
	
	public RewardBox(TypeFile file)
	{
		super(file);
	}
	
	@Override
	protected void postRead(TypeFile file)
	{
		boxes.put(hashCode(), this);
	}
	
	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		
		if(KeyMatches(split, "AddPaintjob"))
		{
			PaintableType type = PaintableType.GetPaintableType(split[2].hashCode());
			if(type == null)
			{
				FlansMod.Assert(false, "Invalid type: " + split[2] + " when reading " + shortName);
				return;
			}
			Paintjob paintjob = type.getPaintjob(split[3]);
			if(paintjob == null)
			{
				FlansMod.Assert(false, "Invalid paintjob: " + split[3] + " when reading " + shortName);
				return;
			}
			paintjob.rarity = GetRarity(split[1]);
			
			paintjobs.add(paintjob);
		}
		else if(KeyMatches(split, "RarityWeight"))
		{
			EnumPaintjobRarity rarity = GetRarity(split[1]);
			float weight = Float.parseFloat(split[2]);
			weightPerRarity[rarity.ordinal()] = weight;
		}
	}
	
	private EnumPaintjobRarity GetRarity(String split)
	{
		if(split.toLowerCase().equals("common")) return EnumPaintjobRarity.COMMON;
		if(split.toLowerCase().equals("uncommon")) return EnumPaintjobRarity.UNCOMMON;
		if(split.toLowerCase().equals("rare")) return EnumPaintjobRarity.RARE;
		if(split.toLowerCase().equals("legendary")) return EnumPaintjobRarity.LEGENDARY;
		FlansMod.Assert(false, "Unknown rarity entered for reward box");
		return EnumPaintjobRarity.UNKNOWN;
	}
	
	public int GetReward(PlayerRankData data)
	{
		float totalWeight = 0.0f;
		for(Paintjob paintjob1 : paintjobs)
		{
			totalWeight += weightPerRarity[paintjob1.rarity.ordinal()];
		}
		float pick = FlansMod.Pick(totalWeight);
		for(Paintjob paintjob : paintjobs)
		{
			pick -= weightPerRarity[paintjob.rarity.ordinal()];
			if(pick <= 0.0f)
			{
				return paintjob.hashCode();
			}
		}
		
		FlansMod.Assert(false, "How did we not pick something?");
		return 0;
	}
	
	public static RewardBox GetRewardBox(int boxHash)
	{
		return boxes.get(boxHash);
	}
	
	public static RewardBox GetRewardBox(String string)
	{
		return GetRewardBox(string.hashCode());
	}
}
