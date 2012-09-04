package net.minecraft.src;

import java.util.ArrayList;

public class NMTModelTrapezoid extends NMTModelBase
{
	private float xPos;
	private float yPos;
	private float zPos;
	private int width;
	private int height;
	private int depth;
	private float scale;
	private float bottomScale;
	private int direction;
	private int xSub;
	private int ySub;
	private int zSub;
	private boolean smooth;

	public NMTModelTrapezoid(NMTModelRenderer nmtmodelrenderer, float x, float y, float z, int w, int h, int d, float s, float bScale, int dir)
	{
		this(nmtmodelrenderer, x, y, z, w, h, d, s, bScale, dir, w, h, d);
	}

	public NMTModelTrapezoid(NMTModelRenderer nmtmodelrenderer, float x, float y, float z, int w, int h, int d, float s, float bScale, int dir, boolean sm)
	{
		this(nmtmodelrenderer, x, y, z, w, h, d, s, bScale, dir, w, h, d);
		smooth = sm;
	}

	public NMTModelTrapezoid(NMTModelRenderer nmtmodelrenderer, float x, float y, float z, int w, int h, int d, float s, float bScale, int dir, int xS, int yS, int zS)
	{
		this(nmtmodelrenderer, x, y, z, w, h, d, s, bScale, dir, xS, yS, zS, false);
	}

	public NMTModelTrapezoid(NMTModelRenderer nmtmodelrenderer, float x, float y, float z, int w, int h, int d, float s, float bScale, int dir, int xS, int yS, int zS, boolean sm)
	{
		super(nmtmodelrenderer);
		xPos = x;
		yPos = y;
		zPos = z;
		width = w;
		height = h;
		depth = d;
		scale = s;
		bottomScale = bScale;
		direction = dir;
		xSub = xS;
		ySub = yS;
		zSub = zS;
		smooth = sm;
	}

	public NMTModelTrapezoid create()
	{
		float x1 = xPos - (float) ((float) width * (scale - 1) * 0.5);
		float y1 = yPos - (float) ((float) height * (scale - 1) * 0.5);
		float z1 = zPos - (float) ((float) depth * (scale - 1) * 0.5);
		float x2 = x1 + (float) width * scale;
		float y2 = y1 + (float) height * scale;
		float z2 = z1 + (float) depth * scale;

		float u = renderer.textureU;
		float v = renderer.textureV;
		float texW = renderer.textureWidth;
		float texH = renderer.textureHeight;

		int m = (renderer.mirror ? -1 : 1);
		if (renderer.mirror)
		{
			float x3 = x2;
			x2 = x1;
			x1 = x3;
		}

		Vec3 centerVec = Vec3.createVectorHelper(x1 + (x2 - x1) / 2, y1 + (y2 - y1) / 2, z1 + (z2 - z1) / 2);

		float[][] vert = setDirection(new float[][]
		{
		{ x1, y1, z1 },
		{ x2, y1, z1 },
		{ x2, y2, z1 },
		{ x1, y2, z1 },
		{ x1, y1, z2 },
		{ x2, y1, z2 },
		{ x2, y2, z2 },
		{ x1, y2, z2 } }, m);

		ArrayList<NMTVertex[][]> verts = setupVertices(vert, centerVec);

		addQuadSet(verts.get(NMTGlobal.NMT_DIR_LEFT), zSub, ySub, (u + depth + width) / texW, (v + depth) / texH, (u + depth * 2 + width) / texW, (v + depth + height) / texH);
		addQuadSet(verts.get(NMTGlobal.NMT_DIR_RIGHT), zSub, ySub, u / texW, (v + depth) / texH, (u + depth) / texW, (v + depth + height) / texH);
		addQuadSet(verts.get(NMTGlobal.NMT_DIR_TOP), xSub, zSub, (u + depth) / texW, v / texH, (u + depth + width) / texW, (v + depth) / texH);
		addQuadSet(verts.get(NMTGlobal.NMT_DIR_BOTTOM), xSub, zSub, (u + depth + width) / texW, (v + depth) / texH, (u + depth + width * 2) / texW, v / texH);
		addQuadSet(verts.get(NMTGlobal.NMT_DIR_FRONT), xSub, ySub, (u + depth) / texW, (v + depth) / texH, (u + depth + width) / texW, (v + depth + height) / texH);
		addQuadSet(verts.get(NMTGlobal.NMT_DIR_BACK), xSub, ySub, (u + depth * 2 + width) / texW, (v + depth) / texH, (u + depth * 2 + width * 2) / texW, (v + depth + height) / texH);

		if (renderer.mirror)
		{
			flipFaces();
		}

		return this;
	}

