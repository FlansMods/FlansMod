package net.minecraft.src;

import java.util.ArrayList;

/**
 * <p>
 * All models that can be created with Nitro Model Thingy find their basis at
 * this class.
 * </p>
 * 
 * <p>
 * In order to dynamically load models properly, the creation of the model
 * itself has been separated from the constructor. This means that the variables
 * that get set in the parameters of the constructor have to be stored in the
 * class itself for later use. You can look at the subclasses for more
 * information on this.
 * </p>
 * 
 * @author G.A.M. Kertopermono
 * 
 */
public abstract class NMTModelBase
{
	public String name;
	protected NMTModelRenderer renderer;
	public ArrayList<NMTPolygon> polygons;
	public ArrayList<NMTVertex> vertices;
	public boolean doCompile;
	public boolean doRender;

	public NMTModelBase(NMTModelRenderer nmtmodelrenderer)
	{
		renderer = nmtmodelrenderer;
		polygons = new ArrayList<NMTPolygon>();
		vertices = new ArrayList<NMTVertex>();
		doCompile = true;
		doRender = false;
	}

	public abstract NMTModelBase create();

	public void compile(Tessellator tessellator, float scale)
	{
		render(tessellator, scale);
	}

	public void render(Tessellator tessellator, float scale)
	{
		for (int idx = 0; idx < polygons.size(); idx++)
		{
			polygons.get(idx).draw(tessellator, scale, renderer.disableTextureMapping);
		}
	}

	public NMTTextureVertex addVertex(float x, float y, float z, float u, float v)
	{
		NMTVertex vertex = new NMTVertex(x, y, z);
		vertices.add(vertex);
		return addVertex(vertex, u, v);
	}

	public NMTTextureVertex addVertex(NMTVertex vertex, float u, float v)
	{
		return new NMTTextureVertex(vertex, u, v);
	}

	public NMTTextureVertex addVertex(NMTVertex vertex, float u, float v, Vec3 n)
	{
		return new NMTTextureVertex(vertex, u, v, n);
	}

	public NMTTextureVertex addVertexFromOrig(NMTVertex vertex, float u, float v, Vec3 n)
	{
		Vec3 calcN = Vec3.createVectorHelper(vertex.transformVector.xCoord - n.xCoord, vertex.transformVector.yCoord - n.yCoord, vertex.transformVector.zCoord - n.zCoord);
		calcN = calcN.normalize();
		return new NMTTextureVertex(vertex, u, v, calcN);
	}

	public void addQuad(int vert1, int vert2, int vert3, int vert4, float u1, float v1, float u2, float v2)
	{
		polygons.add(new NMTPolygon(new NMTTextureVertex[]
		{ addVertex(vertices.get(vert1), u2, v1), addVertex(vertices.get(vert2), u1, v1), addVertex(vertices.get(vert3), u1, v2), addVertex(vertices.get(vert4), u2, v2) }));
	}

	public void addQuad(ArrayList<NMTVertex> verts, int vert1, int vert2, int vert3, int vert4, float u1, float v1, float u2, float v2)
	{
		polygons.add(new NMTPolygon(new NMTTextureVertex[]
		{ addVertex(verts.get(vert1), u2, v1), addVertex(verts.get(vert2), u1, v1), addVertex(verts.get(vert3), u1, v2), addVertex(verts.get(vert4), u2, v2) }));
	}

	public void addQuad(int vert1, int vert2, int vert3, int vert4, float u1, float v1, float u2, float v2, Vec3 orig)
	{
		NMTPolygon poly = new NMTPolygon(new NMTTextureVertex[]
		{ addVertexFromOrig(vertices.get(vert1), u2, v1, orig), addVertexFromOrig(vertices.get(vert2), u1, v1, orig), addVertexFromOrig(vertices.get(vert3), u1, v2, orig), addVertexFromOrig(vertices.get(vert4), u2, v2, orig) });
		poly.indivNormal = true;
		polygons.add(poly);
	}

	public void addQuad(ArrayList<NMTVertex> verts, int vert1, int vert2, int vert3, int vert4, float u1, float v1, float u2, float v2, Vec3 orig)
	{
		NMTPolygon poly = new NMTPolygon(new NMTTextureVertex[]
		{ addVertexFromOrig(verts.get(vert1), u2, v1, orig), addVertexFromOrig(verts.get(vert2), u1, v1, orig), addVertexFromOrig(verts.get(vert3), u1, v2, orig), addVertexFromOrig(verts.get(vert4), u2, v2, orig) });
		poly.indivNormal = true;
		polygons.add(poly);
	}

	public void addQuad(int vert1, int vert2, int vert3, int vert4, float u1, float v1, float u2, float v2, Vec3[] n)
	{
		polygons.add(new NMTPolygon(new NMTTextureVertex[]
		{ addVertex(vertices.get(vert1), u2, v1, n[0]), addVertex(vertices.get(vert2), u1, v1, n[1]), addVertex(vertices.get(vert3), u1, v2, n[2]), addVertex(vertices.get(vert4), u2, v2, n[3]) }));
	}

	public void addQuad(ArrayList<NMTVertex> verts, int vert1, int vert2, int vert3, int vert4, float u1, float v1, float u2, float v2, Vec3[] n)
	{
		polygons.add(new NMTPolygon(new NMTTextureVertex[]
		{ addVertex(verts.get(vert1), u2, v1, n[0]), addVertex(verts.get(vert2), u1, v1, n[1]), addVertex(verts.get(vert3), u1, v2, n[2]), addVertex(verts.get(vert4), u2, v2, n[3]) }));
	}

	public NMTModelBase setName(String s)
	{
		name = s;
		return this;
	}

	/**
	 * <p>
	 * Sets all polygons to invert the normals.
	 * </p>
	 */
	public void invertNormals()
	{
		for (int idx = 0; idx < polygons.size(); idx++)
		{
			polygons.get(idx).invertNormal = true;
		}
	}

	/**
	 * <p>
	 * Flips all faces.
	 * </p>
	 */
	public void flipFaces()
	{
		for (int idx = 0; idx < polygons.size(); idx++)
		{
			polygons.get(idx).flipFace();
		}
	}

	public void setIndivNormals()
	{
		for (int idx = 0; idx < polygons.size(); idx++)
		{
			polygons.get(idx).indivNormal = true;
		}
	}

	public final ArrayList<NMTVertex> getVertexList()
	{
		return vertices;
	}

	public void doMirror(boolean x, boolean y, boolean z)
	{
		for (int idx = 0; idx < vertices.size(); idx++)
		{
			NMTVertex vert = vertices.get(idx);
			vert.baseVector.xCoord *= (x ? -1 : 1);
			vert.baseVector.yCoord *= (y ? -1 : 1);
			vert.baseVector.zCoord *= (z ? -1 : 1);
		}
		if (x ^ y ^ z)
		{
			flipFaces();
		}
	}

	protected void setNormalFromOrigin(NMTVertex vertex, Vec3 n)
	{
		Vec3 calcN = Vec3.createVectorHelper(vertex.transformVector.xCoord - n.xCoord, vertex.transformVector.yCoord - n.yCoord, vertex.transformVector.zCoord - n.zCoord);
		calcN = calcN.normalize();
		vertex.setNormals(calcN);
	}
}
