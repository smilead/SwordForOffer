package org.smilead.swordoffer.problem010;

import java.util.ArrayList;

/*
 * 时间限制：1秒 空间限制：32768K 热度指数：237661
 算法知识视频讲解
题目描述
我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class Problem010 {
	 public int RectCover(int target) {
         if(target <1){
             return 0;
         }
		 if(target ==1) {
			 return 1;
		 }
		 Node node = new Node();
		 node.value =1;
		 node.across=1;
		 java.util.ArrayList<Node> list = new java.util.ArrayList<>();
		 list.add(node);
		 for(int i=0;i<target -1;i++) {
			 cover(list);
		 }
		 Node result =list.get(list.size()-1);
		 return result.value;
	 }
	 
	 public void cover(java.util.ArrayList<Node> list) {
		 int length = list.size();
		 Node old = list.get(length-1);
		 Node node = new Node();
		 node.across = old.value;
		 node.value = old.value +old.across;
		 list.add(node);
	 }
}
class Node{
	public int across;
	public int value;
}