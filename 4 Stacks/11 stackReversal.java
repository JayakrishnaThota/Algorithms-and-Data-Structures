package stacks;

import java.util.Scanner;
import java.util.Stack;

public class stackReversal {
	public static void reverseStack(Stack<Integer> stack){
		if(stack.isEmpty()) return;
		int temp = stack.pop();
		reverseStack(stack);
		insertAtBottom(stack, temp);
	}
	public static void insertAtBottom(Stack<Integer> stack, int temp){
		if(stack.isEmpty())
		{
			stack.push(temp);
			return;
		}
		int temp2 = stack.pop();
		insertAtBottom(stack, temp2);
		stack.push(temp);
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Stack<Integer> stack = new Stack();
		System.out.println("Please enter the length of the numbers");
		int n = in.nextInt();
		for(int i=0;i<n;i++)
			stack.push(in.nextInt());
		reverseStack(stack);
		for(int i=0;i<n;i++)
			System.out.println(stack.pop());
	}
}
