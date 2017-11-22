package queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class reversefirstk {
	public static void reversefirstk(int[] input, int k){
		Queue<Integer> q = new LinkedList();
		for(int inp:input)
			q.add(inp);
		Stack<Integer> s = new Stack();
		for(int i=0;i<k;i++)
			s.push(q.poll());
		while(!s.isEmpty())
			q.offer(s.pop());
		for(int i=0;i<input.length-k;i++)
			q.offer(q.poll());
		for(int i=0;i<input.length;i++)
			input[i] = q.poll();
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your input numbers length");
		int n = in.nextInt();
		int k = in.nextInt();
		int[] input = new int[n];
		System.out.println("Please enter your inputs now");
		for(int i=0;i<n;i++)
			input[i] = in.nextInt();
		reversefirstk(input,k);
		for(int i=0;i<input.length;i++)
		System.out.println(input[i]);
	}
}
