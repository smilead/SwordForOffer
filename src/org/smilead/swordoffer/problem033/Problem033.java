package org.smilead.swordoffer.problem033;
/*
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class Problem033 {
	public int GetUglyNumber_Solution(int index){
		if(index<1) {
			return 0;
		}
		int[] uglys=new int[index];
		uglys[0]=1;
		int min;
		int m2=0;
		int m3 =0;
		int m5 = 0;
		for(int i=1;i<index;i++) {
			min = min(uglys[m2]*2,uglys[m3]*3,uglys[m5]*5);
			if(uglys[m2]*2<=min) {
				m2++;
			}
			if(uglys[m3]*3<=min) {
				m3++;
			}
			if(uglys[m5]*5<= min) {
				m5++;
			}
			uglys[i] = min;
		}
		return uglys[index-1];
	}
	public int min(int a,int b,int c) {
		if(a<b) {
			if(a<c) {
				return a;
			}else {
				return c;				
			}
		}else {
			if(b<c) {
				return b;
			}else {
				return c;
			}
		}
	}
//	  public int GetUglyNumber_Solution(int index) {
//		  if(index<1) {
//			  return 0;
//		  }
//		  int count=0,local =0;
//		  while(count != index) {
//			  local++;
//			  if(isUgly(local)) {
//				  count++;
//			  }			  
//		  }
//		  return local;
//	  }
//	  public boolean isUgly(int num) {
//		  while(num %2 ==0 ) {
//			  num = num/2;
//		  }
//		  while(num%3 == 0) {
//			  num = num/3;
//		  }
//		  while(num/5*5 == num) {
//			  num = num/5;
//		  }
//		  if(num == 1) {
//			  return true;
//		  }
//		  return false;
//	  }
	//1,2,3,4,5, 6  
	  public static void main(String[] args) {
		  
		System.out.println(new Problem033().GetUglyNumber_Solution(2));
	}
}
