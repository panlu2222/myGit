package day7;
//输入两个单调递增的链表，输出两个链表合成后的链表，
//当然我们需要合成后的链表满足单调不减规则。
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/



public class Solution {
	//递归
	/*public ListNode Merge(ListNode list1, ListNode list2) {
		if(list1==null)
			return list2;
		if(list2==null) 
			return list1; 
		ListNode res = null;
		if(list1.val<list2.val){
			res = list1;  
			res.next = Merge(list1.next, list2); 
			}else{            
				res = list2; 
				res.next = Merge(list1, list2.next);
				}       
		return res;    
	}*/
	//非递归
	

		
			public ListNode Merge(ListNode list1,ListNode list2) {
				ListNode newHead = new ListNode(-1);     
				ListNode current = newHead;      
				while (list1 != null && list2 != null) { 
					if (list1.val < list2.val) {    
						current.next = list1;       
						list1 = list1.next;     
					} else {              
						current.next = list2; 
						list2 = list2.next;  
					}            
					current = current.next;
				}     
				if (list1 != null) 
					current.next = list1;    
				if (list2 != null) 
					current.next = list2;  
				return newHead.next;  
			}
			
    public ListNode Merge(ListNode list1,ListNode list2) {
    	
    	if(list1==null)
    			return list2;
    	if(list2==null)
    		return list1;
    	ListNode ln=null;
    	while(list1!=null&&list2!=null){
    		if(list1.val<list2.val){
                ln.next=list1;
                list1=list1.next;
            }else{
            	ln.next=list2;
            	list2=list2.next;
            }
    		ln=ln.next;
    	}
        
    	if(list1!=null)
    		ln.next=list1;
    	if(list2!=null)
    		ln.next=list2;
        return ln;    
    }
}