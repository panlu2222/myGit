package day9;

/*
 * 定义栈的数据结构，
 * 请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。 
 * 注意：保证测试中不会当栈为空的时候，对栈调用pop()或者min()或者top()方法。
 */
import java.util.Stack;

public class Solution3 {
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		//stack.add(0);
		//stack.push(0);
		System.out.println(stack);
	}

	public static void push (int node) {
	
	}

	public void pop() {

	}

	public int top() {
		int a=this.pop();
		this.push(a);
		return a;
	}

	public int min() {

	}
}
