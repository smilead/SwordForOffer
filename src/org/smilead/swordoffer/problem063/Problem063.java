package org.smilead.swordoffer.problem063;
/*
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 * 我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
 */

import java.util.ArrayList;

public class Problem063 {
	ArrayList<Integer> list = new ArrayList<>();
	 public void Insert(Integer num) {
		 list.add(num);
		 if(list.size()>1) {
			 for(int i = list.size()-1; i>0; i--) {
				 if(list.get(i)<list.get(i-1)) {
					 int m = list.get(i);
					 list.set(i, list.get(i-1));
					 list.set(i-1,m);
				 }else {
					 break;
				 }
			 }
		 }
	 }

    public Double GetMedian() {
	       int length = list.size();
	       if(length%2==1) {
	    	   return Double.parseDouble(list.get(length/2)+"");
	       }else {
	    	  return (double)(list.get(length/2)+list.get(length/2-1))/2;
	       }
    }
    public static void main(String[] args) {
    	Problem063 a = new Problem063();
    	a.Insert(5);
    	System.out.println(a.GetMedian());
    	a.Insert(2);
    	System.out.println(a.GetMedian());
    	a.Insert(3);
    	a.Insert(4);
    	a.Insert(1);
    	a.Insert(6);
    	a.Insert(7);
    	a.Insert(0);
    	a.Insert(8);
	}
}
