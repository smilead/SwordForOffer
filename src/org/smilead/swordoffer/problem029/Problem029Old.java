package org.smilead.swordoffer.problem029;

import java.util.ArrayList;
import java.util.List;

public class Problem029Old {
//	输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
    	ArrayList<Integer> list = new ArrayList<>();
    	if(input.length<k) {
    		return list;
    	}
    	sort(input, 0, input.length-1,k);
    	for(int i=0;i<k;i++) {
    		list.add(input[i]);
    	}
    	return list;
    }
    
    public void sort(int[] input, int begin,int end,int target) {
    	if(begin>=end) {
    		return ;
    	}
    	int temp = input[begin],left=begin,right = end;
    	while(left<right) {
    		while(temp<input[right]) {
    			if(left == right) {
    				break;
    			}
    			right--;
    		}
    		if(left == right) {
    			break;
    		}
    		input[left] =input[right];
    		input[right] = temp;
    		while(temp>input[left]) {
    			left++;
    			if(left ==right) {
    				break;
    			}
    		}
    		if(left == right) {
    			break;
    		}
    		input[right] = input[left];
    		input[left]=temp;    		
    	}
    	sort(input, begin, left-1,target);
    	if(left < target) {
        	sort(input, left+1, end,target);
    	}
    }
    public static void main(String[] args) {
		int[] arr= {7,5,9,8,10,11,13,12,6,2,4,3};
		List<Integer> list = new Problem029Old().GetLeastNumbers_Solution(arr, 3);
		System.out.println(list);
	}
}
