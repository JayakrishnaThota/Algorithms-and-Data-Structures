package Queues;
import java.util.*;
import java.util.Scanner;

public class QueueRevrsal {

    //O(n) time and space
    public void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty())
            stack.push(queue.poll());
        while(!stack.isEmpty())
            queue.offer(stack.pop());
    }

    public void display(Queue<Integer> queue){
        Queue<Integer> temp = new LinkedList<>(queue);
        for(int i=queue.size()-1;i>=0;i--)
            System.out.print(temp.poll()+" ");
        System.out.println(" ");
    }

    public static void main(String[] args) {
        QueueRevrsal q = new QueueRevrsal();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the queue and the elements into the queue");
        Queue<Integer> queue = new LinkedList<>();
        int n = in.nextInt();
        for(int i=0;i<n;i++)
            queue.offer(in.nextInt());
        q.display(queue);
        q.reverse(queue);
        q.display(queue);
    }
}

