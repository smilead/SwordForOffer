package org.smilead.swordoffer.problem016;
/*
 * 时间限制：1秒 空间限制：32768K 热度指数：368959
本题知识点： 链表
 算法知识视频讲解
题目描述
输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则
 */
public class Problem016 {
    public ListNode Merge(ListNode list1,ListNode list2) {
    	ListNode newlistend;
    	
    	ListNode newHead=null;
        ListNode newEnd =null;
    	ListNode local = null;
    	ListNode next = null;
    	ListNode local1=list1;
    	ListNode local2=list2;
    	if(local1==null) {
    		if(local2==null) {
    			return null;
    		}else {
        		newHead =local2;
        		newEnd =local2;
        		local2 =local2.next;
        		newEnd.next=null;
    			
    		}
    	}else if(local2==null) {
    		newHead = local1;
    		newEnd = local1;
    		local1 =local1.next;
    		newEnd.next=null;
    	
    	}else {
        	if(local1.val>local2.val) {
        		newHead =local2;
        		newEnd =local2;
        		local2 =local2.next;
        		newEnd.next=null;
        	}else {
        		newHead = local1;
        		newEnd = local1;
        		local1 =local1.next;
        		newEnd.next=null;
        	}
    		
    	}
    	while(local1!=null || local2!=null) {
    		if(local1==null) {
    			next =local2.next;
    			newEnd.next=local2;
    			newEnd=local2;
    			newEnd.next=null;
    			local2=next;
    			continue;
    			
    		}
    		if(local2==null){
    			next = local1.next;
    			newEnd.next=local1;
    			newEnd=local1;
    			newEnd.next=null;
    			local1=next;
    			continue;
    			
    		
    		}
    		if(local1.val>local2.val) {
    			next =local2.next;
    			newEnd.next=local2;
    			newEnd=local2;
    			newEnd.next=null;
    			local2=next;
    			continue;

    		}else {
    			next = local1.next;
    			newEnd.next=local1;
    			newEnd=local1;
    			newEnd.next=null;
    			local1=next;
    			continue;

    		}
    	}
    	return newHead;
	}
    public static void main(String[] args) {
    	ListNode list1=new ListNode(1);
    	list1.next =new ListNode(2);
    	list1.next.next= new ListNode(3);
		new Problem016().Merge(list1,null );
	}
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
