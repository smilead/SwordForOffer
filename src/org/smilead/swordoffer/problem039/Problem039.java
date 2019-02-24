package org.smilead.swordoffer.problem039;

public class Problem039 {
	 public boolean IsBalanced_Solution(TreeNode root) {
		 if(root == null) {
			 return true;
		 }
		 return Math.abs(height(root.left)-height(root.right))<=1 && IsBalanced_Solution(root.right)&&IsBalanced_Solution(root.left);
		 
		 
	 }
	 public int height(TreeNode root) {
		 if(root ==null) {
			 return 0;
		 }
		 if(root.left ==null &&root.right == null) {
			 return 1;
		 }
		 return Math.max(height(root.left),height( root.right))+1;
	 }
	 public boolean balanceDetection(TreeNode root,int height) {
		 if(root == null ) {
			 if(height ==0||height ==1) {
				 return true;
			 }else {
				 return false;
			 }
		 }
		 return balanceDetection(root.left, height-1)&&balanceDetection(root.right, height-1);
		 
	 }
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}