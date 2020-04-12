package day10;
import java.util.AbstractQueue;
//�������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
/*
 * ˼·�����ö��У��洢���ڵ㣬
 * �����в�Ϊ�գ��򽫶�ͷ�����Ӻ��Һ��ӽ��ӣ������ڣ���������ͷԪ�س�ջ����ArrayList���档
 * ѭ������
 * 
 */
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        
        ArrayList<Integer> arr=new ArrayList<Integer>();
        if(root==null)
        	return arr;
        AbstractQueue<TreeNode> queue=new LinkedBlockingQueue<TreeNode>();
        queue.add(root);
        while(!(queue.isEmpty())){
        	TreeNode tn=queue.peek();
        	if(tn.left!=null)
        		queue.add(tn.left);
        	if(tn.right!=null)
        		queue.add(tn.right);
        	arr.add(tn.val);
        	queue.poll();
        	
        }
        return arr;
    }
}

