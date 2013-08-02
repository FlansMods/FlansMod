package co.uk.flansmods.common;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;

public class PartType extends InfoType
{
	public int category;
	public int stackSize;
	public int engineSpeed = 1;
	public int fuel = 0;
	public static PartType defaultEngine;
	private static int lastIconIndex = 0;
	public static List<PartType> parts = new ArrayList<PartType>();

	public PartType(BufferedReader file, String contentPack)
	{
		super(contentPack);
		do
		{
			String line = null;
			try
			{
				line = file.readLine();
			} catch (Exception e)
			{
				break;
			}
			if (line == null)
			{
				break;
			}
			if (line.startsWith("//"))
				continue;
			String[] split = line.split(" ");
			if (split.length < 2)
				continue;
			read(split, file);
		} while (true);
		parts.add(this);
		if (category == 2 && defaultEngine == null)
			defaultEngine = this;
		iconIndex = lastIconIndex++;
	}

	protected void read(String[] split, BufferedReader file)
	{
		super.read(split, file);
		try
		{
			if (split[0].equals("Category"))
				category = getCategory(split[1]);
			if (split[0].equals("StackSize"))
				stackSize = Integer.parseInt(split[1]);
			if (split[0].equals("EngineSpeed"))
				engineSpeed = Integer.parseInt(split[1]);
			if (split[0].equals("Fuel"))
				fuel = Integer.parseInt(split[1]);
		} catch (Exception e)
		{
			System.out.println("Reading part file failed.");
			e.printStackTrace();
		}
	}

	public static PartType getPart(String s)
	{
		for (PartType part : parts)
		{
			if (part.shortName.equals(s))
				return part;
		}
		return null;
	}

	private int getCategory(String s)
	{
		if (s.equals("Cockpit"))
			return 0;
		if (s.equals("Wing"))
			return 1;
		if (s.equals("Engine"))
			return 2;
		if (s.equals("Propeller"))
			return 3;
		if (s.equals("Bay"))
			return 4;
		if (s.equals("Tail"))
			return 5;
		if (s.equals("Wheel"))
			return 6;
		if (s.equals("Chassis"))
			return 7;
		if (s.equals("Turret"))
			return 8;
		if (s.equals("Fuel"))
			return 9;
		if (s.equals("Misc"))
			return 10;
		return 10;
	}
}