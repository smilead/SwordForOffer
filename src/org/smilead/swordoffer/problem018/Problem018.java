package org.smilead.swordoffer.problem018;

public class Problem018 {
	public void Mirror(TreeNode root) {
		if(root == null) {
			return ;
		}
		TreeNode left = root.left;
		TreeNode right = root.right;
		Mirror(left);
		Mirror(right);
		root.left = right;
		root.right = left;
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