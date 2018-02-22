package Queues;

public class DynamicCircularArray {

    int[] array;
    int front,rear,capacity,size;
    public DynamicCircularArray(int capacity){
        this.capacity = capacity;
        this.array = new int[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }
    //O(1) average
    private void enqueue(int val){
        if(size==capacity) expand();
        array[rear] = val;
        rear = (rear+1)%capacity;
        size++;
    }

    //O(n)
    private void expand(){
        int[] newarray = new int[size<<1];
        for(int i=front;i<=rear;i++)
            newarray[i-front] = array[i%capacity];
        array = newarray;
        front = 0;
        rear = size-1;
        capacity<<=1;
        System.out.println("Queue capacity is doubled and the new queue size is "+capacity);
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
        if(size<capacity/2) shrink();
        size--;
        int ret = array[front];
        front = (front+1)%capacity;
        return ret;
    }

    //O(n)
    private void shrink(){
        int[] newarray = new int[size>>1];
        for(int i=front;i<=rear;i++)
            newarray[i-front] = array[i%capacity];
        array = newarray;
        front = 0;
        rear = size-1;
        capacity>>=1;
        System.out.println("Queue capacity is halved and the new queue size is "+capacity);
    }

    //O(1)
    private int size(){
        return size;
    }

    private int peek(){
        return array[front];
    }

    public static void main(String[] args) {
        DynamicCircularArray d = new DynamicCircularArray(2);
        System.out.println(d.isEmpty());
        d.enqueue(4);
        d.enqueue(15);
        System.out.println(d.peek());
        System.out.println(d.dequeue());
        d.enqueue(7);
        d.enqueue(40);
        System.out.println(d.dequeue());
        System.out.println(d.size());
    }
}
