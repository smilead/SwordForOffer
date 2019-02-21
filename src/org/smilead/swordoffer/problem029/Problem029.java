package org.smilead.swordoffer.problem029;

import java.util.ArrayList;

public class Problem029 {
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> result = new ArrayList<>();
		if(k==0||k>input.length) {
			return result;
		}
		for(int i = 0; i<input.length;i++) {
			judge(input[i], result, k);
		}
		return result;
	}
	public void judge(int num,ArrayList<Integer> list,int k) {
		if(list.size()<k) {
			add(num, list);
			return;
		}else {
			if(list.get(list.size()-1)>num) {
				list.remove(list.size()-1);
				add(num,list);
			}
		}
	}
	public void add(int num,ArrayList<Integer> list) {
		if(list.size() == 0) {
			list.add(num);
			return;
		}
		list.add(num);
		if(list.size()>=2) {
			int size =list.size();
			for(int m = size-1;m>0;m--) {
				if(list.get(m)<list.get(m-1)) {
					swap(list, m, m-1);
				}else {
					break;
				}
			}
		}
		
	}
	public void swap(ArrayList<Integer> list,int i,int j) {
		int m = list.get(i);
		list.set(i, list.get(j));
		list.set(j, m);
	}
	public static void main(String[] args) {
		int[] arr= {3,4,8,2,1,9,7,6};
		ArrayList<Integer> list =new Problem029().GetLeastNumbers_Solution(arr, 8);
		System.out.println(list);
	}
}
