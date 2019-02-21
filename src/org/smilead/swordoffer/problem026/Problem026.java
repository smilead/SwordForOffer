package org.smilead.swordoffer.problem026;

import java.util.ArrayList;

/*
 * 
输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向
 */
public class Problem026 {
	   public TreeNode Convert(TreeNode pRootOfTree) {
		   if(pRootOfTree == null) {
			   return null;
		   }
		   ArrayList<TreeNode> list = new ArrayList<>();
		   traverse(list, pRootOfTree);
		   TreeNode node = list.get(0);
		   node.left = null;
		   if(list.size() == 1) {
			   node.right = null;
			   return node;
		   }
		   node.right = list.get(1);
		   for(int i = 1; i< list.size()-1;i++) {
			   list.get(i).left=list.get(i-1);
			   list.get(i).right = list.get(i+1);
		   }
		   node = list.get(list.size()-1);
		   node.left = list.get(list.size()-2);
	     return list.get(0);   
	    }
	   
	   public void traverse(ArrayList<TreeNode> list,TreeNode node){
		   if(node ==null) {
			   return ;
		   }
		   if(node.left !=null) {
			   traverse(list, node.left);
		   }
		   list.add(node);
		   if(node.right !=null) {
			   traverse(list, node.right);
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