/**
 * Copyright (c) 2008-2010  Morten Silcowitz.
 *
 * This file is part of the Jinngine physics library
 *
 * Jinngine is published under the GPL license, available 
 * at http://www.gnu.org/copyleft/gpl.html. 
 */
package jinngine.math;

public class Matrix4 {
	  public double a11=0, a12=0, a13=0, a14=0;
	  public double a21=0, a22=0, a23=0, a24=0;
	  public double a31=0, a32=0, a33=0, a34=0;
	  public double a41=0, a42=0, a43=0, a44=0;

	  public final static Matrix4 identity(final Matrix4 M) {
		  M.a11=1; M.a12=0; M.a13=0; M.a14=0;
		  M.a21=0; M.a22=1; M.a23=0; M.a24=0;
		  M.a31=0; M.a32=0; M.a33=1; M.a34=0;
		  M.a41=0; M.a42=0; M.a43=0; M.a44=1;
		  return M;
	  }
	  
	  public Matrix4() {}
	  
	  public Matrix4(double a11, double a12, double a13, double a14,
			         double a21, double a22, double a23, double a24,
			         double a31, double a32, double a33, double a34,
			         double a41, double a42, double a43, double a44	  
	  ) {
		  Matrix4 M = this;
		  M.a11=a11; M.a12=a12; M.a13=a13; M.a14=a14;
		  M.a21=a21; M.a22=a22; M.a23=a23; M.a24=a24;
		  M.a31=a31; M.a32=a32; M.a33=a33; M.a34=a34;
		  M.a41=a41; M.a42=a42; M.a43=a43; M.a44=a44;
	  }
	  
	  public Matrix4( Matrix4 M) {
		  Matrix4.set(M, this);
	  }
	  
	  //C = AxB 
	  public final static Matrix4 multiply( final Matrix4 A, final Matrix4 B, final Matrix4 C ) {
	    //                   B | b11 b12 b13 b14
	    //                     | b21 b22 b23 b24
	    //                     | b31 b32 b33 b34
		//                     | b41 b42 b43 b44
	    //     ----------------------------------
	    //  A  a11 a12 a13 a14 | c11 c12 c13 c14
	    //     a21 a22 a23 a24 | c21 c22 c23 c24
	    //     a31 a32 a33 a34 | c31 c32 c33 c34
	    //     a41 a42 a43 a44 | c41 c42 c43 c44
		  
	    final double t11 = A.a11*B.a11 + A.a12*B.a21 + A.a13*B.a31 + A.a14*B.a41;
	    final double t12 = A.a11*B.a12 + A.a12*B.a22 + A.a13*B.a32 + A.a14*B.a42;
	    final double t13 = A.a11*B.a13 + A.a12*B.a23 + A.a13*B.a33 + A.a14*B.a43;
	    final double t14 = A.a11*B.a14 + A.a12*B.a24 + A.a13*B.a34 + A.a14*B.a44;
	    
	    final double t21 = A.a21*B.a11 + A.a22*B.a21 + A.a23*B.a31 + A.a24*B.a41;
	    final double t22 = A.a21*B.a12 + A.a22*B.a22 + A.a23*B.a32 + A.a24*B.a42;
	    final double t23 = A.a21*B.a13 + A.a22*B.a23 + A.a23*B.a33 + A.a24*B.a43;
	    final double t24 = A.a21*B.a14 + A.a22*B.a24 + A.a23*B.a34 + A.a24*B.a44;
	    
	    final double t31 = A.a31*B.a11 + A.a32*B.a21 + A.a33*B.a31 + A.a34*B.a41;
	    final double t32 = A.a31*B.a12 + A.a32*B.a22 + A.a33*B.a32 + A.a34*B.a42;
	    final double t33 = A.a31*B.a13 + A.a32*B.a23 + A.a33*B.a33 + A.a34*B.a43;
	    final double t34 = A.a31*B.a14 + A.a32*B.a24 + A.a33*B.a34 + A.a34*B.a44;

	    final double t41 = A.a41*B.a11 + A.a42*B.a21 + A.a43*B.a31 + A.a44*B.a41;
	    final double t42 = A.a41*B.a12 + A.a42*B.a22 + A.a43*B.a32 + A.a44*B.a42;
	    final double t43 = A.a41*B.a13 + A.a42*B.a23 + A.a43*B.a33 + A.a44*B.a43;
	    final double t44 = A.a41*B.a14 + A.a42*B.a24 + A.a43*B.a34 + A.a44*B.a44;

	    
	    //copy to C
	    C.a11 = t11;
	    C.a12 = t12;
	    C.a13 = t13;
	    C.a14 = t14;
	    
	    C.a21 = t21;
	    C.a22 = t22;
	    C.a23 = t23;
	    C.a24 = t24;
	    
	    C.a31 = t31;
	    C.a32 = t32;
	    C.a33 = t33;
	    C.a34 = t34;
	    
	    C.a41 = t41;
	    C.a42 = t42;
	    C.a43 = t43;
	    C.a44 = t44;
	    
	    return C;
	  }
	  