	private float[][] setDirection(float[][] v, int m)
	{

		switch (direction)
		{
			case NMTGlobal.NMT_DIR_RIGHT:
				v[0][1] -= bottomScale;
				v[0][2] -= bottomScale;
				v[3][1] += bottomScale;
				v[3][2] -= bottomScale;
				v[4][1] -= bottomScale;
				v[4][2] += bottomScale;
				v[7][1] += bottomScale;
				v[7][2] += bottomScale;
				break;
			case NMTGlobal.NMT_DIR_LEFT:
				v[1][1] -= bottomScale;
				v[1][2] -= bottomScale;
				v[2][1] += bottomScale;
				v[2][2] -= bottomScale;
				v[5][1] -= bottomScale;
				v[5][2] += bottomScale;
				v[6][1] += bottomScale;
				v[6][2] += bottomScale;
				break;
			case NMTGlobal.NMT_DIR_FRONT:
				v[0][0] -= m * bottomScale;
				v[0][1] -= bottomScale;
				v[1][0] += m * bottomScale;
				v[1][1] -= bottomScale;
				v[2][0] += m * bottomScale;
				v[2][1] += bottomScale;
				v[3][0] -= m * bottomScale;
				v[3][1] += bottomScale;
				break;
			case NMTGlobal.NMT_DIR_BACK:
				v[4][0] -= m * bottomScale;
				v[4][1] -= bottomScale;
				v[5][0] += m * bottomScale;
				v[5][1] -= bottomScale;
				v[6][0] += m * bottomScale;
				v[6][1] += bottomScale;
				v[7][0] -= m * bottomScale;
				v[7][1] += bottomScale;
				break;
			case NMTGlobal.NMT_DIR_TOP:
				v[0][0] -= m * bottomScale;
				v[0][2] -= bottomScale;
				v[1][0] += m * bottomScale;
				v[1][2] -= bottomScale;
				v[4][0] -= m * bottomScale;
				v[4][2] += bottomScale;
				v[5][0] += m * bottomScale;
				v[5][2] += bottomScale;
				break;
			case NMTGlobal.NMT_DIR_BOTTOM:
				v[2][0] += m * bottomScale;
				v[2][2] -= bottomScale;
				v[3][0] -= m * bottomScale;
				v[3][2] -= bottomScale;
				v[6][0] += m * bottomScale;
				v[6][2] += bottomScale;
				v[7][0] -= m * bottomScale;
				v[7][2] += bottomScale;
				break;
		}
		return v;
	}

