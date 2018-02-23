package Stacks;

public class DynamicArrayImplementation {

    int[] arr;
    int capacity;
    int top;

    public DynamicArrayImplementation(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }

    //O(1)
    //Insert at the beginning in a singly linked list
    public void push(int x){
        if(top == capacity-1) {
            expand();
            System.out.println("Stack capacity is doubled");
        }
        arr[++top] = x;
        System.out.println(x+" is pushed onto the stack");
    }

    //O(1)
    //Delete from beginning of a linked list
    public int pop(){
        if(top<capacity/2){
            shrink();
            System.out.println("Stack capacity is halved");
        }
        int ret = arr[top--];
        System.out.println(ret+" is popped from the stack");
        return ret;
    }

    public void expand(){
        int[] newarray = new int[capacity<<1];
        capacity<<=1;
        for(int i=0;i<arr.length;i++){
            newarray[i] = arr[i];
        }
        arr = newarray;
    }

    public void shrink(){
        int[] newarray = new int[capacity>>1];
        capacity>>=1;
        for(int i=0;i<newarray.length;i++){
            newarray[i] = arr[i];
        }
        arr = newarray;
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
        DynamicArrayImplementation l = new DynamicArrayImplementation(1);
        l.push(4);
        l.push(5);
        System.out.println(l.peek());
        System.out.println(l.pop());
        System.out.println(l.size());
        System.out.println(l.isEmpty());
    }
}
