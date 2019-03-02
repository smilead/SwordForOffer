package org.smilead.swordoffer.problem060;

import java.util.ArrayList;

/*
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 */
public class Problem060 {
	   ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		    if(pRoot == null) {
		    	return result;
		    }
		    ArrayList<TreeNode> nodeList = new ArrayList<>();
		    nodeList.add(pRoot);
		    TreeNode node;
		    while(nodeList.size() != 0) {
		    	ArrayList<Integer> list = new ArrayList<>();
		    	ArrayList<TreeNode> temp = new ArrayList<>();
		    	for(int i=0;i<nodeList.size();i++) {
		    		node = nodeList.get(i);
		    		list.add(node.val);
		    		if(node.left!=null) {
		    			temp.add(node.left);
		    		}
		    		if(node.right != null) {
		    			temp.add(node.right);
		    		}
		    	}
		    	nodeList = temp;
		    	result.add(list);
		    }
		    return result;
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