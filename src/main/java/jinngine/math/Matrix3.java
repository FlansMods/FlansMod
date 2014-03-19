/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.math;

//3x3 matrix for optimized matrix ops


/**
 * A 3x3 matrix implementation
 */
public class Matrix3 {
  public double a11=0, a12=0, a13=0;
  public double a21=0, a22=0, a23=0;
  public double a31=0, a32=0, a33=0;

  public static final Matrix3 zero = new Matrix3(0);
  
  public Matrix3() {
  }
  
  /**
   * Construct a 3x3 matrix using specified fields
   * @param a11
   * @param a12
   * @param a13
   * @param a21
   * @param a22
   * @param a23
   * @param a31
   * @param a32
   * @param a33
   */
  public Matrix3(double a11, double a12, double a13, double a21, double a22,
		double a23, double a31, double a32, double a33) {
	super();
	this.a11 = a11;
	this.a12 = a12;
	this.a13 = a13;
	this.a21 = a21;
	this.a22 = a22;
	this.a23 = a23;
	this.a31 = a31;
	this.a32 = a32;
	this.a33 = a33;
}

 /**
  * create a 3x3 matrix using a set of basis vectors
  * @param e1
  * @param e2
  * @param e3
  */
  public Matrix3( Vector3 e1, Vector3 e2, Vector3 e3) {
    a11 = e1.x;
    a21 = e1.y;
    a31 = e1.z;
    
    a12 = e2.x;
    a22 = e2.y;
    a32 = e2.z;
    
    a13 = e3.x;
    a23 = e3.y;
    a33 = e3.z;
  }
  
  /**
   * Construct a new 3x3 matrix as a copy of the given matrix B
   * @param B
   */
  public Matrix3( Matrix3 B) {
	  this.a11 = B.a11; this.a12 = B.a12; this.a13 = B.a13;
	  this.a21 = B.a21; this.a22 = B.a22; this.a23 = B.a23;
	  this.a31 = B.a31; this.a32 = B.a32; this.a33 = B.a33;
  }
  
  public Matrix3( Matrix4 B) {
	  this.a11 = B.a11; this.a12 = B.a12; this.a13 = B.a13;
	  this.a21 = B.a21; this.a22 = B.a22; this.a23 = B.a23;
	  this.a31 = B.a31; this.a32 = B.a32; this.a33 = B.a33;
  }

  /**
   * assign the value of B to this Matrix3
   * @param B 
   */
  public void assign(Matrix3 B) {
	  this.a11 = B.a11; this.a12 = B.a12; this.a13 = B.a13;
	  this.a21 = B.a21; this.a22 = B.a22; this.a23 = B.a23;
	  this.a31 = B.a31; this.a32 = B.a32; this.a33 = B.a33;	  
  }
  
  /**
   * Get the n'th column vector of this matrix
   * @param n
   * @return
   */
  public Vector3 column(int n) {
	  switch (n) {
	  case 0:
		  return new Vector3(a11,a21,a31);
	  case 1:
		  return new Vector3(a12,a22,a32);
	  case 2:
		  return new Vector3(a13,a23,a33);
	  }
	return null;	  
  }
  
  /**
   * Get the n'th row vector of this matrix
   * @param n
   * @return
   */
  public Vector3 row(int n) {
	  switch (n) {
	  case 0:
		  return new Vector3(a11,a12,a13);
	  case 1:
		  return new Vector3(a21,a22,a23);
	  case 2:
		  return new Vector3(a31,a32,a33);
	  }
	return null;	  
  }

  
  /**
   * Get all column vectors of this matrix
   * @param r1
   * @param r2
   * @param r3
   */
  public void getColumnVectors( Vector3 r1, Vector3 r2, Vector3 r3) {
	  r1.x = a11;
	  r1.y = a21;
	  r1.z = a31;

	  r2.x = a12;
	  r2.y = a22;
	  r2.z = a32;
	  
	  r3.x = a13;
	  r3.y = a23;
	  r3.z = a33;
  }
  
