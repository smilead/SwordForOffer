package org.smilead.swordoffer.problem041;

import java.util.ArrayList;

/*
 * 	小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 */

public class Problem041 {
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		if(sum<=0) {
			return null;
		}		
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		for(int min =1;min<=sum;min++) {
			for(int max = min;max<=sum;max++) {
				if(sum(min,max)>sum) {
					break;
				}
				if(sum(min,max) == sum) {
					if(max ==min) {
						break;
					}
					result.add(buildList(min, max));
					break;
				}
			}
		}
		return result;
    }
	public int sum(int min,int max) {
		return (max+min)*(max-min+1)/2;
	}
	public ArrayList<Integer> buildList(int min,int max){
		ArrayList<Integer> list = new ArrayList<>();
		if(min>max) {
			return list;
		}else {
			for(int i = min;i<=max;i++) {
				list.add(i);
			}
		}
		return list;
	}
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> result = new Problem041().FindContinuousSequence(1);
		System.out.println(result);
	}
}
