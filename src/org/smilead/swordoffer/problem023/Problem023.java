package org.smilead.swordoffer.problem023;

public class Problem023 {
	 public boolean VerifySquenceOfBST(int [] sequence) {
		 if(sequence ==null) {
			 return false;
		 }
		 int length = sequence.length;
		 if(length == 0) {
			 return false;
		 }
		 int root = sequence[length-1];
		 int index = findIndex(sequence, 0, length-2, root);
		 if(index == 0) {
			 if(!verify(sequence, 0, length-2, root)) {
				 return false;
			 } 
			 return verifySquence(sequence, 0, length-2);
		 }
		 if(index == length-2) {
			 return verifySquence(sequence, 0, length-2);
		 }
		 if(!verify(sequence, index+1, length-2, root)) {
			 return false;
		 }
		 return verifySquence(sequence, 0, index-1)&&verifySquence(sequence, index, length-2);
	 }
	 public boolean verifySquence(int[] sequence,int first,int last) {
		 boolean result = true;
		 if(first >= last) {
			 return true;
		 }
		 int target = sequence[last];
		 int index = findIndex(sequence, first, last-1, target);
		 if(!verify(sequence, index+1, last, target)) {
			 return false;
		 }
		 result = verifySquence(sequence, first, index-1)&&verifySquence(sequence, index,last-1);
		 return result;
	 }
	 public int findIndex(int[] sequence,int first,int last,int target) {
		 for(int i = first;i<= last;i++) {
			 if(sequence[i]>target) {
				 return i;
			 }
		 }
		 return last;
	 }
	 
	 public boolean verify(int[] sequernce, int first,int last,int target) {
		 if(first>last) {
			 return true;
		 }
		 for(int i =first;i<= last;i++) {
			 if(sequernce[i]<target) {
				 return false;
			 }
		 }
		 return true;
	 }
	 public static void main(String[] args) {
System.out.println(		new Problem023().VerifySquenceOfBST(new int[]{}));
	}
}
