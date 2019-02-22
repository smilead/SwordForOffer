package org.smilead.swordoffer.problem031;
/*
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
 * 但是对于后面问题他就没辙了。ACMer希望你们帮帮他,
 * 并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数
 * （从1 到 n 中1出现的次数）
 */
public class Problem031 {
	public int NumberOf1Between1AndN_Solution(int n) {
		if(n<0) {
			return 0;
		}
		int result = 0;
		String nString = String.valueOf(n);		
		int length = nString.length();
		int left,local,right;
		for(int i =1;i<=length;i++) {
			left = n/(int)Math.pow(10, i);
			right = n% (int)Math.pow(10, i-1);
			local = n/(int)Math.pow(10, i-1)%10;

			result+=left*Math.pow(10, i-1);
			if(local ==1) {
				result+=1+right;
			}
			if(local>1) {
				result+=(int)Math.pow(10, i-1);
			}
		}
		return result;
    }
	public static void main(String[] args) {
		new Problem031().NumberOf1Between1AndN_Solution(4001);
	}
}
