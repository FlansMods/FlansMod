package com.overminddl1.minecraft.libs.NMT;

public class NMTModelVoxel extends NMTModelBase
{
	protected float xPos;
	protected float yPos;
	protected float zPos;
	protected float width;
	protected float height;
	protected float depth;
	protected int relativeU;
	protected int relativeV;
	
	public NMTModelVoxel(NMTModelRenderer nmtmodelrenderer, float x, float y, float z, float w, float h, float d)
	{
		this(nmtmodelrenderer, x, y, z, w, h, d, 0, 0);
	}
	
	public NMTModelVoxel(NMTModelRenderer nmtmodelrenderer, float x, float y, float z, float w, float h, float d, int u, int v)
	{
		super(nmtmodelrenderer);
		xPos = x;
		yPos = y;
		zPos = z;
		width = w;
		height = h;
		depth = d;
		relativeU = u;
		relativeV = v;
	}
	
	public NMTModelVoxel create()
	{
		float x1 = xPos;
		float y1 = yPos;
		float z1 = zPos;
		float x2 = x1 + (float)width;
		float y2 = y1 + (float)height;
		float z2 = z1 + (float)depth;
		
		vertices.add(new NMTVertex(x1, y1, z1));
		vertices.add(new NMTVertex(x2, y1, z1));
		vertices.add(new NMTVertex(x2, y2, z1));
		vertices.add(new NMTVertex(x1, y2, z1));
		vertices.add(new NMTVertex(x1, y1, z2));
		vertices.add(new NMTVertex(x2, y1, z2));
		vertices.add(new NMTVertex(x2, y2, z2));
		vertices.add(new NMTVertex(x1, y2, z2));
		
		createVoxel(new int[] {0, 1, 2, 3, 4, 5, 6, 7}, relativeU, relativeV);
		
		return this;
	}
	
	protected void createVoxel(int[] vert, int relU, int relV)
	{
		float u = renderer.textureU + (float)relU;
		float v = renderer.textureV + (float)relV;
		float texW = renderer.textureWidth;
		float texH = renderer.textureHeight;
		
		
		float u1 = u / (texW + NMTGlobal.textureMargin);
		float v1 = v / (texH + NMTGlobal.textureMargin);
		float u2 = (u + 1) / (texW - NMTGlobal.textureMargin);
		float v2 = (v + 1) / (texH - NMTGlobal.textureMargin);

		addQuad(vert[5], vert[1], vert[2], vert[6], u1, v1, u2, v2);
		addQuad(vert[0], vert[4], vert[7], vert[3], u1, v1, u2, v2);
		addQuad(vert[5], vert[4], vert[0], vert[1], u1, v1, u2, v2);
		addQuad(vert[2], vert[3], vert[7], vert[6], u1, v1, u2, v2);
		addQuad(vert[1], vert[0], vert[3], vert[2], u1, v1, u2, v2);
		addQuad(vert[4], vert[5], vert[6], vert[7], u1, v1, u2, v2);
	}
}
