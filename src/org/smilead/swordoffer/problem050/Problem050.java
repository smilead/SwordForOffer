package org.smilead.swordoffer.problem050;

import java.util.HashMap;
import java.util.HashSet;

public class Problem050 {
	   // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,
	//so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false

	public boolean duplicate(int numbers[],int length,int [] duplication) {
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0 ;i< length;i++) {
			if(set.contains(numbers[i])) {
				duplication[0] = numbers[i];
				return true;
			}else {
				set.add(numbers[i]);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr = {2,1,3,1,4};
		int[] result = new int[1];
		System.out.println(new Problem050().duplicate(arr, 5, result));
	}
}
