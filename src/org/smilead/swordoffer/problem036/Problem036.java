package org.smilead.swordoffer.problem036;

/*
 * 输入两个链表，找出它们的第一个公共结点
 */
public class Problem036 {
	  public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		  int length1 = length(pHead1);
		  int length2 = length(pHead2);
		  int gap = Math.abs(length2 -length1);
		  if(length(pHead1)>length(pHead2)) {
			  while(gap>0) {
				  pHead1 = pHead1.next;
				  gap--;
			  }
		  }else {
			  while(gap>0) {
				  pHead2 = pHead2.next;
			  }
		  }
		  while(pHead1!= null&& pHead2!= null &&pHead1 != pHead2) {
			  pHead1 = pHead1.next;
			  pHead2 = pHead2.next;
		  }
		  if(pHead1 == pHead2) {
			  return pHead1;
		  }
		  return null;
	    }
	  public int length(ListNode head) {
		  int length =0;
		  while(head!=null) {
			  length++;
			  head = head.next;
		  }
		  return length;
	  }
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}