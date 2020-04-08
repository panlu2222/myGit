package day3;

import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	while(!stack1.isEmpty()){
    		int a=stack1.pop();
    		stack2.push(a);
    	}
    	int b=stack2.pop();
    	while(!stack2.isEmpty()){
    		int c=stack2.pop();
    		stack1.push(c);
    	}
    	return b;
        
    }
}