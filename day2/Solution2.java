package day2;

/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
    return arr;
    }
}*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*/
//����һ�������������β��ͷ��˳�򷵻�һ��ArrayList��
import java.util.ArrayList;

public class solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arr=new ArrayList<Integer> ();
        while(listNode!=null){
        	arr.add(0, listNode.val);
        	listNode=listNode.next;
        }
    }
}
    