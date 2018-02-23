package Stacks;

public class ArrayImplementation {
    int[] arr;
    int capacity;
    int top;

    public ArrayImplementation(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }

    //O(1)
    //Insert at the beginning in a singly linked list
    public void push(int x){
        if(top == capacity-1) {
            System.out.println("Stack capacity reached and this element cannot be pushed ");
            return;
        }
        arr[++top] = x;
        System.out.println(x+" is pushed onto the stack");
    }

    //O(1)
    //Delete from beginning of a linked list
    public int pop(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return -1;
        }
        int ret = arr[top--];
        System.out.println(ret+" is popped from the stack");
        return ret;
    }

    public int peek(){
        return arr[top];
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public int size(){
        return top+1;
    }

    public static void main(String[] args) {
        ArrayImplementation l = new ArrayImplementation(10);
        l.push(4);
        l.push(5);
        System.out.println(l.peek());
        System.out.println(l.pop());
        System.out.println(l.size());
        System.out.println(l.isEmpty());
    }
}
