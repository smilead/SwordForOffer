package org.smilead.swordoffer.problem004;
/**
 * 时间限制：1秒 空间限制：32768K 热度指数：495676
 算法知识视频讲解
题目描述
输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * @author smile
 *
 */
public class Problem004 {

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
    	if(pre == null || in == null || pre.length != in.length) {
    		return null;
    	}
    	int length =pre.length;
    	//return null;
    	return constructTree(pre, 0, length-1, in, 0, length-1);
    }
    
    //根据前序遍历找到的根节点，在中序遍历当中查找其index信息
    public int findFromIn(int target,int[] in ) {
    	for(int i = 0; i< in.length;i++) {
    		if(target == in[i]) {
    			return i;
    		}
    	}
    	return -1;
    }
    /*
     * 
     */
    public TreeNode constructTree(int[] pre,int preBegin,int preEnd, int [] in, int inBegin, int inEnd) {
    	if(preBegin>preEnd) {
    		return null;
    	}
    	if(inBegin > preEnd) {
    		return null;
    	}
    	TreeNode node = new TreeNode(pre[preBegin]);
    	int index = findFromIn( node.val, in);
    	int length = index - inBegin;
    	node.left  = constructTree(pre, preBegin + 1, preBegin + length, in, inBegin, index-1);
    	node.right = constructTree(pre, preBegin + length+1, preEnd, in, index+1, inEnd);
    	return node;
    }
    
    public static void main(String[] args) {
		int[] pre ={1,2,4,7,3,5,6,8};
		int[] in ={4,7,2,1,5,3,8,6};
		TreeNode node =new Problem004().reConstructBinaryTree(pre, in);
		System.out.println(node);
	}
}
class TreeNode {
   int val;
   TreeNode left;
   TreeNode right;
   TreeNode(int x) { val = x; }
}