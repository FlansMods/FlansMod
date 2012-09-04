package net.minecraft.src;

import java.util.ArrayList;
import java.util.Arrays;

import org.lwjgl.opengl.*;

public class NMTPolygon
{
	public ArrayList<NMTTextureVertex> vertices;
	public Vec3 normal;
	public boolean invertNormal;
	public boolean recalcNormal;
	public boolean indivNormal;
	public boolean fromOrigNormal;
	public boolean textured;
	public NMTMaterial material;

	public NMTPolygon(ArrayList<NMTTextureVertex> verts, Vec3 vec)
	{
		vertices = verts;
		normal = vec;
		invertNormal = false;
		recalcNormal = true;
		indivNormal = false;
		fromOrigNormal = false;
		textured = true;
		material = null;
	}

	public NMTPolygon(ArrayList<NMTTextureVertex> verts)
	{
		this(verts, null);
	}

	public NMTPolygon(NMTTextureVertex[] verts)
	{
		this(new ArrayList<NMTTextureVertex>(Arrays.asList(verts)));
	}

	public void flipFace()
	{
		ArrayList<NMTTextureVertex> tempVerts = new ArrayList<NMTTextureVertex>();

		for (int idx = 0; idx < vertices.size(); idx++)
		{
			tempVerts.add(vertices.get(vertices.size() - (idx + 1)));
		}

		vertices.clear();

		vertices = tempVerts;
	}

	public void setNormal(float x, float y, float z)
	{
		normal = Vec3.createVectorHelper(x, y, z);
	}

	public void setMaterial(NMTMaterial mat)
	{
		material = mat;
	}

	public void draw(Tessellator tessellator, float scale)
	{
		draw(tessellator, scale, false);
	}

	public void draw(Tessellator tessellator, float scale, boolean disableTexture)
	{
		if (material != null)
		{
			material.setMaterial();
		}
		if (normal == null || recalcNormal)
		{
			Vec3 vec3d = vertices.get(1).vertex.transformVector.subtract(vertices.get(0).vertex.transformVector);
			Vec3 vec3d1 = vertices.get(1).vertex.transformVector.subtract(vertices.get(2).vertex.transformVector);
			normal = vec3d1.crossProduct(vec3d).normalize();
		}

		if (vertices.size() == 4)
		{
			tessellator.startDrawingQuads();
		} else if (vertices.size() == 3)
		{
			tessellator.startDrawing(GL11.GL_TRIANGLES);
		} else
		{
			tessellator.startDrawing(GL11.GL_POLYGON);
		}

		if (invertNormal)
		{
			normal.xCoord = -normal.xCoord;
			normal.yCoord = -normal.yCoord;
			normal.zCoord = -normal.zCoord;
		}

		for (int idx = 0; idx < vertices.size(); idx++)
		{
			NMTTextureVertex vertex = vertices.get(idx);
			if (fromOrigNormal)
			{
				Vec3 vec3d2 = Vec3.createVectorHelper(vertex.vertex.transformVector.xCoord, vertex.vertex.transformVector.yCoord, vertex.vertex.transformVector.zCoord);
				vec3d2.normalize();
				if (invertNormal)
				{
					vec3d2.xCoord = -vec3d2.xCoord;
					vec3d2.yCoord = -vec3d2.yCoord;
					vec3d2.zCoord = -vec3d2.zCoord;
				}
				tessellator.setNormal((float) vec3d2.xCoord, (float) vec3d2.yCoord, (float) vec3d2.zCoord);
			} else if (!indivNormal || (vertex.normal == null && vertex.vertex.normal == null))
			{
				tessellator.setNormal((float) normal.xCoord, (float) normal.yCoord, (float) normal.zCoord);
			} else
			{
				Vec3 useNormal = vertex.normal;
				if (useNormal == null)
				{
					useNormal = vertex.vertex.normal;
				}
				if (invertNormal)
				{
					tessellator.setNormal(-(float) useNormal.xCoord, -(float) useNormal.yCoord, -(float) useNormal.zCoord);
				} else
				{
					tessellator.setNormal((float) useNormal.xCoord, (float) useNormal.yCoord, (float) useNormal.zCoord);
				}
			}
			if (disableTexture || !textured)
			{
				tessellator.addVertex((float) vertex.vertex.transformVector.xCoord * scale, (float) vertex.vertex.transformVector.yCoord * scale, (float) vertex.vertex.transformVector.zCoord * scale);
			} else
			{
				tessellator.addVertexWithUV((float) vertex.vertex.transformVector.xCoord * scale, (float) vertex.vertex.transformVector.yCoord * scale, (float) vertex.vertex.transformVector.zCoord * scale, vertex.textureU, vertex.textureV);
			}
		}

		tessellator.draw();

		if (material != null)
		{
			material.resetMaterial();
		}
	}
}
