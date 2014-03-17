package com.flansmod.common.types;

import java.util.ArrayList;
import java.util.HashMap;

public class TypeFile 
{
	public EnumType type;
	public String name;
	public ArrayList<String> lines;
	public static HashMap<EnumType, ArrayList<TypeFile>> files;
	private int readerPosition = 0;
	
	static
	{
		files = new HashMap<EnumType, ArrayList<TypeFile>>();
		for(EnumType type : EnumType.values())
		{
			files.put(type, new ArrayList<TypeFile>());
		}
		
	}
	
	public TypeFile(EnumType t, String s)
	{
		this(t, s, true);
	}
	
	public TypeFile(EnumType t, String s, boolean addToTypeFileList)
	{
		type = t;
		name = s;
		lines = new ArrayList<String>();
		if(addToTypeFileList)
			files.get(type).add(this);
	}
	
	public String readLine()
	{
		if(readerPosition == lines.size())
			return null;
		return lines.get(readerPosition++);
	}
}