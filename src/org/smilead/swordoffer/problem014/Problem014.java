package org.smilead.swordoffer.problem014;

public class Problem014 {
	   public ListNode FindKthToTail(ListNode head,int k) {
		   int m =0;
		   ListNode node = head;
		   while(node != null) {
			   node = node.next;
			   m++;
		   }
           if(k>m){
               return null;
           }

		   node =head;
		   for(int i=0;i<m-k;i++) {
			   node = node.next;
		   }
		   return node;
	    }

}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}