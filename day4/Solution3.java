package day4;
//һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
//�����������һ��n����̨���ܹ��ж�����������
public class Solution3 {
	public static void main(String[] args) {
		int target =4;
		System.out.println(JumpFloorII(target));
	}
    public static int JumpFloorII(int target) {
        if(target==1)
        	return 1;
        if(target==2)
        	return 2;
        int sum=0;
        for (int i = target-1; i >0; i--) {
			sum+=JumpFloorII(i);
		}
        return sum+1;
    }
}