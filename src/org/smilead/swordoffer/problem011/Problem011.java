package org.smilead.swordoffer.problem011;
/*
 * 时间限制：1秒 空间限制：32768K 热度指数：316922
 算法知识视频讲解
题目描述
输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示
-2147483648——2147483647 1
 */
public class Problem011 {
	 public int NumberOf1(int n) {
		 int result = 0;
		 String str = Integer.toBinaryString(n);
		 for(int i=0;i<str.length();i++) {
			 if('1'==str.charAt(i)) {
				 result++;
			 }
		 }
		return result;
    }
	 public static void main(String[] args) {
		System.out.println(new Problem011().NumberOf1(-1));
	}
}
