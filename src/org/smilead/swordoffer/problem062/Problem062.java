package org.smilead.swordoffer.problem062;

import java.util.Stack;

/*
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
 */
public class Problem062 {
	 TreeNode KthNode(TreeNode pRoot, int k){
		 if(k <1) {
			 return null;
		 }
	    Stack<TreeNode> stack = new Stack<>();
	    TreeNode node =pre(pRoot, stack,k);
	     return node;
	    }
	 
	 TreeNode pre(TreeNode node, Stack<TreeNode> nodeStack,int k) {
		 TreeNode result = null;
		 if(node== null) {
			 return null;
		 }
		 if(node.left!=null) {
			 result =pre(node.left, nodeStack,k);
			 if(result !=null) {
				 return result;
			 }
		 }
		 nodeStack.push(node);
		 if(nodeStack.size() ==k) {
			 return node;
		 }
		 
		 if(node.right != null) {
			 result=pre(node.right, nodeStack, k);
			 if(result !=null) {
				 return result;
			 }
		 }
		 return null;
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
