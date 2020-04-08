package day3;
/*
        ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
	����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
	��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
	NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
*/
//��һ��������
public class Solution2 {
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0){
            return 0;
        }
        int min=52242;
        for(int i=0;i<array.length;i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        return min;
    }
}


//��2�����ַ�

public class Solution {
    public int minNumberInRotateArray(int [] array) {
         
         
        if(array.length==0){
            return 0;
        }
        int low=0;
        int high=array.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(array[mid] > array[high]){
                low = mid + 1;
            }else if(array[mid] == array[high]){
                high = high - 1;
            }else{
                high = mid;
            }    
        }
        return array[low];
         
         
    }
}