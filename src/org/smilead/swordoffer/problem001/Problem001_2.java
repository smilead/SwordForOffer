package org.smilead.swordoffer.problem001;

public class Problem001_2 {
//	 public boolean Find(int target, int [][] array) {
//		 for(int i=0;i<array.length;i++) {
//					 int[] arrayX = array[i];
//					 for(int j=0; j< arrayX.length;j++) {
//						 if(target == arrayX[j]) {
//							 return true;
//						 }
//					 }
//				 }
//				 
//	 return false;
//    }
	 public boolean Find(int target, int[][] array) {
		 int row = array[0].length;
		 int hight = array.length;
		 int localRow =row-1;
		 int localHight = 0;
		 while(localRow>=0 && localHight<hight) {
			 int local = array[localHight][localRow];
			 if(local>target) {
				 localRow--;
			 }else if (local<target) {
				 localHight++;
			 }else {
				 return true;
			 }
		 }
		 return false;
	 }
}
