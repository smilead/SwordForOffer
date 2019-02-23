package org.smilead.swordoffer.problem035;

public class Problem035_1 {
	public int InversePairs(int [] array) {
	int count = 0;
	for(int i = 0;i<array.length-1;i++) {
		for(int j=i+1;j<array.length;j++) {
			if(array[i]>array[j]) {
				count++;
			}
		}
	}
	return count%1000000007;
}
//时间复杂度0(n2);
}
