package com.flansmod.common.driveables.collisions;

import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.vector.Vector3f;

//Hi, I'm PrototypeTheta and welcome to jackass
public class CollisionTest {
	
	//Radius vector set for the ellipsoid
	public Vector3f eRad;
	
	
	//Movement information in R3 (real) space
	public Vector3f R3Velocity;
	public Vector3f R3Position;
	
	//Movement information in ellipsoid space
	public Vector3f velocity;
	public Vector3f normalisedVelocity;
	public Vector3f basePoint;
	
	
	//Collision information
	public boolean didCollide;
	public double nearestDistance;
	public Vector3f intersectionPoint;
	
	public int collisionRecursiveDepth;
	
	public boolean isOnTop = false;
	
	public Vector3f collisionPlaneNormal;
	
	public EnumDriveablePart part;
	
	//Initial constructor, check triangles based on this.
	public CollisionTest(Vector3f ellipsoid, Vector3f origin, Vector3f motion)
	{
		this.eRad = ellipsoid;
		this.R3Velocity = motion;
		this.R3Position = origin;
		
		this.velocity = ConvertR3ToESpace(motion);
		this.normalisedVelocity = velocity.normalise(normalisedVelocity);
		this.basePoint = origin;
	}
	
	
	//I hope you like triangles, edgy comments and a metric fucktonne of maths. No apologies for the comments.
	public void checkTriangle(CollisionTest test, Vector3f p1, Vector3f p2, Vector3f p3)
	{
		CollisionPlane trianglePlane = new CollisionPlane(p1, p2, p3);
		
		//Is this triangle front facing to the velocity vector? If not, don't check it
		if(trianglePlane.isFrontFacingTo(test.normalisedVelocity))
		{
			//Find interval of plane intersection
			double t0, t1;
			boolean embeddedInPlane = false;
			
			//Calculate signed distance from sphere position to triangle plane
			double signedDistToTrianglePlane = trianglePlane.signedDistanceTo(test.basePoint);
			
			float normalDotVelocity = Vector3f.dot(trianglePlane.normal, test.velocity);
			
			
			//If ellipsoid is travelling parallel to the triangular plane
			if(normalDotVelocity == 0.0F)
			{
				if(Math.abs(signedDistToTrianglePlane) >= 1.0F)
				{
					//Ellipsoid is not embedded in plane. No collision occurs
					return;
				} 
				else 
				{
					//Ellipsoid is embedded in plane. Fun. Intersects in the range [0..1]
					embeddedInPlane = true;
					t0 = 0.0;
					t1 = 1.0;
				}
			}
			
			else 
			{
				//Movement is not parallel, calculate intersection interval
				t0 = (-1.0 - signedDistToTrianglePlane)/normalDotVelocity;
				t1 = (1.0 - signedDistToTrianglePlane)/normalDotVelocity;
				
				//Swap so t0 < t1
				if(t0 > t1)
				{
					double temp = t1;
					t1 = t0;
					t0 = temp;
				}
				
				//Check that there is at least one possible result
				if(t0 > 1.0F || t1 < 0.0F)
				{
					//Both t values are outside of our range, no collision occurs
					return;
				}
				
				//Clamp to [0,1] There is probably a pre-built function for this but I forgot lol
				if(t0 < 0.0) t0 = 0.0;
				if(t1 < 0.0) t1 = 0.0;
				if(t0 > 1.0) t0 = 1.0;
				if(t1 > 1.0) t1 = 1.0;
			}
			
			//At this point we have the two time values t0 and t1 between which the swept sphere intersects the triangular plane.
			//All collision happens in this interval
			
			Vector3f collisionPoint = new Vector3f(0,0,0);
			boolean foundCollision = false;
			float t = 1.0F;
			
			//First check for collision inside the triangle. This must happen at t0 and only when the sphere is not embedded
			if(!embeddedInPlane)
			{
				Vector3f baseSubNormal = Vector3f.sub(this.basePoint, trianglePlane.normal, null);
				Vector3f planeIntersectionPoint = Vector3f.add(baseSubNormal, new Vector3f(t0*test.velocity.x, t0*test.velocity.y, t0*test.velocity.z), null);
				
				if(checkPointInTriangle(planeIntersectionPoint, p1, p2, p3))
				{
					foundCollision = true;
					t = (float)t0;
					collisionPoint = planeIntersectionPoint;
				}
			}
			
			//If no collision found, sweep sphere against points and edges of the triangle
			if(!foundCollision)
			{
				Vector3f velocity = test.velocity;
				Vector3f base = test.basePoint;
				float velocitySquaredLength = velocity.lengthSquared();
				float a,b,c; //Paramaters for equation
				float newT;
				
				//For each vertex or edge, a quadratic equation must be solved. Paramaterise this as a*t^2 + bt + c = 0
				//Calculate paramaters for each case
				
				a = velocitySquaredLength;
				
				//P1
				Vector3f baseSubP1 = Vector3f.sub(base, p1, null);
				b = 2*Vector3f.dot(velocity, baseSubP1);
				c = baseSubP1.lengthSquared() - 1;
				if(getLowestRoot(a,b,c,t) != 123456789)
				{
					t = getLowestRoot(a,b,c,t);
					foundCollision = true;
					collisionPoint = p1;
				}
				
				//P2
				Vector3f baseSubP2 = Vector3f.sub(base, p2, null);
				b = 2*Vector3f.dot(velocity, baseSubP2);
				c = baseSubP2.lengthSquared();
				if(getLowestRoot(a,b,c,t) != 123456789)
				{
					t = getLowestRoot(a,b,c,t);
					foundCollision = true;
					collisionPoint = p2;
				}
				
				//P3
				Vector3f baseSubP3 = Vector3f.sub(base, p3, null);
				b = 2*Vector3f.dot(velocity, baseSubP3);
				c = baseSubP3.lengthSquared();
				if(getLowestRoot(a,b,c,t) != 123456789)
				{
					t = getLowestRoot(a,b,c,t);
					foundCollision = true;
					collisionPoint = p3;
				}
				
				
				//Time to get edgy. By which I mean we check the edges for collisions. Put the razor blade down please.
				
				//P1 -> P2
				Vector3f edge = Vector3f.sub(p2, p1, null);
				Vector3f baseToVertex = Vector3f.sub(p1, base, null);
				float edgeSquaredLength = edge.lengthSquared();
				float edgeDotVelocity = Vector3f.dot(edge, velocity);
				float edgeDotBaseToVertex = Vector3f.dot(edge, baseToVertex);
				
				//CRAAAAAAAAAAWWWWWWWWWWWWWWWWLLLLLLLLLLLLLLLLLLLLLLIIIIIIIIIIIIIIIIINNNNNNNG  IIIIIIIINNN MY SKIIIIIIIN
				//Now, calculate paramaters for the equation
				a = (edgeSquaredLength*(-velocitySquaredLength)) + (edgeDotVelocity*edgeDotVelocity);
				b = (edgeSquaredLength*(2*Vector3f.dot(velocity, baseToVertex)))-(2*edgeDotVelocity*edgeDotBaseToVertex);
				c = (edgeSquaredLength*(1-baseToVertex.lengthSquared())) + (edgeDotBaseToVertex*edgeDotBaseToVertex);
				
				//Does the swept sphere collide against the infinite edge of the comments section on a Linkin park video?
				if(getLowestRoot(a,b,c,t) != 123456789)
				{
					//Check if intersection is within line segment
					newT = getLowestRoot(a,b,c,t);
					float f = (edgeDotVelocity * newT - edgeDotBaseToVertex)/edgeSquaredLength;
					if(f >= 0.0 && f <= 1.0)
					{
						//Intersection took place within segment
						t = newT;
						foundCollision = true;
						collisionPoint = Vector3f.add(p1, new Vector3f(f*edge.x, f*edge.y, f*edge.z), null);
					}
				}
				
				//THEEESE WOUNDS THEY WIIIILLL NO HEEAAAAAAAAL
				
				//P2 -> P3
				edge = Vector3f.sub(p3, p2, null);
				baseToVertex = Vector3f.sub(p2, base, null);
				edgeSquaredLength = edge.lengthSquared();
				edgeDotVelocity = Vector3f.dot(edge, velocity);
				edgeDotBaseToVertex = Vector3f.dot(edge, baseToVertex);
				//Recalculate paramaters;
				a = (edgeSquaredLength*(-velocitySquaredLength)) + (edgeDotVelocity*edgeDotVelocity);
				b = (edgeSquaredLength*(2*Vector3f.dot(velocity, baseToVertex)))-(2*edgeDotVelocity*edgeDotBaseToVertex);
				c = (edgeSquaredLength*(1-baseToVertex.lengthSquared())) + (edgeDotBaseToVertex*edgeDotBaseToVertex);
				
				if(getLowestRoot(a,b,c,t) != 123456789)
				{
					//Check if intersection is within line segment
					newT = getLowestRoot(a,b,c,t);
					float f = (edgeDotVelocity * newT - edgeDotBaseToVertex)/edgeSquaredLength;
					if(f >= 0.0 && f <= 1.0)
					{
						//Intersection took place within segment
						t = newT;
						foundCollision = true;
						collisionPoint = Vector3f.add(p2, new Vector3f(f*edge.x, f*edge.y, f*edge.z), null);
					}
				}
					
				//FEAR IS HOW I FAAAAAAAAAAAAALLLLLLLLLL (still not apologising)

				//P3 -> P1
				edge = Vector3f.sub(p1, p3, null);
				baseToVertex = Vector3f.sub(p3, base, null);
				edgeSquaredLength = edge.lengthSquared();
				edgeDotVelocity = Vector3f.dot(edge, velocity);
				edgeDotBaseToVertex = Vector3f.dot(edge, baseToVertex);
				//Recalculate paramaters;
				a = (edgeSquaredLength*(-velocitySquaredLength)) + (edgeDotVelocity*edgeDotVelocity);
				b = (edgeSquaredLength*(2*Vector3f.dot(velocity, baseToVertex)))-(2*edgeDotVelocity*edgeDotBaseToVertex);
				c = (edgeSquaredLength*(1-baseToVertex.lengthSquared())) + (edgeDotBaseToVertex*edgeDotBaseToVertex);
				
				if(getLowestRoot(a,b,c,t) != 123456789)
				{
					//Check if intersection is within line segment
					newT = getLowestRoot(a,b,c,t);
					float f = (edgeDotVelocity * newT - edgeDotBaseToVertex)/edgeSquaredLength;
					if(f >= 0.0 && f <= 1.0)
					{
						//Intersection took place within segment
						t = newT;
						foundCollision = true;
						collisionPoint = Vector3f.add(p3, new Vector3f(f*edge.x, f*edge.y, f*edge.z), null);
					}
				}
			}
			
			//Set the result
			if(foundCollision)
			{
				//Distance to collision where t is the time of collision
				float distToCollision = t*test.velocity.length();
				
				if(!test.didCollide || distToCollision < test.nearestDistance)
				{
					test.nearestDistance = distToCollision;
					test.intersectionPoint = collisionPoint;
					test.didCollide = true;
				}
			}
		}
	}
	
