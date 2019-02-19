package org.smilead.swordoffer.problem021;

import java.util.Stack;

/*
 * 输入两个整数序列，第一个序列表示栈的压入顺序，
 * 请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */
public class Problem021 {
	   public boolean IsPopOrder(int [] pushA,int [] popA) {
		 Stack<Integer> stack= new Stack<>();
		 int length = popA.length;
		 int local;
		 int j=0;
		 for(int i=0;i<length;i++) {
			 if(stack.isEmpty()) {
				 stack.push(pushA[j]);
				 j++;
			 }
			 if(popA[i] == stack.peek()){
				 stack.pop();
				 continue;
			 }
			 if(j>=length) {
				 return false;
			 }

			 while (pushA[j] != popA[i]) {
				stack.push(pushA[j]);
				j++;
				if(j==length) {
					return false;
				}
			}
			 j++;
			 if(j>length) {
				 return false;
			 }
			 
		 }
		 return true;
	    }
	   public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5};
		int[] arr2 = {4,3,5,1,2};
		new Problem021().IsPopOrder(arr1, arr2);
	}
}
