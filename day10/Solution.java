package day10;
/*
 * ���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ����Ϊ��ջ�ĵ���˳��
 * ����ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳��
 * ����4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У���4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С�
 * ��ע�⣺���������еĳ�������ȵģ�
 * 
 * 
 */

/*
 * ˼·��Ҫ�ж��Ƿ�Ϊ��ջ˳��Ҫ��ȷ���㣬
 *     һ�����������и�������һ��
 *     ������ǵ�ǰԪ�ص���һԪ�رض�����ջ�е�����Ԫ�أ����򲻿����Ƕ�Ӧ��ջ˳��
 *     ����1����������ջ
 *     ����2������һ��ջ
 */
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		int[] pushA={1,2,3,4,5};
		int[] pushB={5,4,3,2,1};
		System.out.println(IsPopOrder(pushA,pushB));
		
	}
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
    	//�ж������г����Ƿ�һ��
      if(pushA.length!=popA.length)
    	  return false;
      int k=pushA.length;
      int b=-1;
      //ȷ��popA�����һ������pushA�����λ��
      for (int i = 0; i<k; i++) {
    	  if(pushA[i]==popA[0]){
    		  b=i;
    		  break;
    	  }
      }
      //���pushA��û��Ԫ�ص���popA��һ��Ԫ�أ���϶�����Ӧ
      if(b==-1)
    	  return false;
      //��������ջ������ջ˳���Ϊ������
      Stack<Integer> p1=new Stack<Integer>();//��ӦpopA[0]ǰ�������Ԫ�ش���p1
      
      Stack<Integer> p3=new Stack<Integer>();//��ӦpopA[0]���������Ԫ�ش���p3
      int l=0;
      while(l<b){
    	  p1.push(pushA[l]);
    	  l++;
      }
      l=l+1;
      while(l<k){
    	  p3.push(pushA[l]);
    	  l++;
      }
      //�ж�popA������Ԫ���Ƿ������ջ˳��
      int a=1;
      while(a<k){
    	  if(p1.peek()==popA[a]){
    		  p1.pop();
    		  a++;
    	  }else if(!(p3.isEmpty())&&p3.peek()==popA[a]){
    		  p3.pop();
    		  a++;
    	  }else{
    		  return false;
    	  }
      }
    	
      return true;
      
    }
}
//��2

/*
import java.util.ArrayList;
import java.util.Stack; 
public class Solution { 
	public boolean IsPopOrder(int [] pushA,int [] popA) { 
		//����Ϊ�յ����       
		if(pushA.length == 0 || popA.length == 0)
			return false;                
		//�������е��±�����      
		int popIndex = 0;         
		//����ջ      
		Stack<Integer> stack = new Stack<Integer>(); 
		for(int i=0;i<pushA.length;i++){ 
			//��ͣ�ؽ�pushA�е�Ԫ��ѹ��ջ�У�һ��ջ��Ԫ����popA����ˣ���ʼ��ջ  
			//������������ջ            
			stack.push(pushA[i]); 
			while(!stack.isEmpty() && stack.peek()==popA[popIndex]){  
				stack.pop();   
				popIndex++;  
			}       
			
		}        
		//ջ��û��Ԫ����˵��Ԫ��ȫ��һ�£����ҷ��ϵ���˳����ô����true
		return stack.isEmpty();  
	}
}

*/