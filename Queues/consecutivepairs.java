package queues;
import java.util.*;

public class consecutivepairs {

	public static boolean consecutivepairs(Stack<Integer> stack){
		if(stack.isEmpty()) return true;
		Queue<Integer> queue = new LinkedList();
		//Reversing stack contents to satisfy the single number at the top requirement
		while(!stack.isEmpty())
			queue.add(stack.pop());
		while(!queue.isEmpty())
			stack.push(queue.poll());
		while(!stack.isEmpty()){
			int m = stack.pop();
			if(!stack.isEmpty()){
				int n = stack.pop();
				if(Math.abs(m-n)!=1) return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Stack<Integer> stack = new Stack();
		System.out.println("Please enter your input numbers length");
		int n = in.nextInt();
		System.out.println("Please enter your inputs now");
		for(int i=0;i<n;i++)
			stack.push(in.nextInt());
		System.out.println(consecutivepairs(stack));
	}
}
