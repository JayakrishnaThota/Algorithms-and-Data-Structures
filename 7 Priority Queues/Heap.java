package Heaps;
//Implementation of max heap with a dynamically expanding array
public class Heap {
    private int[] arr;
    private int capacity;
    private int count;
    public Heap(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        this.count = 0;
    }

    //Given a node's index we need to return the parent's index
    //O(1)
    public int parent(int i){
        if(i==0){
            return -1;
        }
        else
            return (i-1)/2;
    }

    //Given a node's index we need to return the index of the left child
    //O(1)
    public int leftChild(int i){
        if(2*i+1>=count) return -1;
        return 2*i+1;
    }

    //Given a node's index we need to return the index of the right child
    //O(1)
    public int rightChild(int i){
        if(2*i+2>=count) return -1;
        return 2*i+2;
    }

    //Get the max element in the heap
    //O(1)
    public int getMax(){
        return arr[0];
    }

    //Heapifying an element
    //O(logn)
    public void perlocateDown(int i){
        int l = leftChild(i);
        int r = rightChild(i);
        int max = i;
        if(l!=-1 && arr[l]>arr[i]) max = l;
        if(r!=-1 && arr[r]>arr[max]) max = r;
        if(max!=i){
            swap(arr,i,max);
            perlocateDown(max);
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //O(logn)
    public void Insert(int val){
        if(this.count==this.capacity) expand();
        this.count++;
        int i = this.count-1;
        while(i>=0 && val>arr[(i-1)/2]){
            arr[i] = arr[(i-1)/2];
            i = (i-1)/2;
        }
        arr[i] = val;
    }

    public void expand(){
        int[] newarr = new int[capacity<<1];
        for(int i=0;i<arr.length;i++){
            newarr[i] = arr[i];
        }
        arr = newarr;
    }

    //O(logn)
    public int deleteMax(){
        if(this.count==0) return -1;
        int ret = arr[0];
        int last = arr[arr.length-1];
        this.arr[0] = last;
        this.count--;
        perlocateDown(0);
        return ret;
    }
}
