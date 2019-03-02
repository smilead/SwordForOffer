package org.smilead.swordoffer.problem056;

/*
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class Problem056 {
	   public ListNode deleteDuplication(ListNode pHead){
		   if(pHead == null) {
			   	return null;
		   }
		   if(pHead.next == null) {
			   return pHead;
		   }
		   ListNode head = pHead,pre=head,last=head.next;
   
		   while(head.val == last.val) {				   
			   last = last.next;
			   if(last == null) {
				   return null;
			   }
			   if(head.val !=last.val) {
				   head = last;
				   pre = last;
				   last = last.next;
				   if(last == null) {
					   return head;
		   			}

			   }
    	   if(last.next == null) {
		   return null;
	   }

	}

   
   
   boolean flag = false;
   while(last.next!=null) {
	   if(last.val == last.next.val) {
		   flag = true;
		   last = last.next;
	   }else {
		   if(flag) {
			   pre.next = last.next;
			   last = last.next;
			   flag = false;
		   }else {
			   pre = last;
			   last = last.next;
		   }
	   }
   }
   if(flag) {
	   pre.next = null;
   }
   
   
   
   return head;
	   }
	   public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next=new ListNode(1);
		node.next.next = new ListNode(2);
		node.next.next.next = new ListNode(2);
		node.next.next.next.next=new ListNode(3);
		node.next.next.next.next.next=new ListNode(3);
		node.next.next.next.next.next.next=new ListNode(4);
		node.next.next.next.next.next.next.next=new ListNode(4);
		new Problem056().deleteDuplication(node);
	}
}

class ListNode {
   int val;
   ListNode next = null;

   ListNode(int val) {
       this.val = val;
   }
}
