package net.minecraft.src;

public class NMTModelFileBlenderTXT extends NMTModelFile
{
	public NMTModelFileBlenderTXT(NMTModelRenderer nmtmodelrenderer, String mdlFile)
	{
		super(nmtmodelrenderer, mdlFile);
	}

	protected NMTModelFile getInstance()
	{
		return new NMTModelFileBlenderTXT(renderer, modelName);
	}

	protected NMTModelFile parseFile()
	{
		return null;
	}

	protected String[] getExtensions()
	{
		return new String[]
		{ "txt", "Data.txt" };
	}

	protected String getModelFormat()
	{
		return "BlenderTXT";
	}
}
