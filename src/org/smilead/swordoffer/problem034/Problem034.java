package org.smilead.swordoffer.problem034;

import java.util.HashMap;

/*
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 */
public class Problem034 {
	 public int FirstNotRepeatingChar(String str) {
		 char local;
		 HashMap<Character,Integer> map = new HashMap<>();
		 for(int i = 0 ;i<str.length();i++) {
			 local = str.charAt(i);
			 if(map.get(local) == null) {
				 map.put(local, 1);
			 }else {
				 map.put(local,map.get(local)+1);
			 }
		 }
		 for(int i = 0;i<str.length();i++) {
			if(1 == (int)map.get(str.charAt(i))) {
				return i;
			}
		 }
	        return -1;
    }
	 public static void main(String[] args) {
		String str="qackq";
		System.out.println(new Problem034().FirstNotRepeatingChar(str));
	}
}
