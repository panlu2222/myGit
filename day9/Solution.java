package day9;
/*输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.*/
import java.util.ArrayList;
public class Solution {
	public static void main(String[] args) {
		int[][] b={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
		ArrayList<Integer> arr=printMatrix(b);
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i)+"   ");
		}
	}
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
       if(matrix.length==0)
    	   return null;
       ArrayList<Integer> arr=new ArrayList<Integer>();
       int up=0;
       int right=matrix[0].length-1;
       int low=matrix.length-1;
       int left=0;
       while(true){
    	   //向you寻找
    	   if(up>right)
    		   break;
    	   for(int i=up;i<=right;i++){
    		  // System.out.print(matrix[left][i]+"  ");
    		   arr.add(matrix[left][i]);
    	   }
    	   up++;
    	   //向下寻找
    	   if(left+1>low)
    		   break;
    	   for (int i = left+1; i <= low; i++) {
    		  // System.out.print(matrix[i][right]+"  ");
    		   arr.add(matrix[i][right]);
    	   }
    	   right--;
    	   //向左寻找
    	   if(up-1>right)
    		   break;
    	   for (int i = right; i >=up-1; i--) {
    		  // System.out.print(matrix[low][i]+"  ");
    		   arr.add(matrix[low][i]);
    	   }
    	   low--;
    	   //向上寻找
    	   if(left+1>low)
    		   break;
    	   for (int i = low; i > left; i--) {
    		  // System.out.print(matrix[i][up-1]+"  ");
    		   arr.add(matrix[i][up-1]);
    	   }
    	   left++;
       }
       return arr;
       
    }
}
