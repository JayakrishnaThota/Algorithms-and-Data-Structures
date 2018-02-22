package Queues;

public class CircularArrayImplementation {
    int[] array;
    int front,rear,capacity,size;
    public CircularArrayImplementation(int capacity){
        this.capacity = capacity;
        this.array = new int[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }
    //O(1) average
    private void enqueue(int val){
        array[rear] = val;
        rear = (rear+1)%capacity;
        size++;
    }

    //O(1)
    private boolean isEmpty(){
        return (size==0);
    }
    //O(1)
    private boolean isFull(){
        return (size==capacity);
    }
    //Remove an item from the front of the queue
    //O(1) average
    private int dequeue(){
        size--;
        int ret = array[front];
        front = (front+1)%capacity;
        return ret;
    }

    //O(1)
    private int size(){
        return size;
    }

    private int peek(){
        return array[front];
    }

    public static void main(String[] args) {
        CircularArrayImplementation c = new CircularArrayImplementation(20);
        System.out.println(c.isEmpty());
        c.enqueue(4);
        c.enqueue(15);
        System.out.println(c.peek());
        System.out.println(c.dequeue());
        c.enqueue(7);
        c.enqueue(40);
        System.out.println(c.dequeue());
        System.out.println(c.size());
    }
}
