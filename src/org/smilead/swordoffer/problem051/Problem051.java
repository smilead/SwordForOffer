package org.smilead.swordoffer.problem051;
/*
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法
 */
public class Problem051 {
	  public int[] multiply(int[] A) {
		  int[] result = new int[A.length];
		  for(int i = 0 ;i<result.length;i++) {
			  result[i] = 1;
		  }
		  for(int i = 0;i<result.length;i++) {
			  calculate(A, result, i);
		  }
		  return result;
	    }
	  public void calculate(int[] A,int[] result,int index) {
		  for(int i = 0;i< A.length;i++) {
			  if(index == i) {
				  continue;
			  }else {
				  result[index]*=A[i];
			  }
		  }
	  }
}
