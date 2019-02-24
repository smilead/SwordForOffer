package org.smilead.swordoffer.problem042;

import java.util.ArrayList;

/*
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的
 */
public class Problem042 {
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		int max = Integer.MAX_VALUE;
        ArrayList<Integer> result = new ArrayList<>();
        for(int left = 0; left<array.length;left++) {
        	for(int right = array.length-1;right>left &&array[left]+array[right]>=sum;right--) {
        		if(array[left]+array[right]==sum) {
        			if(array[left]*array[right]<max) {
        				result = new ArrayList<>();
        				result.add(array[left]);
        				result.add(array[right]);
        				max = array[left]*array[right];
        			}
        			break;
        		}
        	}
        	if(array[left]>sum) {
        		break;
        	}
        }
        return result;
    }
	public static void main(String[] args) {
		int sum = 10;
		int[] array = {1,2,4,7,11,16};
		ArrayList<Integer> list =new Problem042().FindNumbersWithSum(array, sum);
		System.out.println(list);
	}
}