  /**
   * Get all row vectors of this matrix
   * @param r1
   * @param r2
   * @param r3
   */
  public void getRowVectors( Vector3 r1, Vector3 r2, Vector3 r3) {
	  r1.x = a11;
	  r1.y = a12;
	  r1.z = a13;

	  r2.x = a21;
	  r2.y = a22;
	  r2.z = a23;
	  
	  r3.x = a31;
	  r3.y = a32;
	  r3.z = a33;
  }
  
  /**
   * 
   * @param s
   */
  public Matrix3(int s) {
    Matrix3.multiply( this,0,this);
  } 
  
  /**
   * Return a new identity Matrix3 instance
   * @return
   */
  public static Matrix3 identity() {
	  Matrix3 A = new Matrix3();
	  A.a11 = 1; A.a12 = 0; A.a13 = 0;
	  A.a21 = 0; A.a22 = 1; A.a23 = 0;
	  A.a31 = 0; A.a32 = 0; A.a33 = 1;
	  
	  return A;
  }
  
  /**
   * Multiply this matrix by a scalar, return the resulting matrix
   * @param s
   * @return
   */
  public final Matrix3 multiply( double s) {
	  Matrix3 A = new Matrix3();
	  A.a11 = a11*s; A.a12 = a12*s; A.a13 = a13*s;
	  A.a21 = a21*s; A.a22 = a22*s; A.a23 = a23*s;
	  A.a31 = a31*s; A.a32 = a32*s; A.a33 = a33*s;	  
	  return A;
  }
  
  /**
   * Right-multiply by a scaling matrix given by s, so M.scale(s) = M S(s)
   * @param s
   * @return
   */
  public final Matrix3 scale( Vector3 s ) {
	  Matrix3 A = new Matrix3();
	  A.a11 = a11*s.x; A.a12 = a12*s.y; A.a13 = a13*s.z;
	  A.a21 = a21*s.x; A.a22 = a22*s.y; A.a23 = a23*s.z;
	  A.a31 = a31*s.x; A.a32 = a32*s.y; A.a33 = a33*s.z;	  
	  return A;
  }
  
  /**
   * Multiply this matrix by the matrix A and return the result
   * @param A
   * @return
   */
  public Matrix3 multiply(Matrix3 A) {
	  Matrix3 R = new Matrix3();
	  multiply(this,A,R);
	  return R;
  }
  
  //C = AxB 
  public final static Matrix3 multiply( final Matrix3 A, final Matrix3 B, final Matrix3 C ) {
    //               B | b11 b12 b13
    //                 | b21 b22 b23
    //                 | b31 b32 b33
    //     -------------------------
    //  A  a11 a12 a13 | c11 c12 c13
    //     a21 a22 a23 | c21 c22 c23
    //     a31 a32 a33 | c31 c32 c33  C
    
    double t11 = A.a11*B.a11 + A.a12*B.a21 + A.a13*B.a31; 
    double t12 = A.a11*B.a12 + A.a12*B.a22 + A.a13*B.a32;
    double t13 = A.a11*B.a13 + A.a12*B.a23 + A.a13*B.a33;
    
    double t21 = A.a21*B.a11 + A.a22*B.a21 + A.a23*B.a31;
    double t22 = A.a21*B.a12 + A.a22*B.a22 + A.a23*B.a32;
    double t23 = A.a21*B.a13 + A.a22*B.a23 + A.a23*B.a33;
    
    double t31 = A.a31*B.a11 + A.a32*B.a21 + A.a33*B.a31;
    double t32 = A.a31*B.a12 + A.a32*B.a22 + A.a33*B.a32;
    double t33 = A.a31*B.a13 + A.a32*B.a23 + A.a33*B.a33;

    //copy to C
    C.a11 = t11;
    C.a12 = t12;
    C.a13 = t13;
    
    C.a21 = t21;
    C.a22 = t22;
    C.a23 = t23;
    
    C.a31 = t31;
    C.a32 = t32;
    C.a33 = t33;

    return C;
  }
  
  //functional
  /**
   * Multiply a vector by this matrix, return the resulting vector
   */
  public final Vector3 multiply( final Vector3 v) {
	  Vector3 r = new Vector3();
	  Matrix3.multiply(this, v, r);
	  return r;
  }
  
