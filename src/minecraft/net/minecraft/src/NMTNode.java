package net.minecraft.src;

import java.util.ArrayList;

public class NMTNode
{
	protected ArrayList<NMTNode> child;
	protected NMTNode parent;

	public NMTNode(NMTNode parentNode)
	{
		parent = parentNode;
		if (parentNode != null)
		{
			parent.addChild(this);
		}
	}

	public void addChild(NMTNode childNode)
	{
		child.add(childNode);
	}
}