	private ArrayList<NMTVertex[][]> setupVertices(float[][] v, Vec3 centerVec)
	{
		ArrayList<NMTVertex[][]> verts = new ArrayList<NMTVertex[][]>();

		for (int idx = 0; idx < 6; idx++)
		{
			switch (idx)
			{
				case NMTGlobal.NMT_DIR_BACK:
				case NMTGlobal.NMT_DIR_FRONT:
					verts.add(new NMTVertex[xSub + 1][ySub + 1]);
					break;
				case NMTGlobal.NMT_DIR_LEFT:
				case NMTGlobal.NMT_DIR_RIGHT:
					verts.add(new NMTVertex[zSub + 1][ySub + 1]);
					break;
				case NMTGlobal.NMT_DIR_TOP:
				case NMTGlobal.NMT_DIR_BOTTOM:
					verts.add(new NMTVertex[xSub + 1][zSub + 1]);
					break;
			}
		}

		for (int idz = 0; idz < zSub + 1; idz++)
		{
			for (int idy = 0; idy < ySub + 1; idy++)
			{
				for (int idx = 0; idx < xSub + 1; idx++)
				{
					if (idx > 0 && idx < xSub && idy > 0 && idy < ySub && idz > 0 && idz < zSub)
					{
						continue;
					}
					float xS = (float) idx / (float) xSub;
					float yS = (float) idy / (float) ySub;
					float zS = (float) idz / (float) zSub;

					float xCur = calculatePoint(v, 0, xS, yS, zS);
					float yCur = calculatePoint(v, 1, xS, yS, zS);
					float zCur = calculatePoint(v, 2, xS, yS, zS);

					NMTVertex vert = new NMTVertex(xCur, yCur, zCur);

					if (smooth)
					{
						setNormalFromOrigin(vert, centerVec);
					}

					vertices.add(vert);

					if (idx == 0)
					{
						verts.get(NMTGlobal.NMT_DIR_RIGHT)[zSub - idz][idy] = vert;
					}
					if (idx == xSub)
					{
						verts.get(NMTGlobal.NMT_DIR_LEFT)[idz][idy] = vert;
					}
					if (idy == 0)
					{
						verts.get(NMTGlobal.NMT_DIR_TOP)[xSub - idx][idz] = vert;
					}
					if (idy == ySub)
					{
						verts.get(NMTGlobal.NMT_DIR_BOTTOM)[idx][idz] = vert;
					}
					if (idz == 0)
					{
						verts.get(NMTGlobal.NMT_DIR_FRONT)[idx][idy] = vert;
					}
					if (idz == zSub)
					{
						verts.get(NMTGlobal.NMT_DIR_BACK)[xSub - idx][idy] = vert;
					}
				}
			}
		}
		return verts;
	}

	private void addQuadSet(NMTVertex[][] verts, int xSeg, int ySeg, float u1, float v1, float u2, float v2)
	{
		for (int idy = 0; idy < ySeg; idy++)
		{
			for (int idx = 0; idx < xSeg; idx++)
			{
				float uS1 = u1 + (u2 - u1) * ((float) idx / (float) xSeg) + NMTGlobal.textureMargin;
				float vS1 = v1 + (v2 - v1) * ((float) idy / (float) ySeg) + NMTGlobal.textureMargin;
				float uS2 = u1 + (u2 - u1) * ((float) (idx + 1) / (float) xSeg) - NMTGlobal.textureMargin;
				float vS2 = v1 + (v2 - v1) * ((float) (idy + 1) / (float) ySeg) - NMTGlobal.textureMargin;

				ArrayList<NMTVertex> nVert = new ArrayList<NMTVertex>();

				nVert.add(verts[idx + 1][idy]);
				nVert.add(verts[idx][idy]);
				nVert.add(verts[idx][idy + 1]);
				nVert.add(verts[idx + 1][idy + 1]);

				addQuad(nVert, 0, 1, 2, 3, uS1, vS1, uS2, vS2);
			}
		}
	}

	private float calculatePoint(float[][] v, int point, float aS, float bS, float cS)
	{
		float xD1 = (v[3][point] - v[0][point]) * bS + v[0][point];
		float xD2 = (v[2][point] - v[1][point]) * bS + v[1][point];
		float xD3 = (xD2 - xD1) * aS + xD1;
		float xD4 = (v[7][point] - v[4][point]) * bS + v[4][point];
		float xD5 = (v[6][point] - v[5][point]) * bS + v[5][point];
		float xD6 = (xD5 - xD4) * aS + xD4;
		float xD7 = (xD6 - xD3) * cS + xD3;

		return xD7;
	}
}
