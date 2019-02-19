package org.smilead.swordoffer.problem019;

import java.util.ArrayList;

/*
 * 
输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10
 */
public class Problem019 {
	 public ArrayList<Integer> printMatrix(int [][] matrix) {
		 ArrayList<Integer> list = new ArrayList<>();
		 int direction =0;//0 右，1下，2左，3上
		 
		 int length = matrix[0].length;
		 int height = matrix.length;
		 int total = length*height;
		 int  i = 0,j=0,count = 0;
		 for(int m = 0; m<total; m++) {
			 list.add(matrix[i][j]);
			 count++;
			 switch (direction) {
			 	case 0:
			 		if(count==length) {
			 			direction =1;
			 			height--;
			 			count = 0;
			 			i++;
			 		}else {
			 			j++;
			 		}
			 		break;
			 	case 1:
			 		if(count==height) {
			 			direction = 2;
			 			length--;
			 			count = 0;
			 			j--;
			 		}else {			 			
				 		i++;
			 		}
			 		break;
			 	case 2: 
					if(count == length) {
						direction = 3;
						height --;
						count = 0;
						i--;
					}else {
						j--;
					}
					break;
				case 3:
					if(count == height) {
						direction = 0;
						length --;
						count =0;
						j++;
					}else {
						i--;
					}
					break;
				default:
					break;
			}
		 }
		 
		 
		 return list;
    }
	 public static void main(String[] args) {
//		 int[][] arr =  {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		 int[][] arr = {{1},{2},{3},{4}};
		 ArrayList< Integer> list = new Problem019().printMatrix(arr);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
