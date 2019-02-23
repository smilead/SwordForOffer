package org.smilead.swordoffer.problem035;
//建立二叉树统计(由于高度不确定，因此时间复杂度不稳定)
public class Problem035_2 {
	public int InversePairs(int[] array) {
		int result = 0;
		TreeNode root = new TreeNode(array[0]);
		for(int i = 1;i<array.length;i++) {
			result+=add(root, array[i])%1000000007;
		}
		return result%1000000007;
	}
	public int add(TreeNode root,int value) {
		if(root.value>value) {
			if(root.left == null) {
				root.left = new TreeNode(value);
				return root.count;
			}else {
				return (add(root.left, value)+root.count);
			}
		}else {
			root.count +=1;
			if(root.right ==null) {
				root.right = new TreeNode(value);
				return 0;
			}else {
				return add(root.right, value)%1000000007;
			}
		}
	}
	

}
