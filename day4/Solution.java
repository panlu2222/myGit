package day4;
//��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n��
//����0��ʼ����0��Ϊ0��n<=39 
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