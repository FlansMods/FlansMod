package com.overminddl1.minecraft.libs.NMT;

import java.util.ArrayList;

import net.minecraft.src.MathHelper;
import net.minecraft.src.Vec3;

public class NMTModelSphere extends NMTModelBase
{
	private float xPos;
	private float yPos;
	private float zPos;
	private float radius;
	private int slice;
	private int stack;
	private int textureW;
	private int textureH;
	private boolean calcNormals;
	private int mapping;
	private float texW;
	private float texH;
	private float segW;
	private float segH;
	private float startU;
	private float startV;

	private static float pi = (float)Math.PI;

	public NMTModelSphere(NMTModelRenderer nmtmodelrenderer, float x, float y, float z, float r, int slices, int stacks, int tW, int tH)
	{
		this(nmtmodelrenderer, x, y, z, r, slices, stacks, tW, tH, false);
	}

	public NMTModelSphere(NMTModelRenderer nmtmodelrenderer, float x, float y, float z, float r, int slices, int stacks, int tW, int tH, int mappingUsed)
	{
		this(nmtmodelrenderer, x, y, z, r, slices, stacks, tW, tH, false, mappingUsed);
	}

	public NMTModelSphere(NMTModelRenderer nmtmodelrenderer, float x, float y, float z, float r, int slices, int stacks, int tW, int tH, boolean cN)
	{
		this(nmtmodelrenderer, x, y, z, r, slices, stacks, tW, tH, cN, NMTGlobal.NMT_SPHERE_LINEAR);
	}
	
	public NMTModelSphere(NMTModelRenderer nmtmodelrenderer, float x, float y, float z, float r, int slices, int stacks, int tW, int tH, boolean cN, int mappingUsed)
	{
		super(nmtmodelrenderer);
		xPos = x;
		yPos = y;
		zPos = z;
		radius = r;
		slice = slices;
		if(slice < 3)
		{
			slice = 3;
		}
		stack = stacks;
		if(stack < 1)
		{
			stack = 1;
		}
		textureW = tW;
		textureH = tH;
		calcNormals = cN;
		mapping = mappingUsed;
		
    	texW = ((float) textureW / (float)renderer.textureWidth) - (2F * NMTGlobal.textureMargin);
    	texH = ((float) textureH / (float)renderer.textureHeight) - (2F * NMTGlobal.textureMargin);
    	segW = texW / (float) slice;
    	segH = texH / (float) (stack + 1);
    	startU = ((float) renderer.textureU / (float) renderer.textureWidth) + NMTGlobal.textureMargin;
    	startV = ((float) renderer.textureV / (float) renderer.textureHeight) + NMTGlobal.textureMargin;

	}
	
