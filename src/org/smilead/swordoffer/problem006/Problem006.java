package org.smilead.swordoffer.problem006;
/*
 * 时间限制：3秒 空间限制：32768K 热度指数：455837
本题知识点： 查找
 算法知识视频讲解
题目描述
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class Problem006 {
	public int minNumberInRotateArray(int [] array) {
		if(array.length == 0) {
			return 0;
		}
		int min = Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min =array[i];
			}
		}
		return min;
    }
}