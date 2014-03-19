package jinngine.geometry.contact;

import java.util.Iterator;

import jinngine.geometry.Box;
import jinngine.geometry.Geometry;
import jinngine.math.Matrix3;
import jinngine.math.Vector3;
import jinngine.physics.Body;

public class BulletNativeContactGenerator implements ContactGenerator {

	private final Geometry Sa,Sb;
	private int N = 8;
	private ContactPoint[] contacts = new ContactPoint[N];
	private int[] record = new int[8];
	private double envelope = 0.125;
	
	public BulletNativeContactGenerator(Geometry Sa, Geometry Sb) {
		//System.out.println("setup");
		// create some contact points
		for (int i=0;i<N;i++)
			contacts[i] = new ContactPoint();
		
		this.Sa = Sa;
		this.Sb = Sb;
			
		//shape points
		double[] shapeA = pointsFromGeometry(Sa), shapeB = pointsFromGeometry(Sb);	
		bulletSetup( record, shapeA, shapeA.length/3,  shapeB, shapeB.length/3 );
		
	}
	
	private final double[] pointsFromGeometry( Geometry g ) {
		if ( g instanceof Box ) {
			Box b = (Box)g;			
			Vector3 dims = b.getDimentions();
			double[] points = 
				new double[] { 
					dims.x*0.5,  dims.y*0.5,  dims.z*0.5,
					dims.x*-0.5, dims.y*0.5,  dims.z*0.5,
					dims.x*0.5,  dims.y*-0.5, dims.z*0.5,
					dims.x*-0.5, dims.y*-0.5, dims.z*0.5,
					dims.x*0.5,  dims.y*0.5,  dims.z*-0.5,
					dims.x*-0.5, dims.y*0.5,  dims.z*-0.5,
					dims.x*0.5,  dims.y*-0.5, dims.z*-0.5,
					dims.x*-0.5, dims.y*-0.5, dims.z*-0.5};
			
			return points;
		}	
		/* 
		if ( g instanceof ConvexHull ) {
			ConvexHull hull = (ConvexHull)g;
			int n = hull.getNumberOfVertices();
			double points[] = new double[n*3];
			int i = 0; Iterator<Vector3> iter = hull.getVertices(); 

			Matrix3 T = new Matrix3();
			Vector3 t = new Vector3();
			g.getLocalTransform(T, t);
	
			while(iter.hasNext()){
				Vector3 v = iter.next().copy();
				
				//apply any local transform now
				Matrix3.multiply(T,v,v);
				Vector3.add( v, t);
				
				points[i] = v.x;
				points[i+1] = v.y;
				points[i+2] = v.z;
				i=i+3;				
			}
			return points;
			
		}
		*/
		return null;
	}
	
	@Override
	public Iterator<ContactPoint> getContacts() {
		return new Iterator<ContactPoint>() {
			private int i= 0;
			@Override
			public boolean hasNext()  {
				return i<N;
//				return false;
			}
			@Override
			public ContactPoint next() {
				if (i<N)
					return contacts[i++];
				else 
					return null;
			}
			@Override
			public void remove() {
				// TODO Auto-generated method stub				
			}
		};
	}

	@Override
	public void run() {
		Body A = Sa.getBody();
		Body B = Sb.getBody();
		int numberOfContacts = 0;
		
		numberOfContacts = bulletRunContactGeneration(
				record,
				Matrix3.pack(A.state.rotation), Vector3.pack(A.state.position), 
				Matrix3.pack(B.state.rotation), Vector3.pack(B.state.position) );
		
//		System.out.println("Contacts from bullet: " + numberOfContacts);
		
		// setup space for data
		double[] normals = new double[numberOfContacts*3];
		double[] paws = new double[numberOfContacts*3];
		double[] pbws = new double[numberOfContacts*3];
		double[] dists = new double[numberOfContacts];
	
		// get data
		bulletGetContactPoints( record, normals, paws, pbws, dists );
		
		// fill in contact points
		int c = 0;
		for (int i=0; i<numberOfContacts; i++) {
			if (  dists[i] < envelope ) {
				contacts[c].b1 = A;
				contacts[c].b2 = B;
				contacts[c].normal.x = normals[i*3];
				contacts[c].normal.y = normals[i*3+1];
				contacts[c].normal.z = normals[i*3+2];
				contacts[c].paw.x = paws[i*3];
				contacts[c].paw.y = paws[i*3+1];
				contacts[c].paw.z = paws[i*3+2];
				contacts[c].pbw.x = pbws[i*3];
				contacts[c].pbw.y = pbws[i*3+1];
				contacts[c].pbw.z = pbws[i*3+2];
				contacts[c].point.assign( contacts[c].paw.add(contacts[c].pbw).multiply(0.5) );
				contacts[c].distance = dists[i];
				//			contacts[i].depth = -dists[i];
				contacts[c].depth = 0.125*0.5-dists[i]; // Math.max(0,-dists[i]);//
//				System.out.println(i+"'th contact "+contacts[c].distance);
				//contacts[i].midpoint.print();
				//contacts[i].normal.print();
				contacts[c].restitution = 0.7;
				contacts[c].friction = 0.5;
				c = c+1;				
			}
		}
		
		N = c;		
	}
	
	private native void bulletSetup( int[] record, double[] shapeA, int apoints, double[] shapeB, int bpoints);	
	
	private native int bulletRunContactGeneration(
			int[] record,
			double[] transformA, double[] posA, 
			double[] transformB, double[] posB );
	
	private native void bulletGetContactPoints(
			int[] record,
			double[] normals, 
			double[] paws, 
			double[] pbws, 
			double[] dists );
	
	private native void bulletCleanup( int[] record );
	
	static {
		System.loadLibrary("LinearMath");
		System.loadLibrary("BulletCollision");
		System.loadLibrary("BulletDynamics");
		System.loadLibrary("BulletNativeContactGenerator");
		
	}

	@Override
	public final void remove() {
		// free memory in the native bullet impl.
		//System.out.println("clean");
		bulletCleanup(record);
	}

}
