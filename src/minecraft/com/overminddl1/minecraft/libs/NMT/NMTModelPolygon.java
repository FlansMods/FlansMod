package com.overminddl1.minecraft.libs.NMT;

import java.util.ArrayList;

public class NMTModelPolygon extends NMTModelBase
{
	public NMTModelPolygon(NMTModelRenderer nmtmodelrenderer, ArrayList<NMTTextureVertex> verts)
	{
		super(nmtmodelrenderer);
		for(int idx = 0; idx < verts.size(); idx++)
		{
			vertices.add(verts.get(idx).vertex);
		}
		polygons.add(new NMTPolygon(verts));
	}

	public NMTModelBase create()
	{
		return this;
	}
	
}
