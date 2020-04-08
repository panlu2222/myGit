package day4;
//大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项
//（从0开始，第0项为0）n<=39 
public class Solution {
	public static void main(String[] args) {
		int n=100;
		System.out.println(Fibonacci(n));
	}
    public static int Fibonacci(int n) {
    	if(n<=0)
    		return 0;
    	int f1=1;
    	int f2=1;
    	if(n==1)
    		return f1;
    	if(n==2)
    		return f2;
    	int f3;
    	for (int i = 3; i <= n; i++) {
			f3=f1+f2;
			f1=f2;
			f2=f3;
		}
    	return f2;
    	
    	
    }
}