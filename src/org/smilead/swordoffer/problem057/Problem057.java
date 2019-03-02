package org.smilead.swordoffer.problem057;


public class Problem057 {
	   public TreeLinkNode GetNext(TreeLinkNode pNode){
		   if(pNode ==null) {
			   return pNode;
		   }
		   if(pNode.right!=null) {
			   pNode=pNode.right;
			   while(pNode.left!=null) {
				   pNode = pNode.left;
			   }
			   return pNode;
		   }
		   TreeLinkNode node = pNode.next;
		   while(node!=null) {
			   if(node.left == pNode) {
				   return node;
			   }
			   pNode = node;
			   node = node.next;
		   }
		   return null;
	    }

}
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}