	  /**
	   * Multiply this matrix by A and return the result
	   * @param A
	   * @return
	   */
	  public Matrix4 multiply( final Matrix4 A) {
		  Matrix4 M = new Matrix4();
		  Matrix4.multiply(this, A, M);
		  return M;
	  }
	  
	  /**
	   * 
	   * @param v
	   * @return
	   */
	  public Vector3 multiply( Vector3 v) {
		  Vector3 x = new Vector3();
		  return Matrix4.multiply(this, v, x);
	  }
	  
	  //Transform a vector in R3 to a homogeneous vector in R4, perform matrix mult,
	  //and transform back into an R3 vector  
	  //r = Av
	  public final static Vector3 multiply( final Matrix4 A, final Vector3 v, final Vector3 r ) {
		  
	    //                   V | v1
	    //                     | v2
	    //                     | v3
		//                     | 1
	    //     -----------------------
	    //  A  a11 a12 a13 a14 | c1
	    //     a21 a22 a23 a24 | c2
	    //     a31 a32 a33 a34 | c3   
	    //     a41 a42 a43 a44 | c4
		  
		  final double t1 = v.x*A.a11+v.y*A.a12+v.z*A.a13+ 1*A.a14;
		  final double t2 = v.x*A.a21+v.y*A.a22+v.z*A.a23+ 1*A.a24;
		  final double t3 = v.x*A.a31+v.y*A.a32+v.z*A.a33+ 1*A.a34;
		  final double t4 = v.x*A.a41+v.y*A.a42+v.z*A.a43+ 1*A.a44;

	    r.x = t1/t4;
	    r.y = t2/t4;
	    r.z = t3/t4;
	    
	    return r;
	  }  

	  public static final double[] pack( Matrix4 M ) {
		  double[] array = new double[4*4];
		  array[0] = M.a11;
		  array[1] = M.a21;
		  array[2] = M.a31;
		  array[3] = M.a41;
		  array[4] = M.a12;
		  array[5] = M.a22;
		  array[6] = M.a32;
		  array[7] = M.a42;
		  array[8] = M.a13;
		  array[9] = M.a23;
		  array[10] = M.a33;
		  array[11] = M.a43;
		  array[12] = M.a14;
		  array[13] = M.a24;
		  array[14] = M.a34;
		  array[15] = M.a44;
		  return array;
	  }
	  
	  public static final double[][] pack2( Matrix4 M) {
		  double[][] array = new double[4][4];
		  array[0][0] = M.a11;
		  array[1][0] = M.a21;
		  array[2][0] = M.a31;
		  array[3][0] = M.a41;
		  
		  array[0][1] = M.a12;
		  array[1][1] = M.a22;
		  array[2][1] = M.a32;
		  array[3][1] = M.a42;
		  
		  array[0][2] = M.a13;
		  array[1][2] = M.a23;
		  array[2][2] = M.a33;
		  array[3][2] = M.a43;
		  
		  array[0][3] = M.a14;
		  array[1][3] = M.a24;
		  array[2][3] = M.a34;
		  array[3][3] = M.a44;
		  return array;
	  }
	  
	  /**
	   * Fill in the matrix M with the values in array
	   * @param M
	   * @param array
	   */
	  public static final void set( Matrix4 M, double[][] array) {
		  M.a11 = array[0][0];
		  M.a21 = array[1][0] ;
		  M.a31 = array[2][0];
		  M.a41 = array[3][0];

		  M.a12 = array[0][1];
		  M.a22 = array[1][1];
		  M.a32 = array[2][1];
		  M.a42 = array[3][1];

		  M.a13 = array[0][2];
		  M.a23 = array[1][2];
		  M.a33 = array[2][2];
		  M.a43 = array[3][2];

		  M.a14 = array[0][3];
		  M.a24 = array[1][3];
		  M.a34 = array[2][3];
		  M.a44 = array[3][3];
	  }
	  
	  /**
	   * 
	   * @param M
	   * @param array
	   */
	  public static final void set( Matrix4 M, double[] array) {
		  M.a11 = array[0];
		  M.a21 = array[1];
		  M.a31 = array[2];
		  M.a41 = array[3];

		  M.a12 = array[4];
		  M.a22 = array[5];
		  M.a32 = array[6];
		  M.a42 = array[7];

		  M.a13 = array[8];
		  M.a23 = array[9];
		  M.a33 = array[10];
		  M.a43 = array[11];

		  M.a14 = array[12];
		  M.a24 = array[13];
		  M.a34 = array[14];
		  M.a44 = array[15];
	  }
	  
	  //set the Matrix from given Matrix: B = A
	  public final static void set( final Matrix4 A, final Matrix4 B ) {
	    B.a11 = A.a11; B.a12 = A.a12; B.a13 = A.a13; B.a14 = A.a14;
	    B.a21 = A.a21; B.a22 = A.a22; B.a23 = A.a23; B.a24 = A.a24;
	    B.a31 = A.a31; B.a32 = A.a32; B.a33 = A.a33; B.a34 = A.a34;
	    B.a41 = A.a41; B.a42 = A.a42; B.a43 = A.a43; B.a44 = A.a44;
	  }
	  
