package org.smilead.swordoffer.problem055;

import java.util.HashSet;

public class Problem055 {
	  public ListNode EntryNodeOfLoop(ListNode pHead)
	    {
		  HashSet<ListNode> set = new HashSet<>();
		  while(pHead !=null) {
			  if(set.contains(pHead)) {
				  return pHead;
			  }else {
				  set.add(pHead);
				  pHead = pHead.next;
			  }
		  }
		  return null;
	    }
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

