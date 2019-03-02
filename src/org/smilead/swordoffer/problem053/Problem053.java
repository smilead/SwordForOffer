package org.smilead.swordoffer.problem053;
/*
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，
 * 字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 
 * 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 */
public class Problem053 {
	public boolean isNumeric(char[] str) {
		if(str.length == 0) {
			return false;
		}
		if(str.length == 1) {
			if(number(str[0])) {
				return true;
			}else {
				return false;
			}
		}
		
		boolean hasE = false;
		int eIndex = 0;
		for(int i = 0;i<str.length;i++) {
			if(str[i] =='e'||str[i]=='E') {
				eIndex =i;
				hasE=true;
				break;
			}
		}
		if(hasE) {
			if(isNumber(str,0, eIndex-1)&&isNumberNoPoint(str,  eIndex+1, str.length-1)) {
				return true;
			}else {
				return false;
			}
		}else {
			if(isNumber(str, 0, str.length-1)) {
				return true;
			}else {
				return false;
			}
		}
		
	}

	public boolean isNumberNoPoint(char[] str,int left,int right) {
		if(left>right) {
			return false;
		}

		if(str[left] == '+'|| str[left]=='-') {
			for(int i = left+1;i<= right;i++) {
				if(!number(str[i])) {
						return false;
				}
			}
			return true;
		}else {
			for(int i = left;i<= right;i++) {
				if(!number(str[i])) {
						return false;
				}
			}
			return true;
		}
	}
	
	//判断是不是数字
	public boolean isNumber(char[] str, int left,int right) {
		boolean point = false;
		if(left>right) {
			return false;
		}
		if(str[left] == '+'|| str[left]=='-') {
			for(int i = left+1;i<= right;i++) {
				if(!number(str[i])) {
					if('.'==str[i]) {
						if(point) {
							return false;
						}else {
							point = true;
						}
					}else {
						return false;
					}
				}
			}
			return true;
			
		}
		
		
		for(int i = left;i<= right;i++) {
			if(!number(str[i])) {
				if('.'==str[i]) {
					if(point) {
						return false;
					}else {
						point = true;
					}
				}else {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean number(char a) {
		if(a<'0') {
			return false;
		}
		if(a>'9') {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String s="123.45e+6";
		char[] str = s.toCharArray();
		new Problem053().isNumeric(str);
	}
}
