package org.smilead.swordoffer.problem040;
/*
 * 一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。请写程序找出这两个只出现一次的数字
 * num1,num2分别为长度为1的数组。传出参数
将num1[0],num2[0]设置为返回结果
 */
public class Problem040 {
	  public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
		  rock(array,0,array.length-1);
		  boolean first= true,second=true,firstUnFund = true,secondUnFund=true;

		  for(int i = 0;i<array.length;i++) {
			  if(firstUnFund) {
				  if(first) {
					  num1[0] = array[i];
					  first = false;
				  }else if(array[i]==num1[0]){
					  first = true;
				  }else {
					  firstUnFund = false;
					  i--;
				  }
				  
			  }else if(secondUnFund){
				  if(second) {
					  num2[0] = array[i];
					  second = false;
				  }else if(array[i]==num2[0]) {
					  second = true;
				  }else {
					  secondUnFund = false;
				  }
			  }else {
				  break;
				  
			  }
		  }
		  
	    }
	  public void rock(int[] array,int left,int right) {
		  if(left>=right) {
			  return ;
		  }
		  int mid = (left+right)/2;
		  rock(array, left, mid);
		  rock(array, mid+1, right);
		  int[] temp = new int[right-left+1];
		  int leftE=mid,rightE=right,tempE=right-left;
		  while(leftE>=left && rightE>=mid+1) {
			  if(array[leftE]>array[rightE]) {
				  temp[tempE]=array[leftE];
				  leftE--;
			  }else {
				  temp[tempE]=array[rightE];
				  rightE--;
			  }
			  tempE--;
		  }
		  while(rightE>=mid+1) {
			  temp[tempE--]=array[rightE--];
		  }
		  while (leftE>=left) {
			  temp[tempE--]=array[leftE--];
		  }
		  for(int i = 0;i<temp.length;i++) {
			  array[left++]=temp[i];
		  }
	  }
	
}