	public float getLowestRoot(float a, float b, float c, float maxR)
	{
		//Check if a solution exists
		float determinant = (b*b) - 4.0F*a*c;
		
		//If determinant is negative no solutions exist
		if(determinant < 0.0F) return 123456789;
		
		//Calculate the two roots
		float sqrtD = (float)Math.sqrt(determinant);
		float r1 = (-b - sqrtD)/(2*a);
		float r2 = (-b + sqrtD)/(2*a);
		
		//Sort so x1 <= x2
		if(r1 > r2)
		{
			float temp = r2;
			r2 = r1;
			r1 = temp;
		}
		
		if(r1 > 0 && r1 < maxR) return r1;
		
		//It is possible we need x2, this can happen if x1 < 0
		if(r2 > 0 && r2 < maxR) return r2;
		
		//If no valid solution, return a value of 123456789 as our failed number. If this actually is a valid solution then fuck me IDK what to do.
		return 123456789;
	}
	
	public boolean checkPointInTriangle(Vector3f point, Vector3f p1, Vector3f p2, Vector3f p3)
	{
		Vector3f edge1 = Vector3f.sub(p2, p1, null);
		Vector3f edge2 = Vector3f.sub(p3, p1, null);
		
		float a = Vector3f.dot(edge1, edge1);
		float b = Vector3f.dot(edge1, edge2);
		float c = Vector3f.dot(edge2, edge2);
		float acSUBbb = (a*c)-(b*b);
		
		Vector3f vp = new Vector3f(point.x - p1.x, point.y - p1.y, point.z - p1.z);
		
		float d = Vector3f.dot(vp, edge1);
		float e = Vector3f.dot(vp, edge2);
		float x = (d*c)-(e*b);
		float y = (e*a)-(d*b);
		float z = (x+y)-acSUBbb;
		
		return (z < 0 && x >= 0 && y >= 0);
	}
	
	public Vector3f ConvertR3ToESpace(Vector3f r3)
	{	
		return new Vector3f((1/eRad.x)*r3.x,(1/eRad.y)*r3.y, (1/eRad.z)*r3.z);
	}
	
	public Vector3f ConvertESpaceToR3(Vector3f esp)
	{
		return new Vector3f(esp.x/(1/eRad.x),esp.y/(1/eRad.y), esp.z/(1/eRad.z));
	}

}
