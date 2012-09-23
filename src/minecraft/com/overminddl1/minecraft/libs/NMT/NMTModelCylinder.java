package com.overminddl1.minecraft.libs.NMT;

import net.minecraft.src.MathHelper;

// Do not use yet, not finished!
// Perhaps continue from:  http://cboard.cprogramming.com/game-programming/133658-opengl-draw-cylinder-yourself.html
@Deprecated
public class NMTModelCylinder extends NMTModelBase
{

	private static final float pi = (float) Math.PI;

	private float xPos;
	private float yPos;
	private float zPos;
	private float radius;
	private float length;
	private int segments;
	private float baseScale;
	private float topScale;
	private int baseDirection;
	private int textureCircleDiameterW;
	private int textureCircleDiameterH;
	private int textureH;
	private boolean calcNormals;

	public NMTModelCylinder(NMTModelRenderer nmtmodelrenderer
			,float x, float y, float z
			,float radius, float length, int segments
			,float baseScale, float topScale
			,int baseDirection
			,int textureCircleDiameterW, int textureCircleDiameterH, int textureH
			,boolean calcNormals)
	{
		super(nmtmodelrenderer);
		this.xPos = x;
		this.yPos = y;
		this.zPos = z;
		this.radius = radius;
		this.length = length;
		this.segments = segments;
		this.baseScale = baseScale;
		this.topScale = topScale;
		this.textureCircleDiameterW = textureCircleDiameterW;
		this.textureCircleDiameterH = textureCircleDiameterH;
		this.textureH = textureH;
		this.calcNormals = calcNormals;
	}

