

package day2;

import java.util.Arrays;
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
//���������ǰ���������������Ľ���ж������ظ������֡�
//{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�
public class solution2 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
    	if(pre.length==0)
    		return null;
    	int rootVal = pre[0];
    	if (pre.length==1)
    		return new TreeNode (rootVal);
    	TreeNode root=new TreeNode (rootVal);
    	int index=0;
    	for (int  i= 0;  i< in.length; i++) {
			if(rootVal==in[i]){
				index=i;
				break;
			}	
    	}
    	root.left=reConstructBinaryTree(Arrays.copyOfRange(pre, 1, index+1),Arrays.copyOfRange(in, 0, index));
    	root.right=reConstructBinaryTree(Arrays.copyOfRange(pre, index+1, pre.length),Arrays.copyOfRange(in, index+1, in.length));
    	return root;
    }
}