package net.minecraft.src;

import java.util.ArrayList;

public class NMTModelBox extends NMTModelBase
{
	private float xPos;
	private float yPos;
	private float zPos;
	private int width;
	private int height;
	private int depth;
	private float scale;
	private float extrusion;
	private boolean calcNormals;

	public NMTModelBox(NMTModelRenderer nmtmodelrenderer, float x, float y, float z, int w, int h, int d, float e, float s, boolean cN)
	{
		super(nmtmodelrenderer);
		xPos = x;
		yPos = y;
		zPos = z;
		width = w;
		height = h;
		depth = d;
		scale = s;
		extrusion = e;
		calcNormals = cN;
	}

	public NMTModelBox create()
	{
		float x1 = xPos - (float) ((float) width * (scale - 1) * 0.5);
		float y1 = yPos - (float) ((float) height * (scale - 1) * 0.5);
		float z1 = zPos - (float) ((float) depth * (scale - 1) * 0.5);
		float x2 = x1 + (float) width * scale;
		float y2 = y1 + (float) height * scale;
		float z2 = z1 + (float) depth * scale;
		x1 -= extrusion;
		y1 -= extrusion;
		z1 -= extrusion;
		x2 += extrusion;
		y2 += extrusion;
		z2 += extrusion;

		float u = renderer.textureU;
		float v = renderer.textureV;
		float texW = renderer.textureWidth;
		float texH = renderer.textureHeight;

		if (renderer.mirror)
		{
			float x3 = x2;
			x2 = x1;
			x1 = x3;
		}

		vertices.add(new NMTVertex(x1, y1, z1));
		vertices.add(new NMTVertex(x2, y1, z1));
		vertices.add(new NMTVertex(x2, y2, z1));
		vertices.add(new NMTVertex(x1, y2, z1));
		vertices.add(new NMTVertex(x1, y1, z2));
		vertices.add(new NMTVertex(x2, y1, z2));
		vertices.add(new NMTVertex(x2, y2, z2));
		vertices.add(new NMTVertex(x1, y2, z2));

		if (calcNormals)
		{
			Vec3 centerVec = Vec3.createVectorHelper(x1 + (x2 - x1) / 2, y1 + (y2 - y1) / 2, z1 + (z2 - z1) / 2);
			setNormalFromOrigin(vertices.get(0), centerVec);
			setNormalFromOrigin(vertices.get(1), centerVec);
			setNormalFromOrigin(vertices.get(2), centerVec);
			setNormalFromOrigin(vertices.get(3), centerVec);
			setNormalFromOrigin(vertices.get(4), centerVec);
			setNormalFromOrigin(vertices.get(5), centerVec);
			setNormalFromOrigin(vertices.get(6), centerVec);
			setNormalFromOrigin(vertices.get(7), centerVec);
		}
		addQuad(5, 1, 2, 6, (u + depth + width) / texW, (v + depth) / texH, (u + depth * 2 + width) / texW, (v + depth + height) / texH);
		addQuad(0, 4, 7, 3, u / texW, (v + depth) / texH, (u + depth) / texW, (v + depth + height) / texH);
		addQuad(5, 4, 0, 1, (u + depth) / texW, v / texH, (u + depth + width) / texW, (v + depth) / texH);
		addQuad(2, 3, 7, 6, (u + depth + width) / texW, (v + depth) / texH, (u + depth + width * 2) / texW, v / texH);
		addQuad(1, 0, 3, 2, (u + depth) / texW, (v + depth) / texH, (u + depth + width) / texW, (v + depth + height) / texH);
		addQuad(4, 5, 6, 7, (u + depth * 2 + width) / texW, (v + depth) / texH, (u + depth * 2 + width * 2) / texW, (v + depth + height) / texH);

		if (renderer.mirror)
		{
			flipFaces();
		}
		if (calcNormals)
		{
			setIndivNormals();
		}

		return this;
	}

}
