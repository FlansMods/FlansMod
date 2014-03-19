/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.math;

import java.io.Serializable;

public final class Vector3 implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Data
	 */
	public double x,y,z;

	private transient final static double e = 1e-9f;
	private transient final static double[]  epsilonVector = {e,e,e};
	public transient final static Vector3 epsilon = new Vector3(epsilonVector) ;
	public transient final static Vector3 zero = new Vector3(0,0,0);
	public transient final static Vector3 i    = new Vector3(1,0,0);
	public transient final static Vector3 j    = new Vector3(0,1,0);
	public transient final static Vector3 k    = new Vector3(0,0,1);

	public Vector3 () {
		x=0; y=0; z=0;
	}

	public Vector3( double a, double b, double c) {
		x=a; y=b; z=c;
	}

	public Vector3( Vector3 v ) {
		x=v.x; y=v.y; z = v.z;
	}

	//obtain vector from double array
	public Vector3( double[] m ) {
		x = m[0];
		y = m[1];
		z = m[2];
	}

	public final Vector3 copy() {
		return new Vector3(this);
	}

	public final Vector3 add( Vector3 v) {
		return new Vector3( x+v.x, y+v.y, z+v.z );
	}

	public final Vector3 add(double s) {
		return new Vector3( x+s, y+s, z+s );
	}

	public final Vector3 negate() {
		return new Vector3(-x,-y,-z);
	}
	
	public final boolean isNaN() {
		return Double.isNaN(x)||Double.isNaN(y)||Double.isNaN(z);
	}

	public double get( int i ) {
		return i>0?(i>1?z:y):x; 
	}

	public void set( int i, double v ) {
		if (i == 0) {
			x = v;
		} else {
			if ( i==1) {
				y=v;
			}else {
				z=v;
			}
		}
	}

	//set
	public static final void assign( Vector3 v1, Vector3 v2) {
		v1.x = v2.x;
		v1.y = v2.y;
		v1.z = v2.z;
	} 

	//add two vectors, placing result in v1
	public static final void add( Vector3 v1, Vector3 v2 ) {
		v1.x += v2.x;
		v1.y += v2.y;
		v1.z += v2.z;
	}

	//subtract two vectors, placing result in v1
	public static final void sub( Vector3 v1, Vector3 v2 ) {
		v1.x -= v2.x;
		v1.y -= v2.y;
		v1.z -= v2.z;
	}

	//subtract two vectors, placing result in result
	public static final void sub( Vector3 v1, Vector3 v2, Vector3 result ) {
		result.x = v1.x - v2.x;
		result.y = v1.y - v2.y;
		result.z = v1.z - v2.z;
	}

	public final Vector3 minus( Vector3 v) {
		return new Vector3( x-v.x, y-v.y, z-v.z );
	}
	
	/**
	 * Subtract a from b and place result in a
	 * @param a
	 * @param b
	 */
	public static final void minus( Vector3 a, Vector3 b) {
		a.x -= b.x;
		a.y -= b.y;
		a.z -= b.z;		
	}

	public final Vector3 multiply( double s ) {
		return new Vector3( x*s, y*s, z*s);
	}
	
	/**
	 * Scale vector in scale matrix given by s
	 * @param s
	 * @return
	 */
	public final Vector3 scale( Vector3 s) {
		return new Vector3(x*s.x, y*s.y, z*s.z);
	}

	public static final void  multiply( Vector3 v, double s) {
		v.x*=s; v.y*=s; v.z*=s;
	}

	public static final void  multiply( Vector3 v, double s, Vector3 result) {
		result.x = v.x*s; 
		result.y = v.y*s; 
		result.z = v.z*s;
	}

	public static final void  multiplyAndAdd( Vector3 v, double s, Vector3 result) {
		result.x += v.x*s; 
		result.y += v.y*s; 
		result.z += v.z*s;
	}

	/**
	 * Multiply v by s, and store result in v. Add v to result and store in result
	 * @param v
	 * @param s
	 * @param result
	 */
	public static final void  multiplyStoreAndAdd( Vector3 v, double s, Vector3 result) {
		v.x *= s;
		v.y *= s;
		v.z *= s;		
		result.x += v.x; 
		result.y += v.y; 
		result.z += v.z;
	}


	public final double dot( Vector3 v ) {
		return this.x*v.x+this.y*v.y+this.z*v.z;
	}
	
	// truncate the z-component
	public final double xydot( Vector3 v ) {
		return this.x*v.x+this.y*v.y;
	}


	public static final double dot(Vector3 v1,Vector3 v2) {
		return v1.x*v2.x+v1.y*v2.y+v1.z*v2.z;
	}

	//Vector3    operator% ( Vector3 const & v ) const {  return Vector3(y*v(2)-v(1)*z, v(0)*z-x*v(2), x*v(1)-v(0)*y);  }
	public final Vector3 cross( Vector3 v ) {
		return new Vector3( y*v.z-z*v.y, z*v.x-x*v.z, x*v.y-y*v.x ); 
	}

	public static final void crossProduct( Vector3 v1, Vector3 v2, Vector3 result ) {
		double tempa1 = v1.y*v2.z-v1.z*v2.y;
		double tempa2 = v1.z*v2.x-v1.x*v2.z;
		double tempa3 = v1.x*v2.y-v1.y*v2.x; 

		result.x = tempa1;
		result.y = tempa2;
		result.z = tempa3;
	}

	public final Vector3 normalize() {
		double l = (double)Math.sqrt(x*x+y*y+z*z);
		if ( l == 0.0 ) {/* System.err.println("Division by zero");*/ /*Thread.dumpStack(); System.exit(-1);*/ return new Vector3(1,0,0); } 
		return new Vector3( x/l, y/l, z/l);
	}

	public final Vector3 assign( double t1, double t2, double t3 ) {
		x = t1;
		y = t2;
		z = t3;
		return this;
	}

	public final Vector3 add( double t1, double t2, double t3 ) {
		return new Vector3( x+t1, y+t2, z+t3);
	}

	
	public final Vector3 assign( Vector3 v ) {
		double t1 =v.x;
		double t2 =v.y;
		double t3 =v.z;
		x = t1;
		y = t2;
		z = t3;
		return this;
	}

	public final Vector3 assignZero() {
		x = 0;
		y = 0;
		z = 0;
		return this;
	}


	public final boolean equals( Vector3 v ) {
		return (x==v.x && y==v.y && z==v.z );
	}

	public final double norm() {
		return (double)Math.sqrt( x*x + y*y + z*z );
	}
	
	public final double xynorm() {
		return (double)Math.sqrt( x*x + y*y );
	}

	public final double infnorm() {
		return Math.abs( x>y?x>z?x:z:y>z?y:z); 
	}


	public final double squaredNorm() {
		return x*x+y*y+z*z;
	}

	public final double[][] crossProductMatrix() {
		double [][] m = new double[3][3];

		m[0][0] =   0;  m[0][1]= -z;  m[0][2]=  y;
		m[1][0] =  z;  m[1][1]=   0;  m[1][2]= -x;
		m[2][0] = -y;  m[2][1]=  x;  m[2][2]=   0;

		return m;
	}

	public final Matrix3 crossProductMatrix(Matrix3 A) {
		Matrix3.set( A,  0,-z,  y,
				z,  0, -x,
				-y, x,   0 );

		return A;
	}

	public final Matrix3 crossProductMatrix3() {
		Matrix3 A = new Matrix3();

		Matrix3.set( A,  0,-z,  y,
				z,  0, -x,
				-y, x,   0 );

		return A;
	}

	public final double[][] transposeMatrix() {
		double [][] m = new double[3][1];

		m[0][0] = x;
		m[1][0] = y;
		m[2][0] = z;

		return m;
	}

	public final double[][] Matrix() {
		double [][] m = new double[1][3];

		m[0][0] = x;  m[0][1]= y;  m[0][2]= z;

		return m;
	}

	public final boolean lessThan(Vector3 v) {
		return (x<v.x)&&(y<v.y)&&(z<v.z);
	}

	public final boolean weaklyLessThan(Vector3 v) {
		return (x<=v.x)&&(y<=v.y)&&(z<=v.z);
	}


	public final boolean isZero() {
		return x==0&&y==0&&z==0;
	}

	public final boolean isWeaklyGreaterThanZero() {
		return x>=0&&y>=0&&z>=0;
	}

	public final Vector3 abs() {
		return new Vector3( (double)Math.abs(x), (double)Math.abs(y), (double)Math.abs(z) );
	}

	public final void print() {
		System.out.println( "[" + x + "," +y+ "," +z + "]" );
	}

	public final Vector3 cutOff(double epsilon) {
		double b1=Math.abs(x)<epsilon?0:x;
		double b2=Math.abs(y)<epsilon?0:y;
		double b3=Math.abs(z)<epsilon?0:z;
		return new Vector3(b1,b2,b3);
	}

	public final double[] pack() {
		return new double[]{x,y,z};
	}

	public final static double[] pack(Vector3 v) {
		return new double[]{v.x,v.y,v.z};
	}

	@Override
	public final String toString() {
		return  "[" + x + "," +y+ "," +z + "]"+ super.toString();
	}
}
