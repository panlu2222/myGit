package day9;

/*
 * ����ջ�����ݽṹ��
 * ���ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min������ʱ�临�Ӷ�ӦΪO��1������ 
 * ע�⣺��֤�����в��ᵱջΪ�յ�ʱ�򣬶�ջ����pop()����min()����top()������
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
