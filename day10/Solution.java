package day10;
/*
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 * 
 * 
 */

/*
 * 思路：要判断是否为出栈顺序，要明确两点，
 *     一个就是两序列个数必须一致
 *     另外就是当前元素的下一元素必定是入栈中的相邻元素，否则不可能是对应出栈顺序
 *     方法1：借用两个栈
 *     方法2：借用一个栈
 */
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		int[] pushA={1,2,3,4,5};
		int[] pushB={5,4,3,2,1};
		System.out.println(IsPopOrder(pushA,pushB));
		
	}
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
    	//判断两序列长度是否一致
      if(pushA.length!=popA.length)
    	  return false;
      int k=pushA.length;
      int b=-1;
      //确定popA里面第一个数在pushA里面的位置
      for (int i = 0; i<k; i++) {
    	  if(pushA[i]==popA[0]){
    		  b=i;
    		  break;
    	  }
      }
      //如果pushA中没有元素等于popA第一个元素，则肯定不对应
      if(b==-1)
    	  return false;
      //定义两个栈，将入栈顺序分为两部分
      Stack<Integer> p1=new Stack<Integer>();//对应popA[0]前面的所有元素存入p1
      
      Stack<Integer> p3=new Stack<Integer>();//对应popA[0]后面的所有元素存入p3
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
      //判断popA中其他元素是否满足出栈顺序
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
//法2

/*
import java.util.ArrayList;
import java.util.Stack; 
public class Solution { 
	public boolean IsPopOrder(int [] pushA,int [] popA) { 
		//数组为空的情况       
		if(pushA.length == 0 || popA.length == 0)
			return false;                
		//弹出序列的下表索引      
		int popIndex = 0;         
		//辅助栈      
		Stack<Integer> stack = new Stack<Integer>(); 
		for(int i=0;i<pushA.length;i++){ 
			//不停地将pushA中的元素压入栈中，一旦栈顶元素与popA相等了，则开始出栈  
			//不相等则继续入栈            
			stack.push(pushA[i]); 
			while(!stack.isEmpty() && stack.peek()==popA[popIndex]){  
				stack.pop();   
				popIndex++;  
			}       
			
		}        
		//栈中没有元素了说明元素全部一致，并且符合弹出顺序，那么返回true
		return stack.isEmpty();  
	}
}

*/