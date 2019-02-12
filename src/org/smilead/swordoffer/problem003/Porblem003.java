package org.smilead.swordoffer.problem003;

import java.util.ArrayList;
/**
 * 时间限制：1秒 空间限制：32768K 热度指数：705755
本题知识点： 链表
 算法知识视频讲解
题目描述
输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * @author smile
 *
 */
public class Porblem003 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    	ArrayList<Integer> arrayList = new ArrayList<>();
    	while (listNode != null) {
    		arrayList.add(listNode.val);
        	listNode = listNode.next;
		}
    	int val;
    	int size = arrayList.size();
    	for(int i=0;i<size/2;i++) {
    		val = arrayList.get(i);
    		arrayList.set(i, arrayList.get(size-i-1));
    		arrayList.set(size-i-1, val);
    	}
    	return arrayList;
    }
}
class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
}