	  public static final Matrix4 invert( Matrix4 S) {

		  double[][] M = new double[4][4];
		  M = Matrix4.pack2(S);

		  //code borrowed from OpenTissue (thanks kenny :)
		  double a00 = M[0][0]; double a01 = M[0][1]; double a02 = M[0][2]; double a03 = M[0][3];
		  double a10 = M[1][0]; double a11 = M[1][1]; double a12 = M[1][2]; double a13 = M[1][3];
		  double a20 = M[2][0]; double a21 = M[2][1]; double a22 = M[2][2]; double a23 = M[2][3];
		  double a30 = M[3][0]; double a31 = M[3][1]; double a32 = M[3][2]; double a33 = M[3][3];

		  M[0][0] =      a11*a22*a33 - a11*a23*a32 - a21*a12*a33 + a21*a13*a32 + a31*a12*a23 - a31*a13*a22;
		  M[0][1] =    - a01*a22*a33 + a01*a23*a32 + a21*a02*a33 - a21*a03*a32 - a31*a02*a23 + a31*a03*a22;
		  M[0][2] =      a01*a12*a33 - a01*a13*a32 - a11*a02*a33 + a11*a03*a32 + a31*a02*a13 - a31*a03*a12;
		  M[0][3] =    - a01*a12*a23 + a01*a13*a22 + a11*a02*a23 - a11*a03*a22 - a21*a02*a13 + a21*a03*a12;
		  M[1][0] =    - a10*a22*a33 + a10*a23*a32 + a20*a12*a33 - a20*a13*a32 - a30*a12*a23 + a30*a13*a22;
		  M[1][1] =      a00*a22*a33 - a00*a23*a32 - a20*a02*a33 + a20*a03*a32 + a30*a02*a23 - a30*a03*a22;
		  M[1][2] =    - a00*a12*a33 + a00*a13*a32 + a10*a02*a33 - a10*a03*a32 - a30*a02*a13 + a30*a03*a12;
		  M[1][3] =      a00*a12*a23 - a00*a13*a22 - a10*a02*a23 + a10*a03*a22 + a20*a02*a13 - a20*a03*a12;
		  M[2][0] =      a10*a21*a33 - a10*a23*a31 - a20*a11*a33 + a20*a13*a31 + a30*a11*a23 - a30*a13*a21;
		  M[2][1] =    - a00*a21*a33 + a00*a23*a31 + a20*a01*a33 - a20*a03*a31 - a30*a01*a23 + a30*a03*a21;
		  M[2][2] =      a00*a11*a33 - a00*a13*a31 - a10*a01*a33 + a10*a03*a31 + a30*a01*a13 - a30*a03*a11;
		  M[2][3] =    - a00*a11*a23 + a00*a13*a21 + a10*a01*a23 - a10*a03*a21 - a20*a01*a13 + a20*a03*a11;
		  M[3][0] =    - a10*a21*a32 + a10*a22*a31 + a20*a11*a32 - a20*a12*a31 - a30*a11*a22 + a30*a12*a21;
		  M[3][1] =      a00*a21*a32 - a00*a22*a31 - a20*a01*a32 + a20*a02*a31 + a30*a01*a22 - a30*a02*a21;
		  M[3][2] =    - a00*a11*a32 + a00*a12*a31 + a10*a01*a32 - a10*a02*a31 - a30*a01*a12 + a30*a02*a11;
		  M[3][3] =      a00*a11*a22 - a00*a12*a21 - a10*a01*a22 + a10*a02*a21 + a20*a01*a12 - a20*a02*a11;
		  //double D =
			  //  (
					  //       a00*a11*a22*a33 - a00*a11*a23*a32 - a00*a21*a12*a33 + a00*a21*a13*a32 + a00*a31*a12*a23 - a00*a31*a13*a22
		  //     - a10*a01*a22*a33 + a10*a01*a23*a32 + a10*a21*a02*a33 - a10*a21*a03*a32 - a10*a31*a02*a23 + a10*a31*a03*a22
		  //     + a20*a01*a12*a33 - a20*a01*a13*a32 - a20*a11*a02*a33 + a20*a11*a03*a32 + a20*a31*a02*a13 - a20*a31*a03*a12
		  //     - a30*a01*a12*a23 + a30*a01*a13*a22 + a30*a11*a02*a23 - a30*a11*a03*a22 - a30*a21*a02*a13 + a30*a21*a03*a12
		  //  );
		  double D = a00*M[0][0] + a10*M[0][1] +  a20*M[0][2] + a30*M[0][3];
		  if(D != 0)
		  {
			  M[0][0] /=D; M[0][1] /=D; M[0][2] /=D; M[0][3] /=D;
			  M[1][0] /=D; M[1][1] /=D; M[1][2] /=D; M[1][3] /=D;
			  M[2][0] /=D; M[2][1] /=D; M[2][2] /=D; M[2][3] /=D;
			  M[3][0] /=D; M[3][1] /=D; M[3][2] /=D; M[3][3] /=D;
		  }

		  //copy new values
		  Matrix4.set(S, M);
		  
		  return S;

	  }
		
}
