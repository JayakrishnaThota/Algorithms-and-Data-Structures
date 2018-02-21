class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    /** Initialize your data structure here. */
    public MyQueue() {
        s1 = new Stack();
        s2 = new Stack();
    }
    //O(1)
    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);
    }
    //O(n)
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(!s1.isEmpty())
            s2.push(s1.pop());
        int ret = s2.pop();
        while(!s2.isEmpty())
            s1.push(s2.pop());
        return ret;
    }
    
    //O(n)
    /** Get the front element. */
    public int peek() {
        while(!s1.isEmpty())
            s2.push(s1.pop());
        int ret = s2.peek();
        while(!s2.isEmpty())
            s1.push(s2.pop());
        return ret;
    }
    
    //O(1)
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
