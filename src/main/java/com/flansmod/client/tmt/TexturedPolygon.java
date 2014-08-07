package com.flansmod.client.tmt;

import java.util.ArrayList;

import org.lwjgl.opengl.GL11;

import net.minecraft.util.Vec3;

public class TexturedPolygon
{
	public TexturedPolygon(PositionTextureVertex[] apositionTexturevertex)
	{
		this.invertNormal = false;
		this.vertexPositions = apositionTexturevertex;
		this.nVertices = apositionTexturevertex.length;
		this.iNormals = new ArrayList<Vec3>();
		this.normals = new float[0];
	}
	
	public TexturedPolygon(PositionTextureVertex[] apositionTexturevertex, int par2, int par3, int par4, int par5, float par6, float par7)
	{
		this(apositionTexturevertex);
		float var8 = 0.0F / par6;
		float var9 = 0.0F / par7;
		apositionTexturevertex[0] = apositionTexturevertex[0].setTexturePosition(par4 / par6 - var8, par3 / par7 + var9);
		apositionTexturevertex[1] = apositionTexturevertex[1].setTexturePosition(par2 / par6 + var8, par3 / par7 + var9);
		apositionTexturevertex[2] = apositionTexturevertex[2].setTexturePosition(par2 / par6 + var8, par5 / par7 - var9);
		apositionTexturevertex[3] = apositionTexturevertex[3].setTexturePosition(par4 / par6 - var8, par5 / par7 - var9);
	}
	
	public void setInvertNormal(boolean isSet)
	{
		invertNormal = isSet;
	}
	
	public void setNormals(float x, float y, float z)
	{
		normals = new float[] {x, y, z};
	}
	
	public void flipFace()
	{
		PositionTextureVertex[] var1 = new PositionTextureVertex[this.vertexPositions.length];

		for (int var2 = 0; var2 < this.vertexPositions.length; ++var2)
		{
			var1[var2] = this.vertexPositions[this.vertexPositions.length - var2 - 1];
		}
		
		this.vertexPositions = var1;
	}
	
	public void setNormals(ArrayList<Vec3> vec)
	{
		iNormals = vec;
	}
	
	public void draw(TmtTessellator tessellator, float f)
	{
		
		if(nVertices == 3)
			tessellator.startDrawing(GL11.GL_TRIANGLES);
		else if (nVertices == 4)
			tessellator.startDrawingQuads();
		else
			tessellator.startDrawing(GL11.GL_POLYGON);
		
		if(iNormals.size() == 0)
		{
			if(normals.length == 3)
			{
				if(invertNormal)
				{
					tessellator.setNormal(-normals[0], -normals[1], -normals[2]);
				} else
				{
					tessellator.setNormal(normals[0], normals[1], normals[2]);
				}
			} else
			if(vertexPositions.length >= 3)
			{
				Vec3 Vec3 = vertexPositions[1].vector3D.subtract(vertexPositions[0].vector3D);
				Vec3 Vec31 = vertexPositions[1].vector3D.subtract(vertexPositions[2].vector3D);
				Vec3 Vec32 = Vec31.crossProduct(Vec3).normalize();
		
				if(invertNormal)
				{
					tessellator.setNormal(-(float)Vec32.xCoord, -(float)Vec32.yCoord, -(float)Vec32.zCoord);
				} else
				{
					tessellator.setNormal((float)Vec32.xCoord, (float)Vec32.yCoord, (float)Vec32.zCoord);
				}
			}
			else
			{
				return;
			}
		}
		for(int i = 0; i < nVertices; i++)
		{
			PositionTextureVertex positionTexturevertex = vertexPositions[i];
			if(positionTexturevertex instanceof PositionTransformVertex)
				((PositionTransformVertex)positionTexturevertex).setTransformation();
			if(i < iNormals.size())
			{
				if(invertNormal)
				{
					tessellator.setNormal(-(float)iNormals.get(i).xCoord, -(float)iNormals.get(i).yCoord, -(float)iNormals.get(i).zCoord);
				}
				else
				{
					tessellator.setNormal((float)iNormals.get(i).xCoord, (float)iNormals.get(i).yCoord, (float)iNormals.get(i).zCoord);
				}
			}
			tessellator.addVertexWithUVW((float)positionTexturevertex.vector3D.xCoord * f, (float)positionTexturevertex.vector3D.yCoord * f, (float)positionTexturevertex.vector3D.zCoord * f, positionTexturevertex.texturePositionX, positionTexturevertex.texturePositionY, positionTexturevertex.texturePositionW);
		}

		tessellator.draw();
	}
	
	public PositionTextureVertex[] vertexPositions;
	public int nVertices;
	private boolean invertNormal;
	private float[] normals;
	private ArrayList<Vec3> iNormals;
}
