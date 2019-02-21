package org.smilead.swordoffer.problem027;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
 * 
输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */
public class Problem027 {
   public ArrayList<String> Permutation(String str) {
	   ArrayList<String> result = new ArrayList<>();
	   if(str==null || "".equals(str)) {
		   return result;
	   }else if(str.length() ==1) {
		   result.add(str);
		   return result;
	   }else {
		   char char0 = str.charAt(0);
		   String str0=str.substring(1);
		   ArrayList<String> str0s = Permutation(str0);
		   for(int i=0;i<str0s.size();i++) {
			   result.add(char0+str0s.get(i));
		   }
		   
		   for(int i=1;i<str.length();i++) {
			   char chari = str.charAt(i);
			   if(char0 == chari) {
				   continue;
			   }
			   String stri=str.substring(0, i)+str.substring(i+1);
			   ArrayList<String> stris= Permutation(stri);
			   for(int j = 0;j<stris.size();j++) {
				   result.add(chari+stris.get(j));
			   }
		   }
		   
	   }
	   return result;
    }
   public static void main(String[] args) {
	String m ="ab";
	System.out.println(m.length());
	System.out.println(new Problem027().Permutation(m));
}
}