  //C = As 
  public final static Matrix3 multiply( final Matrix3 A, final double s, final Matrix3 C ) {
    double t11 = A.a11*s; double t12 = A.a12*s; double t13 = A.a13*s;
    double t21 = A.a21*s; double t22 = A.a22*s; double t23 = A.a23*s;
    double t31 = A.a31*s; double t32 = A.a32*s; double t33 = A.a33*s;
    
    C.a11 = t11; C.a12 = t12; C.a13 = t13;
    C.a21 = t21; C.a22 = t22; C.a23 = t23;
    C.a31 = t31; C.a32 = t32; C.a33 = t33;

    return C;
  }
  
  //A = A^T 
  public final static Matrix3 transpose( final Matrix3 A ) {
    double t11 = A.a11; double t12 = A.a12; double t13 = A.a13;
    double t21 = A.a21; double t22 = A.a22; double t23 = A.a23;
    double t31 = A.a31; double t32 = A.a32; double t33 = A.a33;
    
    A.a11 = t11; A.a12 = t21; A.a13 = t31;
    A.a21 = t12; A.a22 = t22; A.a23 = t32;
    A.a31 = t13; A.a32 = t23; A.a33 = t33;

    return A;
  }
  
  /**
   * Functional method. Transpose this matrix and return the result
   * @return
   */
  public final Matrix3 transpose() {
	  Matrix3 A = new Matrix3(this);
	  Matrix3.transpose(A);
	  return A;
  }


  //C = A-B
  public final static void subtract( final Matrix3 A, final Matrix3 B, final Matrix3 C ) {
    double t11 = A.a11-B.a11; double t12 = A.a12-B.a12; double t13 = A.a13-B.a13;
    double t21 = A.a21-B.a21; double t22 = A.a22-B.a22; double t23 = A.a23-B.a23;
    double t31 = A.a31-B.a31; double t32 = A.a32-B.a32; double t33 = A.a33-B.a33;

    C.a11 = t11; C.a12 = t12; C.a13 = t13;
    C.a21 = t21; C.a22 = t22; C.a23 = t23;
    C.a31 = t31; C.a32 = t32; C.a33 = t33;
  }

  /**
   * Add to this matrix the matrix B, return result in a new matrix instance
   * @param B
   * @return
   */
  public Matrix3 add( Matrix3 B ) {
	  Matrix3 A = new Matrix3(this);
	  Matrix3.add(A, B, A);
	  return A;
  }
  
  //C = A+B
  public final static void add( final Matrix3 A, final Matrix3 B, final Matrix3 C ) {
    double t11 = A.a11+B.a11; double t12 = A.a12+B.a12; double t13 = A.a13+B.a13;
    double t21 = A.a21+B.a21; double t22 = A.a22+B.a22; double t23 = A.a23+B.a23;
    double t31 = A.a31+B.a31; double t32 = A.a32+B.a32; double t33 = A.a33+B.a33;
    
    C.a11 = t11; C.a12 = t12; C.a13 = t13;
    C.a21 = t21; C.a22 = t22; C.a23 = t23;
    C.a31 = t31; C.a32 = t32; C.a33 = t33;
  }
  
  // rT = (vT)A   NOTE that the result of this is actually a transposed vector!! 
  public final static Vector3 transposeVectorAndMultiply( final Vector3 v, final Matrix3 A, final Vector3 r ){
    //            A  | a11 a12 a13
    //               | a21 a22 a23
    //               | a31 a32 a33
    //      ----------------------
    // vT   v1 v2 v3 |  c1  c2  c3
    
    double t1 = v.x*A.a11+v.y*A.a21+v.z*A.a31;
    double t2 = v.x*A.a12+v.y*A.a22+v.z*A.a32;
    double t3 = v.x*A.a13+v.y*A.a23+v.z*A.a33;
    
    r.x = t1;
    r.y = t2;
    r.z = t3;

    return r;
  }

