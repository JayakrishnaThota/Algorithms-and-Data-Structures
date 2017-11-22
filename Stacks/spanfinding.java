package stacks;

import java.util.Scanner;
import java.util.Stack;

public class spanfinding {
	public static int[] spanfinding(int[] input){
		if(input==null || input.length == 0) return new int[0];
		int n = input.length;
		Stack<Integer> stack = new Stack();
		int[] spans = new int[n];
		spans[0] = 1;
		stack.push(0);
		for(int i=1;i<n;i++){
			while(!stack.isEmpty() && input[stack.peek()]<= input[i])
				stack.pop();
			spans[i] = stack.isEmpty()?i+1:i-stack.peek();
			stack.push(i);
		}
		return spans;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the length of the numbers");
		int n = in.nextInt();
		int[] input = new int[n];
		for(int i=0;i<n;i++)
			input[i] = in.nextInt();
		int[] spans = spanfinding(input);
		for(int i=0;i<n;i++)
			System.out.println(spans[i]);
	}
}
