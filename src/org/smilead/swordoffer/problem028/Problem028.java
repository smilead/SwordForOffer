package org.smilead.swordoffer.problem028;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0
 */
public class Problem028 {
	public int MoreThanHalfNum_Solution(int [] array) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0;i< array.length;i++) {
			if(map.get(array[i]) == null) {
				map.put(array[i], 1);
			}else {
				int m = map.get(array[i])+1;
				System.out.println(m);
				map.put(array[i],map.get(array[i])+1);	
			}
		}
		Set<Integer> keys=map.keySet();
		for(int key:keys) {
			if(map.get(key)*2>=array.length) {
				return key;
			}
		}
		return 0;
    }
	public static void main(String[] args) {
System.out.println(		new Problem028().MoreThanHalfNum_Solution(new int[]{1,2,3,2,4,2,5,2,3}));
	}
}