	@Override
	public NMTModelBase create()
	{
		NMTVertex vert = new NMTVertex(xPos, yPos - radius, zPos);
		if(calcNormals)
		{
			vert.setNormals(Vec3.createVectorHelper(0, -1, 0));
		}
		vertices.add(vert);
		
		int[] verts;
		
		for(int j = 0; j < stack; j++)
		{
			for(int i = 0; i < slice; i++)
			{
    			float yWidth = MathHelper.cos(-pi / 2 + (pi / (float)(stack + 1)) * (float) (j + 1));
    			float yHeight = MathHelper.sin(-pi / 2 + (pi / (float)(stack + 1)) * (float) (j + 1));
    			float xSize = MathHelper.sin((pi / (float)slice) * i * 2F + pi) * yWidth;
    			float zSize = -MathHelper.cos((pi / (float)slice) * i * 2F + pi) * yWidth;
    			
    			vert = new NMTVertex(xPos + xSize * radius * (renderer.mirror ? -1 : 1), yPos + yHeight * radius, zPos + zSize * radius);
    			if(calcNormals)
    			{
    				vert.setNormals(Vec3.createVectorHelper(xSize * (renderer.mirror ? -1 : 1), yHeight, zSize));
    			}
    			vertices.add(vert);
    			if(i > 0)
    			{
    				verts = new int[4];
    				verts[2] = i + j * slice;
    				verts[3] = verts[2] + 1;
    				verts[0] = verts[2] - slice;
    				verts[1] = verts[0] + 1;
    				if(j == 0)
    				{
    					verts[0] = 0;
    					verts[1] = 0;
    				}
    				
    				float[] uv = getTexCoords(i, j);
    				addQuad(verts[1], verts[0], verts[2], verts[3], uv[0], uv[1], uv[2], uv[3]);
    			}
			}
			verts = new int[4];
			verts[0] = slice * j;
			verts[2] = verts[0] + slice;
			verts[3] = verts[0] + 1;
			verts[1] = verts[3] - slice;
			if(j == 0)
			{
				verts[0] = 0;
				verts[1] = 0;
			}
			float[] uv = getTexCoords(slice, j);
			addQuad(verts[1], verts[0], verts[2], verts[3], uv[0], uv[1], uv[2], uv[3]);
		}
		
		vert = new NMTVertex(xPos, yPos + radius, zPos);
		if(calcNormals)
		{
			vert.setNormals(Vec3.createVectorHelper(0, 1, 0));
		}
		vertices.add(vert);
		
		int j = vertices.size() - 1;
		
		for(int i = 0; i < slice; i++)
		{
			verts = new int[4];
			verts[0] = j - slice + i;
			verts[1] = j - slice + ((i + 1) % slice);
			verts[2] = j;
			verts[3] = j;
			float[] uv = getTexCoords(i + 1, stack);
			addQuad(verts[1], verts[0], verts[2], verts[3], uv[0], uv[1], uv[2], uv[3]);
		}
		
		if(renderer.mirror)
		{
			flipFaces();
		}
		if(calcNormals)
		{
			for(int i = 0; i < polygons.size(); i++)
			{
				polygons.get(i).indivNormal = true;
			}
		}
    	
		return this;
	}
	
