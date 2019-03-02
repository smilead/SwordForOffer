package org.smilead.swordoffer.problem052;
/*
 * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。
 *  在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 */
public class Problem052 {
	 public boolean match(char[] str, char[] pattern){
		 return match(str, pattern, 0, 0);
	 }
	 public boolean match(char[] str,char[] pattern,int s,int p) {
		 if(s >=str.length&&p>=pattern.length) {
			 return true;
		 }
		 if(p>=pattern.length&&s<str.length) {
			 return false;
		 }
		 
		 if(p+1<pattern.length&&pattern[p+1] == '*') {
			 if(match(str, pattern, s, p+2)) {
				 return true;
			 }else if(s<str.length&&(str[s] == pattern[p]|| pattern[p] =='.')){
				 if(match(str, pattern, s+1, p)) {
					 return true;
				 }else if(match(str, pattern, s, p+2)) {
					 return true;
				 }else {
					 return false;
				 }
			 }else {
				 return false;
			 }
			 
		 }else if(s>= str.length) {
			 return false;
		 }else if(str[s] == pattern[p]) {
			 return match(str, pattern,s+1,p+1);
		 }else if(pattern[p] =='.') {
			 return match(str, pattern, s+1, p+1);
		 }else {
			 return false;
		 }
		 
		 
	 }
	 public static void main(String[] args) {
		String str="a";
		String pattern = "ab*a";
		System.out.println(new Problem052().match(str.toCharArray(), pattern.toCharArray()));
	}
}
