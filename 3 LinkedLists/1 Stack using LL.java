package Stacks;
import java.util.*;

public class LinkedListImplementation {
    ListNode head;
    int size;
    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(){
            this.next = null;
        }
        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public LinkedListImplementation(){
        head = new ListNode();
        size = 0;
    }

    //O(1)
    //Insert at the beginning in a singly linked list
    public void push(int x){
        size++;
        ListNode newnode = new ListNode(x);
        newnode.next = head;
        head = newnode;
        System.out.println(x+" is pushed onto the stack");
    }

    //O(1)
    //Delete from beginning of a linked list
    public int pop(){
        int ret = head.val;
        //Delete head
        head = head.next;
        size--;
        System.out.println(ret+"is popped from the stack");
        return ret;
    }

    public int peek(){
        return head.val;
    }

    public boolean isEmpty(){
        return (size==0);
    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
        LinkedListImplementation l = new LinkedListImplementation();
        l.push(4);
        l.push(5);
        System.out.println(l.peek());
        System.out.println(l.pop());
        System.out.println(l.size());
        System.out.println(l.isEmpty());
    }
}
