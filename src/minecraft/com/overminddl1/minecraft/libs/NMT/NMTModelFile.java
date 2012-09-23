package com.overminddl1.minecraft.libs.NMT;

//import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import net.minecraft.client.Minecraft;
import net.minecraft.src.Tessellator;
import net.minecraft.src.Vec3;

public abstract class NMTModelFile extends NMTModelBase
{
	protected URL modelURL;
	protected String modelName;
	public boolean useGlobalInstance;
	protected boolean[] mirrored;

	public NMTModelFile(NMTModelRenderer nmtmodelrenderer, String mdlFile) throws MalformedURLException
	{
		this(nmtmodelrenderer, new URL(mdlFile));
	}
	
	public NMTModelFile(NMTModelRenderer nmtmodelrenderer, URL mdlURL)
	{
		super(nmtmodelrenderer);
		modelURL = checkValidPath(mdlURL);
		modelName = mdlURL.toString();
		useGlobalInstance = true;
		mirrored = new boolean[3];
	}
	
	public void render(Tessellator tessellator, float scale)
	{
		boolean isMirrored = useGlobalInstance && (mirrored[0] || mirrored[1] || mirrored[2]); 
		if(isMirrored)
		{
			super.doMirror(mirrored[0], mirrored[1], mirrored[2]);
		}
		super.render(tessellator, scale);
		if(isMirrored)
		{
			super.doMirror(mirrored[0], mirrored[1], mirrored[2]);
		}
	}
	
	public NMTModelFile setToCopy()
	{
		useGlobalInstance = false;
		return this;
	}
	
	protected URL checkValidPath(URL url)
	{
		String path = url.getPath();
		String[] fileExtensions = getExtensions();
		
		for(String ext: fileExtensions)
		{
			if(path.endsWith(ext)) return url;
		}
		return null;
	}
	
	public NMTModelBase create()
	{
		if(!NMTGlobal.NMT_MODEL_DATA.containsKey(getModelFormat()))
		{
			NMTGlobal.NMT_MODEL_DATA.put(getModelFormat(), new HashMap<String, NMTModelBase>());
		}
		HashMap<String, NMTModelBase> fileMap = NMTGlobal.NMT_MODEL_DATA.get(getModelFormat());
		if(!fileMap.containsKey(modelName))
		{
			System.out.println("Loading model file " + modelName + " using " + getModelFormat());
			fileMap.put(modelName, getInstance().parseFile());
		}
		NMTModelBase baseModel = fileMap.get(modelName);
		
		if(!useGlobalInstance)
		{
			copyModel(baseModel);
		}
		else
		{
			useDataFromGlobalInstance(baseModel);
		}
		
		return this;
	}
	
	protected void copyModel(NMTModelBase baseModel)
	{
		HashMap<NMTVertex, NMTVertex> vertMap = new HashMap<NMTVertex, NMTVertex>();
		for(int idx = 0; idx < baseModel.vertices.size(); idx++)
		{
			NMTVertex vert = baseModel.vertices.get(idx).copyVertex();
			vertices.add(vert);
			vertMap.put(baseModel.vertices.get(idx), vert);
		}
		for(int idx = 0; idx < baseModel.polygons.size(); idx++)
		{
			ArrayList<NMTTextureVertex> verts = new ArrayList<NMTTextureVertex>();
			NMTPolygon basePoly = baseModel.polygons.get(idx);
			for(int idy = 0; idy < basePoly.vertices.size(); idy++)
			{
				NMTTextureVertex texVert = basePoly.vertices.get(idy);
				Vec3 normal = null;
				if(texVert.normal != null)
				{
					normal = Vec3.createVectorHelper(texVert.normal.xCoord, texVert.normal.yCoord, texVert.normal.zCoord);
				}
				NMTTextureVertex tV = new NMTTextureVertex(vertMap.get(texVert.vertex), texVert.textureU, texVert.textureV, normal);
				tV.textured = texVert.textured;
				verts.add(tV);
			}
			NMTPolygon poly = new NMTPolygon(verts);
			poly.indivNormal = basePoly.indivNormal;
			poly.invertNormal = basePoly.invertNormal;
			poly.recalcNormal = basePoly.recalcNormal;
			poly.textured = basePoly.textured;
			polygons.add(poly);
		}
	}
	
	protected void useDataFromGlobalInstance(NMTModelBase baseModel)
	{
		vertices = baseModel.vertices;
		polygons = baseModel.polygons;
	}
	
	public void doMirror(boolean x, boolean y, boolean z)
	{
		if(!useGlobalInstance)
		{
			super.doMirror(x, y, z);
		}
		else
		{
			mirrored = new boolean[] {x, y, z};
		}
	}
	
	protected abstract NMTModelFile getInstance();
	
	protected abstract NMTModelFile parseFile();
	
	protected abstract String[] getExtensions();
	
	protected abstract String getModelFormat();
}
