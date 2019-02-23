package org.smilead.swordoffer.problem035;
/*
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 * int型最大值为2147483647采用分治时左中右都有可能超过1000000007的话会出现异常，因此count值需要及时取余
 * 1000000007
 */
public class Problem035_3 {

	public int InversePairs(int[] array) {
		int result = 0;
		result = inversePairs(array, 0, array.length-1);
		return result%1000000007;
	}
	
	public int inversePairs(int[] array,int start,int end) {
		if(start >= end) {
			return 0;
		}
		int mid = (start+end)/2;
		int left = inversePairs(array, start, mid);
		int right = inversePairs(array, mid+1, end);
		int count = 0;
		int[] local=new int[end -start+1];
		int leftE=mid;
		int rightE=end;
		int localE = end-start;
		while(leftE>=start && rightE>=mid+1) {
			if(array[leftE]>array[rightE]) {
				count= count + rightE -mid;
				local[localE] = array[leftE];
				leftE--;
				if(count>1000000007) {
					count = count%1000000007;
				}
			}else {
				local[localE] = array[rightE];
				rightE--;
			}
			localE--;
		}
		while(rightE>= mid+1) {
			local[localE--]=array[rightE--];
		}
		while(leftE>=start) {
			local[localE--]=array[leftE--];
		}
		for(int i =0;i<local.length;i++,start++) {
			array[start] = local[i];
		}
		
		return (left+count+right)%1000000007;
	}

}

