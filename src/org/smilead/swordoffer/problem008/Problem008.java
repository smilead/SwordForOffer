package org.smilead.swordoffer.problem008;

/*
 * 时间限制：1秒 空间限制：32768K 热度指数：331945
 算法知识视频讲解
题目描述
一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class Problem008 {
	 public int JumpFloor(int target) {
		 if(target == 1) {
			 return 1;
		 }
		 int m =target/2;
		 int result =1;
		 for(int i = 1; i <= m ;i++) {
			 result = result + cMN(i, target-i);
		 }
		 return result;
	 }
	 
	 public int cMN(int m,int n) {
		 
		 long child=1,parent=n;
		 
		 for(int i=1;i<m;i++) {
			 child = child * (i+1);
			 parent = parent * (n-i);
		 }
	//	 System.out.println(child+"p"+parent);
		 System.out.println(parent);
		 
		 long result = parent/child;
		 
		 return (int)result;
	 }
	 public static void main(String[] args) {
		 int m = Integer.MAX_VALUE;
		 System.out.println(m);
		System.out.println(new Problem008().JumpFloor(29));
	}
}