  /**
   * Multiply v by A, and place result in r, so r = Av
   * @param A 3 by 3 matrix
   * @param v Vector to be multiplied
   * @param r Vector to hold result of multiplication
   * @return Reference to the given Vector3 r instance
   */
  public final static Vector3 multiply( final Matrix3 A, final Vector3 v, final Vector3 r ) {
    //                   
    //               V | v1
    //                 | v2
    //                 | v3                     
    //     -----------------
    //  A  a11 a12 a13 | c1
    //     a21 a22 a23 | c2
    //     a31 a32 a33 | c3   
    
    double t1 = v.x*A.a11+v.y*A.a12+v.z*A.a13;
    double t2 = v.x*A.a21+v.y*A.a22+v.z*A.a23;
    double t3 = v.x*A.a31+v.y*A.a32+v.z*A.a33;
    
    r.x = t1;
    r.y = t2;
    r.z = t3;
    
    return r;
  }  

  /**
   * Compute the determinant of Matrix3 A
   * @param A
   * @return 
   */
  public final static double determinant( final Matrix3 A ) {
	  return A.a11*A.a22*A.a33- A.a11*A.a23*A.a32 + A.a21*A.a32*A.a13 - A.a21*A.a12*A.a33 + A.a31*A.a12*A.a23-A.a31*A.a22*A.a13;
  }
  
/**
 * Compute the inverse of the matrix A, place the result in C
 */
  public final static Matrix3 inverse( final Matrix3 A, final Matrix3 C ) {
    double t11 =  (A.a22*A.a33-A.a23*A.a32)/(A.a31*A.a12*A.a23-A.a31*A.a13*A.a22-A.a21*A.a12*A.a33+A.a21*A.a13*A.a32+A.a11*A.a22*A.a33-A.a11*A.a23*A.a32); 
    double t12 = -(A.a12*A.a33-A.a13*A.a32)/(A.a31*A.a12*A.a23-A.a31*A.a13*A.a22-A.a21*A.a12*A.a33+A.a21*A.a13*A.a32+A.a11*A.a22*A.a33-A.a11*A.a23*A.a32); 
    double t13 =  (A.a12*A.a23-A.a13*A.a22)/(A.a31*A.a12*A.a23-A.a31*A.a13*A.a22-A.a21*A.a12*A.a33+A.a21*A.a13*A.a32+A.a11*A.a22*A.a33-A.a11*A.a23*A.a32);
    double t21 = -(-A.a31*A.a23+A.a21*A.a33)/(A.a31*A.a12*A.a23-A.a31*A.a13*A.a22-A.a21*A.a12*A.a33+A.a21*A.a13*A.a32+A.a11*A.a22*A.a33-A.a11*A.a23*A.a32);
    double t22 =  (-A.a31*A.a13+A.a11*A.a33)/(A.a31*A.a12*A.a23-A.a31*A.a13*A.a22-A.a21*A.a12*A.a33+A.a21*A.a13*A.a32+A.a11*A.a22*A.a33-A.a11*A.a23*A.a32);
    double t23 = -(-A.a21*A.a13+A.a11*A.a23)/(A.a31*A.a12*A.a23-A.a31*A.a13*A.a22-A.a21*A.a12*A.a33+A.a21*A.a13*A.a32+A.a11*A.a22*A.a33-A.a11*A.a23*A.a32); 
    double t31 =  (-A.a31*A.a22+A.a21*A.a32)/(A.a31*A.a12*A.a23-A.a31*A.a13*A.a22-A.a21*A.a12*A.a33+A.a21*A.a13*A.a32+A.a11*A.a22*A.a33-A.a11*A.a23*A.a32);
    double t32 = -(-A.a31*A.a12+A.a11*A.a32)/(A.a31*A.a12*A.a23-A.a31*A.a13*A.a22-A.a21*A.a12*A.a33+A.a21*A.a13*A.a32+A.a11*A.a22*A.a33-A.a11*A.a23*A.a32);
    double t33 =  (-A.a21*A.a12+A.a11*A.a22)/(A.a31*A.a12*A.a23-A.a31*A.a13*A.a22-A.a21*A.a12*A.a33+A.a21*A.a13*A.a32+A.a11*A.a22*A.a33-A.a11*A.a23*A.a32);
    
    C.a11 = t11; C.a12 = t12; C.a13 = t13;
    C.a21 = t21; C.a22 = t22; C.a23 = t23;
    C.a31 = t31; C.a32 = t32; C.a33 = t33;
    return C;
  }
  
