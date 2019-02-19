package org.smilead.swordoffer.problem020;
/*
 * 题目描述
定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */

import java.util.Stack;

public class Problem020 {
	Stack<Integer> stack=new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();
	int temp=Integer.MAX_VALUE;
	  public void push(int node) {
		  if(node<temp) {
			  temp=node;
		  }
		  stack.push(node);
		  minStack.push(temp);
	    }
	    
	    public void pop() {
	        stack.pop();
	        minStack.pop();
	        temp =minStack.peek();
	    }
	    
	    public int top() {
	        return stack.peek();
	    }
	    
	    public int min() {
	        return temp;
	    }
}
