package com.mianshi.suanfa;

import java.util.Stack;

/**
 * ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint����
 * 
 * ��һ��ջ ��ʵ������У�������������һ��ջ������е�ջ�����ݣ������������ǣ������������ջ��
 * ʱ��:2019��2��18��
 * @author pefuxc
 *
 */
public class Test4 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public static void main(String[] args) {

    	Test4 a=new Test4();
    	a.push(1);
    	a.push(2);
    	a.push(3);
    	a.push(4);
    	System.out.println(a.pop());
    	System.out.println(a.pop());
    	System.out.println(a.pop());
    	System.out.println(a.pop());
	}
    public void push(int node) {
    	stack1.push(node);
    }
    
    public int pop() {
    	if(!stack1.isEmpty()){
    		while(!stack1.isEmpty()){
    			stack2.push(stack1.pop());
    		}
    	}
		return stack2.pop();
    }
}
