package Queues;
import java.util.*;
//Operations of a queue
//offer
//poll
//size
//isEmpty
//peek

public class LinkedListImplementation {
    ListNode front,rear;
    int size;
    //Template of listnode
    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(){

        }
        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public LinkedListImplementation(){
        front = null;
        rear = null;
        size = 0;
    }

    //O(1) average
    private void enqueue(int val){
        ListNode node = new ListNode(val);
        if(isEmpty()) front = node;
        else{
            rear.next = node;
        }
        rear = node;
        size++;
    }

    //O(1)
    private boolean isEmpty(){
        return (size==0);
    }

    //Remove an item from the front of the queue
    //O(1) average
    private int dequeue(){
        int result = front.val;
        front = front.next;
        size--;
        if(isEmpty()) rear = null;
        return result;
    }

    //O(1)
    private int size(){
        return size;
    }

    private int peek(){
        return front.val;
    }
    public static void main(String[] args) {
        LinkedListImplementation l = new LinkedListImplementation();
        System.out.println(l.isEmpty());
        l.enqueue(4);
        l.enqueue(15);
        System.out.println(l.peek());
        System.out.println(l.dequeue());
        l.enqueue(7);
        l.enqueue(40);
        System.out.println(l.dequeue());
        System.out.println(l.size());
    }
}
