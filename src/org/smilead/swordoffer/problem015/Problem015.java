package org.smilead.swordoffer.problem015;

public class Problem015 {
    public ListNode ReverseList(ListNode head) {
    	if(head ==null) {
    		return null;
    	}
    	ListNode newHead =head;
    	ListNode local=head;
    	ListNode next=local.next;
    	local.next = null;
    	while(next !=null) {
    		local =next;
    		next = next.next;
    		local.next = newHead;
    		newHead = local;
    	}
    	return newHead;
	}
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}