package org.smilead.swordoffer.problem009;

import java.util.ArrayList;

/*
 * 时间限制：1秒 空间限制：32768K 热度指数：262794
 算法知识视频讲解
题目描述
一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Problem009 {
	public int JumpFloorII(int target) {
		if(target == 1) {
			return 1;
		}
		java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
		list.add(1);
		for(int i=0;i<target-1;i++) {
			jump(list);
		}
		return list.get(target-1);
    }
	public void jump(java.util.ArrayList<Integer> list) {
		int length = list.size();
		int result = 0;
		for(int i = 0; i< length; i++) {
			result += list.get(i);
		}
		list.add(result+1);
	}
	public static void main(String[] args) {
		System.out.println(new Problem009().JumpFloorII(2));
	}
}
