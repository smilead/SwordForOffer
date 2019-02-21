package org.smilead.swordoffer.problem025;


/*
 * 题目描述
输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）

 */
public class Problem025 {

	   public RandomListNode Clone(RandomListNode pHead) {
		   if(pHead == null) {
			   return null;
		   }
		   RandomListNode oldNode = pHead;
		   RandomListNode newHead = new RandomListNode(pHead.label);
		   RandomListNode newNode =newHead;

		   while(oldNode.next != null) {
			   if(oldNode.random!=null) {
				   newNode.random = new RandomListNode(oldNode.random.label);
			   }
			   newNode.next = new RandomListNode(oldNode.next.label);
			   newNode = newNode.next;
			   oldNode = oldNode.next;
		   }
		   return newHead;
	   }

	   public RandomListNode judge(java.util.HashMap<Integer, RandomListNode> map,int label) {
		   RandomListNode random = map.get(label);
		   return random;
	   }
	   
}
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}