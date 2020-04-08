package day6;

import java.util.ArrayList;

/* 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
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