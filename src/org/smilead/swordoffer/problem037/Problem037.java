package org.smilead.swordoffer.problem037;

public class Problem037 {
	public int GetNumberOfK(int [] array , int k) {
		if(array==null||array.length==0) {
			return 0;
		}
		int count = 0;
		int length =array.length;
		for(int i = 0;i<length&& k>=array[i];i++) {
			if(k == array[i]) {
				count++;
			}
		}
		return count;
    }
	public static void main(String[] args) {
		System.out.println(new Problem037().GetNumberOfK(new int[]{1,2,3,3,3,3,4,5 },3));
	}
}
