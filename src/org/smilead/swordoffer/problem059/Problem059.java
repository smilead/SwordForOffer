package org.smilead.swordoffer.problem059;

import java.util.ArrayList;

//题目描述
//请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
public class Problem059 {
	   public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		   
		   ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		   if(pRoot == null) {
			   return result;
		   }
		   boolean left = true;
		   ArrayList<TreeNode>  list = new ArrayList<>();
		   list.add(pRoot);
		   
		   while(list.size() != 0) {
			   list = traverse(result, list, left);
			   left = !left;
		   }
		   
		   return result;
	    }
	   
	   public ArrayList<TreeNode> traverse(ArrayList<ArrayList<Integer>> result,ArrayList<TreeNode> list,boolean left){
		   ArrayList<TreeNode> newList= new ArrayList<>();
		   ArrayList<Integer> resultX= new ArrayList<>();
		   TreeNode node;
		   for(int i = 0 ;i<list.size();i++) {
			   node = list.get(i);
			   if(node.left != null) {
				   newList.add(node.left);
			   }
			   if(node.right != null) {
				   newList.add(node.right);
			   }
		   }
		   if(left) {
			   for(int i = 0;i<list.size();i++) {
				   node = list.get(i);
				   resultX.add(node.val);
			   }
		   }else {
			   for(int i = list.size()-1;i>=0;i--) {
				   node = list.get(i);
				   resultX.add(node.val);
			   }
		   }
		   result.add(resultX);
		   return newList;
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