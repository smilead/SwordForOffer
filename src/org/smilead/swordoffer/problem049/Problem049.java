package org.smilead.swordoffer.problem049;

/*将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
 * 
 */
public class Problem049 {
	  public int StrToInt(String str) {
		  if(str.length() == 0) {
			  return 0;
		  }
		  int result = 0,multiple =1;
		  char[] chars = str.toCharArray();
		  for(int i = 0;i<chars.length;i++) {
			  if(i==0&&(chars[i]=='+'||chars[i]=='-')) {
				  continue;
			  }
			  if(chars[i]>'9'|| chars[i]<'0') {
				  return 0;
			  }
		  }
		  int first = 0;
		  if(chars[0] == '+' || chars[0] == '-') {
			  first = 1;
		  }
		  for(int i = chars.length-1;i>=first;i--) {
			  result += (chars[i]-'0')*multiple;
			  multiple*=10;
		  }
		  if(chars[0] == '-') {
			  return 0-result;
		  }
		  return result;
		  
	    }
	  public static void main(String[] args) {
		String str = "+1234";
		new Problem049().StrToInt(str);
	}
}
