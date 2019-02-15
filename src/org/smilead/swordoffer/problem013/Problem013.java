package org.smilead.swordoffer.problem013;
/*
 * 时间限制：1秒 空间限制：32768K 热度指数：381307
本题知识点： 数组
 算法知识视频讲解
题目描述
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变
 */
public class Problem013 {
	 public void reOrderArray(int [] array) {
		 int[] arr = new int[array.length];
		 int m = 0;
		 for(int i = 0; i<array.length; i++) {
			 if(judge(array[i])) {
				 arr[m]=array[i];
				 m++;
			 }
		 }
		 for(int i = 0; i<array.length; i++) {
			 if(!judge(array[i])) {
				 arr[m]=array[i];
				 m++;
			 }
		 }
		 array= arr.clone();
		 System.out.println(array.toString());
		 for(int i =0;i<array.length;i++) {
			 System.out.println(array[i]);
		 }
	 }
	 public boolean judge(int val) {
		 if(val%2==1) {
			 return true;
		 }else {
			 return false;
		 }
	 }
	 public static void main(String[] args) {
		new Problem013().reOrderArray(new int[]{1,2,3,4,5,6,7});
	}
}
