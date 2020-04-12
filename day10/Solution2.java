package day10;
import java.util.AbstractQueue;
//从上往下打印出二叉树的每个节点，同层节点从左至右打印。
/*
 * 思路：利用队列，存储根节点，
 * 若队列不为空，则将队头的左孩子和右孩子进队（若存在），并将队头元素出栈放入ArrayList里面。
 * 循环队列
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

