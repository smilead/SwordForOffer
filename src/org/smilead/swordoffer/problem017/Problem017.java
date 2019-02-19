package org.smilead.swordoffer.problem017;
/*
 * 时间限制：1秒 空间限制：32768K 热度指数：356254
 算法知识视频讲解
题目描述
输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class Problem017 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root2 == null) {
 		    return false;
     	}
        if(root1 == null) {
 		return false;
     	}
     	if(root1.val == root2.val) {
             boolean flag1 = true;
             boolean flag2=true;
 	    	if(root2.left !=null) {
                 flag1=HasSubtree(root1.left, root2.left);
 		    }
 		    if(root2.right != null) {
 			    flag2=HasSubtree(root1.right, root2.right);
 		    }
             if(flag1&&flag2){
                 return true;
             }
 	}
 	
 	if(HasSubtree(root1.left, root2)) {
 		return true;
 	}
 	if(HasSubtree(root1.right, root2)) {
 		return true;
 	}
 	return false;    
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
