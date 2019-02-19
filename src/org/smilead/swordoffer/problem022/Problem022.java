package org.smilead.swordoffer.problem022;

import java.util.ArrayList;

public class Problem022 {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<TreeNode> nodeList= new ArrayList<>();
		if(root ==null) {
			return list;
		}
		nodeList.add(root);
		list.add(root.val);
		for(int i = 0; i<nodeList.size();i++) {
			TreeNode node = nodeList.get(i);
			if(node.left!=null) {
				nodeList.add(node.left);
			}
			if(node.right!=null) {
				nodeList.add(node.right);
			}
		}
		
		
		
		return list;
    }
	
	public int maxHeight(TreeNode root) {
		if(root.val == 0) {
			return 0;
		}
		int height =1;
		return height;
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