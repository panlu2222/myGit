package day4;
/*һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
�����������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ������
*/
public class Solution2 {
	public static void main(String[] args) {
		int target=5;
		System.out.println(JumpFloor(target));
	}
    public static int JumpFloor(int target) {
    	if(target==1)
    		return 1;
    	if(target==2)
    		return 2;
    	return JumpFloor(target-1)+JumpFloor(target-2);
    }
}