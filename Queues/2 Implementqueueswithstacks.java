package queues;
import java.util.*;
public class Implementqueueswithstacks {
	Stack<Integer> s1 = new Stack();
	Stack<Integer> s2 = new Stack();
	public void enqueue(int a){
		s1.push(a);
	}
	public int dequeue(){
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		int ret = s2.pop();
		while(!s2.isEmpty())
			s1.push(s2.pop());
		return ret;
	}
	public static void main(String[] args){
		Implementqueueswithstacks i = new Implementqueueswithstacks();
		i.enqueue(5);
		i.enqueue(6);
		System.out.println(i.dequeue());
		System.out.println(i.dequeue());
		i.enqueue(7);
		i.enqueue(8);
		System.out.println(i.dequeue());
		System.out.println(i.dequeue());

	}
}
