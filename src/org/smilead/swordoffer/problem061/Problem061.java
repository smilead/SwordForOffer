package org.smilead.swordoffer.problem061;

import java.util.Stack;

/*
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 */
public class Problem061 {
	 String Serialize(TreeNode root) {
		 if(root == null) {
			 return "";
		 }
		 StringBuilder builder = new StringBuilder();
		 serializeCore(builder, root);
		 return builder.toString();
	  }
	 
	 public void  serializeCore(StringBuilder builder, TreeNode node) {
		 if(node == null) {
			 builder.append("#,");
			 return ;
		 }
		 builder.append(node.val+",");
		 serializeCore(builder, node.left);
		 serializeCore(builder, node.right);
	 }
	 
	    TreeNode Deserialize(String str) {
	    	if("".equals(str)) {
	    		return null;
	    	}
	    	String[]  nodes=str.split(",");	    	
	       return deserializeCore(nodes);
	  }
	    TreeNode deserializeCore(String[] strs) {
	    	Stack<TreeNode> stack = new Stack<>();
			TreeNode root = new TreeNode(Integer.valueOf(strs[0]));
	    	TreeNode local = root;
	    	stack.push(root);
	    	for(int i = 1;i<strs.length;i++) {
	    		if("#".equals(strs[i])) {
	    			if(local!= null) {
	    				local.left =null;
	    				stack.push(local);
	    				local = null;
	    			}else {
	    				local = stack.pop();
	    				local.right = null;
	    				local = null;
	    			}
	    		}else {
	    			TreeNode node = new TreeNode(Integer.valueOf(strs[i]));
	    			if(local!=null) {
	    				local.left = node;
	    				stack.push(local);
	    				local = node;
	    			}else {
	    				local = stack.pop();
	    				local.right = node;
	    				local = node;
	    			}
	    		}
	    	}
	    	return root;
	    }
	    
	    public static void main(String[] args) {
			TreeNode root = new TreeNode(1);
			root.left = new TreeNode(2);
			root.right = new TreeNode(3);
			Problem061 problem = new Problem061();
			String str = problem.Serialize(root);
			System.out.println(str);
			root = problem.Deserialize(str);
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