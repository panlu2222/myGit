package day5;

public class Solution2 {
	public static void main(String[] args) {
		int n = 1;
		System.out.println(NumberOf1(n));
		
	}
		

  public static int NumberOf1(int n) { 
	  
	  int m=Integer.toBinaryString(n).replaceAll("0", "").length();
	  return m;
  
  }
 
/*
 * public static int NumberOf1(int n) {
 * 		 if(n==0){ 
 * 			return 0; 
 * 		}else if(n>0){
 * 		 	int count_1=0; 
 * 			while(n>0){
 * 				if((n%2)!=0) 
 * 				count_1++; 
 * 				n=n/2; 
 * 			} 
 * 			return count_1; 
 * 		} 
 *      int n_b=Math.abs(n+1)
 		int count_0=0;
 *      while(n_b>0){
 *          if((n_b%2)!=0)
 *              count_0++; 
 *          n_b=n_b/2;
 *      }
 *      return 8-count_0;
 * 
 * }
 */
}