	protected float[] getTexCoords(int cSlice, int cStack)
	{
		float[] coords = new float[4];
		
		switch(mapping)
		{
		case NMTGlobal.NMT_SPHERE_CUBIC:
			int tSt = stack + 1;
			int center = (int)Math.ceil((double)stack / 2F);
			int poles = (int)Math.floor((double)(tSt - center) / 2F);
			center += tSt - center - (2 * poles);
			
			if(cStack < poles)
			{
				float xC = texW * 0.375F;
				float yC = texH / 4F;
				float tW = texW / 8F;
				float tH = yC;
				float x1 = -(float)Math.sin((pi / (float)slice) * 2F * (float)(cSlice - 1));
				float y1 = (float)Math.cos((pi / (float)slice) * 2F * (float)(cSlice - 1));
				float x2 = -(float)Math.sin((pi / (float)slice) * 2F * (float)(cSlice % slice));
				float y2 = (float)Math.cos((pi / (float)slice) * 2F * (float)(cSlice % slice));
				float s1 = (float)cStack / (float)poles;
				float s2 = (float)(cStack + 1) / (float)poles;
				float l1 = Math.abs(y1);
				float l2 = Math.abs(y2);
				if(Math.abs(x1) > l1)
				{
					l1 = Math.abs(x1);
				}
				if(Math.abs(x2) > l2)
				{
					l2 = Math.abs(x2);
				}
				
				x1 = (x1 / l1) * s1;
				y1 = (y1 / l1) * s1;
				x2 = (x2 / l2) * s2;
				y2 = (y2 / l2) * s2;
				
				coords[0] = startU + xC + x1 * tW;
				coords[1] = startV + yC + y1 * tH;
				coords[2] = startU + xC + x2 * tW;
				coords[3] = startV + yC + y2 * tH;
			}
			else if(cStack < center + poles)
			{
				float tS = texH / 2F;
				float tW = texW;
				float tH = tS;
				float x1;
				float x2;
				int sBr = (int)Math.floor((double)slice / 8D);
				if(slice < 8)
				{
					tW*= 0.75;
					x1 = tW * (float)(cSlice - 1) / (float)slice;
					x2 = tW * (float)cSlice / (float)slice;
				}
				else if(cSlice > sBr)
				{
					tW *= 0.875F;
					x1 = tW * (float)(cSlice - sBr - 1) / (float)(slice - sBr);
					x2 = tW * (float)(cSlice - sBr) / (float)(slice - sBr);
				}
				else
				{
					x1 = tW * 0.875F + (tW * 0.125F * (float)(cSlice - 1)/(float)sBr);
					x2 = tW * 0.875F + (tW * 0.125F * (float)cSlice/(float)sBr);
				}
				
				float s1 = (float)(cStack - poles) / (float)center;
				float s2 = (float)(cStack + 1 - poles) / (float)center;
				
				coords[0] = startU + x1;
				coords[1] = startV + tS + tH * s1;
				coords[2] = startU + x2;
				coords[3] = startV + tS + tH * s2;
			}
			else
			{
				float xC = texW * 0.625F;
				float yC = texH / 4F;
				float tW = texW / 8F;
				float tH = yC;
				float x1 = -(float)Math.sin((pi / (float)slice) * 2F * (float)(cSlice - 1));
				float y1 = (float)Math.cos((pi / (float)slice) * 2F * (float)(cSlice - 1));
				float x2 = -(float)Math.sin((pi / (float)slice) * 2F * (float)(cSlice % slice));
				float y2 = (float)Math.cos((pi / (float)slice) * 2F * (float)(cSlice % slice));
				float s1 = (float)((stack - cStack) + 1) / (float)poles;
				float s2 = (float)(stack - cStack) / (float)poles;
				float l1 = Math.abs(y1);
				float l2 = Math.abs(y2);
				if(Math.abs(x1) > l1)
				{
					l1 = Math.abs(x1);
				}
				if(Math.abs(x2) > l2)
				{
					l2 = Math.abs(x2);
				}
				
				x1 = (x1 / l1) * s1;
				y1 = (y1 / l1) * s1;
				x2 = (x2 / l2) * s2;
				y2 = (y2 / l2) * s2;
				
				coords[0] = startU + xC + x1 * tW;
				coords[1] = startV + yC + y1 * tH;
				coords[2] = startU + xC + x2 * tW;
				coords[3] = startV + yC + y2 * tH;
			}
			break;
		case NMTGlobal.NMT_SPHERE_CYLINDRICAL:
			float yH1 = MathHelper.sin(-pi / 2 + (pi / (float)(stack + 1)) * (float)cStack);
			float yH2 = MathHelper.sin(-pi / 2 + (pi / (float)(stack + 1)) * (float) (cStack + 1));
			
			yH1 = (yH1 + 1F) / 2F;
			yH2 = (yH2 + 1F) / 2F;
			
			coords[0] = startU + (float)(cSlice - 1) * segW;
			coords[1] = startV + yH1 * texH;
			coords[2] = startU + (float)(cSlice) * segW;
			coords[3] = startV + yH2 * texH;
			break;
		case NMTGlobal.NMT_SPHERE_SINUSOIDAL:
			float yW1 = MathHelper.cos(-pi / 2 + (pi / (float)(stack + 1)) * (float) cStack);
			float yW2 = MathHelper.cos(-pi / 2 + (pi / (float)(stack + 1)) * (float) (cStack + 1));
			
			float s1 = (1 - yW1) * texW / 2F;
			float s2 = (1 - yW2) * texW / 2F;
			
			coords[0] = startU + s1 + (float)(cSlice - 1) * segW * yW1;
			coords[1] = startV + (float)cStack * segH;
			coords[2] = startU + s2 + (float)(cSlice) * segW * yW2;
			coords[3] = startV + (float)(cStack + 1) * segH;
			break;			
		default:
			coords[0] = startU + (float)(cSlice - 1) * segW;
			coords[1] = startV + (float)cStack * segH;
			coords[2] = startU + (float)(cSlice) * segW;
			coords[3] = startV + (float)(cStack + 1) * segH;
			break;
		}
    	
    	return coords;
	}
}