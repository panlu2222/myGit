package day6;
//����һ����������������е�����k����㡣
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