	@Override
	public NMTModelBase create()
	{
		final boolean dirTop = (baseDirection == NMTGlobal.NMT_DIR_TOP || baseDirection == NMTGlobal.NMT_DIR_BOTTOM);
		final boolean dirSide = (baseDirection == NMTGlobal.NMT_DIR_RIGHT || baseDirection == NMTGlobal.NMT_DIR_LEFT);
		final boolean dirFront = (baseDirection == NMTGlobal.NMT_DIR_FRONT || baseDirection == NMTGlobal.NMT_DIR_BACK);
		final boolean dirMirror = (baseDirection == NMTGlobal.NMT_DIR_LEFT || baseDirection == NMTGlobal.NMT_DIR_BOTTOM || baseDirection == NMTGlobal.NMT_DIR_BACK);
		final float mirrorDir = (dirMirror ? -1.0f : 1.0f);

		boolean coneBase = (baseScale == 0);
		boolean coneTop = (topScale == 0);

		if(coneBase && coneTop)
		{
			baseScale = 1.0f;
			coneBase = false;
		}

		int vertArrSize = segments * (coneBase || coneTop ? 1 : 2) + 2;
		NMTTextureVertex[] tempVerts = new NMTTextureVertex[vertArrSize];
		//NMTPolygon[] poly = new NMTPolygon[segments * (coneBase || coneTop ? 2 : 3)];

		final float xLength = (dirSide ? length : 0);
		final float yLength = (dirTop ? length : 0);
		final float zLength = (dirFront ? length : 0);

		final float xStart = (dirMirror ? xPos + xLength : xPos);
		final float yStart = (dirMirror ? yPos + yLength : yPos);
		final float zStart = (dirMirror ? zPos + zLength : zPos);
		final float xEnd = (!dirMirror ? xPos + xLength : xPos);
		final float yEnd = (!dirMirror ? yPos + yLength : yPos);
		final float zEnd = (!dirMirror ? zPos + zLength : zPos);

		//tempVerts[0] = new NMTTextureVertex(xStart, yStart, zStart, 0, 0);
		//tempVerts[tempVerts.length - 1] = new NMTTextureVertex(xEnd, yEnd, zEnd, 0, 0);
		vertices.clear();
		vertices.ensureCapacity(vertArrSize);
		for(int i=0; i<vertices.size(); ++i)
		{
			tempVerts[i] = addVertex(0, 0, 0, 0, 0);
			//tempVerts[i] = new NMTTextureVertex(0, 0, 0, 0, 0 );
			//vertices.add(tempVerts[i].vertex);
		}
		tempVerts[0].vertex.baseVector.xCoord = xStart;
		tempVerts[0].vertex.baseVector.yCoord = yStart;
		tempVerts[0].vertex.baseVector.zCoord = zStart;
		tempVerts[tempVerts.length - 1].vertex.baseVector.xCoord = xEnd;
		tempVerts[tempVerts.length - 1].vertex.baseVector.yCoord = yEnd;
		tempVerts[tempVerts.length - 1].vertex.baseVector.zCoord = zEnd;
		

		float xCur = xStart;
		float yCur = yStart;
		float zCur = zStart;
		float sCur = (coneBase ? topScale : baseScale);
		for(int repeat = 0; repeat < (coneBase || coneTop ? 1 : 2); repeat++)
		{
			for(int index = 0; index < segments; index++)
			{
				final float xSize = mirrorDir * MathHelper.sin((pi / (float)segments) * index * 2F + pi) * radius * sCur;
				final float zSize = -MathHelper.cos((pi / (float)segments) * index * 2F + pi) * radius * sCur;

				final float xPlace = xCur + (!dirSide ? xSize : 0);
				final float yPlace = yCur + (!dirTop ? zSize : 0);
				final float zPlace = zCur + (dirSide ? xSize : (dirTop ? zSize : 0));

				final int idx = 1 + index + repeat * segments;

				tempVerts[idx].vertex.baseVector.xCoord = xPlace;
				tempVerts[idx].vertex.baseVector.yCoord = yPlace;
				tempVerts[idx].vertex.baseVector.zCoord = zPlace;
			}
			xCur = xEnd;
			yCur = yEnd;
			zCur = zEnd;
			sCur = topScale;
		}

		float uScale = 1.0F / (float) renderer.textureWidth;
		float vScale = 1.0F / (float) renderer.textureHeight;
		float uOffset = uScale / 20.0F;
		float vOffset = vScale / 20.0F;
		float uCircle = (float)textureCircleDiameterW * uScale;
		float vCircle = (float)textureCircleDiameterH * vScale;
		float uWidth = (uCircle * 2F - uOffset * 2F) / (float) segments;
		float vHeight = (float)textureH * vScale - uOffset * 2f;
		float uStart = (float)renderer.textureU * uScale;
		float vStart = (float)renderer.textureV * vScale;

		NMTTextureVertex[] vert3 = new NMTTextureVertex[3];
		NMTTextureVertex[] vert4 = new NMTTextureVertex[4];
		for(int index = 0; index < segments; index++)
		{
			int index2 = (index + 1) % segments;
			float uSize = MathHelper.sin((pi / (float)segments) * index * 2F + (!dirTop ? 0 : pi)) * (0.5F * uCircle - 2F * uOffset);
			float vSize = MathHelper.cos((pi / (float)segments) * index * 2F + (!dirTop ? 0 : pi)) * (0.5F * vCircle - 2F * vOffset);
			float uSize1 = MathHelper.sin((pi / (float)segments) * index2 * 2F + (!dirTop ? 0 : pi)) * (0.5F * uCircle - 2F * uOffset);
			float vSize1 = MathHelper.cos((pi / (float)segments) * index2 * 2F + (!dirTop ? 0 : pi)) * (0.5F * vCircle - 2F * vOffset);

			vert3[0] = tempVerts[0].setUV(uStart + 0.5F * uCircle, vStart + 0.5F * vCircle);
			vert3[1] = tempVerts[1 + index2].setUV(uStart + 0.5F * uCircle + uSize1, vStart + 0.5F * vCircle + vSize1);
			vert3[2] = tempVerts[1 + index].setUV(uStart + 0.5F * uCircle + uSize, vStart + 0.5F * vCircle + vSize);

			//poly[index] = new NMTPolygon(vert3);

			if(!coneBase && !coneTop)
			{
				vert4[0] = tempVerts[1 + index].setUV(uStart + uOffset + uWidth * (float)index, vStart + vOffset + vCircle);
				vert4[1] = tempVerts[1 + index2].setUV(uStart + uOffset + uWidth * (float)(index + 1), vStart + vOffset + vCircle);
				vert4[2] = tempVerts[1 + segments + index2].setUV(uStart + uOffset + uWidth * (float)(index + 1), vStart + vOffset + vCircle + vHeight);
				vert4[3] = tempVerts[1 + segments + index].setUV(uStart + uOffset + uWidth * (float)index, vStart + vOffset + vCircle + vHeight);
				//poly[index + segments] = new NMTPolygon(vert4);
			}

			vert3[0] = tempVerts[tempVerts.length - 1].setUV(uStart + 1.5F * uCircle, vStart + 0.5F * vCircle);
			vert3[1] = tempVerts[tempVerts.length - 2 - index].setUV(uStart + 1.5F * uCircle + uSize1, vStart + 0.5F * vCircle + vSize1);
			vert3[2] = tempVerts[tempVerts.length - (1 + segments) + ((segments - index) % segments)].setUV(uStart + 1.5F * uCircle + uSize, vStart + 0.5F * vCircle + vSize);

			//poly[poly.length - segments + index]  = new NMTPolygon(vert3);
		}

		return null;
	}

}
