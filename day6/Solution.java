package day6;

import java.util.ArrayList;

/* ����һ���������飬ʵ��һ�����������������������ֵ�˳��
 * ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�
 * ����֤������������ż����ż��֮������λ�ò��䡣
*/
public class Solution {
    public static void reOrderArray(int [] array) {
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        ArrayList<Integer> arr2=new ArrayList<Integer>();
        //int[] b=new int[array.length];
        for (int i = 0; i < array.length; i++) {
			if(array[i]%2==0){
				arr1.add(array[i]);
			}else{
				arr2.add(array[i]);
			}
		}
        for (int i = 0; i < arr2.size(); i++) {
        	array[i]=arr2.get(i);
		}
        for (int i = 0; i < arr1.size(); i++) {
        	array[i+arr2.size()]=arr1.get(i);
		}
        
    }
}