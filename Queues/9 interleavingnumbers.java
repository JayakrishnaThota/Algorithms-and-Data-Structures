//If 11,12,13,14, then output 11,13,12,14
package queues;
import java.util.*;
public class interleavingnumbers {


	public static void interleavingnumbers(int[] input){
		Queue<Integer> q = new LinkedList();
		for(int inp:input)
			q.add(inp);
		Stack<Integer> s = new Stack();
		int half = input.length/2;
	    //Step 1
		//11 12 13 14 -> 13 14 12 11
		for(int i=0;i<half;i++)
			s.push(q.poll());
		while(!s.isEmpty()){
			q.add(s.pop());
		}
		//Step 2
		//13 14 12 11 -> 12 11 13 14
		for(int i=0;i<half;i++)
			q.add(q.poll());
		//Step 3
		for(int i=0;i<half;i++)
			s.push(q.poll());
		while(!s.isEmpty()){
			q.add(s.pop());
			q.add(q.poll());
		}
		int i =0;
		while(!q.isEmpty()){
			input[i++] = q.poll();
		}
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your input numbers length");
		int n = in.nextInt();
		int[] input = new int[n];
		System.out.println("Please enter your inputs now");
		for(int i=0;i<n;i++)
			input[i] = in.nextInt();
		interleavingnumbers(input);
		for(int i=0;i<input.length;i++)
		System.out.println(input[i]);
	}
}
