package org.smilead.swordoffer.problem038;

/*
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度
 */
public class Problem038 {
	 public int TreeDepth(TreeNode root) {
		 if(root == null) {
			 return 0;
		 }
		 if(root.left==null&&root.right == null) {
			 return 1;
		 }
	        return max(TreeDepth(root.left),TreeDepth(root.right))+1;
	    }

	 public int max(int m,int n) {
		 if(m>n) {
			 return m;
		 }else {
			 return n;
		 }
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
