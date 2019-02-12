package org.smilead.swordoffer.problem001;
/**
 * 时间限制：1秒 空间限制：32768K 热度指数：906833
本题知识点： 查找
 算法知识视频讲解
题目描述
在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @author smile
 *
 */
public class problem001 {
	 public boolean Find(int target, int [][] array) {
		 
		 for(int i=0;i<array.length;i++) {
			 int[] arrayX = array[i];
			 for(int j=0; j< arrayX.length;j++) {
				 if(target == arrayX[j]) {
					 return true;
				 }
			 }
		 }
		 
		 return false;
	 }
	
}
