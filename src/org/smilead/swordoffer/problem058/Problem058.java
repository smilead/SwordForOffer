package org.smilead.swordoffer.problem058;

//请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
public class Problem058 {
	   boolean isSymmetrical(TreeNode pRoot){
		   if(pRoot == null) {
			   return true;
		   }
		   if(pRoot.left == null) {
			   if(pRoot.right ==null) {
				   return true;
			   }else {
				   return false;
			   }
		   }else {
			   if(pRoot.right ==null) {
				   return false;
			   }else {
				   return compare(pRoot.left, pRoot.right);				   
			   }
		   }
	    }
	   
	   public boolean compare(TreeNode left,TreeNode right) {
		   if(left == null) {
			   return false;
		   }
		   if(right == null) {
			   return false;
		   }
		   if(right.val != left.val) {
			   return false;
		   }
		   boolean flagLeft,flagRight;
		   if(left.left == null && right.right ==null) {
			   flagLeft = true;
		   }else {
			   flagLeft = compare(left.left,right.right);
		   }
		   if(left.right == null && right.left == null) {
			   flagRight = true;
		   }else {
			   flagRight = compare(left.right, right.left);
		   }
		   
		   return flagLeft&&flagRight;
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