package day6;


import java.util.Stack;

//输入一个链表，反转链表后，输出新链表的表头。
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/

import java.util.Stack;
public class Solution3 {
    public ListNode ReverseList(ListNode head) {
    	if(head==null||head.next==null)
    		return head;
        ListNode p=head;
    	Stack<ListNode> s = new Stack<ListNode>();
    	while(p.next!=null){
    		s.push(p);
    		p = p.next;
    	}
        ListNode newHead=p;
        ListNode node=p;
       
        while(!s.isEmpty()){
            node.next=s.pop();
            node=node.next;
            
    	}
        node.next=null;
        return newHead;
        	
    }
}

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
/*import java.util.Stack;
public class Solution {
    public ListNode ReverseList(ListNode head) {
    	if(head==null||head.next==null)
    		return head;
        
    	Stack<ListNode> s = new Stack<ListNode>();
    	while(head!=null){
    		s.push(head);
    		head = head.next;
    	}
        ListNode newHead=head;
        ListNode node=head;
        while(!s.isEmpty()){
            node.next=s.pop();
            node=node.next;
            
    	}
        node.next=null;
        return newHead;
        	
    }
}*/