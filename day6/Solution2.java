package day6;
//输入一个链表，输出该链表中倒数第k个结点。
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution2 {
    public ListNode FindKthToTail(ListNode head,int k) {
    	int i=1;
    	ListNode ln=head;
    	ListNode node_k=head;
    	if(head==null||k<=0)
    		return null;
    	while(i<k){
    		if(ln.next!=null){
    			i++;
    			ln=ln.next;
    		}else
    			return null;
    	}
    	while(ln.next!=null){
    		ln=ln.next;
    		head=head.next;
    	}
    	
    	return head;
    }
}