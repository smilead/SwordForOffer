package org.smilead.swordoffer.problem032;
/*
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */


public class Problem032 {
	 public String PrintMinNumber(int [] numbers) {
		 for(int i = 0;i<numbers.length-1;i++) {
			 int big = 0;
			 for(int j = 0;j< numbers.length-i;j++) {
				 if(compare(numbers[j], numbers[big])) {
					big = j; 
				 }
			 }
			 if(big != numbers.length-i-1) {
				 int temp = numbers[big];
				 numbers[big] = numbers[numbers.length-i-1];
				 numbers[numbers.length-i-1]=temp;
			 }
			 
		 }
		 String result = "";
		 for(int i = 0;i<numbers.length;i++) {
			 result+= numbers[i];
		 }
		 return result;
	 }

	 public boolean compare(int max,int min) {
		 String str1=""+max + min;
		 String str2=""+min+max;
		 if(Long.parseLong(str1)>Long.parseLong(str2)) {
			 return true;
		 }else {
			 return false;
		 }
	 }
	 public static void main(String[] args) {
		 int[] numbers= {3,323,32123};
		 System.out.println(new Problem032().PrintMinNumber(numbers));
	}
}
