package day9;

import javax.swing.tree.TreeNode;

/*
 * ���������Ķ�����������任ΪԴ�������ľ���
 * �������ľ����壺Դ������ 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	���������
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
 */
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
public class Solution2 {
	
   public static void Mirror(TreeNode root) {
    	
    	
    	if(root==null||(root.left==null&&root.right==null)){
        	root=root;
        }
    	if(root!=null&&(root.left!=null||root.right!=null)){
    		
    		Mirror(root.left);
    		Mirror(root.right);
    		TreeNode tn=root.left;
    		root.left=root.right;
        	root.right=tn;
        }
    	
    }
		
}
