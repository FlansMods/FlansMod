package com.overminddl1.minecraft.libs.NMT;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

import net.minecraft.src.Vec3;

public class NMTModelFileOBJ extends NMTModelFile
{
	private ArrayList<Vec3> normal;
	private ArrayList<Float[]> texCoord;
	public ArrayList<NMTKeyframe> keyframeList;
		
	public NMTModelFileOBJ(NMTModelRenderer nmtmodelrenderer, String mdlFile) throws IllegalStateException, IOException
	{
		super(nmtmodelrenderer, mdlFile);
		normal = new ArrayList<Vec3>();
		texCoord = new ArrayList<Float[]>();
	}
	
	protected NMTModelFile getInstance()
	{
		try
		{
			return new NMTModelFileOBJ(renderer, modelName);
		}
		catch (IllegalStateException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	protected String[] getExtensions()
	{
		return new String[] {"obj"};
	}
	
	protected String getModelFormat()
	{
		return "Wavefront OBJ";
	}
	
	public NMTModelFile parseFile()
	{
		if(modelURL == null)
		{
			return this;
		}
		
		try
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(modelURL.openStream()));
			
			String s;
			String parse;
			String[] p;
			
			while((s = in.readLine()) != null)
			{
				if(s.indexOf("#") > -1)
				{
					s = s.substring(0, s.indexOf("#"));
				}
				
				s = s.trim();
				
				if(s.equals(""))
					continue;

				parse = s.substring(s.indexOf(" ") + 1).trim();
				parse = parse.replaceAll("  ", " ");
				parse = parse.replaceAll("	", "");
				p = parse.split(" ");
				
				if(s.startsWith("v "))
				{
					vertices.add(parseVertex(p));
				}
				else if(s.startsWith("vt "))
				{
					texCoord.add(parseTexCoords(p));
				}
				else if(s.startsWith("vn "))
				{
					normal.add(parseNormal(p));
				}
				else if(s.startsWith("f "))
				{
					polygons.add(parseFace(p));
				}
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found " + modelURL.toString());
			return this;
		}
		catch(IOException e)
		{
			System.out.println("Error opening file " + modelURL.toString());
			return this;
		}
		
		return this;
	}
	
	private NMTVertex parseVertex(String[] s)
	{
		float[] v = new float[3];
		
		v[0] = Float.parseFloat(s[0]);
		v[1] = -Float.parseFloat(s[2]);
		v[2] = Float.parseFloat(s[1]);

		return new NMTVertex(v[0], v[1], v[2]);
	}
	
	private Float[] parseTexCoords(String[] s)
	{
		Float[] vt = new Float[2];
		vt[0] = Float.parseFloat(s[0]);
		vt[1] = 0.0F;
		
		if(s.length > 1)
		{
			vt[1] = Float.parseFloat(s[1]);
		}
		
		return vt;
	}
	
	private Vec3 parseNormal(String[] s)
	{
		float[] vn = new float[3];
		
		vn[0] = Float.parseFloat(s[0]);
		vn[1] = -Float.parseFloat(s[2]);
		vn[2] = Float.parseFloat(s[1]);
		
		return Vec3.createVectorHelper(vn[0], vn[1], vn[2]);
	}
	
	private NMTPolygon parseFace(String[] s)
	{
		ArrayList<NMTTextureVertex> verts = new ArrayList<NMTTextureVertex>();
		
		boolean polyTextured = true;
		boolean polyIndNormal = false;
		
		for(int idx = 0; idx < s.length; idx++)
		{
			String[] p = s[idx].split("/");
			
			Float[] vt = new Float[] {0.0F, 0.0F};
			Vec3 vn = null;
			boolean textured = false;
			
			int vInd = Integer.parseInt(p[0]) - 1;
			
			if(p.length > 1 && !p[1].equals(""))
			{
				int vtInd = Integer.parseInt(p[1]) - 1;
				if(vtInd < texCoord.size())
				{
					vt = texCoord.get(vtInd);
					textured = true;
				}
			}
			if(p.length > 2)
			{
				vn = normal.get(Integer.parseInt(p[2]) - 1);
				polyIndNormal = true;
			}
			else if(vInd < normal.size())
			{
				vn = normal.get(vInd);
				polyIndNormal = true;
			}
			
			NMTTextureVertex vert = new NMTTextureVertex(vertices.get(vInd), vt[0], vt[1], vn);
			vert.textured = textured;
			verts.add(vert);
			
			polyTextured = (polyTextured && textured);
		}
		
		NMTPolygon poly = new NMTPolygon(verts);
		poly.textured = polyTextured;
		poly.indivNormal = polyIndNormal;
		
		return poly;
	}
}