  public final Matrix3 inverse() {
	  Matrix3 I = new Matrix3();
	  Matrix3.inverse(this, I);
	  return I;
  }
  
  //set the Matrix from a double[][] array
  /**
   * Set the entries of the matrix A, using the double array matrixArray
   */
  public final static void set( double[][] matrixArray, final Matrix3 A ) {
    A.a11 = matrixArray[0][0]; A.a12 = matrixArray[0][1]; A.a13 = matrixArray[0][2];
    A.a21 = matrixArray[1][0]; A.a22 = matrixArray[1][1]; A.a23 = matrixArray[1][2];
    A.a31 = matrixArray[2][0]; A.a32 = matrixArray[2][1]; A.a33 = matrixArray[2][2];
  }
  
  //set the Matrix from given Matrix: B = A
  public final static void set( final Matrix3 A, final Matrix3 B ) {
    B.a11 = A.a11; B.a12 = A.a12; B.a13 = A.a13;
    B.a21 = A.a21; B.a22 = A.a22; B.a23 = A.a23;
    B.a31 = A.a31; B.a32 = A.a32; B.a33 = A.a33;
  }
  
  public final static void set( Matrix3 A, double p11, double p12, double p13,
                                double p21, double p22, double p23,
                                double p31, double p32, double p33) {
    A.a11 = p11; A.a12 = p12; A.a13 = p13;
    A.a21 = p21; A.a22 = p22; A.a23 = p23;
    A.a31 = p31; A.a32 = p32; A.a33 = p33;
  }
  
  //C = I
  public final static Matrix3 identity( final Matrix3 C ) {
    C.a11 = 1; C.a12 = 0; C.a13 = 0;
    C.a21 = 0; C.a22 = 1; C.a23 = 0;
    C.a31 = 0; C.a32 = 0; C.a33 = 1;
    return C;
  } 

  //C = S(s)
  public final static Matrix3 scale( final Matrix3 C, Vector3 s ) {
    C.a11 = s.x; C.a12 = 0; C.a13 = 0;
    C.a21 = 0; C.a22 = s.y; C.a23 = 0;
    C.a31 = 0; C.a32 = 0; C.a33 = s.z;
    return C;
  } 
  
  public final static Matrix3 diagonal( Vector3 d) {
	  Matrix3 C = new Matrix3();
	  C.a11 = d.x; C.a12 = 0; C.a13 = 0;
	  C.a21 = 0; C.a22 = d.y; C.a23 = 0;
	  C.a31 = 0; C.a32 = 0; C.a33 = d.z;
	  return C;	  
  }
  
  public final Matrix3 copy() {
	  Matrix3 M = new Matrix3();
	  Matrix3.set(this, M);
	  return M;
  }

  
  public final static void print( final Matrix3 A ) {
    System.out.println("[ "+A.a11+" , " + A.a12 + " , " + A.a13 + " ]" );
    System.out.println("[ "+A.a21+" , " + A.a22 + " , " + A.a23 + " ]" );
    System.out.println("[ "+A.a31+" , " + A.a32 + " , " + A.a33 + " ]" );
  }
  
  /**
   * Check matrix for NaN values 
   */
  public final boolean isNaN() {
	  return Double.isNaN(a11)||Double.isNaN(a12)||Double.isNaN(a13)
	  || Double.isNaN(a21)||Double.isNaN(a22)||Double.isNaN(a23)
	  || Double.isNaN(a31)||Double.isNaN(a32)||Double.isNaN(a33);
  }
  
  public static final double[] pack( Matrix3 M ) {
	  double[] array = new double[3*3];
	  array[0] = M.a11;
	  array[1] = M.a21;
	  array[2] = M.a31;
	  array[3] = M.a12;
	  array[4] = M.a22;
	  array[5] = M.a32;
	  array[6] = M.a13;
	  array[7] = M.a23;
	  array[8] = M.a33;
	  return array;
  }


}
