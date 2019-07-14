package com.flansmod.common.driveables.collisions;

import com.flansmod.common.vector.Vector3f;

public class CollisionShapeBox {
	public Vector3f pos, size;
	public Vector3f p1,p2,p3,p4,p5,p6,p7,p8;
	public String part;
	
	
	public CollisionShapeBox(Vector3f position, Vector3f boxsize, Vector3f p1mod, Vector3f p2mod, Vector3f p3mod, Vector3f p4mod, Vector3f p5mod, Vector3f p6mod, Vector3f p7mod, Vector3f p8mod, String driveablePart)
	{
		this.pos = new Vector3f(position.x/16, -(position.y)/16 - (10F/16F), position.z/16);
		this.size = new Vector3f(boxsize.x/16, boxsize.y/16, boxsize.z/16);
		this.p1 = new Vector3f(p1mod.x/16, p1mod.y/16, p1mod.z/16);
		this.p2 = new Vector3f(p2mod.x/16, p2mod.y/16, p2mod.z/16);
		this.p3 = new Vector3f(p3mod.x/16, p3mod.y/16, p3mod.z/16);
		this.p4 = new Vector3f(p4mod.x/16, p4mod.y/16, p4mod.z/16);
		this.p5 = new Vector3f(p5mod.x/16, p5mod.y/16, p5mod.z/16);
		this.p6 = new Vector3f(p6mod.x/16, p6mod.y/16, p6mod.z/16);
		this.p7 = new Vector3f(p7mod.x/16, p7mod.y/16, p7mod.z/16);
		this.p8 = new Vector3f(p8mod.x/16, p8mod.y/16, p8mod.z/16);
		this.part = driveablePart;
	}
}
