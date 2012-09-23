package com.overminddl1.minecraft.libs.NMT;

public class NMTModelSprite extends NMTModelVoxel
{
	protected int textureW;
	protected int textureH;
	protected int layers;
	protected int layersPerRow;
	protected boolean[] rotations;
	
	public NMTModelSprite(NMTModelRenderer nmtmodelrenderer, float x, float y, float z, float w, float h, float d, int texW, int texH, int l, int perRow, boolean rotX, boolean rotY, boolean rotZ)
	{
		super(nmtmodelrenderer, x, y, z, w, h, d);
		textureW = texW;
		textureH = texH;
		layers = l;
		layersPerRow = perRow;
		rotations = new boolean[] {rotX, rotY, rotZ};
	}
	public NMTModelSprite(NMTModelRenderer nmtmodelrenderer, float x, float y, float z, float w, float h, float d, int texW, int texH, int l, int perRow)
	{
		this(nmtmodelrenderer, x, y, z, w, h, d, texW, texH, l, perRow, false, false, false);
	}
	
	public NMTModelSprite(NMTModelRenderer nmtmodelrenderer, float x, float y, float z, float w, float h, float d, int texW, int texH, int l)
	{
		this(nmtmodelrenderer, x, y, z, w, h, d, texW, texH, l, Math.max(1, (int)Math.floor(nmtmodelrenderer.textureWidth / texW)));
	}
	
	public NMTModelSprite(NMTModelRenderer nmtmodelrenderer, float x, float y, float z, float w, float h, float d, int texW, int texH)
	{
		this(nmtmodelrenderer, x, y, z, w, h, d, texW, texH, 1);
	}
	
	public NMTModelSprite(NMTModelRenderer nmtmodelrenderer, float x, float y, float z, float w, float h, float d)
	{
		this(nmtmodelrenderer, x, y, z, w, h, d, (int)Math.floor(w), (int)Math.floor(h));
	}
	
	public NMTModelSprite create()
	{
		float x1 = xPos;
		float y1 = yPos;
		float z1 = zPos;
		
		if(renderer.mirror)
		{
			float[] mMul = switchValues(1.0F, 0.0F, 0.0F);
			x1+= width * mMul[0];
			y1+= height * mMul[1];
			z1+= depth * mMul[2];
		}

		createSpriteVertices(x1, y1, z1);
		createSprite();
		
		if(renderer.mirror^rotations[0]^rotations[1]^rotations[2])
		{
			flipFaces();
		}
		
		return this;
	}
	
	protected void createSpriteVertices(float x, float y, float z)
	{
		float[] sizes = switchValues((float)textureW, (float)textureH, (float)layers);
		float xS = width / sizes[0];
		float yS = height / sizes[1];
		float zS = depth / sizes[2];
		
		if(renderer.mirror)
		{
			float[] mMul = switchValues(-1.0F, 1.0F, 1.0F);
			xS*= mMul[0];
			yS*= mMul[1];
			zS*= mMul[2];
		}
		
		for(int idz = 0; idz < layers + 1; idz++)
		{
			for(int idy = 0; idy < textureH + 1; idy++)
			{
				for(int idx = 0; idx < textureW + 1; idx++)
				{
					float[] pos = switchValues(idx, idy, idz);
					vertices.add(new NMTVertex(x + xS * pos[0], y + yS * pos[1], z + zS * pos[2]));
				}
			}
		}
	}
	
	protected void createSprite()
	{
		int texW = textureW + 1;
		int texH = textureH + 1;
		int texS = texW * texH;
		for(int idz = 0; idz < layers; idz++)
		{
			int layerX = idz % layersPerRow;
			int layerY = (int) Math.floor((float)idz / (float)layersPerRow);
			for(int idy = 0; idy < textureH; idy++)
			{
				for(int idx = 0; idx < textureW; idx++)
				{
					int[] verts = new int[] {
							idx + idy * texW + idz * texS,
							idx + 1 + idy * texW + idz * texS,
							idx + 1 + (idy + 1) * texW + idz * texS,
							idx + (idy + 1) * texW + idz * texS,
							idx + idy * texW + texS + idz * texS,
							idx + 1 + idy * texW + texS + idz * texS,
							idx + 1 + (idy + 1) * texW + texS + idz * texS,
							idx + (idy + 1) * texW + texS + idz * texS};
					createVoxel(verts, idx + layerX * textureW, idy + layerY * textureH);
				}
			}

		}
	}
	
	protected float[] switchValues(float val1, float val2, float val3)
	{
		float[] val = new float[] {val1, val2, val3};
		
		float val4;
		
		if(rotations[0])
		{
			val4 = val[2];
			val[2] = val[1];
			val[1] = val4;
		}
		if(rotations[1])
		{
			val4 = val[2];
			val[2] = val[0];
			val[0] = val4;
		}
		if(rotations[2])
		{
			val4 = val[1];
			val[1] = val[0];
			val[0] = val4;
		}
		
		return val;
	}
}
